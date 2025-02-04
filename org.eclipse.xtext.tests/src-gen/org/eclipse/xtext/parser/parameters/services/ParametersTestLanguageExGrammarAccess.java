/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.parameters.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ParametersTestLanguageExGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ParserRuleParametersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.ParametersTestLanguageEx.ParserRuleParameters");
		private final RuleCall cParserRuleParametersParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//@Override
		//ParserRuleParameters returns ParserRuleParameters:
		//    super::ParserRuleParameters
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//super::ParserRuleParameters
		public RuleCall getParserRuleParametersParserRuleCall() { return cParserRuleParametersParserRuleCall; }
	}
	public class Scenario1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.ParametersTestLanguageEx.Scenario1");
		private final RuleCall cScenario1ParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//@Override
		//Scenario1<Param> returns Scenario:
		//    super::Scenario1<Param>
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//super::Scenario1<Param>
		public RuleCall getScenario1ParserRuleCall() { return cScenario1ParserRuleCall; }
	}
	
	
	private final ParserRuleParametersElements pParserRuleParameters;
	private final Scenario1Elements pScenario1;
	
	private final Grammar grammar;
	
	private final ParametersTestLanguageGrammarAccess gaParametersTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ParametersTestLanguageExGrammarAccess(GrammarProvider grammarProvider,
			ParametersTestLanguageGrammarAccess gaParametersTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaParametersTestLanguage = gaParametersTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pParserRuleParameters = new ParserRuleParametersElements();
		this.pScenario1 = new Scenario1Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.parameters.ParametersTestLanguageEx".equals(grammar.getName())) {
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
	
	
	public ParametersTestLanguageGrammarAccess getParametersTestLanguageGrammarAccess() {
		return gaParametersTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//@Override
	//ParserRuleParameters returns ParserRuleParameters:
	//    super::ParserRuleParameters
	//;
	public ParserRuleParametersElements getParserRuleParametersAccess() {
		return pParserRuleParameters;
	}
	
	public ParserRule getParserRuleParametersRule() {
		return getParserRuleParametersAccess().getRule();
	}
	
	//@Override
	//Scenario1<Param> returns Scenario:
	//    super::Scenario1<Param>
	//;
	public Scenario1Elements getScenario1Access() {
		return pScenario1;
	}
	
	public ParserRule getScenario1Rule() {
		return getScenario1Access().getRule();
	}
	
	//ParserRuleParameters: {ParserRuleParameters}
	//  ( '#1' scenario=Scenario1<true>
	//  |    '#2' scenario=Scenario1<Param=false>
	//  | '#3' scenario=Scenario2<true>
	//  | '#4' scenario=Scenario2<false>
	//  | =>('#5' scenario=Scenario2<true>)
	//  | =>('#6' scenario=Scenario2<false>)
	//  | '#7' scenario=Scenario3<true>
	//  | '#8' scenario=Scenario3<false>
	//  | '#9' (scenario=Scenario4<true> | scenario=Scenario2<true> 'keyword'?)
	//  | '#10' (scenario=Scenario4<true> | scenario=Scenario2<false> 'keyword'?)
	//  | '#11' (scenario=Scenario4<false> | scenario=Scenario2<true> 'keyword'?)
	//  | '#12' (scenario=Scenario4<false> | scenario=Scenario2<false> 'keyword'?)
	//  )
	//;
	public ParametersTestLanguageGrammarAccess.ParserRuleParametersElements getParametersTestLanguageParserRuleParametersAccess() {
		return gaParametersTestLanguage.getParserRuleParametersAccess();
	}
	
	public ParserRule getParametersTestLanguageParserRuleParametersRule() {
		return getParametersTestLanguageParserRuleParametersAccess().getRule();
	}
	
	//Scenario1<Param> returns Scenario:
	//    <Param> first=ID
	//  | <!Param> second=ID
	//;
	public ParametersTestLanguageGrammarAccess.Scenario1Elements getParametersTestLanguageScenario1Access() {
		return gaParametersTestLanguage.getScenario1Access();
	}
	
	public ParserRule getParametersTestLanguageScenario1Rule() {
		return getParametersTestLanguageScenario1Access().getRule();
	}
	
	//Scenario2<AllowKeyword> returns Scenario:
	//    first=IdOrKeyword<AllowKeyword>
	//;
	public ParametersTestLanguageGrammarAccess.Scenario2Elements getScenario2Access() {
		return gaParametersTestLanguage.getScenario2Access();
	}
	
	public ParserRule getScenario2Rule() {
		return getScenario2Access().getRule();
	}
	
	//Scenario3<AllowKeyword> returns Scenario:
	//    =>first=IdOrKeyword<AllowKeyword>
	//    | second='keyword'
	//;
	public ParametersTestLanguageGrammarAccess.Scenario3Elements getScenario3Access() {
		return gaParametersTestLanguage.getScenario3Access();
	}
	
	public ParserRule getScenario3Rule() {
		return getScenario3Access().getRule();
	}
	
	//Scenario4<AllowKeyword> returns Scenario:
	//    =>second=IdOrKeyword<AllowKeyword> 'keyword'
	//;
	public ParametersTestLanguageGrammarAccess.Scenario4Elements getScenario4Access() {
		return gaParametersTestLanguage.getScenario4Access();
	}
	
	public ParserRule getScenario4Rule() {
		return getScenario4Access().getRule();
	}
	
	//IdOrKeyword<Keyword>:
	//    <Keyword> 'keyword'
	//    | ID
	//;
	public ParametersTestLanguageGrammarAccess.IdOrKeywordElements getIdOrKeywordAccess() {
		return gaParametersTestLanguage.getIdOrKeywordAccess();
	}
	
	public ParserRule getIdOrKeywordRule() {
		return getIdOrKeywordAccess().getRule();
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
