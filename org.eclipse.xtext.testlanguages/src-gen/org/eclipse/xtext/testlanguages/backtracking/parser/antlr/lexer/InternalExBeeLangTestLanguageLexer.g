/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
lexer grammar InternalExBeeLangTestLanguageLexer;

@header {
package org.eclipse.xtext.testlanguages.backtracking.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

RequiresMax : 'requires-max';

RequiresMin : 'requires-min';

Implements : 'implements';

Properties : 'properties';

Function : 'function';

Provides : 'provides';

Requires : 'requires';

Builder : 'builder';

Context : 'context';

Version : 'version';

Cached : 'cached';

Greedy : 'greedy';

Output : 'output';

Source : 'source';

Final : 'final';

Input : 'input';

Name : 'name';

This : 'this';

Unit : 'unit';

When : 'when';

With : 'with';

ExclamationMarkEqualsSignEqualsSign : '!==';

FullStopFullStopFullStop : '...';

EqualsSignEqualsSignEqualsSign : '===';

Env : 'env';

New : 'new';

Val : 'val';

Var : 'var';

ExclamationMarkEqualsSign : '!=';

PercentSignEqualsSign : '%=';

AmpersandAmpersand : '&&';

AsteriskEqualsSign : '*=';

PlusSignPlusSign : '++';

PlusSignEqualsSign : '+=';

HyphenMinusHyphenMinus : '--';

HyphenMinusEqualsSign : '-=';

FullStopFullStop : '..';

SolidusEqualsSign : '/=';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

EqualsSignGreaterThanSign : '=>';

GreaterThanSignEqualsSign : '>=';

As : 'as';

VerticalLineVerticalLine : '||';

TildeEqualsSign : '~=';

ExclamationMark : '!';

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

Semicolon : ';';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

VerticalLine : '|';

RightCurlyBracket : '}';

RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
