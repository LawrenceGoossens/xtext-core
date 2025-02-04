/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSerializationErrorTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.reconstr.services.SerializationErrorTestLanguageGrammarAccess;

}

@parser::members {

 	private SerializationErrorTestLanguageGrammarAccess grammarAccess;

    public InternalSerializationErrorTestLanguageParser(TokenStream input, SerializationErrorTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SerializationErrorTestLanguageGrammarAccess getGrammarAccess() {
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
					newCompositeNode(grammarAccess.getModelAccess().getTestTestParserRuleCall_0_0());
				}
				lv_test_0_0=ruleTest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"test",
						lv_test_0_0,
						"org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.Test");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getTestParenthesisParserRuleCall_1_0());
				}
				lv_test_1_0=ruleParenthesis
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"test",
						lv_test_1_0,
						"org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.Parenthesis");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesisAccess().getTestParserRuleCall_1());
		}
		this_Test_1=ruleTest
		{
			$current = $this_Test_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleTest
entryRuleTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestRule()); }
	iv_ruleTest=ruleTest
	{ $current=$iv_ruleTest.current; }
	EOF;

// Rule Test
ruleTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTestAccess().getTwoRequiredParserRuleCall_0());
		}
		this_TwoRequired_0=ruleTwoRequired
		{
			$current = $this_TwoRequired_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTestAccess().getTwoOptionsParserRuleCall_1());
		}
		this_TwoOptions_1=ruleTwoOptions
		{
			$current = $this_TwoOptions_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTestAccess().getIndentParserRuleCall_2());
		}
		this_Indent_2=ruleIndent
		{
			$current = $this_Indent_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTwoRequired
entryRuleTwoRequired returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTwoRequiredRule()); }
	iv_ruleTwoRequired=ruleTwoRequired
	{ $current=$iv_ruleTwoRequired.current; }
	EOF;

// Rule TwoRequired
ruleTwoRequired returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='tworequired'
		{
			newLeafNode(otherlv_0, grammarAccess.getTwoRequiredAccess().getTworequiredKeyword_0());
		}
		(
			(
				lv_one_1_0=RULE_ID
				{
					newLeafNode(lv_one_1_0, grammarAccess.getTwoRequiredAccess().getOneIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoRequiredRule());
					}
					setWithLastConsumed(
						$current,
						"one",
						lv_one_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_two_2_0=RULE_ID
				{
					newLeafNode(lv_two_2_0, grammarAccess.getTwoRequiredAccess().getTwoIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTwoRequiredRule());
					}
					setWithLastConsumed(
						$current,
						"two",
						lv_two_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTwoOptions
entryRuleTwoOptions returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTwoOptionsRule()); }
	iv_ruleTwoOptions=ruleTwoOptions
	{ $current=$iv_ruleTwoOptions.current; }
	EOF;

// Rule TwoOptions
ruleTwoOptions returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='twooptions'
		{
			newLeafNode(otherlv_0, grammarAccess.getTwoOptionsAccess().getTwooptionsKeyword_0());
		}
		(
			(
				otherlv_1='one'
				{
					newLeafNode(otherlv_1, grammarAccess.getTwoOptionsAccess().getOneKeyword_1_0_0());
				}
				(
					(
						lv_one_2_0=RULE_ID
						{
							newLeafNode(lv_one_2_0, grammarAccess.getTwoOptionsAccess().getOneIDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTwoOptionsRule());
							}
							setWithLastConsumed(
								$current,
								"one",
								lv_one_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				otherlv_3='two'
				{
					newLeafNode(otherlv_3, grammarAccess.getTwoOptionsAccess().getTwoKeyword_1_1_0());
				}
				(
					(
						lv_two_4_0=RULE_ID
						{
							newLeafNode(lv_two_4_0, grammarAccess.getTwoOptionsAccess().getTwoIDTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTwoOptionsRule());
							}
							setWithLastConsumed(
								$current,
								"two",
								lv_two_4_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleIndent
entryRuleIndent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIndentRule()); }
	iv_ruleIndent=ruleIndent
	{ $current=$iv_ruleIndent.current; }
	EOF;

// Rule Indent
ruleIndent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getIndentAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIndentAccess().getReqTwoRequiredParserRuleCall_1_0());
				}
				lv_req_1_0=ruleTwoRequired
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIndentRule());
					}
					set(
						$current,
						"req",
						lv_req_1_0,
						"org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.TwoRequired");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getIndentAccess().getOptTwoOptionsParserRuleCall_2_0());
				}
				lv_opt_2_0=ruleTwoOptions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIndentRule());
					}
					set(
						$current,
						"opt",
						lv_opt_2_0,
						"org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.TwoOptions");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getIndentAccess().getIndentIndentParserRuleCall_3_0());
				}
				lv_indent_3_0=ruleIndent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIndentRule());
					}
					add(
						$current,
						"indent",
						lv_indent_3_0,
						"org.eclipse.xtext.parsetree.reconstr.SerializationErrorTestLanguage.Indent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getIndentAccess().getRightCurlyBracketKeyword_4());
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
