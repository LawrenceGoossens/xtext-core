/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.indent.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class IndentationAwareTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class NodeListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.NodeList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cChildrenAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cChildrenNodeParserRuleCall_0_0 = (RuleCall)cChildrenAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cNLTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cChildrenAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cChildrenNodeParserRuleCall_1_1_0 = (RuleCall)cChildrenAssignment_1_1.eContents().get(0);
		
		//NodeList:
		//    children += Node (NL children += Node)*;
		@Override public ParserRule getRule() { return rule; }
		
		//children += Node (NL children += Node)*
		public Group getGroup() { return cGroup; }
		
		//children += Node
		public Assignment getChildrenAssignment_0() { return cChildrenAssignment_0; }
		
		//Node
		public RuleCall getChildrenNodeParserRuleCall_0_0() { return cChildrenNodeParserRuleCall_0_0; }
		
		//(NL children += Node)*
		public Group getGroup_1() { return cGroup_1; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_1_0() { return cNLTerminalRuleCall_1_0; }
		
		//children += Node
		public Assignment getChildrenAssignment_1_1() { return cChildrenAssignment_1_1; }
		
		//Node
		public RuleCall getChildrenNodeParserRuleCall_1_1_0() { return cChildrenNodeParserRuleCall_1_1_0; }
	}
	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameStringParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cNLTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final RuleCall cBEGINTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cChildrenAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cChildrenNodeListParserRuleCall_1_2_0 = (RuleCall)cChildrenAssignment_1_2.eContents().get(0);
		private final RuleCall cENDTerminalRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		
		//Node:
		//    name = String (NL BEGIN children = NodeList END)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name = String (NL BEGIN children = NodeList END)?
		public Group getGroup() { return cGroup; }
		
		//name = String
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//String
		public RuleCall getNameStringParserRuleCall_0_0() { return cNameStringParserRuleCall_0_0; }
		
		//(NL BEGIN children = NodeList END)?
		public Group getGroup_1() { return cGroup_1; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_1_0() { return cNLTerminalRuleCall_1_0; }
		
		//BEGIN
		public RuleCall getBEGINTerminalRuleCall_1_1() { return cBEGINTerminalRuleCall_1_1; }
		
		//children = NodeList
		public Assignment getChildrenAssignment_1_2() { return cChildrenAssignment_1_2; }
		
		//NodeList
		public RuleCall getChildrenNodeListParserRuleCall_1_2_0() { return cChildrenNodeListParserRuleCall_1_2_0; }
		
		//END
		public RuleCall getENDTerminalRuleCall_1_3() { return cENDTerminalRuleCall_1_3; }
	}
	public class StringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.String");
		private final RuleCall cOTHERTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//String returns ecore::EString:
		//    OTHER+;
		@Override public ParserRule getRule() { return rule; }
		
		//OTHER+
		public RuleCall getOTHERTerminalRuleCall() { return cOTHERTerminalRuleCall; }
	}
	
	
	private final NodeListElements pNodeList;
	private final NodeElements pNode;
	private final StringElements pString;
	private final TerminalRule tNL;
	private final TerminalRule tBEGIN;
	private final TerminalRule tEND;
	private final TerminalRule tOTHER;
	
	private final Grammar grammar;

	@Inject
	public IndentationAwareTestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pNodeList = new NodeListElements();
		this.pNode = new NodeElements();
		this.pString = new StringElements();
		this.tNL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.NL");
		this.tBEGIN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.BEGIN");
		this.tEND = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.END");
		this.tOTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage.OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.indent.IndentationAwareTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//NodeList:
	//    children += Node (NL children += Node)*;
	public NodeListElements getNodeListAccess() {
		return pNodeList;
	}
	
	public ParserRule getNodeListRule() {
		return getNodeListAccess().getRule();
	}
	
	//Node:
	//    name = String (NL BEGIN children = NodeList END)?;
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}
	
	//String returns ecore::EString:
	//    OTHER+;
	public StringElements getStringAccess() {
		return pString;
	}
	
	public ParserRule getStringRule() {
		return getStringAccess().getRule();
	}
	
	//terminal NL: ('\r'|'\n')+ '\t'*;
	public TerminalRule getNLRule() {
		return tNL;
	}
	
	//terminal BEGIN : '{';
	public TerminalRule getBEGINRule() {
		return tBEGIN;
	}
	
	//terminal END : '}';
	public TerminalRule getENDRule() {
		return tEND;
	}
	
	//terminal OTHER: .;
	public TerminalRule getOTHERRule() {
		return tOTHER;
	}
}
