/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug292245TestLanguage;

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
import org.eclipse.xtext.parser.terminalrules.services.Bug292245TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug292245TestLanguageGrammarAccess grammarAccess;

    public InternalBug292245TestLanguageParser(TokenStream input, Bug292245TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug292245TestLanguageGrammarAccess getGrammarAccess() {
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
entryRuleModel returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='FIX'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFIXKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getFixFixParserRuleCall_0_1_0());
					}
					lv_fix_1_0=ruleFix
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"fix",
							lv_fix_1_0,
							"org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Fix");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)
		    |
		(
			otherlv_2='ERROR'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getERRORKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getErrorErrorParserRuleCall_1_1_0());
					}
					lv_error_3_0=ruleError
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"error",
							lv_error_3_0,
							"org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Error");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)
		    |
		(
			otherlv_4='TICK'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getTICKKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getTickApostropheParserRuleCall_2_1_0());
					}
					lv_tick_5_0=ruleApostrophe
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"tick",
							lv_tick_5_0,
							"org.eclipse.xtext.parser.terminalrules.Bug292245TestLanguage.Apostrophe");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)
	)*
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleError
entryRuleError returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getErrorRule()); }
	iv_ruleError=ruleError
	{ $current=$iv_ruleError.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Error
ruleError returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_APOSTROPHE_CHAR_0=RULE_APOSTROPHE_CHAR
		{
			$current.merge(this_APOSTROPHE_CHAR_0);
		}
		{
			newLeafNode(this_APOSTROPHE_CHAR_0, grammarAccess.getErrorAccess().getAPOSTROPHE_CHARTerminalRuleCall_0());
		}
		{
			newCompositeNode(grammarAccess.getErrorAccess().getGraphicalParserRuleCall_1());
		}
		this_Graphical_1=ruleGraphical
		{
			$current.merge(this_Graphical_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		this_APOSTROPHE_CHAR_2=RULE_APOSTROPHE_CHAR
		{
			$current.merge(this_APOSTROPHE_CHAR_2);
		}
		{
			newLeafNode(this_APOSTROPHE_CHAR_2, grammarAccess.getErrorAccess().getAPOSTROPHE_CHARTerminalRuleCall_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleFix
entryRuleFix returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getFixRule()); }
	iv_ruleFix=ruleFix
	{ $current=$iv_ruleFix.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Fix
ruleFix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_APOSTROPHE_CHAR_0=RULE_APOSTROPHE_CHAR
		{
			$current.merge(this_APOSTROPHE_CHAR_0);
		}
		{
			newLeafNode(this_APOSTROPHE_CHAR_0, grammarAccess.getFixAccess().getAPOSTROPHE_CHARTerminalRuleCall_0());
		}
		{
			newCompositeNode(grammarAccess.getFixAccess().getGraphicalParserRuleCall_1());
		}
		this_Graphical_1=ruleGraphical
		{
			$current.merge(this_Graphical_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		this_APOSTROPHE_CHAR_2=RULE_APOSTROPHE_CHAR
		{
			$current.merge(this_APOSTROPHE_CHAR_2);
		}
		{
			newLeafNode(this_APOSTROPHE_CHAR_2, grammarAccess.getFixAccess().getAPOSTROPHE_CHARTerminalRuleCall_2());
		}
		{
			newCompositeNode(grammarAccess.getFixAccess().getRehideParserRuleCall_3());
		}
		this_Rehide_3=ruleRehide
		{
			$current.merge(this_Rehide_3);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleApostrophe
entryRuleApostrophe returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getApostropheRule()); }
	iv_ruleApostrophe=ruleApostrophe
	{ $current=$iv_ruleApostrophe.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Apostrophe
ruleApostrophe returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	this_APOSTROPHE_CHAR_0=RULE_APOSTROPHE_CHAR
	{
		$current.merge(this_APOSTROPHE_CHAR_0);
	}
	{
		newLeafNode(this_APOSTROPHE_CHAR_0, grammarAccess.getApostropheAccess().getAPOSTROPHE_CHARTerminalRuleCall());
	}
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleRehide
entryRuleRehide returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getRehideRule()); }
	iv_ruleRehide=ruleRehide
	{ $current=$iv_ruleRehide.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Rehide
ruleRehide returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		kw='^'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRehideAccess().getCircumflexAccentKeyword());
		}
	)?
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleGraphical
entryRuleGraphical returns [String current=null]:
	{ newCompositeNode(grammarAccess.getGraphicalRule()); }
	iv_ruleGraphical=ruleGraphical
	{ $current=$iv_ruleGraphical.current.getText(); }
	EOF;

// Rule Graphical
ruleGraphical returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CHAR_0=RULE_CHAR
		{
			$current.merge(this_CHAR_0);
		}
		{
			newLeafNode(this_CHAR_0, grammarAccess.getGraphicalAccess().getCHARTerminalRuleCall_0());
		}
		    |
		this_WS_1=RULE_WS
		{
			$current.merge(this_WS_1);
		}
		{
			newLeafNode(this_WS_1, grammarAccess.getGraphicalAccess().getWSTerminalRuleCall_1());
		}
	)
;

RULE_APOSTROPHE_CHAR : '\'';

RULE_CHAR : ('A'..'Z'|'0'..'9');

RULE_WS : (' '|'\t'|'\r'|'\n')+;
