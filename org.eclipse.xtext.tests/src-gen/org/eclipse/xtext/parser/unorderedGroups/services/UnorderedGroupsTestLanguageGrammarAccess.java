/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.unorderedGroups.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class UnorderedGroupsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cDigitOneKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_0_1 = (UnorderedGroup)cGroup_1_0.eContents().get(1);
		private final Assignment cFirstAssignment_1_0_1_0 = (Assignment)cUnorderedGroup_1_0_1.eContents().get(0);
		private final Keyword cFirstAKeyword_1_0_1_0_0 = (Keyword)cFirstAssignment_1_0_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_0_1_1 = (Assignment)cUnorderedGroup_1_0_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_0_1_1_0 = (Keyword)cSecondAssignment_1_0_1_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cDigitTwoKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_1_1 = (UnorderedGroup)cGroup_1_1.eContents().get(1);
		private final Assignment cFirstAssignment_1_1_1_0 = (Assignment)cUnorderedGroup_1_1_1.eContents().get(0);
		private final Keyword cFirstAKeyword_1_1_1_0_0 = (Keyword)cFirstAssignment_1_1_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_1_1_1 = (Assignment)cUnorderedGroup_1_1_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_1_1_1_0 = (Keyword)cSecondAssignment_1_1_1_1.eContents().get(0);
		private final Assignment cThirdAssignment_1_1_1_2 = (Assignment)cUnorderedGroup_1_1_1.eContents().get(2);
		private final Keyword cThirdCKeyword_1_1_1_2_0 = (Keyword)cThirdAssignment_1_1_1_2.eContents().get(0);
		private final Assignment cForthAssignment_1_1_1_3 = (Assignment)cUnorderedGroup_1_1_1.eContents().get(3);
		private final Keyword cForthDKeyword_1_1_1_3_0 = (Keyword)cForthAssignment_1_1_1_3.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cDigitThreeKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_2_1 = (UnorderedGroup)cGroup_1_2.eContents().get(1);
		private final Assignment cFirstAssignment_1_2_1_0 = (Assignment)cUnorderedGroup_1_2_1.eContents().get(0);
		private final Keyword cFirstAKeyword_1_2_1_0_0 = (Keyword)cFirstAssignment_1_2_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_2_1_1 = (Assignment)cUnorderedGroup_1_2_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_2_1_1_0 = (Keyword)cSecondAssignment_1_2_1_1.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cDigitFourKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_3_1 = (UnorderedGroup)cGroup_1_3.eContents().get(1);
		private final Assignment cFirstAssignment_1_3_1_0 = (Assignment)cUnorderedGroup_1_3_1.eContents().get(0);
		private final Keyword cFirstAKeyword_1_3_1_0_0 = (Keyword)cFirstAssignment_1_3_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_3_1_1 = (Assignment)cUnorderedGroup_1_3_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_3_1_1_0 = (Keyword)cSecondAssignment_1_3_1_1.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final Keyword cDigitFiveKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_4_1 = (UnorderedGroup)cGroup_1_4.eContents().get(1);
		private final Assignment cFirstAssignment_1_4_1_0 = (Assignment)cUnorderedGroup_1_4_1.eContents().get(0);
		private final Keyword cFirstAKeyword_1_4_1_0_0 = (Keyword)cFirstAssignment_1_4_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_4_1_1 = (Assignment)cUnorderedGroup_1_4_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_4_1_1_0 = (Keyword)cSecondAssignment_1_4_1_1.eContents().get(0);
		private final Group cGroup_1_5 = (Group)cAlternatives_1.eContents().get(5);
		private final Keyword cDigitSixKeyword_1_5_0 = (Keyword)cGroup_1_5.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_5_1 = (UnorderedGroup)cGroup_1_5.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_5_1_0 = (Assignment)cUnorderedGroup_1_5_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_5_1_0_0 = (Keyword)cFirstAsListAssignment_1_5_1_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_5_1_1 = (Assignment)cUnorderedGroup_1_5_1.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_5_1_1_0 = (Keyword)cSecondAsListAssignment_1_5_1_1.eContents().get(0);
		private final Group cGroup_1_6 = (Group)cAlternatives_1.eContents().get(6);
		private final Keyword cDigitSevenKeyword_1_6_0 = (Keyword)cGroup_1_6.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_6_1 = (UnorderedGroup)cGroup_1_6.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_6_1_0 = (Assignment)cUnorderedGroup_1_6_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_6_1_0_0 = (Keyword)cFirstAsListAssignment_1_6_1_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_6_1_1 = (Assignment)cUnorderedGroup_1_6_1.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_6_1_1_0 = (Keyword)cSecondAsListAssignment_1_6_1_1.eContents().get(0);
		private final Group cGroup_1_7 = (Group)cAlternatives_1.eContents().get(7);
		private final Keyword cDigitEightKeyword_1_7_0 = (Keyword)cGroup_1_7.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_7_1 = (UnorderedGroup)cGroup_1_7.eContents().get(1);
		private final Group cGroup_1_7_1_0 = (Group)cUnorderedGroup_1_7_1.eContents().get(0);
		private final Keyword cAKeyword_1_7_1_0_0 = (Keyword)cGroup_1_7_1_0.eContents().get(0);
		private final Keyword cBKeyword_1_7_1_0_1 = (Keyword)cGroup_1_7_1_0.eContents().get(1);
		private final Assignment cFirstAssignment_1_7_1_0_2 = (Assignment)cGroup_1_7_1_0.eContents().get(2);
		private final Keyword cFirstCKeyword_1_7_1_0_2_0 = (Keyword)cFirstAssignment_1_7_1_0_2.eContents().get(0);
		private final Group cGroup_1_7_1_1 = (Group)cUnorderedGroup_1_7_1.eContents().get(1);
		private final Keyword cAKeyword_1_7_1_1_0 = (Keyword)cGroup_1_7_1_1.eContents().get(0);
		private final Keyword cBKeyword_1_7_1_1_1 = (Keyword)cGroup_1_7_1_1.eContents().get(1);
		private final Assignment cSecondAssignment_1_7_1_1_2 = (Assignment)cGroup_1_7_1_1.eContents().get(2);
		private final Keyword cSecondDKeyword_1_7_1_1_2_0 = (Keyword)cSecondAssignment_1_7_1_1_2.eContents().get(0);
		private final Group cGroup_1_8 = (Group)cAlternatives_1.eContents().get(8);
		private final Keyword cDigitNineKeyword_1_8_0 = (Keyword)cGroup_1_8.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_8_1 = (UnorderedGroup)cGroup_1_8.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_8_1_0 = (Assignment)cUnorderedGroup_1_8_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_8_1_0_0 = (Keyword)cFirstAsListAssignment_1_8_1_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_8_1_1 = (Assignment)cUnorderedGroup_1_8_1.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_8_1_1_0 = (Keyword)cSecondAsListAssignment_1_8_1_1.eContents().get(0);
		private final Group cGroup_1_9 = (Group)cAlternatives_1.eContents().get(9);
		private final Keyword cDigitOneDigitZeroKeyword_1_9_0 = (Keyword)cGroup_1_9.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_9_1 = (UnorderedGroup)cGroup_1_9.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_9_1_0 = (Assignment)cUnorderedGroup_1_9_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_9_1_0_0 = (Keyword)cFirstAsListAssignment_1_9_1_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_9_1_1 = (Assignment)cUnorderedGroup_1_9_1.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_9_1_1_0 = (Keyword)cSecondAsListAssignment_1_9_1_1.eContents().get(0);
		private final Group cGroup_1_10 = (Group)cAlternatives_1.eContents().get(10);
		private final Keyword cDigitOneDigitOneKeyword_1_10_0 = (Keyword)cGroup_1_10.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_10_1 = (UnorderedGroup)cGroup_1_10.eContents().get(1);
		private final Assignment cFirstAssignment_1_10_1_0 = (Assignment)cUnorderedGroup_1_10_1.eContents().get(0);
		private final Keyword cFirstAKeyword_1_10_1_0_0 = (Keyword)cFirstAssignment_1_10_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_10_1_1 = (Assignment)cUnorderedGroup_1_10_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_10_1_1_0 = (Keyword)cSecondAssignment_1_10_1_1.eContents().get(0);
		private final Group cGroup_1_11 = (Group)cAlternatives_1.eContents().get(11);
		private final Keyword cDigitOneDigitTwoKeyword_1_11_0 = (Keyword)cGroup_1_11.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_11_1 = (UnorderedGroup)cGroup_1_11.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_11_1_0 = (Assignment)cUnorderedGroup_1_11_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_11_1_0_0 = (Keyword)cFirstAsListAssignment_1_11_1_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_11_1_1 = (Assignment)cUnorderedGroup_1_11_1.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_11_1_1_0 = (Keyword)cSecondAsListAssignment_1_11_1_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_11_2 = (UnorderedGroup)cGroup_1_11.eContents().get(2);
		private final Assignment cFirstAsListAssignment_1_11_2_0 = (Assignment)cUnorderedGroup_1_11_2.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_11_2_0_0 = (Keyword)cFirstAsListAssignment_1_11_2_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_11_2_1 = (Assignment)cUnorderedGroup_1_11_2.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_11_2_1_0 = (Keyword)cSecondAsListAssignment_1_11_2_1.eContents().get(0);
		private final Group cGroup_1_12 = (Group)cAlternatives_1.eContents().get(12);
		private final Keyword cDigitOneDigitThreeKeyword_1_12_0 = (Keyword)cGroup_1_12.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_12_1 = (UnorderedGroup)cGroup_1_12.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_12_1_0 = (Assignment)cUnorderedGroup_1_12_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_12_1_0_0 = (Keyword)cFirstAsListAssignment_1_12_1_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_12_1_1 = (Assignment)cUnorderedGroup_1_12_1.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_12_1_1_0 = (Keyword)cSecondAsListAssignment_1_12_1_1.eContents().get(0);
		private final Assignment cFirstAsListAssignment_1_12_2 = (Assignment)cGroup_1_12.eContents().get(2);
		private final Keyword cFirstAsListAKeyword_1_12_2_0 = (Keyword)cFirstAsListAssignment_1_12_2.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_12_3 = (Assignment)cGroup_1_12.eContents().get(3);
		private final Keyword cSecondAsListBKeyword_1_12_3_0 = (Keyword)cSecondAsListAssignment_1_12_3.eContents().get(0);
		private final Group cGroup_1_13 = (Group)cAlternatives_1.eContents().get(13);
		private final Keyword cDigitOneDigitFourKeyword_1_13_0 = (Keyword)cGroup_1_13.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_13_1 = (UnorderedGroup)cGroup_1_13.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_1_13_1_0 = (UnorderedGroup)cUnorderedGroup_1_13_1.eContents().get(0);
		private final Assignment cFirstAsListAssignment_1_13_1_0_0 = (Assignment)cUnorderedGroup_1_13_1_0.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_13_1_0_0_0 = (Keyword)cFirstAsListAssignment_1_13_1_0_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_13_1_0_1 = (Assignment)cUnorderedGroup_1_13_1_0.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_13_1_0_1_0 = (Keyword)cSecondAsListAssignment_1_13_1_0_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_13_1_1 = (UnorderedGroup)cUnorderedGroup_1_13_1.eContents().get(1);
		private final Assignment cThirdAsListAssignment_1_13_1_1_0 = (Assignment)cUnorderedGroup_1_13_1_1.eContents().get(0);
		private final Keyword cThirdAsListCKeyword_1_13_1_1_0_0 = (Keyword)cThirdAsListAssignment_1_13_1_1_0.eContents().get(0);
		private final Assignment cForthAsListAssignment_1_13_1_1_1 = (Assignment)cUnorderedGroup_1_13_1_1.eContents().get(1);
		private final Keyword cForthAsListDKeyword_1_13_1_1_1_0 = (Keyword)cForthAsListAssignment_1_13_1_1_1.eContents().get(0);
		private final Group cGroup_1_14 = (Group)cAlternatives_1.eContents().get(14);
		private final Keyword cDatatypesKeyword_1_14_0 = (Keyword)cGroup_1_14.eContents().get(0);
		private final Assignment cValueAssignment_1_14_1 = (Assignment)cGroup_1_14.eContents().get(1);
		private final RuleCall cValueUnorderedDatatypeParserRuleCall_1_14_1_0 = (RuleCall)cValueAssignment_1_14_1.eContents().get(0);
		private final Group cGroup_1_15 = (Group)cAlternatives_1.eContents().get(15);
		private final Keyword cSerializationKeyword_1_15_0 = (Keyword)cGroup_1_15.eContents().get(0);
		private final Assignment cSerializedAssignment_1_15_1 = (Assignment)cGroup_1_15.eContents().get(1);
		private final RuleCall cSerializedUnorderedSerializationParserRuleCall_1_15_1_0 = (RuleCall)cSerializedAssignment_1_15_1.eContents().get(0);
		private final Group cGroup_1_16 = (Group)cAlternatives_1.eContents().get(16);
		private final Keyword cBug302585Keyword_1_16_0 = (Keyword)cGroup_1_16.eContents().get(0);
		private final Assignment cNestedModelAssignment_1_16_1 = (Assignment)cGroup_1_16.eContents().get(1);
		private final RuleCall cNestedModelNestedModelParserRuleCall_1_16_1_0 = (RuleCall)cNestedModelAssignment_1_16_1.eContents().get(0);
		
		//Model: {Model} (
		//    '1' (first?='a'  & second?='b'  )
		//  | '2' (first?='a'  & second?='b' & third?='c' & forth?='d')
		//  | '3' (first?='a'? & second?='b'? )
		//  | '4' (first?='a'  & second?='b'? )
		//  | '5' (first?='a'? & second?='b'  )
		//  | '6' (firstAsList+='a'+ & secondAsList+='b'* )
		//  | '7' (firstAsList+='a'* & secondAsList+='b'+ )
		//  | '8' ('a' 'b' first?='c' & 'a' 'b' second?='d' )
		//  | '9' (firstAsList+='a' & secondAsList+='b' )+
		//  | '10' (firstAsList+='a' & secondAsList+='b' )*
		//  | '11' (first?='a' & second?='b' )?
		//  | '12' (firstAsList+='a' & secondAsList+='b' ) (firstAsList+='a' & secondAsList+='b' )
		//  | '13' (firstAsList+='a' & secondAsList+='b' )? firstAsList+='a' secondAsList+='b'
		//  | '14' ((firstAsList+='a' & secondAsList+='b') & (thirdAsList+='c' & forthAsList+='d'))+
		//  | 'datatypes' value=UnorderedDatatype
		//  | 'serialization' serialized=UnorderedSerialization
		//  | 'bug302585' nestedModel+=NestedModel*
		//  )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Model} (
		//   '1' (first?='a'  & second?='b'  )
		// | '2' (first?='a'  & second?='b' & third?='c' & forth?='d')
		// | '3' (first?='a'? & second?='b'? )
		// | '4' (first?='a'  & second?='b'? )
		// | '5' (first?='a'? & second?='b'  )
		// | '6' (firstAsList+='a'+ & secondAsList+='b'* )
		// | '7' (firstAsList+='a'* & secondAsList+='b'+ )
		// | '8' ('a' 'b' first?='c' & 'a' 'b' second?='d' )
		// | '9' (firstAsList+='a' & secondAsList+='b' )+
		// | '10' (firstAsList+='a' & secondAsList+='b' )*
		// | '11' (first?='a' & second?='b' )?
		// | '12' (firstAsList+='a' & secondAsList+='b' ) (firstAsList+='a' & secondAsList+='b' )
		// | '13' (firstAsList+='a' & secondAsList+='b' )? firstAsList+='a' secondAsList+='b'
		// | '14' ((firstAsList+='a' & secondAsList+='b') & (thirdAsList+='c' & forthAsList+='d'))+
		// | 'datatypes' value=UnorderedDatatype
		// | 'serialization' serialized=UnorderedSerialization
		// | 'bug302585' nestedModel+=NestedModel*
		// )
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//(
		//   '1' (first?='a'  & second?='b'  )
		// | '2' (first?='a'  & second?='b' & third?='c' & forth?='d')
		// | '3' (first?='a'? & second?='b'? )
		// | '4' (first?='a'  & second?='b'? )
		// | '5' (first?='a'? & second?='b'  )
		// | '6' (firstAsList+='a'+ & secondAsList+='b'* )
		// | '7' (firstAsList+='a'* & secondAsList+='b'+ )
		// | '8' ('a' 'b' first?='c' & 'a' 'b' second?='d' )
		// | '9' (firstAsList+='a' & secondAsList+='b' )+
		// | '10' (firstAsList+='a' & secondAsList+='b' )*
		// | '11' (first?='a' & second?='b' )?
		// | '12' (firstAsList+='a' & secondAsList+='b' ) (firstAsList+='a' & secondAsList+='b' )
		// | '13' (firstAsList+='a' & secondAsList+='b' )? firstAsList+='a' secondAsList+='b'
		// | '14' ((firstAsList+='a' & secondAsList+='b') & (thirdAsList+='c' & forthAsList+='d'))+
		// | 'datatypes' value=UnorderedDatatype
		// | 'serialization' serialized=UnorderedSerialization
		// | 'bug302585' nestedModel+=NestedModel*
		// )
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'1' (first?='a'  & second?='b'  )
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_1_0_0() { return cDigitOneKeyword_1_0_0; }
		
		//(first?='a'  & second?='b'  )
		public UnorderedGroup getUnorderedGroup_1_0_1() { return cUnorderedGroup_1_0_1; }
		
		//first?='a'
		public Assignment getFirstAssignment_1_0_1_0() { return cFirstAssignment_1_0_1_0; }
		
		//'a'
		public Keyword getFirstAKeyword_1_0_1_0_0() { return cFirstAKeyword_1_0_1_0_0; }
		
		//second?='b'
		public Assignment getSecondAssignment_1_0_1_1() { return cSecondAssignment_1_0_1_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_0_1_1_0() { return cSecondBKeyword_1_0_1_1_0; }
		
		//'2' (first?='a'  & second?='b' & third?='c' & forth?='d')
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'2'
		public Keyword getDigitTwoKeyword_1_1_0() { return cDigitTwoKeyword_1_1_0; }
		
		//(first?='a'  & second?='b' & third?='c' & forth?='d')
		public UnorderedGroup getUnorderedGroup_1_1_1() { return cUnorderedGroup_1_1_1; }
		
		//first?='a'
		public Assignment getFirstAssignment_1_1_1_0() { return cFirstAssignment_1_1_1_0; }
		
		//'a'
		public Keyword getFirstAKeyword_1_1_1_0_0() { return cFirstAKeyword_1_1_1_0_0; }
		
		//second?='b'
		public Assignment getSecondAssignment_1_1_1_1() { return cSecondAssignment_1_1_1_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_1_1_1_0() { return cSecondBKeyword_1_1_1_1_0; }
		
		//third?='c'
		public Assignment getThirdAssignment_1_1_1_2() { return cThirdAssignment_1_1_1_2; }
		
		//'c'
		public Keyword getThirdCKeyword_1_1_1_2_0() { return cThirdCKeyword_1_1_1_2_0; }
		
		//forth?='d'
		public Assignment getForthAssignment_1_1_1_3() { return cForthAssignment_1_1_1_3; }
		
		//'d'
		public Keyword getForthDKeyword_1_1_1_3_0() { return cForthDKeyword_1_1_1_3_0; }
		
		//'3' (first?='a'? & second?='b'? )
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'3'
		public Keyword getDigitThreeKeyword_1_2_0() { return cDigitThreeKeyword_1_2_0; }
		
		//(first?='a'? & second?='b'? )
		public UnorderedGroup getUnorderedGroup_1_2_1() { return cUnorderedGroup_1_2_1; }
		
		//first?='a'?
		public Assignment getFirstAssignment_1_2_1_0() { return cFirstAssignment_1_2_1_0; }
		
		//'a'
		public Keyword getFirstAKeyword_1_2_1_0_0() { return cFirstAKeyword_1_2_1_0_0; }
		
		//second?='b'?
		public Assignment getSecondAssignment_1_2_1_1() { return cSecondAssignment_1_2_1_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_2_1_1_0() { return cSecondBKeyword_1_2_1_1_0; }
		
		//'4' (first?='a'  & second?='b'? )
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//'4'
		public Keyword getDigitFourKeyword_1_3_0() { return cDigitFourKeyword_1_3_0; }
		
		//(first?='a'  & second?='b'? )
		public UnorderedGroup getUnorderedGroup_1_3_1() { return cUnorderedGroup_1_3_1; }
		
		//first?='a'
		public Assignment getFirstAssignment_1_3_1_0() { return cFirstAssignment_1_3_1_0; }
		
		//'a'
		public Keyword getFirstAKeyword_1_3_1_0_0() { return cFirstAKeyword_1_3_1_0_0; }
		
		//second?='b'?
		public Assignment getSecondAssignment_1_3_1_1() { return cSecondAssignment_1_3_1_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_3_1_1_0() { return cSecondBKeyword_1_3_1_1_0; }
		
		//'5' (first?='a'? & second?='b'  )
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'5'
		public Keyword getDigitFiveKeyword_1_4_0() { return cDigitFiveKeyword_1_4_0; }
		
		//(first?='a'? & second?='b'  )
		public UnorderedGroup getUnorderedGroup_1_4_1() { return cUnorderedGroup_1_4_1; }
		
		//first?='a'?
		public Assignment getFirstAssignment_1_4_1_0() { return cFirstAssignment_1_4_1_0; }
		
		//'a'
		public Keyword getFirstAKeyword_1_4_1_0_0() { return cFirstAKeyword_1_4_1_0_0; }
		
		//second?='b'
		public Assignment getSecondAssignment_1_4_1_1() { return cSecondAssignment_1_4_1_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_4_1_1_0() { return cSecondBKeyword_1_4_1_1_0; }
		
		//'6' (firstAsList+='a'+ & secondAsList+='b'* )
		public Group getGroup_1_5() { return cGroup_1_5; }
		
		//'6'
		public Keyword getDigitSixKeyword_1_5_0() { return cDigitSixKeyword_1_5_0; }
		
		//(firstAsList+='a'+ & secondAsList+='b'* )
		public UnorderedGroup getUnorderedGroup_1_5_1() { return cUnorderedGroup_1_5_1; }
		
		//firstAsList+='a'+
		public Assignment getFirstAsListAssignment_1_5_1_0() { return cFirstAsListAssignment_1_5_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_5_1_0_0() { return cFirstAsListAKeyword_1_5_1_0_0; }
		
		//secondAsList+='b'*
		public Assignment getSecondAsListAssignment_1_5_1_1() { return cSecondAsListAssignment_1_5_1_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_5_1_1_0() { return cSecondAsListBKeyword_1_5_1_1_0; }
		
		//'7' (firstAsList+='a'* & secondAsList+='b'+ )
		public Group getGroup_1_6() { return cGroup_1_6; }
		
		//'7'
		public Keyword getDigitSevenKeyword_1_6_0() { return cDigitSevenKeyword_1_6_0; }
		
		//(firstAsList+='a'* & secondAsList+='b'+ )
		public UnorderedGroup getUnorderedGroup_1_6_1() { return cUnorderedGroup_1_6_1; }
		
		//firstAsList+='a'*
		public Assignment getFirstAsListAssignment_1_6_1_0() { return cFirstAsListAssignment_1_6_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_6_1_0_0() { return cFirstAsListAKeyword_1_6_1_0_0; }
		
		//secondAsList+='b'+
		public Assignment getSecondAsListAssignment_1_6_1_1() { return cSecondAsListAssignment_1_6_1_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_6_1_1_0() { return cSecondAsListBKeyword_1_6_1_1_0; }
		
		//'8' ('a' 'b' first?='c' & 'a' 'b' second?='d' )
		public Group getGroup_1_7() { return cGroup_1_7; }
		
		//'8'
		public Keyword getDigitEightKeyword_1_7_0() { return cDigitEightKeyword_1_7_0; }
		
		//('a' 'b' first?='c' & 'a' 'b' second?='d' )
		public UnorderedGroup getUnorderedGroup_1_7_1() { return cUnorderedGroup_1_7_1; }
		
		//'a' 'b' first?='c'
		public Group getGroup_1_7_1_0() { return cGroup_1_7_1_0; }
		
		//'a'
		public Keyword getAKeyword_1_7_1_0_0() { return cAKeyword_1_7_1_0_0; }
		
		//'b'
		public Keyword getBKeyword_1_7_1_0_1() { return cBKeyword_1_7_1_0_1; }
		
		//first?='c'
		public Assignment getFirstAssignment_1_7_1_0_2() { return cFirstAssignment_1_7_1_0_2; }
		
		//'c'
		public Keyword getFirstCKeyword_1_7_1_0_2_0() { return cFirstCKeyword_1_7_1_0_2_0; }
		
		//'a' 'b' second?='d'
		public Group getGroup_1_7_1_1() { return cGroup_1_7_1_1; }
		
		//'a'
		public Keyword getAKeyword_1_7_1_1_0() { return cAKeyword_1_7_1_1_0; }
		
		//'b'
		public Keyword getBKeyword_1_7_1_1_1() { return cBKeyword_1_7_1_1_1; }
		
		//second?='d'
		public Assignment getSecondAssignment_1_7_1_1_2() { return cSecondAssignment_1_7_1_1_2; }
		
		//'d'
		public Keyword getSecondDKeyword_1_7_1_1_2_0() { return cSecondDKeyword_1_7_1_1_2_0; }
		
		//'9' (firstAsList+='a' & secondAsList+='b' )+
		public Group getGroup_1_8() { return cGroup_1_8; }
		
		//'9'
		public Keyword getDigitNineKeyword_1_8_0() { return cDigitNineKeyword_1_8_0; }
		
		//(firstAsList+='a' & secondAsList+='b' )+
		public UnorderedGroup getUnorderedGroup_1_8_1() { return cUnorderedGroup_1_8_1; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_8_1_0() { return cFirstAsListAssignment_1_8_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_8_1_0_0() { return cFirstAsListAKeyword_1_8_1_0_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_8_1_1() { return cSecondAsListAssignment_1_8_1_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_8_1_1_0() { return cSecondAsListBKeyword_1_8_1_1_0; }
		
		//'10' (firstAsList+='a' & secondAsList+='b' )*
		public Group getGroup_1_9() { return cGroup_1_9; }
		
		//'10'
		public Keyword getDigitOneDigitZeroKeyword_1_9_0() { return cDigitOneDigitZeroKeyword_1_9_0; }
		
		//(firstAsList+='a' & secondAsList+='b' )*
		public UnorderedGroup getUnorderedGroup_1_9_1() { return cUnorderedGroup_1_9_1; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_9_1_0() { return cFirstAsListAssignment_1_9_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_9_1_0_0() { return cFirstAsListAKeyword_1_9_1_0_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_9_1_1() { return cSecondAsListAssignment_1_9_1_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_9_1_1_0() { return cSecondAsListBKeyword_1_9_1_1_0; }
		
		//'11' (first?='a' & second?='b' )?
		public Group getGroup_1_10() { return cGroup_1_10; }
		
		//'11'
		public Keyword getDigitOneDigitOneKeyword_1_10_0() { return cDigitOneDigitOneKeyword_1_10_0; }
		
		//(first?='a' & second?='b' )?
		public UnorderedGroup getUnorderedGroup_1_10_1() { return cUnorderedGroup_1_10_1; }
		
		//first?='a'
		public Assignment getFirstAssignment_1_10_1_0() { return cFirstAssignment_1_10_1_0; }
		
		//'a'
		public Keyword getFirstAKeyword_1_10_1_0_0() { return cFirstAKeyword_1_10_1_0_0; }
		
		//second?='b'
		public Assignment getSecondAssignment_1_10_1_1() { return cSecondAssignment_1_10_1_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_10_1_1_0() { return cSecondBKeyword_1_10_1_1_0; }
		
		//'12' (firstAsList+='a' & secondAsList+='b' ) (firstAsList+='a' & secondAsList+='b' )
		public Group getGroup_1_11() { return cGroup_1_11; }
		
		//'12'
		public Keyword getDigitOneDigitTwoKeyword_1_11_0() { return cDigitOneDigitTwoKeyword_1_11_0; }
		
		//(firstAsList+='a' & secondAsList+='b' )
		public UnorderedGroup getUnorderedGroup_1_11_1() { return cUnorderedGroup_1_11_1; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_11_1_0() { return cFirstAsListAssignment_1_11_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_11_1_0_0() { return cFirstAsListAKeyword_1_11_1_0_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_11_1_1() { return cSecondAsListAssignment_1_11_1_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_11_1_1_0() { return cSecondAsListBKeyword_1_11_1_1_0; }
		
		//(firstAsList+='a' & secondAsList+='b' )
		public UnorderedGroup getUnorderedGroup_1_11_2() { return cUnorderedGroup_1_11_2; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_11_2_0() { return cFirstAsListAssignment_1_11_2_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_11_2_0_0() { return cFirstAsListAKeyword_1_11_2_0_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_11_2_1() { return cSecondAsListAssignment_1_11_2_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_11_2_1_0() { return cSecondAsListBKeyword_1_11_2_1_0; }
		
		//'13' (firstAsList+='a' & secondAsList+='b' )? firstAsList+='a' secondAsList+='b'
		public Group getGroup_1_12() { return cGroup_1_12; }
		
		//'13'
		public Keyword getDigitOneDigitThreeKeyword_1_12_0() { return cDigitOneDigitThreeKeyword_1_12_0; }
		
		//(firstAsList+='a' & secondAsList+='b' )?
		public UnorderedGroup getUnorderedGroup_1_12_1() { return cUnorderedGroup_1_12_1; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_12_1_0() { return cFirstAsListAssignment_1_12_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_12_1_0_0() { return cFirstAsListAKeyword_1_12_1_0_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_12_1_1() { return cSecondAsListAssignment_1_12_1_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_12_1_1_0() { return cSecondAsListBKeyword_1_12_1_1_0; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_12_2() { return cFirstAsListAssignment_1_12_2; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_12_2_0() { return cFirstAsListAKeyword_1_12_2_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_12_3() { return cSecondAsListAssignment_1_12_3; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_12_3_0() { return cSecondAsListBKeyword_1_12_3_0; }
		
		//'14' ((firstAsList+='a' & secondAsList+='b') & (thirdAsList+='c' & forthAsList+='d'))+
		public Group getGroup_1_13() { return cGroup_1_13; }
		
		//'14'
		public Keyword getDigitOneDigitFourKeyword_1_13_0() { return cDigitOneDigitFourKeyword_1_13_0; }
		
		//((firstAsList+='a' & secondAsList+='b') & (thirdAsList+='c' & forthAsList+='d'))+
		public UnorderedGroup getUnorderedGroup_1_13_1() { return cUnorderedGroup_1_13_1; }
		
		//(firstAsList+='a' & secondAsList+='b')
		public UnorderedGroup getUnorderedGroup_1_13_1_0() { return cUnorderedGroup_1_13_1_0; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_13_1_0_0() { return cFirstAsListAssignment_1_13_1_0_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_13_1_0_0_0() { return cFirstAsListAKeyword_1_13_1_0_0_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_13_1_0_1() { return cSecondAsListAssignment_1_13_1_0_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_13_1_0_1_0() { return cSecondAsListBKeyword_1_13_1_0_1_0; }
		
		//(thirdAsList+='c' & forthAsList+='d')
		public UnorderedGroup getUnorderedGroup_1_13_1_1() { return cUnorderedGroup_1_13_1_1; }
		
		//thirdAsList+='c'
		public Assignment getThirdAsListAssignment_1_13_1_1_0() { return cThirdAsListAssignment_1_13_1_1_0; }
		
		//'c'
		public Keyword getThirdAsListCKeyword_1_13_1_1_0_0() { return cThirdAsListCKeyword_1_13_1_1_0_0; }
		
		//forthAsList+='d'
		public Assignment getForthAsListAssignment_1_13_1_1_1() { return cForthAsListAssignment_1_13_1_1_1; }
		
		//'d'
		public Keyword getForthAsListDKeyword_1_13_1_1_1_0() { return cForthAsListDKeyword_1_13_1_1_1_0; }
		
		//'datatypes' value=UnorderedDatatype
		public Group getGroup_1_14() { return cGroup_1_14; }
		
		//'datatypes'
		public Keyword getDatatypesKeyword_1_14_0() { return cDatatypesKeyword_1_14_0; }
		
		//value=UnorderedDatatype
		public Assignment getValueAssignment_1_14_1() { return cValueAssignment_1_14_1; }
		
		//UnorderedDatatype
		public RuleCall getValueUnorderedDatatypeParserRuleCall_1_14_1_0() { return cValueUnorderedDatatypeParserRuleCall_1_14_1_0; }
		
		//'serialization' serialized=UnorderedSerialization
		public Group getGroup_1_15() { return cGroup_1_15; }
		
		//'serialization'
		public Keyword getSerializationKeyword_1_15_0() { return cSerializationKeyword_1_15_0; }
		
		//serialized=UnorderedSerialization
		public Assignment getSerializedAssignment_1_15_1() { return cSerializedAssignment_1_15_1; }
		
		//UnorderedSerialization
		public RuleCall getSerializedUnorderedSerializationParserRuleCall_1_15_1_0() { return cSerializedUnorderedSerializationParserRuleCall_1_15_1_0; }
		
		//'bug302585' nestedModel+=NestedModel*
		public Group getGroup_1_16() { return cGroup_1_16; }
		
		//'bug302585'
		public Keyword getBug302585Keyword_1_16_0() { return cBug302585Keyword_1_16_0; }
		
		//nestedModel+=NestedModel*
		public Assignment getNestedModelAssignment_1_16_1() { return cNestedModelAssignment_1_16_1; }
		
		//NestedModel
		public RuleCall getNestedModelNestedModelParserRuleCall_1_16_1_0() { return cNestedModelNestedModelParserRuleCall_1_16_1_0; }
	}
	public class NestedModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage.NestedModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNestedModelAction_0 = (Action)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Assignment cFirstAssignment_1_0 = (Assignment)cUnorderedGroup_1.eContents().get(0);
		private final Keyword cFirstAKeyword_1_0_0 = (Keyword)cFirstAssignment_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_1 = (Assignment)cUnorderedGroup_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_1_0 = (Keyword)cSecondAssignment_1_1.eContents().get(0);
		private final Keyword cNestedKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//NestedModel:
		//  {NestedModel}
		//  (first?="a" & second?="b")?
		//  'nested';
		@Override public ParserRule getRule() { return rule; }
		
		//{NestedModel}
		//(first?="a" & second?="b")?
		//'nested'
		public Group getGroup() { return cGroup; }
		
		//{NestedModel}
		public Action getNestedModelAction_0() { return cNestedModelAction_0; }
		
		//(first?="a" & second?="b")?
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }
		
		//first?="a"
		public Assignment getFirstAssignment_1_0() { return cFirstAssignment_1_0; }
		
		//"a"
		public Keyword getFirstAKeyword_1_0_0() { return cFirstAKeyword_1_0_0; }
		
		//second?="b"
		public Assignment getSecondAssignment_1_1() { return cSecondAssignment_1_1; }
		
		//"b"
		public Keyword getSecondBKeyword_1_1_0() { return cSecondBKeyword_1_1_0; }
		
		//'nested'
		public Keyword getNestedKeyword_2() { return cNestedKeyword_2; }
	}
	public class UnorderedDatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage.UnorderedDatatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDigitOneKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_0_1 = (UnorderedGroup)cGroup_0.eContents().get(1);
		private final Keyword cAKeyword_0_1_0 = (Keyword)cUnorderedGroup_0_1.eContents().get(0);
		private final Keyword cBKeyword_0_1_1 = (Keyword)cUnorderedGroup_0_1.eContents().get(1);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDigitTwoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_1 = (UnorderedGroup)cGroup_1.eContents().get(1);
		private final Keyword cAKeyword_1_1_0 = (Keyword)cUnorderedGroup_1_1.eContents().get(0);
		private final Keyword cBKeyword_1_1_1 = (Keyword)cUnorderedGroup_1_1.eContents().get(1);
		private final Keyword cCKeyword_1_1_2 = (Keyword)cUnorderedGroup_1_1.eContents().get(2);
		private final Keyword cDKeyword_1_1_3 = (Keyword)cUnorderedGroup_1_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDigitThreeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_2_1 = (UnorderedGroup)cGroup_2.eContents().get(1);
		private final Keyword cAKeyword_2_1_0 = (Keyword)cUnorderedGroup_2_1.eContents().get(0);
		private final Keyword cBKeyword_2_1_1 = (Keyword)cUnorderedGroup_2_1.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cDigitFourKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_3_1 = (UnorderedGroup)cGroup_3.eContents().get(1);
		private final Keyword cAKeyword_3_1_0 = (Keyword)cUnorderedGroup_3_1.eContents().get(0);
		private final Keyword cBKeyword_3_1_1 = (Keyword)cUnorderedGroup_3_1.eContents().get(1);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cDigitFiveKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_4_1 = (UnorderedGroup)cGroup_4.eContents().get(1);
		private final Keyword cAKeyword_4_1_0 = (Keyword)cUnorderedGroup_4_1.eContents().get(0);
		private final Keyword cBKeyword_4_1_1 = (Keyword)cUnorderedGroup_4_1.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cDigitSixKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_5_1 = (UnorderedGroup)cGroup_5.eContents().get(1);
		private final Keyword cAKeyword_5_1_0 = (Keyword)cUnorderedGroup_5_1.eContents().get(0);
		private final Keyword cBKeyword_5_1_1 = (Keyword)cUnorderedGroup_5_1.eContents().get(1);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cDigitSevenKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_6_1 = (UnorderedGroup)cGroup_6.eContents().get(1);
		private final Keyword cAKeyword_6_1_0 = (Keyword)cUnorderedGroup_6_1.eContents().get(0);
		private final Keyword cBKeyword_6_1_1 = (Keyword)cUnorderedGroup_6_1.eContents().get(1);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cDigitEightKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_7_1 = (UnorderedGroup)cGroup_7.eContents().get(1);
		private final Group cGroup_7_1_0 = (Group)cUnorderedGroup_7_1.eContents().get(0);
		private final Keyword cAKeyword_7_1_0_0 = (Keyword)cGroup_7_1_0.eContents().get(0);
		private final Keyword cBKeyword_7_1_0_1 = (Keyword)cGroup_7_1_0.eContents().get(1);
		private final Keyword cCKeyword_7_1_0_2 = (Keyword)cGroup_7_1_0.eContents().get(2);
		private final Group cGroup_7_1_1 = (Group)cUnorderedGroup_7_1.eContents().get(1);
		private final Keyword cAKeyword_7_1_1_0 = (Keyword)cGroup_7_1_1.eContents().get(0);
		private final Keyword cBKeyword_7_1_1_1 = (Keyword)cGroup_7_1_1.eContents().get(1);
		private final Keyword cDKeyword_7_1_1_2 = (Keyword)cGroup_7_1_1.eContents().get(2);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Keyword cDigitNineKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_8_1 = (UnorderedGroup)cGroup_8.eContents().get(1);
		private final Keyword cAKeyword_8_1_0 = (Keyword)cUnorderedGroup_8_1.eContents().get(0);
		private final Keyword cBKeyword_8_1_1 = (Keyword)cUnorderedGroup_8_1.eContents().get(1);
		private final Group cGroup_9 = (Group)cAlternatives.eContents().get(9);
		private final Keyword cDigitOneDigitZeroKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_9_1 = (UnorderedGroup)cGroup_9.eContents().get(1);
		private final Keyword cAKeyword_9_1_0 = (Keyword)cUnorderedGroup_9_1.eContents().get(0);
		private final Keyword cBKeyword_9_1_1 = (Keyword)cUnorderedGroup_9_1.eContents().get(1);
		private final Group cGroup_10 = (Group)cAlternatives.eContents().get(10);
		private final Keyword cDigitOneDigitOneKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_10_1 = (UnorderedGroup)cGroup_10.eContents().get(1);
		private final Keyword cAKeyword_10_1_0 = (Keyword)cUnorderedGroup_10_1.eContents().get(0);
		private final Keyword cBKeyword_10_1_1 = (Keyword)cUnorderedGroup_10_1.eContents().get(1);
		private final Group cGroup_11 = (Group)cAlternatives.eContents().get(11);
		private final Keyword cDigitOneDigitTwoKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_11_1 = (UnorderedGroup)cGroup_11.eContents().get(1);
		private final Keyword cAKeyword_11_1_0 = (Keyword)cUnorderedGroup_11_1.eContents().get(0);
		private final Keyword cBKeyword_11_1_1 = (Keyword)cUnorderedGroup_11_1.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_11_2 = (UnorderedGroup)cGroup_11.eContents().get(2);
		private final Keyword cAKeyword_11_2_0 = (Keyword)cUnorderedGroup_11_2.eContents().get(0);
		private final Keyword cBKeyword_11_2_1 = (Keyword)cUnorderedGroup_11_2.eContents().get(1);
		private final Group cGroup_12 = (Group)cAlternatives.eContents().get(12);
		private final Keyword cDigitOneDigitThreeKeyword_12_0 = (Keyword)cGroup_12.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_12_1 = (UnorderedGroup)cGroup_12.eContents().get(1);
		private final Keyword cAKeyword_12_1_0 = (Keyword)cUnorderedGroup_12_1.eContents().get(0);
		private final Keyword cBKeyword_12_1_1 = (Keyword)cUnorderedGroup_12_1.eContents().get(1);
		private final Keyword cAKeyword_12_2 = (Keyword)cGroup_12.eContents().get(2);
		private final Keyword cBKeyword_12_3 = (Keyword)cGroup_12.eContents().get(3);
		private final Group cGroup_13 = (Group)cAlternatives.eContents().get(13);
		private final Keyword cDigitOneDigitFourKeyword_13_0 = (Keyword)cGroup_13.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_13_1 = (UnorderedGroup)cGroup_13.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_13_1_0 = (UnorderedGroup)cUnorderedGroup_13_1.eContents().get(0);
		private final Keyword cAKeyword_13_1_0_0 = (Keyword)cUnorderedGroup_13_1_0.eContents().get(0);
		private final Keyword cBKeyword_13_1_0_1 = (Keyword)cUnorderedGroup_13_1_0.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_13_1_1 = (UnorderedGroup)cUnorderedGroup_13_1.eContents().get(1);
		private final Keyword cCKeyword_13_1_1_0 = (Keyword)cUnorderedGroup_13_1_1.eContents().get(0);
		private final Keyword cDKeyword_13_1_1_1 = (Keyword)cUnorderedGroup_13_1_1.eContents().get(1);
		
		//UnorderedDatatype:
		//    '1' ('a'  & 'b'  )
		//  | '2' ('a'  & 'b' & 'c' & 'd')
		//  | '3' ('a'? & 'b'? )
		//  | '4' ('a'  & 'b'? )
		//  | '5' ('a'? & 'b'  )
		//  | '6' ('a'+ & 'b'* )
		//  | '7' ('a'* & 'b'+ )
		//  | '8' ('a' 'b' 'c' & 'a' 'b' 'd' )
		//  | '9' ('a' & 'b' )+
		//  | '10' ('a' & 'b' )*
		//  | '11' ('a' & 'b' )?
		//  | '12' ('a' & 'b' ) ('a' & 'b' )
		//  | '13' ('a' & 'b' )? 'a' 'b'
		//  | '14' (('a' & 'b') & ('c' & 'd'))+
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  '1' ('a'  & 'b'  )
		//| '2' ('a'  & 'b' & 'c' & 'd')
		//| '3' ('a'? & 'b'? )
		//| '4' ('a'  & 'b'? )
		//| '5' ('a'? & 'b'  )
		//| '6' ('a'+ & 'b'* )
		//| '7' ('a'* & 'b'+ )
		//| '8' ('a' 'b' 'c' & 'a' 'b' 'd' )
		//| '9' ('a' & 'b' )+
		//| '10' ('a' & 'b' )*
		//| '11' ('a' & 'b' )?
		//| '12' ('a' & 'b' ) ('a' & 'b' )
		//| '13' ('a' & 'b' )? 'a' 'b'
		//| '14' (('a' & 'b') & ('c' & 'd'))+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'1' ('a'  & 'b'  )
		public Group getGroup_0() { return cGroup_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_0_0() { return cDigitOneKeyword_0_0; }
		
		//('a'  & 'b'  )
		public UnorderedGroup getUnorderedGroup_0_1() { return cUnorderedGroup_0_1; }
		
		//'a'
		public Keyword getAKeyword_0_1_0() { return cAKeyword_0_1_0; }
		
		//'b'
		public Keyword getBKeyword_0_1_1() { return cBKeyword_0_1_1; }
		
		//'2' ('a'  & 'b' & 'c' & 'd')
		public Group getGroup_1() { return cGroup_1; }
		
		//'2'
		public Keyword getDigitTwoKeyword_1_0() { return cDigitTwoKeyword_1_0; }
		
		//('a'  & 'b' & 'c' & 'd')
		public UnorderedGroup getUnorderedGroup_1_1() { return cUnorderedGroup_1_1; }
		
		//'a'
		public Keyword getAKeyword_1_1_0() { return cAKeyword_1_1_0; }
		
		//'b'
		public Keyword getBKeyword_1_1_1() { return cBKeyword_1_1_1; }
		
		//'c'
		public Keyword getCKeyword_1_1_2() { return cCKeyword_1_1_2; }
		
		//'d'
		public Keyword getDKeyword_1_1_3() { return cDKeyword_1_1_3; }
		
		//'3' ('a'? & 'b'? )
		public Group getGroup_2() { return cGroup_2; }
		
		//'3'
		public Keyword getDigitThreeKeyword_2_0() { return cDigitThreeKeyword_2_0; }
		
		//('a'? & 'b'? )
		public UnorderedGroup getUnorderedGroup_2_1() { return cUnorderedGroup_2_1; }
		
		//'a'?
		public Keyword getAKeyword_2_1_0() { return cAKeyword_2_1_0; }
		
		//'b'?
		public Keyword getBKeyword_2_1_1() { return cBKeyword_2_1_1; }
		
		//'4' ('a'  & 'b'? )
		public Group getGroup_3() { return cGroup_3; }
		
		//'4'
		public Keyword getDigitFourKeyword_3_0() { return cDigitFourKeyword_3_0; }
		
		//('a'  & 'b'? )
		public UnorderedGroup getUnorderedGroup_3_1() { return cUnorderedGroup_3_1; }
		
		//'a'
		public Keyword getAKeyword_3_1_0() { return cAKeyword_3_1_0; }
		
		//'b'?
		public Keyword getBKeyword_3_1_1() { return cBKeyword_3_1_1; }
		
		//'5' ('a'? & 'b'  )
		public Group getGroup_4() { return cGroup_4; }
		
		//'5'
		public Keyword getDigitFiveKeyword_4_0() { return cDigitFiveKeyword_4_0; }
		
		//('a'? & 'b'  )
		public UnorderedGroup getUnorderedGroup_4_1() { return cUnorderedGroup_4_1; }
		
		//'a'?
		public Keyword getAKeyword_4_1_0() { return cAKeyword_4_1_0; }
		
		//'b'
		public Keyword getBKeyword_4_1_1() { return cBKeyword_4_1_1; }
		
		//'6' ('a'+ & 'b'* )
		public Group getGroup_5() { return cGroup_5; }
		
		//'6'
		public Keyword getDigitSixKeyword_5_0() { return cDigitSixKeyword_5_0; }
		
		//('a'+ & 'b'* )
		public UnorderedGroup getUnorderedGroup_5_1() { return cUnorderedGroup_5_1; }
		
		//'a'+
		public Keyword getAKeyword_5_1_0() { return cAKeyword_5_1_0; }
		
		//'b'*
		public Keyword getBKeyword_5_1_1() { return cBKeyword_5_1_1; }
		
		//'7' ('a'* & 'b'+ )
		public Group getGroup_6() { return cGroup_6; }
		
		//'7'
		public Keyword getDigitSevenKeyword_6_0() { return cDigitSevenKeyword_6_0; }
		
		//('a'* & 'b'+ )
		public UnorderedGroup getUnorderedGroup_6_1() { return cUnorderedGroup_6_1; }
		
		//'a'*
		public Keyword getAKeyword_6_1_0() { return cAKeyword_6_1_0; }
		
		//'b'+
		public Keyword getBKeyword_6_1_1() { return cBKeyword_6_1_1; }
		
		//'8' ('a' 'b' 'c' & 'a' 'b' 'd' )
		public Group getGroup_7() { return cGroup_7; }
		
		//'8'
		public Keyword getDigitEightKeyword_7_0() { return cDigitEightKeyword_7_0; }
		
		//('a' 'b' 'c' & 'a' 'b' 'd' )
		public UnorderedGroup getUnorderedGroup_7_1() { return cUnorderedGroup_7_1; }
		
		//'a' 'b' 'c'
		public Group getGroup_7_1_0() { return cGroup_7_1_0; }
		
		//'a'
		public Keyword getAKeyword_7_1_0_0() { return cAKeyword_7_1_0_0; }
		
		//'b'
		public Keyword getBKeyword_7_1_0_1() { return cBKeyword_7_1_0_1; }
		
		//'c'
		public Keyword getCKeyword_7_1_0_2() { return cCKeyword_7_1_0_2; }
		
		//'a' 'b' 'd'
		public Group getGroup_7_1_1() { return cGroup_7_1_1; }
		
		//'a'
		public Keyword getAKeyword_7_1_1_0() { return cAKeyword_7_1_1_0; }
		
		//'b'
		public Keyword getBKeyword_7_1_1_1() { return cBKeyword_7_1_1_1; }
		
		//'d'
		public Keyword getDKeyword_7_1_1_2() { return cDKeyword_7_1_1_2; }
		
		//'9' ('a' & 'b' )+
		public Group getGroup_8() { return cGroup_8; }
		
		//'9'
		public Keyword getDigitNineKeyword_8_0() { return cDigitNineKeyword_8_0; }
		
		//('a' & 'b' )+
		public UnorderedGroup getUnorderedGroup_8_1() { return cUnorderedGroup_8_1; }
		
		//'a'
		public Keyword getAKeyword_8_1_0() { return cAKeyword_8_1_0; }
		
		//'b'
		public Keyword getBKeyword_8_1_1() { return cBKeyword_8_1_1; }
		
		//'10' ('a' & 'b' )*
		public Group getGroup_9() { return cGroup_9; }
		
		//'10'
		public Keyword getDigitOneDigitZeroKeyword_9_0() { return cDigitOneDigitZeroKeyword_9_0; }
		
		//('a' & 'b' )*
		public UnorderedGroup getUnorderedGroup_9_1() { return cUnorderedGroup_9_1; }
		
		//'a'
		public Keyword getAKeyword_9_1_0() { return cAKeyword_9_1_0; }
		
		//'b'
		public Keyword getBKeyword_9_1_1() { return cBKeyword_9_1_1; }
		
		//'11' ('a' & 'b' )?
		public Group getGroup_10() { return cGroup_10; }
		
		//'11'
		public Keyword getDigitOneDigitOneKeyword_10_0() { return cDigitOneDigitOneKeyword_10_0; }
		
		//('a' & 'b' )?
		public UnorderedGroup getUnorderedGroup_10_1() { return cUnorderedGroup_10_1; }
		
		//'a'
		public Keyword getAKeyword_10_1_0() { return cAKeyword_10_1_0; }
		
		//'b'
		public Keyword getBKeyword_10_1_1() { return cBKeyword_10_1_1; }
		
		//'12' ('a' & 'b' ) ('a' & 'b' )
		public Group getGroup_11() { return cGroup_11; }
		
		//'12'
		public Keyword getDigitOneDigitTwoKeyword_11_0() { return cDigitOneDigitTwoKeyword_11_0; }
		
		//('a' & 'b' )
		public UnorderedGroup getUnorderedGroup_11_1() { return cUnorderedGroup_11_1; }
		
		//'a'
		public Keyword getAKeyword_11_1_0() { return cAKeyword_11_1_0; }
		
		//'b'
		public Keyword getBKeyword_11_1_1() { return cBKeyword_11_1_1; }
		
		//('a' & 'b' )
		public UnorderedGroup getUnorderedGroup_11_2() { return cUnorderedGroup_11_2; }
		
		//'a'
		public Keyword getAKeyword_11_2_0() { return cAKeyword_11_2_0; }
		
		//'b'
		public Keyword getBKeyword_11_2_1() { return cBKeyword_11_2_1; }
		
		//'13' ('a' & 'b' )? 'a' 'b'
		public Group getGroup_12() { return cGroup_12; }
		
		//'13'
		public Keyword getDigitOneDigitThreeKeyword_12_0() { return cDigitOneDigitThreeKeyword_12_0; }
		
		//('a' & 'b' )?
		public UnorderedGroup getUnorderedGroup_12_1() { return cUnorderedGroup_12_1; }
		
		//'a'
		public Keyword getAKeyword_12_1_0() { return cAKeyword_12_1_0; }
		
		//'b'
		public Keyword getBKeyword_12_1_1() { return cBKeyword_12_1_1; }
		
		//'a'
		public Keyword getAKeyword_12_2() { return cAKeyword_12_2; }
		
		//'b'
		public Keyword getBKeyword_12_3() { return cBKeyword_12_3; }
		
		//'14' (('a' & 'b') & ('c' & 'd'))+
		public Group getGroup_13() { return cGroup_13; }
		
		//'14'
		public Keyword getDigitOneDigitFourKeyword_13_0() { return cDigitOneDigitFourKeyword_13_0; }
		
		//(('a' & 'b') & ('c' & 'd'))+
		public UnorderedGroup getUnorderedGroup_13_1() { return cUnorderedGroup_13_1; }
		
		//('a' & 'b')
		public UnorderedGroup getUnorderedGroup_13_1_0() { return cUnorderedGroup_13_1_0; }
		
		//'a'
		public Keyword getAKeyword_13_1_0_0() { return cAKeyword_13_1_0_0; }
		
		//'b'
		public Keyword getBKeyword_13_1_0_1() { return cBKeyword_13_1_0_1; }
		
		//('c' & 'd')
		public UnorderedGroup getUnorderedGroup_13_1_1() { return cUnorderedGroup_13_1_1; }
		
		//'c'
		public Keyword getCKeyword_13_1_1_0() { return cCKeyword_13_1_1_0; }
		
		//'d'
		public Keyword getDKeyword_13_1_1_1() { return cDKeyword_13_1_1_1; }
	}
	public class UnorderedSerializationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage.UnorderedSerialization");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUnorderedSerializationAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_1_0 = (UnorderedGroup)cAlternatives_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cUnorderedGroup_1_0.eContents().get(0);
		private final Keyword cDigitOneKeyword_1_0_0_0 = (Keyword)cGroup_1_0_0.eContents().get(0);
		private final Assignment cFirstAssignment_1_0_0_1 = (Assignment)cGroup_1_0_0.eContents().get(1);
		private final Keyword cFirstAKeyword_1_0_0_1_0 = (Keyword)cFirstAssignment_1_0_0_1.eContents().get(0);
		private final Assignment cSecondAssignment_1_0_1 = (Assignment)cUnorderedGroup_1_0.eContents().get(1);
		private final Keyword cSecondBKeyword_1_0_1_0 = (Keyword)cSecondAssignment_1_0_1.eContents().get(0);
		private final Assignment cThirdAssignment_1_0_2 = (Assignment)cUnorderedGroup_1_0.eContents().get(2);
		private final Keyword cThirdCKeyword_1_0_2_0 = (Keyword)cThirdAssignment_1_0_2.eContents().get(0);
		private final Assignment cForthAssignment_1_0_3 = (Assignment)cUnorderedGroup_1_0.eContents().get(3);
		private final Keyword cForthDKeyword_1_0_3_0 = (Keyword)cForthAssignment_1_0_3.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cDigitTwoKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_1_1 = (UnorderedGroup)cGroup_1_1.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_1_1_0 = (Assignment)cUnorderedGroup_1_1_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_1_1_0_0 = (Keyword)cFirstAsListAssignment_1_1_1_0.eContents().get(0);
		private final Assignment cSecondAsListAssignment_1_1_1_1 = (Assignment)cUnorderedGroup_1_1_1.eContents().get(1);
		private final Keyword cSecondAsListBKeyword_1_1_1_1_0 = (Keyword)cSecondAsListAssignment_1_1_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cDigitThreeKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1_2_1 = (UnorderedGroup)cGroup_1_2.eContents().get(1);
		private final Assignment cFirstAsListAssignment_1_2_1_0 = (Assignment)cUnorderedGroup_1_2_1.eContents().get(0);
		private final Keyword cFirstAsListAKeyword_1_2_1_0_0 = (Keyword)cFirstAsListAssignment_1_2_1_0.eContents().get(0);
		private final Assignment cSecondAssignment_1_2_1_1 = (Assignment)cUnorderedGroup_1_2_1.eContents().get(1);
		private final Keyword cSecondBKeyword_1_2_1_1_0 = (Keyword)cSecondAssignment_1_2_1_1.eContents().get(0);
		
		///* SuppressWarnings[potentialOverride] */
		//UnorderedSerialization: {UnorderedSerialization} (
		//    '1' first?='a'?  & second?='b'? & third?='c'? & forth?='d'?
		//  | '2' (firstAsList+='a' & secondAsList+='b')*
		//  | '3' (firstAsList+='a'+ & second?='b')*
		//  )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{UnorderedSerialization} (
		//   '1' first?='a'?  & second?='b'? & third?='c'? & forth?='d'?
		// | '2' (firstAsList+='a' & secondAsList+='b')*
		// | '3' (firstAsList+='a'+ & second?='b')*
		// )
		public Group getGroup() { return cGroup; }
		
		//{UnorderedSerialization}
		public Action getUnorderedSerializationAction_0() { return cUnorderedSerializationAction_0; }
		
		//(
		//   '1' first?='a'?  & second?='b'? & third?='c'? & forth?='d'?
		// | '2' (firstAsList+='a' & secondAsList+='b')*
		// | '3' (firstAsList+='a'+ & second?='b')*
		// )
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'1' first?='a'?  & second?='b'? & third?='c'? & forth?='d'?
		public UnorderedGroup getUnorderedGroup_1_0() { return cUnorderedGroup_1_0; }
		
		//'1' first?='a'?
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//'1'
		public Keyword getDigitOneKeyword_1_0_0_0() { return cDigitOneKeyword_1_0_0_0; }
		
		//first?='a'?
		public Assignment getFirstAssignment_1_0_0_1() { return cFirstAssignment_1_0_0_1; }
		
		//'a'
		public Keyword getFirstAKeyword_1_0_0_1_0() { return cFirstAKeyword_1_0_0_1_0; }
		
		//second?='b'?
		public Assignment getSecondAssignment_1_0_1() { return cSecondAssignment_1_0_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_0_1_0() { return cSecondBKeyword_1_0_1_0; }
		
		//third?='c'?
		public Assignment getThirdAssignment_1_0_2() { return cThirdAssignment_1_0_2; }
		
		//'c'
		public Keyword getThirdCKeyword_1_0_2_0() { return cThirdCKeyword_1_0_2_0; }
		
		//forth?='d'?
		public Assignment getForthAssignment_1_0_3() { return cForthAssignment_1_0_3; }
		
		//'d'
		public Keyword getForthDKeyword_1_0_3_0() { return cForthDKeyword_1_0_3_0; }
		
		//'2' (firstAsList+='a' & secondAsList+='b')*
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'2'
		public Keyword getDigitTwoKeyword_1_1_0() { return cDigitTwoKeyword_1_1_0; }
		
		//(firstAsList+='a' & secondAsList+='b')*
		public UnorderedGroup getUnorderedGroup_1_1_1() { return cUnorderedGroup_1_1_1; }
		
		//firstAsList+='a'
		public Assignment getFirstAsListAssignment_1_1_1_0() { return cFirstAsListAssignment_1_1_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_1_1_0_0() { return cFirstAsListAKeyword_1_1_1_0_0; }
		
		//secondAsList+='b'
		public Assignment getSecondAsListAssignment_1_1_1_1() { return cSecondAsListAssignment_1_1_1_1; }
		
		//'b'
		public Keyword getSecondAsListBKeyword_1_1_1_1_0() { return cSecondAsListBKeyword_1_1_1_1_0; }
		
		//'3' (firstAsList+='a'+ & second?='b')*
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'3'
		public Keyword getDigitThreeKeyword_1_2_0() { return cDigitThreeKeyword_1_2_0; }
		
		//(firstAsList+='a'+ & second?='b')*
		public UnorderedGroup getUnorderedGroup_1_2_1() { return cUnorderedGroup_1_2_1; }
		
		//firstAsList+='a'+
		public Assignment getFirstAsListAssignment_1_2_1_0() { return cFirstAsListAssignment_1_2_1_0; }
		
		//'a'
		public Keyword getFirstAsListAKeyword_1_2_1_0_0() { return cFirstAsListAKeyword_1_2_1_0_0; }
		
		//second?='b'
		public Assignment getSecondAssignment_1_2_1_1() { return cSecondAssignment_1_2_1_1; }
		
		//'b'
		public Keyword getSecondBKeyword_1_2_1_1_0() { return cSecondBKeyword_1_2_1_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final NestedModelElements pNestedModel;
	private final UnorderedDatatypeElements pUnorderedDatatype;
	private final UnorderedSerializationElements pUnorderedSerialization;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UnorderedGroupsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pNestedModel = new NestedModelElements();
		this.pUnorderedDatatype = new UnorderedDatatypeElements();
		this.pUnorderedSerialization = new UnorderedSerializationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage".equals(grammar.getName())) {
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

	
	//Model: {Model} (
	//    '1' (first?='a'  & second?='b'  )
	//  | '2' (first?='a'  & second?='b' & third?='c' & forth?='d')
	//  | '3' (first?='a'? & second?='b'? )
	//  | '4' (first?='a'  & second?='b'? )
	//  | '5' (first?='a'? & second?='b'  )
	//  | '6' (firstAsList+='a'+ & secondAsList+='b'* )
	//  | '7' (firstAsList+='a'* & secondAsList+='b'+ )
	//  | '8' ('a' 'b' first?='c' & 'a' 'b' second?='d' )
	//  | '9' (firstAsList+='a' & secondAsList+='b' )+
	//  | '10' (firstAsList+='a' & secondAsList+='b' )*
	//  | '11' (first?='a' & second?='b' )?
	//  | '12' (firstAsList+='a' & secondAsList+='b' ) (firstAsList+='a' & secondAsList+='b' )
	//  | '13' (firstAsList+='a' & secondAsList+='b' )? firstAsList+='a' secondAsList+='b'
	//  | '14' ((firstAsList+='a' & secondAsList+='b') & (thirdAsList+='c' & forthAsList+='d'))+
	//  | 'datatypes' value=UnorderedDatatype
	//  | 'serialization' serialized=UnorderedSerialization
	//  | 'bug302585' nestedModel+=NestedModel*
	//  )
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//NestedModel:
	//  {NestedModel}
	//  (first?="a" & second?="b")?
	//  'nested';
	public NestedModelElements getNestedModelAccess() {
		return pNestedModel;
	}
	
	public ParserRule getNestedModelRule() {
		return getNestedModelAccess().getRule();
	}
	
	//UnorderedDatatype:
	//    '1' ('a'  & 'b'  )
	//  | '2' ('a'  & 'b' & 'c' & 'd')
	//  | '3' ('a'? & 'b'? )
	//  | '4' ('a'  & 'b'? )
	//  | '5' ('a'? & 'b'  )
	//  | '6' ('a'+ & 'b'* )
	//  | '7' ('a'* & 'b'+ )
	//  | '8' ('a' 'b' 'c' & 'a' 'b' 'd' )
	//  | '9' ('a' & 'b' )+
	//  | '10' ('a' & 'b' )*
	//  | '11' ('a' & 'b' )?
	//  | '12' ('a' & 'b' ) ('a' & 'b' )
	//  | '13' ('a' & 'b' )? 'a' 'b'
	//  | '14' (('a' & 'b') & ('c' & 'd'))+
	//;
	public UnorderedDatatypeElements getUnorderedDatatypeAccess() {
		return pUnorderedDatatype;
	}
	
	public ParserRule getUnorderedDatatypeRule() {
		return getUnorderedDatatypeAccess().getRule();
	}
	
	///* SuppressWarnings[potentialOverride] */
	//UnorderedSerialization: {UnorderedSerialization} (
	//    '1' first?='a'?  & second?='b'? & third?='c'? & forth?='d'?
	//  | '2' (firstAsList+='a' & secondAsList+='b')*
	//  | '3' (firstAsList+='a'+ & second?='b')*
	//  )
	//;
	public UnorderedSerializationElements getUnorderedSerializationAccess() {
		return pUnorderedSerialization;
	}
	
	public ParserRule getUnorderedSerializationRule() {
		return getUnorderedSerializationAccess().getRule();
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
