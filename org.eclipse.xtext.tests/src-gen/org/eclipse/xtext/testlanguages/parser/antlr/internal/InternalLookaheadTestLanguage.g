/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalLookaheadTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.services.LookaheadTestLanguageGrammarAccess;

}

@parser::members {

 	private LookaheadTestLanguageGrammarAccess grammarAccess;

    public InternalLookaheadTestLanguageParser(TokenStream input, LookaheadTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Entry";
   	}

   	@Override
   	protected LookaheadTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEntry
entryRuleEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntryRule()); }
	iv_ruleEntry=ruleEntry
	{ $current=$iv_ruleEntry.current; }
	EOF;

// Rule Entry
ruleEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getEntryAccess().getContentsAltsParserRuleCall_0());
			}
			lv_contents_0_0=ruleAlts
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getEntryRule());
				}
				add(
					$current,
					"contents",
					lv_contents_0_0,
					"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.Alts");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAlts
entryRuleAlts returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAltsRule()); }
	iv_ruleAlts=ruleAlts
	{ $current=$iv_ruleAlts.current; }
	EOF;

// Rule Alts
ruleAlts returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAltsAccess().getLookAhead0ParserRuleCall_0());
		}
		this_LookAhead0_0=ruleLookAhead0
		{
			$current = $this_LookAhead0_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAltsAccess().getLookAhead1ParserRuleCall_1());
		}
		this_LookAhead1_1=ruleLookAhead1
		{
			$current = $this_LookAhead1_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAltsAccess().getLookAhead3ParserRuleCall_2());
		}
		this_LookAhead3_2=ruleLookAhead3
		{
			$current = $this_LookAhead3_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			((
				(
				)
				'zonk'
				'a'
				'b'
			)
			)=>
			{
				newCompositeNode(grammarAccess.getAltsAccess().getLookAheadPredicateParserRuleCall_3());
			}
			this_LookAheadPredicate_3=ruleLookAheadPredicate
			{
				$current = $this_LookAheadPredicate_3.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getAltsAccess().getLookBeyondParserRuleCall_4());
		}
		this_LookBeyond_4=ruleLookBeyond
		{
			$current = $this_LookBeyond_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleLookAhead0
entryRuleLookAhead0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookAhead0Rule()); }
	iv_ruleLookAhead0=ruleLookAhead0
	{ $current=$iv_ruleLookAhead0.current; }
	EOF;

// Rule LookAhead0
ruleLookAhead0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bar'
		{
			newLeafNode(otherlv_0, grammarAccess.getLookAhead0Access().getBarKeyword_0());
		}
		(
			(
				lv_x_1_0='a'
				{
					newLeafNode(lv_x_1_0, grammarAccess.getLookAhead0Access().getXAKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLookAhead0Rule());
					}
					setWithLastConsumed($current, "x", lv_x_1_0, "a");
				}
			)
		)
	)
;

// Entry rule entryRuleLookAhead1
entryRuleLookAhead1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookAhead1Rule()); }
	iv_ruleLookAhead1=ruleLookAhead1
	{ $current=$iv_ruleLookAhead1.current; }
	EOF;

// Rule LookAhead1
ruleLookAhead1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='foo'
		{
			newLeafNode(otherlv_0, grammarAccess.getLookAhead1Access().getFooKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLookAhead1Access().getYLookAhead2ParserRuleCall_1_0());
				}
				lv_y_1_0=ruleLookAhead2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLookAhead1Rule());
					}
					set(
						$current,
						"y",
						lv_y_1_0,
						"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_x_2_0='b'
				{
					newLeafNode(lv_x_2_0, grammarAccess.getLookAhead1Access().getXBKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLookAhead1Rule());
					}
					setWithLastConsumed($current, "x", lv_x_2_0, "b");
				}
			)
		)
		(
			(
				lv_z_3_0='d'
				{
					newLeafNode(lv_z_3_0, grammarAccess.getLookAhead1Access().getZDKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLookAhead1Rule());
					}
					setWithLastConsumed($current, "z", lv_z_3_0, "d");
				}
			)
		)
	)
;

// Entry rule entryRuleLookAhead2
entryRuleLookAhead2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookAhead2Rule()); }
	iv_ruleLookAhead2=ruleLookAhead2
	{ $current=$iv_ruleLookAhead2.current; }
	EOF;

// Rule LookAhead2
ruleLookAhead2 returns [EObject current=null]
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
					lv_z_0_0='foo'
					{
						newLeafNode(lv_z_0_0, grammarAccess.getLookAhead2Access().getZFooKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLookAhead2Rule());
						}
						setWithLastConsumed($current, "z", lv_z_0_0, "foo");
					}
				)
			)
			    |
			(
				(
					lv_z_1_0='bar'
					{
						newLeafNode(lv_z_1_0, grammarAccess.getLookAhead2Access().getZBarKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLookAhead2Rule());
						}
						setWithLastConsumed($current, "z", lv_z_1_0, "bar");
					}
				)
			)
		)
		otherlv_2='c'
		{
			newLeafNode(otherlv_2, grammarAccess.getLookAhead2Access().getCKeyword_1());
		}
	)
;

// Entry rule entryRuleLookAhead3
entryRuleLookAhead3 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookAhead3Rule()); }
	iv_ruleLookAhead3=ruleLookAhead3
	{ $current=$iv_ruleLookAhead3.current; }
	EOF;

// Rule LookAhead3
ruleLookAhead3 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='foo'
		{
			newLeafNode(otherlv_0, grammarAccess.getLookAhead3Access().getFooKeyword_0());
		}
		otherlv_1='bar'
		{
			newLeafNode(otherlv_1, grammarAccess.getLookAhead3Access().getBarKeyword_1());
		}
		(
			(
				lv_x_2_0='b'
				{
					newLeafNode(lv_x_2_0, grammarAccess.getLookAhead3Access().getXBKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLookAhead3Rule());
					}
					setWithLastConsumed($current, "x", lv_x_2_0, "b");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLookAhead3Access().getZLookAhead4ParserRuleCall_3_0());
				}
				lv_z_3_0=ruleLookAhead4
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLookAhead3Rule());
					}
					set(
						$current,
						"z",
						lv_z_3_0,
						"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAhead4");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLookAhead4
entryRuleLookAhead4 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookAhead4Rule()); }
	iv_ruleLookAhead4=ruleLookAhead4
	{ $current=$iv_ruleLookAhead4.current; }
	EOF;

// Rule LookAhead4
ruleLookAhead4 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_x_0_0='c'
				{
					newLeafNode(lv_x_0_0, grammarAccess.getLookAhead4Access().getXCKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLookAhead4Rule());
					}
					setWithLastConsumed($current, "x", lv_x_0_0, "c");
				}
			)
		)
		    |
		(
			(
				lv_x_1_0='d'
				{
					newLeafNode(lv_x_1_0, grammarAccess.getLookAhead4Access().getXDKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLookAhead4Rule());
					}
					setWithLastConsumed($current, "x", lv_x_1_0, "d");
				}
			)
		)
	)
;

// Entry rule entryRuleLookAheadPredicate
entryRuleLookAheadPredicate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookAheadPredicateRule()); }
	iv_ruleLookAheadPredicate=ruleLookAheadPredicate
	{ $current=$iv_ruleLookAheadPredicate.current; }
	EOF;

// Rule LookAheadPredicate
ruleLookAheadPredicate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			((
				(
				)
				'zonk'
				'a'
				'b'
			)
			)=>
			(
				(
					{
						$current = forceCreateModelElement(
							grammarAccess.getLookAheadPredicateAccess().getLookAheadPredicateAction_0_0_0(),
							$current);
					}
				)
				otherlv_1='zonk'
				{
					newLeafNode(otherlv_1, grammarAccess.getLookAheadPredicateAccess().getZonkKeyword_0_0_1());
				}
				otherlv_2='a'
				{
					newLeafNode(otherlv_2, grammarAccess.getLookAheadPredicateAccess().getAKeyword_0_0_2());
				}
				otherlv_3='b'
				{
					newLeafNode(otherlv_3, grammarAccess.getLookAheadPredicateAccess().getBKeyword_0_0_3());
				}
			)
		)
		otherlv_4='d'
		{
			newLeafNode(otherlv_4, grammarAccess.getLookAheadPredicateAccess().getDKeyword_1());
		}
	)
;

// Entry rule entryRuleLookBeyond
entryRuleLookBeyond returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookBeyondRule()); }
	iv_ruleLookBeyond=ruleLookBeyond
	{ $current=$iv_ruleLookBeyond.current; }
	EOF;

// Rule LookBeyond
ruleLookBeyond returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getLookBeyondAccess().getLeftLookAheadStringsParserRuleCall_0_0());
				}
				lv_left_0_0=ruleLookAheadStrings
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLookBeyondRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.LookAheadStrings");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getLookBeyondAccess().getRightFewerLookAheadStringsParserRuleCall_1_0());
				}
				lv_right_1_0=ruleFewerLookAheadStrings
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLookBeyondRule());
					}
					set(
						$current,
						"right",
						lv_right_1_0,
						"org.eclipse.xtext.testlanguages.LookaheadTestLanguage.FewerLookAheadStrings");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLookAheadStrings
entryRuleLookAheadStrings returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLookAheadStringsRule()); }
	iv_ruleLookAheadStrings=ruleLookAheadStrings
	{ $current=$iv_ruleLookAheadStrings.current; }
	EOF;

// Rule LookAheadStrings
ruleLookAheadStrings returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_values_0_0=RULE_STRING
			{
				newLeafNode(lv_values_0_0, grammarAccess.getLookAheadStringsAccess().getValuesSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getLookAheadStringsRule());
				}
				addWithLastConsumed(
					$current,
					"values",
					lv_values_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)+
;

// Entry rule entryRuleFewerLookAheadStrings
entryRuleFewerLookAheadStrings returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFewerLookAheadStringsRule()); }
	iv_ruleFewerLookAheadStrings=ruleFewerLookAheadStrings
	{ $current=$iv_ruleFewerLookAheadStrings.current; }
	EOF;

// Rule FewerLookAheadStrings
ruleFewerLookAheadStrings returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_values_0_0=RULE_STRING
				{
					newLeafNode(lv_values_0_0, grammarAccess.getFewerLookAheadStringsAccess().getValuesSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFewerLookAheadStringsRule());
					}
					addWithLastConsumed(
						$current,
						"values",
						lv_values_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_values_1_0=RULE_STRING
				{
					newLeafNode(lv_values_1_0, grammarAccess.getFewerLookAheadStringsAccess().getValuesSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFewerLookAheadStringsRule());
					}
					addWithLastConsumed(
						$current,
						"values",
						lv_values_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_values_2_0=RULE_ID
				{
					newLeafNode(lv_values_2_0, grammarAccess.getFewerLookAheadStringsAccess().getValuesIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFewerLookAheadStringsRule());
					}
					addWithLastConsumed(
						$current,
						"values",
						lv_values_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
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
