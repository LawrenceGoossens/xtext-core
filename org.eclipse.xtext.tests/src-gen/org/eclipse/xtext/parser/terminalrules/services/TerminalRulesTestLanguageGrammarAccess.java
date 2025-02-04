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
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TerminalRulesTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cIdValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cIdValueIDTerminalRuleCall_0_0 = (RuleCall)cIdValueAssignment_0.eContents().get(0);
		private final Assignment cIntValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cIntValueINTTerminalRuleCall_1_0 = (RuleCall)cIntValueAssignment_1.eContents().get(0);
		private final Assignment cStringValueAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cStringValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cStringValueAssignment_2.eContents().get(0);
		private final Assignment cRichStringValueAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cRichStringValueRICH_STRINGTerminalRuleCall_3_0 = (RuleCall)cRichStringValueAssignment_3.eContents().get(0);
		private final Assignment cMlCommentValueAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cMlCommentValueML_COMMENTTerminalRuleCall_4_0 = (RuleCall)cMlCommentValueAssignment_4.eContents().get(0);
		private final Assignment cSlCommentValueAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cSlCommentValueSL_COMMENTTerminalRuleCall_5_0 = (RuleCall)cSlCommentValueAssignment_5.eContents().get(0);
		private final Assignment cWsValueAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cWsValueWSTerminalRuleCall_6_0 = (RuleCall)cWsValueAssignment_6.eContents().get(0);
		private final Assignment cAnyValueAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cAnyValueANY_OTHERTerminalRuleCall_7_0 = (RuleCall)cAnyValueAssignment_7.eContents().get(0);
		
		//Model:
		//  idValue=ID |
		//  intValue=INT |
		//  stringValue=STRING |
		//  richStringValue=RICH_STRING |
		//  mlCommentValue=ML_COMMENT |
		//  slCommentValue=SL_COMMENT |
		//  wsValue=WS  |
		//  anyValue=ANY_OTHER
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//idValue=ID |
		//intValue=INT |
		//stringValue=STRING |
		//richStringValue=RICH_STRING |
		//mlCommentValue=ML_COMMENT |
		//slCommentValue=SL_COMMENT |
		//wsValue=WS  |
		//anyValue=ANY_OTHER
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//idValue=ID
		public Assignment getIdValueAssignment_0() { return cIdValueAssignment_0; }
		
		//ID
		public RuleCall getIdValueIDTerminalRuleCall_0_0() { return cIdValueIDTerminalRuleCall_0_0; }
		
		//intValue=INT
		public Assignment getIntValueAssignment_1() { return cIntValueAssignment_1; }
		
		//INT
		public RuleCall getIntValueINTTerminalRuleCall_1_0() { return cIntValueINTTerminalRuleCall_1_0; }
		
		//stringValue=STRING
		public Assignment getStringValueAssignment_2() { return cStringValueAssignment_2; }
		
		//STRING
		public RuleCall getStringValueSTRINGTerminalRuleCall_2_0() { return cStringValueSTRINGTerminalRuleCall_2_0; }
		
		//richStringValue=RICH_STRING
		public Assignment getRichStringValueAssignment_3() { return cRichStringValueAssignment_3; }
		
		//RICH_STRING
		public RuleCall getRichStringValueRICH_STRINGTerminalRuleCall_3_0() { return cRichStringValueRICH_STRINGTerminalRuleCall_3_0; }
		
		//mlCommentValue=ML_COMMENT
		public Assignment getMlCommentValueAssignment_4() { return cMlCommentValueAssignment_4; }
		
		//ML_COMMENT
		public RuleCall getMlCommentValueML_COMMENTTerminalRuleCall_4_0() { return cMlCommentValueML_COMMENTTerminalRuleCall_4_0; }
		
		//slCommentValue=SL_COMMENT
		public Assignment getSlCommentValueAssignment_5() { return cSlCommentValueAssignment_5; }
		
		//SL_COMMENT
		public RuleCall getSlCommentValueSL_COMMENTTerminalRuleCall_5_0() { return cSlCommentValueSL_COMMENTTerminalRuleCall_5_0; }
		
		//wsValue=WS
		public Assignment getWsValueAssignment_6() { return cWsValueAssignment_6; }
		
		//WS
		public RuleCall getWsValueWSTerminalRuleCall_6_0() { return cWsValueWSTerminalRuleCall_6_0; }
		
		//anyValue=ANY_OTHER
		public Assignment getAnyValueAssignment_7() { return cAnyValueAssignment_7; }
		
		//ANY_OTHER
		public RuleCall getAnyValueANY_OTHERTerminalRuleCall_7_0() { return cAnyValueANY_OTHERTerminalRuleCall_7_0; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tID;
	private final TerminalRule tINT;
	private final TerminalRule tSTRING;
	private final TerminalRule tRICH_STRING;
	private final TerminalRule tIN_RICH_STRING;
	private final TerminalRule tESCAPED_CHAR;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public TerminalRulesTestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.ID");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.INT");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.STRING");
		this.tRICH_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.RICH_STRING");
		this.tIN_RICH_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.IN_RICH_STRING");
		this.tESCAPED_CHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.ESCAPED_CHAR");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.TerminalRulesTestLanguage".equals(grammar.getName())) {
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
	

	
	//Model:
	//  idValue=ID |
	//  intValue=INT |
	//  stringValue=STRING |
	//  richStringValue=RICH_STRING |
	//  mlCommentValue=ML_COMMENT |
	//  slCommentValue=SL_COMMENT |
	//  wsValue=WS  |
	//  anyValue=ANY_OTHER
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
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
	//            '"' ( ESCAPED_CHAR | !('\\'|'"') )* '"' |
	//            "'" ( ESCAPED_CHAR | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal RICH_STRING : "'''" IN_RICH_STRING* ("'''"| ("'" "'"?)? EOF);
	public TerminalRule getRICH_STRINGRule() {
		return tRICH_STRING;
	}
	
	//terminal fragment IN_RICH_STRING :
	//      "''" !('�'|"'")
	//    | "'" !('�'|"'")
	//    | !('�'|"'");
	public TerminalRule getIN_RICH_STRINGRule() {
		return tIN_RICH_STRING;
	}
	
	//terminal fragment ESCAPED_CHAR: '\\' ('b'|'t'|'n'|'f'|'r'|'"'|"'"|'\\');
	public TerminalRule getESCAPED_CHARRule() {
		return tESCAPED_CHAR;
	}
	
	//terminal ML_COMMENT	: '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
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
