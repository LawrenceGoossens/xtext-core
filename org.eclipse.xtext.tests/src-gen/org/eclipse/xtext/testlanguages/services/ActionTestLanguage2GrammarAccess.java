/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class ActionTestLanguage2GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ORingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ActionTestLanguage2.ORing");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cValueParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cORingDisjunctsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cDisjunctsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cDisjunctsValueParserRuleCall_1_2_0 = (RuleCall)cDisjunctsAssignment_1_2.eContents().get(0);
		
		//// see https://www.eclipse.org/forums/index.php/mv/msg/798729/1407452/#msg_1407452
		//ORing :
		//    Value ({ORing.disjuncts+=current} '|' disjuncts+=Value)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Value ({ORing.disjuncts+=current} '|' disjuncts+=Value)*
		public Group getGroup() { return cGroup; }
		
		//Value
		public RuleCall getValueParserRuleCall_0() { return cValueParserRuleCall_0; }
		
		//({ORing.disjuncts+=current} '|' disjuncts+=Value)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ORing.disjuncts+=current}
		public Action getORingDisjunctsAction_1_0() { return cORingDisjunctsAction_1_0; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1_1() { return cVerticalLineKeyword_1_1; }
		
		//disjuncts+=Value
		public Assignment getDisjunctsAssignment_1_2() { return cDisjunctsAssignment_1_2; }
		
		//Value
		public RuleCall getDisjunctsValueParserRuleCall_1_2_0() { return cDisjunctsValueParserRuleCall_1_2_0; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ActionTestLanguage2.Value");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValueAKeyword_0 = (Keyword)cValueAssignment.eContents().get(0);
		
		//Value :
		//    value='a';
		@Override public ParserRule getRule() { return rule; }
		
		//value='a'
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//'a'
		public Keyword getValueAKeyword_0() { return cValueAKeyword_0; }
	}
	
	
	private final ORingElements pORing;
	private final ValueElements pValue;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ActionTestLanguage2GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pORing = new ORingElements();
		this.pValue = new ValueElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.ActionTestLanguage2".equals(grammar.getName())) {
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

	
	//// see https://www.eclipse.org/forums/index.php/mv/msg/798729/1407452/#msg_1407452
	//ORing :
	//    Value ({ORing.disjuncts+=current} '|' disjuncts+=Value)*;
	public ORingElements getORingAccess() {
		return pORing;
	}
	
	public ParserRule getORingRule() {
		return getORingAccess().getRule();
	}
	
	//Value :
	//    value='a';
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
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
