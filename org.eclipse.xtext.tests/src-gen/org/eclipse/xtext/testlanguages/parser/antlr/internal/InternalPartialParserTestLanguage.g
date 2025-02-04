/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalPartialParserTestLanguage;

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
import org.eclipse.xtext.testlanguages.services.PartialParserTestLanguageGrammarAccess;

}

@parser::members {

 	private PartialParserTestLanguageGrammarAccess grammarAccess;

    public InternalPartialParserTestLanguageParser(TokenStream input, PartialParserTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "SomeContainer";
   	}

   	@Override
   	protected PartialParserTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleSomeContainer
entryRuleSomeContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSomeContainerRule()); }
	iv_ruleSomeContainer=ruleSomeContainer
	{ $current=$iv_ruleSomeContainer.current; }
	EOF;

// Rule SomeContainer
ruleSomeContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='container'
		{
			newLeafNode(otherlv_0, grammarAccess.getSomeContainerAccess().getContainerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSomeContainerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSomeContainerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSomeContainerAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSomeContainerAccess().getNestedNestedParserRuleCall_3_0_0());
					}
					lv_nested_3_0=ruleNested
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSomeContainerRule());
						}
						add(
							$current,
							"nested",
							lv_nested_3_0,
							"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Nested");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getSomeContainerAccess().getContentContentParserRuleCall_3_1_0());
					}
					lv_content_4_0=ruleContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSomeContainerRule());
						}
						add(
							$current,
							"content",
							lv_content_4_0,
							"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Content");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSomeContainerAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleNested
entryRuleNested returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedRule()); }
	iv_ruleNested=ruleNested
	{ $current=$iv_ruleNested.current; }
	EOF;

// Rule Nested
ruleNested returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='nested'
		{
			newLeafNode(otherlv_0, grammarAccess.getNestedAccess().getNestedKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getNestedAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedAccess().getNestedSomeContainerParserRuleCall_2_0());
				}
				lv_nested_2_0=ruleSomeContainer
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedRule());
					}
					add(
						$current,
						"nested",
						lv_nested_2_0,
						"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.SomeContainer");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getNestedAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleContent
entryRuleContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_ruleContent=ruleContent
	{ $current=$iv_ruleContent.current; }
	EOF;

// Rule Content
ruleContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getContentAccess().getChildrenParserRuleCall_0());
		}
		this_Children_0=ruleChildren
		{
			$current = $this_Children_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getContentAccess().getAbstractChildrenParserRuleCall_1());
		}
		this_AbstractChildren_1=ruleAbstractChildren
		{
			$current = $this_AbstractChildren_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleChildren
entryRuleChildren returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildrenRule()); }
	iv_ruleChildren=ruleChildren
	{ $current=$iv_ruleChildren.current; }
	EOF;

// Rule Children
ruleChildren returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='children'
		{
			newLeafNode(otherlv_0, grammarAccess.getChildrenAccess().getChildrenKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getChildrenAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChildrenAccess().getChildrenChildParserRuleCall_2_0());
				}
				lv_children_2_0=ruleChild
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChildrenRule());
					}
					add(
						$current,
						"children",
						lv_children_2_0,
						"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Child");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getChildrenAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getChildrenAccess().getChildrenChildParserRuleCall_3_1_0());
					}
					lv_children_4_0=ruleChild
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getChildrenRule());
						}
						add(
							$current,
							"children",
							lv_children_4_0,
							"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Child");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getChildrenAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleChild
entryRuleChild returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildRule()); }
	iv_ruleChild=ruleChild
	{ $current=$iv_ruleChild.current; }
	EOF;

// Rule Child
ruleChild returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='->'
		{
			newLeafNode(otherlv_0, grammarAccess.getChildAccess().getHyphenMinusGreaterThanSignKeyword_0());
		}
		otherlv_1='C'
		{
			newLeafNode(otherlv_1, grammarAccess.getChildAccess().getCKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getChildAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChildAccess().getValueNamedParserRuleCall_3_0());
				}
				lv_value_3_0=ruleNamed
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChildRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Named");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getChildAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleAbstractChildren
entryRuleAbstractChildren returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractChildrenRule()); }
	iv_ruleAbstractChildren=ruleAbstractChildren
	{ $current=$iv_ruleAbstractChildren.current; }
	EOF;

// Rule AbstractChildren
ruleAbstractChildren returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='abstract children'
		{
			newLeafNode(otherlv_0, grammarAccess.getAbstractChildrenAccess().getAbstractChildrenKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getAbstractChildrenAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractChildrenAccess().getAbstractChildrenAbstractChildParserRuleCall_2_0());
				}
				lv_abstractChildren_2_0=ruleAbstractChild
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractChildrenRule());
					}
					add(
						$current,
						"abstractChildren",
						lv_abstractChildren_2_0,
						"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.AbstractChild");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getAbstractChildrenAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleAbstractChild
entryRuleAbstractChild returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractChildRule()); }
	iv_ruleAbstractChild=ruleAbstractChild
	{ $current=$iv_ruleAbstractChild.current; }
	EOF;

// Rule AbstractChild
ruleAbstractChild returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractChildAccess().getFirstConcreteParserRuleCall_0());
		}
		this_FirstConcrete_0=ruleFirstConcrete
		{
			$current = $this_FirstConcrete_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractChildAccess().getSecondConcreteParserRuleCall_1());
		}
		this_SecondConcrete_1=ruleSecondConcrete
		{
			$current = $this_SecondConcrete_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFirstConcrete
entryRuleFirstConcrete returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFirstConcreteRule()); }
	iv_ruleFirstConcrete=ruleFirstConcrete
	{ $current=$iv_ruleFirstConcrete.current; }
	EOF;

// Rule FirstConcrete
ruleFirstConcrete returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='->'
		{
			newLeafNode(otherlv_0, grammarAccess.getFirstConcreteAccess().getHyphenMinusGreaterThanSignKeyword_0());
		}
		otherlv_1='F'
		{
			newLeafNode(otherlv_1, grammarAccess.getFirstConcreteAccess().getFKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFirstConcreteAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFirstConcreteAccess().getValueNamedParserRuleCall_3_0());
				}
				lv_value_3_0=ruleNamed
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFirstConcreteRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Named");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFirstConcreteRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getFirstConcreteAccess().getReferencedContainerSomeContainerCrossReference_4_0());
				}
			)
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFirstConcreteAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleSecondConcrete
entryRuleSecondConcrete returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSecondConcreteRule()); }
	iv_ruleSecondConcrete=ruleSecondConcrete
	{ $current=$iv_ruleSecondConcrete.current; }
	EOF;

// Rule SecondConcrete
ruleSecondConcrete returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='->'
		{
			newLeafNode(otherlv_0, grammarAccess.getSecondConcreteAccess().getHyphenMinusGreaterThanSignKeyword_0());
		}
		otherlv_1='F'
		{
			newLeafNode(otherlv_1, grammarAccess.getSecondConcreteAccess().getFKeyword_1());
		}
		otherlv_2='S'
		{
			newLeafNode(otherlv_2, grammarAccess.getSecondConcreteAccess().getSKeyword_2());
		}
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getSecondConcreteAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSecondConcreteAccess().getValueNamedParserRuleCall_4_0());
				}
				lv_value_4_0=ruleNamed
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSecondConcreteRule());
					}
					set(
						$current,
						"value",
						lv_value_4_0,
						"org.eclipse.xtext.testlanguages.PartialParserTestLanguage.Named");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSecondConcreteRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getSecondConcreteAccess().getReferencedChildrenChildCrossReference_5_0());
				}
			)
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getSecondConcreteAccess().getRightParenthesisKeyword_6());
		}
	)
;

// Entry rule entryRuleNamed
entryRuleNamed returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedRule()); }
	iv_ruleNamed=ruleNamed
	{ $current=$iv_ruleNamed.current; }
	EOF;

// Rule Named
ruleNamed returns [EObject current=null]
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
				newLeafNode(lv_name_0_0, grammarAccess.getNamedAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNamedRule());
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
