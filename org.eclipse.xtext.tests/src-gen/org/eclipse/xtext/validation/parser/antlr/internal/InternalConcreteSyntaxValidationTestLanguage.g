/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalConcreteSyntaxValidationTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.validation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.validation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.validation.services.ConcreteSyntaxValidationTestLanguageGrammarAccess;

}

@parser::members {

 	private ConcreteSyntaxValidationTestLanguageGrammarAccess grammarAccess;

    public InternalConcreteSyntaxValidationTestLanguageParser(TokenStream input, ConcreteSyntaxValidationTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ConcreteSyntaxValidationTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX1SimpleGroupParserRuleCall_0_0());
				}
				lv_x1_0_0=ruleSimpleGroup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x1",
						lv_x1_0_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.SimpleGroup");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX2SimpleAlternativeParserRuleCall_1_0());
				}
				lv_x2_1_0=ruleSimpleAlternative
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x2",
						lv_x2_1_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.SimpleAlternative");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX3SimpleMultiplicitiesParserRuleCall_2_0());
				}
				lv_x3_2_0=ruleSimpleMultiplicities
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x3",
						lv_x3_2_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.SimpleMultiplicities");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX4GroupMultiplicitiesParserRuleCall_3_0());
				}
				lv_x4_3_0=ruleGroupMultiplicities
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x4",
						lv_x4_3_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.GroupMultiplicities");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX5AlternativeMultiplicitiesParserRuleCall_4_0());
				}
				lv_x5_4_0=ruleAlternativeMultiplicities
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x5",
						lv_x5_4_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AlternativeMultiplicities");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX6AssignedActionParserRuleCall_5_0());
				}
				lv_x6_5_0=ruleAssignedAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x6",
						lv_x6_5_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AssignedAction");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX7AssignedActionSecondParserRuleCall_6_0());
				}
				lv_x7_6_0=ruleAssignedActionSecond
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x7",
						lv_x7_6_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AssignedActionSecond");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX8UnassignedAction1ParserRuleCall_7_0());
				}
				lv_x8_7_0=ruleUnassignedAction1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x8",
						lv_x8_7_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedAction1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX9UnassignedAction2ParserRuleCall_8_0());
				}
				lv_x9_8_0=ruleUnassignedAction2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x9",
						lv_x9_8_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedAction2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX10UnassignedAction3ParserRuleCall_9_0());
				}
				lv_x10_9_0=ruleUnassignedAction3
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x10",
						lv_x10_9_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedAction3");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX11UnassignedRuleCall1ParserRuleCall_10_0());
				}
				lv_x11_10_0=ruleUnassignedRuleCall1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x11",
						lv_x11_10_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedRuleCall1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX12UnassignedRuleCall2ParserRuleCall_11_0());
				}
				lv_x12_11_0=ruleUnassignedRuleCall2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x12",
						lv_x12_11_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.UnassignedRuleCall2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX13Combination1ParserRuleCall_12_0());
				}
				lv_x13_12_0=ruleCombination1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x13",
						lv_x13_12_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX14Combination2ParserRuleCall_13_0());
				}
				lv_x14_13_0=ruleCombination2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x14",
						lv_x14_13_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX15Combination3ParserRuleCall_14_0());
				}
				lv_x15_14_0=ruleCombination3
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x15",
						lv_x15_14_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination3");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX16Combination4ParserRuleCall_15_0());
				}
				lv_x16_15_0=ruleCombination4
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x16",
						lv_x16_15_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Combination4");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX17List1ParserRuleCall_16_0());
				}
				lv_x17_16_0=ruleList1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x17",
						lv_x17_16_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX18List2ParserRuleCall_17_0());
				}
				lv_x18_17_0=ruleList2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x18",
						lv_x18_17_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX19List3ParserRuleCall_18_0());
				}
				lv_x19_18_0=ruleList3
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x19",
						lv_x19_18_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List3");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX20List4ParserRuleCall_19_0());
				}
				lv_x20_19_0=ruleList4
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x20",
						lv_x20_19_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List4");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX21List5ParserRuleCall_20_0());
				}
				lv_x21_20_0=ruleList5
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x21",
						lv_x21_20_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.List5");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX22AltList1ParserRuleCall_21_0());
				}
				lv_x22_21_0=ruleAltList1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x22",
						lv_x22_21_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AltList1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX23AltList2ParserRuleCall_22_0());
				}
				lv_x23_22_0=ruleAltList2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x23",
						lv_x23_22_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.AltList2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX24TransientObjectParserRuleCall_23_0());
				}
				lv_x24_23_0=ruleTransientObject
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x24",
						lv_x24_23_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientObject");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX25TransientSerializeables1ParserRuleCall_24_0());
				}
				lv_x25_24_0=ruleTransientSerializeables1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x25",
						lv_x25_24_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientSerializeables1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX26StaticSimplificationParserRuleCall_25_0());
				}
				lv_x26_25_0=ruleStaticSimplification
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x26",
						lv_x26_25_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.StaticSimplification");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX27TwoVersionParserRuleCall_26_0());
				}
				lv_x27_26_0=ruleTwoVersion
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x27",
						lv_x27_26_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TwoVersion");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX28Heuristic1ParserRuleCall_27_0());
				}
				lv_x28_27_0=ruleHeuristic1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x28",
						lv_x28_27_0,
						"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.Heuristic1");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSimpleGroup
entryRuleSimpleGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleGroupRule()); }
	iv_ruleSimpleGroup=ruleSimpleGroup
	{ $current=$iv_ruleSimpleGroup.current; }
	EOF;

// Rule SimpleGroup
ruleSimpleGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#1'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleGroupAccess().getNumberSignDigitOneKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getSimpleGroupAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleGroupRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_val2_2_0=RULE_ID
				{
					newLeafNode(lv_val2_2_0, grammarAccess.getSimpleGroupAccess().getVal2IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleGroupRule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSimpleAlternative
entryRuleSimpleAlternative returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleAlternativeRule()); }
	iv_ruleSimpleAlternative=ruleSimpleAlternative
	{ $current=$iv_ruleSimpleAlternative.current; }
	EOF;

// Rule SimpleAlternative
ruleSimpleAlternative returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#2'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleAlternativeAccess().getNumberSignDigitTwoKeyword_0());
		}
		(
			(
				otherlv_1='kw1'
				{
					newLeafNode(otherlv_1, grammarAccess.getSimpleAlternativeAccess().getKw1Keyword_1_0_0());
				}
				(
					(
						lv_val1_2_0=RULE_ID
						{
							newLeafNode(lv_val1_2_0, grammarAccess.getSimpleAlternativeAccess().getVal1IDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSimpleAlternativeRule());
							}
							setWithLastConsumed(
								$current,
								"val1",
								lv_val1_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_3='kw2'
				{
					newLeafNode(otherlv_3, grammarAccess.getSimpleAlternativeAccess().getKw2Keyword_1_1_0());
				}
				(
					(
						lv_val2_4_0=RULE_ID
						{
							newLeafNode(lv_val2_4_0, grammarAccess.getSimpleAlternativeAccess().getVal2IDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSimpleAlternativeRule());
							}
							setWithLastConsumed(
								$current,
								"val2",
								lv_val2_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleSimpleMultiplicities
entryRuleSimpleMultiplicities returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleMultiplicitiesRule()); }
	iv_ruleSimpleMultiplicities=ruleSimpleMultiplicities
	{ $current=$iv_ruleSimpleMultiplicities.current; }
	EOF;

// Rule SimpleMultiplicities
ruleSimpleMultiplicities returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#3'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleMultiplicitiesAccess().getNumberSignDigitThreeKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='kw1'
		{
			newLeafNode(otherlv_2, grammarAccess.getSimpleMultiplicitiesAccess().getKw1Keyword_2());
		}
		(
			(
				lv_val2_3_0=RULE_ID
				{
					newLeafNode(lv_val2_3_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal2IDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		otherlv_4='kw2'
		{
			newLeafNode(otherlv_4, grammarAccess.getSimpleMultiplicitiesAccess().getKw2Keyword_4());
		}
		(
			(
				lv_val3_5_0=RULE_ID
				{
					newLeafNode(lv_val3_5_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal3IDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
					}
					addWithLastConsumed(
						$current,
						"val3",
						lv_val3_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)+
		otherlv_6='kw3'
		{
			newLeafNode(otherlv_6, grammarAccess.getSimpleMultiplicitiesAccess().getKw3Keyword_6());
		}
		(
			(
				lv_val4_7_0=RULE_ID
				{
					newLeafNode(lv_val4_7_0, grammarAccess.getSimpleMultiplicitiesAccess().getVal4IDTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleMultiplicitiesRule());
					}
					addWithLastConsumed(
						$current,
						"val4",
						lv_val4_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)*
	)
;

// Entry rule entryRuleGroupMultiplicities
entryRuleGroupMultiplicities returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupMultiplicitiesRule()); }
	iv_ruleGroupMultiplicities=ruleGroupMultiplicities
	{ $current=$iv_ruleGroupMultiplicities.current; }
	EOF;

// Rule GroupMultiplicities
ruleGroupMultiplicities returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#4'
		{
			newLeafNode(otherlv_0, grammarAccess.getGroupMultiplicitiesAccess().getNumberSignDigitFourKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getGroupMultiplicitiesAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='kw1'
		{
			newLeafNode(otherlv_2, grammarAccess.getGroupMultiplicitiesAccess().getKw1Keyword_2());
		}
		(
			(
				(
					lv_val2_3_0=RULE_ID
					{
						newLeafNode(lv_val2_3_0, grammarAccess.getGroupMultiplicitiesAccess().getVal2IDTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_val3_4_0=RULE_ID
					{
						newLeafNode(lv_val3_4_0, grammarAccess.getGroupMultiplicitiesAccess().getVal3IDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
						}
						setWithLastConsumed(
							$current,
							"val3",
							lv_val3_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		otherlv_5='kw2'
		{
			newLeafNode(otherlv_5, grammarAccess.getGroupMultiplicitiesAccess().getKw2Keyword_4());
		}
		(
			(
				(
					lv_val4_6_0=RULE_ID
					{
						newLeafNode(lv_val4_6_0, grammarAccess.getGroupMultiplicitiesAccess().getVal4IDTerminalRuleCall_5_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
						}
						addWithLastConsumed(
							$current,
							"val4",
							lv_val4_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_val5_7_0=RULE_ID
					{
						newLeafNode(lv_val5_7_0, grammarAccess.getGroupMultiplicitiesAccess().getVal5IDTerminalRuleCall_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
						}
						addWithLastConsumed(
							$current,
							"val5",
							lv_val5_7_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)+
		otherlv_8='kw3'
		{
			newLeafNode(otherlv_8, grammarAccess.getGroupMultiplicitiesAccess().getKw3Keyword_6());
		}
		(
			(
				(
					lv_val6_9_0=RULE_ID
					{
						newLeafNode(lv_val6_9_0, grammarAccess.getGroupMultiplicitiesAccess().getVal6IDTerminalRuleCall_7_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
						}
						addWithLastConsumed(
							$current,
							"val6",
							lv_val6_9_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_val7_10_0=RULE_ID
					{
						newLeafNode(lv_val7_10_0, grammarAccess.getGroupMultiplicitiesAccess().getVal7IDTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGroupMultiplicitiesRule());
						}
						addWithLastConsumed(
							$current,
							"val7",
							lv_val7_10_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAlternativeMultiplicities
entryRuleAlternativeMultiplicities returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlternativeMultiplicitiesRule()); }
	iv_ruleAlternativeMultiplicities=ruleAlternativeMultiplicities
	{ $current=$iv_ruleAlternativeMultiplicities.current; }
	EOF;

// Rule AlternativeMultiplicities
ruleAlternativeMultiplicities returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#5'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlternativeMultiplicitiesAccess().getNumberSignDigitFiveKeyword_0());
		}
		(
			(
				(
					lv_val2_1_0=RULE_ID
					{
						newLeafNode(lv_val2_1_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal2IDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				otherlv_2='kw1'
				{
					newLeafNode(otherlv_2, grammarAccess.getAlternativeMultiplicitiesAccess().getKw1Keyword_1_1_0());
				}
				(
					(
						lv_val3_3_0=RULE_ID
						{
							newLeafNode(lv_val3_3_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal3IDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
							}
							setWithLastConsumed(
								$current,
								"val3",
								lv_val3_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)?
		otherlv_4='kw2'
		{
			newLeafNode(otherlv_4, grammarAccess.getAlternativeMultiplicitiesAccess().getKw2Keyword_2());
		}
		(
			(
				(
					lv_val4_5_0=RULE_ID
					{
						newLeafNode(lv_val4_5_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal4IDTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
						}
						addWithLastConsumed(
							$current,
							"val4",
							lv_val4_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				otherlv_6='kw3'
				{
					newLeafNode(otherlv_6, grammarAccess.getAlternativeMultiplicitiesAccess().getKw3Keyword_3_1_0());
				}
				(
					(
						lv_val5_7_0=RULE_ID
						{
							newLeafNode(lv_val5_7_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal5IDTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
							}
							addWithLastConsumed(
								$current,
								"val5",
								lv_val5_7_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)+
		otherlv_8='kw4'
		{
			newLeafNode(otherlv_8, grammarAccess.getAlternativeMultiplicitiesAccess().getKw4Keyword_4());
		}
		(
			(
				(
					lv_val6_9_0=RULE_ID
					{
						newLeafNode(lv_val6_9_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal6IDTerminalRuleCall_5_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
						}
						addWithLastConsumed(
							$current,
							"val6",
							lv_val6_9_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				otherlv_10='kw5'
				{
					newLeafNode(otherlv_10, grammarAccess.getAlternativeMultiplicitiesAccess().getKw5Keyword_5_1_0());
				}
				(
					(
						lv_val7_11_0=RULE_ID
						{
							newLeafNode(lv_val7_11_0, grammarAccess.getAlternativeMultiplicitiesAccess().getVal7IDTerminalRuleCall_5_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAlternativeMultiplicitiesRule());
							}
							addWithLastConsumed(
								$current,
								"val7",
								lv_val7_11_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleAssignedAction
entryRuleAssignedAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignedActionRule()); }
	iv_ruleAssignedAction=ruleAssignedAction
	{ $current=$iv_ruleAssignedAction.current; }
	EOF;

// Rule AssignedAction
ruleAssignedAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#6'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssignedActionAccess().getNumberSignDigitSixKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getAssignedActionAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignedActionRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAssignedActionAccess().getAssignedActionChildAction_2_0(),
						$current);
				}
			)
			(
				(
					lv_val1_3_0=RULE_ID
					{
						newLeafNode(lv_val1_3_0, grammarAccess.getAssignedActionAccess().getVal1IDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignedActionRule());
						}
						setWithLastConsumed(
							$current,
							"val1",
							lv_val1_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleAssignedActionSecond
entryRuleAssignedActionSecond returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignedActionSecondRule()); }
	iv_ruleAssignedActionSecond=ruleAssignedActionSecond
	{ $current=$iv_ruleAssignedActionSecond.current; }
	EOF;

// Rule AssignedActionSecond
ruleAssignedActionSecond returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#7'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssignedActionSecondAccess().getNumberSignDigitSevenKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getAssignedActionSecondAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignedActionSecondRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='kw1'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssignedActionSecondAccess().getKw1Keyword_2());
		}
		(
			(
				lv_val2_3_0=RULE_ID
				{
					newLeafNode(lv_val2_3_0, grammarAccess.getAssignedActionSecondAccess().getVal2IDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignedActionSecondRule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleUnassignedAction1
entryRuleUnassignedAction1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedAction1Rule()); }
	iv_ruleUnassignedAction1=ruleUnassignedAction1
	{ $current=$iv_ruleUnassignedAction1.current; }
	EOF;

// Rule UnassignedAction1
ruleUnassignedAction1 returns [EObject current=null]
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
					grammarAccess.getUnassignedAction1Access().getUnassignedAction1Action_0(),
					$current);
			}
		)
		otherlv_1='#8'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnassignedAction1Access().getNumberSignDigitEightKeyword_1());
		}
		(
			(
				lv_val1_2_0=RULE_ID
				{
					newLeafNode(lv_val1_2_0, grammarAccess.getUnassignedAction1Access().getVal1IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedAction1Rule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_val2_3_0=RULE_ID
				{
					newLeafNode(lv_val2_3_0, grammarAccess.getUnassignedAction1Access().getVal2IDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedAction1Rule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleUnassignedAction2
entryRuleUnassignedAction2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedAction2Rule()); }
	iv_ruleUnassignedAction2=ruleUnassignedAction2
	{ $current=$iv_ruleUnassignedAction2.current; }
	EOF;

// Rule UnassignedAction2
ruleUnassignedAction2 returns [EObject current=null]
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
					grammarAccess.getUnassignedAction2Access().getUnassignedAction2SubAction_0(),
					$current);
			}
		)
		otherlv_1='#9'
		{
			newLeafNode(otherlv_1, grammarAccess.getUnassignedAction2Access().getNumberSignDigitNineKeyword_1());
		}
		(
			(
				lv_val1_2_0=RULE_ID
				{
					newLeafNode(lv_val1_2_0, grammarAccess.getUnassignedAction2Access().getVal1IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedAction2Rule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_val2_3_0=RULE_ID
				{
					newLeafNode(lv_val2_3_0, grammarAccess.getUnassignedAction2Access().getVal2IDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedAction2Rule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleUnassignedAction3
entryRuleUnassignedAction3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedAction3Rule()); }
	iv_ruleUnassignedAction3=ruleUnassignedAction3
	{ $current=$iv_ruleUnassignedAction3.current; }
	EOF;

// Rule UnassignedAction3
ruleUnassignedAction3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#10'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnassignedAction3Access().getNumberSignDigitOneDigitZeroKeyword_0());
		}
		(
			(
				otherlv_1='kw1'
				{
					newLeafNode(otherlv_1, grammarAccess.getUnassignedAction3Access().getKw1Keyword_1_0_0());
				}
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getUnassignedAction3Access().getUnassignedAction2Sub1Action_1_0_1(),
							$current);
					}
				)
			)
			    |
			(
				otherlv_3='kw2'
				{
					newLeafNode(otherlv_3, grammarAccess.getUnassignedAction3Access().getKw2Keyword_1_1_0());
				}
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getUnassignedAction3Access().getUnassignedAction2Sub2Action_1_1_1(),
							$current);
					}
				)
			)
		)
		(
			(
				lv_val1_5_0=RULE_ID
				{
					newLeafNode(lv_val1_5_0, grammarAccess.getUnassignedAction3Access().getVal1IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedAction3Rule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_val2_6_0=RULE_ID
				{
					newLeafNode(lv_val2_6_0, grammarAccess.getUnassignedAction3Access().getVal2IDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedAction3Rule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleUnassignedRuleCall1
entryRuleUnassignedRuleCall1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedRuleCall1Rule()); }
	iv_ruleUnassignedRuleCall1=ruleUnassignedRuleCall1
	{ $current=$iv_ruleUnassignedRuleCall1.current; }
	EOF;

// Rule UnassignedRuleCall1
ruleUnassignedRuleCall1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#11'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnassignedRuleCall1Access().getNumberSignDigitOneDigitOneKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getUnassignedRuleCall1Access().getUnassignedRuleCall1SubParserRuleCall_1());
		}
		this_UnassignedRuleCall1Sub_1=ruleUnassignedRuleCall1Sub
		{
			$current = $this_UnassignedRuleCall1Sub_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_val2_2_0=RULE_ID
				{
					newLeafNode(lv_val2_2_0, grammarAccess.getUnassignedRuleCall1Access().getVal2IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedRuleCall1Rule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleUnassignedRuleCall1Sub
entryRuleUnassignedRuleCall1Sub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedRuleCall1SubRule()); }
	iv_ruleUnassignedRuleCall1Sub=ruleUnassignedRuleCall1Sub
	{ $current=$iv_ruleUnassignedRuleCall1Sub.current; }
	EOF;

// Rule UnassignedRuleCall1Sub
ruleUnassignedRuleCall1Sub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val1_0_0=RULE_ID
			{
				newLeafNode(lv_val1_0_0, grammarAccess.getUnassignedRuleCall1SubAccess().getVal1IDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getUnassignedRuleCall1SubRule());
				}
				setWithLastConsumed(
					$current,
					"val1",
					lv_val1_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleUnassignedRuleCall2
entryRuleUnassignedRuleCall2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedRuleCall2Rule()); }
	iv_ruleUnassignedRuleCall2=ruleUnassignedRuleCall2
	{ $current=$iv_ruleUnassignedRuleCall2.current; }
	EOF;

// Rule UnassignedRuleCall2
ruleUnassignedRuleCall2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#12'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnassignedRuleCall2Access().getNumberSignDigitOneDigitTwoKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getUnassignedRuleCall2Access().getUnassignedRuleCall2SubParserRuleCall_1());
		}
		this_UnassignedRuleCall2Sub_1=ruleUnassignedRuleCall2Sub
		{
			$current = $this_UnassignedRuleCall2Sub_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_val2_2_0=RULE_ID
				{
					newLeafNode(lv_val2_2_0, grammarAccess.getUnassignedRuleCall2Access().getVal2IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedRuleCall2Rule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleUnassignedRuleCall2Sub
entryRuleUnassignedRuleCall2Sub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedRuleCall2SubRule()); }
	iv_ruleUnassignedRuleCall2Sub=ruleUnassignedRuleCall2Sub
	{ $current=$iv_ruleUnassignedRuleCall2Sub.current; }
	EOF;

// Rule UnassignedRuleCall2Sub
ruleUnassignedRuleCall2Sub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			$current = forceCreateModelElement(
				grammarAccess.getUnassignedRuleCall2SubAccess().getUnassignedRuleCall2SubActionAction(),
				$current);
		}
	)
;

// Entry rule entryRuleCombination1
entryRuleCombination1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCombination1Rule()); }
	iv_ruleCombination1=ruleCombination1
	{ $current=$iv_ruleCombination1.current; }
	EOF;

// Rule Combination1
ruleCombination1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#13'
		{
			newLeafNode(otherlv_0, grammarAccess.getCombination1Access().getNumberSignDigitOneDigitThreeKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getCombination1Access().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCombination1Rule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='kw1'
			{
				newLeafNode(otherlv_2, grammarAccess.getCombination1Access().getKw1Keyword_2_0());
			}
			(
				(
					lv_val2_3_0=RULE_ID
					{
						newLeafNode(lv_val2_3_0, grammarAccess.getCombination1Access().getVal2IDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCombination1Rule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					otherlv_4='kw2'
					{
						newLeafNode(otherlv_4, grammarAccess.getCombination1Access().getKw2Keyword_2_2_0_0());
					}
					(
						(
							lv_val3_5_0=RULE_ID
							{
								newLeafNode(lv_val3_5_0, grammarAccess.getCombination1Access().getVal3IDTerminalRuleCall_2_2_0_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getCombination1Rule());
								}
								setWithLastConsumed(
									$current,
									"val3",
									lv_val3_5_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
				)
				    |
				(
					(
						lv_val4_6_0=RULE_ID
						{
							newLeafNode(lv_val4_6_0, grammarAccess.getCombination1Access().getVal4IDTerminalRuleCall_2_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCombination1Rule());
							}
							setWithLastConsumed(
								$current,
								"val4",
								lv_val4_6_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleCombination2
entryRuleCombination2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCombination2Rule()); }
	iv_ruleCombination2=ruleCombination2
	{ $current=$iv_ruleCombination2.current; }
	EOF;

// Rule Combination2
ruleCombination2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#14'
		{
			newLeafNode(otherlv_0, grammarAccess.getCombination2Access().getNumberSignDigitOneDigitFourKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getCombination2Access().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCombination2Rule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				otherlv_2='kw1'
				{
					newLeafNode(otherlv_2, grammarAccess.getCombination2Access().getKw1Keyword_2_0_0());
				}
				(
					(
						lv_val2_3_0=RULE_ID
						{
							newLeafNode(lv_val2_3_0, grammarAccess.getCombination2Access().getVal2IDTerminalRuleCall_2_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCombination2Rule());
							}
							setWithLastConsumed(
								$current,
								"val2",
								lv_val2_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				(
					(
						lv_val3_4_0=RULE_ID
						{
							newLeafNode(lv_val3_4_0, grammarAccess.getCombination2Access().getVal3IDTerminalRuleCall_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCombination2Rule());
							}
							addWithLastConsumed(
								$current,
								"val3",
								lv_val3_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_val4_5_0=RULE_ID
						{
							newLeafNode(lv_val4_5_0, grammarAccess.getCombination2Access().getVal4IDTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCombination2Rule());
							}
							addWithLastConsumed(
								$current,
								"val4",
								lv_val4_5_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)*
		)
	)
;

// Entry rule entryRuleCombination3
entryRuleCombination3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCombination3Rule()); }
	iv_ruleCombination3=ruleCombination3
	{ $current=$iv_ruleCombination3.current; }
	EOF;

// Rule Combination3
ruleCombination3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#15'
		{
			newLeafNode(otherlv_0, grammarAccess.getCombination3Access().getNumberSignDigitOneDigitFiveKeyword_0());
		}
		(
			(
				(
					lv_val1_1_0=RULE_ID
					{
						newLeafNode(lv_val1_1_0, grammarAccess.getCombination3Access().getVal1IDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCombination3Rule());
						}
						setWithLastConsumed(
							$current,
							"val1",
							lv_val1_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					lv_val2_2_0=RULE_INT
					{
						newLeafNode(lv_val2_2_0, grammarAccess.getCombination3Access().getVal2INTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCombination3Rule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			    |
			(
				(
					lv_val3_3_0=RULE_STRING
					{
						newLeafNode(lv_val3_3_0, grammarAccess.getCombination3Access().getVal3STRINGTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCombination3Rule());
						}
						setWithLastConsumed(
							$current,
							"val3",
							lv_val3_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCombination4
entryRuleCombination4 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCombination4Rule()); }
	iv_ruleCombination4=ruleCombination4
	{ $current=$iv_ruleCombination4.current; }
	EOF;

// Rule Combination4
ruleCombination4 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#16'
		{
			newLeafNode(otherlv_0, grammarAccess.getCombination4Access().getNumberSignDigitOneDigitSixKeyword_0());
		}
		(
			otherlv_1='group'
			{
				newLeafNode(otherlv_1, grammarAccess.getCombination4Access().getGroupKeyword_1_0());
			}
			(
				(
					lv_val1_2_0=RULE_ID
					{
						newLeafNode(lv_val1_2_0, grammarAccess.getCombination4Access().getVal1IDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCombination4Rule());
						}
						addWithLastConsumed(
							$current,
							"val1",
							lv_val1_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_val2_3_0=RULE_ID
					{
						newLeafNode(lv_val2_3_0, grammarAccess.getCombination4Access().getVal2IDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCombination4Rule());
						}
						addWithLastConsumed(
							$current,
							"val2",
							lv_val2_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_val3_4_0=RULE_ID
					{
						newLeafNode(lv_val3_4_0, grammarAccess.getCombination4Access().getVal3IDTerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCombination4Rule());
						}
						addWithLastConsumed(
							$current,
							"val3",
							lv_val3_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)+
	)
;

// Entry rule entryRuleList1
entryRuleList1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getList1Rule()); }
	iv_ruleList1=ruleList1
	{ $current=$iv_ruleList1.current; }
	EOF;

// Rule List1
ruleList1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#17'
		{
			newLeafNode(otherlv_0, grammarAccess.getList1Access().getNumberSignDigitOneDigitSevenKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getList1Access().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getList1Rule());
					}
					addWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getList1Access().getCommaKeyword_2_0());
			}
			(
				(
					lv_val1_3_0=RULE_ID
					{
						newLeafNode(lv_val1_3_0, grammarAccess.getList1Access().getVal1IDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getList1Rule());
						}
						addWithLastConsumed(
							$current,
							"val1",
							lv_val1_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleList2
entryRuleList2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getList2Rule()); }
	iv_ruleList2=ruleList2
	{ $current=$iv_ruleList2.current; }
	EOF;

// Rule List2
ruleList2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#18'
		{
			newLeafNode(otherlv_0, grammarAccess.getList2Access().getNumberSignDigitOneDigitEightKeyword_0());
		}
		(
			(
				(
					lv_val1_1_0=RULE_ID
					{
						newLeafNode(lv_val1_1_0, grammarAccess.getList2Access().getVal1IDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getList2Rule());
						}
						addWithLastConsumed(
							$current,
							"val1",
							lv_val1_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getList2Access().getCommaKeyword_1_1_0());
				}
				(
					(
						lv_val1_3_0=RULE_ID
						{
							newLeafNode(lv_val1_3_0, grammarAccess.getList2Access().getVal1IDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getList2Rule());
							}
							addWithLastConsumed(
								$current,
								"val1",
								lv_val1_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleList3
entryRuleList3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getList3Rule()); }
	iv_ruleList3=ruleList3
	{ $current=$iv_ruleList3.current; }
	EOF;

// Rule List3
ruleList3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='#19'
			{
				newLeafNode(otherlv_0, grammarAccess.getList3Access().getNumberSignDigitOneDigitNineKeyword_0_0());
			}
			(
				(
					(
						lv_val1_1_0=RULE_ID
						{
							newLeafNode(lv_val1_1_0, grammarAccess.getList3Access().getVal1IDTerminalRuleCall_0_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getList3Rule());
							}
							addWithLastConsumed(
								$current,
								"val1",
								lv_val1_1_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_2=','
					{
						newLeafNode(otherlv_2, grammarAccess.getList3Access().getCommaKeyword_0_1_1_0());
					}
					(
						(
							lv_val1_3_0=RULE_ID
							{
								newLeafNode(lv_val1_3_0, grammarAccess.getList3Access().getVal1IDTerminalRuleCall_0_1_1_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getList3Rule());
								}
								addWithLastConsumed(
									$current,
									"val1",
									lv_val1_3_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
				)*
			)
		)
		    |
		(
			otherlv_4='kw3'
			{
				newLeafNode(otherlv_4, grammarAccess.getList3Access().getKw3Keyword_1_0());
			}
			(
				(
					lv_val2_5_0=RULE_ID
					{
						newLeafNode(lv_val2_5_0, grammarAccess.getList3Access().getVal2IDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getList3Rule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleList4
entryRuleList4 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getList4Rule()); }
	iv_ruleList4=ruleList4
	{ $current=$iv_ruleList4.current; }
	EOF;

// Rule List4
ruleList4 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#20'
		{
			newLeafNode(otherlv_0, grammarAccess.getList4Access().getNumberSignDigitTwoDigitZeroKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getList4Access().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getList4Rule());
					}
					addWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getList4Access().getCommaKeyword_2_0());
			}
			(
				(
					lv_val1_3_0=RULE_ID
					{
						newLeafNode(lv_val1_3_0, grammarAccess.getList4Access().getVal1IDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getList4Rule());
						}
						addWithLastConsumed(
							$current,
							"val1",
							lv_val1_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		otherlv_4='kw3'
		{
			newLeafNode(otherlv_4, grammarAccess.getList4Access().getKw3Keyword_3());
		}
		(
			(
				lv_val2_5_0=RULE_ID
				{
					newLeafNode(lv_val2_5_0, grammarAccess.getList4Access().getVal2IDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getList4Rule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleList5
entryRuleList5 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getList5Rule()); }
	iv_ruleList5=ruleList5
	{ $current=$iv_ruleList5.current; }
	EOF;

// Rule List5
ruleList5 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#21'
		{
			newLeafNode(otherlv_0, grammarAccess.getList5Access().getNumberSignDigitTwoDigitOneKeyword_0());
		}
		(
			(
				(
					(
						lv_val1_1_0=RULE_ID
						{
							newLeafNode(lv_val1_1_0, grammarAccess.getList5Access().getVal1IDTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getList5Rule());
							}
							addWithLastConsumed(
								$current,
								"val1",
								lv_val1_1_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_2=','
					{
						newLeafNode(otherlv_2, grammarAccess.getList5Access().getCommaKeyword_1_0_1_0());
					}
					(
						(
							lv_val1_3_0=RULE_ID
							{
								newLeafNode(lv_val1_3_0, grammarAccess.getList5Access().getVal1IDTerminalRuleCall_1_0_1_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getList5Rule());
								}
								addWithLastConsumed(
									$current,
									"val1",
									lv_val1_3_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
				)*
				otherlv_4='kw3'
				{
					newLeafNode(otherlv_4, grammarAccess.getList5Access().getKw3Keyword_1_0_2());
				}
				(
					(
						lv_val2_5_0=RULE_ID
						{
							newLeafNode(lv_val2_5_0, grammarAccess.getList5Access().getVal2IDTerminalRuleCall_1_0_3_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getList5Rule());
							}
							setWithLastConsumed(
								$current,
								"val2",
								lv_val2_5_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				(
					lv_val3_6_0=RULE_ID
					{
						newLeafNode(lv_val3_6_0, grammarAccess.getList5Access().getVal3IDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getList5Rule());
						}
						setWithLastConsumed(
							$current,
							"val3",
							lv_val3_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleAltList1
entryRuleAltList1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAltList1Rule()); }
	iv_ruleAltList1=ruleAltList1
	{ $current=$iv_ruleAltList1.current; }
	EOF;

// Rule AltList1
ruleAltList1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#22'
		{
			newLeafNode(otherlv_0, grammarAccess.getAltList1Access().getNumberSignDigitTwoDigitTwoKeyword_0());
		}
		(
			(
				(
					(
						lv_val1_1_0=RULE_ID
						{
							newLeafNode(lv_val1_1_0, grammarAccess.getAltList1Access().getVal1IDTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList1Rule());
							}
							setWithLastConsumed(
								$current,
								"val1",
								lv_val1_1_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_val2_2_0=RULE_ID
						{
							newLeafNode(lv_val2_2_0, grammarAccess.getAltList1Access().getVal2IDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList1Rule());
							}
							setWithLastConsumed(
								$current,
								"val2",
								lv_val2_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_3='kw1'
				{
					newLeafNode(otherlv_3, grammarAccess.getAltList1Access().getKw1Keyword_1_1_0());
				}
				(
					(
						lv_val1_4_0=RULE_ID
						{
							newLeafNode(lv_val1_4_0, grammarAccess.getAltList1Access().getVal1IDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList1Rule());
							}
							setWithLastConsumed(
								$current,
								"val1",
								lv_val1_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_val3_5_0=RULE_ID
						{
							newLeafNode(lv_val3_5_0, grammarAccess.getAltList1Access().getVal3IDTerminalRuleCall_1_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList1Rule());
							}
							setWithLastConsumed(
								$current,
								"val3",
								lv_val3_5_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_6='kw2'
				{
					newLeafNode(otherlv_6, grammarAccess.getAltList1Access().getKw2Keyword_1_2_0());
				}
				(
					(
						lv_val1_7_0=RULE_ID
						{
							newLeafNode(lv_val1_7_0, grammarAccess.getAltList1Access().getVal1IDTerminalRuleCall_1_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList1Rule());
							}
							setWithLastConsumed(
								$current,
								"val1",
								lv_val1_7_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_val4_8_0=RULE_ID
						{
							newLeafNode(lv_val4_8_0, grammarAccess.getAltList1Access().getVal4IDTerminalRuleCall_1_2_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList1Rule());
							}
							setWithLastConsumed(
								$current,
								"val4",
								lv_val4_8_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
		)
	)
;

// Entry rule entryRuleAltList2
entryRuleAltList2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAltList2Rule()); }
	iv_ruleAltList2=ruleAltList2
	{ $current=$iv_ruleAltList2.current; }
	EOF;

// Rule AltList2
ruleAltList2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#23'
		{
			newLeafNode(otherlv_0, grammarAccess.getAltList2Access().getNumberSignDigitTwoDigitThreeKeyword_0());
		}
		(
			(
				(
					(
						lv_val1_1_0=RULE_ID
						{
							newLeafNode(lv_val1_1_0, grammarAccess.getAltList2Access().getVal1IDTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList2Rule());
							}
							addWithLastConsumed(
								$current,
								"val1",
								lv_val1_1_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_val2_2_0=RULE_ID
						{
							newLeafNode(lv_val2_2_0, grammarAccess.getAltList2Access().getVal2IDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList2Rule());
							}
							setWithLastConsumed(
								$current,
								"val2",
								lv_val2_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_3='kw'
				{
					newLeafNode(otherlv_3, grammarAccess.getAltList2Access().getKwKeyword_1_1_0());
				}
				(
					(
						lv_val1_4_0=RULE_ID
						{
							newLeafNode(lv_val1_4_0, grammarAccess.getAltList2Access().getVal1IDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList2Rule());
							}
							addWithLastConsumed(
								$current,
								"val1",
								lv_val1_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					otherlv_5=','
					{
						newLeafNode(otherlv_5, grammarAccess.getAltList2Access().getCommaKeyword_1_1_2_0());
					}
					(
						(
							lv_val1_6_0=RULE_ID
							{
								newLeafNode(lv_val1_6_0, grammarAccess.getAltList2Access().getVal1IDTerminalRuleCall_1_1_2_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getAltList2Rule());
								}
								addWithLastConsumed(
									$current,
									"val1",
									lv_val1_6_0,
									"org.eclipse.xtext.common.Terminals.ID");
							}
						)
					)
				)*
				(
					(
						lv_val3_7_0=RULE_ID
						{
							newLeafNode(lv_val3_7_0, grammarAccess.getAltList2Access().getVal3IDTerminalRuleCall_1_1_3_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAltList2Rule());
							}
							setWithLastConsumed(
								$current,
								"val3",
								lv_val3_7_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleTransientObject
entryRuleTransientObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransientObjectRule()); }
	iv_ruleTransientObject=ruleTransientObject
	{ $current=$iv_ruleTransientObject.current; }
	EOF;

// Rule TransientObject
ruleTransientObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#24'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransientObjectAccess().getNumberSignDigitTwoDigitFourKeyword_0());
		}
		(
			(
				(
					lv_val1_1_0=RULE_ID
					{
						newLeafNode(lv_val1_1_0, grammarAccess.getTransientObjectAccess().getVal1IDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransientObjectRule());
						}
						setWithLastConsumed(
							$current,
							"val1",
							lv_val1_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTransientObjectAccess().getNestedTransientObjectSubParserRuleCall_1_1_0());
					}
					lv_nested_2_0=ruleTransientObjectSub
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransientObjectRule());
						}
						set(
							$current,
							"nested",
							lv_nested_2_0,
							"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientObjectSub");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleTransientObjectSub
entryRuleTransientObjectSub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransientObjectSubRule()); }
	iv_ruleTransientObjectSub=ruleTransientObjectSub
	{ $current=$iv_ruleTransientObjectSub.current; }
	EOF;

// Rule TransientObjectSub
ruleTransientObjectSub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_val2_0_0=RULE_ID
				{
					newLeafNode(lv_val2_0_0, grammarAccess.getTransientObjectSubAccess().getVal2IDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransientObjectSubRule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_val3_1_0=RULE_ID
				{
					newLeafNode(lv_val3_1_0, grammarAccess.getTransientObjectSubAccess().getVal3IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransientObjectSubRule());
					}
					setWithLastConsumed(
						$current,
						"val3",
						lv_val3_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTransientSerializeables1
entryRuleTransientSerializeables1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransientSerializeables1Rule()); }
	iv_ruleTransientSerializeables1=ruleTransientSerializeables1
	{ $current=$iv_ruleTransientSerializeables1.current; }
	EOF;

// Rule TransientSerializeables1
ruleTransientSerializeables1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#25'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransientSerializeables1Access().getNumberSignDigitTwoDigitFiveKeyword_0());
		}
		(
			(
				(
					lv_val1_1_0=RULE_ID
					{
						newLeafNode(lv_val1_1_0, grammarAccess.getTransientSerializeables1Access().getVal1IDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransientSerializeables1Rule());
						}
						setWithLastConsumed(
							$current,
							"val1",
							lv_val1_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTransientSerializeables1Access().getEnum1TransientSerializeables1EnumEnumRuleCall_1_1_0());
					}
					lv_enum1_2_0=ruleTransientSerializeables1Enum
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransientSerializeables1Rule());
						}
						set(
							$current,
							"enum1",
							lv_enum1_2_0,
							"org.eclipse.xtext.validation.ConcreteSyntaxValidationTestLanguage.TransientSerializeables1Enum");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				(
					lv_val2_3_0=RULE_ID
					{
						newLeafNode(lv_val2_3_0, grammarAccess.getTransientSerializeables1Access().getVal2IDTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransientSerializeables1Rule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_int1_4_0=RULE_INT
					{
						newLeafNode(lv_int1_4_0, grammarAccess.getTransientSerializeables1Access().getInt1INTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransientSerializeables1Rule());
						}
						setWithLastConsumed(
							$current,
							"int1",
							lv_int1_4_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleStaticSimplification
entryRuleStaticSimplification returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStaticSimplificationRule()); }
	iv_ruleStaticSimplification=ruleStaticSimplification
	{ $current=$iv_ruleStaticSimplification.current; }
	EOF;

// Rule StaticSimplification
ruleStaticSimplification returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#26'
		{
			newLeafNode(otherlv_0, grammarAccess.getStaticSimplificationAccess().getNumberSignDigitTwoDigitSixKeyword_0());
		}
		(
			otherlv_1='kw1'
			{
				newLeafNode(otherlv_1, grammarAccess.getStaticSimplificationAccess().getKw1Keyword_1_0());
			}
			    |
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getStaticSimplificationAccess().getEmptyAlternativeSubAction_1_1(),
						$current);
				}
			)
			    |
			(
				(
					lv_val1_3_0=RULE_ID
					{
						newLeafNode(lv_val1_3_0, grammarAccess.getStaticSimplificationAccess().getVal1IDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStaticSimplificationRule());
						}
						setWithLastConsumed(
							$current,
							"val1",
							lv_val1_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		(
			otherlv_4='kw2'
			{
				newLeafNode(otherlv_4, grammarAccess.getStaticSimplificationAccess().getKw2Keyword_2_0());
			}
			    |
			(
				(
					lv_val2_5_0=RULE_ID
					{
						newLeafNode(lv_val2_5_0, grammarAccess.getStaticSimplificationAccess().getVal2IDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStaticSimplificationRule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		(
			otherlv_6='kw3'
			{
				newLeafNode(otherlv_6, grammarAccess.getStaticSimplificationAccess().getKw3Keyword_3_0());
			}
			(
				otherlv_7='kw4'
				{
					newLeafNode(otherlv_7, grammarAccess.getStaticSimplificationAccess().getKw4Keyword_3_1_0());
				}
				(
					(
						lv_val3_8_0=RULE_ID
						{
							newLeafNode(lv_val3_8_0, grammarAccess.getStaticSimplificationAccess().getVal3IDTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStaticSimplificationRule());
							}
							setWithLastConsumed(
								$current,
								"val3",
								lv_val3_8_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)+
			)?
		)
	)
;

// Entry rule entryRuleTwoVersion
entryRuleTwoVersion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTwoVersionRule()); }
	iv_ruleTwoVersion=ruleTwoVersion
	{ $current=$iv_ruleTwoVersion.current; }
	EOF;

// Rule TwoVersion
ruleTwoVersion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#27'
		{
			newLeafNode(otherlv_0, grammarAccess.getTwoVersionAccess().getNumberSignDigitTwoDigitSevenKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getTwoVersionAccess().getTwoVersionNo1ParserRuleCall_1_0());
			}
			this_TwoVersionNo1_1=ruleTwoVersionNo1
			{
				$current = $this_TwoVersionNo1_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getTwoVersionAccess().getTwoVersionNo2ParserRuleCall_1_1());
			}
			this_TwoVersionNo2_2=ruleTwoVersionNo2
			{
				$current = $this_TwoVersionNo2_2.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTwoVersionNo1
entryRuleTwoVersionNo1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTwoVersionNo1Rule()); }
	iv_ruleTwoVersionNo1=ruleTwoVersionNo1
	{ $current=$iv_ruleTwoVersionNo1.current; }
	EOF;

// Rule TwoVersionNo1
ruleTwoVersionNo1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_shared1_0_0=RULE_ID
				{
					newLeafNode(lv_shared1_0_0, grammarAccess.getTwoVersionNo1Access().getShared1IDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoVersionNo1Rule());
					}
					setWithLastConsumed(
						$current,
						"shared1",
						lv_shared1_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				lv_shared2_1_0=RULE_ID
				{
					newLeafNode(lv_shared2_1_0, grammarAccess.getTwoVersionNo1Access().getShared2IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoVersionNo1Rule());
					}
					setWithLastConsumed(
						$current,
						"shared2",
						lv_shared2_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='short'
		{
			newLeafNode(otherlv_2, grammarAccess.getTwoVersionNo1Access().getShortKeyword_2());
		}
		(
			(
				(
					lv_shared3_3_0=RULE_ID
					{
						newLeafNode(lv_shared3_3_0, grammarAccess.getTwoVersionNo1Access().getShared3IDTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTwoVersionNo1Rule());
						}
						addWithLastConsumed(
							$current,
							"shared3",
							lv_shared3_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_shared3_4_0=RULE_ID
					{
						newLeafNode(lv_shared3_4_0, grammarAccess.getTwoVersionNo1Access().getShared3IDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTwoVersionNo1Rule());
						}
						addWithLastConsumed(
							$current,
							"shared3",
							lv_shared3_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)*
		)?
		otherlv_5='one'
		{
			newLeafNode(otherlv_5, grammarAccess.getTwoVersionNo1Access().getOneKeyword_4());
		}
		(
			(
				lv_version1_6_0=RULE_ID
				{
					newLeafNode(lv_version1_6_0, grammarAccess.getTwoVersionNo1Access().getVersion1IDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoVersionNo1Rule());
					}
					setWithLastConsumed(
						$current,
						"version1",
						lv_version1_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleTwoVersionNo2
entryRuleTwoVersionNo2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTwoVersionNo2Rule()); }
	iv_ruleTwoVersionNo2=ruleTwoVersionNo2
	{ $current=$iv_ruleTwoVersionNo2.current; }
	EOF;

// Rule TwoVersionNo2
ruleTwoVersionNo2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_shared1_0_0=RULE_ID
				{
					newLeafNode(lv_shared1_0_0, grammarAccess.getTwoVersionNo2Access().getShared1IDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
					}
					setWithLastConsumed(
						$current,
						"shared1",
						lv_shared1_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				lv_shared2_1_0=RULE_ID
				{
					newLeafNode(lv_shared2_1_0, grammarAccess.getTwoVersionNo2Access().getShared2IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
					}
					setWithLastConsumed(
						$current,
						"shared2",
						lv_shared2_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='long'
		{
			newLeafNode(otherlv_2, grammarAccess.getTwoVersionNo2Access().getLongKeyword_2());
		}
		(
			(
				(
					lv_shared3_3_0=RULE_ID
					{
						newLeafNode(lv_shared3_3_0, grammarAccess.getTwoVersionNo2Access().getShared3IDTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
						}
						addWithLastConsumed(
							$current,
							"shared3",
							lv_shared3_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_shared3_4_0=RULE_ID
					{
						newLeafNode(lv_shared3_4_0, grammarAccess.getTwoVersionNo2Access().getShared3IDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
						}
						addWithLastConsumed(
							$current,
							"shared3",
							lv_shared3_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)*
		)?
		otherlv_5='extra'
		{
			newLeafNode(otherlv_5, grammarAccess.getTwoVersionNo2Access().getExtraKeyword_4());
		}
		(
			(
				lv_extra1_6_0=RULE_ID
				{
					newLeafNode(lv_extra1_6_0, grammarAccess.getTwoVersionNo2Access().getExtra1IDTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
					}
					setWithLastConsumed(
						$current,
						"extra1",
						lv_extra1_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				(
					(
						lv_extra2_7_0=RULE_ID
						{
							newLeafNode(lv_extra2_7_0, grammarAccess.getTwoVersionNo2Access().getExtra2IDTerminalRuleCall_6_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
							}
							setWithLastConsumed(
								$current,
								"extra2",
								lv_extra2_7_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_extra3_8_0=RULE_ID
						{
							newLeafNode(lv_extra3_8_0, grammarAccess.getTwoVersionNo2Access().getExtra3IDTerminalRuleCall_6_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
							}
							setWithLastConsumed(
								$current,
								"extra3",
								lv_extra3_8_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_9='two'
				{
					newLeafNode(otherlv_9, grammarAccess.getTwoVersionNo2Access().getTwoKeyword_6_1_0());
				}
				(
					(
						lv_extra4_10_0=RULE_ID
						{
							newLeafNode(lv_extra4_10_0, grammarAccess.getTwoVersionNo2Access().getExtra4IDTerminalRuleCall_6_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTwoVersionNo2Rule());
							}
							setWithLastConsumed(
								$current,
								"extra4",
								lv_extra4_10_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleHeuristic1
entryRuleHeuristic1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHeuristic1Rule()); }
	iv_ruleHeuristic1=ruleHeuristic1
	{ $current=$iv_ruleHeuristic1.current; }
	EOF;

// Rule Heuristic1
ruleHeuristic1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#28'
		{
			newLeafNode(otherlv_0, grammarAccess.getHeuristic1Access().getNumberSignDigitTwoDigitEightKeyword_0());
		}
		(
			otherlv_1='kw1'
			{
				newLeafNode(otherlv_1, grammarAccess.getHeuristic1Access().getKw1Keyword_1_0());
			}
			(
				(
					lv_a_2_0=RULE_ID
					{
						newLeafNode(lv_a_2_0, grammarAccess.getHeuristic1Access().getAIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHeuristic1Rule());
						}
						addWithLastConsumed(
							$current,
							"a",
							lv_a_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_b_3_0=RULE_ID
					{
						newLeafNode(lv_b_3_0, grammarAccess.getHeuristic1Access().getBIDTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHeuristic1Rule());
						}
						addWithLastConsumed(
							$current,
							"b",
							lv_b_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		(
			otherlv_4='kw2'
			{
				newLeafNode(otherlv_4, grammarAccess.getHeuristic1Access().getKw2Keyword_2_0());
			}
			(
				(
					lv_a_5_0=RULE_ID
					{
						newLeafNode(lv_a_5_0, grammarAccess.getHeuristic1Access().getAIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHeuristic1Rule());
						}
						addWithLastConsumed(
							$current,
							"a",
							lv_a_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_c_6_0=RULE_ID
					{
						newLeafNode(lv_c_6_0, grammarAccess.getHeuristic1Access().getCIDTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHeuristic1Rule());
						}
						addWithLastConsumed(
							$current,
							"c",
							lv_c_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
		(
			otherlv_7='kw3'
			{
				newLeafNode(otherlv_7, grammarAccess.getHeuristic1Access().getKw3Keyword_3_0());
			}
			(
				(
					lv_b_8_0=RULE_ID
					{
						newLeafNode(lv_b_8_0, grammarAccess.getHeuristic1Access().getBIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHeuristic1Rule());
						}
						addWithLastConsumed(
							$current,
							"b",
							lv_b_8_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					lv_c_9_0=RULE_ID
					{
						newLeafNode(lv_c_9_0, grammarAccess.getHeuristic1Access().getCIDTerminalRuleCall_3_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHeuristic1Rule());
						}
						addWithLastConsumed(
							$current,
							"c",
							lv_c_9_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
	)
;

// Rule TransientSerializeables1Enum
ruleTransientSerializeables1Enum returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='lit1'
			{
				$current = grammarAccess.getTransientSerializeables1EnumAccess().getLit1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTransientSerializeables1EnumAccess().getLit1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='lit2'
			{
				$current = grammarAccess.getTransientSerializeables1EnumAccess().getLit2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTransientSerializeables1EnumAccess().getLit2EnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
