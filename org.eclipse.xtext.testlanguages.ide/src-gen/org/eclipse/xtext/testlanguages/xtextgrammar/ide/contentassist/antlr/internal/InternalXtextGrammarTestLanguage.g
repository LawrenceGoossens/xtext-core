/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalXtextGrammarTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.xtextgrammar.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.xtextgrammar.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xtext.testlanguages.xtextgrammar.services.XtextGrammarTestLanguageGrammarAccess;

}
@parser::members {
	private XtextGrammarTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(XtextGrammarTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleGrammar
entryRuleGrammar
:
{ before(grammarAccess.getGrammarRule()); }
	 ruleGrammar
{ after(grammarAccess.getGrammarRule()); } 
	 EOF 
;

// Rule Grammar
ruleGrammar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGrammarAccess().getGroup()); }
		(rule__Grammar__Group__0)
		{ after(grammarAccess.getGrammarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGrammarID
entryRuleGrammarID
:
{ before(grammarAccess.getGrammarIDRule()); }
	 ruleGrammarID
{ after(grammarAccess.getGrammarIDRule()); } 
	 EOF 
;

// Rule GrammarID
ruleGrammarID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGrammarIDAccess().getGroup()); }
		(rule__GrammarID__Group__0)
		{ after(grammarAccess.getGrammarIDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractRule
entryRuleAbstractRule
:
{ before(grammarAccess.getAbstractRuleRule()); }
	 ruleAbstractRule
{ after(grammarAccess.getAbstractRuleRule()); } 
	 EOF 
;

// Rule AbstractRule
ruleAbstractRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractRuleAccess().getAlternatives()); }
		(rule__AbstractRule__Alternatives)
		{ after(grammarAccess.getAbstractRuleAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractMetamodelDeclaration
entryRuleAbstractMetamodelDeclaration
:
{ before(grammarAccess.getAbstractMetamodelDeclarationRule()); }
	 ruleAbstractMetamodelDeclaration
{ after(grammarAccess.getAbstractMetamodelDeclarationRule()); } 
	 EOF 
;

// Rule AbstractMetamodelDeclaration
ruleAbstractMetamodelDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives()); }
		(rule__AbstractMetamodelDeclaration__Alternatives)
		{ after(grammarAccess.getAbstractMetamodelDeclarationAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGeneratedMetamodel
entryRuleGeneratedMetamodel
:
{ before(grammarAccess.getGeneratedMetamodelRule()); }
	 ruleGeneratedMetamodel
{ after(grammarAccess.getGeneratedMetamodelRule()); } 
	 EOF 
;

// Rule GeneratedMetamodel
ruleGeneratedMetamodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGeneratedMetamodelAccess().getGroup()); }
		(rule__GeneratedMetamodel__Group__0)
		{ after(grammarAccess.getGeneratedMetamodelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReferencedMetamodel
entryRuleReferencedMetamodel
:
{ before(grammarAccess.getReferencedMetamodelRule()); }
	 ruleReferencedMetamodel
{ after(grammarAccess.getReferencedMetamodelRule()); } 
	 EOF 
;

// Rule ReferencedMetamodel
ruleReferencedMetamodel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReferencedMetamodelAccess().getGroup()); }
		(rule__ReferencedMetamodel__Group__0)
		{ after(grammarAccess.getReferencedMetamodelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParserRule
entryRuleParserRule
:
{ before(grammarAccess.getParserRuleRule()); }
	 ruleParserRule
{ after(grammarAccess.getParserRuleRule()); } 
	 EOF 
;

// Rule ParserRule
ruleParserRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParserRuleAccess().getGroup()); }
		(rule__ParserRule__Group__0)
		{ after(grammarAccess.getParserRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeRef
entryRuleTypeRef
:
{ before(grammarAccess.getTypeRefRule()); }
	 ruleTypeRef
{ after(grammarAccess.getTypeRefRule()); } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeRefAccess().getGroup()); }
		(rule__TypeRef__Group__0)
		{ after(grammarAccess.getTypeRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAlternatives
entryRuleAlternatives
:
{ before(grammarAccess.getAlternativesRule()); }
	 ruleAlternatives
{ after(grammarAccess.getAlternativesRule()); } 
	 EOF 
;

// Rule Alternatives
ruleAlternatives 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlternativesAccess().getGroup()); }
		(rule__Alternatives__Group__0)
		{ after(grammarAccess.getAlternativesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGroup
entryRuleGroup
:
{ before(grammarAccess.getGroupRule()); }
	 ruleGroup
{ after(grammarAccess.getGroupRule()); } 
	 EOF 
;

// Rule Group
ruleGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGroupAccess().getGroup()); }
		(rule__Group__Group__0)
		{ after(grammarAccess.getGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractToken
entryRuleAbstractToken
:
{ before(grammarAccess.getAbstractTokenRule()); }
	 ruleAbstractToken
{ after(grammarAccess.getAbstractTokenRule()); } 
	 EOF 
;

// Rule AbstractToken
ruleAbstractToken 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractTokenAccess().getAlternatives()); }
		(rule__AbstractToken__Alternatives)
		{ after(grammarAccess.getAbstractTokenAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractTokenWithCardinality
entryRuleAbstractTokenWithCardinality
:
{ before(grammarAccess.getAbstractTokenWithCardinalityRule()); }
	 ruleAbstractTokenWithCardinality
{ after(grammarAccess.getAbstractTokenWithCardinalityRule()); } 
	 EOF 
;

// Rule AbstractTokenWithCardinality
ruleAbstractTokenWithCardinality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup()); }
		(rule__AbstractTokenWithCardinality__Group__0)
		{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getGroup()); }
		(rule__Action__Group__0)
		{ after(grammarAccess.getActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractTerminal
entryRuleAbstractTerminal
:
{ before(grammarAccess.getAbstractTerminalRule()); }
	 ruleAbstractTerminal
{ after(grammarAccess.getAbstractTerminalRule()); } 
	 EOF 
;

// Rule AbstractTerminal
ruleAbstractTerminal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractTerminalAccess().getAlternatives()); }
		(rule__AbstractTerminal__Alternatives)
		{ after(grammarAccess.getAbstractTerminalAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKeyword
entryRuleKeyword
:
{ before(grammarAccess.getKeywordRule()); }
	 ruleKeyword
{ after(grammarAccess.getKeywordRule()); } 
	 EOF 
;

// Rule Keyword
ruleKeyword 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKeywordAccess().getValueAssignment()); }
		(rule__Keyword__ValueAssignment)
		{ after(grammarAccess.getKeywordAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRuleCall
entryRuleRuleCall
:
{ before(grammarAccess.getRuleCallRule()); }
	 ruleRuleCall
{ after(grammarAccess.getRuleCallRule()); } 
	 EOF 
;

// Rule RuleCall
ruleRuleCall 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRuleCallAccess().getRuleAssignment()); }
		(rule__RuleCall__RuleAssignment)
		{ after(grammarAccess.getRuleCallAccess().getRuleAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignment
entryRuleAssignment
:
{ before(grammarAccess.getAssignmentRule()); }
	 ruleAssignment
{ after(grammarAccess.getAssignmentRule()); } 
	 EOF 
;

// Rule Assignment
ruleAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignmentAccess().getGroup()); }
		(rule__Assignment__Group__0)
		{ after(grammarAccess.getAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignableTerminal
entryRuleAssignableTerminal
:
{ before(grammarAccess.getAssignableTerminalRule()); }
	 ruleAssignableTerminal
{ after(grammarAccess.getAssignableTerminalRule()); } 
	 EOF 
;

// Rule AssignableTerminal
ruleAssignableTerminal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignableTerminalAccess().getAlternatives()); }
		(rule__AssignableTerminal__Alternatives)
		{ after(grammarAccess.getAssignableTerminalAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesizedAssignableElement
entryRuleParenthesizedAssignableElement
:
{ before(grammarAccess.getParenthesizedAssignableElementRule()); }
	 ruleParenthesizedAssignableElement
{ after(grammarAccess.getParenthesizedAssignableElementRule()); } 
	 EOF 
;

// Rule ParenthesizedAssignableElement
ruleParenthesizedAssignableElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesizedAssignableElementAccess().getGroup()); }
		(rule__ParenthesizedAssignableElement__Group__0)
		{ after(grammarAccess.getParenthesizedAssignableElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAssignableAlternatives
entryRuleAssignableAlternatives
:
{ before(grammarAccess.getAssignableAlternativesRule()); }
	 ruleAssignableAlternatives
{ after(grammarAccess.getAssignableAlternativesRule()); } 
	 EOF 
;

// Rule AssignableAlternatives
ruleAssignableAlternatives 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAssignableAlternativesAccess().getGroup()); }
		(rule__AssignableAlternatives__Group__0)
		{ after(grammarAccess.getAssignableAlternativesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCrossReference
entryRuleCrossReference
:
{ before(grammarAccess.getCrossReferenceRule()); }
	 ruleCrossReference
{ after(grammarAccess.getCrossReferenceRule()); } 
	 EOF 
;

// Rule CrossReference
ruleCrossReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCrossReferenceAccess().getGroup()); }
		(rule__CrossReference__Group__0)
		{ after(grammarAccess.getCrossReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCrossReferenceableTerminal
entryRuleCrossReferenceableTerminal
:
{ before(grammarAccess.getCrossReferenceableTerminalRule()); }
	 ruleCrossReferenceableTerminal
{ after(grammarAccess.getCrossReferenceableTerminalRule()); } 
	 EOF 
;

// Rule CrossReferenceableTerminal
ruleCrossReferenceableTerminal 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives()); }
		(rule__CrossReferenceableTerminal__Alternatives)
		{ after(grammarAccess.getCrossReferenceableTerminalAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesizedCrossReferenceableElement
entryRuleParenthesizedCrossReferenceableElement
:
{ before(grammarAccess.getParenthesizedCrossReferenceableElementRule()); }
	 ruleParenthesizedCrossReferenceableElement
{ after(grammarAccess.getParenthesizedCrossReferenceableElementRule()); } 
	 EOF 
;

// Rule ParenthesizedCrossReferenceableElement
ruleParenthesizedCrossReferenceableElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getGroup()); }
		(rule__ParenthesizedCrossReferenceableElement__Group__0)
		{ after(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCrossReferenceableAlternatives
entryRuleCrossReferenceableAlternatives
:
{ before(grammarAccess.getCrossReferenceableAlternativesRule()); }
	 ruleCrossReferenceableAlternatives
{ after(grammarAccess.getCrossReferenceableAlternativesRule()); } 
	 EOF 
;

// Rule CrossReferenceableAlternatives
ruleCrossReferenceableAlternatives 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup()); }
		(rule__CrossReferenceableAlternatives__Group__0)
		{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesizedElement
entryRuleParenthesizedElement
:
{ before(grammarAccess.getParenthesizedElementRule()); }
	 ruleParenthesizedElement
{ after(grammarAccess.getParenthesizedElementRule()); } 
	 EOF 
;

// Rule ParenthesizedElement
ruleParenthesizedElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesizedElementAccess().getGroup()); }
		(rule__ParenthesizedElement__Group__0)
		{ after(grammarAccess.getParenthesizedElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminalRule
entryRuleTerminalRule
:
{ before(grammarAccess.getTerminalRuleRule()); }
	 ruleTerminalRule
{ after(grammarAccess.getTerminalRuleRule()); } 
	 EOF 
;

// Rule TerminalRule
ruleTerminalRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminalRuleAccess().getGroup()); }
		(rule__TerminalRule__Group__0)
		{ after(grammarAccess.getTerminalRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminalAlternatives
entryRuleTerminalAlternatives
:
{ before(grammarAccess.getTerminalAlternativesRule()); }
	 ruleTerminalAlternatives
{ after(grammarAccess.getTerminalAlternativesRule()); } 
	 EOF 
;

// Rule TerminalAlternatives
ruleTerminalAlternatives 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminalAlternativesAccess().getGroup()); }
		(rule__TerminalAlternatives__Group__0)
		{ after(grammarAccess.getTerminalAlternativesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminalGroup
entryRuleTerminalGroup
:
{ before(grammarAccess.getTerminalGroupRule()); }
	 ruleTerminalGroup
{ after(grammarAccess.getTerminalGroupRule()); } 
	 EOF 
;

// Rule TerminalGroup
ruleTerminalGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminalGroupAccess().getGroup()); }
		(rule__TerminalGroup__Group__0)
		{ after(grammarAccess.getTerminalGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminalToken
entryRuleTerminalToken
:
{ before(grammarAccess.getTerminalTokenRule()); }
	 ruleTerminalToken
{ after(grammarAccess.getTerminalTokenRule()); } 
	 EOF 
;

// Rule TerminalToken
ruleTerminalToken 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminalTokenAccess().getGroup()); }
		(rule__TerminalToken__Group__0)
		{ after(grammarAccess.getTerminalTokenAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTerminalTokenElement
entryRuleTerminalTokenElement
:
{ before(grammarAccess.getTerminalTokenElementRule()); }
	 ruleTerminalTokenElement
{ after(grammarAccess.getTerminalTokenElementRule()); } 
	 EOF 
;

// Rule TerminalTokenElement
ruleTerminalTokenElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTerminalTokenElementAccess().getAlternatives()); }
		(rule__TerminalTokenElement__Alternatives)
		{ after(grammarAccess.getTerminalTokenElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesizedTerminalElement
entryRuleParenthesizedTerminalElement
:
{ before(grammarAccess.getParenthesizedTerminalElementRule()); }
	 ruleParenthesizedTerminalElement
{ after(grammarAccess.getParenthesizedTerminalElementRule()); } 
	 EOF 
;

// Rule ParenthesizedTerminalElement
ruleParenthesizedTerminalElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesizedTerminalElementAccess().getGroup()); }
		(rule__ParenthesizedTerminalElement__Group__0)
		{ after(grammarAccess.getParenthesizedTerminalElementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractNegatedToken
entryRuleAbstractNegatedToken
:
{ before(grammarAccess.getAbstractNegatedTokenRule()); }
	 ruleAbstractNegatedToken
{ after(grammarAccess.getAbstractNegatedTokenRule()); } 
	 EOF 
;

// Rule AbstractNegatedToken
ruleAbstractNegatedToken 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives()); }
		(rule__AbstractNegatedToken__Alternatives)
		{ after(grammarAccess.getAbstractNegatedTokenAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNegatedToken
entryRuleNegatedToken
:
{ before(grammarAccess.getNegatedTokenRule()); }
	 ruleNegatedToken
{ after(grammarAccess.getNegatedTokenRule()); } 
	 EOF 
;

// Rule NegatedToken
ruleNegatedToken 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNegatedTokenAccess().getGroup()); }
		(rule__NegatedToken__Group__0)
		{ after(grammarAccess.getNegatedTokenAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUntilToken
entryRuleUntilToken
:
{ before(grammarAccess.getUntilTokenRule()); }
	 ruleUntilToken
{ after(grammarAccess.getUntilTokenRule()); } 
	 EOF 
;

// Rule UntilToken
ruleUntilToken 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUntilTokenAccess().getGroup()); }
		(rule__UntilToken__Group__0)
		{ after(grammarAccess.getUntilTokenAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleWildcard
entryRuleWildcard
:
{ before(grammarAccess.getWildcardRule()); }
	 ruleWildcard
{ after(grammarAccess.getWildcardRule()); } 
	 EOF 
;

// Rule Wildcard
ruleWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWildcardAccess().getGroup()); }
		(rule__Wildcard__Group__0)
		{ after(grammarAccess.getWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCharacterRange
entryRuleCharacterRange
:
{ before(grammarAccess.getCharacterRangeRule()); }
	 ruleCharacterRange
{ after(grammarAccess.getCharacterRangeRule()); } 
	 EOF 
;

// Rule CharacterRange
ruleCharacterRange 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCharacterRangeAccess().getGroup()); }
		(rule__CharacterRange__Group__0)
		{ after(grammarAccess.getCharacterRangeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumRule
entryRuleEnumRule
:
{ before(grammarAccess.getEnumRuleRule()); }
	 ruleEnumRule
{ after(grammarAccess.getEnumRuleRule()); } 
	 EOF 
;

// Rule EnumRule
ruleEnumRule 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumRuleAccess().getGroup()); }
		(rule__EnumRule__Group__0)
		{ after(grammarAccess.getEnumRuleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumLiterals
entryRuleEnumLiterals
:
{ before(grammarAccess.getEnumLiteralsRule()); }
	 ruleEnumLiterals
{ after(grammarAccess.getEnumLiteralsRule()); } 
	 EOF 
;

// Rule EnumLiterals
ruleEnumLiterals 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumLiteralsAccess().getGroup()); }
		(rule__EnumLiterals__Group__0)
		{ after(grammarAccess.getEnumLiteralsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumLiteralDeclaration
entryRuleEnumLiteralDeclaration
:
{ before(grammarAccess.getEnumLiteralDeclarationRule()); }
	 ruleEnumLiteralDeclaration
{ after(grammarAccess.getEnumLiteralDeclarationRule()); } 
	 EOF 
;

// Rule EnumLiteralDeclaration
ruleEnumLiteralDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumLiteralDeclarationAccess().getGroup()); }
		(rule__EnumLiteralDeclaration__Group__0)
		{ after(grammarAccess.getEnumLiteralDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractRule__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); }
		ruleParserRule
		{ after(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); }
		ruleTerminalRule
		{ after(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); }
		ruleEnumRule
		{ after(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractMetamodelDeclaration__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); }
		ruleGeneratedMetamodel
		{ after(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); }
		ruleReferencedMetamodel
		{ after(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractToken__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); }
		ruleAbstractTokenWithCardinality
		{ after(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); }
		ruleAction
		{ after(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTokenWithCardinality__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); }
		ruleAssignment
		{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); }
		ruleAbstractTerminal
		{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0()); }
		'?'
		{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityQuestionMarkKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1()); }
		'*'
		{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAsteriskKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2()); }
		'+'
		{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityPlusSignKeyword_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__OperatorAlternatives_2_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0()); }
		'='
		{ after(grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1()); }
		'+='
		{ after(grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTerminal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); }
		ruleKeyword
		{ after(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); }
		ruleRuleCall
		{ after(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); }
		ruleParenthesizedElement
		{ after(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__OperatorAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_1_0_0()); }
		'+='
		{ after(grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_1_0_1()); }
		'='
		{ after(grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_1_0_2()); }
		'?='
		{ after(grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableTerminal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); }
		ruleKeyword
		{ after(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); }
		ruleRuleCall
		{ after(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); }
		ruleParenthesizedAssignableElement
		{ after(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); }
		ruleCrossReference
		{ after(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableTerminal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); }
		ruleKeyword
		{ after(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); }
		ruleRuleCall
		{ after(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getCrossReferenceableTerminalAccess().getParenthesizedCrossReferenceableElementParserRuleCall_2()); }
		ruleParenthesizedCrossReferenceableElement
		{ after(grammarAccess.getCrossReferenceableTerminalAccess().getParenthesizedCrossReferenceableElementParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalToken__CardinalityAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0()); }
		'?'
		{ after(grammarAccess.getTerminalTokenAccess().getCardinalityQuestionMarkKeyword_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1()); }
		'*'
		{ after(grammarAccess.getTerminalTokenAccess().getCardinalityAsteriskKeyword_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2()); }
		'+'
		{ after(grammarAccess.getTerminalTokenAccess().getCardinalityPlusSignKeyword_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalTokenElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); }
		ruleCharacterRange
		{ after(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalTokenElementAccess().getRuleCallParserRuleCall_1()); }
		ruleRuleCall
		{ after(grammarAccess.getTerminalTokenElementAccess().getRuleCallParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); }
		ruleParenthesizedTerminalElement
		{ after(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); }
		ruleAbstractNegatedToken
		{ after(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); }
		ruleWildcard
		{ after(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractNegatedToken__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); }
		ruleNegatedToken
		{ after(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); }
		ruleUntilToken
		{ after(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group__0__Impl
	rule__Grammar__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getGrammarKeyword_0()); }
	'grammar'
	{ after(grammarAccess.getGrammarAccess().getGrammarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group__1__Impl
	rule__Grammar__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getNameAssignment_1()); }
	(rule__Grammar__NameAssignment_1)
	{ after(grammarAccess.getGrammarAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group__2__Impl
	rule__Grammar__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getGroup_2()); }
	(rule__Grammar__Group_2__0)?
	{ after(grammarAccess.getGrammarAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group__3__Impl
	rule__Grammar__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getGroup_3()); }
	(rule__Grammar__Group_3__0)?
	{ after(grammarAccess.getGrammarAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group__4__Impl
	rule__Grammar__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4()); }
	(rule__Grammar__MetamodelDeclarationsAssignment_4)*
	{ after(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGrammarAccess().getRulesAssignment_5()); }
		(rule__Grammar__RulesAssignment_5)
		{ after(grammarAccess.getGrammarAccess().getRulesAssignment_5()); }
	)
	(
		{ before(grammarAccess.getGrammarAccess().getRulesAssignment_5()); }
		(rule__Grammar__RulesAssignment_5)*
		{ after(grammarAccess.getGrammarAccess().getRulesAssignment_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grammar__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_2__0__Impl
	rule__Grammar__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getWithKeyword_2_0()); }
	'with'
	{ after(grammarAccess.getGrammarAccess().getWithKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_2__1__Impl
	rule__Grammar__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1()); }
	(rule__Grammar__UsedGrammarsAssignment_2_1)
	{ after(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getGroup_2_2()); }
	(rule__Grammar__Group_2_2__0)*
	{ after(grammarAccess.getGrammarAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grammar__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_2_2__0__Impl
	rule__Grammar__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0()); }
	','
	{ after(grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1()); }
	(rule__Grammar__UsedGrammarsAssignment_2_2_1)
	{ after(grammarAccess.getGrammarAccess().getUsedGrammarsAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grammar__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3__0__Impl
	rule__Grammar__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0()); }
	(rule__Grammar__DefinesHiddenTokensAssignment_3_0)
	{ after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3__1__Impl
	rule__Grammar__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1()); }
	'('
	{ after(grammarAccess.getGrammarAccess().getLeftParenthesisKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3__2__Impl
	rule__Grammar__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getGroup_3_2()); }
	(rule__Grammar__Group_3_2__0)?
	{ after(grammarAccess.getGrammarAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3()); }
	')'
	{ after(grammarAccess.getGrammarAccess().getRightParenthesisKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grammar__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3_2__0__Impl
	rule__Grammar__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0()); }
	(rule__Grammar__HiddenTokensAssignment_3_2_0)
	{ after(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getGroup_3_2_1()); }
	(rule__Grammar__Group_3_2_1__0)*
	{ after(grammarAccess.getGrammarAccess().getGroup_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grammar__Group_3_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3_2_1__0__Impl
	rule__Grammar__Group_3_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0()); }
	','
	{ after(grammarAccess.getGrammarAccess().getCommaKeyword_3_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Grammar__Group_3_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__Group_3_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1()); }
	(rule__Grammar__HiddenTokensAssignment_3_2_1_1)
	{ after(grammarAccess.getGrammarAccess().getHiddenTokensAssignment_3_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GrammarID__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GrammarID__Group__0__Impl
	rule__GrammarID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GrammarID__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarIDAccess().getGroup_1()); }
	(rule__GrammarID__Group_1__0)*
	{ after(grammarAccess.getGrammarIDAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GrammarID__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GrammarID__Group_1__0__Impl
	rule__GrammarID__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GrammarID__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GeneratedMetamodel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GeneratedMetamodel__Group__0__Impl
	rule__GeneratedMetamodel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0()); }
	'generate'
	{ after(grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GeneratedMetamodel__Group__1__Impl
	rule__GeneratedMetamodel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1()); }
	(rule__GeneratedMetamodel__NameAssignment_1)
	{ after(grammarAccess.getGeneratedMetamodelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GeneratedMetamodel__Group__2__Impl
	rule__GeneratedMetamodel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2()); }
	(rule__GeneratedMetamodel__EPackageAssignment_2)
	{ after(grammarAccess.getGeneratedMetamodelAccess().getEPackageAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GeneratedMetamodel__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratedMetamodelAccess().getGroup_3()); }
	(rule__GeneratedMetamodel__Group_3__0)?
	{ after(grammarAccess.getGeneratedMetamodelAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__GeneratedMetamodel__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GeneratedMetamodel__Group_3__0__Impl
	rule__GeneratedMetamodel__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0()); }
	'as'
	{ after(grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__GeneratedMetamodel__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1()); }
	(rule__GeneratedMetamodel__AliasAssignment_3_1)
	{ after(grammarAccess.getGeneratedMetamodelAccess().getAliasAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReferencedMetamodel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferencedMetamodel__Group__0__Impl
	rule__ReferencedMetamodel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferencedMetamodel__Group__1__Impl
	rule__ReferencedMetamodel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1()); }
	(rule__ReferencedMetamodel__EPackageAssignment_1)
	{ after(grammarAccess.getReferencedMetamodelAccess().getEPackageAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferencedMetamodel__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferencedMetamodelAccess().getGroup_2()); }
	(rule__ReferencedMetamodel__Group_2__0)?
	{ after(grammarAccess.getReferencedMetamodelAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReferencedMetamodel__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferencedMetamodel__Group_2__0__Impl
	rule__ReferencedMetamodel__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0()); }
	'as'
	{ after(grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReferencedMetamodel__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1()); }
	(rule__ReferencedMetamodel__AliasAssignment_2_1)
	{ after(grammarAccess.getReferencedMetamodelAccess().getAliasAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParserRule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group__0__Impl
	rule__ParserRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getNameAssignment_0()); }
	(rule__ParserRule__NameAssignment_0)
	{ after(grammarAccess.getParserRuleAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group__1__Impl
	rule__ParserRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getGroup_1()); }
	(rule__ParserRule__Group_1__0)?
	{ after(grammarAccess.getParserRuleAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group__2__Impl
	rule__ParserRule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getGroup_2()); }
	(rule__ParserRule__Group_2__0)?
	{ after(grammarAccess.getParserRuleAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group__3__Impl
	rule__ParserRule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getParserRuleAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group__4__Impl
	rule__ParserRule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getAlternativesAssignment_4()); }
	(rule__ParserRule__AlternativesAssignment_4)
	{ after(grammarAccess.getParserRuleAccess().getAlternativesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getParserRuleAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParserRule__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_1__0__Impl
	rule__ParserRule__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getReturnsKeyword_1_0()); }
	'returns'
	{ after(grammarAccess.getParserRuleAccess().getReturnsKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getTypeAssignment_1_1()); }
	(rule__ParserRule__TypeAssignment_1_1)
	{ after(grammarAccess.getParserRuleAccess().getTypeAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParserRule__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2__0__Impl
	rule__ParserRule__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0()); }
	(rule__ParserRule__DefinesHiddenTokensAssignment_2_0)
	{ after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2__1__Impl
	rule__ParserRule__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1()); }
	'('
	{ after(grammarAccess.getParserRuleAccess().getLeftParenthesisKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2__2__Impl
	rule__ParserRule__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getGroup_2_2()); }
	(rule__ParserRule__Group_2_2__0)?
	{ after(grammarAccess.getParserRuleAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3()); }
	')'
	{ after(grammarAccess.getParserRuleAccess().getRightParenthesisKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParserRule__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2_2__0__Impl
	rule__ParserRule__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0()); }
	(rule__ParserRule__HiddenTokensAssignment_2_2_0)
	{ after(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getGroup_2_2_1()); }
	(rule__ParserRule__Group_2_2_1__0)*
	{ after(grammarAccess.getParserRuleAccess().getGroup_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParserRule__Group_2_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2_2_1__0__Impl
	rule__ParserRule__Group_2_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0()); }
	','
	{ after(grammarAccess.getParserRuleAccess().getCommaKeyword_2_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParserRule__Group_2_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__Group_2_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1()); }
	(rule__ParserRule__HiddenTokensAssignment_2_2_1_1)
	{ after(grammarAccess.getParserRuleAccess().getHiddenTokensAssignment_2_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group__0__Impl
	rule__TypeRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getGroup_0()); }
	(rule__TypeRef__Group_0__0)?
	{ after(grammarAccess.getTypeRefAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getClassifierAssignment_1()); }
	(rule__TypeRef__ClassifierAssignment_1)
	{ after(grammarAccess.getTypeRefAccess().getClassifierAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeRef__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group_0__0__Impl
	rule__TypeRef__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0()); }
	(rule__TypeRef__MetamodelAssignment_0_0)
	{ after(grammarAccess.getTypeRefAccess().getMetamodelAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1()); }
	'::'
	{ after(grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Alternatives__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Alternatives__Group__0__Impl
	rule__Alternatives__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternativesAccess().getGroupParserRuleCall_0()); }
	ruleGroup
	{ after(grammarAccess.getAlternativesAccess().getGroupParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Alternatives__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternativesAccess().getGroup_1()); }
	(rule__Alternatives__Group_1__0)?
	{ after(grammarAccess.getAlternativesAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Alternatives__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Alternatives__Group_1__0__Impl
	rule__Alternatives__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternativesAccess().getAlternativesGroupsAction_1_0()); }
	()
	{ after(grammarAccess.getAlternativesAccess().getAlternativesGroupsAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Alternatives__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getAlternativesAccess().getGroup_1_1()); }
		(rule__Alternatives__Group_1_1__0)
		{ after(grammarAccess.getAlternativesAccess().getGroup_1_1()); }
	)
	(
		{ before(grammarAccess.getAlternativesAccess().getGroup_1_1()); }
		(rule__Alternatives__Group_1_1__0)*
		{ after(grammarAccess.getAlternativesAccess().getGroup_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Alternatives__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Alternatives__Group_1_1__0__Impl
	rule__Alternatives__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
	'|'
	{ after(grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Alternatives__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternativesAccess().getGroupsAssignment_1_1_1()); }
	(rule__Alternatives__GroupsAssignment_1_1_1)
	{ after(grammarAccess.getAlternativesAccess().getGroupsAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Group__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__0__Impl
	rule__Group__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); }
	ruleAbstractToken
	{ after(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getGroup_1()); }
	(rule__Group__Group_1__0)?
	{ after(grammarAccess.getGroupAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Group__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_1__0__Impl
	rule__Group__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGroupAccess().getGroupTokensAction_1_0()); }
	()
	{ after(grammarAccess.getGroupAccess().getGroupTokensAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Group__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getGroupAccess().getTokensAssignment_1_1()); }
		(rule__Group__TokensAssignment_1_1)
		{ after(grammarAccess.getGroupAccess().getTokensAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getGroupAccess().getTokensAssignment_1_1()); }
		(rule__Group__TokensAssignment_1_1)*
		{ after(grammarAccess.getGroupAccess().getTokensAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractTokenWithCardinality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractTokenWithCardinality__Group__0__Impl
	rule__AbstractTokenWithCardinality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTokenWithCardinality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0()); }
	(rule__AbstractTokenWithCardinality__Alternatives_0)
	{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTokenWithCardinality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractTokenWithCardinality__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTokenWithCardinality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1()); }
	(rule__AbstractTokenWithCardinality__CardinalityAssignment_1)?
	{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__0__Impl
	rule__Action__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__1__Impl
	rule__Action__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getTypeAssignment_1()); }
	(rule__Action__TypeAssignment_1)
	{ after(grammarAccess.getActionAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__2__Impl
	rule__Action__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getGroup_2()); }
	(rule__Action__Group_2__0)?
	{ after(grammarAccess.getActionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Action__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_2__0__Impl
	rule__Action__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getFullStopKeyword_2_0()); }
	'.'
	{ after(grammarAccess.getActionAccess().getFullStopKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_2__1__Impl
	rule__Action__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getFeatureAssignment_2_1()); }
	(rule__Action__FeatureAssignment_2_1)
	{ after(grammarAccess.getActionAccess().getFeatureAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_2__2__Impl
	rule__Action__Group_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getOperatorAssignment_2_2()); }
	(rule__Action__OperatorAssignment_2_2)
	{ after(grammarAccess.getActionAccess().getOperatorAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Action__Group_2__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Group_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionAccess().getCurrentKeyword_2_3()); }
	'current'
	{ after(grammarAccess.getActionAccess().getCurrentKeyword_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Assignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__0__Impl
	rule__Assignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); }
	(rule__Assignment__FeatureAssignment_0)
	{ after(grammarAccess.getAssignmentAccess().getFeatureAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__1__Impl
	rule__Assignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getOperatorAssignment_1()); }
	(rule__Assignment__OperatorAssignment_1)
	{ after(grammarAccess.getAssignmentAccess().getOperatorAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Assignment__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignmentAccess().getTerminalAssignment_2()); }
	(rule__Assignment__TerminalAssignment_2)
	{ after(grammarAccess.getAssignmentAccess().getTerminalAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParenthesizedAssignableElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedAssignableElement__Group__0__Impl
	rule__ParenthesizedAssignableElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedAssignableElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedAssignableElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedAssignableElement__Group__1__Impl
	rule__ParenthesizedAssignableElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedAssignableElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); }
	ruleAssignableAlternatives
	{ after(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedAssignableElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedAssignableElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedAssignableElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssignableAlternatives__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignableAlternatives__Group__0__Impl
	rule__AssignableAlternatives__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); }
	ruleAssignableTerminal
	{ after(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignableAlternatives__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignableAlternativesAccess().getGroup_1()); }
	(rule__AssignableAlternatives__Group_1__0)?
	{ after(grammarAccess.getAssignableAlternativesAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssignableAlternatives__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignableAlternatives__Group_1__0__Impl
	rule__AssignableAlternatives__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignableAlternativesAccess().getAlternativesGroupsAction_1_0()); }
	()
	{ after(grammarAccess.getAssignableAlternativesAccess().getAlternativesGroupsAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignableAlternatives__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); }
		(rule__AssignableAlternatives__Group_1_1__0)
		{ after(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); }
	)
	(
		{ before(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); }
		(rule__AssignableAlternatives__Group_1_1__0)*
		{ after(grammarAccess.getAssignableAlternativesAccess().getGroup_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AssignableAlternatives__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignableAlternatives__Group_1_1__0__Impl
	rule__AssignableAlternatives__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
	'|'
	{ after(grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AssignableAlternatives__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAssignableAlternativesAccess().getGroupsAssignment_1_1_1()); }
	(rule__AssignableAlternatives__GroupsAssignment_1_1_1)
	{ after(grammarAccess.getAssignableAlternativesAccess().getGroupsAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CrossReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReference__Group__0__Impl
	rule__CrossReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0()); }
	'['
	{ after(grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReference__Group__1__Impl
	rule__CrossReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1()); }
	(rule__CrossReference__TypeAssignment_1)
	{ after(grammarAccess.getCrossReferenceAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReference__Group__2__Impl
	rule__CrossReference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceAccess().getGroup_2()); }
	(rule__CrossReference__Group_2__0)?
	{ after(grammarAccess.getCrossReferenceAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReference__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3()); }
	']'
	{ after(grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CrossReference__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReference__Group_2__0__Impl
	rule__CrossReference__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0()); }
	'|'
	{ after(grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReference__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1()); }
	(rule__CrossReference__TerminalAssignment_2_1)
	{ after(grammarAccess.getCrossReferenceAccess().getTerminalAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParenthesizedCrossReferenceableElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedCrossReferenceableElement__Group__0__Impl
	rule__ParenthesizedCrossReferenceableElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedCrossReferenceableElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedCrossReferenceableElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedCrossReferenceableElement__Group__1__Impl
	rule__ParenthesizedCrossReferenceableElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedCrossReferenceableElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getCrossReferenceableAlternativesParserRuleCall_1()); }
	ruleCrossReferenceableAlternatives
	{ after(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getCrossReferenceableAlternativesParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedCrossReferenceableElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedCrossReferenceableElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedCrossReferenceableElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesizedCrossReferenceableElementAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CrossReferenceableAlternatives__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReferenceableAlternatives__Group__0__Impl
	rule__CrossReferenceableAlternatives__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getCrossReferenceableTerminalParserRuleCall_0()); }
	ruleCrossReferenceableTerminal
	{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getCrossReferenceableTerminalParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReferenceableAlternatives__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1()); }
	(rule__CrossReferenceableAlternatives__Group_1__0)?
	{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CrossReferenceableAlternatives__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReferenceableAlternatives__Group_1__0__Impl
	rule__CrossReferenceableAlternatives__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getAlternativesGroupsAction_1_0()); }
	()
	{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getAlternativesGroupsAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReferenceableAlternatives__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1_1()); }
		(rule__CrossReferenceableAlternatives__Group_1_1__0)
		{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1_1()); }
	)
	(
		{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1_1()); }
		(rule__CrossReferenceableAlternatives__Group_1_1__0)*
		{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getGroup_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CrossReferenceableAlternatives__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReferenceableAlternatives__Group_1_1__0__Impl
	rule__CrossReferenceableAlternatives__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
	'|'
	{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CrossReferenceableAlternatives__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getGroupsAssignment_1_1_1()); }
	(rule__CrossReferenceableAlternatives__GroupsAssignment_1_1_1)
	{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getGroupsAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParenthesizedElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedElement__Group__0__Impl
	rule__ParenthesizedElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedElement__Group__1__Impl
	rule__ParenthesizedElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); }
	ruleAlternatives
	{ after(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalRule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group__0__Impl
	rule__TerminalRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0()); }
	'terminal'
	{ after(grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group__1__Impl
	rule__TerminalRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getNameAssignment_1()); }
	(rule__TerminalRule__NameAssignment_1)
	{ after(grammarAccess.getTerminalRuleAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group__2__Impl
	rule__TerminalRule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getGroup_2()); }
	(rule__TerminalRule__Group_2__0)?
	{ after(grammarAccess.getTerminalRuleAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group__3__Impl
	rule__TerminalRule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getTerminalRuleAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group__4__Impl
	rule__TerminalRule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_4()); }
	(rule__TerminalRule__AlternativesAssignment_4)
	{ after(grammarAccess.getTerminalRuleAccess().getAlternativesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalRule__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group_2__0__Impl
	rule__TerminalRule__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getReturnsKeyword_2_0()); }
	'returns'
	{ after(grammarAccess.getTerminalRuleAccess().getReturnsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalRule__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalRuleAccess().getTypeAssignment_2_1()); }
	(rule__TerminalRule__TypeAssignment_2_1)
	{ after(grammarAccess.getTerminalRuleAccess().getTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalAlternatives__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalAlternatives__Group__0__Impl
	rule__TerminalAlternatives__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); }
	ruleTerminalGroup
	{ after(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalAlternatives__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAlternativesAccess().getGroup_1()); }
	(rule__TerminalAlternatives__Group_1__0)?
	{ after(grammarAccess.getTerminalAlternativesAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalAlternatives__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalAlternatives__Group_1__0__Impl
	rule__TerminalAlternatives__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAlternativesAccess().getAlternativesGroupsAction_1_0()); }
	()
	{ after(grammarAccess.getTerminalAlternativesAccess().getAlternativesGroupsAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalAlternatives__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); }
		(rule__TerminalAlternatives__Group_1_1__0)
		{ after(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); }
	)
	(
		{ before(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); }
		(rule__TerminalAlternatives__Group_1_1__0)*
		{ after(grammarAccess.getTerminalAlternativesAccess().getGroup_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalAlternatives__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalAlternatives__Group_1_1__0__Impl
	rule__TerminalAlternatives__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
	'|'
	{ after(grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalAlternatives__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalAlternativesAccess().getGroupsAssignment_1_1_1()); }
	(rule__TerminalAlternatives__GroupsAssignment_1_1_1)
	{ after(grammarAccess.getTerminalAlternativesAccess().getGroupsAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalGroup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalGroup__Group__0__Impl
	rule__TerminalGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalGroup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); }
	ruleTerminalToken
	{ after(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalGroup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalGroup__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalGroup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalGroupAccess().getGroup_1()); }
	(rule__TerminalGroup__Group_1__0)?
	{ after(grammarAccess.getTerminalGroupAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalGroup__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalGroup__Group_1__0__Impl
	rule__TerminalGroup__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalGroup__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalGroupAccess().getGroupTokensAction_1_0()); }
	()
	{ after(grammarAccess.getTerminalGroupAccess().getGroupTokensAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalGroup__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalGroup__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalGroup__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTerminalGroupAccess().getTokensAssignment_1_1()); }
		(rule__TerminalGroup__TokensAssignment_1_1)
		{ after(grammarAccess.getTerminalGroupAccess().getTokensAssignment_1_1()); }
	)
	(
		{ before(grammarAccess.getTerminalGroupAccess().getTokensAssignment_1_1()); }
		(rule__TerminalGroup__TokensAssignment_1_1)*
		{ after(grammarAccess.getTerminalGroupAccess().getTokensAssignment_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TerminalToken__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalToken__Group__0__Impl
	rule__TerminalToken__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalToken__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); }
	ruleTerminalTokenElement
	{ after(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalToken__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TerminalToken__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalToken__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1()); }
	(rule__TerminalToken__CardinalityAssignment_1)?
	{ after(grammarAccess.getTerminalTokenAccess().getCardinalityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParenthesizedTerminalElement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedTerminalElement__Group__0__Impl
	rule__ParenthesizedTerminalElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedTerminalElement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0()); }
	'('
	{ after(grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedTerminalElement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedTerminalElement__Group__1__Impl
	rule__ParenthesizedTerminalElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedTerminalElement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); }
	ruleTerminalAlternatives
	{ after(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedTerminalElement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParenthesizedTerminalElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedTerminalElement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2()); }
	')'
	{ after(grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NegatedToken__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NegatedToken__Group__0__Impl
	rule__NegatedToken__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NegatedToken__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0()); }
	'!'
	{ after(grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NegatedToken__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NegatedToken__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NegatedToken__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1()); }
	(rule__NegatedToken__TerminalAssignment_1)
	{ after(grammarAccess.getNegatedTokenAccess().getTerminalAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UntilToken__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilToken__Group__0__Impl
	rule__UntilToken__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilToken__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0()); }
	'->'
	{ after(grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilToken__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UntilToken__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilToken__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1()); }
	(rule__UntilToken__TerminalAssignment_1)
	{ after(grammarAccess.getUntilTokenAccess().getTerminalAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Wildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Wildcard__Group__0__Impl
	rule__Wildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Wildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWildcardAccess().getWildcardAction_0()); }
	()
	{ after(grammarAccess.getWildcardAccess().getWildcardAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Wildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Wildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Wildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWildcardAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getWildcardAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CharacterRange__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CharacterRange__Group__0__Impl
	rule__CharacterRange__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); }
	ruleKeyword
	{ after(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CharacterRange__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCharacterRangeAccess().getGroup_1()); }
	(rule__CharacterRange__Group_1__0)?
	{ after(grammarAccess.getCharacterRangeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CharacterRange__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CharacterRange__Group_1__0__Impl
	rule__CharacterRange__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0()); }
	()
	{ after(grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CharacterRange__Group_1__1__Impl
	rule__CharacterRange__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1()); }
	'..'
	{ after(grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CharacterRange__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2()); }
	(rule__CharacterRange__RightAssignment_1_2)
	{ after(grammarAccess.getCharacterRangeAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumRule__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group__0__Impl
	rule__EnumRule__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getEnumKeyword_0()); }
	'enum'
	{ after(grammarAccess.getEnumRuleAccess().getEnumKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group__1__Impl
	rule__EnumRule__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getNameAssignment_1()); }
	(rule__EnumRule__NameAssignment_1)
	{ after(grammarAccess.getEnumRuleAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group__2__Impl
	rule__EnumRule__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getGroup_2()); }
	(rule__EnumRule__Group_2__0)?
	{ after(grammarAccess.getEnumRuleAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group__3__Impl
	rule__EnumRule__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getEnumRuleAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group__4__Impl
	rule__EnumRule__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_4()); }
	(rule__EnumRule__AlternativesAssignment_4)
	{ after(grammarAccess.getEnumRuleAccess().getAlternativesAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5()); }
	';'
	{ after(grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumRule__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group_2__0__Impl
	rule__EnumRule__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getReturnsKeyword_2_0()); }
	'returns'
	{ after(grammarAccess.getEnumRuleAccess().getReturnsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumRule__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumRuleAccess().getTypeAssignment_2_1()); }
	(rule__EnumRule__TypeAssignment_2_1)
	{ after(grammarAccess.getEnumRuleAccess().getTypeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumLiterals__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiterals__Group__0__Impl
	rule__EnumLiterals__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); }
	ruleEnumLiteralDeclaration
	{ after(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiterals__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralsAccess().getGroup_1()); }
	(rule__EnumLiterals__Group_1__0)?
	{ after(grammarAccess.getEnumLiteralsAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumLiterals__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiterals__Group_1__0__Impl
	rule__EnumLiterals__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralsAccess().getAlternativesGroupsAction_1_0()); }
	()
	{ after(grammarAccess.getEnumLiteralsAccess().getAlternativesGroupsAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiterals__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); }
		(rule__EnumLiterals__Group_1_1__0)
		{ after(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); }
	)
	(
		{ before(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); }
		(rule__EnumLiterals__Group_1_1__0)*
		{ after(grammarAccess.getEnumLiteralsAccess().getGroup_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumLiterals__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiterals__Group_1_1__0__Impl
	rule__EnumLiterals__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0()); }
	'|'
	{ after(grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiterals__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralsAccess().getGroupsAssignment_1_1_1()); }
	(rule__EnumLiterals__GroupsAssignment_1_1_1)
	{ after(grammarAccess.getEnumLiteralsAccess().getGroupsAssignment_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumLiteralDeclaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiteralDeclaration__Group__0__Impl
	rule__EnumLiteralDeclaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0()); }
	(rule__EnumLiteralDeclaration__EnumLiteralAssignment_0)
	{ after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiteralDeclaration__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1()); }
	(rule__EnumLiteralDeclaration__Group_1__0)?
	{ after(grammarAccess.getEnumLiteralDeclarationAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumLiteralDeclaration__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiteralDeclaration__Group_1__0__Impl
	rule__EnumLiteralDeclaration__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0()); }
	'='
	{ after(grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiteralDeclaration__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1()); }
	(rule__EnumLiteralDeclaration__LiteralAssignment_1_1)
	{ after(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Grammar__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); }
		ruleGrammarID
		{ after(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__UsedGrammarsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1()); }
			ruleGrammarID
			{ after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__UsedGrammarsAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); }
		(
			{ before(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1()); }
			ruleGrammarID
			{ after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarGrammarIDParserRuleCall_2_2_1_0_1()); }
		)
		{ after(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__DefinesHiddenTokensAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); }
		(
			{ before(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); }
			'hidden'
			{ after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); }
		)
		{ after(grammarAccess.getGrammarAccess().getDefinesHiddenTokensHiddenKeyword_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__HiddenTokensAssignment_3_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); }
		(
			{ before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_0_0_1()); }
		)
		{ after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__HiddenTokensAssignment_3_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); }
		(
			{ before(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_3_2_1_1_0_1()); }
		)
		{ after(grammarAccess.getGrammarAccess().getHiddenTokensAbstractRuleCrossReference_3_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__MetamodelDeclarationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); }
		ruleAbstractMetamodelDeclaration
		{ after(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Grammar__RulesAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); }
		ruleAbstractRule
		{ after(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGeneratedMetamodelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGeneratedMetamodelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__EPackageAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); }
		(
			{ before(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__GeneratedMetamodel__AliasAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGeneratedMetamodelAccess().getAliasIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getGeneratedMetamodelAccess().getAliasIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__EPackageAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); }
		(
			{ before(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_1_0_1()); }
			RULE_STRING
			{ after(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageSTRINGTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReferencedMetamodel__AliasAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReferencedMetamodelAccess().getAliasIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getReferencedMetamodelAccess().getAliasIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParserRuleAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getParserRuleAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__TypeAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getParserRuleAccess().getTypeTypeRefParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__DefinesHiddenTokensAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); }
		(
			{ before(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); }
			'hidden'
			{ after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); }
		)
		{ after(grammarAccess.getParserRuleAccess().getDefinesHiddenTokensHiddenKeyword_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__HiddenTokensAssignment_2_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0()); }
		(
			{ before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_0_0_1()); }
		)
		{ after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__HiddenTokensAssignment_2_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0()); }
		(
			{ before(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleIDTerminalRuleCall_2_2_1_1_0_1()); }
		)
		{ after(grammarAccess.getParserRuleAccess().getHiddenTokensAbstractRuleCrossReference_2_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParserRule__AlternativesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_4_0()); }
		ruleAlternatives
		{ after(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__MetamodelAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); }
		(
			{ before(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationIDTerminalRuleCall_0_0_0_1()); }
		)
		{ after(grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__ClassifierAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); }
		(
			{ before(grammarAccess.getTypeRefAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTypeRefAccess().getClassifierEClassifierIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternatives__GroupsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternativesAccess().getGroupsGroupParserRuleCall_1_1_1_0()); }
		ruleGroup
		{ after(grammarAccess.getAlternativesAccess().getGroupsGroupParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Group__TokensAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGroupAccess().getTokensAbstractTokenParserRuleCall_1_1_0()); }
		ruleAbstractToken
		{ after(grammarAccess.getGroupAccess().getTokensAbstractTokenParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractTokenWithCardinality__CardinalityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0()); }
		(rule__AbstractTokenWithCardinality__CardinalityAlternatives_1_0)
		{ after(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalityAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__FeatureAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getFeatureIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getActionAccess().getFeatureIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__OperatorAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0()); }
		(rule__Action__OperatorAlternatives_2_2_0)
		{ after(grammarAccess.getActionAccess().getOperatorAlternatives_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Keyword__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RuleCall__RuleAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0()); }
		(
			{ before(grammarAccess.getRuleCallAccess().getRuleAbstractRuleIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRuleCallAccess().getRuleAbstractRuleIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__FeatureAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getFeatureIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getAssignmentAccess().getFeatureIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__OperatorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getOperatorAlternatives_1_0()); }
		(rule__Assignment__OperatorAlternatives_1_0)
		{ after(grammarAccess.getAssignmentAccess().getOperatorAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Assignment__TerminalAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_2_0()); }
		ruleAssignableTerminal
		{ after(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AssignableAlternatives__GroupsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAssignableAlternativesAccess().getGroupsAssignableTerminalParserRuleCall_1_1_1_0()); }
		ruleAssignableTerminal
		{ after(grammarAccess.getAssignableAlternativesAccess().getGroupsAssignableTerminalParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReference__TerminalAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); }
		ruleCrossReferenceableTerminal
		{ after(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CrossReferenceableAlternatives__GroupsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCrossReferenceableAlternativesAccess().getGroupsCrossReferenceableTerminalParserRuleCall_1_1_1_0()); }
		ruleCrossReferenceableTerminal
		{ after(grammarAccess.getCrossReferenceableAlternativesAccess().getGroupsCrossReferenceableTerminalParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalRuleAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTerminalRuleAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__TypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getTerminalRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalRule__AlternativesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_4_0()); }
		ruleTerminalAlternatives
		{ after(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalAlternatives__GroupsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalAlternativesAccess().getGroupsTerminalGroupParserRuleCall_1_1_1_0()); }
		ruleTerminalGroup
		{ after(grammarAccess.getTerminalAlternativesAccess().getGroupsTerminalGroupParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalGroup__TokensAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalGroupAccess().getTokensTerminalTokenParserRuleCall_1_1_0()); }
		ruleTerminalToken
		{ after(grammarAccess.getTerminalGroupAccess().getTokensTerminalTokenParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TerminalToken__CardinalityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0()); }
		(rule__TerminalToken__CardinalityAlternatives_1_0)
		{ after(grammarAccess.getTerminalTokenAccess().getCardinalityAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NegatedToken__TerminalAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); }
		ruleTerminalTokenElement
		{ after(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UntilToken__TerminalAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); }
		ruleTerminalTokenElement
		{ after(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CharacterRange__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); }
		ruleKeyword
		{ after(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumRuleAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumRuleAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__TypeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getEnumRuleAccess().getTypeTypeRefParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumRule__AlternativesAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0()); }
		ruleEnumLiterals
		{ after(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiterals__GroupsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumLiteralsAccess().getGroupsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); }
		ruleEnumLiteralDeclaration
		{ after(grammarAccess.getEnumLiteralsAccess().getGroupsEnumLiteralDeclarationParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__EnumLiteralAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); }
		(
			{ before(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralDeclaration__LiteralAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); }
		ruleKeyword
		{ after(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
