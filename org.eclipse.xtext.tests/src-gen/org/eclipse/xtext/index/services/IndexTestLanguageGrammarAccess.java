/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.index.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class IndexTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.File");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//File :
		//    (elements+=Element)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(elements+=Element)*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_0() { return cElementsElementParserRuleCall_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import :
		//    'import' importedNamespace=QualifiedNameWithWildCard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildCard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildCard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildCard
		public RuleCall getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildCardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.QualifiedNameWithWildCard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildCard :
		//    QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName :
		//    ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class NamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.Namespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsElementParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Namespace :
		//    name=QualifiedName '{'
		//        (elements+=Element)*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//name=QualifiedName '{'
		//    (elements+=Element)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0() { return cNameQualifiedNameParserRuleCall_0_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//(elements+=Element)*
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_2_0() { return cElementsElementParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNamespaceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cImportParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Element :
		//    Namespace | Type | Import;
		@Override public ParserRule getRule() { return rule; }
		
		//Namespace | Type | Import
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Namespace
		public RuleCall getNamespaceParserRuleCall_0() { return cNamespaceParserRuleCall_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1() { return cTypeParserRuleCall_1; }
		
		//Import
		public RuleCall getImportParserRuleCall_2() { return cImportParserRuleCall_2; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDatatypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type :
		//    Entity | Datatype;
		@Override public ParserRule getRule() { return rule; }
		
		//Entity | Datatype
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_0() { return cEntityParserRuleCall_0; }
		
		//Datatype
		public RuleCall getDatatypeParserRuleCall_1() { return cDatatypeParserRuleCall_1; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPropertiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPropertiesPropertyParserRuleCall_3_0 = (RuleCall)cPropertiesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity :
		//    'entity' name=ID '{'
		//        (properties+=Property)*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID '{'
		//    (properties+=Property)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(properties+=Property)*
		public Assignment getPropertiesAssignment_3() { return cPropertiesAssignment_3; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_3_0() { return cPropertiesPropertyParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class DatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.Datatype");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Datatype :
		//    'datatype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' name=ID
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.index.IndexTestLanguage.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeTypeCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cTypeTypeCrossReference_0_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Property :
		//    type=[Type|QualifiedName] name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[Type|QualifiedName] name=ID
		public Group getGroup() { return cGroup; }
		
		//type=[Type|QualifiedName]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_0_0() { return cTypeTypeCrossReference_0_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_0_0_1() { return cTypeTypeQualifiedNameParserRuleCall_0_0_1; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	
	
	private final FileElements pFile;
	private final ImportElements pImport;
	private final QualifiedNameWithWildCardElements pQualifiedNameWithWildCard;
	private final QualifiedNameElements pQualifiedName;
	private final NamespaceElements pNamespace;
	private final ElementElements pElement;
	private final TypeElements pType;
	private final EntityElements pEntity;
	private final DatatypeElements pDatatype;
	private final PropertyElements pProperty;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public IndexTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFile = new FileElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildCard = new QualifiedNameWithWildCardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pNamespace = new NamespaceElements();
		this.pElement = new ElementElements();
		this.pType = new TypeElements();
		this.pEntity = new EntityElements();
		this.pDatatype = new DatatypeElements();
		this.pProperty = new PropertyElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.index.IndexTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//File :
	//    (elements+=Element)*;
	public FileElements getFileAccess() {
		return pFile;
	}
	
	public ParserRule getFileRule() {
		return getFileAccess().getRule();
	}
	
	//Import :
	//    'import' importedNamespace=QualifiedNameWithWildCard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifiedNameWithWildCard :
	//    QualifiedName '.*'?;
	public QualifiedNameWithWildCardElements getQualifiedNameWithWildCardAccess() {
		return pQualifiedNameWithWildCard;
	}
	
	public ParserRule getQualifiedNameWithWildCardRule() {
		return getQualifiedNameWithWildCardAccess().getRule();
	}
	
	//QualifiedName :
	//    ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Namespace :
	//    name=QualifiedName '{'
	//        (elements+=Element)*
	//    '}';
	public NamespaceElements getNamespaceAccess() {
		return pNamespace;
	}
	
	public ParserRule getNamespaceRule() {
		return getNamespaceAccess().getRule();
	}
	
	//Element :
	//    Namespace | Type | Import;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//Type :
	//    Entity | Datatype;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Entity :
	//    'entity' name=ID '{'
	//        (properties+=Property)*
	//    '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Datatype :
	//    'datatype' name=ID;
	public DatatypeElements getDatatypeAccess() {
		return pDatatype;
	}
	
	public ParserRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}
	
	//Property :
	//    type=[Type|QualifiedName] name=ID;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
