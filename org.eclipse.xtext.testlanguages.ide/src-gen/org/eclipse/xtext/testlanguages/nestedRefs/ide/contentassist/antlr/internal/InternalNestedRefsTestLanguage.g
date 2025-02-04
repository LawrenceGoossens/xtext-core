/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalNestedRefsTestLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.nestedRefs.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.nestedRefs.ide.contentassist.antlr.internal;

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
import org.eclipse.xtext.testlanguages.nestedRefs.services.NestedRefsTestLanguageGrammarAccess;

}
@parser::members {
	private NestedRefsTestLanguageGrammarAccess grammarAccess;

	public void setGrammarAccess(NestedRefsTestLanguageGrammarAccess grammarAccess) {
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

// Entry rule entryRuleDoc
entryRuleDoc
:
{ before(grammarAccess.getDocRule()); }
	 ruleDoc
{ after(grammarAccess.getDocRule()); } 
	 EOF 
;

// Rule Doc
ruleDoc 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDocAccess().getDeclarationsAssignment()); }
		(rule__Doc__DeclarationsAssignment)*
		{ after(grammarAccess.getDocAccess().getDeclarationsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSelfReferingDecl
entryRuleSelfReferingDecl
:
{ before(grammarAccess.getSelfReferingDeclRule()); }
	 ruleSelfReferingDecl
{ after(grammarAccess.getSelfReferingDeclRule()); } 
	 EOF 
;

// Rule SelfReferingDecl
ruleSelfReferingDecl 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSelfReferingDeclAccess().getGroup()); }
		(rule__SelfReferingDecl__Group__0)
		{ after(grammarAccess.getSelfReferingDeclAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
		(rule__QualifiedName__Group__0)
		{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfReferingDecl__Group__0__Impl
	rule__SelfReferingDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfReferingDeclAccess().getDeclKeyword_0()); }
	'decl'
	{ after(grammarAccess.getSelfReferingDeclAccess().getDeclKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfReferingDecl__Group__1__Impl
	rule__SelfReferingDecl__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfReferingDeclAccess().getNameAssignment_1()); }
	(rule__SelfReferingDecl__NameAssignment_1)
	{ after(grammarAccess.getSelfReferingDeclAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfReferingDecl__Group__2__Impl
	rule__SelfReferingDecl__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfReferingDeclAccess().getEndKeyword_2()); }
	'end'
	{ after(grammarAccess.getSelfReferingDeclAccess().getEndKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfReferingDecl__Group__3__Impl
	rule__SelfReferingDecl__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfReferingDeclAccess().getSelfRefAssignment_3()); }
	(rule__SelfReferingDecl__SelfRefAssignment_3)
	{ after(grammarAccess.getSelfReferingDeclAccess().getSelfRefAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SelfReferingDecl__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSelfReferingDeclAccess().getSemicolonKeyword_4()); }
	';'
	{ after(grammarAccess.getSelfReferingDeclAccess().getSemicolonKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
	(rule__QualifiedName__Group_1__0)*
	{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Doc__DeclarationsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDocAccess().getDeclarationsSelfReferingDeclParserRuleCall_0()); }
		ruleSelfReferingDecl
		{ after(grammarAccess.getDocAccess().getDeclarationsSelfReferingDeclParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfReferingDeclAccess().getNameQualifiedNameParserRuleCall_1_0()); }
		ruleQualifiedName
		{ after(grammarAccess.getSelfReferingDeclAccess().getNameQualifiedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SelfReferingDecl__SelfRefAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSelfReferingDeclAccess().getSelfRefSelfReferingDeclCrossReference_3_0()); }
		(
			{ before(grammarAccess.getSelfReferingDeclAccess().getSelfRefSelfReferingDeclQualifiedNameParserRuleCall_3_0_1()); }
			ruleQualifiedName
			{ after(grammarAccess.getSelfReferingDeclAccess().getSelfRefSelfReferingDeclQualifiedNameParserRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getSelfReferingDeclAccess().getSelfRefSelfReferingDeclCrossReference_3_0()); }
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
