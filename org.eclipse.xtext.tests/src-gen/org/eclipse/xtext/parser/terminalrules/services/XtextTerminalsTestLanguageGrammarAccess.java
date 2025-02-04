/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.terminalrules.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class XtextTerminalsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class GrammarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.Grammar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGrammarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameGrammarIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cWithKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cUsedGrammarsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cUsedGrammarsGrammarCrossReference_2_1_0 = (CrossReference)cUsedGrammarsAssignment_2_1.eContents().get(0);
		private final RuleCall cUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1 = (RuleCall)cUsedGrammarsGrammarCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cUsedGrammarsAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cUsedGrammarsGrammarCrossReference_2_2_1_0 = (CrossReference)cUsedGrammarsAssignment_2_2_1.eContents().get(0);
		private final RuleCall cUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1 = (RuleCall)cUsedGrammarsGrammarCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cDefinesHiddenTokensAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final Keyword cDefinesHiddenTokensHiddenKeyword_3_0_0 = (Keyword)cDefinesHiddenTokensAssignment_3_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Assignment cHiddenTokensAssignment_3_2_0 = (Assignment)cGroup_3_2.eContents().get(0);
		private final CrossReference cHiddenTokensAbstractRuleCrossReference_3_2_0_0 = (CrossReference)cHiddenTokensAssignment_3_2_0.eContents().get(0);
		private final RuleCall cHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_0_0_1 = (RuleCall)cHiddenTokensAbstractRuleCrossReference_3_2_0_0.eContents().get(1);
		private final Group cGroup_3_2_1 = (Group)cGroup_3_2.eContents().get(1);
		private final Keyword cCommaKeyword_3_2_1_0 = (Keyword)cGroup_3_2_1.eContents().get(0);
		private final Assignment cHiddenTokensAssignment_3_2_1_1 = (Assignment)cGroup_3_2_1.eContents().get(1);
		private final CrossReference cHiddenTokensAbstractRuleCrossReference_3_2_1_1_0 = (CrossReference)cHiddenTokensAssignment_3_2_1_1.eContents().get(0);
		private final RuleCall cHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_1_1_0_1 = (RuleCall)cHiddenTokensAbstractRuleCrossReference_3_2_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cMetamodelDeclarationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0 = (RuleCall)cMetamodelDeclarationsAssignment_4.eContents().get(0);
		private final Assignment cRulesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRulesAbstractRuleParserRuleCall_5_0 = (RuleCall)cRulesAssignment_5.eContents().get(0);
		
		//Grammar:
		//    'grammar' name=GrammarID ('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
		//    (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?
		//    metamodelDeclarations+=AbstractMetamodelDeclaration*
		//    (rules+=AbstractRule)+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'grammar' name=GrammarID ('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
		//(definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?
		//metamodelDeclarations+=AbstractMetamodelDeclaration*
		//(rules+=AbstractRule)+
		public Group getGroup() { return cGroup; }
		
		//'grammar'
		public Keyword getGrammarKeyword_0() { return cGrammarKeyword_0; }
		
		//name=GrammarID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//GrammarID
		public RuleCall getNameGrammarIDParserRuleCall_1_0() { return cNameGrammarIDParserRuleCall_1_0; }
		
		//('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'with'
		public Keyword getWithKeyword_2_0() { return cWithKeyword_2_0; }
		
		//usedGrammars+=[Grammar|GrammarID]
		public Assignment getUsedGrammarsAssignment_2_1() { return cUsedGrammarsAssignment_2_1; }
		
		//[Grammar|GrammarID]
		public CrossReference getUsedGrammarsGrammarCrossReference_2_1_0() { return cUsedGrammarsGrammarCrossReference_2_1_0; }
		
		//GrammarID
		public RuleCall getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1() { return cUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1; }
		
		//(',' usedGrammars+=[Grammar|GrammarID])*
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//','
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }
		
		//usedGrammars+=[Grammar|GrammarID]
		public Assignment getUsedGrammarsAssignment_2_2_1() { return cUsedGrammarsAssignment_2_2_1; }
		
		//[Grammar|GrammarID]
		public CrossReference getUsedGrammarsGrammarCrossReference_2_2_1_0() { return cUsedGrammarsGrammarCrossReference_2_2_1_0; }
		
		//GrammarID
		public RuleCall getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1() { return cUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1; }
		
		//(definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?
		public Group getGroup_3() { return cGroup_3; }
		
		//definesHiddenTokens?='hidden'
		public Assignment getDefinesHiddenTokensAssignment_3_0() { return cDefinesHiddenTokensAssignment_3_0; }
		
		//'hidden'
		public Keyword getDefinesHiddenTokensHiddenKeyword_3_0_0() { return cDefinesHiddenTokensHiddenKeyword_3_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }
		
		//(hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//hiddenTokens+=[AbstractRule]
		public Assignment getHiddenTokensAssignment_3_2_0() { return cHiddenTokensAssignment_3_2_0; }
		
		//[AbstractRule]
		public CrossReference getHiddenTokensAbstractRuleCrossReference_3_2_0_0() { return cHiddenTokensAbstractRuleCrossReference_3_2_0_0; }
		
		//ID
		public RuleCall getHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_0_0_1() { return cHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_0_0_1; }
		
		//(',' hiddenTokens+=[AbstractRule])*
		public Group getGroup_3_2_1() { return cGroup_3_2_1; }
		
		//','
		public Keyword getCommaKeyword_3_2_1_0() { return cCommaKeyword_3_2_1_0; }
		
		//hiddenTokens+=[AbstractRule]
		public Assignment getHiddenTokensAssignment_3_2_1_1() { return cHiddenTokensAssignment_3_2_1_1; }
		
		//[AbstractRule]
		public CrossReference getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0() { return cHiddenTokensAbstractRuleCrossReference_3_2_1_1_0; }
		
		//ID
		public RuleCall getHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_1_1_0_1() { return cHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_1_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }
		
		//metamodelDeclarations+=AbstractMetamodelDeclaration*
		public Assignment getMetamodelDeclarationsAssignment_4() { return cMetamodelDeclarationsAssignment_4; }
		
		//AbstractMetamodelDeclaration
		public RuleCall getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0() { return cMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0; }
		
		//(rules+=AbstractRule)+
		public Assignment getRulesAssignment_5() { return cRulesAssignment_5; }
		
		//AbstractRule
		public RuleCall getRulesAbstractRuleParserRuleCall_5_0() { return cRulesAbstractRuleParserRuleCall_5_0; }
	}
	public class GrammarIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.GrammarID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//GrammarID returns ecore::EString:
		//  ID ('.' ID)*;
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
	public class AbstractRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AbstractRule");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParserRuleParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTerminalRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumRuleParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractRule : ParserRule | TerminalRule | EnumRule;
		@Override public ParserRule getRule() { return rule; }
		
		//ParserRule | TerminalRule | EnumRule
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ParserRule
		public RuleCall getParserRuleParserRuleCall_0() { return cParserRuleParserRuleCall_0; }
		
		//TerminalRule
		public RuleCall getTerminalRuleParserRuleCall_1() { return cTerminalRuleParserRuleCall_1; }
		
		//EnumRule
		public RuleCall getEnumRuleParserRuleCall_2() { return cEnumRuleParserRuleCall_2; }
	}
	public class AbstractMetamodelDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AbstractMetamodelDeclaration");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cGeneratedMetamodelParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cReferencedMetamodelParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractMetamodelDeclaration :
		//    GeneratedMetamodel | ReferencedMetamodel;
		@Override public ParserRule getRule() { return rule; }
		
		//GeneratedMetamodel | ReferencedMetamodel
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//GeneratedMetamodel
		public RuleCall getGeneratedMetamodelParserRuleCall_0() { return cGeneratedMetamodelParserRuleCall_0; }
		
		//ReferencedMetamodel
		public RuleCall getReferencedMetamodelParserRuleCall_1() { return cReferencedMetamodelParserRuleCall_1; }
	}
	public class GeneratedMetamodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.GeneratedMetamodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGenerateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cEPackageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cEPackageEPackageCrossReference_2_0 = (CrossReference)cEPackageAssignment_2.eContents().get(0);
		private final RuleCall cEPackageEPackageSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cEPackageEPackageCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAliasAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_3_1_0 = (RuleCall)cAliasAssignment_3_1.eContents().get(0);
		
		//// constraint: typeSelect(GeneratedMetamodel).size() == typeSelect(GeneratedMetamodel).alias.size()
		//// generated metamodels have to have different aliases
		//GeneratedMetamodel :
		//    'generate' name=ID ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'generate' name=ID ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?
		public Group getGroup() { return cGroup; }
		
		//'generate'
		public Keyword getGenerateKeyword_0() { return cGenerateKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//ePackage=[ecore::EPackage|STRING]
		public Assignment getEPackageAssignment_2() { return cEPackageAssignment_2; }
		
		//[ecore::EPackage|STRING]
		public CrossReference getEPackageEPackageCrossReference_2_0() { return cEPackageEPackageCrossReference_2_0; }
		
		//STRING
		public RuleCall getEPackageEPackageSTRINGTerminalRuleCall_2_0_1() { return cEPackageEPackageSTRINGTerminalRuleCall_2_0_1; }
		
		//('as' alias=ID)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'as'
		public Keyword getAsKeyword_3_0() { return cAsKeyword_3_0; }
		
		//alias=ID
		public Assignment getAliasAssignment_3_1() { return cAliasAssignment_3_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_3_1_0() { return cAliasIDTerminalRuleCall_3_1_0; }
	}
	public class ReferencedMetamodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ReferencedMetamodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cEPackageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEPackageEPackageCrossReference_1_0 = (CrossReference)cEPackageAssignment_1.eContents().get(0);
		private final RuleCall cEPackageEPackageSTRINGTerminalRuleCall_1_0_1 = (RuleCall)cEPackageEPackageCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAliasAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAliasIDTerminalRuleCall_2_1_0 = (RuleCall)cAliasAssignment_2_1.eContents().get(0);
		
		//// referenced metamodels may share aliases with other referenced metamodels
		//// and with generated metamodels
		//ReferencedMetamodel :
		//    'import' ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//ePackage=[ecore::EPackage|STRING]
		public Assignment getEPackageAssignment_1() { return cEPackageAssignment_1; }
		
		//[ecore::EPackage|STRING]
		public CrossReference getEPackageEPackageCrossReference_1_0() { return cEPackageEPackageCrossReference_1_0; }
		
		//STRING
		public RuleCall getEPackageEPackageSTRINGTerminalRuleCall_1_0_1() { return cEPackageEPackageSTRINGTerminalRuleCall_1_0_1; }
		
		//('as' alias=ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'as'
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }
		
		//alias=ID
		public Assignment getAliasAssignment_2_1() { return cAliasAssignment_2_1; }
		
		//ID
		public RuleCall getAliasIDTerminalRuleCall_2_1_0() { return cAliasIDTerminalRuleCall_2_1_0; }
	}
	public class ParserRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ParserRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cReturnsKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cDefinesHiddenTokensAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final Keyword cDefinesHiddenTokensHiddenKeyword_2_0_0 = (Keyword)cDefinesHiddenTokensAssignment_2_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Assignment cHiddenTokensAssignment_2_2_0 = (Assignment)cGroup_2_2.eContents().get(0);
		private final CrossReference cHiddenTokensAbstractRuleCrossReference_2_2_0_0 = (CrossReference)cHiddenTokensAssignment_2_2_0.eContents().get(0);
		private final RuleCall cHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_0_0_1 = (RuleCall)cHiddenTokensAbstractRuleCrossReference_2_2_0_0.eContents().get(1);
		private final Group cGroup_2_2_1 = (Group)cGroup_2_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_2_1_0 = (Keyword)cGroup_2_2_1.eContents().get(0);
		private final Assignment cHiddenTokensAssignment_2_2_1_1 = (Assignment)cGroup_2_2_1.eContents().get(1);
		private final CrossReference cHiddenTokensAbstractRuleCrossReference_2_2_1_1_0 = (CrossReference)cHiddenTokensAssignment_2_2_1_1.eContents().get(0);
		private final RuleCall cHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_1_1_0_1 = (RuleCall)cHiddenTokensAbstractRuleCrossReference_2_2_1_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAlternativesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAlternativesAlternativesParserRuleCall_4_0 = (RuleCall)cAlternativesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ParserRule :
		//    name=ID ('returns' type=TypeRef)? (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?':'
		//        alternatives=Alternatives
		//    ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('returns' type=TypeRef)? (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?':'
		//    alternatives=Alternatives
		//';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('returns' type=TypeRef)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'returns'
		public Keyword getReturnsKeyword_1_0() { return cReturnsKeyword_1_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_1_0() { return cTypeTypeRefParserRuleCall_1_1_0; }
		
		//(definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?
		public Group getGroup_2() { return cGroup_2; }
		
		//definesHiddenTokens?='hidden'
		public Assignment getDefinesHiddenTokensAssignment_2_0() { return cDefinesHiddenTokensAssignment_2_0; }
		
		//'hidden'
		public Keyword getDefinesHiddenTokensHiddenKeyword_2_0_0() { return cDefinesHiddenTokensHiddenKeyword_2_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_1() { return cLeftParenthesisKeyword_2_1; }
		
		//(hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//hiddenTokens+=[AbstractRule]
		public Assignment getHiddenTokensAssignment_2_2_0() { return cHiddenTokensAssignment_2_2_0; }
		
		//[AbstractRule]
		public CrossReference getHiddenTokensAbstractRuleCrossReference_2_2_0_0() { return cHiddenTokensAbstractRuleCrossReference_2_2_0_0; }
		
		//ID
		public RuleCall getHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_0_0_1() { return cHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_0_0_1; }
		
		//(',' hiddenTokens+=[AbstractRule])*
		public Group getGroup_2_2_1() { return cGroup_2_2_1; }
		
		//','
		public Keyword getCommaKeyword_2_2_1_0() { return cCommaKeyword_2_2_1_0; }
		
		//hiddenTokens+=[AbstractRule]
		public Assignment getHiddenTokensAssignment_2_2_1_1() { return cHiddenTokensAssignment_2_2_1_1; }
		
		//[AbstractRule]
		public CrossReference getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0() { return cHiddenTokensAbstractRuleCrossReference_2_2_1_1_0; }
		
		//ID
		public RuleCall getHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_1_1_0_1() { return cHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_1_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//alternatives=Alternatives
		public Assignment getAlternativesAssignment_4() { return cAlternativesAssignment_4; }
		
		//Alternatives
		public RuleCall getAlternativesAlternativesParserRuleCall_4_0() { return cAlternativesAlternativesParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.TypeRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cMetamodelAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0 = (CrossReference)cMetamodelAssignment_0_0.eContents().get(0);
		private final RuleCall cMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1 = (RuleCall)cMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0.eContents().get(1);
		private final Keyword cColonColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cClassifierAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cClassifierEClassifierCrossReference_1_0 = (CrossReference)cClassifierAssignment_1.eContents().get(0);
		private final RuleCall cClassifierEClassifierIDTerminalRuleCall_1_0_1 = (RuleCall)cClassifierEClassifierCrossReference_1_0.eContents().get(1);
		
		//TypeRef :
		//    (metamodel=[AbstractMetamodelDeclaration] '::')? classifier=[ecore::EClassifier]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(metamodel=[AbstractMetamodelDeclaration] '::')? classifier=[ecore::EClassifier]
		public Group getGroup() { return cGroup; }
		
		//(metamodel=[AbstractMetamodelDeclaration] '::')?
		public Group getGroup_0() { return cGroup_0; }
		
		//metamodel=[AbstractMetamodelDeclaration]
		public Assignment getMetamodelAssignment_0_0() { return cMetamodelAssignment_0_0; }
		
		//[AbstractMetamodelDeclaration]
		public CrossReference getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0() { return cMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0; }
		
		//ID
		public RuleCall getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1() { return cMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1; }
		
		//'::'
		public Keyword getColonColonKeyword_0_1() { return cColonColonKeyword_0_1; }
		
		//classifier=[ecore::EClassifier]
		public Assignment getClassifierAssignment_1() { return cClassifierAssignment_1; }
		
		//[ecore::EClassifier]
		public CrossReference getClassifierEClassifierCrossReference_1_0() { return cClassifierEClassifierCrossReference_1_0; }
		
		//ID
		public RuleCall getClassifierEClassifierIDTerminalRuleCall_1_0_1() { return cClassifierEClassifierIDTerminalRuleCall_1_0_1; }
	}
	public class AlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.Alternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cGroupParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesGroupsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cGroupsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cGroupsGroupParserRuleCall_1_1_1_0 = (RuleCall)cGroupsAssignment_1_1_1.eContents().get(0);
		
		//Alternatives returns AbstractElement:
		//    Group ({Alternatives.groups+=current} ('|' groups+=Group)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Group ({Alternatives.groups+=current} ('|' groups+=Group)+)?
		public Group getGroup() { return cGroup; }
		
		//Group
		public RuleCall getGroupParserRuleCall_0() { return cGroupParserRuleCall_0; }
		
		//({Alternatives.groups+=current} ('|' groups+=Group)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.groups+=current}
		public Action getAlternativesGroupsAction_1_0() { return cAlternativesGroupsAction_1_0; }
		
		//('|' groups+=Group)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//groups+=Group
		public Assignment getGroupsAssignment_1_1_1() { return cGroupsAssignment_1_1_1; }
		
		//Group
		public RuleCall getGroupsGroupParserRuleCall_1_1_1_0() { return cGroupsGroupParserRuleCall_1_1_1_0; }
	}
	public class GroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.Group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAbstractTokenParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cGroupTokensAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cTokensAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTokensAbstractTokenParserRuleCall_1_1_0 = (RuleCall)cTokensAssignment_1_1.eContents().get(0);
		
		//Group returns AbstractElement:
		//    AbstractToken ({Group.tokens+=current} (tokens+=AbstractToken)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AbstractToken ({Group.tokens+=current} (tokens+=AbstractToken)+)?
		public Group getGroup() { return cGroup; }
		
		//AbstractToken
		public RuleCall getAbstractTokenParserRuleCall_0() { return cAbstractTokenParserRuleCall_0; }
		
		//({Group.tokens+=current} (tokens+=AbstractToken)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Group.tokens+=current}
		public Action getGroupTokensAction_1_0() { return cGroupTokensAction_1_0; }
		
		//(tokens+=AbstractToken)+
		public Assignment getTokensAssignment_1_1() { return cTokensAssignment_1_1; }
		
		//AbstractToken
		public RuleCall getTokensAbstractTokenParserRuleCall_1_1_0() { return cTokensAbstractTokenParserRuleCall_1_1_0; }
	}
	public class AbstractTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AbstractToken");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAbstractTokenWithCardinalityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cActionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractToken returns AbstractElement:
		//    AbstractTokenWithCardinality |
		//    Action
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AbstractTokenWithCardinality |
		//Action
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AbstractTokenWithCardinality
		public RuleCall getAbstractTokenWithCardinalityParserRuleCall_0() { return cAbstractTokenWithCardinalityParserRuleCall_0; }
		
		//Action
		public RuleCall getActionParserRuleCall_1() { return cActionParserRuleCall_1; }
	}
	public class AbstractTokenWithCardinalityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AbstractTokenWithCardinality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cAssignmentParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cAbstractTerminalParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Assignment cCardinalityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cCardinalityAlternatives_1_0 = (Alternatives)cCardinalityAssignment_1.eContents().get(0);
		private final Keyword cCardinalityQuestionMarkKeyword_1_0_0 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(0);
		private final Keyword cCardinalityAsteriskKeyword_1_0_1 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(1);
		private final Keyword cCardinalityPlusSignKeyword_1_0_2 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(2);
		
		///* SuppressWarnings[potentialOverride] */
		//AbstractTokenWithCardinality returns AbstractElement:
		//    (Assignment |
		//     AbstractTerminal) (cardinality=('?'|'*'|'+'))?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//(Assignment |
		// AbstractTerminal) (cardinality=('?'|'*'|'+'))?
		public Group getGroup() { return cGroup; }
		
		//(Assignment |
		// AbstractTerminal)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Assignment
		public RuleCall getAssignmentParserRuleCall_0_0() { return cAssignmentParserRuleCall_0_0; }
		
		//AbstractTerminal
		public RuleCall getAbstractTerminalParserRuleCall_0_1() { return cAbstractTerminalParserRuleCall_0_1; }
		
		//(cardinality=('?'|'*'|'+'))?
		public Assignment getCardinalityAssignment_1() { return cCardinalityAssignment_1; }
		
		//('?'|'*'|'+')
		public Alternatives getCardinalityAlternatives_1_0() { return cCardinalityAlternatives_1_0; }
		
		//'?'
		public Keyword getCardinalityQuestionMarkKeyword_1_0_0() { return cCardinalityQuestionMarkKeyword_1_0_0; }
		
		//'*'
		public Keyword getCardinalityAsteriskKeyword_1_0_1() { return cCardinalityAsteriskKeyword_1_0_1; }
		
		//'+'
		public Keyword getCardinalityPlusSignKeyword_1_0_2() { return cCardinalityPlusSignKeyword_1_0_2; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cFeatureAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cFeatureIDTerminalRuleCall_2_1_0 = (RuleCall)cFeatureAssignment_2_1.eContents().get(0);
		private final Assignment cOperatorAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final Alternatives cOperatorAlternatives_2_2_0 = (Alternatives)cOperatorAssignment_2_2.eContents().get(0);
		private final Keyword cOperatorEqualsSignKeyword_2_2_0_0 = (Keyword)cOperatorAlternatives_2_2_0.eContents().get(0);
		private final Keyword cOperatorPlusSignEqualsSignKeyword_2_2_0_1 = (Keyword)cOperatorAlternatives_2_2_0.eContents().get(1);
		private final Keyword cCurrentKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Action returns Action:
		//    '{' type=TypeRef ('.' feature=ID operator=('='|'+=') 'current')? '}'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'{' type=TypeRef ('.' feature=ID operator=('='|'+=') 'current')? '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_0() { return cTypeTypeRefParserRuleCall_1_0; }
		
		//('.' feature=ID operator=('='|'+=') 'current')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'.'
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//feature=ID
		public Assignment getFeatureAssignment_2_1() { return cFeatureAssignment_2_1; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_2_1_0() { return cFeatureIDTerminalRuleCall_2_1_0; }
		
		//operator=('='|'+=')
		public Assignment getOperatorAssignment_2_2() { return cOperatorAssignment_2_2; }
		
		//('='|'+=')
		public Alternatives getOperatorAlternatives_2_2_0() { return cOperatorAlternatives_2_2_0; }
		
		//'='
		public Keyword getOperatorEqualsSignKeyword_2_2_0_0() { return cOperatorEqualsSignKeyword_2_2_0_0; }
		
		//'+='
		public Keyword getOperatorPlusSignEqualsSignKeyword_2_2_0_1() { return cOperatorPlusSignEqualsSignKeyword_2_2_0_1; }
		
		//'current'
		public Keyword getCurrentKeyword_2_3() { return cCurrentKeyword_2_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class AbstractTerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AbstractTerminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenthesizedElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractTerminal returns AbstractElement:
		//   Keyword | RuleCall | ParenthesizedElement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword | RuleCall | ParenthesizedElement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//RuleCall
		public RuleCall getRuleCallParserRuleCall_1() { return cRuleCallParserRuleCall_1; }
		
		//ParenthesizedElement
		public RuleCall getParenthesizedElementParserRuleCall_2() { return cParenthesizedElementParserRuleCall_2; }
	}
	public class KeywordElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.Keyword");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Keyword :
		//   value=STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=STRING
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0() { return cValueSTRINGTerminalRuleCall_0; }
	}
	public class RuleCallElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.RuleCall");
		private final Assignment cRuleAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRuleAbstractRuleCrossReference_0 = (CrossReference)cRuleAssignment.eContents().get(0);
		private final RuleCall cRuleAbstractRuleIDTerminalRuleCall_0_1 = (RuleCall)cRuleAbstractRuleCrossReference_0.eContents().get(1);
		
		//RuleCall :
		//   rule=[AbstractRule]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//rule=[AbstractRule]
		public Assignment getRuleAssignment() { return cRuleAssignment; }
		
		//[AbstractRule]
		public CrossReference getRuleAbstractRuleCrossReference_0() { return cRuleAbstractRuleCrossReference_0; }
		
		//ID
		public RuleCall getRuleAbstractRuleIDTerminalRuleCall_0_1() { return cRuleAbstractRuleIDTerminalRuleCall_0_1; }
	}
	public class AssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.Assignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFeatureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cFeatureIDTerminalRuleCall_0_0 = (RuleCall)cFeatureAssignment_0.eContents().get(0);
		private final Assignment cOperatorAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOperatorAlternatives_1_0 = (Alternatives)cOperatorAssignment_1.eContents().get(0);
		private final Keyword cOperatorPlusSignEqualsSignKeyword_1_0_0 = (Keyword)cOperatorAlternatives_1_0.eContents().get(0);
		private final Keyword cOperatorEqualsSignKeyword_1_0_1 = (Keyword)cOperatorAlternatives_1_0.eContents().get(1);
		private final Keyword cOperatorQuestionMarkEqualsSignKeyword_1_0_2 = (Keyword)cOperatorAlternatives_1_0.eContents().get(2);
		private final Assignment cTerminalAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTerminalAssignableTerminalParserRuleCall_2_0 = (RuleCall)cTerminalAssignment_2.eContents().get(0);
		
		//Assignment returns Assignment:
		//   feature=ID operator=('+='|'='|'?=') ^terminal=AssignableTerminal
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//feature=ID operator=('+='|'='|'?=') ^terminal=AssignableTerminal
		public Group getGroup() { return cGroup; }
		
		//feature=ID
		public Assignment getFeatureAssignment_0() { return cFeatureAssignment_0; }
		
		//ID
		public RuleCall getFeatureIDTerminalRuleCall_0_0() { return cFeatureIDTerminalRuleCall_0_0; }
		
		//operator=('+='|'='|'?=')
		public Assignment getOperatorAssignment_1() { return cOperatorAssignment_1; }
		
		//('+='|'='|'?=')
		public Alternatives getOperatorAlternatives_1_0() { return cOperatorAlternatives_1_0; }
		
		//'+='
		public Keyword getOperatorPlusSignEqualsSignKeyword_1_0_0() { return cOperatorPlusSignEqualsSignKeyword_1_0_0; }
		
		//'='
		public Keyword getOperatorEqualsSignKeyword_1_0_1() { return cOperatorEqualsSignKeyword_1_0_1; }
		
		//'?='
		public Keyword getOperatorQuestionMarkEqualsSignKeyword_1_0_2() { return cOperatorQuestionMarkEqualsSignKeyword_1_0_2; }
		
		//^terminal=AssignableTerminal
		public Assignment getTerminalAssignment_2() { return cTerminalAssignment_2; }
		
		//AssignableTerminal
		public RuleCall getTerminalAssignableTerminalParserRuleCall_2_0() { return cTerminalAssignableTerminalParserRuleCall_2_0; }
	}
	public class AssignableTerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AssignableTerminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenthesizedAssignableElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cCrossReferenceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//AssignableTerminal returns AbstractElement:
		//   Keyword | RuleCall | ParenthesizedAssignableElement | CrossReference
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword | RuleCall | ParenthesizedAssignableElement | CrossReference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//RuleCall
		public RuleCall getRuleCallParserRuleCall_1() { return cRuleCallParserRuleCall_1; }
		
		//ParenthesizedAssignableElement
		public RuleCall getParenthesizedAssignableElementParserRuleCall_2() { return cParenthesizedAssignableElementParserRuleCall_2; }
		
		//CrossReference
		public RuleCall getCrossReferenceParserRuleCall_3() { return cCrossReferenceParserRuleCall_3; }
	}
	public class ParenthesizedAssignableElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ParenthesizedAssignableElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAssignableAlternativesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedAssignableElement returns AbstractElement:
		//   '(' AssignableAlternatives ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' AssignableAlternatives ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//AssignableAlternatives
		public RuleCall getAssignableAlternativesParserRuleCall_1() { return cAssignableAlternativesParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class AssignableAlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AssignableAlternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAssignableTerminalParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesGroupsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cGroupsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cGroupsAssignableTerminalParserRuleCall_1_1_1_0 = (RuleCall)cGroupsAssignment_1_1_1.eContents().get(0);
		
		//AssignableAlternatives returns AbstractElement:
		//    AssignableTerminal ({Alternatives.groups+=current} ('|' groups+=AssignableTerminal)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//AssignableTerminal ({Alternatives.groups+=current} ('|' groups+=AssignableTerminal)+)?
		public Group getGroup() { return cGroup; }
		
		//AssignableTerminal
		public RuleCall getAssignableTerminalParserRuleCall_0() { return cAssignableTerminalParserRuleCall_0; }
		
		//({Alternatives.groups+=current} ('|' groups+=AssignableTerminal)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.groups+=current}
		public Action getAlternativesGroupsAction_1_0() { return cAlternativesGroupsAction_1_0; }
		
		//('|' groups+=AssignableTerminal)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//groups+=AssignableTerminal
		public Assignment getGroupsAssignment_1_1_1() { return cGroupsAssignment_1_1_1; }
		
		//AssignableTerminal
		public RuleCall getGroupsAssignableTerminalParserRuleCall_1_1_1_0() { return cGroupsAssignableTerminalParserRuleCall_1_1_1_0; }
	}
	public class CrossReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.CrossReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cVerticalLineKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTerminalAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTerminalCrossReferenceableTerminalParserRuleCall_2_1_0 = (RuleCall)cTerminalAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//CrossReference :
		//    '[' type=TypeRef ('|' ^terminal=CrossReferenceableTerminal )? ']'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'[' type=TypeRef ('|' ^terminal=CrossReferenceableTerminal )? ']'
		public Group getGroup() { return cGroup; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_0() { return cTypeTypeRefParserRuleCall_1_0; }
		
		//('|' ^terminal=CrossReferenceableTerminal )?
		public Group getGroup_2() { return cGroup_2; }
		
		//'|'
		public Keyword getVerticalLineKeyword_2_0() { return cVerticalLineKeyword_2_0; }
		
		//^terminal=CrossReferenceableTerminal
		public Assignment getTerminalAssignment_2_1() { return cTerminalAssignment_2_1; }
		
		//CrossReferenceableTerminal
		public RuleCall getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0() { return cTerminalCrossReferenceableTerminalParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class CrossReferenceableTerminalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.CrossReferenceableTerminal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//CrossReferenceableTerminal returns AbstractElement:
		//   Keyword | RuleCall
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword | RuleCall
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//RuleCall
		public RuleCall getRuleCallParserRuleCall_1() { return cRuleCallParserRuleCall_1; }
	}
	public class ParenthesizedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ParenthesizedElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cAlternativesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedElement returns AbstractElement:
		//   '(' Alternatives ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Alternatives ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Alternatives
		public RuleCall getAlternativesParserRuleCall_1() { return cAlternativesParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class TerminalRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.TerminalRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTerminalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cReturnsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_2_1_0 = (RuleCall)cTypeAssignment_2_1.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAlternativesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAlternativesTerminalAlternativesParserRuleCall_4_0 = (RuleCall)cAlternativesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//TerminalRule :
		//    'terminal' name=ID ('returns' type=TypeRef)? ':'
		//        alternatives=TerminalAlternatives
		//    ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'terminal' name=ID ('returns' type=TypeRef)? ':'
		//    alternatives=TerminalAlternatives
		//';'
		public Group getGroup() { return cGroup; }
		
		//'terminal'
		public Keyword getTerminalKeyword_0() { return cTerminalKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('returns' type=TypeRef)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'returns'
		public Keyword getReturnsKeyword_2_0() { return cReturnsKeyword_2_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_2_1_0() { return cTypeTypeRefParserRuleCall_2_1_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//alternatives=TerminalAlternatives
		public Assignment getAlternativesAssignment_4() { return cAlternativesAssignment_4; }
		
		//TerminalAlternatives
		public RuleCall getAlternativesTerminalAlternativesParserRuleCall_4_0() { return cAlternativesTerminalAlternativesParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class TerminalAlternativesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.TerminalAlternatives");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalGroupParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesGroupsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cGroupsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cGroupsTerminalGroupParserRuleCall_1_1_1_0 = (RuleCall)cGroupsAssignment_1_1_1.eContents().get(0);
		
		//TerminalAlternatives returns AbstractElement:
		//    TerminalGroup ({Alternatives.groups+=current} ('|' groups+=TerminalGroup)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalGroup ({Alternatives.groups+=current} ('|' groups+=TerminalGroup)+)?
		public Group getGroup() { return cGroup; }
		
		//TerminalGroup
		public RuleCall getTerminalGroupParserRuleCall_0() { return cTerminalGroupParserRuleCall_0; }
		
		//({Alternatives.groups+=current} ('|' groups+=TerminalGroup)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.groups+=current}
		public Action getAlternativesGroupsAction_1_0() { return cAlternativesGroupsAction_1_0; }
		
		//('|' groups+=TerminalGroup)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//groups+=TerminalGroup
		public Assignment getGroupsAssignment_1_1_1() { return cGroupsAssignment_1_1_1; }
		
		//TerminalGroup
		public RuleCall getGroupsTerminalGroupParserRuleCall_1_1_1_0() { return cGroupsTerminalGroupParserRuleCall_1_1_1_0; }
	}
	public class TerminalGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.TerminalGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalTokenParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cGroupTokensAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cTokensAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTokensTerminalTokenParserRuleCall_1_1_0 = (RuleCall)cTokensAssignment_1_1.eContents().get(0);
		
		//TerminalGroup returns AbstractElement:
		//    TerminalToken ({Group.tokens+=current} (tokens+=TerminalToken)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalToken ({Group.tokens+=current} (tokens+=TerminalToken)+)?
		public Group getGroup() { return cGroup; }
		
		//TerminalToken
		public RuleCall getTerminalTokenParserRuleCall_0() { return cTerminalTokenParserRuleCall_0; }
		
		//({Group.tokens+=current} (tokens+=TerminalToken)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Group.tokens+=current}
		public Action getGroupTokensAction_1_0() { return cGroupTokensAction_1_0; }
		
		//(tokens+=TerminalToken)+
		public Assignment getTokensAssignment_1_1() { return cTokensAssignment_1_1; }
		
		//TerminalToken
		public RuleCall getTokensTerminalTokenParserRuleCall_1_1_0() { return cTokensTerminalTokenParserRuleCall_1_1_0; }
	}
	public class TerminalTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.TerminalToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTerminalTokenElementParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cCardinalityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cCardinalityAlternatives_1_0 = (Alternatives)cCardinalityAssignment_1.eContents().get(0);
		private final Keyword cCardinalityQuestionMarkKeyword_1_0_0 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(0);
		private final Keyword cCardinalityAsteriskKeyword_1_0_1 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(1);
		private final Keyword cCardinalityPlusSignKeyword_1_0_2 = (Keyword)cCardinalityAlternatives_1_0.eContents().get(2);
		
		///* SuppressWarnings[potentialOverride] */
		//TerminalToken returns AbstractElement:
		//    TerminalTokenElement (cardinality=('?'|'*'|'+'))?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//TerminalTokenElement (cardinality=('?'|'*'|'+'))?
		public Group getGroup() { return cGroup; }
		
		//TerminalTokenElement
		public RuleCall getTerminalTokenElementParserRuleCall_0() { return cTerminalTokenElementParserRuleCall_0; }
		
		//(cardinality=('?'|'*'|'+'))?
		public Assignment getCardinalityAssignment_1() { return cCardinalityAssignment_1; }
		
		//('?'|'*'|'+')
		public Alternatives getCardinalityAlternatives_1_0() { return cCardinalityAlternatives_1_0; }
		
		//'?'
		public Keyword getCardinalityQuestionMarkKeyword_1_0_0() { return cCardinalityQuestionMarkKeyword_1_0_0; }
		
		//'*'
		public Keyword getCardinalityAsteriskKeyword_1_0_1() { return cCardinalityAsteriskKeyword_1_0_1; }
		
		//'+'
		public Keyword getCardinalityPlusSignKeyword_1_0_2() { return cCardinalityPlusSignKeyword_1_0_2; }
	}
	public class TerminalTokenElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.TerminalTokenElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCharacterRangeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleCallParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cParenthesizedTerminalElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAbstractNegatedTokenParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cWildcardParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//TerminalTokenElement returns AbstractElement:
		//   CharacterRange | RuleCall | ParenthesizedTerminalElement | AbstractNegatedToken | Wildcard
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//CharacterRange | RuleCall | ParenthesizedTerminalElement | AbstractNegatedToken | Wildcard
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CharacterRange
		public RuleCall getCharacterRangeParserRuleCall_0() { return cCharacterRangeParserRuleCall_0; }
		
		//RuleCall
		public RuleCall getRuleCallParserRuleCall_1() { return cRuleCallParserRuleCall_1; }
		
		//ParenthesizedTerminalElement
		public RuleCall getParenthesizedTerminalElementParserRuleCall_2() { return cParenthesizedTerminalElementParserRuleCall_2; }
		
		//AbstractNegatedToken
		public RuleCall getAbstractNegatedTokenParserRuleCall_3() { return cAbstractNegatedTokenParserRuleCall_3; }
		
		//Wildcard
		public RuleCall getWildcardParserRuleCall_4() { return cWildcardParserRuleCall_4; }
	}
	public class ParenthesizedTerminalElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ParenthesizedTerminalElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cTerminalAlternativesParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ParenthesizedTerminalElement returns AbstractElement:
		//   '(' TerminalAlternatives ')'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' TerminalAlternatives ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//TerminalAlternatives
		public RuleCall getTerminalAlternativesParserRuleCall_1() { return cTerminalAlternativesParserRuleCall_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2() { return cRightParenthesisKeyword_2; }
	}
	public class AbstractNegatedTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.AbstractNegatedToken");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNegatedTokenParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUntilTokenParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractNegatedToken:
		//   NegatedToken | UntilToken
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//NegatedToken | UntilToken
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NegatedToken
		public RuleCall getNegatedTokenParserRuleCall_0() { return cNegatedTokenParserRuleCall_0; }
		
		//UntilToken
		public RuleCall getUntilTokenParserRuleCall_1() { return cUntilTokenParserRuleCall_1; }
	}
	public class NegatedTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.NegatedToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTerminalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTerminalTerminalTokenElementParserRuleCall_1_0 = (RuleCall)cTerminalAssignment_1.eContents().get(0);
		
		//NegatedToken:
		//    '!' ^terminal=TerminalTokenElement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'!' ^terminal=TerminalTokenElement
		public Group getGroup() { return cGroup; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_0() { return cExclamationMarkKeyword_0; }
		
		//^terminal=TerminalTokenElement
		public Assignment getTerminalAssignment_1() { return cTerminalAssignment_1; }
		
		//TerminalTokenElement
		public RuleCall getTerminalTerminalTokenElementParserRuleCall_1_0() { return cTerminalTerminalTokenElementParserRuleCall_1_0; }
	}
	public class UntilTokenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.UntilToken");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTerminalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTerminalTerminalTokenElementParserRuleCall_1_0 = (RuleCall)cTerminalAssignment_1.eContents().get(0);
		
		//UntilToken:
		//    '->' ^terminal=TerminalTokenElement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'->' ^terminal=TerminalTokenElement
		public Group getGroup() { return cGroup; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_0() { return cHyphenMinusGreaterThanSignKeyword_0; }
		
		//^terminal=TerminalTokenElement
		public Assignment getTerminalAssignment_1() { return cTerminalAssignment_1; }
		
		//TerminalTokenElement
		public RuleCall getTerminalTerminalTokenElementParserRuleCall_1_0() { return cTerminalTerminalTokenElementParserRuleCall_1_0; }
	}
	public class WildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.Wildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWildcardAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Wildcard:
		//    {Wildcard} '.'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Wildcard} '.'
		public Group getGroup() { return cGroup; }
		
		//{Wildcard}
		public Action getWildcardAction_0() { return cWildcardAction_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
	}
	public class CharacterRangeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.CharacterRange");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cKeywordParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cCharacterRangeLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightKeywordParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//CharacterRange returns AbstractElement:
		//    Keyword ( {CharacterRange.left=current} '..' right=Keyword)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Keyword ( {CharacterRange.left=current} '..' right=Keyword)?
		public Group getGroup() { return cGroup; }
		
		//Keyword
		public RuleCall getKeywordParserRuleCall_0() { return cKeywordParserRuleCall_0; }
		
		//( {CharacterRange.left=current} '..' right=Keyword)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{CharacterRange.left=current}
		public Action getCharacterRangeLeftAction_1_0() { return cCharacterRangeLeftAction_1_0; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_1_1() { return cFullStopFullStopKeyword_1_1; }
		
		//right=Keyword
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//Keyword
		public RuleCall getRightKeywordParserRuleCall_1_2_0() { return cRightKeywordParserRuleCall_1_2_0; }
	}
	public class EnumRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.EnumRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cReturnsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_2_1_0 = (RuleCall)cTypeAssignment_2_1.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAlternativesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAlternativesEnumLiteralsParserRuleCall_4_0 = (RuleCall)cAlternativesAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//EnumRule:
		//    'enum' name=ID ('returns' type=TypeRef)? ':'
		//        alternatives=EnumLiterals
		//    ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'enum' name=ID ('returns' type=TypeRef)? ':'
		//    alternatives=EnumLiterals
		//';'
		public Group getGroup() { return cGroup; }
		
		//'enum'
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('returns' type=TypeRef)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'returns'
		public Keyword getReturnsKeyword_2_0() { return cReturnsKeyword_2_0; }
		
		//type=TypeRef
		public Assignment getTypeAssignment_2_1() { return cTypeAssignment_2_1; }
		
		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_2_1_0() { return cTypeTypeRefParserRuleCall_2_1_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//alternatives=EnumLiterals
		public Assignment getAlternativesAssignment_4() { return cAlternativesAssignment_4; }
		
		//EnumLiterals
		public RuleCall getAlternativesEnumLiteralsParserRuleCall_4_0() { return cAlternativesEnumLiteralsParserRuleCall_4_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class EnumLiteralsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.EnumLiterals");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEnumLiteralDeclarationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativesGroupsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cVerticalLineKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cGroupsAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cGroupsEnumLiteralDeclarationParserRuleCall_1_1_1_0 = (RuleCall)cGroupsAssignment_1_1_1.eContents().get(0);
		
		//EnumLiterals returns AbstractElement:
		//    EnumLiteralDeclaration ({Alternatives.groups+=current} ('|' groups+=EnumLiteralDeclaration)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//EnumLiteralDeclaration ({Alternatives.groups+=current} ('|' groups+=EnumLiteralDeclaration)+)?
		public Group getGroup() { return cGroup; }
		
		//EnumLiteralDeclaration
		public RuleCall getEnumLiteralDeclarationParserRuleCall_0() { return cEnumLiteralDeclarationParserRuleCall_0; }
		
		//({Alternatives.groups+=current} ('|' groups+=EnumLiteralDeclaration)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Alternatives.groups+=current}
		public Action getAlternativesGroupsAction_1_0() { return cAlternativesGroupsAction_1_0; }
		
		//('|' groups+=EnumLiteralDeclaration)+
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1_0() { return cVerticalLineKeyword_1_1_0; }
		
		//groups+=EnumLiteralDeclaration
		public Assignment getGroupsAssignment_1_1_1() { return cGroupsAssignment_1_1_1; }
		
		//EnumLiteralDeclaration
		public RuleCall getGroupsEnumLiteralDeclarationParserRuleCall_1_1_1_0() { return cGroupsEnumLiteralDeclarationParserRuleCall_1_1_1_0; }
	}
	public class EnumLiteralDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.EnumLiteralDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEnumLiteralAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEnumLiteralEEnumLiteralCrossReference_0_0 = (CrossReference)cEnumLiteralAssignment_0.eContents().get(0);
		private final RuleCall cEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1 = (RuleCall)cEnumLiteralEEnumLiteralCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cLiteralAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cLiteralKeywordParserRuleCall_1_1_0 = (RuleCall)cLiteralAssignment_1_1.eContents().get(0);
		
		//EnumLiteralDeclaration:
		//    enumLiteral=[ecore::EEnumLiteral] ('=' literal=Keyword)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//enumLiteral=[ecore::EEnumLiteral] ('=' literal=Keyword)?
		public Group getGroup() { return cGroup; }
		
		//enumLiteral=[ecore::EEnumLiteral]
		public Assignment getEnumLiteralAssignment_0() { return cEnumLiteralAssignment_0; }
		
		//[ecore::EEnumLiteral]
		public CrossReference getEnumLiteralEEnumLiteralCrossReference_0_0() { return cEnumLiteralEEnumLiteralCrossReference_0_0; }
		
		//ID
		public RuleCall getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1() { return cEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1; }
		
		//('=' literal=Keyword)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }
		
		//literal=Keyword
		public Assignment getLiteralAssignment_1_1() { return cLiteralAssignment_1_1; }
		
		//Keyword
		public RuleCall getLiteralKeywordParserRuleCall_1_1_0() { return cLiteralKeywordParserRuleCall_1_1_0; }
	}
	
	
	private final GrammarElements pGrammar;
	private final GrammarIDElements pGrammarID;
	private final AbstractRuleElements pAbstractRule;
	private final AbstractMetamodelDeclarationElements pAbstractMetamodelDeclaration;
	private final GeneratedMetamodelElements pGeneratedMetamodel;
	private final ReferencedMetamodelElements pReferencedMetamodel;
	private final ParserRuleElements pParserRule;
	private final TypeRefElements pTypeRef;
	private final AlternativesElements pAlternatives;
	private final GroupElements pGroup;
	private final AbstractTokenElements pAbstractToken;
	private final AbstractTokenWithCardinalityElements pAbstractTokenWithCardinality;
	private final ActionElements pAction;
	private final AbstractTerminalElements pAbstractTerminal;
	private final KeywordElements pKeyword;
	private final RuleCallElements pRuleCall;
	private final AssignmentElements pAssignment;
	private final AssignableTerminalElements pAssignableTerminal;
	private final ParenthesizedAssignableElementElements pParenthesizedAssignableElement;
	private final AssignableAlternativesElements pAssignableAlternatives;
	private final CrossReferenceElements pCrossReference;
	private final CrossReferenceableTerminalElements pCrossReferenceableTerminal;
	private final ParenthesizedElementElements pParenthesizedElement;
	private final TerminalRuleElements pTerminalRule;
	private final TerminalAlternativesElements pTerminalAlternatives;
	private final TerminalGroupElements pTerminalGroup;
	private final TerminalTokenElements pTerminalToken;
	private final TerminalTokenElementElements pTerminalTokenElement;
	private final ParenthesizedTerminalElementElements pParenthesizedTerminalElement;
	private final AbstractNegatedTokenElements pAbstractNegatedToken;
	private final NegatedTokenElements pNegatedToken;
	private final UntilTokenElements pUntilToken;
	private final WildcardElements pWildcard;
	private final CharacterRangeElements pCharacterRange;
	private final EnumRuleElements pEnumRule;
	private final EnumLiteralsElements pEnumLiterals;
	private final EnumLiteralDeclarationElements pEnumLiteralDeclaration;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final TerminalRule tSTRING;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public XtextTerminalsTestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pGrammar = new GrammarElements();
		this.pGrammarID = new GrammarIDElements();
		this.pAbstractRule = new AbstractRuleElements();
		this.pAbstractMetamodelDeclaration = new AbstractMetamodelDeclarationElements();
		this.pGeneratedMetamodel = new GeneratedMetamodelElements();
		this.pReferencedMetamodel = new ReferencedMetamodelElements();
		this.pParserRule = new ParserRuleElements();
		this.pTypeRef = new TypeRefElements();
		this.pAlternatives = new AlternativesElements();
		this.pGroup = new GroupElements();
		this.pAbstractToken = new AbstractTokenElements();
		this.pAbstractTokenWithCardinality = new AbstractTokenWithCardinalityElements();
		this.pAction = new ActionElements();
		this.pAbstractTerminal = new AbstractTerminalElements();
		this.pKeyword = new KeywordElements();
		this.pRuleCall = new RuleCallElements();
		this.pAssignment = new AssignmentElements();
		this.pAssignableTerminal = new AssignableTerminalElements();
		this.pParenthesizedAssignableElement = new ParenthesizedAssignableElementElements();
		this.pAssignableAlternatives = new AssignableAlternativesElements();
		this.pCrossReference = new CrossReferenceElements();
		this.pCrossReferenceableTerminal = new CrossReferenceableTerminalElements();
		this.pParenthesizedElement = new ParenthesizedElementElements();
		this.pTerminalRule = new TerminalRuleElements();
		this.pTerminalAlternatives = new TerminalAlternativesElements();
		this.pTerminalGroup = new TerminalGroupElements();
		this.pTerminalToken = new TerminalTokenElements();
		this.pTerminalTokenElement = new TerminalTokenElementElements();
		this.pParenthesizedTerminalElement = new ParenthesizedTerminalElementElements();
		this.pAbstractNegatedToken = new AbstractNegatedTokenElements();
		this.pNegatedToken = new NegatedTokenElements();
		this.pUntilToken = new UntilTokenElements();
		this.pWildcard = new WildcardElements();
		this.pCharacterRange = new CharacterRangeElements();
		this.pEnumRule = new EnumRuleElements();
		this.pEnumLiterals = new EnumLiteralsElements();
		this.pEnumLiteralDeclaration = new EnumLiteralDeclarationElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.INT");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.STRING");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.XtextTerminalsTestLanguage".equals(grammar.getName())) {
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
	

	
	//Grammar:
	//    'grammar' name=GrammarID ('with' usedGrammars+=[Grammar|GrammarID] (',' usedGrammars+=[Grammar|GrammarID])*)?
	//    (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?
	//    metamodelDeclarations+=AbstractMetamodelDeclaration*
	//    (rules+=AbstractRule)+
	//;
	public GrammarElements getGrammarAccess() {
		return pGrammar;
	}
	
	public ParserRule getGrammarRule() {
		return getGrammarAccess().getRule();
	}
	
	//GrammarID returns ecore::EString:
	//  ID ('.' ID)*;
	public GrammarIDElements getGrammarIDAccess() {
		return pGrammarID;
	}
	
	public ParserRule getGrammarIDRule() {
		return getGrammarIDAccess().getRule();
	}
	
	//AbstractRule : ParserRule | TerminalRule | EnumRule;
	public AbstractRuleElements getAbstractRuleAccess() {
		return pAbstractRule;
	}
	
	public ParserRule getAbstractRuleRule() {
		return getAbstractRuleAccess().getRule();
	}
	
	//AbstractMetamodelDeclaration :
	//    GeneratedMetamodel | ReferencedMetamodel;
	public AbstractMetamodelDeclarationElements getAbstractMetamodelDeclarationAccess() {
		return pAbstractMetamodelDeclaration;
	}
	
	public ParserRule getAbstractMetamodelDeclarationRule() {
		return getAbstractMetamodelDeclarationAccess().getRule();
	}
	
	//// constraint: typeSelect(GeneratedMetamodel).size() == typeSelect(GeneratedMetamodel).alias.size()
	//// generated metamodels have to have different aliases
	//GeneratedMetamodel :
	//    'generate' name=ID ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
	public GeneratedMetamodelElements getGeneratedMetamodelAccess() {
		return pGeneratedMetamodel;
	}
	
	public ParserRule getGeneratedMetamodelRule() {
		return getGeneratedMetamodelAccess().getRule();
	}
	
	//// referenced metamodels may share aliases with other referenced metamodels
	//// and with generated metamodels
	//ReferencedMetamodel :
	//    'import' ePackage=[ecore::EPackage|STRING] ('as' alias=ID)?;
	public ReferencedMetamodelElements getReferencedMetamodelAccess() {
		return pReferencedMetamodel;
	}
	
	public ParserRule getReferencedMetamodelRule() {
		return getReferencedMetamodelAccess().getRule();
	}
	
	//ParserRule :
	//    name=ID ('returns' type=TypeRef)? (definesHiddenTokens?='hidden' '(' (hiddenTokens+=[AbstractRule] (',' hiddenTokens+=[AbstractRule])*)? ')')?':'
	//        alternatives=Alternatives
	//    ';'
	//;
	public ParserRuleElements getParserRuleAccess() {
		return pParserRule;
	}
	
	public ParserRule getParserRuleRule() {
		return getParserRuleAccess().getRule();
	}
	
	//TypeRef :
	//    (metamodel=[AbstractMetamodelDeclaration] '::')? classifier=[ecore::EClassifier]
	//;
	public TypeRefElements getTypeRefAccess() {
		return pTypeRef;
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}
	
	//Alternatives returns AbstractElement:
	//    Group ({Alternatives.groups+=current} ('|' groups+=Group)+)?
	//;
	public AlternativesElements getAlternativesAccess() {
		return pAlternatives;
	}
	
	public ParserRule getAlternativesRule() {
		return getAlternativesAccess().getRule();
	}
	
	//Group returns AbstractElement:
	//    AbstractToken ({Group.tokens+=current} (tokens+=AbstractToken)+)?
	//;
	public GroupElements getGroupAccess() {
		return pGroup;
	}
	
	public ParserRule getGroupRule() {
		return getGroupAccess().getRule();
	}
	
	//AbstractToken returns AbstractElement:
	//    AbstractTokenWithCardinality |
	//    Action
	//;
	public AbstractTokenElements getAbstractTokenAccess() {
		return pAbstractToken;
	}
	
	public ParserRule getAbstractTokenRule() {
		return getAbstractTokenAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride] */
	//AbstractTokenWithCardinality returns AbstractElement:
	//    (Assignment |
	//     AbstractTerminal) (cardinality=('?'|'*'|'+'))?
	//;
	public AbstractTokenWithCardinalityElements getAbstractTokenWithCardinalityAccess() {
		return pAbstractTokenWithCardinality;
	}
	
	public ParserRule getAbstractTokenWithCardinalityRule() {
		return getAbstractTokenWithCardinalityAccess().getRule();
	}
	
	//Action returns Action:
	//    '{' type=TypeRef ('.' feature=ID operator=('='|'+=') 'current')? '}'
	//;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//AbstractTerminal returns AbstractElement:
	//   Keyword | RuleCall | ParenthesizedElement
	//;
	public AbstractTerminalElements getAbstractTerminalAccess() {
		return pAbstractTerminal;
	}
	
	public ParserRule getAbstractTerminalRule() {
		return getAbstractTerminalAccess().getRule();
	}
	
	//Keyword :
	//   value=STRING
	//;
	public KeywordElements getKeywordAccess() {
		return pKeyword;
	}
	
	public ParserRule getKeywordRule() {
		return getKeywordAccess().getRule();
	}
	
	//RuleCall :
	//   rule=[AbstractRule]
	//;
	public RuleCallElements getRuleCallAccess() {
		return pRuleCall;
	}
	
	public ParserRule getRuleCallRule() {
		return getRuleCallAccess().getRule();
	}
	
	//Assignment returns Assignment:
	//   feature=ID operator=('+='|'='|'?=') ^terminal=AssignableTerminal
	//;
	public AssignmentElements getAssignmentAccess() {
		return pAssignment;
	}
	
	public ParserRule getAssignmentRule() {
		return getAssignmentAccess().getRule();
	}
	
	//AssignableTerminal returns AbstractElement:
	//   Keyword | RuleCall | ParenthesizedAssignableElement | CrossReference
	//;
	public AssignableTerminalElements getAssignableTerminalAccess() {
		return pAssignableTerminal;
	}
	
	public ParserRule getAssignableTerminalRule() {
		return getAssignableTerminalAccess().getRule();
	}
	
	//ParenthesizedAssignableElement returns AbstractElement:
	//   '(' AssignableAlternatives ')'
	//;
	public ParenthesizedAssignableElementElements getParenthesizedAssignableElementAccess() {
		return pParenthesizedAssignableElement;
	}
	
	public ParserRule getParenthesizedAssignableElementRule() {
		return getParenthesizedAssignableElementAccess().getRule();
	}
	
	//AssignableAlternatives returns AbstractElement:
	//    AssignableTerminal ({Alternatives.groups+=current} ('|' groups+=AssignableTerminal)+)?
	//;
	public AssignableAlternativesElements getAssignableAlternativesAccess() {
		return pAssignableAlternatives;
	}
	
	public ParserRule getAssignableAlternativesRule() {
		return getAssignableAlternativesAccess().getRule();
	}
	
	//CrossReference :
	//    '[' type=TypeRef ('|' ^terminal=CrossReferenceableTerminal )? ']'
	//;
	public CrossReferenceElements getCrossReferenceAccess() {
		return pCrossReference;
	}
	
	public ParserRule getCrossReferenceRule() {
		return getCrossReferenceAccess().getRule();
	}
	
	//CrossReferenceableTerminal returns AbstractElement:
	//   Keyword | RuleCall
	//;
	public CrossReferenceableTerminalElements getCrossReferenceableTerminalAccess() {
		return pCrossReferenceableTerminal;
	}
	
	public ParserRule getCrossReferenceableTerminalRule() {
		return getCrossReferenceableTerminalAccess().getRule();
	}
	
	//ParenthesizedElement returns AbstractElement:
	//   '(' Alternatives ')'
	//;
	public ParenthesizedElementElements getParenthesizedElementAccess() {
		return pParenthesizedElement;
	}
	
	public ParserRule getParenthesizedElementRule() {
		return getParenthesizedElementAccess().getRule();
	}
	
	//TerminalRule :
	//    'terminal' name=ID ('returns' type=TypeRef)? ':'
	//        alternatives=TerminalAlternatives
	//    ';'
	//;
	public TerminalRuleElements getTerminalRuleAccess() {
		return pTerminalRule;
	}
	
	public ParserRule getTerminalRuleRule() {
		return getTerminalRuleAccess().getRule();
	}
	
	//TerminalAlternatives returns AbstractElement:
	//    TerminalGroup ({Alternatives.groups+=current} ('|' groups+=TerminalGroup)+)?
	//;
	public TerminalAlternativesElements getTerminalAlternativesAccess() {
		return pTerminalAlternatives;
	}
	
	public ParserRule getTerminalAlternativesRule() {
		return getTerminalAlternativesAccess().getRule();
	}
	
	//TerminalGroup returns AbstractElement:
	//    TerminalToken ({Group.tokens+=current} (tokens+=TerminalToken)+)?
	//;
	public TerminalGroupElements getTerminalGroupAccess() {
		return pTerminalGroup;
	}
	
	public ParserRule getTerminalGroupRule() {
		return getTerminalGroupAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride] */
	//TerminalToken returns AbstractElement:
	//    TerminalTokenElement (cardinality=('?'|'*'|'+'))?
	//;
	public TerminalTokenElements getTerminalTokenAccess() {
		return pTerminalToken;
	}
	
	public ParserRule getTerminalTokenRule() {
		return getTerminalTokenAccess().getRule();
	}
	
	//TerminalTokenElement returns AbstractElement:
	//   CharacterRange | RuleCall | ParenthesizedTerminalElement | AbstractNegatedToken | Wildcard
	//;
	public TerminalTokenElementElements getTerminalTokenElementAccess() {
		return pTerminalTokenElement;
	}
	
	public ParserRule getTerminalTokenElementRule() {
		return getTerminalTokenElementAccess().getRule();
	}
	
	//ParenthesizedTerminalElement returns AbstractElement:
	//   '(' TerminalAlternatives ')'
	//;
	public ParenthesizedTerminalElementElements getParenthesizedTerminalElementAccess() {
		return pParenthesizedTerminalElement;
	}
	
	public ParserRule getParenthesizedTerminalElementRule() {
		return getParenthesizedTerminalElementAccess().getRule();
	}
	
	//AbstractNegatedToken:
	//   NegatedToken | UntilToken
	//;
	public AbstractNegatedTokenElements getAbstractNegatedTokenAccess() {
		return pAbstractNegatedToken;
	}
	
	public ParserRule getAbstractNegatedTokenRule() {
		return getAbstractNegatedTokenAccess().getRule();
	}
	
	//NegatedToken:
	//    '!' ^terminal=TerminalTokenElement
	//;
	public NegatedTokenElements getNegatedTokenAccess() {
		return pNegatedToken;
	}
	
	public ParserRule getNegatedTokenRule() {
		return getNegatedTokenAccess().getRule();
	}
	
	//UntilToken:
	//    '->' ^terminal=TerminalTokenElement
	//;
	public UntilTokenElements getUntilTokenAccess() {
		return pUntilToken;
	}
	
	public ParserRule getUntilTokenRule() {
		return getUntilTokenAccess().getRule();
	}
	
	//Wildcard:
	//    {Wildcard} '.'
	//;
	public WildcardElements getWildcardAccess() {
		return pWildcard;
	}
	
	public ParserRule getWildcardRule() {
		return getWildcardAccess().getRule();
	}
	
	//CharacterRange returns AbstractElement:
	//    Keyword ( {CharacterRange.left=current} '..' right=Keyword)?
	//;
	public CharacterRangeElements getCharacterRangeAccess() {
		return pCharacterRange;
	}
	
	public ParserRule getCharacterRangeRule() {
		return getCharacterRangeAccess().getRule();
	}
	
	//EnumRule:
	//    'enum' name=ID ('returns' type=TypeRef)? ':'
	//        alternatives=EnumLiterals
	//    ';'
	//;
	public EnumRuleElements getEnumRuleAccess() {
		return pEnumRule;
	}
	
	public ParserRule getEnumRuleRule() {
		return getEnumRuleAccess().getRule();
	}
	
	//EnumLiterals returns AbstractElement:
	//    EnumLiteralDeclaration ({Alternatives.groups+=current} ('|' groups+=EnumLiteralDeclaration)+)?
	//;
	public EnumLiteralsElements getEnumLiteralsAccess() {
		return pEnumLiterals;
	}
	
	public ParserRule getEnumLiteralsRule() {
		return getEnumLiteralsAccess().getRule();
	}
	
	//EnumLiteralDeclaration:
	//    enumLiteral=[ecore::EEnumLiteral] ('=' literal=Keyword)?
	//;
	public EnumLiteralDeclarationElements getEnumLiteralDeclarationAccess() {
		return pEnumLiteralDeclaration;
	}
	
	public ParserRule getEnumLiteralDeclarationRule() {
		return getEnumLiteralDeclarationAccess().getRule();
	}
	
	//terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal INT 		: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal STRING    :
	//            '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	//            "'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal ML_COMMENT	: '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT 	: '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS			: (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
