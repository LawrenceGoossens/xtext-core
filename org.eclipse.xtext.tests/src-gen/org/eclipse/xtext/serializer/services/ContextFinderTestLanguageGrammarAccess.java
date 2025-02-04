/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.serializer.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ContextFinderTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cNumberSignDigitZeroKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cModelAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cModelModel2ParserRuleCall_0_1_0 = (RuleCall)cModelAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cNumberSignDigitOneKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAttributeExclusionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cAttributeExclusionAlternatives_1_1_0 = (Alternatives)cAttributeExclusionAssignment_1_1.eContents().get(0);
		private final RuleCall cAttributeExclusionAttributeExclusionTest1ParserRuleCall_1_1_0_0 = (RuleCall)cAttributeExclusionAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cAttributeExclusionAttributeExclusionTest2ParserRuleCall_1_1_0_1 = (RuleCall)cAttributeExclusionAlternatives_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cNumberSignDigitTwoKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cNestedTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cNestedTypeAlternatives_2_1_0 = (Alternatives)cNestedTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cNestedTypeNestedTypeTest1ParserRuleCall_2_1_0_0 = (RuleCall)cNestedTypeAlternatives_2_1_0.eContents().get(0);
		private final RuleCall cNestedTypeNestedTypeTest2ParserRuleCall_2_1_0_1 = (RuleCall)cNestedTypeAlternatives_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cNumberSignDigitThreeKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNestedTypeRecursiveTest2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final Alternatives cNestedTypeRecursiveTest2Alternatives_3_1_0 = (Alternatives)cNestedTypeRecursiveTest2Assignment_3_1.eContents().get(0);
		private final RuleCall cNestedTypeRecursiveTest2NestedTypeRecursiveTest1ParserRuleCall_3_1_0_0 = (RuleCall)cNestedTypeRecursiveTest2Alternatives_3_1_0.eContents().get(0);
		private final RuleCall cNestedTypeRecursiveTest2NestedTypeRecursiveTest2ParserRuleCall_3_1_0_1 = (RuleCall)cNestedTypeRecursiveTest2Alternatives_3_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cNumberSignDigitFourKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cParentRefAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final Alternatives cParentRefAlternatives_4_1_0 = (Alternatives)cParentRefAssignment_4_1.eContents().get(0);
		private final RuleCall cParentRefParentRefTest1ParserRuleCall_4_1_0_0 = (RuleCall)cParentRefAlternatives_4_1_0.eContents().get(0);
		private final RuleCall cParentRefParentRefTest2ParserRuleCall_4_1_0_1 = (RuleCall)cParentRefAlternatives_4_1_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cNumberSignDigitFiveKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cQuantityExclusionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Alternatives cQuantityExclusionAlternatives_5_1_0 = (Alternatives)cQuantityExclusionAssignment_5_1.eContents().get(0);
		private final RuleCall cQuantityExclusionQuantityExclusionTest1ParserRuleCall_5_1_0_0 = (RuleCall)cQuantityExclusionAlternatives_5_1_0.eContents().get(0);
		private final RuleCall cQuantityExclusionQuantityExclusionTest2ParserRuleCall_5_1_0_1 = (RuleCall)cQuantityExclusionAlternatives_5_1_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cNumberSignDigitSixKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cValueExclusionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final Alternatives cValueExclusionAlternatives_6_1_0 = (Alternatives)cValueExclusionAssignment_6_1.eContents().get(0);
		private final RuleCall cValueExclusionValueExclusionTest1ParserRuleCall_6_1_0_0 = (RuleCall)cValueExclusionAlternatives_6_1_0.eContents().get(0);
		private final RuleCall cValueExclusionValueExclusionTest2ParserRuleCall_6_1_0_1 = (RuleCall)cValueExclusionAlternatives_6_1_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cNumberSignDigitSevenKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cNameAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_7_1_0 = (RuleCall)cNameAssignment_7_1.eContents().get(0);
		private final Assignment cNodeExclusionAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final Alternatives cNodeExclusionAlternatives_7_2_0 = (Alternatives)cNodeExclusionAssignment_7_2.eContents().get(0);
		private final RuleCall cNodeExclusionNodeExclusion1ParserRuleCall_7_2_0_0 = (RuleCall)cNodeExclusionAlternatives_7_2_0.eContents().get(0);
		private final RuleCall cNodeExclusionNodeExclusion2ParserRuleCall_7_2_0_1 = (RuleCall)cNodeExclusionAlternatives_7_2_0.eContents().get(1);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Keyword cNumberSignDigitEightKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cNameAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_8_1_0 = (RuleCall)cNameAssignment_8_1.eContents().get(0);
		private final Assignment cNodeExclusionListAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final Alternatives cNodeExclusionListAlternatives_8_2_0 = (Alternatives)cNodeExclusionListAssignment_8_2.eContents().get(0);
		private final RuleCall cNodeExclusionListNodeExclusion1ListParserRuleCall_8_2_0_0 = (RuleCall)cNodeExclusionListAlternatives_8_2_0.eContents().get(0);
		private final RuleCall cNodeExclusionListNodeExclusion2ListParserRuleCall_8_2_0_1 = (RuleCall)cNodeExclusionListAlternatives_8_2_0.eContents().get(1);
		
		//Model:
		//    ("#0" model=Model2) |
		//    ("#1" attributeExclusion=(AttributeExclusionTest1|AttributeExclusionTest2)) |
		//    ("#2" nestedType=(NestedTypeTest1|NestedTypeTest2)) |
		//    ("#3" nestedTypeRecursiveTest2=(NestedTypeRecursiveTest1|NestedTypeRecursiveTest2)) |
		//    ("#4" parentRef=(ParentRefTest1|ParentRefTest2)) |
		//    ("#5" quantityExclusion=(QuantityExclusionTest1|QuantityExclusionTest2)) |
		//    ("#6" valueExclusion=(ValueExclusionTest1|ValueExclusionTest2)) |
		//    ("#7" name=STRING nodeExclusion=(NodeExclusion1|NodeExclusion2)) |
		//    ("#8" name=STRING nodeExclusionList=(NodeExclusion1List|NodeExclusion2List))
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//("#0" model=Model2) |
		//("#1" attributeExclusion=(AttributeExclusionTest1|AttributeExclusionTest2)) |
		//("#2" nestedType=(NestedTypeTest1|NestedTypeTest2)) |
		//("#3" nestedTypeRecursiveTest2=(NestedTypeRecursiveTest1|NestedTypeRecursiveTest2)) |
		//("#4" parentRef=(ParentRefTest1|ParentRefTest2)) |
		//("#5" quantityExclusion=(QuantityExclusionTest1|QuantityExclusionTest2)) |
		//("#6" valueExclusion=(ValueExclusionTest1|ValueExclusionTest2)) |
		//("#7" name=STRING nodeExclusion=(NodeExclusion1|NodeExclusion2)) |
		//("#8" name=STRING nodeExclusionList=(NodeExclusion1List|NodeExclusion2List))
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//("#0" model=Model2)
		public Group getGroup_0() { return cGroup_0; }
		
		//"#0"
		public Keyword getNumberSignDigitZeroKeyword_0_0() { return cNumberSignDigitZeroKeyword_0_0; }
		
		//model=Model2
		public Assignment getModelAssignment_0_1() { return cModelAssignment_0_1; }
		
		//Model2
		public RuleCall getModelModel2ParserRuleCall_0_1_0() { return cModelModel2ParserRuleCall_0_1_0; }
		
		//("#1" attributeExclusion=(AttributeExclusionTest1|AttributeExclusionTest2))
		public Group getGroup_1() { return cGroup_1; }
		
		//"#1"
		public Keyword getNumberSignDigitOneKeyword_1_0() { return cNumberSignDigitOneKeyword_1_0; }
		
		//attributeExclusion=(AttributeExclusionTest1|AttributeExclusionTest2)
		public Assignment getAttributeExclusionAssignment_1_1() { return cAttributeExclusionAssignment_1_1; }
		
		//(AttributeExclusionTest1|AttributeExclusionTest2)
		public Alternatives getAttributeExclusionAlternatives_1_1_0() { return cAttributeExclusionAlternatives_1_1_0; }
		
		//AttributeExclusionTest1
		public RuleCall getAttributeExclusionAttributeExclusionTest1ParserRuleCall_1_1_0_0() { return cAttributeExclusionAttributeExclusionTest1ParserRuleCall_1_1_0_0; }
		
		//AttributeExclusionTest2
		public RuleCall getAttributeExclusionAttributeExclusionTest2ParserRuleCall_1_1_0_1() { return cAttributeExclusionAttributeExclusionTest2ParserRuleCall_1_1_0_1; }
		
		//("#2" nestedType=(NestedTypeTest1|NestedTypeTest2))
		public Group getGroup_2() { return cGroup_2; }
		
		//"#2"
		public Keyword getNumberSignDigitTwoKeyword_2_0() { return cNumberSignDigitTwoKeyword_2_0; }
		
		//nestedType=(NestedTypeTest1|NestedTypeTest2)
		public Assignment getNestedTypeAssignment_2_1() { return cNestedTypeAssignment_2_1; }
		
		//(NestedTypeTest1|NestedTypeTest2)
		public Alternatives getNestedTypeAlternatives_2_1_0() { return cNestedTypeAlternatives_2_1_0; }
		
		//NestedTypeTest1
		public RuleCall getNestedTypeNestedTypeTest1ParserRuleCall_2_1_0_0() { return cNestedTypeNestedTypeTest1ParserRuleCall_2_1_0_0; }
		
		//NestedTypeTest2
		public RuleCall getNestedTypeNestedTypeTest2ParserRuleCall_2_1_0_1() { return cNestedTypeNestedTypeTest2ParserRuleCall_2_1_0_1; }
		
		//("#3" nestedTypeRecursiveTest2=(NestedTypeRecursiveTest1|NestedTypeRecursiveTest2))
		public Group getGroup_3() { return cGroup_3; }
		
		//"#3"
		public Keyword getNumberSignDigitThreeKeyword_3_0() { return cNumberSignDigitThreeKeyword_3_0; }
		
		//nestedTypeRecursiveTest2=(NestedTypeRecursiveTest1|NestedTypeRecursiveTest2)
		public Assignment getNestedTypeRecursiveTest2Assignment_3_1() { return cNestedTypeRecursiveTest2Assignment_3_1; }
		
		//(NestedTypeRecursiveTest1|NestedTypeRecursiveTest2)
		public Alternatives getNestedTypeRecursiveTest2Alternatives_3_1_0() { return cNestedTypeRecursiveTest2Alternatives_3_1_0; }
		
		//NestedTypeRecursiveTest1
		public RuleCall getNestedTypeRecursiveTest2NestedTypeRecursiveTest1ParserRuleCall_3_1_0_0() { return cNestedTypeRecursiveTest2NestedTypeRecursiveTest1ParserRuleCall_3_1_0_0; }
		
		//NestedTypeRecursiveTest2
		public RuleCall getNestedTypeRecursiveTest2NestedTypeRecursiveTest2ParserRuleCall_3_1_0_1() { return cNestedTypeRecursiveTest2NestedTypeRecursiveTest2ParserRuleCall_3_1_0_1; }
		
		//("#4" parentRef=(ParentRefTest1|ParentRefTest2))
		public Group getGroup_4() { return cGroup_4; }
		
		//"#4"
		public Keyword getNumberSignDigitFourKeyword_4_0() { return cNumberSignDigitFourKeyword_4_0; }
		
		//parentRef=(ParentRefTest1|ParentRefTest2)
		public Assignment getParentRefAssignment_4_1() { return cParentRefAssignment_4_1; }
		
		//(ParentRefTest1|ParentRefTest2)
		public Alternatives getParentRefAlternatives_4_1_0() { return cParentRefAlternatives_4_1_0; }
		
		//ParentRefTest1
		public RuleCall getParentRefParentRefTest1ParserRuleCall_4_1_0_0() { return cParentRefParentRefTest1ParserRuleCall_4_1_0_0; }
		
		//ParentRefTest2
		public RuleCall getParentRefParentRefTest2ParserRuleCall_4_1_0_1() { return cParentRefParentRefTest2ParserRuleCall_4_1_0_1; }
		
		//("#5" quantityExclusion=(QuantityExclusionTest1|QuantityExclusionTest2))
		public Group getGroup_5() { return cGroup_5; }
		
		//"#5"
		public Keyword getNumberSignDigitFiveKeyword_5_0() { return cNumberSignDigitFiveKeyword_5_0; }
		
		//quantityExclusion=(QuantityExclusionTest1|QuantityExclusionTest2)
		public Assignment getQuantityExclusionAssignment_5_1() { return cQuantityExclusionAssignment_5_1; }
		
		//(QuantityExclusionTest1|QuantityExclusionTest2)
		public Alternatives getQuantityExclusionAlternatives_5_1_0() { return cQuantityExclusionAlternatives_5_1_0; }
		
		//QuantityExclusionTest1
		public RuleCall getQuantityExclusionQuantityExclusionTest1ParserRuleCall_5_1_0_0() { return cQuantityExclusionQuantityExclusionTest1ParserRuleCall_5_1_0_0; }
		
		//QuantityExclusionTest2
		public RuleCall getQuantityExclusionQuantityExclusionTest2ParserRuleCall_5_1_0_1() { return cQuantityExclusionQuantityExclusionTest2ParserRuleCall_5_1_0_1; }
		
		//("#6" valueExclusion=(ValueExclusionTest1|ValueExclusionTest2))
		public Group getGroup_6() { return cGroup_6; }
		
		//"#6"
		public Keyword getNumberSignDigitSixKeyword_6_0() { return cNumberSignDigitSixKeyword_6_0; }
		
		//valueExclusion=(ValueExclusionTest1|ValueExclusionTest2)
		public Assignment getValueExclusionAssignment_6_1() { return cValueExclusionAssignment_6_1; }
		
		//(ValueExclusionTest1|ValueExclusionTest2)
		public Alternatives getValueExclusionAlternatives_6_1_0() { return cValueExclusionAlternatives_6_1_0; }
		
		//ValueExclusionTest1
		public RuleCall getValueExclusionValueExclusionTest1ParserRuleCall_6_1_0_0() { return cValueExclusionValueExclusionTest1ParserRuleCall_6_1_0_0; }
		
		//ValueExclusionTest2
		public RuleCall getValueExclusionValueExclusionTest2ParserRuleCall_6_1_0_1() { return cValueExclusionValueExclusionTest2ParserRuleCall_6_1_0_1; }
		
		//("#7" name=STRING nodeExclusion=(NodeExclusion1|NodeExclusion2))
		public Group getGroup_7() { return cGroup_7; }
		
		//"#7"
		public Keyword getNumberSignDigitSevenKeyword_7_0() { return cNumberSignDigitSevenKeyword_7_0; }
		
		//name=STRING
		public Assignment getNameAssignment_7_1() { return cNameAssignment_7_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_7_1_0() { return cNameSTRINGTerminalRuleCall_7_1_0; }
		
		//nodeExclusion=(NodeExclusion1|NodeExclusion2)
		public Assignment getNodeExclusionAssignment_7_2() { return cNodeExclusionAssignment_7_2; }
		
		//(NodeExclusion1|NodeExclusion2)
		public Alternatives getNodeExclusionAlternatives_7_2_0() { return cNodeExclusionAlternatives_7_2_0; }
		
		//NodeExclusion1
		public RuleCall getNodeExclusionNodeExclusion1ParserRuleCall_7_2_0_0() { return cNodeExclusionNodeExclusion1ParserRuleCall_7_2_0_0; }
		
		//NodeExclusion2
		public RuleCall getNodeExclusionNodeExclusion2ParserRuleCall_7_2_0_1() { return cNodeExclusionNodeExclusion2ParserRuleCall_7_2_0_1; }
		
		//("#8" name=STRING nodeExclusionList=(NodeExclusion1List|NodeExclusion2List))
		public Group getGroup_8() { return cGroup_8; }
		
		//"#8"
		public Keyword getNumberSignDigitEightKeyword_8_0() { return cNumberSignDigitEightKeyword_8_0; }
		
		//name=STRING
		public Assignment getNameAssignment_8_1() { return cNameAssignment_8_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_8_1_0() { return cNameSTRINGTerminalRuleCall_8_1_0; }
		
		//nodeExclusionList=(NodeExclusion1List|NodeExclusion2List)
		public Assignment getNodeExclusionListAssignment_8_2() { return cNodeExclusionListAssignment_8_2; }
		
		//(NodeExclusion1List|NodeExclusion2List)
		public Alternatives getNodeExclusionListAlternatives_8_2_0() { return cNodeExclusionListAlternatives_8_2_0; }
		
		//NodeExclusion1List
		public RuleCall getNodeExclusionListNodeExclusion1ListParserRuleCall_8_2_0_0() { return cNodeExclusionListNodeExclusion1ListParserRuleCall_8_2_0_0; }
		
		//NodeExclusion2List
		public RuleCall getNodeExclusionListNodeExclusion2ListParserRuleCall_8_2_0_1() { return cNodeExclusionListNodeExclusion2ListParserRuleCall_8_2_0_1; }
	}
	public class Model2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.Model2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Model2 returns Model: {Model} "model";
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} "model"
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//"model"
		public Keyword getModelKeyword_1() { return cModelKeyword_1; }
	}
	public class AttributeExclusionTest1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.AttributeExclusionTest1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttr1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttr1IDTerminalRuleCall_1_0 = (RuleCall)cAttr1Assignment_1.eContents().get(0);
		
		//AttributeExclusionTest1 returns AttributeExclusionTest: "kw1" attr1=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw1" attr1=ID
		public Group getGroup() { return cGroup; }
		
		//"kw1"
		public Keyword getKw1Keyword_0() { return cKw1Keyword_0; }
		
		//attr1=ID
		public Assignment getAttr1Assignment_1() { return cAttr1Assignment_1; }
		
		//ID
		public RuleCall getAttr1IDTerminalRuleCall_1_0() { return cAttr1IDTerminalRuleCall_1_0; }
	}
	public class AttributeExclusionTest2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.AttributeExclusionTest2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttr2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttr2IDTerminalRuleCall_1_0 = (RuleCall)cAttr2Assignment_1.eContents().get(0);
		
		//AttributeExclusionTest2 returns AttributeExclusionTest: "kw2" attr2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw2" attr2=ID
		public Group getGroup() { return cGroup; }
		
		//"kw2"
		public Keyword getKw2Keyword_0() { return cKw2Keyword_0; }
		
		//attr2=ID
		public Assignment getAttr2Assignment_1() { return cAttr2Assignment_1; }
		
		//ID
		public RuleCall getAttr2IDTerminalRuleCall_1_0() { return cAttr2IDTerminalRuleCall_1_0; }
	}
	public class NestedTypeTest1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeTest1");
		private final Assignment cNestedAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNestedNestedTypeChild1ParserRuleCall_0 = (RuleCall)cNestedAssignment.eContents().get(0);
		
		//NestedTypeTest1 returns NestedTypeTest:	nested=NestedTypeChild1;
		@Override public ParserRule getRule() { return rule; }
		
		//nested=NestedTypeChild1
		public Assignment getNestedAssignment() { return cNestedAssignment; }
		
		//NestedTypeChild1
		public RuleCall getNestedNestedTypeChild1ParserRuleCall_0() { return cNestedNestedTypeChild1ParserRuleCall_0; }
	}
	public class NestedTypeTest2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeTest2");
		private final Assignment cNestedAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNestedNestedTypeChild2ParserRuleCall_0 = (RuleCall)cNestedAssignment.eContents().get(0);
		
		//NestedTypeTest2 returns NestedTypeTest:	nested=NestedTypeChild2;
		@Override public ParserRule getRule() { return rule; }
		
		//nested=NestedTypeChild2
		public Assignment getNestedAssignment() { return cNestedAssignment; }
		
		//NestedTypeChild2
		public RuleCall getNestedNestedTypeChild2ParserRuleCall_0() { return cNestedNestedTypeChild2ParserRuleCall_0; }
	}
	public class NestedTypeChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeChild");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNestedTypeChild1ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNestedTypeChild2ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NestedTypeChild: NestedTypeChild1| NestedTypeChild2;
		@Override public ParserRule getRule() { return rule; }
		
		//NestedTypeChild1| NestedTypeChild2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NestedTypeChild1
		public RuleCall getNestedTypeChild1ParserRuleCall_0() { return cNestedTypeChild1ParserRuleCall_0; }
		
		//NestedTypeChild2
		public RuleCall getNestedTypeChild2ParserRuleCall_1() { return cNestedTypeChild2ParserRuleCall_1; }
	}
	public class NestedTypeChild1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeChild1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//NestedTypeChild1: "kw1" val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw1" val=ID
		public Group getGroup() { return cGroup; }
		
		//"kw1"
		public Keyword getKw1Keyword_0() { return cKw1Keyword_0; }
		
		//val=ID
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0() { return cValIDTerminalRuleCall_1_0; }
	}
	public class NestedTypeChild2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeChild2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//NestedTypeChild2: "kw2" val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw2" val=ID
		public Group getGroup() { return cGroup; }
		
		//"kw2"
		public Keyword getKw2Keyword_0() { return cKw2Keyword_0; }
		
		//val=ID
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0() { return cValIDTerminalRuleCall_1_0; }
	}
	public class NestedTypeRecursiveTest1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeRecursiveTest1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNestedTypeRecursiveTest1Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cKw1Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Action cNestedTypeRecursiveTestLeftAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cFullStopKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		
		//NestedTypeRecursiveTest1 returns NestedTypeRecursiveTest: {NestedTypeRecursiveTest1} "kw1" ({NestedTypeRecursiveTest.left=current} ".")+;
		@Override public ParserRule getRule() { return rule; }
		
		//{NestedTypeRecursiveTest1} "kw1" ({NestedTypeRecursiveTest.left=current} ".")+
		public Group getGroup() { return cGroup; }
		
		//{NestedTypeRecursiveTest1}
		public Action getNestedTypeRecursiveTest1Action_0() { return cNestedTypeRecursiveTest1Action_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_1() { return cKw1Keyword_1; }
		
		//({NestedTypeRecursiveTest.left=current} ".")+
		public Group getGroup_2() { return cGroup_2; }
		
		//{NestedTypeRecursiveTest.left=current}
		public Action getNestedTypeRecursiveTestLeftAction_2_0() { return cNestedTypeRecursiveTestLeftAction_2_0; }
		
		//"."
		public Keyword getFullStopKeyword_2_1() { return cFullStopKeyword_2_1; }
	}
	public class NestedTypeRecursiveTest2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeRecursiveTest2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNestedTypeRecursiveTest2Action_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cKw2Keyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Action cNestedTypeRecursiveTestLeftAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cFullStopKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		
		//NestedTypeRecursiveTest2 returns NestedTypeRecursiveTest: {NestedTypeRecursiveTest2} "kw2" ({NestedTypeRecursiveTest.left=current} ".")+;
		@Override public ParserRule getRule() { return rule; }
		
		//{NestedTypeRecursiveTest2} "kw2" ({NestedTypeRecursiveTest.left=current} ".")+
		public Group getGroup() { return cGroup; }
		
		//{NestedTypeRecursiveTest2}
		public Action getNestedTypeRecursiveTest2Action_0() { return cNestedTypeRecursiveTest2Action_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_1() { return cKw2Keyword_1; }
		
		//({NestedTypeRecursiveTest.left=current} ".")+
		public Group getGroup_2() { return cGroup_2; }
		
		//{NestedTypeRecursiveTest.left=current}
		public Action getNestedTypeRecursiveTestLeftAction_2_0() { return cNestedTypeRecursiveTestLeftAction_2_0; }
		
		//"."
		public Keyword getFullStopKeyword_2_1() { return cFullStopKeyword_2_1; }
	}
	public class ParentRefTest1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTest1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cChild1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cChild1ParentRefTestChild1ParserRuleCall_1_0 = (RuleCall)cChild1Assignment_1.eContents().get(0);
		
		//ParentRefTest1: "kw1" child1=ParentRefTestChild1;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw1" child1=ParentRefTestChild1
		public Group getGroup() { return cGroup; }
		
		//"kw1"
		public Keyword getKw1Keyword_0() { return cKw1Keyword_0; }
		
		//child1=ParentRefTestChild1
		public Assignment getChild1Assignment_1() { return cChild1Assignment_1; }
		
		//ParentRefTestChild1
		public RuleCall getChild1ParentRefTestChild1ParserRuleCall_1_0() { return cChild1ParentRefTestChild1ParserRuleCall_1_0; }
	}
	public class ParentRefTest2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTest2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cChild2Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cChild2ParentRefTestChild2ParserRuleCall_1_0 = (RuleCall)cChild2Assignment_1.eContents().get(0);
		
		//ParentRefTest2: "kw2" child2=ParentRefTestChild2;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw2" child2=ParentRefTestChild2
		public Group getGroup() { return cGroup; }
		
		//"kw2"
		public Keyword getKw2Keyword_0() { return cKw2Keyword_0; }
		
		//child2=ParentRefTestChild2
		public Assignment getChild2Assignment_1() { return cChild2Assignment_1; }
		
		//ParentRefTestChild2
		public RuleCall getChild2ParentRefTestChild2ParserRuleCall_1_0() { return cChild2ParentRefTestChild2ParserRuleCall_1_0; }
	}
	public class ParentRefTestChild1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParentRefTestChildAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFooKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cChildAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChildParentRefTestChild1ParserRuleCall_2_0 = (RuleCall)cChildAssignment_2.eContents().get(0);
		
		//ParentRefTestChild1 returns ParentRefTestChild: {ParentRefTestChild} "foo" child=ParentRefTestChild1?;
		@Override public ParserRule getRule() { return rule; }
		
		//{ParentRefTestChild} "foo" child=ParentRefTestChild1?
		public Group getGroup() { return cGroup; }
		
		//{ParentRefTestChild}
		public Action getParentRefTestChildAction_0() { return cParentRefTestChildAction_0; }
		
		//"foo"
		public Keyword getFooKeyword_1() { return cFooKeyword_1; }
		
		//child=ParentRefTestChild1?
		public Assignment getChildAssignment_2() { return cChildAssignment_2; }
		
		//ParentRefTestChild1
		public RuleCall getChildParentRefTestChild1ParserRuleCall_2_0() { return cChildParentRefTestChild1ParserRuleCall_2_0; }
	}
	public class ParentRefTestChild2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParentRefTestChildAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFooKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cChildAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cChildParentRefTestChild2ParserRuleCall_2_0 = (RuleCall)cChildAssignment_2.eContents().get(0);
		
		//ParentRefTestChild2 returns ParentRefTestChild: {ParentRefTestChild} "foo" child=ParentRefTestChild2?;
		@Override public ParserRule getRule() { return rule; }
		
		//{ParentRefTestChild} "foo" child=ParentRefTestChild2?
		public Group getGroup() { return cGroup; }
		
		//{ParentRefTestChild}
		public Action getParentRefTestChildAction_0() { return cParentRefTestChildAction_0; }
		
		//"foo"
		public Keyword getFooKeyword_1() { return cFooKeyword_1; }
		
		//child=ParentRefTestChild2?
		public Assignment getChildAssignment_2() { return cChildAssignment_2; }
		
		//ParentRefTestChild2
		public RuleCall getChildParentRefTestChild2ParserRuleCall_2_0() { return cChildParentRefTestChild2ParserRuleCall_2_0; }
	}
	public class QuantityExclusionTest1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.QuantityExclusionTest1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttr1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttr1IDTerminalRuleCall_1_0 = (RuleCall)cAttr1Assignment_1.eContents().get(0);
		private final Assignment cAttr2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttr2IDTerminalRuleCall_2_0 = (RuleCall)cAttr2Assignment_2.eContents().get(0);
		
		//QuantityExclusionTest1 returns QuantityExclusionTest: "kw1" attr1=ID attr2=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw1" attr1=ID attr2=ID?
		public Group getGroup() { return cGroup; }
		
		//"kw1"
		public Keyword getKw1Keyword_0() { return cKw1Keyword_0; }
		
		//attr1=ID
		public Assignment getAttr1Assignment_1() { return cAttr1Assignment_1; }
		
		//ID
		public RuleCall getAttr1IDTerminalRuleCall_1_0() { return cAttr1IDTerminalRuleCall_1_0; }
		
		//attr2=ID?
		public Assignment getAttr2Assignment_2() { return cAttr2Assignment_2; }
		
		//ID
		public RuleCall getAttr2IDTerminalRuleCall_2_0() { return cAttr2IDTerminalRuleCall_2_0; }
	}
	public class QuantityExclusionTest2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.QuantityExclusionTest2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAttr1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAttr1IDTerminalRuleCall_1_0 = (RuleCall)cAttr1Assignment_1.eContents().get(0);
		private final Assignment cAttr2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttr2IDTerminalRuleCall_2_0 = (RuleCall)cAttr2Assignment_2.eContents().get(0);
		
		//QuantityExclusionTest2 returns QuantityExclusionTest: "kw2" attr1=ID? attr2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"kw2" attr1=ID? attr2=ID
		public Group getGroup() { return cGroup; }
		
		//"kw2"
		public Keyword getKw2Keyword_0() { return cKw2Keyword_0; }
		
		//attr1=ID?
		public Assignment getAttr1Assignment_1() { return cAttr1Assignment_1; }
		
		//ID
		public RuleCall getAttr1IDTerminalRuleCall_1_0() { return cAttr1IDTerminalRuleCall_1_0; }
		
		//attr2=ID
		public Assignment getAttr2Assignment_2() { return cAttr2Assignment_2; }
		
		//ID
		public RuleCall getAttr2IDTerminalRuleCall_2_0() { return cAttr2IDTerminalRuleCall_2_0; }
	}
	public class ValueExclusionTest1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTest1");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValValueExclusionTestEn1EnumRuleCall_0 = (RuleCall)cValAssignment.eContents().get(0);
		
		//ValueExclusionTest1 returns ValueExclusionTest: val=ValueExclusionTestEn1;
		@Override public ParserRule getRule() { return rule; }
		
		//val=ValueExclusionTestEn1
		public Assignment getValAssignment() { return cValAssignment; }
		
		//ValueExclusionTestEn1
		public RuleCall getValValueExclusionTestEn1EnumRuleCall_0() { return cValValueExclusionTestEn1EnumRuleCall_0; }
	}
	public class ValueExclusionTest2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTest2");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValValueExclusionTestEn2EnumRuleCall_0 = (RuleCall)cValAssignment.eContents().get(0);
		
		//ValueExclusionTest2 returns ValueExclusionTest: val=ValueExclusionTestEn2;
		@Override public ParserRule getRule() { return rule; }
		
		//val=ValueExclusionTestEn2
		public Assignment getValAssignment() { return cValAssignment; }
		
		//ValueExclusionTestEn2
		public RuleCall getValValueExclusionTestEn2EnumRuleCall_0() { return cValValueExclusionTestEn2EnumRuleCall_0; }
	}
	public class NodeExclusion1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion1");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefModelCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefModelIDTerminalRuleCall_0_1 = (RuleCall)cRefModelCrossReference_0.eContents().get(1);
		
		//NodeExclusion1 returns NodeExclusion: ref=[Model|ID];
		@Override public ParserRule getRule() { return rule; }
		
		//ref=[Model|ID]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Model|ID]
		public CrossReference getRefModelCrossReference_0() { return cRefModelCrossReference_0; }
		
		//ID
		public RuleCall getRefModelIDTerminalRuleCall_0_1() { return cRefModelIDTerminalRuleCall_0_1; }
	}
	public class NodeExclusion2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion2");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefModelCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefModelSTRINGTerminalRuleCall_0_1 = (RuleCall)cRefModelCrossReference_0.eContents().get(1);
		
		//NodeExclusion2 returns NodeExclusion: ref=[Model|STRING];
		@Override public ParserRule getRule() { return rule; }
		
		//ref=[Model|STRING]
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Model|STRING]
		public CrossReference getRefModelCrossReference_0() { return cRefModelCrossReference_0; }
		
		//STRING
		public RuleCall getRefModelSTRINGTerminalRuleCall_0_1() { return cRefModelSTRINGTerminalRuleCall_0_1; }
	}
	public class NodeExclusion1ListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion1List");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefModelCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefModelIDTerminalRuleCall_0_1 = (RuleCall)cRefModelCrossReference_0.eContents().get(1);
		
		//NodeExclusion1List returns NodeExclusionList: ref+=[Model|ID]+;
		@Override public ParserRule getRule() { return rule; }
		
		//ref+=[Model|ID]+
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Model|ID]
		public CrossReference getRefModelCrossReference_0() { return cRefModelCrossReference_0; }
		
		//ID
		public RuleCall getRefModelIDTerminalRuleCall_0_1() { return cRefModelIDTerminalRuleCall_0_1; }
	}
	public class NodeExclusion2ListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion2List");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cRefModelCrossReference_0 = (CrossReference)cRefAssignment.eContents().get(0);
		private final RuleCall cRefModelSTRINGTerminalRuleCall_0_1 = (RuleCall)cRefModelCrossReference_0.eContents().get(1);
		
		//NodeExclusion2List returns NodeExclusionList: ref+=[Model|STRING]+;
		@Override public ParserRule getRule() { return rule; }
		
		//ref+=[Model|STRING]+
		public Assignment getRefAssignment() { return cRefAssignment; }
		
		//[Model|STRING]
		public CrossReference getRefModelCrossReference_0() { return cRefModelCrossReference_0; }
		
		//STRING
		public RuleCall getRefModelSTRINGTerminalRuleCall_0_1() { return cRefModelSTRINGTerminalRuleCall_0_1; }
	}
	
	public class ValueExclusionTestEn0Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTestEn0");
		private final EnumLiteralDeclaration cLit0EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cLit0Lit0Keyword_0 = (Keyword)cLit0EnumLiteralDeclaration.eContents().get(0);
		
		//enum ValueExclusionTestEn0 returns ValueExclusionTestEn: lit0;
		public EnumRule getRule() { return rule; }
		
		//lit0
		public EnumLiteralDeclaration getLit0EnumLiteralDeclaration() { return cLit0EnumLiteralDeclaration; }
		
		public Keyword getLit0Lit0Keyword_0() { return cLit0Lit0Keyword_0; }
	}
	public class ValueExclusionTestEn1Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTestEn1");
		private final EnumLiteralDeclaration cLit1EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cLit1Lit1Keyword_0 = (Keyword)cLit1EnumLiteralDeclaration.eContents().get(0);
		
		//enum ValueExclusionTestEn1 returns ValueExclusionTestEn: lit1;
		public EnumRule getRule() { return rule; }
		
		//lit1
		public EnumLiteralDeclaration getLit1EnumLiteralDeclaration() { return cLit1EnumLiteralDeclaration; }
		
		public Keyword getLit1Lit1Keyword_0() { return cLit1Lit1Keyword_0; }
	}
	public class ValueExclusionTestEn2Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTestEn2");
		private final EnumLiteralDeclaration cLit2EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cLit2Lit2Keyword_0 = (Keyword)cLit2EnumLiteralDeclaration.eContents().get(0);
		
		//enum ValueExclusionTestEn2 returns ValueExclusionTestEn: lit2;
		public EnumRule getRule() { return rule; }
		
		//lit2
		public EnumLiteralDeclaration getLit2EnumLiteralDeclaration() { return cLit2EnumLiteralDeclaration; }
		
		public Keyword getLit2Lit2Keyword_0() { return cLit2Lit2Keyword_0; }
	}
	
	private final ModelElements pModel;
	private final Model2Elements pModel2;
	private final AttributeExclusionTest1Elements pAttributeExclusionTest1;
	private final AttributeExclusionTest2Elements pAttributeExclusionTest2;
	private final NestedTypeTest1Elements pNestedTypeTest1;
	private final NestedTypeTest2Elements pNestedTypeTest2;
	private final NestedTypeChildElements pNestedTypeChild;
	private final NestedTypeChild1Elements pNestedTypeChild1;
	private final NestedTypeChild2Elements pNestedTypeChild2;
	private final NestedTypeRecursiveTest1Elements pNestedTypeRecursiveTest1;
	private final NestedTypeRecursiveTest2Elements pNestedTypeRecursiveTest2;
	private final ParentRefTest1Elements pParentRefTest1;
	private final ParentRefTest2Elements pParentRefTest2;
	private final ParentRefTestChild1Elements pParentRefTestChild1;
	private final ParentRefTestChild2Elements pParentRefTestChild2;
	private final QuantityExclusionTest1Elements pQuantityExclusionTest1;
	private final QuantityExclusionTest2Elements pQuantityExclusionTest2;
	private final ValueExclusionTest1Elements pValueExclusionTest1;
	private final ValueExclusionTest2Elements pValueExclusionTest2;
	private final ValueExclusionTestEn0Elements eValueExclusionTestEn0;
	private final ValueExclusionTestEn1Elements eValueExclusionTestEn1;
	private final ValueExclusionTestEn2Elements eValueExclusionTestEn2;
	private final NodeExclusion1Elements pNodeExclusion1;
	private final NodeExclusion2Elements pNodeExclusion2;
	private final NodeExclusion1ListElements pNodeExclusion1List;
	private final NodeExclusion2ListElements pNodeExclusion2List;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ContextFinderTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pModel2 = new Model2Elements();
		this.pAttributeExclusionTest1 = new AttributeExclusionTest1Elements();
		this.pAttributeExclusionTest2 = new AttributeExclusionTest2Elements();
		this.pNestedTypeTest1 = new NestedTypeTest1Elements();
		this.pNestedTypeTest2 = new NestedTypeTest2Elements();
		this.pNestedTypeChild = new NestedTypeChildElements();
		this.pNestedTypeChild1 = new NestedTypeChild1Elements();
		this.pNestedTypeChild2 = new NestedTypeChild2Elements();
		this.pNestedTypeRecursiveTest1 = new NestedTypeRecursiveTest1Elements();
		this.pNestedTypeRecursiveTest2 = new NestedTypeRecursiveTest2Elements();
		this.pParentRefTest1 = new ParentRefTest1Elements();
		this.pParentRefTest2 = new ParentRefTest2Elements();
		this.pParentRefTestChild1 = new ParentRefTestChild1Elements();
		this.pParentRefTestChild2 = new ParentRefTestChild2Elements();
		this.pQuantityExclusionTest1 = new QuantityExclusionTest1Elements();
		this.pQuantityExclusionTest2 = new QuantityExclusionTest2Elements();
		this.pValueExclusionTest1 = new ValueExclusionTest1Elements();
		this.pValueExclusionTest2 = new ValueExclusionTest2Elements();
		this.eValueExclusionTestEn0 = new ValueExclusionTestEn0Elements();
		this.eValueExclusionTestEn1 = new ValueExclusionTestEn1Elements();
		this.eValueExclusionTestEn2 = new ValueExclusionTestEn2Elements();
		this.pNodeExclusion1 = new NodeExclusion1Elements();
		this.pNodeExclusion2 = new NodeExclusion2Elements();
		this.pNodeExclusion1List = new NodeExclusion1ListElements();
		this.pNodeExclusion2List = new NodeExclusion2ListElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.serializer.ContextFinderTestLanguage".equals(grammar.getName())) {
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
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    ("#0" model=Model2) |
	//    ("#1" attributeExclusion=(AttributeExclusionTest1|AttributeExclusionTest2)) |
	//    ("#2" nestedType=(NestedTypeTest1|NestedTypeTest2)) |
	//    ("#3" nestedTypeRecursiveTest2=(NestedTypeRecursiveTest1|NestedTypeRecursiveTest2)) |
	//    ("#4" parentRef=(ParentRefTest1|ParentRefTest2)) |
	//    ("#5" quantityExclusion=(QuantityExclusionTest1|QuantityExclusionTest2)) |
	//    ("#6" valueExclusion=(ValueExclusionTest1|ValueExclusionTest2)) |
	//    ("#7" name=STRING nodeExclusion=(NodeExclusion1|NodeExclusion2)) |
	//    ("#8" name=STRING nodeExclusionList=(NodeExclusion1List|NodeExclusion2List))
	//    ;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Model2 returns Model: {Model} "model";
	public Model2Elements getModel2Access() {
		return pModel2;
	}
	
	public ParserRule getModel2Rule() {
		return getModel2Access().getRule();
	}
	
	//AttributeExclusionTest1 returns AttributeExclusionTest: "kw1" attr1=ID;
	public AttributeExclusionTest1Elements getAttributeExclusionTest1Access() {
		return pAttributeExclusionTest1;
	}
	
	public ParserRule getAttributeExclusionTest1Rule() {
		return getAttributeExclusionTest1Access().getRule();
	}
	
	//AttributeExclusionTest2 returns AttributeExclusionTest: "kw2" attr2=ID;
	public AttributeExclusionTest2Elements getAttributeExclusionTest2Access() {
		return pAttributeExclusionTest2;
	}
	
	public ParserRule getAttributeExclusionTest2Rule() {
		return getAttributeExclusionTest2Access().getRule();
	}
	
	//NestedTypeTest1 returns NestedTypeTest:	nested=NestedTypeChild1;
	public NestedTypeTest1Elements getNestedTypeTest1Access() {
		return pNestedTypeTest1;
	}
	
	public ParserRule getNestedTypeTest1Rule() {
		return getNestedTypeTest1Access().getRule();
	}
	
	//NestedTypeTest2 returns NestedTypeTest:	nested=NestedTypeChild2;
	public NestedTypeTest2Elements getNestedTypeTest2Access() {
		return pNestedTypeTest2;
	}
	
	public ParserRule getNestedTypeTest2Rule() {
		return getNestedTypeTest2Access().getRule();
	}
	
	//NestedTypeChild: NestedTypeChild1| NestedTypeChild2;
	public NestedTypeChildElements getNestedTypeChildAccess() {
		return pNestedTypeChild;
	}
	
	public ParserRule getNestedTypeChildRule() {
		return getNestedTypeChildAccess().getRule();
	}
	
	//NestedTypeChild1: "kw1" val=ID;
	public NestedTypeChild1Elements getNestedTypeChild1Access() {
		return pNestedTypeChild1;
	}
	
	public ParserRule getNestedTypeChild1Rule() {
		return getNestedTypeChild1Access().getRule();
	}
	
	//NestedTypeChild2: "kw2" val=ID;
	public NestedTypeChild2Elements getNestedTypeChild2Access() {
		return pNestedTypeChild2;
	}
	
	public ParserRule getNestedTypeChild2Rule() {
		return getNestedTypeChild2Access().getRule();
	}
	
	//NestedTypeRecursiveTest1 returns NestedTypeRecursiveTest: {NestedTypeRecursiveTest1} "kw1" ({NestedTypeRecursiveTest.left=current} ".")+;
	public NestedTypeRecursiveTest1Elements getNestedTypeRecursiveTest1Access() {
		return pNestedTypeRecursiveTest1;
	}
	
	public ParserRule getNestedTypeRecursiveTest1Rule() {
		return getNestedTypeRecursiveTest1Access().getRule();
	}
	
	//NestedTypeRecursiveTest2 returns NestedTypeRecursiveTest: {NestedTypeRecursiveTest2} "kw2" ({NestedTypeRecursiveTest.left=current} ".")+;
	public NestedTypeRecursiveTest2Elements getNestedTypeRecursiveTest2Access() {
		return pNestedTypeRecursiveTest2;
	}
	
	public ParserRule getNestedTypeRecursiveTest2Rule() {
		return getNestedTypeRecursiveTest2Access().getRule();
	}
	
	//ParentRefTest1: "kw1" child1=ParentRefTestChild1;
	public ParentRefTest1Elements getParentRefTest1Access() {
		return pParentRefTest1;
	}
	
	public ParserRule getParentRefTest1Rule() {
		return getParentRefTest1Access().getRule();
	}
	
	//ParentRefTest2: "kw2" child2=ParentRefTestChild2;
	public ParentRefTest2Elements getParentRefTest2Access() {
		return pParentRefTest2;
	}
	
	public ParserRule getParentRefTest2Rule() {
		return getParentRefTest2Access().getRule();
	}
	
	//ParentRefTestChild1 returns ParentRefTestChild: {ParentRefTestChild} "foo" child=ParentRefTestChild1?;
	public ParentRefTestChild1Elements getParentRefTestChild1Access() {
		return pParentRefTestChild1;
	}
	
	public ParserRule getParentRefTestChild1Rule() {
		return getParentRefTestChild1Access().getRule();
	}
	
	//ParentRefTestChild2 returns ParentRefTestChild: {ParentRefTestChild} "foo" child=ParentRefTestChild2?;
	public ParentRefTestChild2Elements getParentRefTestChild2Access() {
		return pParentRefTestChild2;
	}
	
	public ParserRule getParentRefTestChild2Rule() {
		return getParentRefTestChild2Access().getRule();
	}
	
	//QuantityExclusionTest1 returns QuantityExclusionTest: "kw1" attr1=ID attr2=ID?;
	public QuantityExclusionTest1Elements getQuantityExclusionTest1Access() {
		return pQuantityExclusionTest1;
	}
	
	public ParserRule getQuantityExclusionTest1Rule() {
		return getQuantityExclusionTest1Access().getRule();
	}
	
	//QuantityExclusionTest2 returns QuantityExclusionTest: "kw2" attr1=ID? attr2=ID;
	public QuantityExclusionTest2Elements getQuantityExclusionTest2Access() {
		return pQuantityExclusionTest2;
	}
	
	public ParserRule getQuantityExclusionTest2Rule() {
		return getQuantityExclusionTest2Access().getRule();
	}
	
	//ValueExclusionTest1 returns ValueExclusionTest: val=ValueExclusionTestEn1;
	public ValueExclusionTest1Elements getValueExclusionTest1Access() {
		return pValueExclusionTest1;
	}
	
	public ParserRule getValueExclusionTest1Rule() {
		return getValueExclusionTest1Access().getRule();
	}
	
	//ValueExclusionTest2 returns ValueExclusionTest: val=ValueExclusionTestEn2;
	public ValueExclusionTest2Elements getValueExclusionTest2Access() {
		return pValueExclusionTest2;
	}
	
	public ParserRule getValueExclusionTest2Rule() {
		return getValueExclusionTest2Access().getRule();
	}
	
	//enum ValueExclusionTestEn0 returns ValueExclusionTestEn: lit0;
	public ValueExclusionTestEn0Elements getValueExclusionTestEn0Access() {
		return eValueExclusionTestEn0;
	}
	
	public EnumRule getValueExclusionTestEn0Rule() {
		return getValueExclusionTestEn0Access().getRule();
	}
	
	//enum ValueExclusionTestEn1 returns ValueExclusionTestEn: lit1;
	public ValueExclusionTestEn1Elements getValueExclusionTestEn1Access() {
		return eValueExclusionTestEn1;
	}
	
	public EnumRule getValueExclusionTestEn1Rule() {
		return getValueExclusionTestEn1Access().getRule();
	}
	
	//enum ValueExclusionTestEn2 returns ValueExclusionTestEn: lit2;
	public ValueExclusionTestEn2Elements getValueExclusionTestEn2Access() {
		return eValueExclusionTestEn2;
	}
	
	public EnumRule getValueExclusionTestEn2Rule() {
		return getValueExclusionTestEn2Access().getRule();
	}
	
	//NodeExclusion1 returns NodeExclusion: ref=[Model|ID];
	public NodeExclusion1Elements getNodeExclusion1Access() {
		return pNodeExclusion1;
	}
	
	public ParserRule getNodeExclusion1Rule() {
		return getNodeExclusion1Access().getRule();
	}
	
	//NodeExclusion2 returns NodeExclusion: ref=[Model|STRING];
	public NodeExclusion2Elements getNodeExclusion2Access() {
		return pNodeExclusion2;
	}
	
	public ParserRule getNodeExclusion2Rule() {
		return getNodeExclusion2Access().getRule();
	}
	
	//NodeExclusion1List returns NodeExclusionList: ref+=[Model|ID]+;
	public NodeExclusion1ListElements getNodeExclusion1ListAccess() {
		return pNodeExclusion1List;
	}
	
	public ParserRule getNodeExclusion1ListRule() {
		return getNodeExclusion1ListAccess().getRule();
	}
	
	//NodeExclusion2List returns NodeExclusionList: ref+=[Model|STRING]+;
	public NodeExclusion2ListElements getNodeExclusion2ListAccess() {
		return pNodeExclusion2List;
	}
	
	public ParserRule getNodeExclusion2ListRule() {
		return getNodeExclusion2ListAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
