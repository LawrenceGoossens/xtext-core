/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.grammarinheritance.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class InheritanceTest3LanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.InheritanceTest3Language.Model");
		private final RuleCall cModelParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//@Override
		//Model:
		//    super::Model
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//super::Model
		public RuleCall getModelParserRuleCall() { return cModelParserRuleCall; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.InheritanceTest3Language.Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cElementParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cElementAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cElementKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cNameAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_1_2_0 = (RuleCall)cNameAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cElementAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cElementKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cNameAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_2_0 = (RuleCall)cNameAssignment_2_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cElementAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cElementKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cNameAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_2_0 = (RuleCall)cNameAssignment_3_2.eContents().get(0);
		
		//@Override
		//Element :
		//      super::Element
		//    | {Element} "element" name=super::ID
		//    | {Element} "element" name=Terminals::ID
		//    | {Element} "element" name=super::STRING
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  super::Element
		//| {Element} "element" name=super::ID
		//| {Element} "element" name=Terminals::ID
		//| {Element} "element" name=super::STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//super::Element
		public RuleCall getElementParserRuleCall_0() { return cElementParserRuleCall_0; }
		
		//{Element} "element" name=super::ID
		public Group getGroup_1() { return cGroup_1; }
		
		//{Element}
		public Action getElementAction_1_0() { return cElementAction_1_0; }
		
		//"element"
		public Keyword getElementKeyword_1_1() { return cElementKeyword_1_1; }
		
		//name=super::ID
		public Assignment getNameAssignment_1_2() { return cNameAssignment_1_2; }
		
		//super::ID
		public RuleCall getNameIDTerminalRuleCall_1_2_0() { return cNameIDTerminalRuleCall_1_2_0; }
		
		//{Element} "element" name=Terminals::ID
		public Group getGroup_2() { return cGroup_2; }
		
		//{Element}
		public Action getElementAction_2_0() { return cElementAction_2_0; }
		
		//"element"
		public Keyword getElementKeyword_2_1() { return cElementKeyword_2_1; }
		
		//name=Terminals::ID
		public Assignment getNameAssignment_2_2() { return cNameAssignment_2_2; }
		
		//Terminals::ID
		public RuleCall getNameIDTerminalRuleCall_2_2_0() { return cNameIDTerminalRuleCall_2_2_0; }
		
		//{Element} "element" name=super::STRING
		public Group getGroup_3() { return cGroup_3; }
		
		//{Element}
		public Action getElementAction_3_0() { return cElementAction_3_0; }
		
		//"element"
		public Keyword getElementKeyword_3_1() { return cElementKeyword_3_1; }
		
		//name=super::STRING
		public Assignment getNameAssignment_3_2() { return cNameAssignment_3_2; }
		
		//super::STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_2_0() { return cNameSTRINGTerminalRuleCall_3_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final TerminalRule tID;
	
	private final Grammar grammar;
	
	private final InheritanceTestLanguageGrammarAccess gaInheritanceTestLanguage;
	
	private final BaseInheritanceTestLanguageGrammarAccess gaBaseInheritanceTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public InheritanceTest3LanguageGrammarAccess(GrammarProvider grammarProvider,
			InheritanceTestLanguageGrammarAccess gaInheritanceTestLanguage,
			BaseInheritanceTestLanguageGrammarAccess gaBaseInheritanceTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaInheritanceTestLanguage = gaInheritanceTestLanguage;
		this.gaBaseInheritanceTestLanguage = gaBaseInheritanceTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.InheritanceTest3Language.ID");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.grammarinheritance.InheritanceTest3Language".equals(grammar.getName())) {
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
	
	
	public InheritanceTestLanguageGrammarAccess getInheritanceTestLanguageGrammarAccess() {
		return gaInheritanceTestLanguage;
	}
	
	public BaseInheritanceTestLanguageGrammarAccess getBaseInheritanceTestLanguageGrammarAccess() {
		return gaBaseInheritanceTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//@Override
	//Model:
	//    super::Model
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//@Override
	//Element :
	//      super::Element
	//    | {Element} "element" name=super::ID
	//    | {Element} "element" name=Terminals::ID
	//    | {Element} "element" name=super::STRING
	//;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//@Override
	//terminal ID: 'id';
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//@Override
	//Model :
	//    "model" name=ID "{"
	//        elements+=Element*
	//    "}"
	//;
	public InheritanceTestLanguageGrammarAccess.ModelElements getInheritanceTestLanguageModelAccess() {
		return gaInheritanceTestLanguage.getModelAccess();
	}
	
	public ParserRule getInheritanceTestLanguageModelRule() {
		return getInheritanceTestLanguageModelAccess().getRule();
	}
	
	//Element :
	//    "element" name=ID
	//;
	public InheritanceTestLanguageGrammarAccess.ElementElements getInheritanceTestLanguageElementAccess() {
		return gaInheritanceTestLanguage.getElementAccess();
	}
	
	public ParserRule getInheritanceTestLanguageElementRule() {
		return getInheritanceTestLanguageElementAccess().getRule();
	}
	
	//@Override
	//terminal ID: ('a'..'z')+;
	public TerminalRule getInheritanceTestLanguageIDRule() {
		return gaInheritanceTestLanguage.getIDRule();
	}
	
	//FQN: ID ('.' ID)*;
	public BaseInheritanceTestLanguageGrammarAccess.FQNElements getFQNAccess() {
		return gaBaseInheritanceTestLanguage.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getTerminalsIDRule() {
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
