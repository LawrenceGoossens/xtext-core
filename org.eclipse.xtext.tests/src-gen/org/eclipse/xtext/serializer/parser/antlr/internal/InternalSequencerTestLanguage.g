/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSequencerTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.serializer.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.serializer.parser.antlr.internal;

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
import org.eclipse.xtext.serializer.services.SequencerTestLanguageGrammarAccess;

}

@parser::members {

 	private SequencerTestLanguageGrammarAccess grammarAccess;

    public InternalSequencerTestLanguageParser(TokenStream input, SequencerTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SequencerTestLanguageGrammarAccess getGrammarAccess() {
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
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SimpleGroup");
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
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SimpleAlternative");
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
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SimpleMultiplicities");
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
						"org.eclipse.xtext.serializer.SequencerTestLanguage.GroupMultiplicities");
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
						"org.eclipse.xtext.serializer.SequencerTestLanguage.AlternativeMultiplicities");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX6List1ParserRuleCall_5_0());
				}
				lv_x6_5_0=ruleList1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x6",
						lv_x6_5_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.List1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX7List2ParserRuleCall_6_0());
				}
				lv_x7_6_0=ruleList2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x7",
						lv_x7_6_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.List2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX8AltList1ParserRuleCall_7_0());
				}
				lv_x8_7_0=ruleAltList1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x8",
						lv_x8_7_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.AltList1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX9AltList2ParserRuleCall_8_0());
				}
				lv_x9_8_0=ruleAltList2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x9",
						lv_x9_8_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.AltList2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX10SingleKeywordsParserRuleCall_9_0());
				}
				lv_x10_9_0=ruleSingleKeywords
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x10",
						lv_x10_9_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleKeywords");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX11SingleKeywordsOrIDParserRuleCall_10_0());
				}
				lv_x11_10_0=ruleSingleKeywordsOrID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x11",
						lv_x11_10_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleKeywordsOrID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX12SingleTerminalsParserRuleCall_11_0());
				}
				lv_x12_11_0=ruleSingleTerminals
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x12",
						lv_x12_11_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleTerminals");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX10MultiKeywordsParserRuleCall_12_0());
				}
				lv_x10_12_0=ruleMultiKeywords
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x10",
						lv_x10_12_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.MultiKeywords");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX11MultiKeywordsOrIDParserRuleCall_13_0());
				}
				lv_x11_13_0=ruleMultiKeywordsOrID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x11",
						lv_x11_13_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.MultiKeywordsOrID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX12MultiTerminalsParserRuleCall_14_0());
				}
				lv_x12_14_0=ruleMultiTerminals
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x12",
						lv_x12_14_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.MultiTerminals");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX13SingleEnumParserRuleCall_15_0());
				}
				lv_x13_15_0=ruleSingleEnum
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x13",
						lv_x13_15_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleEnum");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX14SingleCrossReferenceParserRuleCall_16_0());
				}
				lv_x14_16_0=ruleSingleCrossReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x14",
						lv_x14_16_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleCrossReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX15SingleContainmentReferenceParserRuleCall_17_0());
				}
				lv_x15_17_0=ruleSingleContainmentReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x15",
						lv_x15_17_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX19DependentAlternative1ParserRuleCall_18_0());
				}
				lv_x19_18_0=ruleDependentAlternative1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x19",
						lv_x19_18_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.DependentAlternative1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX20DependentAlternative2ParserRuleCall_19_0());
				}
				lv_x20_19_0=ruleDependentAlternative2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x20",
						lv_x20_19_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.DependentAlternative2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX21OptionalParserRuleCall_20_0());
				}
				lv_x21_20_0=ruleOptional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x21",
						lv_x21_20_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.Optional");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX22FloatParserRuleCall_21_0());
				}
				lv_x22_21_0=ruleFloat
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x22",
						lv_x22_21_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.Float");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX23UnorderedAlternativeParserRuleCall_22_0());
				}
				lv_x23_22_0=ruleUnorderedAlternative
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x23",
						lv_x23_22_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedAlternative");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX24UnorderedGroupParserRuleCall_23_0());
				}
				lv_x24_23_0=ruleUnorderedGroup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x24",
						lv_x24_23_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroup");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX25UnorderedGroupOptionalParserRuleCall_24_0());
				}
				lv_x25_24_0=ruleUnorderedGroupOptional
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x25",
						lv_x25_24_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupOptional");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX26UnorderedGroupBooleanParserRuleCall_25_0());
				}
				lv_x26_25_0=ruleUnorderedGroupBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x26",
						lv_x26_25_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupBoolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX27Complex1ParserRuleCall_26_0());
				}
				lv_x27_26_0=ruleComplex1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x27",
						lv_x27_26_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.Complex1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX28OptionalDoubleParserRuleCall_27_0());
				}
				lv_x28_27_0=ruleOptionalDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x28",
						lv_x28_27_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.OptionalDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX29NullValueGeneratedParserRuleCall_28_0());
				}
				lv_x29_28_0=ruleNullValueGenerated
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x29",
						lv_x29_28_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.NullValueGenerated");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX30NullValueInterpretedParserRuleCall_29_0());
				}
				lv_x30_29_0=ruleNullValueInterpreted
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x30",
						lv_x30_29_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.NullValueInterpreted");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX31NullCrossRefGeneratedParserRuleCall_30_0());
				}
				lv_x31_30_0=ruleNullCrossRefGenerated
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x31",
						lv_x31_30_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.NullCrossRefGenerated");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX32NullCrossRefInterpretedParserRuleCall_31_0());
				}
				lv_x32_31_0=ruleNullCrossRefInterpreted
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x32",
						lv_x32_31_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.NullCrossRefInterpreted");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX33FragmentCallerParserRuleCall_32_0());
				}
				lv_x33_32_0=ruleFragmentCaller
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x33",
						lv_x33_32_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.FragmentCaller");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX34ParameterCallerParserRuleCall_33_0());
				}
				lv_x34_33_0=ruleParameterCaller
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x34",
						lv_x34_33_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.ParameterCaller");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX35ParameterDelegationParserRuleCall_34_0());
				}
				lv_x35_34_0=ruleParameterDelegation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x35",
						lv_x35_34_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.ParameterDelegation");
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
		otherlv_0='#6'
		{
			newLeafNode(otherlv_0, grammarAccess.getList1Access().getNumberSignDigitSixKeyword_0());
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
		otherlv_0='#7'
		{
			newLeafNode(otherlv_0, grammarAccess.getList2Access().getNumberSignDigitSevenKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getList2Access().getList2Action_1(),
					$current);
			}
		)
		(
			(
				(
					lv_val1_2_0=RULE_ID
					{
						newLeafNode(lv_val1_2_0, grammarAccess.getList2Access().getVal1IDTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getList2Rule());
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
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getList2Access().getCommaKeyword_2_1_0());
				}
				(
					(
						lv_val1_4_0=RULE_ID
						{
							newLeafNode(lv_val1_4_0, grammarAccess.getList2Access().getVal1IDTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getList2Rule());
							}
							addWithLastConsumed(
								$current,
								"val1",
								lv_val1_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)*
		)?
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
		otherlv_0='#8'
		{
			newLeafNode(otherlv_0, grammarAccess.getAltList1Access().getNumberSignDigitEightKeyword_0());
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
		otherlv_0='#9'
		{
			newLeafNode(otherlv_0, grammarAccess.getAltList2Access().getNumberSignDigitNineKeyword_0());
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

// Entry rule entryRuleSingleKeywords
entryRuleSingleKeywords returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleKeywordsRule()); }
	iv_ruleSingleKeywords=ruleSingleKeywords
	{ $current=$iv_ruleSingleKeywords.current; }
	EOF;

// Rule SingleKeywords
ruleSingleKeywords returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#10'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleKeywordsAccess().getNumberSignDigitOneDigitZeroKeyword_0());
		}
		(
			(
				(
					lv_val_1_1='kw1'
					{
						newLeafNode(lv_val_1_1, grammarAccess.getSingleKeywordsAccess().getValKw1Keyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleKeywordsRule());
						}
						setWithLastConsumed($current, "val", lv_val_1_1, null);
					}
					    |
					lv_val_1_2='kw2'
					{
						newLeafNode(lv_val_1_2, grammarAccess.getSingleKeywordsAccess().getValKw2Keyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleKeywordsRule());
						}
						setWithLastConsumed($current, "val", lv_val_1_2, null);
					}
					    |
					lv_val_1_3='kw3'
					{
						newLeafNode(lv_val_1_3, grammarAccess.getSingleKeywordsAccess().getValKw3Keyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleKeywordsRule());
						}
						setWithLastConsumed($current, "val", lv_val_1_3, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSingleKeywordsOrID
entryRuleSingleKeywordsOrID returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleKeywordsOrIDRule()); }
	iv_ruleSingleKeywordsOrID=ruleSingleKeywordsOrID
	{ $current=$iv_ruleSingleKeywordsOrID.current; }
	EOF;

// Rule SingleKeywordsOrID
ruleSingleKeywordsOrID returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#11'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleKeywordsOrIDAccess().getNumberSignDigitOneDigitOneKeyword_0());
		}
		(
			(
				(
					lv_val_1_1='kw1'
					{
						newLeafNode(lv_val_1_1, grammarAccess.getSingleKeywordsOrIDAccess().getValKw1Keyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
						}
						setWithLastConsumed($current, "val", lv_val_1_1, null);
					}
					    |
					lv_val_1_2='kw2'
					{
						newLeafNode(lv_val_1_2, grammarAccess.getSingleKeywordsOrIDAccess().getValKw2Keyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
						}
						setWithLastConsumed($current, "val", lv_val_1_2, null);
					}
					    |
					lv_val_1_3='kw3'
					{
						newLeafNode(lv_val_1_3, grammarAccess.getSingleKeywordsOrIDAccess().getValKw3Keyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
						}
						setWithLastConsumed($current, "val", lv_val_1_3, null);
					}
					    |
					lv_val_1_4=RULE_ID
					{
						newLeafNode(lv_val_1_4, grammarAccess.getSingleKeywordsOrIDAccess().getValIDTerminalRuleCall_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleKeywordsOrIDRule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_1_4,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSingleTerminals
entryRuleSingleTerminals returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleTerminalsRule()); }
	iv_ruleSingleTerminals=ruleSingleTerminals
	{ $current=$iv_ruleSingleTerminals.current; }
	EOF;

// Rule SingleTerminals
ruleSingleTerminals returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#12'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleTerminalsAccess().getNumberSignDigitOneDigitTwoKeyword_0());
		}
		(
			(
				(
					lv_val_1_1=RULE_ID1
					{
						newLeafNode(lv_val_1_1, grammarAccess.getSingleTerminalsAccess().getValID1TerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleTerminalsRule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_1_1,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.ID1");
					}
					    |
					lv_val_1_2=RULE_ID2
					{
						newLeafNode(lv_val_1_2, grammarAccess.getSingleTerminalsAccess().getValID2TerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleTerminalsRule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_1_2,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.ID2");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSingleEnum
entryRuleSingleEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleEnumRule()); }
	iv_ruleSingleEnum=ruleSingleEnum
	{ $current=$iv_ruleSingleEnum.current; }
	EOF;

// Rule SingleEnum
ruleSingleEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#13'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleEnumAccess().getNumberSignDigitOneDigitThreeKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleEnumAccess().getValDefEnum1EnumRuleCall_1_0_0());
					}
					lv_val_1_1=ruleDefEnum1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleEnumRule());
						}
						set(
							$current,
							"val",
							lv_val_1_1,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.DefEnum1");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getSingleEnumAccess().getValDefEnum2EnumRuleCall_1_0_1());
					}
					lv_val_1_2=ruleDefEnum2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleEnumRule());
						}
						set(
							$current,
							"val",
							lv_val_1_2,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.DefEnum2");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getSingleEnumAccess().getValDefEnum3EnumRuleCall_1_0_2());
					}
					lv_val_1_3=ruleDefEnum3
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleEnumRule());
						}
						set(
							$current,
							"val",
							lv_val_1_3,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.DefEnum3");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSingleCrossReference
entryRuleSingleCrossReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleCrossReferenceRule()); }
	iv_ruleSingleCrossReference=ruleSingleCrossReference
	{ $current=$iv_ruleSingleCrossReference.current; }
	EOF;

// Rule SingleCrossReference
ruleSingleCrossReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#14'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleCrossReferenceAccess().getNumberSignDigitOneDigitFourKeyword_0());
		}
		(
			(
				(
					lv_name_1_1=RULE_ID1
					{
						newLeafNode(lv_name_1_1, grammarAccess.getSingleCrossReferenceAccess().getNameID1TerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_1,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.ID1");
					}
					    |
					lv_name_1_2=RULE_ID2
					{
						newLeafNode(lv_name_1_2, grammarAccess.getSingleCrossReferenceAccess().getNameID2TerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_2,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.ID2");
					}
					    |
					lv_name_1_3=RULE_ID3
					{
						newLeafNode(lv_name_1_3, grammarAccess.getSingleCrossReferenceAccess().getNameID3TerminalRuleCall_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_3,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.ID3");
					}
				)
			)
		)
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					otherlv_2=RULE_ID1
					{
						newLeafNode(otherlv_2, grammarAccess.getSingleCrossReferenceAccess().getRefSingleCrossReferenceCrossReference_2_0_0());
					}
				)
			)
			    |
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					otherlv_3=RULE_ID2
					{
						newLeafNode(otherlv_3, grammarAccess.getSingleCrossReferenceAccess().getRefSingleCrossReferenceCrossReference_2_1_0());
					}
				)
			)
			    |
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					otherlv_4=RULE_ID3
					{
						newLeafNode(otherlv_4, grammarAccess.getSingleCrossReferenceAccess().getRefSingleCrossReferenceCrossReference_2_2_0());
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSingleContainmentReference
entryRuleSingleContainmentReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleContainmentReferenceRule()); }
	iv_ruleSingleContainmentReference=ruleSingleContainmentReference
	{ $current=$iv_ruleSingleContainmentReference.current; }
	EOF;

// Rule SingleContainmentReference
ruleSingleContainmentReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#15'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleContainmentReferenceAccess().getNumberSignDigitOneDigitFiveKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSingleContainmentReferenceAccess().getChildSingleContainmentReferenceChild1ParserRuleCall_1_0_0());
					}
					lv_child_1_1=ruleSingleContainmentReferenceChild1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleContainmentReferenceRule());
						}
						set(
							$current,
							"child",
							lv_child_1_1,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReferenceChild1");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getSingleContainmentReferenceAccess().getChildSingleContainmentReferenceChild2ParserRuleCall_1_0_1());
					}
					lv_child_1_2=ruleSingleContainmentReferenceChild2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleContainmentReferenceRule());
						}
						set(
							$current,
							"child",
							lv_child_1_2,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReferenceChild2");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getSingleContainmentReferenceAccess().getChildSingleContainmentReferenceChild3ParserRuleCall_1_0_2());
					}
					lv_child_1_3=ruleSingleContainmentReferenceChild3
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSingleContainmentReferenceRule());
						}
						set(
							$current,
							"child",
							lv_child_1_3,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReferenceChild3");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleSingleContainmentReferenceChild1
entryRuleSingleContainmentReferenceChild1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleContainmentReferenceChild1Rule()); }
	iv_ruleSingleContainmentReferenceChild1=ruleSingleContainmentReferenceChild1
	{ $current=$iv_ruleSingleContainmentReferenceChild1.current; }
	EOF;

// Rule SingleContainmentReferenceChild1
ruleSingleContainmentReferenceChild1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0='kw1'
			{
				newLeafNode(lv_val_0_0, grammarAccess.getSingleContainmentReferenceChild1Access().getValKw1Keyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSingleContainmentReferenceChild1Rule());
				}
				setWithLastConsumed($current, "val", lv_val_0_0, "kw1");
			}
		)
	)
;

// Entry rule entryRuleSingleContainmentReferenceChild2
entryRuleSingleContainmentReferenceChild2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleContainmentReferenceChild2Rule()); }
	iv_ruleSingleContainmentReferenceChild2=ruleSingleContainmentReferenceChild2
	{ $current=$iv_ruleSingleContainmentReferenceChild2.current; }
	EOF;

// Rule SingleContainmentReferenceChild2
ruleSingleContainmentReferenceChild2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0='kw2'
			{
				newLeafNode(lv_val_0_0, grammarAccess.getSingleContainmentReferenceChild2Access().getValKw2Keyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSingleContainmentReferenceChild2Rule());
				}
				setWithLastConsumed($current, "val", lv_val_0_0, "kw2");
			}
		)
	)
;

// Entry rule entryRuleSingleContainmentReferenceChild3
entryRuleSingleContainmentReferenceChild3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleContainmentReferenceChild3Rule()); }
	iv_ruleSingleContainmentReferenceChild3=ruleSingleContainmentReferenceChild3
	{ $current=$iv_ruleSingleContainmentReferenceChild3.current; }
	EOF;

// Rule SingleContainmentReferenceChild3
ruleSingleContainmentReferenceChild3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0='kw3'
			{
				newLeafNode(lv_val_0_0, grammarAccess.getSingleContainmentReferenceChild3Access().getValKw3Keyword_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSingleContainmentReferenceChild3Rule());
				}
				setWithLastConsumed($current, "val", lv_val_0_0, "kw3");
			}
		)
	)
;

// Entry rule entryRuleMultiKeywords
entryRuleMultiKeywords returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiKeywordsRule()); }
	iv_ruleMultiKeywords=ruleMultiKeywords
	{ $current=$iv_ruleMultiKeywords.current; }
	EOF;

// Rule MultiKeywords
ruleMultiKeywords returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#16'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiKeywordsAccess().getNumberSignDigitOneDigitSixKeyword_0());
		}
		(
			(
				(
					lv_val_1_1='kw1'
					{
						newLeafNode(lv_val_1_1, grammarAccess.getMultiKeywordsAccess().getValKw1Keyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiKeywordsRule());
						}
						addWithLastConsumed($current, "val", lv_val_1_1, null);
					}
					    |
					lv_val_1_2='kw2'
					{
						newLeafNode(lv_val_1_2, grammarAccess.getMultiKeywordsAccess().getValKw2Keyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiKeywordsRule());
						}
						addWithLastConsumed($current, "val", lv_val_1_2, null);
					}
					    |
					lv_val_1_3='kw3'
					{
						newLeafNode(lv_val_1_3, grammarAccess.getMultiKeywordsAccess().getValKw3Keyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiKeywordsRule());
						}
						addWithLastConsumed($current, "val", lv_val_1_3, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleMultiKeywordsOrID
entryRuleMultiKeywordsOrID returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiKeywordsOrIDRule()); }
	iv_ruleMultiKeywordsOrID=ruleMultiKeywordsOrID
	{ $current=$iv_ruleMultiKeywordsOrID.current; }
	EOF;

// Rule MultiKeywordsOrID
ruleMultiKeywordsOrID returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#17'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiKeywordsOrIDAccess().getNumberSignDigitOneDigitSevenKeyword_0());
		}
		(
			(
				(
					lv_val_1_1='kw1'
					{
						newLeafNode(lv_val_1_1, grammarAccess.getMultiKeywordsOrIDAccess().getValKw1Keyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
						}
						addWithLastConsumed($current, "val", lv_val_1_1, null);
					}
					    |
					lv_val_1_2='kw2'
					{
						newLeafNode(lv_val_1_2, grammarAccess.getMultiKeywordsOrIDAccess().getValKw2Keyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
						}
						addWithLastConsumed($current, "val", lv_val_1_2, null);
					}
					    |
					lv_val_1_3='kw3'
					{
						newLeafNode(lv_val_1_3, grammarAccess.getMultiKeywordsOrIDAccess().getValKw3Keyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
						}
						addWithLastConsumed($current, "val", lv_val_1_3, null);
					}
					    |
					lv_val_1_4=RULE_ID
					{
						newLeafNode(lv_val_1_4, grammarAccess.getMultiKeywordsOrIDAccess().getValIDTerminalRuleCall_1_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiKeywordsOrIDRule());
						}
						addWithLastConsumed(
							$current,
							"val",
							lv_val_1_4,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleMultiTerminals
entryRuleMultiTerminals returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiTerminalsRule()); }
	iv_ruleMultiTerminals=ruleMultiTerminals
	{ $current=$iv_ruleMultiTerminals.current; }
	EOF;

// Rule MultiTerminals
ruleMultiTerminals returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#18'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiTerminalsAccess().getNumberSignDigitOneDigitEightKeyword_0());
		}
		(
			(
				(
					lv_val_1_1=RULE_ID1
					{
						newLeafNode(lv_val_1_1, grammarAccess.getMultiTerminalsAccess().getValID1TerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiTerminalsRule());
						}
						addWithLastConsumed(
							$current,
							"val",
							lv_val_1_1,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.ID1");
					}
					    |
					lv_val_1_2=RULE_ID2
					{
						newLeafNode(lv_val_1_2, grammarAccess.getMultiTerminalsAccess().getValID2TerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getMultiTerminalsRule());
						}
						addWithLastConsumed(
							$current,
							"val",
							lv_val_1_2,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.ID2");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleDependentAlternative1
entryRuleDependentAlternative1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDependentAlternative1Rule()); }
	iv_ruleDependentAlternative1=ruleDependentAlternative1
	{ $current=$iv_ruleDependentAlternative1.current; }
	EOF;

// Rule DependentAlternative1
ruleDependentAlternative1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#19'
		{
			newLeafNode(otherlv_0, grammarAccess.getDependentAlternative1Access().getNumberSignDigitOneDigitNineKeyword_0());
		}
		(
			(
				(
					lv_val_1_0=RULE_ID
					{
						newLeafNode(lv_val_1_0, grammarAccess.getDependentAlternative1Access().getValIDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDependentAlternative1Rule());
						}
						setWithLastConsumed(
							$current,
							"val",
							lv_val_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					(
						lv_val_2_0=RULE_ID
						{
							newLeafNode(lv_val_2_0, grammarAccess.getDependentAlternative1Access().getValIDTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDependentAlternative1Rule());
							}
							setWithLastConsumed(
								$current,
								"val",
								lv_val_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_flag_3_0='kw1'
						{
							newLeafNode(lv_flag_3_0, grammarAccess.getDependentAlternative1Access().getFlagKw1Keyword_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDependentAlternative1Rule());
							}
							setWithLastConsumed($current, "flag", lv_flag_3_0 != null, "kw1");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleDependentAlternative2
entryRuleDependentAlternative2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDependentAlternative2Rule()); }
	iv_ruleDependentAlternative2=ruleDependentAlternative2
	{ $current=$iv_ruleDependentAlternative2.current; }
	EOF;

// Rule DependentAlternative2
ruleDependentAlternative2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#20'
		{
			newLeafNode(otherlv_0, grammarAccess.getDependentAlternative2Access().getNumberSignDigitTwoDigitZeroKeyword_0());
		}
		(
			(
				(
					(
						lv_val_1_0=RULE_ID
						{
							newLeafNode(lv_val_1_0, grammarAccess.getDependentAlternative2Access().getValIDTerminalRuleCall_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDependentAlternative2Rule());
							}
							addWithLastConsumed(
								$current,
								"val",
								lv_val_1_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					(
						lv_val_2_0=RULE_ID
						{
							newLeafNode(lv_val_2_0, grammarAccess.getDependentAlternative2Access().getValIDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDependentAlternative2Rule());
							}
							addWithLastConsumed(
								$current,
								"val",
								lv_val_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)+
			)
			    |
			(
				(
					(
						lv_val_3_0=RULE_ID
						{
							newLeafNode(lv_val_3_0, grammarAccess.getDependentAlternative2Access().getValIDTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDependentAlternative2Rule());
							}
							addWithLastConsumed(
								$current,
								"val",
								lv_val_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)+
				(
					(
						lv_flag_4_0='kw1'
						{
							newLeafNode(lv_flag_4_0, grammarAccess.getDependentAlternative2Access().getFlagKw1Keyword_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getDependentAlternative2Rule());
							}
							setWithLastConsumed($current, "flag", lv_flag_4_0 != null, "kw1");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleOptional
entryRuleOptional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalRule()); }
	iv_ruleOptional=ruleOptional
	{ $current=$iv_ruleOptional.current; }
	EOF;

// Rule Optional
ruleOptional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#21'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getNumberSignDigitTwoDigitOneKeyword_0());
		}
		(
			(
				lv_int0_1_0=RULE_INT
				{
					newLeafNode(lv_int0_1_0, grammarAccess.getOptionalAccess().getInt0INTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptionalRule());
					}
					setWithLastConsumed(
						$current,
						"int0",
						lv_int0_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				(
					lv_int1_2_0=RULE_INT
					{
						newLeafNode(lv_int1_2_0, grammarAccess.getOptionalAccess().getInt1INTTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOptionalRule());
						}
						setWithLastConsumed(
							$current,
							"int1",
							lv_int1_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			(
				(
					lv_int2_3_0=RULE_INT
					{
						newLeafNode(lv_int2_3_0, grammarAccess.getOptionalAccess().getInt2INTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOptionalRule());
						}
						setWithLastConsumed(
							$current,
							"int2",
							lv_int2_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFloat
entryRuleFloat returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFloatRule()); }
	iv_ruleFloat=ruleFloat
	{ $current=$iv_ruleFloat.current; }
	EOF;

// Rule Float
ruleFloat returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#22'
		{
			newLeafNode(otherlv_0, grammarAccess.getFloatAccess().getNumberSignDigitTwoDigitTwoKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFloatAccess().getFloatAction_1(),
					$current);
			}
		)
		otherlv_2='Bye'
		{
			newLeafNode(otherlv_2, grammarAccess.getFloatAccess().getByeKeyword_2());
		}
	)
;

// Entry rule entryRuleUnorderedAlternative
entryRuleUnorderedAlternative returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedAlternativeRule()); }
	iv_ruleUnorderedAlternative=ruleUnorderedAlternative
	{ $current=$iv_ruleUnorderedAlternative.current; }
	EOF;

// Rule UnorderedAlternative
ruleUnorderedAlternative returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#23'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedAlternativeAccess().getNumberSignDigitTwoDigitThreeKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUnorderedAlternativeAccess().getUnorderedAlternativeAction_1(),
					$current);
			}
		)
		(
			(
				(
					lv_val1_2_0=RULE_ID
					{
						newLeafNode(lv_val1_2_0, grammarAccess.getUnorderedAlternativeAccess().getVal1IDTerminalRuleCall_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnorderedAlternativeRule());
						}
						addWithLastConsumed(
							$current,
							"val1",
							lv_val1_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			    |
			(
				(
					lv_val2_3_0=RULE_INT
					{
						newLeafNode(lv_val2_3_0, grammarAccess.getUnorderedAlternativeAccess().getVal2INTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUnorderedAlternativeRule());
						}
						addWithLastConsumed(
							$current,
							"val2",
							lv_val2_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getUnorderedAlternativeAccess().getVal3UnorderedAlternativeValParserRuleCall_2_2_0());
					}
					lv_val3_4_0=ruleUnorderedAlternativeVal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnorderedAlternativeRule());
						}
						add(
							$current,
							"val3",
							lv_val3_4_0,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedAlternativeVal");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getUnorderedAlternativeAccess().getVal4UnorderedAlternativeValDelegateParserRuleCall_2_3_0());
					}
					lv_val4_5_0=ruleUnorderedAlternativeValDelegate
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUnorderedAlternativeRule());
						}
						add(
							$current,
							"val4",
							lv_val4_5_0,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedAlternativeValDelegate");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleUnorderedAlternativeVal
entryRuleUnorderedAlternativeVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedAlternativeValRule()); }
	iv_ruleUnorderedAlternativeVal=ruleUnorderedAlternativeVal
	{ $current=$iv_ruleUnorderedAlternativeVal.current; }
	EOF;

// Rule UnorderedAlternativeVal
ruleUnorderedAlternativeVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw1'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedAlternativeValAccess().getKw1Keyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getUnorderedAlternativeValAccess().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnorderedAlternativeValRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleUnorderedAlternativeValDelegate
entryRuleUnorderedAlternativeValDelegate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedAlternativeValDelegateRule()); }
	iv_ruleUnorderedAlternativeValDelegate=ruleUnorderedAlternativeValDelegate
	{ $current=$iv_ruleUnorderedAlternativeValDelegate.current; }
	EOF;

// Rule UnorderedAlternativeValDelegate
ruleUnorderedAlternativeValDelegate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getUnorderedAlternativeValDelegateAccess().getUnorderedAlternativeVal2ParserRuleCall());
	}
	this_UnorderedAlternativeVal2_0=ruleUnorderedAlternativeVal2
	{
		$current = $this_UnorderedAlternativeVal2_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleUnorderedAlternativeVal2
entryRuleUnorderedAlternativeVal2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedAlternativeVal2Rule()); }
	iv_ruleUnorderedAlternativeVal2=ruleUnorderedAlternativeVal2
	{ $current=$iv_ruleUnorderedAlternativeVal2.current; }
	EOF;

// Rule UnorderedAlternativeVal2
ruleUnorderedAlternativeVal2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw2'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedAlternativeVal2Access().getKw2Keyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getUnorderedAlternativeVal2Access().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnorderedAlternativeVal2Rule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleUnorderedGroup
entryRuleUnorderedGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedGroupRule()); }
	iv_ruleUnorderedGroup=ruleUnorderedGroup
	{ $current=$iv_ruleUnorderedGroup.current; }
	EOF;

// Rule UnorderedGroup
ruleUnorderedGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#24'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupAccess().getNumberSignDigitTwoDigitFourKeyword_0());
		}
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 0);
					}
								({true}?=>((
									lv_val1_2_0=RULE_ID
									{
										newLeafNode(lv_val1_2_0, grammarAccess.getUnorderedGroupAccess().getVal1IDTerminalRuleCall_1_0_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getUnorderedGroupRule());
										}
										setWithLastConsumed(
											$current,
											"val1",
											lv_val1_2_0,
											"org.eclipse.xtext.common.Terminals.ID");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 1);
					}
								({true}?=>((
									lv_val2_3_0=RULE_INT
									{
										newLeafNode(lv_val2_3_0, grammarAccess.getUnorderedGroupAccess().getVal2INTTerminalRuleCall_1_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getUnorderedGroupRule());
										}
										setWithLastConsumed(
											$current,
											"val2",
											lv_val2_3_0,
											"org.eclipse.xtext.common.Terminals.INT");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 2);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getUnorderedGroupAccess().getVal3UnorderedGroupValParserRuleCall_1_2_0());
									}
									lv_val3_4_0=ruleUnorderedGroupVal
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
										}
										set(
											$current,
											"val3",
											lv_val3_4_0,
											"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupVal");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1(), 3);
					}
								({true}?=>((
									{
										newCompositeNode(grammarAccess.getUnorderedGroupAccess().getVal4UnorderedGroupValDelegateParserRuleCall_1_3_0());
									}
									lv_val4_5_0=ruleUnorderedGroupValDelegate
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
										}
										set(
											$current,
											"val4",
											lv_val4_5_0,
											"org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupValDelegate");
										afterParserOrEnumRuleCall();
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupAccess().getUnorderedGroup_1());
				}
		)
	)
;

// Entry rule entryRuleUnorderedGroupVal
entryRuleUnorderedGroupVal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedGroupValRule()); }
	iv_ruleUnorderedGroupVal=ruleUnorderedGroupVal
	{ $current=$iv_ruleUnorderedGroupVal.current; }
	EOF;

// Rule UnorderedGroupVal
ruleUnorderedGroupVal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw1'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupValAccess().getKw1Keyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getUnorderedGroupValAccess().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnorderedGroupValRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleUnorderedGroupValDelegate
entryRuleUnorderedGroupValDelegate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedGroupValDelegateRule()); }
	iv_ruleUnorderedGroupValDelegate=ruleUnorderedGroupValDelegate
	{ $current=$iv_ruleUnorderedGroupValDelegate.current; }
	EOF;

// Rule UnorderedGroupValDelegate
ruleUnorderedGroupValDelegate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getUnorderedGroupValDelegateAccess().getUnorderedGroupVal2ParserRuleCall());
	}
	this_UnorderedGroupVal2_0=ruleUnorderedGroupVal2
	{
		$current = $this_UnorderedGroupVal2_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleUnorderedGroupVal2
entryRuleUnorderedGroupVal2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedGroupVal2Rule()); }
	iv_ruleUnorderedGroupVal2=ruleUnorderedGroupVal2
	{ $current=$iv_ruleUnorderedGroupVal2.current; }
	EOF;

// Rule UnorderedGroupVal2
ruleUnorderedGroupVal2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw2'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupVal2Access().getKw2Keyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getUnorderedGroupVal2Access().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnorderedGroupVal2Rule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleUnorderedGroupOptional
entryRuleUnorderedGroupOptional returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedGroupOptionalRule()); }
	iv_ruleUnorderedGroupOptional=ruleUnorderedGroupOptional
	{ $current=$iv_ruleUnorderedGroupOptional.current; }
	EOF;

// Rule UnorderedGroupOptional
ruleUnorderedGroupOptional returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#25'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupOptionalAccess().getNumberSignDigitTwoDigitFiveKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroupOptionalAction_1(),
					$current);
			}
		)
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 0);
					}
								({true}?=>(otherlv_3='kw1'
								{
									newLeafNode(otherlv_3, grammarAccess.getUnorderedGroupOptionalAccess().getKw1Keyword_2_0_0());
								}
								(
									(
										lv_val1_4_0=RULE_ID
										{
											newLeafNode(lv_val1_4_0, grammarAccess.getUnorderedGroupOptionalAccess().getVal1IDTerminalRuleCall_2_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnorderedGroupOptionalRule());
											}
											setWithLastConsumed(
												$current,
												"val1",
												lv_val1_4_0,
												"org.eclipse.xtext.common.Terminals.ID");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 1);
					}
								({true}?=>(otherlv_5='kw2'
								{
									newLeafNode(otherlv_5, grammarAccess.getUnorderedGroupOptionalAccess().getKw2Keyword_2_1_0());
								}
								(
									(
										lv_va2_6_0=RULE_ID
										{
											newLeafNode(lv_va2_6_0, grammarAccess.getUnorderedGroupOptionalAccess().getVa2IDTerminalRuleCall_2_1_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnorderedGroupOptionalRule());
											}
											setWithLastConsumed(
												$current,
												"va2",
												lv_va2_6_0,
												"org.eclipse.xtext.common.Terminals.ID");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2(), 2);
					}
								({true}?=>(otherlv_7='kw3'
								{
									newLeafNode(otherlv_7, grammarAccess.getUnorderedGroupOptionalAccess().getKw3Keyword_2_2_0());
								}
								(
									(
										lv_val3_8_0=RULE_ID
										{
											newLeafNode(lv_val3_8_0, grammarAccess.getUnorderedGroupOptionalAccess().getVal3IDTerminalRuleCall_2_2_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnorderedGroupOptionalRule());
											}
											setWithLastConsumed(
												$current,
												"val3",
												lv_val3_8_0,
												"org.eclipse.xtext.common.Terminals.ID");
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupOptionalAccess().getUnorderedGroup_2());
				}
		)
	)
;

// Entry rule entryRuleUnorderedGroupBoolean
entryRuleUnorderedGroupBoolean returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedGroupBooleanRule()); }
	iv_ruleUnorderedGroupBoolean=ruleUnorderedGroupBoolean
	{ $current=$iv_ruleUnorderedGroupBoolean.current; }
	EOF;

// Rule UnorderedGroupBoolean
ruleUnorderedGroupBoolean returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#26'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnorderedGroupBooleanAccess().getNumberSignDigitTwoDigitSixKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroupBooleanAction_1(),
					$current);
			}
		)
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 0);
					}
								({true}?=>((
									lv_val1_3_0='kw1'
									{
										newLeafNode(lv_val1_3_0, grammarAccess.getUnorderedGroupBooleanAccess().getVal1Kw1Keyword_2_0_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getUnorderedGroupBooleanRule());
										}
										setWithLastConsumed($current, "val1", lv_val1_3_0 != null, "kw1");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 1);
					}
								({true}?=>((
									lv_val2_4_0='kw2'
									{
										newLeafNode(lv_val2_4_0, grammarAccess.getUnorderedGroupBooleanAccess().getVal2Kw2Keyword_2_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getUnorderedGroupBooleanRule());
										}
										setWithLastConsumed($current, "val2", lv_val2_4_0 != null, "kw2");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2(), 2);
					}
								({true}?=>((
									lv_val3_5_0='kw3'
									{
										newLeafNode(lv_val3_5_0, grammarAccess.getUnorderedGroupBooleanAccess().getVal3Kw3Keyword_2_2_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getUnorderedGroupBooleanRule());
										}
										setWithLastConsumed($current, "val3", lv_val3_5_0 != null, "kw3");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedGroupBooleanAccess().getUnorderedGroup_2());
				}
		)
	)
;

// Entry rule entryRuleComplex1
entryRuleComplex1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComplex1Rule()); }
	iv_ruleComplex1=ruleComplex1
	{ $current=$iv_ruleComplex1.current; }
	EOF;

// Rule Complex1
ruleComplex1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#27'
		{
			newLeafNode(otherlv_0, grammarAccess.getComplex1Access().getNumberSignDigitTwoDigitSevenKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getComplex1Access().getComplex1Action_1(),
					$current);
			}
		)
		(
			otherlv_2='kw1'
			{
				newLeafNode(otherlv_2, grammarAccess.getComplex1Access().getKw1Keyword_2_0());
			}
			(
				(
					lv_val1_3_0=RULE_ID
					{
						newLeafNode(lv_val1_3_0, grammarAccess.getComplex1Access().getVal1IDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComplex1Rule());
						}
						setWithLastConsumed(
							$current,
							"val1",
							lv_val1_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			otherlv_4='kw2'
			{
				newLeafNode(otherlv_4, grammarAccess.getComplex1Access().getKw2Keyword_3_0());
			}
			(
				(
					lv_val2_5_0=RULE_ID
					{
						newLeafNode(lv_val2_5_0, grammarAccess.getComplex1Access().getVal2IDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getComplex1Rule());
						}
						setWithLastConsumed(
							$current,
							"val2",
							lv_val2_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
		(
			(
				otherlv_6='kw3'
				{
					newLeafNode(otherlv_6, grammarAccess.getComplex1Access().getKw3Keyword_4_0_0());
				}
				(
					(
						lv_val3_7_0=RULE_ID
						{
							newLeafNode(lv_val3_7_0, grammarAccess.getComplex1Access().getVal3IDTerminalRuleCall_4_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComplex1Rule());
							}
							addWithLastConsumed(
								$current,
								"val3",
								lv_val3_7_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_8='kw4'
				{
					newLeafNode(otherlv_8, grammarAccess.getComplex1Access().getKw4Keyword_4_1_0());
				}
				(
					(
						lv_val4_9_0=RULE_ID
						{
							newLeafNode(lv_val4_9_0, grammarAccess.getComplex1Access().getVal4IDTerminalRuleCall_4_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComplex1Rule());
							}
							addWithLastConsumed(
								$current,
								"val4",
								lv_val4_9_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_10='kw5'
				{
					newLeafNode(otherlv_10, grammarAccess.getComplex1Access().getKw5Keyword_4_2_0());
				}
				(
					(
						lv_val5_11_0=RULE_ID
						{
							newLeafNode(lv_val5_11_0, grammarAccess.getComplex1Access().getVal5IDTerminalRuleCall_4_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComplex1Rule());
							}
							addWithLastConsumed(
								$current,
								"val5",
								lv_val5_11_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_12='kw6'
				{
					newLeafNode(otherlv_12, grammarAccess.getComplex1Access().getKw6Keyword_4_3_0());
				}
				(
					(
						lv_val6_13_0=RULE_ID
						{
							newLeafNode(lv_val6_13_0, grammarAccess.getComplex1Access().getVal6IDTerminalRuleCall_4_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getComplex1Rule());
							}
							addWithLastConsumed(
								$current,
								"val6",
								lv_val6_13_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleOptionalDouble
entryRuleOptionalDouble returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalDoubleRule()); }
	iv_ruleOptionalDouble=ruleOptionalDouble
	{ $current=$iv_ruleOptionalDouble.current; }
	EOF;

// Rule OptionalDouble
ruleOptionalDouble returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#28'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptionalDoubleAccess().getNumberSignDigitTwoDigitEightKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOptionalDoubleAccess().getDouble0DOUBLEParserRuleCall_1_0());
				}
				lv_double0_1_0=ruleDOUBLE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOptionalDoubleRule());
					}
					set(
						$current,
						"double0",
						lv_double0_1_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.DOUBLE");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getOptionalDoubleAccess().getDouble1DOUBLEParserRuleCall_2_0_0());
					}
					lv_double1_2_0=ruleDOUBLE
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOptionalDoubleRule());
						}
						set(
							$current,
							"double1",
							lv_double1_2_0,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.DOUBLE");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getOptionalDoubleAccess().getDouble2DOUBLEParserRuleCall_2_1_0());
					}
					lv_double2_3_0=ruleDOUBLE
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOptionalDoubleRule());
						}
						set(
							$current,
							"double2",
							lv_double2_3_0,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.DOUBLE");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDOUBLE
entryRuleDOUBLE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOUBLERule()); }
	iv_ruleDOUBLE=ruleDOUBLE
	{ $current=$iv_ruleDOUBLE.current.getText(); }
	EOF;

// Rule DOUBLE
ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0());
			}
			this_INT_2=RULE_INT
			{
				$current.merge(this_INT_2);
			}
			{
				newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1());
			}
		)?
	)
;

// Entry rule entryRuleNullValueGenerated
entryRuleNullValueGenerated returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullValueGeneratedRule()); }
	iv_ruleNullValueGenerated=ruleNullValueGenerated
	{ $current=$iv_ruleNullValueGenerated.current; }
	EOF;

// Rule NullValueGenerated
ruleNullValueGenerated returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#29'
		{
			newLeafNode(otherlv_0, grammarAccess.getNullValueGeneratedAccess().getNumberSignDigitTwoDigitNineKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNullValueGeneratedAccess().getValueNULL_STRINGParserRuleCall_1_0());
				}
				lv_value_1_0=ruleNULL_STRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNullValueGeneratedRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.NULL_STRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNullValueInterpreted
entryRuleNullValueInterpreted returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullValueInterpretedRule()); }
	iv_ruleNullValueInterpreted=ruleNullValueInterpreted
	{ $current=$iv_ruleNullValueInterpreted.current; }
	EOF;

// Rule NullValueInterpreted
ruleNullValueInterpreted returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#30'
		{
			newLeafNode(otherlv_0, grammarAccess.getNullValueInterpretedAccess().getNumberSignDigitThreeDigitZeroKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNullValueInterpretedAccess().getValueNULL_STRINGParserRuleCall_1_0());
				}
				lv_value_1_0=ruleNULL_STRING
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNullValueInterpretedRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.serializer.SequencerTestLanguage.NULL_STRING");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_foo_2_0=RULE_ID
				{
					newLeafNode(lv_foo_2_0, grammarAccess.getNullValueInterpretedAccess().getFooIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNullValueInterpretedRule());
					}
					setWithLastConsumed(
						$current,
						"foo",
						lv_foo_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleNULL_STRING
entryRuleNULL_STRING returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNULL_STRINGRule()); }
	iv_ruleNULL_STRING=ruleNULL_STRING
	{ $current=$iv_ruleNULL_STRING.current.getText(); }
	EOF;

// Rule NULL_STRING
ruleNULL_STRING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getNULL_STRINGAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleNullCrossRefGenerated
entryRuleNullCrossRefGenerated returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullCrossRefGeneratedRule()); }
	iv_ruleNullCrossRefGenerated=ruleNullCrossRefGenerated
	{ $current=$iv_ruleNullCrossRefGenerated.current; }
	EOF;

// Rule NullCrossRefGenerated
ruleNullCrossRefGenerated returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#31'
		{
			newLeafNode(otherlv_0, grammarAccess.getNullCrossRefGeneratedAccess().getNumberSignDigitThreeDigitOneKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNullCrossRefGeneratedRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getNullCrossRefGeneratedAccess().getRefEObjectCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleNullCrossRefInterpreted
entryRuleNullCrossRefInterpreted returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNullCrossRefInterpretedRule()); }
	iv_ruleNullCrossRefInterpreted=ruleNullCrossRefInterpreted
	{ $current=$iv_ruleNullCrossRefInterpreted.current; }
	EOF;

// Rule NullCrossRefInterpreted
ruleNullCrossRefInterpreted returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#32'
		{
			newLeafNode(otherlv_0, grammarAccess.getNullCrossRefInterpretedAccess().getNumberSignDigitThreeDigitTwoKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNullCrossRefInterpretedRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getNullCrossRefInterpretedAccess().getRefEObjectCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_foo_2_0=RULE_ID
				{
					newLeafNode(lv_foo_2_0, grammarAccess.getNullCrossRefInterpretedAccess().getFooIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNullCrossRefInterpretedRule());
					}
					setWithLastConsumed(
						$current,
						"foo",
						lv_foo_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleFragmentCaller
entryRuleFragmentCaller returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFragmentCallerRule()); }
	iv_ruleFragmentCaller=ruleFragmentCaller
	{ $current=$iv_ruleFragmentCaller.current; }
	EOF;

// Rule FragmentCaller
ruleFragmentCaller returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#33'
		{
			newLeafNode(otherlv_0, grammarAccess.getFragmentCallerAccess().getNumberSignDigitThreeDigitThreeKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getFragmentCallerAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFragmentCallerRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getFragmentCallerRule());
			}
			newCompositeNode(grammarAccess.getFragmentCallerAccess().getFragment1ParserRuleCall_2());
		}
		this_Fragment1_2=ruleFragment1[$current]
		{
			$current = $this_Fragment1_2.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_val_3_0=RULE_ID
				{
					newLeafNode(lv_val_3_0, grammarAccess.getFragmentCallerAccess().getValIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFragmentCallerRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;


// Rule Fragment1
ruleFragment1[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_fragVal_0_0=RULE_ID
			{
				newLeafNode(lv_fragVal_0_0, grammarAccess.getFragment1Access().getFragValIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFragment1Rule());
				}
				setWithLastConsumed(
					$current,
					"fragVal",
					lv_fragVal_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleParameterCaller
entryRuleParameterCaller returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterCallerRule()); }
	iv_ruleParameterCaller=ruleParameterCaller
	{ $current=$iv_ruleParameterCaller.current; }
	EOF;

// Rule ParameterCaller
ruleParameterCaller returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#34'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterCallerAccess().getNumberSignDigitThreeDigitFourKeyword_0());
		}
		(
			(
				otherlv_1='kw1'
				{
					newLeafNode(otherlv_1, grammarAccess.getParameterCallerAccess().getKw1Keyword_1_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParameterCallerAccess().getPParameterizedParserRuleCall_1_0_1_0());
						}
						lv_p_2_0=norm3_Parameterized
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParameterCallerRule());
							}
							set(
								$current,
								"p",
								lv_p_2_0,
								"org.eclipse.xtext.serializer.SequencerTestLanguage.Parameterized");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_3='kw2'
				{
					newLeafNode(otherlv_3, grammarAccess.getParameterCallerAccess().getKw2Keyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParameterCallerAccess().getPParameterizedParserRuleCall_1_1_1_0());
						}
						lv_p_4_0=norm1_Parameterized
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParameterCallerRule());
							}
							set(
								$current,
								"p",
								lv_p_4_0,
								"org.eclipse.xtext.serializer.SequencerTestLanguage.Parameterized");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_5='kw3'
				{
					newLeafNode(otherlv_5, grammarAccess.getParameterCallerAccess().getKw3Keyword_1_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParameterCallerAccess().getPParameterizedParserRuleCall_1_2_1_0());
						}
						lv_p_6_0=norm2_Parameterized
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParameterCallerRule());
							}
							set(
								$current,
								"p",
								lv_p_6_0,
								"org.eclipse.xtext.serializer.SequencerTestLanguage.Parameterized");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_7='kw4'
				{
					newLeafNode(otherlv_7, grammarAccess.getParameterCallerAccess().getKw4Keyword_1_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParameterCallerAccess().getPParameterizedParserRuleCall_1_3_1_0());
						}
						lv_p_8_0=ruleParameterized
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParameterCallerRule());
							}
							set(
								$current,
								"p",
								lv_p_8_0,
								"org.eclipse.xtext.serializer.SequencerTestLanguage.Parameterized");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleParameterized
entryRuleParameterized returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterizedRule()); }
	iv_ruleParameterized=ruleParameterized
	{ $current=$iv_ruleParameterized.current; }
	EOF;

// Rule Parameterized
ruleParameterized returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kwp2'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterizedAccess().getKwp2Keyword_1_0());
		}
		(
			(
				lv_v2_1_0=RULE_ID
				{
					newLeafNode(lv_v2_1_0, grammarAccess.getParameterizedAccess().getV2IDTerminalRuleCall_1_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterizedRule());
					}
					setWithLastConsumed(
						$current,
						"v2",
						lv_v2_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;


// Rule Parameterized
norm1_Parameterized returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kwp1'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterizedAccess().getKwp1Keyword_0_0());
		}
		(
			(
				lv_v1_1_0=RULE_ID
				{
					newLeafNode(lv_v1_1_0, grammarAccess.getParameterizedAccess().getV1IDTerminalRuleCall_0_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterizedRule());
					}
					setWithLastConsumed(
						$current,
						"v1",
						lv_v1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;


// Rule Parameterized
norm2_Parameterized returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kwp2'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterizedAccess().getKwp2Keyword_1_0());
		}
		(
			(
				lv_v2_1_0=RULE_ID
				{
					newLeafNode(lv_v2_1_0, grammarAccess.getParameterizedAccess().getV2IDTerminalRuleCall_1_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterizedRule());
					}
					setWithLastConsumed(
						$current,
						"v2",
						lv_v2_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='kwp3'
			{
				newLeafNode(otherlv_2, grammarAccess.getParameterizedAccess().getKwp3Keyword_1_2_0());
			}
			(
				(
					lv_v3_3_0=RULE_ID
					{
						newLeafNode(lv_v3_3_0, grammarAccess.getParameterizedAccess().getV3IDTerminalRuleCall_1_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getParameterizedRule());
						}
						setWithLastConsumed(
							$current,
							"v3",
							lv_v3_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
	)
;


// Rule Parameterized
norm3_Parameterized returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kwp1'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterizedAccess().getKwp1Keyword_0_0());
		}
		(
			(
				lv_v1_1_0=RULE_ID
				{
					newLeafNode(lv_v1_1_0, grammarAccess.getParameterizedAccess().getV1IDTerminalRuleCall_0_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterizedRule());
					}
					setWithLastConsumed(
						$current,
						"v1",
						lv_v1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleParameterDelegation
entryRuleParameterDelegation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterDelegationRule()); }
	iv_ruleParameterDelegation=ruleParameterDelegation
	{ $current=$iv_ruleParameterDelegation.current; }
	EOF;

// Rule ParameterDelegation
ruleParameterDelegation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#35'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterDelegationAccess().getNumberSignDigitThreeDigitFiveKeyword_0());
		}
		(
			(
				otherlv_1='kw1'
				{
					newLeafNode(otherlv_1, grammarAccess.getParameterDelegationAccess().getKw1Keyword_1_0_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParameterDelegationAccess().getPDelegationParserRuleCall_1_0_1_0());
						}
						lv_p_2_0=norm3_Delegation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParameterDelegationRule());
							}
							set(
								$current,
								"p",
								lv_p_2_0,
								"org.eclipse.xtext.serializer.SequencerTestLanguage.Delegation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_3='kw2'
				{
					newLeafNode(otherlv_3, grammarAccess.getParameterDelegationAccess().getKw2Keyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getParameterDelegationAccess().getPDelegationParserRuleCall_1_1_1_0());
						}
						lv_p_4_0=norm1_Delegation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getParameterDelegationRule());
							}
							set(
								$current,
								"p",
								lv_p_4_0,
								"org.eclipse.xtext.serializer.SequencerTestLanguage.Delegation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleDelegation
entryRuleDelegation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelegationRule()); }
	iv_ruleDelegation=ruleDelegation
	{ $current=$iv_ruleDelegation.current; }
	EOF;

// Rule Delegation
ruleDelegation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_np_0_0=RULE_INT
			{
				newLeafNode(lv_np_0_0, grammarAccess.getDelegationAccess().getNpINTTerminalRuleCall_0_0_1_0_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDelegationRule());
				}
				setWithLastConsumed(
					$current,
					"np",
					lv_np_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;


// Rule Delegation
norm1_Delegation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kwd'
		{
			newLeafNode(otherlv_0, grammarAccess.getDelegationAccess().getKwdKeyword_1_0());
		}
		{
			newCompositeNode(grammarAccess.getDelegationAccess().getDelegationParserRuleCall_1_1());
		}
		this_Delegation_1=ruleDelegation
		{
			$current = $this_Delegation_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDelegationAccess().getDelegationALeftAction_1_2_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getDelegationAccess().getRc2DelegationParserRuleCall_1_2_1_0());
					}
					lv_rc2_3_0=ruleDelegation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDelegationRule());
						}
						set(
							$current,
							"rc2",
							lv_rc2_3_0,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.Delegation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;


// Rule Delegation
norm2_Delegation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_p_0_0=RULE_ID
			{
				newLeafNode(lv_p_0_0, grammarAccess.getDelegationAccess().getPIDTerminalRuleCall_0_0_0_0_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDelegationRule());
				}
				setWithLastConsumed(
					$current,
					"p",
					lv_p_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;


// Rule Delegation
norm3_Delegation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kwd'
		{
			newLeafNode(otherlv_0, grammarAccess.getDelegationAccess().getKwdKeyword_1_0());
		}
		{
			newCompositeNode(grammarAccess.getDelegationAccess().getDelegationParserRuleCall_1_1());
		}
		this_Delegation_1=norm2_Delegation
		{
			$current = $this_Delegation_1.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDelegationAccess().getDelegationALeftAction_1_2_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getDelegationAccess().getRc2DelegationParserRuleCall_1_2_1_0());
					}
					lv_rc2_3_0=norm2_Delegation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDelegationRule());
						}
						set(
							$current,
							"rc2",
							lv_rc2_3_0,
							"org.eclipse.xtext.serializer.SequencerTestLanguage.Delegation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Rule DefEnum1
ruleDefEnum1 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='kw1'
		{
			$current = grammarAccess.getDefEnum1Access().getKw1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getDefEnum1Access().getKw1EnumLiteralDeclaration());
		}
	)
;

// Rule DefEnum2
ruleDefEnum2 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='kw2'
		{
			$current = grammarAccess.getDefEnum2Access().getKw2EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getDefEnum2Access().getKw2EnumLiteralDeclaration());
		}
	)
;

// Rule DefEnum3
ruleDefEnum3 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='kw3'
		{
			$current = grammarAccess.getDefEnum3Access().getKw3EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getDefEnum3Access().getKw3EnumLiteralDeclaration());
		}
	)
;

RULE_ID1 : '$1' RULE_ID;

RULE_ID2 : '$2' RULE_ID;

RULE_ID3 : '$3' RULE_ID;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
