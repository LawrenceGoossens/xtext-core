/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.reconstr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class SerializationBug269362TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.SerializationBug269362TestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cFooKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cFooAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cFooIDTerminalRuleCall_0_1_0 = (RuleCall)cFooAssignment_0_1.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cBarKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cBarAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final RuleCall cBarIDTerminalRuleCall_0_2_1_0 = (RuleCall)cBarAssignment_0_2_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cBarKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cBarAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cBarIDTerminalRuleCall_1_1_0 = (RuleCall)cBarAssignment_1_1.eContents().get(0);
		
		//Model:
		//  'foo' foo=ID ('bar' bar=ID)? | 'bar' bar=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'foo' foo=ID ('bar' bar=ID)? | 'bar' bar=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'foo' foo=ID ('bar' bar=ID)?
		public Group getGroup_0() { return cGroup_0; }
		
		//'foo'
		public Keyword getFooKeyword_0_0() { return cFooKeyword_0_0; }
		
		//foo=ID
		public Assignment getFooAssignment_0_1() { return cFooAssignment_0_1; }
		
		//ID
		public RuleCall getFooIDTerminalRuleCall_0_1_0() { return cFooIDTerminalRuleCall_0_1_0; }
		
		//('bar' bar=ID)?
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//'bar'
		public Keyword getBarKeyword_0_2_0() { return cBarKeyword_0_2_0; }
		
		//bar=ID
		public Assignment getBarAssignment_0_2_1() { return cBarAssignment_0_2_1; }
		
		//ID
		public RuleCall getBarIDTerminalRuleCall_0_2_1_0() { return cBarIDTerminalRuleCall_0_2_1_0; }
		
		//'bar' bar=ID
		public Group getGroup_1() { return cGroup_1; }
		
		//'bar'
		public Keyword getBarKeyword_1_0() { return cBarKeyword_1_0; }
		
		//bar=ID
		public Assignment getBarAssignment_1_1() { return cBarAssignment_1_1; }
		
		//ID
		public RuleCall getBarIDTerminalRuleCall_1_1_0() { return cBarIDTerminalRuleCall_1_1_0; }
	}
	
	
	private final ModelElements pModel;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SerializationBug269362TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.reconstr.SerializationBug269362TestLanguage".equals(grammar.getName())) {
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

	
	//Model:
	//  'foo' foo=ID ('bar' bar=ID)? | 'bar' bar=ID
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
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
