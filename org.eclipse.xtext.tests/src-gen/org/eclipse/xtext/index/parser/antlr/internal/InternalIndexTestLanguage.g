/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalIndexTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.index.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.index.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.index.services.IndexTestLanguageGrammarAccess;

}

@parser::members {

 	private IndexTestLanguageGrammarAccess grammarAccess;

    public InternalIndexTestLanguageParser(TokenStream input, IndexTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "File";
   	}

   	@Override
   	protected IndexTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFile
entryRuleFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFileRule()); }
	iv_ruleFile=ruleFile
	{ $current=$iv_ruleFile.current; }
	EOF;

// Rule File
ruleFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getFileAccess().getElementsElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getFileRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.eclipse.xtext.index.IndexTestLanguage.Element");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.eclipse.xtext.index.IndexTestLanguage.QualifiedNameWithWildCard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifiedNameWithWildCard
entryRuleQualifiedNameWithWildCard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); }
	iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard
	{ $current=$iv_ruleQualifiedNameWithWildCard.current.getText(); }
	EOF;

// Rule QualifiedNameWithWildCard
ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0());
		}
		this_QualifiedName_0=ruleQualifiedName
		{
			$current.merge(this_QualifiedName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
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
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleNamespace
entryRuleNamespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamespaceRule()); }
	iv_ruleNamespace=ruleNamespace
	{ $current=$iv_ruleNamespace.current; }
	EOF;

// Rule Namespace
ruleNamespace returns [EObject current=null]
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
					newCompositeNode(grammarAccess.getNamespaceAccess().getNameQualifiedNameParserRuleCall_0_0());
				}
				lv_name_0_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.index.IndexTestLanguage.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getNamespaceAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getElementsElementParserRuleCall_2_0());
				}
				lv_elements_2_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					add(
						$current,
						"elements",
						lv_elements_2_0,
						"org.eclipse.xtext.index.IndexTestLanguage.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getNamespaceAccess().getRightCurlyBracketKeyword_3());
		}
	)
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
		{
			newCompositeNode(grammarAccess.getElementAccess().getNamespaceParserRuleCall_0());
		}
		this_Namespace_0=ruleNamespace
		{
			$current = $this_Namespace_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getTypeParserRuleCall_1());
		}
		this_Type_1=ruleType
		{
			$current = $this_Type_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getElementAccess().getImportParserRuleCall_2());
		}
		this_Import_2=ruleImport
		{
			$current = $this_Import_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_0());
		}
		this_Entity_0=ruleEntity
		{
			$current = $this_Entity_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_1());
		}
		this_Datatype_1=ruleDatatype
		{
			$current = $this_Datatype_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
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
			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getPropertiesPropertyParserRuleCall_3_0());
				}
				lv_properties_3_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"properties",
						lv_properties_3_0,
						"org.eclipse.xtext.index.IndexTestLanguage.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleDatatype
entryRuleDatatype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); }
	iv_ruleDatatype=ruleDatatype
	{ $current=$iv_ruleDatatype.current; }
	EOF;

// Rule Datatype
ruleDatatype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDatatypeRule());
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

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_0_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
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

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
