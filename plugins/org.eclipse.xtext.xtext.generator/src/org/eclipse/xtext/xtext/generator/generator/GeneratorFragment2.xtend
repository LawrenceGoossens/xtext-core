/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.generator.generator

import com.google.inject.Inject
import com.google.inject.name.Names
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.mwe.core.issues.Issues
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend2.lib.StringConcatenationClient
import org.eclipse.xtext.Grammar
import org.eclipse.xtext.GrammarUtil
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xtext.generator.AbstractGeneratorFragment2
import org.eclipse.xtext.xtext.generator.CodeConfig
import org.eclipse.xtext.xtext.generator.IXtextProjectConfig
import org.eclipse.xtext.xtext.generator.LanguageConfig2
import org.eclipse.xtext.xtext.generator.XtextGenerator
import org.eclipse.xtext.xtext.generator.model.FileAccessFactory
import org.eclipse.xtext.xtext.generator.model.FileSystemAccess
import org.eclipse.xtext.xtext.generator.model.GuiceModuleAccess
import org.eclipse.xtext.xtext.generator.model.TypeReference
import org.eclipse.xtext.xtext.generator.xbase.XbaseGeneratorFragment2

import static extension org.eclipse.xtext.xtext.generator.XtextGeneratorNaming.*
import static extension org.eclipse.xtext.xtext.generator.model.TypeReference.*
import com.google.inject.Injector
import com.google.inject.Provider
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.validation.IResourceValidator
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.emf.common.util.URI
import java.util.List
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.util.CancelIndicator

class GeneratorFragment2 extends AbstractGeneratorFragment2 {
	
	@Inject IXtextProjectConfig projectConfig
	
	@Inject CodeConfig codeConfig
	
	@Inject FileAccessFactory fileAccessFactory
	
	@Inject extension FileSystemAccess.Extensions
	
	@Accessors(PUBLIC_SETTER)
	boolean generateStub = true
	
	@Accessors(PUBLIC_SETTER)
	boolean generateMwe = false
	
	@Accessors(PUBLIC_SETTER)
	boolean generateJavaMain = false
	
	@Accessors(PUBLIC_SETTER)
	boolean generateXtendMain = false
	
	def boolean isGenerateStub(Grammar grammar) {
		!XbaseGeneratorFragment2.inheritsXbase(grammar) && generateStub
	}
	
	def boolean isGenerateJavaMain(Grammar grammar) {
		!XbaseGeneratorFragment2.inheritsXbase(grammar) && generateJavaMain
	}
	
	def boolean isGenerateXtendMain(Grammar grammar) {
		!XbaseGeneratorFragment2.inheritsXbase(grammar) && generateXtendMain
	}
	
	def boolean isGenerateMwe(Grammar grammar) {
		!XbaseGeneratorFragment2.inheritsXbase(grammar) && generateMwe
	}
	
	protected def TypeReference getGeneratorStub(Grammar grammar) {
		new TypeReference(grammar.naming.runtimeBasePackage + '.generator.' + GrammarUtil.getName(grammar) + 'Generator')
	}
	
	protected def TypeReference getJavaMain(Grammar grammar) {
		new TypeReference(grammar.generatorStub.packageName + '.Main')
	}
	
	override checkConfiguration(XtextGenerator generator, Issues issues) {
		if (generateJavaMain && generateXtendMain) {
			issues.addWarning(generator,
				"Options 'generateJavaMain' and 'generateXtendMain' are mutually exclusive. Generating Xtend only.", this)
			generateJavaMain = false
		}
	}
	
	override generate(LanguageConfig2 language) {
		if (language.grammar.isGenerateStub) {
			projectConfig.runtimeManifest.requiredBundles += 'org.eclipse.xtext.xbase.lib'
			new GuiceModuleAccess.BindingFactory()
				.addTypeToType(IGenerator.typeRef, language.grammar.generatorStub)
				.contributeTo(language.runtimeGenModule)
			if (!projectConfig.runtimeSrc.containsXtendFile(language.grammar.generatorStub))
				doGenerateStubFile(language)
		}
		if (language.grammar.isGenerateStub || language.grammar.isGenerateJavaMain) {
			projectConfig.runtimeManifest.exportedPackages += language.grammar.generatorStub.packageName
		}
		
		if (language.grammar.isGenerateJavaMain && !projectConfig.runtimeSrc.containsJavaFile(language.grammar.javaMain))
			doGenerateJavaMain(language)
		if (language.grammar.isGenerateXtendMain && !projectConfig.runtimeSrc.containsXtendFile(language.grammar.javaMain))
			doGenerateXtendMain(language)
		if (language.grammar.isGenerateMwe && !projectConfig.runtimeSrc.isFile(language.grammar.generatorStub.path + 'MWE.mwe2'))
			doGenerateMweFile(language)
		
		if (projectConfig.eclipsePluginManifest !== null) {
			projectConfig.eclipsePluginManifest.requiredBundles += 'org.eclipse.xtext.builder'
		}
		contributeEclipsePluginGuiceBindings(language)
		if (projectConfig.eclipsePluginPluginXml !== null)
			contributeEclipsePluginExtensions(language)
	}
	
	protected def contributeEclipsePluginGuiceBindings(LanguageConfig2 language) {
		val StringConcatenationClient expression = '''«'org.eclipse.core.resources.ResourcesPlugin'.typeRef».getWorkspace().getRoot()'''
		val StringConcatenationClient statement =
			'''binder.bind(«'org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer'.typeRef».class).annotatedWith(«Names».named("builderPreferenceInitializer")).to(«'org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess.Initializer'.typeRef».class);'''
		new GuiceModuleAccess.BindingFactory()
			.addTypeToType('org.eclipse.xtext.builder.IXtextBuilderParticipant'.typeRef,
					'org.eclipse.xtext.builder.BuilderParticipant'.typeRef)
			.addTypeToInstance('org.eclipse.core.resources.IWorkspaceRoot'.typeRef, expression)
			.addConfiguredBinding('BuilderPreferenceStoreInitializer', statement)
			.contributeTo(language.eclipsePluginGenModule)
	}

	protected def doGenerateStubFile(LanguageConfig2 language) {
		val xtendFile = fileAccessFactory.with(language).createXtendFile(language.grammar.generatorStub)
		xtendFile.typeComment = '''
			/**
			 * Generates code from your model files on save.
			 * 
			 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
			 */
		'''
		xtendFile.javaContent = '''
			class «language.grammar.generatorStub.simpleName» implements «IGenerator» {
			
				override void doGenerate(«Resource» resource, «IFileSystemAccess» fsa) {
			//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
			//			resource.allContents
			//				.filter(typeof(Greeting))
			//				.map[name]
			//				.join(', '))
				}
			
			}
		'''
		xtendFile.writeTo(projectConfig.runtimeSrc)
	}

	protected def doGenerateJavaMain(LanguageConfig2 language) {
		val javaFile = fileAccessFactory.with(language).createJavaFile(language.grammar.javaMain)
		javaFile.javaContent = '''
			public class Main {
			
				public static void main(String[] args) {
					if (args.length == 0) {
						System.err.println("Aborting: no path to EMF resource provided!");
						return;
					}
					«Injector» injector = new «language.naming.runtimeSetup»().createInjectorAndDoEMFRegistration();
					Main main = injector.getInstance(Main.class);
					main.runGenerator(args[0]);
				}
			
				@«Inject»
				private «Provider»<«ResourceSet»> resourceSetProvider;
			
				@«Inject»
				private «IResourceValidator» validator;
			
				@«Inject»
				private «IGenerator» generator;
			
				@«Inject» 
				private «JavaIoFileSystemAccess» fileAccess;
			
				protected void runGenerator(String string) {
					// Load the resource
					«ResourceSet» set = resourceSetProvider.get();
					«Resource» resource = set.getResource(«URI».createURI(string), true);
			
					// Validate the resource
					«List»<«Issue»> list = validator.validate(resource, «CheckMode».ALL, «CancelIndicator».NullImpl);
					if (!list.isEmpty()) {
						for («Issue» issue : list) {
							System.err.println(issue);
						}
						return;
					}
			
					// Configure and start the generator
					fileAccess.setOutputPath("src-gen/");
					generator.doGenerate(resource, fileAccess);
			
					System.out.println("Code generation finished.");
				}
			}
		'''
		javaFile.writeTo(projectConfig.runtimeSrc)
	}

	protected def doGenerateXtendMain(LanguageConfig2 language) {
		val xtendFile = fileAccessFactory.with(language).createXtendFile(language.grammar.javaMain)
		xtendFile.javaContent = '''
			class Main {
			
				def static main(String[] args) {
					if (args.empty) {
						System::err.println('Aborting: no path to EMF resource provided!')
						return
					}
					val injector = new «language.naming.runtimeSetup»().createInjectorAndDoEMFRegistration
					val main = injector.getInstance(Main)
					main.runGenerator(args.get(0))
				}
			
				@«Inject» «Provider»<«ResourceSet»> resourceSetProvider
			
				@«Inject» «IResourceValidator» validator
			
				@«Inject» «IGenerator» generator
			
				@«Inject» «JavaIoFileSystemAccess» fileAccess
			
				def protected runGenerator(String string) {
					// Load the resource
					val set = resourceSetProvider.get
					val resource = set.getResource(«URI».createURI(string), true)
			
					// Validate the resource
					val issues = validator.validate(resource, «CheckMode».ALL, «CancelIndicator».NullImpl)
					if (!issues.empty) {
						issues.forEach[System.err.println(it)]
						return
					}
			
					// Configure and start the generator
					fileAccess.outputPath = 'src-gen/'
					generator.doGenerate(resource, fileAccess)
					System.out.println('Code generation finished.')
				}
			}
		'''
		xtendFile.writeTo(projectConfig.runtimeSrc)
	}
	
	protected def doGenerateMweFile(LanguageConfig2 language) {
		val mweFile = fileAccessFactory.with(language).createTextFile()
		mweFile.path = language.grammar.generatorStub.path + 'MWE.mwe2'
		mweFile.content = '''
			«codeConfig.fileHeader»
			module «language.grammar.generatorStub.name»MWE
			
			import org.eclipse.emf.mwe.utils.*
			import «language.naming.runtimeSetup.packageName».*
			
			var targetDir
			var modelPath
			
			Workflow {
			
				component = org.eclipse.xtext.mwe.Reader {
					// lookup all resources on the classpath
					// useJavaClassPath = true
			
					// or define search scope explicitly
					path = modelPath
			
					// this class will be generated by the xtext generator 
					register = «language.naming.runtimeSetup.simpleName» {}
					loadResource = {
						slot = "model"
					}
				}
			
				component = org.eclipse.xtext.generator.GeneratorComponent {
					register = «language.naming.runtimeSetup.simpleName» {}
					slot = 'model'
					outlet = {
						path = targetDir
					}
				}
			}
		'''
		mweFile.writeTo(projectConfig.runtimeSrc)
	}
	
	protected def contributeEclipsePluginExtensions(LanguageConfig2 language) {
		val name = language.grammar.name
		projectConfig.eclipsePluginPluginXml.entries += '''
			<extension point="org.eclipse.xtext.builder.participant">
				<participant
					class="«language.naming.eclipsePluginExecutableExtensionFactory»:org.eclipse.xtext.builder.IXtextBuilderParticipant"
					fileExtensions="«language.fileExtensions.join(',')»">
				</participant>
			</extension>
			<extension point="org.eclipse.ui.preferencePages">
				<page
					category="«name»"
					class="«language.naming.eclipsePluginExecutableExtensionFactory»:org.eclipse.xtext.builder.preferences.BuilderPreferencePage"
					id="«name».compiler.preferencePage"
					name="Compiler">
					<keywordReference id="«GrammarUtil.getNamespace(language.grammar) + ".ui.keyword_" + GrammarUtil.getName(language.grammar)»"/>
				</page>
			</extension>
			<extension point="org.eclipse.ui.propertyPages">
				<page
					category="«name»"
					class="«language.naming.eclipsePluginExecutableExtensionFactory»:org.eclipse.xtext.builder.preferences.BuilderPreferencePage"
					id="«name».compiler.propertyPage"
					name="Compiler">
					<keywordReference id="«GrammarUtil.getNamespace(language.grammar) + ".ui.keyword_" + GrammarUtil.getName(language.grammar)»"/>
					<enabledWhen>
						<adapt type="org.eclipse.core.resources.IProject"/>
					</enabledWhen>
					<filter name="projectNature" value="org.eclipse.xtext.ui.shared.xtextNature"/>
				</page>
			</extension>
			<extension point="org.eclipse.ui.menus">
				<menuContribution locationURI="popup:#TextEditorContext?after=xtext.ui.openDeclaration">
					<command
						commandId="org.eclipse.xtext.ui.OpenGeneratedFileCommand"
						id="«name».OpenGeneratedCode"
						style="push">
						<visibleWhen checkEnabled="false">
							<reference definitionId="«name».Editor.opened" />
						</visibleWhen>
					</command>
				</menuContribution>
			</extension>
			<extension point="org.eclipse.ui.handlers">
				<handler
					class="«language.naming.eclipsePluginExecutableExtensionFactory»:org.eclipse.xtext.ui.generator.trace.OpenGeneratedFileHandler"
					commandId="org.eclipse.xtext.ui.OpenGeneratedFileCommand">
					<activeWhen>
						<reference definitionId="«name».Editor.opened" />
					</activeWhen>
				</handler>
			</extension>
		'''
	}
	
}