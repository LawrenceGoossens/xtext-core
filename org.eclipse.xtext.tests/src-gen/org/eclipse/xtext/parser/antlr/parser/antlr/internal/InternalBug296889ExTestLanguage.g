/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug296889ExTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.services.Bug296889ExTestLanguageGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private Bug296889ExTestLanguageGrammarAccess grammarAccess;

    public InternalBug296889ExTestLanguageParser(TokenStream input, Bug296889ExTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug296889ExTestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='Model'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getExpressionsExpressionParserRuleCall_0_1_0());
					}
					lv_expressions_1_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_1_0,
							"org.eclipse.xtext.parser.antlr.Bug296889ExTestLanguage.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		    |
		(
			otherlv_2='DataType'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getDataTypeKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getValuesDataTypeExpressionParserRuleCall_1_1_0());
					}
					lv_values_3_0=ruleDataTypeExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"values",
							lv_values_3_0,
							"org.eclipse.xtext.parser.antlr.Bug296889ExTestLanguage.DataTypeExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getPostopParserRuleCall_0());
		}
		this_Postop_0=rulePostop
		{
			$current = $this_Postop_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getExpressionAccess().getPreopParserRuleCall_1());
		}
		this_Preop_1=rulePreop
		{
			$current = $this_Preop_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePreop
entryRulePreop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreopRule()); }
	iv_rulePreop=rulePreop
	{ $current=$iv_rulePreop.current; }
	EOF;

// Rule Preop
rulePreop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getPreopAccess().getPreopAction_0(),
					$current);
			}
		)
		(
			(
				lv_functionName_1_0='--'
				{
					newLeafNode(lv_functionName_1_0, grammarAccess.getPreopAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPreopRule());
					}
					setWithLastConsumed($current, "functionName", lv_functionName_1_0, "--");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPreopAccess().getExprVariableParserRuleCall_2_0());
				}
				lv_expr_2_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreopRule());
					}
					set(
						$current,
						"expr",
						lv_expr_2_0,
						"org.eclipse.xtext.parser.antlr.Bug296889ExTestLanguage.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePostop
entryRulePostop returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPostopRule()); }
	iv_rulePostop=rulePostop
	{ $current=$iv_rulePostop.current; }
	EOF;

// Rule Postop
rulePostop returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPostopAccess().getVariableParserRuleCall_0());
		}
		this_Variable_0=ruleVariable
		{
			$current = $this_Variable_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPostopAccess().getPostopExprAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_functionName_2_0='--'
					{
						newLeafNode(lv_functionName_2_0, grammarAccess.getPostopAccess().getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPostopRule());
						}
						setWithLastConsumed($current, "functionName", lv_functionName_2_0, "--");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getVariableAccess().getVariableAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDataTypeExpression
entryRuleDataTypeExpression returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeExpressionRule()); }
	iv_ruleDataTypeExpression=ruleDataTypeExpression
	{ $current=$iv_ruleDataTypeExpression.current.getText(); }
	EOF;

// Rule DataTypeExpression
ruleDataTypeExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataTypeExpressionAccess().getDataTypePostopParserRuleCall_0());
		}
		this_DataTypePostop_0=ruleDataTypePostop
		{
			$current.merge(this_DataTypePostop_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDataTypeExpressionAccess().getDataTypePreopParserRuleCall_1());
		}
		this_DataTypePreop_1=ruleDataTypePreop
		{
			$current.merge(this_DataTypePreop_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataTypePreop
entryRuleDataTypePreop returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDataTypePreopRule()); }
	iv_ruleDataTypePreop=ruleDataTypePreop
	{ $current=$iv_ruleDataTypePreop.current.getText(); }
	EOF;

// Rule DataTypePreop
ruleDataTypePreop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='--'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDataTypePreopAccess().getHyphenMinusHyphenMinusKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getDataTypePreopAccess().getDataTypeVariableParserRuleCall_1());
		}
		this_DataTypeVariable_1=ruleDataTypeVariable
		{
			$current.merge(this_DataTypeVariable_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataTypePostop
entryRuleDataTypePostop returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDataTypePostopRule()); }
	iv_ruleDataTypePostop=ruleDataTypePostop
	{ $current=$iv_ruleDataTypePostop.current.getText(); }
	EOF;

// Rule DataTypePostop
ruleDataTypePostop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataTypePostopAccess().getDataTypeVariableParserRuleCall_0());
		}
		this_DataTypeVariable_0=ruleDataTypeVariable
		{
			$current.merge(this_DataTypeVariable_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='--'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getDataTypePostopAccess().getHyphenMinusHyphenMinusKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleDataTypeVariable
entryRuleDataTypeVariable returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeVariableRule()); }
	iv_ruleDataTypeVariable=ruleDataTypeVariable
	{ $current=$iv_ruleDataTypeVariable.current.getText(); }
	EOF;

// Rule DataTypeVariable
ruleDataTypeVariable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
		newLeafNode(this_ID_0, grammarAccess.getDataTypeVariableAccess().getIDTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
