/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug287988TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.linking.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.linking.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.linking.services.Bug287988TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug287988TestLanguageGrammarAccess grammarAccess;

    public InternalBug287988TestLanguageParser(TokenStream input, Bug287988TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug287988TestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='actions'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getActionsKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getAttributesBaseAttributeParserRuleCall_0_1_0());
					}
					lv_attributes_1_0=ruleBaseAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_1_0,
							"org.eclipse.xtext.linking.Bug287988TestLanguage.BaseAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			otherlv_2='simple'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSimpleKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getAttributesSimpleAttributeParserRuleCall_1_1_0());
					}
					lv_attributes_3_0=ruleSimpleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_3_0,
							"org.eclipse.xtext.linking.Bug287988TestLanguage.SimpleAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			otherlv_4='rulecall'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRulecallKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getAttributesRuleCallAttributeParserRuleCall_2_1_0());
					}
					lv_attributes_5_0=ruleRuleCallAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_5_0,
							"org.eclipse.xtext.linking.Bug287988TestLanguage.RuleCallAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			otherlv_6='rulecall2'
			{
				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRulecall2Keyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getAttributesRuleCallAttribute2ParserRuleCall_3_1_0());
					}
					lv_attributes_7_0=ruleRuleCallAttribute2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_7_0,
							"org.eclipse.xtext.linking.Bug287988TestLanguage.RuleCallAttribute2");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			otherlv_8='rulecall3'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRulecall3Keyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getAttributesRuleCallAttribute3ParserRuleCall_4_1_0());
					}
					lv_attributes_9_0=ruleRuleCallAttribute3
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_9_0,
							"org.eclipse.xtext.linking.Bug287988TestLanguage.RuleCallAttribute3");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			otherlv_10='inlinedActions'
			{
				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getInlinedActionsKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getAttributesActionAttributeParserRuleCall_5_1_0());
					}
					lv_attributes_11_0=ruleActionAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_11_0,
							"org.eclipse.xtext.linking.Bug287988TestLanguage.ActionAttribute");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
	)
;

// Entry rule entryRuleBaseAttribute
entryRuleBaseAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBaseAttributeRule()); }
	iv_ruleBaseAttribute=ruleBaseAttribute
	{ $current=$iv_ruleBaseAttribute.current; }
	EOF;

// Rule BaseAttribute
ruleBaseAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getBaseAttributeAccess().getAttributeParserRuleCall_0_0());
			}
			this_Attribute_0=ruleAttribute
			{
				$current = $this_Attribute_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getBaseAttributeAccess().getMasterParserRuleCall_0_1());
			}
			this_Master_1=ruleMaster
			{
				$current = $this_Master_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			(
				otherlv_2='ref'
				{
					newLeafNode(otherlv_2, grammarAccess.getBaseAttributeAccess().getRefKeyword_1_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getBaseAttributeRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getBaseAttributeAccess().getTypeRefBaseAttributeCrossReference_1_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					lv_type_4_0=RULE_ID
					{
						newLeafNode(lv_type_4_0, grammarAccess.getBaseAttributeAccess().getTypeIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBaseAttributeRule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		(
			(
				lv_name_5_0=RULE_ID
				{
					newLeafNode(lv_name_5_0, grammarAccess.getBaseAttributeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBaseAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_5_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getBaseAttributeAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
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
					grammarAccess.getAttributeAccess().getAttributeAction_0(),
					$current);
			}
		)
		otherlv_1='attribute'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
		}
	)
;

// Entry rule entryRuleMaster
entryRuleMaster returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMasterRule()); }
	iv_ruleMaster=ruleMaster
	{ $current=$iv_ruleMaster.current; }
	EOF;

// Rule Master
ruleMaster returns [EObject current=null]
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
					grammarAccess.getMasterAccess().getMasterAction_0(),
					$current);
			}
		)
		otherlv_1='master'
		{
			newLeafNode(otherlv_1, grammarAccess.getMasterAccess().getMasterKeyword_1());
		}
	)
;

// Entry rule entryRuleActionAttribute
entryRuleActionAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionAttributeRule()); }
	iv_ruleActionAttribute=ruleActionAttribute
	{ $current=$iv_ruleActionAttribute.current; }
	EOF;

// Rule ActionAttribute
ruleActionAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getActionAttributeAccess().getAttributeAction_0_0_0(),
							$current);
					}
				)
				otherlv_1='attribute'
				{
					newLeafNode(otherlv_1, grammarAccess.getActionAttributeAccess().getAttributeKeyword_0_0_1());
				}
			)
			    |
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getActionAttributeAccess().getMasterAction_0_1_0(),
							$current);
					}
				)
				otherlv_3='master'
				{
					newLeafNode(otherlv_3, grammarAccess.getActionAttributeAccess().getMasterKeyword_0_1_1());
				}
			)
		)
		(
			(
				otherlv_4='ref'
				{
					newLeafNode(otherlv_4, grammarAccess.getActionAttributeAccess().getRefKeyword_1_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActionAttributeRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getActionAttributeAccess().getTypeRefBaseAttributeCrossReference_1_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					lv_type_6_0=RULE_ID
					{
						newLeafNode(lv_type_6_0, grammarAccess.getActionAttributeAccess().getTypeIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getActionAttributeRule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_6_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		(
			(
				lv_name_7_0=RULE_ID
				{
					newLeafNode(lv_name_7_0, grammarAccess.getActionAttributeAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_7_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_8=';'
		{
			newLeafNode(otherlv_8, grammarAccess.getActionAttributeAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleSimpleAttribute
entryRuleSimpleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleAttributeRule()); }
	iv_ruleSimpleAttribute=ruleSimpleAttribute
	{ $current=$iv_ruleSimpleAttribute.current; }
	EOF;

// Rule SimpleAttribute
ruleSimpleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				otherlv_0='ref'
				{
					newLeafNode(otherlv_0, grammarAccess.getSimpleAttributeAccess().getRefKeyword_0_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSimpleAttributeRule());
							}
						}
						otherlv_1=RULE_ID
						{
							newLeafNode(otherlv_1, grammarAccess.getSimpleAttributeAccess().getTypeRefBaseAttributeCrossReference_0_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					lv_type_2_0=RULE_ID
					{
						newLeafNode(lv_type_2_0, grammarAccess.getSimpleAttributeAccess().getTypeIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSimpleAttributeRule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getSimpleAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getSimpleAttributeAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleRuleCallAttribute
entryRuleRuleCallAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleCallAttributeRule()); }
	iv_ruleRuleCallAttribute=ruleRuleCallAttribute
	{ $current=$iv_ruleRuleCallAttribute.current; }
	EOF;

// Rule RuleCallAttribute
ruleRuleCallAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRuleCallAttributeAccess().getCallMeParserRuleCall_0());
		}
		this_CallMe_0=ruleCallMe
		{
			$current = $this_CallMe_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRuleCallAttributeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleCallAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getRuleCallAttributeAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleCallMe
entryRuleCallMe returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallMeRule()); }
	iv_ruleCallMe=ruleCallMe
	{ $current=$iv_ruleCallMe.current; }
	EOF;

// Rule CallMe
ruleCallMe returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='ref'
			{
				newLeafNode(otherlv_0, grammarAccess.getCallMeAccess().getRefKeyword_0_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCallMeRule());
						}
					}
					otherlv_1=RULE_ID
					{
						newLeafNode(otherlv_1, grammarAccess.getCallMeAccess().getTypeRefBaseAttributeCrossReference_0_1_0());
					}
				)
			)
		)
		    |
		(
			(
				lv_type_2_0=RULE_ID
				{
					newLeafNode(lv_type_2_0, grammarAccess.getCallMeAccess().getTypeIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCallMeRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleRuleCallAttribute2
entryRuleRuleCallAttribute2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleCallAttribute2Rule()); }
	iv_ruleRuleCallAttribute2=ruleRuleCallAttribute2
	{ $current=$iv_ruleRuleCallAttribute2.current; }
	EOF;

// Rule RuleCallAttribute2
ruleRuleCallAttribute2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRuleCallAttribute2Access().getCallMe2ParserRuleCall_0());
		}
		this_CallMe2_0=ruleCallMe2
		{
			$current = $this_CallMe2_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				otherlv_1='ref'
				{
					newLeafNode(otherlv_1, grammarAccess.getRuleCallAttribute2Access().getRefKeyword_1_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRuleCallAttribute2Rule());
							}
						}
						otherlv_2=RULE_ID
						{
							newLeafNode(otherlv_2, grammarAccess.getRuleCallAttribute2Access().getTypeRefBaseAttributeCrossReference_1_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					lv_type_3_0=RULE_ID
					{
						newLeafNode(lv_type_3_0, grammarAccess.getRuleCallAttribute2Access().getTypeIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRuleCallAttribute2Rule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getRuleCallAttribute2Access().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleCallMe2
entryRuleCallMe2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallMe2Rule()); }
	iv_ruleCallMe2=ruleCallMe2
	{ $current=$iv_ruleCallMe2.current; }
	EOF;

// Rule CallMe2
ruleCallMe2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getCallMe2Access().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCallMe2Rule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleRuleCallAttribute3
entryRuleRuleCallAttribute3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleCallAttribute3Rule()); }
	iv_ruleRuleCallAttribute3=ruleRuleCallAttribute3
	{ $current=$iv_ruleRuleCallAttribute3.current; }
	EOF;

// Rule RuleCallAttribute3
ruleRuleCallAttribute3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getRuleCallAttribute3Access().getCallMe3ParserRuleCall_0());
		}
		this_CallMe3_0=ruleCallMe3
		{
			$current = $this_CallMe3_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				otherlv_1='ref'
				{
					newLeafNode(otherlv_1, grammarAccess.getRuleCallAttribute3Access().getRefKeyword_1_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRuleCallAttribute3Rule());
							}
						}
						otherlv_2=RULE_ID
						{
							newLeafNode(otherlv_2, grammarAccess.getRuleCallAttribute3Access().getTypeRefBaseAttributeCrossReference_1_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					lv_type_3_0=RULE_ID
					{
						newLeafNode(lv_type_3_0, grammarAccess.getRuleCallAttribute3Access().getTypeIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRuleCallAttribute3Rule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getRuleCallAttribute3Access().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleCallMe3
entryRuleCallMe3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallMe3Rule()); }
	iv_ruleCallMe3=ruleCallMe3
	{ $current=$iv_ruleCallMe3.current; }
	EOF;

// Rule CallMe3
ruleCallMe3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='call'
		{
			newLeafNode(otherlv_0, grammarAccess.getCallMe3Access().getCallKeyword_0());
		}
		otherlv_1='me'
		{
			newLeafNode(otherlv_1, grammarAccess.getCallMe3Access().getMeKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getCallMe3Access().getCallMe4ParserRuleCall_2());
		}
		this_CallMe4_2=ruleCallMe4
		{
			$current = $this_CallMe4_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCallMe4
entryRuleCallMe4 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCallMe4Rule()); }
	iv_ruleCallMe4=ruleCallMe4
	{ $current=$iv_ruleCallMe4.current; }
	EOF;

// Rule CallMe4
ruleCallMe4 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getCallMe4Access().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCallMe4Rule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
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
