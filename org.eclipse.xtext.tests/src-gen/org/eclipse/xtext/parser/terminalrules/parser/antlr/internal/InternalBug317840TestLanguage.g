/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug317840TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.terminalrules.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.terminalrules.services.Bug317840TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug317840TestLanguageGrammarAccess grammarAccess;

    public InternalBug317840TestLanguageParser(TokenStream input, Bug317840TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug317840TestLanguageGrammarAccess getGrammarAccess() {
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
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Element");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getFirstNamedParserRuleCall_1_0());
				}
				lv_first_1_0=ruleNamed
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"first",
						lv_first_1_0,
						"org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Named");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getSecondNamedParserRuleCall_2_0());
				}
				lv_second_2_0=ruleNamed
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"second",
						lv_second_2_0,
						"org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Named");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getElementAccess().getThirdNamedParserRuleCall_3_0_0());
					}
					lv_third_3_0=ruleNamed
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						add(
							$current,
							"third",
							lv_third_3_0,
							"org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Named");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getElementAccess().getForthNamedParserRuleCall_3_1_0());
					}
					lv_forth_4_0=ruleNamed
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getElementRule());
						}
						add(
							$current,
							"forth",
							lv_forth_4_0,
							"org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Named");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
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
			{
				newCompositeNode(grammarAccess.getNamedAccess().getNameNAMEParserRuleCall_0());
			}
			lv_name_0_0=ruleNAME
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNamedRule());
				}
				set(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.NAME");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNAME
entryRuleNAME returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getNAMERule()); }
	iv_ruleNAME=ruleNAME
	{ $current=$iv_ruleNAME.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule NAME
ruleNAME returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getNAMEAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getNAMEAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getNAMEAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;
finally {
	myHiddenTokenState.restore();
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
