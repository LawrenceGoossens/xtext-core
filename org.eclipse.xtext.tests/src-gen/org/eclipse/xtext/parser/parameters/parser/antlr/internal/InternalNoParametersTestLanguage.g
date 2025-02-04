/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalNoParametersTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.parameters.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.parameters.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.parameters.services.NoParametersTestLanguageGrammarAccess;

}

@parser::members {

 	private NoParametersTestLanguageGrammarAccess grammarAccess;

    public InternalNoParametersTestLanguageParser(TokenStream input, NoParametersTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ParserRuleParameters";
   	}

   	@Override
   	protected NoParametersTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleParserRuleParameters
entryRuleParserRuleParameters returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParserRuleParametersRule()); }
	iv_ruleParserRuleParameters=ruleParserRuleParameters
	{ $current=$iv_ruleParserRuleParameters.current; }
	EOF;

// Rule ParserRuleParameters
ruleParserRuleParameters returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParserRuleParametersAccess().getParserRuleParametersAction_0(),
					$current);
			}
		)
		(
			(
				otherlv_1='#1'
				{
					newLeafNode(otherlv_1, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneKeyword_1_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario1_TrueParserRuleCall_1_0_1_0());
						}
						lv_scenario_2_0=ruleScenario1_True
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_2_0,
								"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario1_True");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_3='#2'
				{
					newLeafNode(otherlv_3, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitTwoKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario1_FalseParserRuleCall_1_1_1_0());
						}
						lv_scenario_4_0=ruleScenario1_False
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_4_0,
								"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario1_False");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_5='#3'
				{
					newLeafNode(otherlv_5, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitThreeKeyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_TrueParserRuleCall_1_2_1_0());
						}
						lv_scenario_6_0=ruleScenario2_True
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_6_0,
								"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_True");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_7='#4'
				{
					newLeafNode(otherlv_7, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitFourKeyword_1_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_FalseParserRuleCall_1_3_1_0());
						}
						lv_scenario_8_0=ruleScenario2_False
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_8_0,
								"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_False");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				((
					'#5'
					(
						(
							ruleScenario2_True
						)
					)
				)
				)=>
				(
					otherlv_9='#5'
					{
						newLeafNode(otherlv_9, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitFiveKeyword_1_4_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_TrueParserRuleCall_1_4_0_1_0());
							}
							lv_scenario_10_0=ruleScenario2_True
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_10_0,
									"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_True");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			    |
			(
				((
					'#6'
					(
						(
							ruleScenario2_False
						)
					)
				)
				)=>
				(
					otherlv_11='#6'
					{
						newLeafNode(otherlv_11, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitSixKeyword_1_5_0_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_FalseParserRuleCall_1_5_0_1_0());
							}
							lv_scenario_12_0=ruleScenario2_False
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_12_0,
									"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_False");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
			    |
			(
				otherlv_13='#7'
				{
					newLeafNode(otherlv_13, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitSevenKeyword_1_6_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario3_TrueParserRuleCall_1_6_1_0());
						}
						lv_scenario_14_0=ruleScenario3_True
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_14_0,
								"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario3_True");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_15='#8'
				{
					newLeafNode(otherlv_15, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitEightKeyword_1_7_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario3_FalseParserRuleCall_1_7_1_0());
						}
						lv_scenario_16_0=ruleScenario3_False
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
							}
							set(
								$current,
								"scenario",
								lv_scenario_16_0,
								"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario3_False");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_17='#9'
				{
					newLeafNode(otherlv_17, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitNineKeyword_1_8_0());
				}
				(
					(
						((
							ruleIdOrKeyword_True
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario4_TrueParserRuleCall_1_8_1_0_0());
							}
							lv_scenario_18_0=ruleScenario4_True
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_18_0,
									"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario4_True");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_TrueParserRuleCall_1_8_1_1_0_0());
								}
								lv_scenario_19_0=ruleScenario2_True
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_19_0,
										"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_True");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_20='keyword'
							{
								newLeafNode(otherlv_20, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_8_1_1_1());
							}
						)?
					)
				)
			)
			    |
			(
				otherlv_21='#10'
				{
					newLeafNode(otherlv_21, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitZeroKeyword_1_9_0());
				}
				(
					(
						((
							ruleIdOrKeyword_True
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario4_TrueParserRuleCall_1_9_1_0_0());
							}
							lv_scenario_22_0=ruleScenario4_True
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_22_0,
									"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario4_True");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_FalseParserRuleCall_1_9_1_1_0_0());
								}
								lv_scenario_23_0=ruleScenario2_False
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_23_0,
										"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_False");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_24='keyword'
							{
								newLeafNode(otherlv_24, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_9_1_1_1());
							}
						)?
					)
				)
			)
			    |
			(
				otherlv_25='#11'
				{
					newLeafNode(otherlv_25, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitOneKeyword_1_10_0());
				}
				(
					(
						((
							ruleIdOrKeyword_False
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario4_FalseParserRuleCall_1_10_1_0_0());
							}
							lv_scenario_26_0=ruleScenario4_False
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_26_0,
									"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario4_False");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_TrueParserRuleCall_1_10_1_1_0_0());
								}
								lv_scenario_27_0=ruleScenario2_True
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_27_0,
										"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_True");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_28='keyword'
							{
								newLeafNode(otherlv_28, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_10_1_1_1());
							}
						)?
					)
				)
			)
			    |
			(
				otherlv_29='#12'
				{
					newLeafNode(otherlv_29, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitTwoKeyword_1_11_0());
				}
				(
					(
						((
							ruleIdOrKeyword_False
						)
						)=>
						(
							{
								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario4_FalseParserRuleCall_1_11_1_0_0());
							}
							lv_scenario_30_0=ruleScenario4_False
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
								}
								set(
									$current,
									"scenario",
									lv_scenario_30_0,
									"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario4_False");
								afterParserOrEnumRuleCall();
							}
						)
					)
					    |
					(
						(
							(
								{
									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario2_FalseParserRuleCall_1_11_1_1_0_0());
								}
								lv_scenario_31_0=ruleScenario2_False
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
									}
									set(
										$current,
										"scenario",
										lv_scenario_31_0,
										"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_False");
									afterParserOrEnumRuleCall();
								}
							)
						)
						(
							otherlv_32='keyword'
							{
								newLeafNode(otherlv_32, grammarAccess.getParserRuleParametersAccess().getKeywordKeyword_1_11_1_1_1());
							}
						)?
					)
				)
			)
		)
	)
;

// Entry rule entryRuleScenario1_True
entryRuleScenario1_True returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario1_TrueRule()); }
	iv_ruleScenario1_True=ruleScenario1_True
	{ $current=$iv_ruleScenario1_True.current; }
	EOF;

// Rule Scenario1_True
ruleScenario1_True returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_first_0_0=RULE_ID
			{
				newLeafNode(lv_first_0_0, grammarAccess.getScenario1_TrueAccess().getFirstIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getScenario1_TrueRule());
				}
				setWithLastConsumed(
					$current,
					"first",
					lv_first_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleScenario1_False
entryRuleScenario1_False returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario1_FalseRule()); }
	iv_ruleScenario1_False=ruleScenario1_False
	{ $current=$iv_ruleScenario1_False.current; }
	EOF;

// Rule Scenario1_False
ruleScenario1_False returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_second_0_0=RULE_ID
			{
				newLeafNode(lv_second_0_0, grammarAccess.getScenario1_FalseAccess().getSecondIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getScenario1_FalseRule());
				}
				setWithLastConsumed(
					$current,
					"second",
					lv_second_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleScenario2_True
entryRuleScenario2_True returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario2_TrueRule()); }
	iv_ruleScenario2_True=ruleScenario2_True
	{ $current=$iv_ruleScenario2_True.current; }
	EOF;

// Rule Scenario2_True
ruleScenario2_True returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getScenario2_TrueAccess().getFirstIdOrKeyword_TrueParserRuleCall_0());
			}
			lv_first_0_0=ruleIdOrKeyword_True
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getScenario2_TrueRule());
				}
				set(
					$current,
					"first",
					lv_first_0_0,
					"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_True");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleScenario2_False
entryRuleScenario2_False returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario2_FalseRule()); }
	iv_ruleScenario2_False=ruleScenario2_False
	{ $current=$iv_ruleScenario2_False.current; }
	EOF;

// Rule Scenario2_False
ruleScenario2_False returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getScenario2_FalseAccess().getFirstIdOrKeyword_FalseParserRuleCall_0());
			}
			lv_first_0_0=ruleIdOrKeyword_False
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getScenario2_FalseRule());
				}
				set(
					$current,
					"first",
					lv_first_0_0,
					"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_False");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleScenario3_True
entryRuleScenario3_True returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario3_TrueRule()); }
	iv_ruleScenario3_True=ruleScenario3_True
	{ $current=$iv_ruleScenario3_True.current; }
	EOF;

// Rule Scenario3_True
ruleScenario3_True returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				ruleIdOrKeyword_True
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario3_TrueAccess().getFirstIdOrKeyword_TrueParserRuleCall_0_0());
				}
				lv_first_0_0=ruleIdOrKeyword_True
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario3_TrueRule());
					}
					set(
						$current,
						"first",
						lv_first_0_0,
						"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_True");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_second_1_0='keyword'
				{
					newLeafNode(lv_second_1_0, grammarAccess.getScenario3_TrueAccess().getSecondKeywordKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenario3_TrueRule());
					}
					setWithLastConsumed($current, "second", lv_second_1_0, "keyword");
				}
			)
		)
	)
;

// Entry rule entryRuleScenario3_False
entryRuleScenario3_False returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario3_FalseRule()); }
	iv_ruleScenario3_False=ruleScenario3_False
	{ $current=$iv_ruleScenario3_False.current; }
	EOF;

// Rule Scenario3_False
ruleScenario3_False returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				ruleIdOrKeyword_False
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario3_FalseAccess().getFirstIdOrKeyword_FalseParserRuleCall_0_0());
				}
				lv_first_0_0=ruleIdOrKeyword_False
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario3_FalseRule());
					}
					set(
						$current,
						"first",
						lv_first_0_0,
						"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_False");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				lv_second_1_0='keyword'
				{
					newLeafNode(lv_second_1_0, grammarAccess.getScenario3_FalseAccess().getSecondKeywordKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getScenario3_FalseRule());
					}
					setWithLastConsumed($current, "second", lv_second_1_0, "keyword");
				}
			)
		)
	)
;

// Entry rule entryRuleScenario4_True
entryRuleScenario4_True returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario4_TrueRule()); }
	iv_ruleScenario4_True=ruleScenario4_True
	{ $current=$iv_ruleScenario4_True.current; }
	EOF;

// Rule Scenario4_True
ruleScenario4_True returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				ruleIdOrKeyword_True
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario4_TrueAccess().getSecondIdOrKeyword_TrueParserRuleCall_0_0());
				}
				lv_second_0_0=ruleIdOrKeyword_True
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario4_TrueRule());
					}
					set(
						$current,
						"second",
						lv_second_0_0,
						"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_True");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='keyword'
		{
			newLeafNode(otherlv_1, grammarAccess.getScenario4_TrueAccess().getKeywordKeyword_1());
		}
	)
;

// Entry rule entryRuleScenario4_False
entryRuleScenario4_False returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenario4_FalseRule()); }
	iv_ruleScenario4_False=ruleScenario4_False
	{ $current=$iv_ruleScenario4_False.current; }
	EOF;

// Rule Scenario4_False
ruleScenario4_False returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				ruleIdOrKeyword_False
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getScenario4_FalseAccess().getSecondIdOrKeyword_FalseParserRuleCall_0_0());
				}
				lv_second_0_0=ruleIdOrKeyword_False
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenario4_FalseRule());
					}
					set(
						$current,
						"second",
						lv_second_0_0,
						"org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_False");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='keyword'
		{
			newLeafNode(otherlv_1, grammarAccess.getScenario4_FalseAccess().getKeywordKeyword_1());
		}
	)
;

// Entry rule entryRuleIdOrKeyword_True
entryRuleIdOrKeyword_True returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIdOrKeyword_TrueRule()); }
	iv_ruleIdOrKeyword_True=ruleIdOrKeyword_True
	{ $current=$iv_ruleIdOrKeyword_True.current.getText(); }
	EOF;

// Rule IdOrKeyword_True
ruleIdOrKeyword_True returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='keyword'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIdOrKeyword_TrueAccess().getKeywordKeyword_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getIdOrKeyword_TrueAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleIdOrKeyword_False
entryRuleIdOrKeyword_False returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIdOrKeyword_FalseRule()); }
	iv_ruleIdOrKeyword_False=ruleIdOrKeyword_False
	{ $current=$iv_ruleIdOrKeyword_False.current.getText(); }
	EOF;

// Rule IdOrKeyword_False
ruleIdOrKeyword_False returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getIdOrKeyword_FalseAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleIdOrKeyword
entryRuleIdOrKeyword returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIdOrKeywordRule()); }
	iv_ruleIdOrKeyword=ruleIdOrKeyword
	{ $current=$iv_ruleIdOrKeyword.current.getText(); }
	EOF;

// Rule IdOrKeyword
ruleIdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
	}
;


// Rule IdOrKeyword
norm1_IdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='keyword'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getIdOrKeywordAccess().getKeywordKeyword_0_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
