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
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SequencerTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cX1Assignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cX1SimpleGroupParserRuleCall_0_0 = (RuleCall)cX1Assignment_0.eContents().get(0);
		private final Assignment cX2Assignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cX2SimpleAlternativeParserRuleCall_1_0 = (RuleCall)cX2Assignment_1.eContents().get(0);
		private final Assignment cX3Assignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cX3SimpleMultiplicitiesParserRuleCall_2_0 = (RuleCall)cX3Assignment_2.eContents().get(0);
		private final Assignment cX4Assignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cX4GroupMultiplicitiesParserRuleCall_3_0 = (RuleCall)cX4Assignment_3.eContents().get(0);
		private final Assignment cX5Assignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cX5AlternativeMultiplicitiesParserRuleCall_4_0 = (RuleCall)cX5Assignment_4.eContents().get(0);
		private final Assignment cX6Assignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cX6List1ParserRuleCall_5_0 = (RuleCall)cX6Assignment_5.eContents().get(0);
		private final Assignment cX7Assignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cX7List2ParserRuleCall_6_0 = (RuleCall)cX7Assignment_6.eContents().get(0);
		private final Assignment cX8Assignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cX8AltList1ParserRuleCall_7_0 = (RuleCall)cX8Assignment_7.eContents().get(0);
		private final Assignment cX9Assignment_8 = (Assignment)cAlternatives.eContents().get(8);
		private final RuleCall cX9AltList2ParserRuleCall_8_0 = (RuleCall)cX9Assignment_8.eContents().get(0);
		private final Assignment cX10Assignment_9 = (Assignment)cAlternatives.eContents().get(9);
		private final RuleCall cX10SingleKeywordsParserRuleCall_9_0 = (RuleCall)cX10Assignment_9.eContents().get(0);
		private final Assignment cX11Assignment_10 = (Assignment)cAlternatives.eContents().get(10);
		private final RuleCall cX11SingleKeywordsOrIDParserRuleCall_10_0 = (RuleCall)cX11Assignment_10.eContents().get(0);
		private final Assignment cX12Assignment_11 = (Assignment)cAlternatives.eContents().get(11);
		private final RuleCall cX12SingleTerminalsParserRuleCall_11_0 = (RuleCall)cX12Assignment_11.eContents().get(0);
		private final Assignment cX10Assignment_12 = (Assignment)cAlternatives.eContents().get(12);
		private final RuleCall cX10MultiKeywordsParserRuleCall_12_0 = (RuleCall)cX10Assignment_12.eContents().get(0);
		private final Assignment cX11Assignment_13 = (Assignment)cAlternatives.eContents().get(13);
		private final RuleCall cX11MultiKeywordsOrIDParserRuleCall_13_0 = (RuleCall)cX11Assignment_13.eContents().get(0);
		private final Assignment cX12Assignment_14 = (Assignment)cAlternatives.eContents().get(14);
		private final RuleCall cX12MultiTerminalsParserRuleCall_14_0 = (RuleCall)cX12Assignment_14.eContents().get(0);
		private final Assignment cX13Assignment_15 = (Assignment)cAlternatives.eContents().get(15);
		private final RuleCall cX13SingleEnumParserRuleCall_15_0 = (RuleCall)cX13Assignment_15.eContents().get(0);
		private final Assignment cX14Assignment_16 = (Assignment)cAlternatives.eContents().get(16);
		private final RuleCall cX14SingleCrossReferenceParserRuleCall_16_0 = (RuleCall)cX14Assignment_16.eContents().get(0);
		private final Assignment cX15Assignment_17 = (Assignment)cAlternatives.eContents().get(17);
		private final RuleCall cX15SingleContainmentReferenceParserRuleCall_17_0 = (RuleCall)cX15Assignment_17.eContents().get(0);
		private final Assignment cX19Assignment_18 = (Assignment)cAlternatives.eContents().get(18);
		private final RuleCall cX19DependentAlternative1ParserRuleCall_18_0 = (RuleCall)cX19Assignment_18.eContents().get(0);
		private final Assignment cX20Assignment_19 = (Assignment)cAlternatives.eContents().get(19);
		private final RuleCall cX20DependentAlternative2ParserRuleCall_19_0 = (RuleCall)cX20Assignment_19.eContents().get(0);
		private final Assignment cX21Assignment_20 = (Assignment)cAlternatives.eContents().get(20);
		private final RuleCall cX21OptionalParserRuleCall_20_0 = (RuleCall)cX21Assignment_20.eContents().get(0);
		private final Assignment cX22Assignment_21 = (Assignment)cAlternatives.eContents().get(21);
		private final RuleCall cX22FloatParserRuleCall_21_0 = (RuleCall)cX22Assignment_21.eContents().get(0);
		private final Assignment cX23Assignment_22 = (Assignment)cAlternatives.eContents().get(22);
		private final RuleCall cX23UnorderedAlternativeParserRuleCall_22_0 = (RuleCall)cX23Assignment_22.eContents().get(0);
		private final Assignment cX24Assignment_23 = (Assignment)cAlternatives.eContents().get(23);
		private final RuleCall cX24UnorderedGroupParserRuleCall_23_0 = (RuleCall)cX24Assignment_23.eContents().get(0);
		private final Assignment cX25Assignment_24 = (Assignment)cAlternatives.eContents().get(24);
		private final RuleCall cX25UnorderedGroupOptionalParserRuleCall_24_0 = (RuleCall)cX25Assignment_24.eContents().get(0);
		private final Assignment cX26Assignment_25 = (Assignment)cAlternatives.eContents().get(25);
		private final RuleCall cX26UnorderedGroupBooleanParserRuleCall_25_0 = (RuleCall)cX26Assignment_25.eContents().get(0);
		private final Assignment cX27Assignment_26 = (Assignment)cAlternatives.eContents().get(26);
		private final RuleCall cX27Complex1ParserRuleCall_26_0 = (RuleCall)cX27Assignment_26.eContents().get(0);
		private final Assignment cX28Assignment_27 = (Assignment)cAlternatives.eContents().get(27);
		private final RuleCall cX28OptionalDoubleParserRuleCall_27_0 = (RuleCall)cX28Assignment_27.eContents().get(0);
		private final Assignment cX29Assignment_28 = (Assignment)cAlternatives.eContents().get(28);
		private final RuleCall cX29NullValueGeneratedParserRuleCall_28_0 = (RuleCall)cX29Assignment_28.eContents().get(0);
		private final Assignment cX30Assignment_29 = (Assignment)cAlternatives.eContents().get(29);
		private final RuleCall cX30NullValueInterpretedParserRuleCall_29_0 = (RuleCall)cX30Assignment_29.eContents().get(0);
		private final Assignment cX31Assignment_30 = (Assignment)cAlternatives.eContents().get(30);
		private final RuleCall cX31NullCrossRefGeneratedParserRuleCall_30_0 = (RuleCall)cX31Assignment_30.eContents().get(0);
		private final Assignment cX32Assignment_31 = (Assignment)cAlternatives.eContents().get(31);
		private final RuleCall cX32NullCrossRefInterpretedParserRuleCall_31_0 = (RuleCall)cX32Assignment_31.eContents().get(0);
		private final Assignment cX33Assignment_32 = (Assignment)cAlternatives.eContents().get(32);
		private final RuleCall cX33FragmentCallerParserRuleCall_32_0 = (RuleCall)cX33Assignment_32.eContents().get(0);
		private final Assignment cX34Assignment_33 = (Assignment)cAlternatives.eContents().get(33);
		private final RuleCall cX34ParameterCallerParserRuleCall_33_0 = (RuleCall)cX34Assignment_33.eContents().get(0);
		private final Assignment cX35Assignment_34 = (Assignment)cAlternatives.eContents().get(34);
		private final RuleCall cX35ParameterDelegationParserRuleCall_34_0 = (RuleCall)cX35Assignment_34.eContents().get(0);
		
		//Model:
		//    x1=SimpleGroup | x2=SimpleAlternative | x3=SimpleMultiplicities | x4=GroupMultiplicities |
		//    x5=AlternativeMultiplicities | x6=List1 | x7=List2 | x8=AltList1 | x9=AltList2 |
		//    x10=SingleKeywords | x11=SingleKeywordsOrID | x12=SingleTerminals |
		//    x10=MultiKeywords | x11=MultiKeywordsOrID | x12=MultiTerminals |
		//    x13=SingleEnum | x14=SingleCrossReference | x15=SingleContainmentReference |
		//    x19=DependentAlternative1 | x20=DependentAlternative2 | x21=Optional | x22=Float |
		//    x23=UnorderedAlternative | x24=UnorderedGroup | x25=UnorderedGroupOptional |
		//    x26=UnorderedGroupBoolean | x27=Complex1 | x28=OptionalDouble |
		//    x29=NullValueGenerated | x30=NullValueInterpreted | x31=NullCrossRefGenerated | x32=NullCrossRefInterpreted |
		//    x33=FragmentCaller | x34=ParameterCaller | x35=ParameterDelegation;
		@Override public ParserRule getRule() { return rule; }
		
		//x1=SimpleGroup | x2=SimpleAlternative | x3=SimpleMultiplicities | x4=GroupMultiplicities |
		//x5=AlternativeMultiplicities | x6=List1 | x7=List2 | x8=AltList1 | x9=AltList2 |
		//x10=SingleKeywords | x11=SingleKeywordsOrID | x12=SingleTerminals |
		//x10=MultiKeywords | x11=MultiKeywordsOrID | x12=MultiTerminals |
		//x13=SingleEnum | x14=SingleCrossReference | x15=SingleContainmentReference |
		//x19=DependentAlternative1 | x20=DependentAlternative2 | x21=Optional | x22=Float |
		//x23=UnorderedAlternative | x24=UnorderedGroup | x25=UnorderedGroupOptional |
		//x26=UnorderedGroupBoolean | x27=Complex1 | x28=OptionalDouble |
		//x29=NullValueGenerated | x30=NullValueInterpreted | x31=NullCrossRefGenerated | x32=NullCrossRefInterpreted |
		//x33=FragmentCaller | x34=ParameterCaller | x35=ParameterDelegation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//x1=SimpleGroup
		public Assignment getX1Assignment_0() { return cX1Assignment_0; }
		
		//SimpleGroup
		public RuleCall getX1SimpleGroupParserRuleCall_0_0() { return cX1SimpleGroupParserRuleCall_0_0; }
		
		//x2=SimpleAlternative
		public Assignment getX2Assignment_1() { return cX2Assignment_1; }
		
		//SimpleAlternative
		public RuleCall getX2SimpleAlternativeParserRuleCall_1_0() { return cX2SimpleAlternativeParserRuleCall_1_0; }
		
		//x3=SimpleMultiplicities
		public Assignment getX3Assignment_2() { return cX3Assignment_2; }
		
		//SimpleMultiplicities
		public RuleCall getX3SimpleMultiplicitiesParserRuleCall_2_0() { return cX3SimpleMultiplicitiesParserRuleCall_2_0; }
		
		//x4=GroupMultiplicities
		public Assignment getX4Assignment_3() { return cX4Assignment_3; }
		
		//GroupMultiplicities
		public RuleCall getX4GroupMultiplicitiesParserRuleCall_3_0() { return cX4GroupMultiplicitiesParserRuleCall_3_0; }
		
		//x5=AlternativeMultiplicities
		public Assignment getX5Assignment_4() { return cX5Assignment_4; }
		
		//AlternativeMultiplicities
		public RuleCall getX5AlternativeMultiplicitiesParserRuleCall_4_0() { return cX5AlternativeMultiplicitiesParserRuleCall_4_0; }
		
		//x6=List1
		public Assignment getX6Assignment_5() { return cX6Assignment_5; }
		
		//List1
		public RuleCall getX6List1ParserRuleCall_5_0() { return cX6List1ParserRuleCall_5_0; }
		
		//x7=List2
		public Assignment getX7Assignment_6() { return cX7Assignment_6; }
		
		//List2
		public RuleCall getX7List2ParserRuleCall_6_0() { return cX7List2ParserRuleCall_6_0; }
		
		//x8=AltList1
		public Assignment getX8Assignment_7() { return cX8Assignment_7; }
		
		//AltList1
		public RuleCall getX8AltList1ParserRuleCall_7_0() { return cX8AltList1ParserRuleCall_7_0; }
		
		//x9=AltList2
		public Assignment getX9Assignment_8() { return cX9Assignment_8; }
		
		//AltList2
		public RuleCall getX9AltList2ParserRuleCall_8_0() { return cX9AltList2ParserRuleCall_8_0; }
		
		//x10=SingleKeywords
		public Assignment getX10Assignment_9() { return cX10Assignment_9; }
		
		//SingleKeywords
		public RuleCall getX10SingleKeywordsParserRuleCall_9_0() { return cX10SingleKeywordsParserRuleCall_9_0; }
		
		//x11=SingleKeywordsOrID
		public Assignment getX11Assignment_10() { return cX11Assignment_10; }
		
		//SingleKeywordsOrID
		public RuleCall getX11SingleKeywordsOrIDParserRuleCall_10_0() { return cX11SingleKeywordsOrIDParserRuleCall_10_0; }
		
		//x12=SingleTerminals
		public Assignment getX12Assignment_11() { return cX12Assignment_11; }
		
		//SingleTerminals
		public RuleCall getX12SingleTerminalsParserRuleCall_11_0() { return cX12SingleTerminalsParserRuleCall_11_0; }
		
		//x10=MultiKeywords
		public Assignment getX10Assignment_12() { return cX10Assignment_12; }
		
		//MultiKeywords
		public RuleCall getX10MultiKeywordsParserRuleCall_12_0() { return cX10MultiKeywordsParserRuleCall_12_0; }
		
		//x11=MultiKeywordsOrID
		public Assignment getX11Assignment_13() { return cX11Assignment_13; }
		
		//MultiKeywordsOrID
		public RuleCall getX11MultiKeywordsOrIDParserRuleCall_13_0() { return cX11MultiKeywordsOrIDParserRuleCall_13_0; }
		
		//x12=MultiTerminals
		public Assignment getX12Assignment_14() { return cX12Assignment_14; }
		
		//MultiTerminals
		public RuleCall getX12MultiTerminalsParserRuleCall_14_0() { return cX12MultiTerminalsParserRuleCall_14_0; }
		
		//x13=SingleEnum
		public Assignment getX13Assignment_15() { return cX13Assignment_15; }
		
		//SingleEnum
		public RuleCall getX13SingleEnumParserRuleCall_15_0() { return cX13SingleEnumParserRuleCall_15_0; }
		
		//x14=SingleCrossReference
		public Assignment getX14Assignment_16() { return cX14Assignment_16; }
		
		//SingleCrossReference
		public RuleCall getX14SingleCrossReferenceParserRuleCall_16_0() { return cX14SingleCrossReferenceParserRuleCall_16_0; }
		
		//x15=SingleContainmentReference
		public Assignment getX15Assignment_17() { return cX15Assignment_17; }
		
		//SingleContainmentReference
		public RuleCall getX15SingleContainmentReferenceParserRuleCall_17_0() { return cX15SingleContainmentReferenceParserRuleCall_17_0; }
		
		//x19=DependentAlternative1
		public Assignment getX19Assignment_18() { return cX19Assignment_18; }
		
		//DependentAlternative1
		public RuleCall getX19DependentAlternative1ParserRuleCall_18_0() { return cX19DependentAlternative1ParserRuleCall_18_0; }
		
		//x20=DependentAlternative2
		public Assignment getX20Assignment_19() { return cX20Assignment_19; }
		
		//DependentAlternative2
		public RuleCall getX20DependentAlternative2ParserRuleCall_19_0() { return cX20DependentAlternative2ParserRuleCall_19_0; }
		
		//x21=Optional
		public Assignment getX21Assignment_20() { return cX21Assignment_20; }
		
		//Optional
		public RuleCall getX21OptionalParserRuleCall_20_0() { return cX21OptionalParserRuleCall_20_0; }
		
		//x22=Float
		public Assignment getX22Assignment_21() { return cX22Assignment_21; }
		
		//Float
		public RuleCall getX22FloatParserRuleCall_21_0() { return cX22FloatParserRuleCall_21_0; }
		
		//x23=UnorderedAlternative
		public Assignment getX23Assignment_22() { return cX23Assignment_22; }
		
		//UnorderedAlternative
		public RuleCall getX23UnorderedAlternativeParserRuleCall_22_0() { return cX23UnorderedAlternativeParserRuleCall_22_0; }
		
		//x24=UnorderedGroup
		public Assignment getX24Assignment_23() { return cX24Assignment_23; }
		
		//UnorderedGroup
		public RuleCall getX24UnorderedGroupParserRuleCall_23_0() { return cX24UnorderedGroupParserRuleCall_23_0; }
		
		//x25=UnorderedGroupOptional
		public Assignment getX25Assignment_24() { return cX25Assignment_24; }
		
		//UnorderedGroupOptional
		public RuleCall getX25UnorderedGroupOptionalParserRuleCall_24_0() { return cX25UnorderedGroupOptionalParserRuleCall_24_0; }
		
		//x26=UnorderedGroupBoolean
		public Assignment getX26Assignment_25() { return cX26Assignment_25; }
		
		//UnorderedGroupBoolean
		public RuleCall getX26UnorderedGroupBooleanParserRuleCall_25_0() { return cX26UnorderedGroupBooleanParserRuleCall_25_0; }
		
		//x27=Complex1
		public Assignment getX27Assignment_26() { return cX27Assignment_26; }
		
		//Complex1
		public RuleCall getX27Complex1ParserRuleCall_26_0() { return cX27Complex1ParserRuleCall_26_0; }
		
		//x28=OptionalDouble
		public Assignment getX28Assignment_27() { return cX28Assignment_27; }
		
		//OptionalDouble
		public RuleCall getX28OptionalDoubleParserRuleCall_27_0() { return cX28OptionalDoubleParserRuleCall_27_0; }
		
		//x29=NullValueGenerated
		public Assignment getX29Assignment_28() { return cX29Assignment_28; }
		
		//NullValueGenerated
		public RuleCall getX29NullValueGeneratedParserRuleCall_28_0() { return cX29NullValueGeneratedParserRuleCall_28_0; }
		
		//x30=NullValueInterpreted
		public Assignment getX30Assignment_29() { return cX30Assignment_29; }
		
		//NullValueInterpreted
		public RuleCall getX30NullValueInterpretedParserRuleCall_29_0() { return cX30NullValueInterpretedParserRuleCall_29_0; }
		
		//x31=NullCrossRefGenerated
		public Assignment getX31Assignment_30() { return cX31Assignment_30; }
		
		//NullCrossRefGenerated
		public RuleCall getX31NullCrossRefGeneratedParserRuleCall_30_0() { return cX31NullCrossRefGeneratedParserRuleCall_30_0; }
		
		//x32=NullCrossRefInterpreted
		public Assignment getX32Assignment_31() { return cX32Assignment_31; }
		
		//NullCrossRefInterpreted
		public RuleCall getX32NullCrossRefInterpretedParserRuleCall_31_0() { return cX32NullCrossRefInterpretedParserRuleCall_31_0; }
		
		//x33=FragmentCaller
		public Assignment getX33Assignment_32() { return cX33Assignment_32; }
		
		//FragmentCaller
		public RuleCall getX33FragmentCallerParserRuleCall_32_0() { return cX33FragmentCallerParserRuleCall_32_0; }
		
		//x34=ParameterCaller
		public Assignment getX34Assignment_33() { return cX34Assignment_33; }
		
		//ParameterCaller
		public RuleCall getX34ParameterCallerParserRuleCall_33_0() { return cX34ParameterCallerParserRuleCall_33_0; }
		
		//x35=ParameterDelegation
		public Assignment getX35Assignment_34() { return cX35Assignment_34; }
		
		//ParameterDelegation
		public RuleCall getX35ParameterDelegationParserRuleCall_34_0() { return cX35ParameterDelegationParserRuleCall_34_0; }
	}
	public class SimpleGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SimpleGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Assignment cVal2Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVal2IDTerminalRuleCall_2_0 = (RuleCall)cVal2Assignment_2.eContents().get(0);
		
		//SimpleGroup:
		//    "#1" val1=ID val2=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#1" val1=ID val2=ID
		public Group getGroup() { return cGroup; }
		
		//"#1"
		public Keyword getNumberSignDigitOneKeyword_0() { return cNumberSignDigitOneKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_2() { return cVal2Assignment_2; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_2_0() { return cVal2IDTerminalRuleCall_2_0; }
	}
	public class SimpleAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SimpleAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cKw1Keyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_1_0 = (RuleCall)cVal1Assignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw2Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal2Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal2Assignment_1_1_1.eContents().get(0);
		
		//SimpleAlternative:
		//    "#2" ("kw1" val1=ID | "kw2" val2=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#2" ("kw1" val1=ID | "kw2" val2=ID)
		public Group getGroup() { return cGroup; }
		
		//"#2"
		public Keyword getNumberSignDigitTwoKeyword_0() { return cNumberSignDigitTwoKeyword_0; }
		
		//("kw1" val1=ID | "kw2" val2=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"kw1" val1=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0_0() { return cKw1Keyword_1_0_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0_1() { return cVal1Assignment_1_0_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_1_0() { return cVal1IDTerminalRuleCall_1_0_1_0; }
		
		//"kw2" val2=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_1_0() { return cKw2Keyword_1_1_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_1_1() { return cVal2Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_1_1_0() { return cVal2IDTerminalRuleCall_1_1_1_0; }
	}
	public class SimpleMultiplicitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SimpleMultiplicities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVal2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVal2IDTerminalRuleCall_3_0 = (RuleCall)cVal2Assignment_3.eContents().get(0);
		private final Keyword cKw2Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cVal3Assignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cVal3IDTerminalRuleCall_5_0 = (RuleCall)cVal3Assignment_5.eContents().get(0);
		private final Keyword cKw3Keyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cVal4Assignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cVal4IDTerminalRuleCall_7_0 = (RuleCall)cVal4Assignment_7.eContents().get(0);
		
		//SimpleMultiplicities:
		//    "#3" val1=ID "kw1" val2=ID? "kw2" val3+=ID+ "kw3" val4+=ID*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#3" val1=ID "kw1" val2=ID? "kw2" val3+=ID+ "kw3" val4+=ID*
		public Group getGroup() { return cGroup; }
		
		//"#3"
		public Keyword getNumberSignDigitThreeKeyword_0() { return cNumberSignDigitThreeKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2() { return cKw1Keyword_2; }
		
		//val2=ID?
		public Assignment getVal2Assignment_3() { return cVal2Assignment_3; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0() { return cVal2IDTerminalRuleCall_3_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_4() { return cKw2Keyword_4; }
		
		//val3+=ID+
		public Assignment getVal3Assignment_5() { return cVal3Assignment_5; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_5_0() { return cVal3IDTerminalRuleCall_5_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_6() { return cKw3Keyword_6; }
		
		//val4+=ID*
		public Assignment getVal4Assignment_7() { return cVal4Assignment_7; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_7_0() { return cVal4IDTerminalRuleCall_7_0; }
	}
	public class GroupMultiplicitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.GroupMultiplicities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Keyword cKw1Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cVal2Assignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cVal2IDTerminalRuleCall_3_0_0 = (RuleCall)cVal2Assignment_3_0.eContents().get(0);
		private final Assignment cVal3Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_3_1_0 = (RuleCall)cVal3Assignment_3_1.eContents().get(0);
		private final Keyword cKw2Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Assignment cVal4Assignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final RuleCall cVal4IDTerminalRuleCall_5_0_0 = (RuleCall)cVal4Assignment_5_0.eContents().get(0);
		private final Assignment cVal5Assignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cVal5IDTerminalRuleCall_5_1_0 = (RuleCall)cVal5Assignment_5_1.eContents().get(0);
		private final Keyword cKw3Keyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cVal6Assignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final RuleCall cVal6IDTerminalRuleCall_7_0_0 = (RuleCall)cVal6Assignment_7_0.eContents().get(0);
		private final Assignment cVal7Assignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cVal7IDTerminalRuleCall_7_1_0 = (RuleCall)cVal7Assignment_7_1.eContents().get(0);
		
		//GroupMultiplicities:
		//    "#4" val1=ID "kw1" (val2=ID val3=ID)? "kw2" (val4+=ID val5+=ID)+ "kw3" (val6+=ID val7+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#4" val1=ID "kw1" (val2=ID val3=ID)? "kw2" (val4+=ID val5+=ID)+ "kw3" (val6+=ID val7+=ID)*
		public Group getGroup() { return cGroup; }
		
		//"#4"
		public Keyword getNumberSignDigitFourKeyword_0() { return cNumberSignDigitFourKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2() { return cKw1Keyword_2; }
		
		//(val2=ID val3=ID)?
		public Group getGroup_3() { return cGroup_3; }
		
		//val2=ID
		public Assignment getVal2Assignment_3_0() { return cVal2Assignment_3_0; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_0_0() { return cVal2IDTerminalRuleCall_3_0_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_3_1() { return cVal3Assignment_3_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_3_1_0() { return cVal3IDTerminalRuleCall_3_1_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_4() { return cKw2Keyword_4; }
		
		//(val4+=ID val5+=ID)+
		public Group getGroup_5() { return cGroup_5; }
		
		//val4+=ID
		public Assignment getVal4Assignment_5_0() { return cVal4Assignment_5_0; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_5_0_0() { return cVal4IDTerminalRuleCall_5_0_0; }
		
		//val5+=ID
		public Assignment getVal5Assignment_5_1() { return cVal5Assignment_5_1; }
		
		//ID
		public RuleCall getVal5IDTerminalRuleCall_5_1_0() { return cVal5IDTerminalRuleCall_5_1_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_6() { return cKw3Keyword_6; }
		
		//(val6+=ID val7+=ID)*
		public Group getGroup_7() { return cGroup_7; }
		
		//val6+=ID
		public Assignment getVal6Assignment_7_0() { return cVal6Assignment_7_0; }
		
		//ID
		public RuleCall getVal6IDTerminalRuleCall_7_0_0() { return cVal6IDTerminalRuleCall_7_0_0; }
		
		//val7+=ID
		public Assignment getVal7Assignment_7_1() { return cVal7Assignment_7_1; }
		
		//ID
		public RuleCall getVal7IDTerminalRuleCall_7_1_0() { return cVal7IDTerminalRuleCall_7_1_0; }
	}
	public class AlternativeMultiplicitiesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.AlternativeMultiplicities");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cVal2Assignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cVal2IDTerminalRuleCall_1_0_0 = (RuleCall)cVal2Assignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw1Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal3Assignment_1_1_1.eContents().get(0);
		private final Keyword cKw2Keyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cVal4Assignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cVal4IDTerminalRuleCall_3_0_0 = (RuleCall)cVal4Assignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cKw3Keyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cVal5Assignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cVal5IDTerminalRuleCall_3_1_1_0 = (RuleCall)cVal5Assignment_3_1_1.eContents().get(0);
		private final Keyword cKw4Keyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cVal6Assignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final RuleCall cVal6IDTerminalRuleCall_5_0_0 = (RuleCall)cVal6Assignment_5_0.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cAlternatives_5.eContents().get(1);
		private final Keyword cKw5Keyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cVal7Assignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cVal7IDTerminalRuleCall_5_1_1_0 = (RuleCall)cVal7Assignment_5_1_1.eContents().get(0);
		
		//AlternativeMultiplicities:
		//    "#5" (val2=ID | "kw1" val3=ID)? "kw2" (val4+=ID | "kw3" val5+=ID)+ "kw4" (val6+=ID | ("kw5" val7+=ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#5" (val2=ID | "kw1" val3=ID)? "kw2" (val4+=ID | "kw3" val5+=ID)+ "kw4" (val6+=ID | ("kw5" val7+=ID))*
		public Group getGroup() { return cGroup; }
		
		//"#5"
		public Keyword getNumberSignDigitFiveKeyword_0() { return cNumberSignDigitFiveKeyword_0; }
		
		//(val2=ID | "kw1" val3=ID)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_0() { return cVal2Assignment_1_0; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0_0() { return cVal2IDTerminalRuleCall_1_0_0; }
		
		//"kw1" val3=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_1_0() { return cKw1Keyword_1_1_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1_1_1() { return cVal3Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_1_1_0() { return cVal3IDTerminalRuleCall_1_1_1_0; }
		
		//"kw2"
		public Keyword getKw2Keyword_2() { return cKw2Keyword_2; }
		
		//(val4+=ID | "kw3" val5+=ID)+
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//val4+=ID
		public Assignment getVal4Assignment_3_0() { return cVal4Assignment_3_0; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_3_0_0() { return cVal4IDTerminalRuleCall_3_0_0; }
		
		//"kw3" val5+=ID
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//"kw3"
		public Keyword getKw3Keyword_3_1_0() { return cKw3Keyword_3_1_0; }
		
		//val5+=ID
		public Assignment getVal5Assignment_3_1_1() { return cVal5Assignment_3_1_1; }
		
		//ID
		public RuleCall getVal5IDTerminalRuleCall_3_1_1_0() { return cVal5IDTerminalRuleCall_3_1_1_0; }
		
		//"kw4"
		public Keyword getKw4Keyword_4() { return cKw4Keyword_4; }
		
		//(val6+=ID | ("kw5" val7+=ID))*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//val6+=ID
		public Assignment getVal6Assignment_5_0() { return cVal6Assignment_5_0; }
		
		//ID
		public RuleCall getVal6IDTerminalRuleCall_5_0_0() { return cVal6IDTerminalRuleCall_5_0_0; }
		
		//("kw5" val7+=ID)
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//"kw5"
		public Keyword getKw5Keyword_5_1_0() { return cKw5Keyword_5_1_0; }
		
		//val7+=ID
		public Assignment getVal7Assignment_5_1_1() { return cVal7Assignment_5_1_1; }
		
		//ID
		public RuleCall getVal7IDTerminalRuleCall_5_1_1_0() { return cVal7IDTerminalRuleCall_5_1_1_0; }
	}
	public class List1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.List1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitSixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVal1Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_1_0 = (RuleCall)cVal1Assignment_2_1.eContents().get(0);
		
		//List1:
		//    "#6" val1+=ID ("," val1+=ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#6" val1+=ID ("," val1+=ID)*
		public Group getGroup() { return cGroup; }
		
		//"#6"
		public Keyword getNumberSignDigitSixKeyword_0() { return cNumberSignDigitSixKeyword_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//("," val1+=ID)*
		public Group getGroup_2() { return cGroup_2; }
		
		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_2_1() { return cVal1Assignment_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_1_0() { return cVal1IDTerminalRuleCall_2_1_0; }
	}
	public class List2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.List2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitSevenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cList2Action_1 = (Action)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cVal1Assignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_2_0_0 = (RuleCall)cVal1Assignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cVal1Assignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_1_1_0 = (RuleCall)cVal1Assignment_2_1_1.eContents().get(0);
		
		//List2:
		//    "#7" {List2} (val1+=ID ("," val1+=ID)*)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#7" {List2} (val1+=ID ("," val1+=ID)*)?
		public Group getGroup() { return cGroup; }
		
		//"#7"
		public Keyword getNumberSignDigitSevenKeyword_0() { return cNumberSignDigitSevenKeyword_0; }
		
		//{List2}
		public Action getList2Action_1() { return cList2Action_1; }
		
		//(val1+=ID ("," val1+=ID)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//val1+=ID
		public Assignment getVal1Assignment_2_0() { return cVal1Assignment_2_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_0_0() { return cVal1IDTerminalRuleCall_2_0_0; }
		
		//("," val1+=ID)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_2_1_1() { return cVal1Assignment_2_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_1_1_0() { return cVal1IDTerminalRuleCall_2_1_1_0; }
	}
	public class AltList1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.AltList1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitEightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0_0 = (RuleCall)cVal1Assignment_1_0_0.eContents().get(0);
		private final Assignment cVal2Assignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_0_1_0 = (RuleCall)cVal2Assignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw1Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal1Assignment_1_1_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cVal3IDTerminalRuleCall_1_1_2_0 = (RuleCall)cVal3Assignment_1_1_2.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cKw2Keyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cVal1Assignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_2_1_0 = (RuleCall)cVal1Assignment_1_2_1.eContents().get(0);
		private final Assignment cVal4Assignment_1_2_2 = (Assignment)cGroup_1_2.eContents().get(2);
		private final RuleCall cVal4IDTerminalRuleCall_1_2_2_0 = (RuleCall)cVal4Assignment_1_2_2.eContents().get(0);
		
		//AltList1:
		//    "#8" (val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?);
		@Override public ParserRule getRule() { return rule; }
		
		//"#8" (val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?)
		public Group getGroup() { return cGroup; }
		
		//"#8"
		public Keyword getNumberSignDigitEightKeyword_0() { return cNumberSignDigitEightKeyword_0; }
		
		//(val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val1=ID val2=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0_0() { return cVal1Assignment_1_0_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0_0() { return cVal1IDTerminalRuleCall_1_0_0_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_0_1() { return cVal2Assignment_1_0_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0_1_0() { return cVal2IDTerminalRuleCall_1_0_1_0; }
		
		//"kw1" val1=ID val3=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_1_0() { return cKw1Keyword_1_1_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_1_1() { return cVal1Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_1_0() { return cVal1IDTerminalRuleCall_1_1_1_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1_1_2() { return cVal3Assignment_1_1_2; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_1_2_0() { return cVal3IDTerminalRuleCall_1_1_2_0; }
		
		//"kw2" val1=ID val4=ID?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_2_0() { return cKw2Keyword_1_2_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_2_1() { return cVal1Assignment_1_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_2_1_0() { return cVal1IDTerminalRuleCall_1_2_1_0; }
		
		//val4=ID?
		public Assignment getVal4Assignment_1_2_2() { return cVal4Assignment_1_2_2; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_1_2_2_0() { return cVal4IDTerminalRuleCall_1_2_2_0; }
	}
	public class AltList2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.AltList2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitNineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0_0 = (RuleCall)cVal1Assignment_1_0_0.eContents().get(0);
		private final Assignment cVal2Assignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_1_0_1_0 = (RuleCall)cVal2Assignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKwKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cVal1Assignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_1_0 = (RuleCall)cVal1Assignment_1_1_1.eContents().get(0);
		private final Group cGroup_1_1_2 = (Group)cGroup_1_1.eContents().get(2);
		private final Keyword cCommaKeyword_1_1_2_0 = (Keyword)cGroup_1_1_2.eContents().get(0);
		private final Assignment cVal1Assignment_1_1_2_1 = (Assignment)cGroup_1_1_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_1_2_1_0 = (RuleCall)cVal1Assignment_1_1_2_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_1_3 = (Assignment)cGroup_1_1.eContents().get(3);
		private final RuleCall cVal3IDTerminalRuleCall_1_1_3_0 = (RuleCall)cVal3Assignment_1_1_3.eContents().get(0);
		
		//AltList2:
		//    "#9" (val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#9" (val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID)
		public Group getGroup() { return cGroup; }
		
		//"#9"
		public Keyword getNumberSignDigitNineKeyword_0() { return cNumberSignDigitNineKeyword_0; }
		
		//(val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val1+=ID val2=ID
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_0_0() { return cVal1Assignment_1_0_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0_0() { return cVal1IDTerminalRuleCall_1_0_0_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_1_0_1() { return cVal2Assignment_1_0_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_1_0_1_0() { return cVal2IDTerminalRuleCall_1_0_1_0; }
		
		//"kw" val1+=ID ("," val1+=ID)* val3=ID
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw"
		public Keyword getKwKeyword_1_1_0() { return cKwKeyword_1_1_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_1_1() { return cVal1Assignment_1_1_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_1_0() { return cVal1IDTerminalRuleCall_1_1_1_0; }
		
		//("," val1+=ID)*
		public Group getGroup_1_1_2() { return cGroup_1_1_2; }
		
		//","
		public Keyword getCommaKeyword_1_1_2_0() { return cCommaKeyword_1_1_2_0; }
		
		//val1+=ID
		public Assignment getVal1Assignment_1_1_2_1() { return cVal1Assignment_1_1_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_1_2_1_0() { return cVal1IDTerminalRuleCall_1_1_2_1_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_1_1_3() { return cVal3Assignment_1_1_3; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_1_1_3_0() { return cVal3IDTerminalRuleCall_1_1_3_0; }
	}
	public class SingleKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cValAlternatives_1_0 = (Alternatives)cValAssignment_1.eContents().get(0);
		private final Keyword cValKw1Keyword_1_0_0 = (Keyword)cValAlternatives_1_0.eContents().get(0);
		private final Keyword cValKw2Keyword_1_0_1 = (Keyword)cValAlternatives_1_0.eContents().get(1);
		private final Keyword cValKw3Keyword_1_0_2 = (Keyword)cValAlternatives_1_0.eContents().get(2);
		
		//SingleKeywords:
		//    "#10" val=("kw1" | "kw2" | "kw3");
		@Override public ParserRule getRule() { return rule; }
		
		//"#10" val=("kw1" | "kw2" | "kw3")
		public Group getGroup() { return cGroup; }
		
		//"#10"
		public Keyword getNumberSignDigitOneDigitZeroKeyword_0() { return cNumberSignDigitOneDigitZeroKeyword_0; }
		
		//val=("kw1" | "kw2" | "kw3")
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//("kw1" | "kw2" | "kw3")
		public Alternatives getValAlternatives_1_0() { return cValAlternatives_1_0; }
		
		//"kw1"
		public Keyword getValKw1Keyword_1_0_0() { return cValKw1Keyword_1_0_0; }
		
		//"kw2"
		public Keyword getValKw2Keyword_1_0_1() { return cValKw2Keyword_1_0_1; }
		
		//"kw3"
		public Keyword getValKw3Keyword_1_0_2() { return cValKw3Keyword_1_0_2; }
	}
	public class SingleKeywordsOrIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleKeywordsOrID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cValAlternatives_1_0 = (Alternatives)cValAssignment_1.eContents().get(0);
		private final Keyword cValKw1Keyword_1_0_0 = (Keyword)cValAlternatives_1_0.eContents().get(0);
		private final Keyword cValKw2Keyword_1_0_1 = (Keyword)cValAlternatives_1_0.eContents().get(1);
		private final Keyword cValKw3Keyword_1_0_2 = (Keyword)cValAlternatives_1_0.eContents().get(2);
		private final RuleCall cValIDTerminalRuleCall_1_0_3 = (RuleCall)cValAlternatives_1_0.eContents().get(3);
		
		//SingleKeywordsOrID:
		//    "#11" val=("kw1" | "kw2" | "kw3" | ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#11" val=("kw1" | "kw2" | "kw3" | ID)
		public Group getGroup() { return cGroup; }
		
		//"#11"
		public Keyword getNumberSignDigitOneDigitOneKeyword_0() { return cNumberSignDigitOneDigitOneKeyword_0; }
		
		//val=("kw1" | "kw2" | "kw3" | ID)
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//("kw1" | "kw2" | "kw3" | ID)
		public Alternatives getValAlternatives_1_0() { return cValAlternatives_1_0; }
		
		//"kw1"
		public Keyword getValKw1Keyword_1_0_0() { return cValKw1Keyword_1_0_0; }
		
		//"kw2"
		public Keyword getValKw2Keyword_1_0_1() { return cValKw2Keyword_1_0_1; }
		
		//"kw3"
		public Keyword getValKw3Keyword_1_0_2() { return cValKw3Keyword_1_0_2; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0_3() { return cValIDTerminalRuleCall_1_0_3; }
	}
	public class SingleTerminalsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleTerminals");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cValAlternatives_1_0 = (Alternatives)cValAssignment_1.eContents().get(0);
		private final RuleCall cValID1TerminalRuleCall_1_0_0 = (RuleCall)cValAlternatives_1_0.eContents().get(0);
		private final RuleCall cValID2TerminalRuleCall_1_0_1 = (RuleCall)cValAlternatives_1_0.eContents().get(1);
		
		//SingleTerminals:
		//    "#12" val=(ID1 | ID2);
		@Override public ParserRule getRule() { return rule; }
		
		//"#12" val=(ID1 | ID2)
		public Group getGroup() { return cGroup; }
		
		//"#12"
		public Keyword getNumberSignDigitOneDigitTwoKeyword_0() { return cNumberSignDigitOneDigitTwoKeyword_0; }
		
		//val=(ID1 | ID2)
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//(ID1 | ID2)
		public Alternatives getValAlternatives_1_0() { return cValAlternatives_1_0; }
		
		//ID1
		public RuleCall getValID1TerminalRuleCall_1_0_0() { return cValID1TerminalRuleCall_1_0_0; }
		
		//ID2
		public RuleCall getValID2TerminalRuleCall_1_0_1() { return cValID2TerminalRuleCall_1_0_1; }
	}
	public class SingleEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cValAlternatives_1_0 = (Alternatives)cValAssignment_1.eContents().get(0);
		private final RuleCall cValDefEnum1EnumRuleCall_1_0_0 = (RuleCall)cValAlternatives_1_0.eContents().get(0);
		private final RuleCall cValDefEnum2EnumRuleCall_1_0_1 = (RuleCall)cValAlternatives_1_0.eContents().get(1);
		private final RuleCall cValDefEnum3EnumRuleCall_1_0_2 = (RuleCall)cValAlternatives_1_0.eContents().get(2);
		
		//SingleEnum:
		//    "#13" val=(DefEnum1 | DefEnum2 | DefEnum3);
		@Override public ParserRule getRule() { return rule; }
		
		//"#13" val=(DefEnum1 | DefEnum2 | DefEnum3)
		public Group getGroup() { return cGroup; }
		
		//"#13"
		public Keyword getNumberSignDigitOneDigitThreeKeyword_0() { return cNumberSignDigitOneDigitThreeKeyword_0; }
		
		//val=(DefEnum1 | DefEnum2 | DefEnum3)
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//(DefEnum1 | DefEnum2 | DefEnum3)
		public Alternatives getValAlternatives_1_0() { return cValAlternatives_1_0; }
		
		//DefEnum1
		public RuleCall getValDefEnum1EnumRuleCall_1_0_0() { return cValDefEnum1EnumRuleCall_1_0_0; }
		
		//DefEnum2
		public RuleCall getValDefEnum2EnumRuleCall_1_0_1() { return cValDefEnum2EnumRuleCall_1_0_1; }
		
		//DefEnum3
		public RuleCall getValDefEnum3EnumRuleCall_1_0_2() { return cValDefEnum3EnumRuleCall_1_0_2; }
	}
	public class SingleCrossReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleCrossReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameID1TerminalRuleCall_1_0_0 = (RuleCall)cNameAlternatives_1_0.eContents().get(0);
		private final RuleCall cNameID2TerminalRuleCall_1_0_1 = (RuleCall)cNameAlternatives_1_0.eContents().get(1);
		private final RuleCall cNameID3TerminalRuleCall_1_0_2 = (RuleCall)cNameAlternatives_1_0.eContents().get(2);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cRefAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final CrossReference cRefSingleCrossReferenceCrossReference_2_0_0 = (CrossReference)cRefAssignment_2_0.eContents().get(0);
		private final RuleCall cRefSingleCrossReferenceID1TerminalRuleCall_2_0_0_1 = (RuleCall)cRefSingleCrossReferenceCrossReference_2_0_0.eContents().get(1);
		private final Assignment cRefAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final CrossReference cRefSingleCrossReferenceCrossReference_2_1_0 = (CrossReference)cRefAssignment_2_1.eContents().get(0);
		private final RuleCall cRefSingleCrossReferenceID2TerminalRuleCall_2_1_0_1 = (RuleCall)cRefSingleCrossReferenceCrossReference_2_1_0.eContents().get(1);
		private final Assignment cRefAssignment_2_2 = (Assignment)cAlternatives_2.eContents().get(2);
		private final CrossReference cRefSingleCrossReferenceCrossReference_2_2_0 = (CrossReference)cRefAssignment_2_2.eContents().get(0);
		private final RuleCall cRefSingleCrossReferenceID3TerminalRuleCall_2_2_0_1 = (RuleCall)cRefSingleCrossReferenceCrossReference_2_2_0.eContents().get(1);
		
		//SingleCrossReference:
		//    "#14" name=(ID1 | ID2 | ID3) (ref=[SingleCrossReference|ID1] | ref=[SingleCrossReference|ID2] |
		//    ref=[SingleCrossReference|ID3]);
		@Override public ParserRule getRule() { return rule; }
		
		//"#14" name=(ID1 | ID2 | ID3) (ref=[SingleCrossReference|ID1] | ref=[SingleCrossReference|ID2] |
		//ref=[SingleCrossReference|ID3])
		public Group getGroup() { return cGroup; }
		
		//"#14"
		public Keyword getNumberSignDigitOneDigitFourKeyword_0() { return cNumberSignDigitOneDigitFourKeyword_0; }
		
		//name=(ID1 | ID2 | ID3)
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//(ID1 | ID2 | ID3)
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }
		
		//ID1
		public RuleCall getNameID1TerminalRuleCall_1_0_0() { return cNameID1TerminalRuleCall_1_0_0; }
		
		//ID2
		public RuleCall getNameID2TerminalRuleCall_1_0_1() { return cNameID2TerminalRuleCall_1_0_1; }
		
		//ID3
		public RuleCall getNameID3TerminalRuleCall_1_0_2() { return cNameID3TerminalRuleCall_1_0_2; }
		
		//(ref=[SingleCrossReference|ID1] | ref=[SingleCrossReference|ID2] |
		//   ref=[SingleCrossReference|ID3])
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//ref=[SingleCrossReference|ID1]
		public Assignment getRefAssignment_2_0() { return cRefAssignment_2_0; }
		
		//[SingleCrossReference|ID1]
		public CrossReference getRefSingleCrossReferenceCrossReference_2_0_0() { return cRefSingleCrossReferenceCrossReference_2_0_0; }
		
		//ID1
		public RuleCall getRefSingleCrossReferenceID1TerminalRuleCall_2_0_0_1() { return cRefSingleCrossReferenceID1TerminalRuleCall_2_0_0_1; }
		
		//ref=[SingleCrossReference|ID2]
		public Assignment getRefAssignment_2_1() { return cRefAssignment_2_1; }
		
		//[SingleCrossReference|ID2]
		public CrossReference getRefSingleCrossReferenceCrossReference_2_1_0() { return cRefSingleCrossReferenceCrossReference_2_1_0; }
		
		//ID2
		public RuleCall getRefSingleCrossReferenceID2TerminalRuleCall_2_1_0_1() { return cRefSingleCrossReferenceID2TerminalRuleCall_2_1_0_1; }
		
		//ref=[SingleCrossReference|ID3]
		public Assignment getRefAssignment_2_2() { return cRefAssignment_2_2; }
		
		//[SingleCrossReference|ID3]
		public CrossReference getRefSingleCrossReferenceCrossReference_2_2_0() { return cRefSingleCrossReferenceCrossReference_2_2_0; }
		
		//ID3
		public RuleCall getRefSingleCrossReferenceID3TerminalRuleCall_2_2_0_1() { return cRefSingleCrossReferenceID3TerminalRuleCall_2_2_0_1; }
	}
	public class SingleContainmentReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cChildAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cChildAlternatives_1_0 = (Alternatives)cChildAssignment_1.eContents().get(0);
		private final RuleCall cChildSingleContainmentReferenceChild1ParserRuleCall_1_0_0 = (RuleCall)cChildAlternatives_1_0.eContents().get(0);
		private final RuleCall cChildSingleContainmentReferenceChild2ParserRuleCall_1_0_1 = (RuleCall)cChildAlternatives_1_0.eContents().get(1);
		private final RuleCall cChildSingleContainmentReferenceChild3ParserRuleCall_1_0_2 = (RuleCall)cChildAlternatives_1_0.eContents().get(2);
		
		//SingleContainmentReference:
		//    "#15" child=(SingleContainmentReferenceChild1 | SingleContainmentReferenceChild2 | SingleContainmentReferenceChild3);
		@Override public ParserRule getRule() { return rule; }
		
		//"#15" child=(SingleContainmentReferenceChild1 | SingleContainmentReferenceChild2 | SingleContainmentReferenceChild3)
		public Group getGroup() { return cGroup; }
		
		//"#15"
		public Keyword getNumberSignDigitOneDigitFiveKeyword_0() { return cNumberSignDigitOneDigitFiveKeyword_0; }
		
		//child=(SingleContainmentReferenceChild1 | SingleContainmentReferenceChild2 | SingleContainmentReferenceChild3)
		public Assignment getChildAssignment_1() { return cChildAssignment_1; }
		
		//(SingleContainmentReferenceChild1 | SingleContainmentReferenceChild2 | SingleContainmentReferenceChild3)
		public Alternatives getChildAlternatives_1_0() { return cChildAlternatives_1_0; }
		
		//SingleContainmentReferenceChild1
		public RuleCall getChildSingleContainmentReferenceChild1ParserRuleCall_1_0_0() { return cChildSingleContainmentReferenceChild1ParserRuleCall_1_0_0; }
		
		//SingleContainmentReferenceChild2
		public RuleCall getChildSingleContainmentReferenceChild2ParserRuleCall_1_0_1() { return cChildSingleContainmentReferenceChild2ParserRuleCall_1_0_1; }
		
		//SingleContainmentReferenceChild3
		public RuleCall getChildSingleContainmentReferenceChild3ParserRuleCall_1_0_2() { return cChildSingleContainmentReferenceChild3ParserRuleCall_1_0_2; }
	}
	public class SingleContainmentReferenceChild1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReferenceChild1");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValKw1Keyword_0 = (Keyword)cValAssignment.eContents().get(0);
		
		//SingleContainmentReferenceChild1:
		//    val='kw1';
		@Override public ParserRule getRule() { return rule; }
		
		//val='kw1'
		public Assignment getValAssignment() { return cValAssignment; }
		
		//'kw1'
		public Keyword getValKw1Keyword_0() { return cValKw1Keyword_0; }
	}
	public class SingleContainmentReferenceChild2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReferenceChild2");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValKw2Keyword_0 = (Keyword)cValAssignment.eContents().get(0);
		
		//SingleContainmentReferenceChild2:
		//    val='kw2';
		@Override public ParserRule getRule() { return rule; }
		
		//val='kw2'
		public Assignment getValAssignment() { return cValAssignment; }
		
		//'kw2'
		public Keyword getValKw2Keyword_0() { return cValKw2Keyword_0; }
	}
	public class SingleContainmentReferenceChild3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.SingleContainmentReferenceChild3");
		private final Assignment cValAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cValKw3Keyword_0 = (Keyword)cValAssignment.eContents().get(0);
		
		//SingleContainmentReferenceChild3:
		//    val='kw3';
		@Override public ParserRule getRule() { return rule; }
		
		//val='kw3'
		public Assignment getValAssignment() { return cValAssignment; }
		
		//'kw3'
		public Keyword getValKw3Keyword_0() { return cValKw3Keyword_0; }
	}
	public class MultiKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.MultiKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitSixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cValAlternatives_1_0 = (Alternatives)cValAssignment_1.eContents().get(0);
		private final Keyword cValKw1Keyword_1_0_0 = (Keyword)cValAlternatives_1_0.eContents().get(0);
		private final Keyword cValKw2Keyword_1_0_1 = (Keyword)cValAlternatives_1_0.eContents().get(1);
		private final Keyword cValKw3Keyword_1_0_2 = (Keyword)cValAlternatives_1_0.eContents().get(2);
		
		//MultiKeywords:
		//    "#16" val+=("kw1" | "kw2" | "kw3");
		@Override public ParserRule getRule() { return rule; }
		
		//"#16" val+=("kw1" | "kw2" | "kw3")
		public Group getGroup() { return cGroup; }
		
		//"#16"
		public Keyword getNumberSignDigitOneDigitSixKeyword_0() { return cNumberSignDigitOneDigitSixKeyword_0; }
		
		//val+=("kw1" | "kw2" | "kw3")
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//("kw1" | "kw2" | "kw3")
		public Alternatives getValAlternatives_1_0() { return cValAlternatives_1_0; }
		
		//"kw1"
		public Keyword getValKw1Keyword_1_0_0() { return cValKw1Keyword_1_0_0; }
		
		//"kw2"
		public Keyword getValKw2Keyword_1_0_1() { return cValKw2Keyword_1_0_1; }
		
		//"kw3"
		public Keyword getValKw3Keyword_1_0_2() { return cValKw3Keyword_1_0_2; }
	}
	public class MultiKeywordsOrIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.MultiKeywordsOrID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitSevenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cValAlternatives_1_0 = (Alternatives)cValAssignment_1.eContents().get(0);
		private final Keyword cValKw1Keyword_1_0_0 = (Keyword)cValAlternatives_1_0.eContents().get(0);
		private final Keyword cValKw2Keyword_1_0_1 = (Keyword)cValAlternatives_1_0.eContents().get(1);
		private final Keyword cValKw3Keyword_1_0_2 = (Keyword)cValAlternatives_1_0.eContents().get(2);
		private final RuleCall cValIDTerminalRuleCall_1_0_3 = (RuleCall)cValAlternatives_1_0.eContents().get(3);
		
		//MultiKeywordsOrID:
		//    "#17" val+=("kw1" | "kw2" | "kw3" | ID);
		@Override public ParserRule getRule() { return rule; }
		
		//"#17" val+=("kw1" | "kw2" | "kw3" | ID)
		public Group getGroup() { return cGroup; }
		
		//"#17"
		public Keyword getNumberSignDigitOneDigitSevenKeyword_0() { return cNumberSignDigitOneDigitSevenKeyword_0; }
		
		//val+=("kw1" | "kw2" | "kw3" | ID)
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//("kw1" | "kw2" | "kw3" | ID)
		public Alternatives getValAlternatives_1_0() { return cValAlternatives_1_0; }
		
		//"kw1"
		public Keyword getValKw1Keyword_1_0_0() { return cValKw1Keyword_1_0_0; }
		
		//"kw2"
		public Keyword getValKw2Keyword_1_0_1() { return cValKw2Keyword_1_0_1; }
		
		//"kw3"
		public Keyword getValKw3Keyword_1_0_2() { return cValKw3Keyword_1_0_2; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0_3() { return cValIDTerminalRuleCall_1_0_3; }
	}
	public class MultiTerminalsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.MultiTerminals");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitEightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cValAlternatives_1_0 = (Alternatives)cValAssignment_1.eContents().get(0);
		private final RuleCall cValID1TerminalRuleCall_1_0_0 = (RuleCall)cValAlternatives_1_0.eContents().get(0);
		private final RuleCall cValID2TerminalRuleCall_1_0_1 = (RuleCall)cValAlternatives_1_0.eContents().get(1);
		
		//MultiTerminals:
		//    "#18" val+=(ID1 | ID2);
		@Override public ParserRule getRule() { return rule; }
		
		//"#18" val+=(ID1 | ID2)
		public Group getGroup() { return cGroup; }
		
		//"#18"
		public Keyword getNumberSignDigitOneDigitEightKeyword_0() { return cNumberSignDigitOneDigitEightKeyword_0; }
		
		//val+=(ID1 | ID2)
		public Assignment getValAssignment_1() { return cValAssignment_1; }
		
		//(ID1 | ID2)
		public Alternatives getValAlternatives_1_0() { return cValAlternatives_1_0; }
		
		//ID1
		public RuleCall getValID1TerminalRuleCall_1_0_0() { return cValID1TerminalRuleCall_1_0_0; }
		
		//ID2
		public RuleCall getValID2TerminalRuleCall_1_0_1() { return cValID2TerminalRuleCall_1_0_1; }
	}
	public class DependentAlternative1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.DependentAlternative1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneDigitNineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cValIDTerminalRuleCall_1_0_0 = (RuleCall)cValAssignment_1_0.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cValAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cValIDTerminalRuleCall_1_1_0_0 = (RuleCall)cValAssignment_1_1_0.eContents().get(0);
		private final Assignment cFlagAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final Keyword cFlagKw1Keyword_1_1_1_0 = (Keyword)cFlagAssignment_1_1_1.eContents().get(0);
		
		//DependentAlternative1:
		//    "#19" (val=ID | val=ID flag?="kw1");
		@Override public ParserRule getRule() { return rule; }
		
		//"#19" (val=ID | val=ID flag?="kw1")
		public Group getGroup() { return cGroup; }
		
		//"#19"
		public Keyword getNumberSignDigitOneDigitNineKeyword_0() { return cNumberSignDigitOneDigitNineKeyword_0; }
		
		//(val=ID | val=ID flag?="kw1")
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val=ID
		public Assignment getValAssignment_1_0() { return cValAssignment_1_0; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0_0() { return cValIDTerminalRuleCall_1_0_0; }
		
		//val=ID flag?="kw1"
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//val=ID
		public Assignment getValAssignment_1_1_0() { return cValAssignment_1_1_0; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_1_0_0() { return cValIDTerminalRuleCall_1_1_0_0; }
		
		//flag?="kw1"
		public Assignment getFlagAssignment_1_1_1() { return cFlagAssignment_1_1_1; }
		
		//"kw1"
		public Keyword getFlagKw1Keyword_1_1_1_0() { return cFlagKw1Keyword_1_1_1_0; }
	}
	public class DependentAlternative2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.DependentAlternative2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitZeroKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Assignment cValAssignment_1_0_0 = (Assignment)cGroup_1_0.eContents().get(0);
		private final RuleCall cValIDTerminalRuleCall_1_0_0_0 = (RuleCall)cValAssignment_1_0_0.eContents().get(0);
		private final Assignment cValAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0_1_0 = (RuleCall)cValAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Assignment cValAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cValIDTerminalRuleCall_1_1_0_0 = (RuleCall)cValAssignment_1_1_0.eContents().get(0);
		private final Assignment cFlagAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final Keyword cFlagKw1Keyword_1_1_1_0 = (Keyword)cFlagAssignment_1_1_1.eContents().get(0);
		
		//DependentAlternative2:
		//    "#20" (val+=ID val+=ID+| val+=ID+ flag?="kw1");
		@Override public ParserRule getRule() { return rule; }
		
		//"#20" (val+=ID val+=ID+| val+=ID+ flag?="kw1")
		public Group getGroup() { return cGroup; }
		
		//"#20"
		public Keyword getNumberSignDigitTwoDigitZeroKeyword_0() { return cNumberSignDigitTwoDigitZeroKeyword_0; }
		
		//(val+=ID val+=ID+| val+=ID+ flag?="kw1")
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//val+=ID val+=ID+
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//val+=ID
		public Assignment getValAssignment_1_0_0() { return cValAssignment_1_0_0; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0_0_0() { return cValIDTerminalRuleCall_1_0_0_0; }
		
		//val+=ID+
		public Assignment getValAssignment_1_0_1() { return cValAssignment_1_0_1; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_0_1_0() { return cValIDTerminalRuleCall_1_0_1_0; }
		
		//val+=ID+ flag?="kw1"
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//val+=ID+
		public Assignment getValAssignment_1_1_0() { return cValAssignment_1_1_0; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_1_1_0_0() { return cValIDTerminalRuleCall_1_1_0_0; }
		
		//flag?="kw1"
		public Assignment getFlagAssignment_1_1_1() { return cFlagAssignment_1_1_1; }
		
		//"kw1"
		public Keyword getFlagKw1Keyword_1_1_1_0() { return cFlagKw1Keyword_1_1_1_0; }
	}
	public class OptionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.Optional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInt0Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInt0INTTerminalRuleCall_1_0 = (RuleCall)cInt0Assignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cInt1Assignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cInt1INTTerminalRuleCall_2_0_0 = (RuleCall)cInt1Assignment_2_0.eContents().get(0);
		private final Assignment cInt2Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cInt2INTTerminalRuleCall_2_1_0 = (RuleCall)cInt2Assignment_2_1.eContents().get(0);
		
		//Optional:
		//    "#21" int0=INT (int1=INT int2=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#21" int0=INT (int1=INT int2=INT)?
		public Group getGroup() { return cGroup; }
		
		//"#21"
		public Keyword getNumberSignDigitTwoDigitOneKeyword_0() { return cNumberSignDigitTwoDigitOneKeyword_0; }
		
		//int0=INT
		public Assignment getInt0Assignment_1() { return cInt0Assignment_1; }
		
		//INT
		public RuleCall getInt0INTTerminalRuleCall_1_0() { return cInt0INTTerminalRuleCall_1_0; }
		
		//(int1=INT int2=INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//int1=INT
		public Assignment getInt1Assignment_2_0() { return cInt1Assignment_2_0; }
		
		//INT
		public RuleCall getInt1INTTerminalRuleCall_2_0_0() { return cInt1INTTerminalRuleCall_2_0_0; }
		
		//int2=INT
		public Assignment getInt2Assignment_2_1() { return cInt2Assignment_2_1; }
		
		//INT
		public RuleCall getInt2INTTerminalRuleCall_2_1_0() { return cInt2INTTerminalRuleCall_2_1_0; }
	}
	public class FloatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.Float");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cFloatAction_1 = (Action)cGroup.eContents().get(1);
		private final Keyword cByeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Float:
		//    "#22" {Float} 'Bye';
		@Override public ParserRule getRule() { return rule; }
		
		//"#22" {Float} 'Bye'
		public Group getGroup() { return cGroup; }
		
		//"#22"
		public Keyword getNumberSignDigitTwoDigitTwoKeyword_0() { return cNumberSignDigitTwoDigitTwoKeyword_0; }
		
		//{Float}
		public Action getFloatAction_1() { return cFloatAction_1; }
		
		//'Bye'
		public Keyword getByeKeyword_2() { return cByeKeyword_2; }
	}
	public class UnorderedAlternativeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedAlternative");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cUnorderedAlternativeAction_1 = (Action)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cVal1Assignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_2_0_0 = (RuleCall)cVal1Assignment_2_0.eContents().get(0);
		private final Assignment cVal2Assignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cVal2INTTerminalRuleCall_2_1_0 = (RuleCall)cVal2Assignment_2_1.eContents().get(0);
		private final Assignment cVal3Assignment_2_2 = (Assignment)cAlternatives_2.eContents().get(2);
		private final RuleCall cVal3UnorderedAlternativeValParserRuleCall_2_2_0 = (RuleCall)cVal3Assignment_2_2.eContents().get(0);
		private final Assignment cVal4Assignment_2_3 = (Assignment)cAlternatives_2.eContents().get(3);
		private final RuleCall cVal4UnorderedAlternativeValDelegateParserRuleCall_2_3_0 = (RuleCall)cVal4Assignment_2_3.eContents().get(0);
		
		//UnorderedAlternative:
		//    "#23" {UnorderedAlternative} (val1+=ID | val2+=INT | val3+=UnorderedAlternativeVal | val4+=UnorderedAlternativeValDelegate)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"#23" {UnorderedAlternative} (val1+=ID | val2+=INT | val3+=UnorderedAlternativeVal | val4+=UnorderedAlternativeValDelegate)*
		public Group getGroup() { return cGroup; }
		
		//"#23"
		public Keyword getNumberSignDigitTwoDigitThreeKeyword_0() { return cNumberSignDigitTwoDigitThreeKeyword_0; }
		
		//{UnorderedAlternative}
		public Action getUnorderedAlternativeAction_1() { return cUnorderedAlternativeAction_1; }
		
		//(val1+=ID | val2+=INT | val3+=UnorderedAlternativeVal | val4+=UnorderedAlternativeValDelegate)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//val1+=ID
		public Assignment getVal1Assignment_2_0() { return cVal1Assignment_2_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_0_0() { return cVal1IDTerminalRuleCall_2_0_0; }
		
		//val2+=INT
		public Assignment getVal2Assignment_2_1() { return cVal2Assignment_2_1; }
		
		//INT
		public RuleCall getVal2INTTerminalRuleCall_2_1_0() { return cVal2INTTerminalRuleCall_2_1_0; }
		
		//val3+=UnorderedAlternativeVal
		public Assignment getVal3Assignment_2_2() { return cVal3Assignment_2_2; }
		
		//UnorderedAlternativeVal
		public RuleCall getVal3UnorderedAlternativeValParserRuleCall_2_2_0() { return cVal3UnorderedAlternativeValParserRuleCall_2_2_0; }
		
		//val4+=UnorderedAlternativeValDelegate
		public Assignment getVal4Assignment_2_3() { return cVal4Assignment_2_3; }
		
		//UnorderedAlternativeValDelegate
		public RuleCall getVal4UnorderedAlternativeValDelegateParserRuleCall_2_3_0() { return cVal4UnorderedAlternativeValDelegateParserRuleCall_2_3_0; }
	}
	public class UnorderedAlternativeValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedAlternativeVal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//UnorderedAlternativeVal:
		//    "kw1" val=ID;
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
	public class UnorderedAlternativeValDelegateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedAlternativeValDelegate");
		private final RuleCall cUnorderedAlternativeVal2ParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//UnorderedAlternativeValDelegate:
		//    UnorderedAlternativeVal2;
		@Override public ParserRule getRule() { return rule; }
		
		//UnorderedAlternativeVal2
		public RuleCall getUnorderedAlternativeVal2ParserRuleCall() { return cUnorderedAlternativeVal2ParserRuleCall; }
	}
	public class UnorderedAlternativeVal2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedAlternativeVal2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//UnorderedAlternativeVal2:
		//    "kw2" val=ID;
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
	public class UnorderedGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_1 = (UnorderedGroup)cGroup.eContents().get(1);
		private final Assignment cVal1Assignment_1_0 = (Assignment)cUnorderedGroup_1.eContents().get(0);
		private final RuleCall cVal1IDTerminalRuleCall_1_0_0 = (RuleCall)cVal1Assignment_1_0.eContents().get(0);
		private final Assignment cVal2Assignment_1_1 = (Assignment)cUnorderedGroup_1.eContents().get(1);
		private final RuleCall cVal2INTTerminalRuleCall_1_1_0 = (RuleCall)cVal2Assignment_1_1.eContents().get(0);
		private final Assignment cVal3Assignment_1_2 = (Assignment)cUnorderedGroup_1.eContents().get(2);
		private final RuleCall cVal3UnorderedGroupValParserRuleCall_1_2_0 = (RuleCall)cVal3Assignment_1_2.eContents().get(0);
		private final Assignment cVal4Assignment_1_3 = (Assignment)cUnorderedGroup_1.eContents().get(3);
		private final RuleCall cVal4UnorderedGroupValDelegateParserRuleCall_1_3_0 = (RuleCall)cVal4Assignment_1_3.eContents().get(0);
		
		//UnorderedGroup:
		//    "#24" (val1=ID & val2=INT & val3=UnorderedGroupVal & val4=UnorderedGroupValDelegate);
		@Override public ParserRule getRule() { return rule; }
		
		//"#24" (val1=ID & val2=INT & val3=UnorderedGroupVal & val4=UnorderedGroupValDelegate)
		public Group getGroup() { return cGroup; }
		
		//"#24"
		public Keyword getNumberSignDigitTwoDigitFourKeyword_0() { return cNumberSignDigitTwoDigitFourKeyword_0; }
		
		//(val1=ID & val2=INT & val3=UnorderedGroupVal & val4=UnorderedGroupValDelegate)
		public UnorderedGroup getUnorderedGroup_1() { return cUnorderedGroup_1; }
		
		//val1=ID
		public Assignment getVal1Assignment_1_0() { return cVal1Assignment_1_0; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0_0() { return cVal1IDTerminalRuleCall_1_0_0; }
		
		//val2=INT
		public Assignment getVal2Assignment_1_1() { return cVal2Assignment_1_1; }
		
		//INT
		public RuleCall getVal2INTTerminalRuleCall_1_1_0() { return cVal2INTTerminalRuleCall_1_1_0; }
		
		//val3=UnorderedGroupVal
		public Assignment getVal3Assignment_1_2() { return cVal3Assignment_1_2; }
		
		//UnorderedGroupVal
		public RuleCall getVal3UnorderedGroupValParserRuleCall_1_2_0() { return cVal3UnorderedGroupValParserRuleCall_1_2_0; }
		
		//val4=UnorderedGroupValDelegate
		public Assignment getVal4Assignment_1_3() { return cVal4Assignment_1_3; }
		
		//UnorderedGroupValDelegate
		public RuleCall getVal4UnorderedGroupValDelegateParserRuleCall_1_3_0() { return cVal4UnorderedGroupValDelegateParserRuleCall_1_3_0; }
	}
	public class UnorderedGroupValElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupVal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw1Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//UnorderedGroupVal:
		//    "kw1" val=ID;
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
	public class UnorderedGroupValDelegateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupValDelegate");
		private final RuleCall cUnorderedGroupVal2ParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//UnorderedGroupValDelegate:
		//    UnorderedGroupVal2;
		@Override public ParserRule getRule() { return rule; }
		
		//UnorderedGroupVal2
		public RuleCall getUnorderedGroupVal2ParserRuleCall() { return cUnorderedGroupVal2ParserRuleCall; }
	}
	public class UnorderedGroupVal2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupVal2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKw2Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValIDTerminalRuleCall_1_0 = (RuleCall)cValAssignment_1.eContents().get(0);
		
		//UnorderedGroupVal2:
		//    "kw2" val=ID;
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
	public class UnorderedGroupOptionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupOptional");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cUnorderedGroupOptionalAction_1 = (Action)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cKw1Keyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cVal1Assignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_0_1_0 = (RuleCall)cVal1Assignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cKw2Keyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cVa2Assignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cVa2IDTerminalRuleCall_2_1_1_0 = (RuleCall)cVa2Assignment_2_1_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cUnorderedGroup_2.eContents().get(2);
		private final Keyword cKw3Keyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cVal3Assignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_2_2_1_0 = (RuleCall)cVal3Assignment_2_2_1.eContents().get(0);
		
		//UnorderedGroupOptional:
		//    "#25" {UnorderedGroupOptional} (("kw1" val1=ID)? & ("kw2" va2=ID)? & ("kw3" val3=ID)?);
		@Override public ParserRule getRule() { return rule; }
		
		//"#25" {UnorderedGroupOptional} (("kw1" val1=ID)? & ("kw2" va2=ID)? & ("kw3" val3=ID)?)
		public Group getGroup() { return cGroup; }
		
		//"#25"
		public Keyword getNumberSignDigitTwoDigitFiveKeyword_0() { return cNumberSignDigitTwoDigitFiveKeyword_0; }
		
		//{UnorderedGroupOptional}
		public Action getUnorderedGroupOptionalAction_1() { return cUnorderedGroupOptionalAction_1; }
		
		//(("kw1" val1=ID)? & ("kw2" va2=ID)? & ("kw3" val3=ID)?)
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//("kw1" val1=ID)?
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_2_0_0() { return cKw1Keyword_2_0_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_2_0_1() { return cVal1Assignment_2_0_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_0_1_0() { return cVal1IDTerminalRuleCall_2_0_1_0; }
		
		//("kw2" va2=ID)?
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//"kw2"
		public Keyword getKw2Keyword_2_1_0() { return cKw2Keyword_2_1_0; }
		
		//va2=ID
		public Assignment getVa2Assignment_2_1_1() { return cVa2Assignment_2_1_1; }
		
		//ID
		public RuleCall getVa2IDTerminalRuleCall_2_1_1_0() { return cVa2IDTerminalRuleCall_2_1_1_0; }
		
		//("kw3" val3=ID)?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//"kw3"
		public Keyword getKw3Keyword_2_2_0() { return cKw3Keyword_2_2_0; }
		
		//val3=ID
		public Assignment getVal3Assignment_2_2_1() { return cVal3Assignment_2_2_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_2_2_1_0() { return cVal3IDTerminalRuleCall_2_2_1_0; }
	}
	public class UnorderedGroupBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.UnorderedGroupBoolean");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitSixKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cUnorderedGroupBooleanAction_1 = (Action)cGroup.eContents().get(1);
		private final UnorderedGroup cUnorderedGroup_2 = (UnorderedGroup)cGroup.eContents().get(2);
		private final Assignment cVal1Assignment_2_0 = (Assignment)cUnorderedGroup_2.eContents().get(0);
		private final Keyword cVal1Kw1Keyword_2_0_0 = (Keyword)cVal1Assignment_2_0.eContents().get(0);
		private final Assignment cVal2Assignment_2_1 = (Assignment)cUnorderedGroup_2.eContents().get(1);
		private final Keyword cVal2Kw2Keyword_2_1_0 = (Keyword)cVal2Assignment_2_1.eContents().get(0);
		private final Assignment cVal3Assignment_2_2 = (Assignment)cUnorderedGroup_2.eContents().get(2);
		private final Keyword cVal3Kw3Keyword_2_2_0 = (Keyword)cVal3Assignment_2_2.eContents().get(0);
		
		//UnorderedGroupBoolean:
		//    '#26' {UnorderedGroupBoolean} (val1?='kw1'?  & val2?='kw2'? & val3?='kw3'?);
		@Override public ParserRule getRule() { return rule; }
		
		//'#26' {UnorderedGroupBoolean} (val1?='kw1'?  & val2?='kw2'? & val3?='kw3'?)
		public Group getGroup() { return cGroup; }
		
		//'#26'
		public Keyword getNumberSignDigitTwoDigitSixKeyword_0() { return cNumberSignDigitTwoDigitSixKeyword_0; }
		
		//{UnorderedGroupBoolean}
		public Action getUnorderedGroupBooleanAction_1() { return cUnorderedGroupBooleanAction_1; }
		
		//(val1?='kw1'?  & val2?='kw2'? & val3?='kw3'?)
		public UnorderedGroup getUnorderedGroup_2() { return cUnorderedGroup_2; }
		
		//val1?='kw1'?
		public Assignment getVal1Assignment_2_0() { return cVal1Assignment_2_0; }
		
		//'kw1'
		public Keyword getVal1Kw1Keyword_2_0_0() { return cVal1Kw1Keyword_2_0_0; }
		
		//val2?='kw2'?
		public Assignment getVal2Assignment_2_1() { return cVal2Assignment_2_1; }
		
		//'kw2'
		public Keyword getVal2Kw2Keyword_2_1_0() { return cVal2Kw2Keyword_2_1_0; }
		
		//val3?='kw3'?
		public Assignment getVal3Assignment_2_2() { return cVal3Assignment_2_2; }
		
		//'kw3'
		public Keyword getVal3Kw3Keyword_2_2_0() { return cVal3Kw3Keyword_2_2_0; }
	}
	public class Complex1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.Complex1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitSevenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cComplex1Action_1 = (Action)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cKw1Keyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVal1Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_2_1_0 = (RuleCall)cVal1Assignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cKw2Keyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cVal2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cVal2IDTerminalRuleCall_3_1_0 = (RuleCall)cVal2Assignment_3_1.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Keyword cKw3Keyword_4_0_0 = (Keyword)cGroup_4_0.eContents().get(0);
		private final Assignment cVal3Assignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final RuleCall cVal3IDTerminalRuleCall_4_0_1_0 = (RuleCall)cVal3Assignment_4_0_1.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cAlternatives_4.eContents().get(1);
		private final Keyword cKw4Keyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cVal4Assignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cVal4IDTerminalRuleCall_4_1_1_0 = (RuleCall)cVal4Assignment_4_1_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cAlternatives_4.eContents().get(2);
		private final Keyword cKw5Keyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cVal5Assignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cVal5IDTerminalRuleCall_4_2_1_0 = (RuleCall)cVal5Assignment_4_2_1.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cAlternatives_4.eContents().get(3);
		private final Keyword cKw6Keyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cVal6Assignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cVal6IDTerminalRuleCall_4_3_1_0 = (RuleCall)cVal6Assignment_4_3_1.eContents().get(0);
		
		//Complex1:
		//    '#27' {Complex1} ("kw1" val1=ID)? ("kw2" val2=ID)? (("kw3" val3+=ID) | ("kw4" val4+=ID) | ("kw5" val5+=ID) | ("kw6" val6+=ID))*;
		@Override public ParserRule getRule() { return rule; }
		
		//'#27' {Complex1} ("kw1" val1=ID)? ("kw2" val2=ID)? (("kw3" val3+=ID) | ("kw4" val4+=ID) | ("kw5" val5+=ID) | ("kw6" val6+=ID))*
		public Group getGroup() { return cGroup; }
		
		//'#27'
		public Keyword getNumberSignDigitTwoDigitSevenKeyword_0() { return cNumberSignDigitTwoDigitSevenKeyword_0; }
		
		//{Complex1}
		public Action getComplex1Action_1() { return cComplex1Action_1; }
		
		//("kw1" val1=ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//"kw1"
		public Keyword getKw1Keyword_2_0() { return cKw1Keyword_2_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_2_1() { return cVal1Assignment_2_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_2_1_0() { return cVal1IDTerminalRuleCall_2_1_0; }
		
		//("kw2" val2=ID)?
		public Group getGroup_3() { return cGroup_3; }
		
		//"kw2"
		public Keyword getKw2Keyword_3_0() { return cKw2Keyword_3_0; }
		
		//val2=ID
		public Assignment getVal2Assignment_3_1() { return cVal2Assignment_3_1; }
		
		//ID
		public RuleCall getVal2IDTerminalRuleCall_3_1_0() { return cVal2IDTerminalRuleCall_3_1_0; }
		
		//(("kw3" val3+=ID) | ("kw4" val4+=ID) | ("kw5" val5+=ID) | ("kw6" val6+=ID))*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//("kw3" val3+=ID)
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//"kw3"
		public Keyword getKw3Keyword_4_0_0() { return cKw3Keyword_4_0_0; }
		
		//val3+=ID
		public Assignment getVal3Assignment_4_0_1() { return cVal3Assignment_4_0_1; }
		
		//ID
		public RuleCall getVal3IDTerminalRuleCall_4_0_1_0() { return cVal3IDTerminalRuleCall_4_0_1_0; }
		
		//("kw4" val4+=ID)
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//"kw4"
		public Keyword getKw4Keyword_4_1_0() { return cKw4Keyword_4_1_0; }
		
		//val4+=ID
		public Assignment getVal4Assignment_4_1_1() { return cVal4Assignment_4_1_1; }
		
		//ID
		public RuleCall getVal4IDTerminalRuleCall_4_1_1_0() { return cVal4IDTerminalRuleCall_4_1_1_0; }
		
		//("kw5" val5+=ID)
		public Group getGroup_4_2() { return cGroup_4_2; }
		
		//"kw5"
		public Keyword getKw5Keyword_4_2_0() { return cKw5Keyword_4_2_0; }
		
		//val5+=ID
		public Assignment getVal5Assignment_4_2_1() { return cVal5Assignment_4_2_1; }
		
		//ID
		public RuleCall getVal5IDTerminalRuleCall_4_2_1_0() { return cVal5IDTerminalRuleCall_4_2_1_0; }
		
		//("kw6" val6+=ID)
		public Group getGroup_4_3() { return cGroup_4_3; }
		
		//"kw6"
		public Keyword getKw6Keyword_4_3_0() { return cKw6Keyword_4_3_0; }
		
		//val6+=ID
		public Assignment getVal6Assignment_4_3_1() { return cVal6Assignment_4_3_1; }
		
		//ID
		public RuleCall getVal6IDTerminalRuleCall_4_3_1_0() { return cVal6IDTerminalRuleCall_4_3_1_0; }
	}
	public class OptionalDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.OptionalDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitEightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDouble0Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDouble0DOUBLEParserRuleCall_1_0 = (RuleCall)cDouble0Assignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cDouble1Assignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cDouble1DOUBLEParserRuleCall_2_0_0 = (RuleCall)cDouble1Assignment_2_0.eContents().get(0);
		private final Assignment cDouble2Assignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDouble2DOUBLEParserRuleCall_2_1_0 = (RuleCall)cDouble2Assignment_2_1.eContents().get(0);
		
		//OptionalDouble:
		//    "#28" double0=DOUBLE (double1=DOUBLE double2=DOUBLE)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#28" double0=DOUBLE (double1=DOUBLE double2=DOUBLE)?
		public Group getGroup() { return cGroup; }
		
		//"#28"
		public Keyword getNumberSignDigitTwoDigitEightKeyword_0() { return cNumberSignDigitTwoDigitEightKeyword_0; }
		
		//double0=DOUBLE
		public Assignment getDouble0Assignment_1() { return cDouble0Assignment_1; }
		
		//DOUBLE
		public RuleCall getDouble0DOUBLEParserRuleCall_1_0() { return cDouble0DOUBLEParserRuleCall_1_0; }
		
		//(double1=DOUBLE double2=DOUBLE)?
		public Group getGroup_2() { return cGroup_2; }
		
		//double1=DOUBLE
		public Assignment getDouble1Assignment_2_0() { return cDouble1Assignment_2_0; }
		
		//DOUBLE
		public RuleCall getDouble1DOUBLEParserRuleCall_2_0_0() { return cDouble1DOUBLEParserRuleCall_2_0_0; }
		
		//double2=DOUBLE
		public Assignment getDouble2Assignment_2_1() { return cDouble2Assignment_2_1; }
		
		//DOUBLE
		public RuleCall getDouble2DOUBLEParserRuleCall_2_1_0() { return cDouble2DOUBLEParserRuleCall_2_1_0; }
	}
	public class DOUBLEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.DOUBLE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//DOUBLE returns ecore::EDouble:
		//    INT ("." INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//INT ("." INT)?
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//("." INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}
	public class NullValueGeneratedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.NullValueGenerated");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitTwoDigitNineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueNULL_STRINGParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//NullValueGenerated returns NullValue:
		//    "#29" value=NULL_STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//"#29" value=NULL_STRING
		public Group getGroup() { return cGroup; }
		
		//"#29"
		public Keyword getNumberSignDigitTwoDigitNineKeyword_0() { return cNumberSignDigitTwoDigitNineKeyword_0; }
		
		//value=NULL_STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//NULL_STRING
		public RuleCall getValueNULL_STRINGParserRuleCall_1_0() { return cValueNULL_STRINGParserRuleCall_1_0; }
	}
	public class NullValueInterpretedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.NullValueInterpreted");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeDigitZeroKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueNULL_STRINGParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Assignment cFooAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFooIDTerminalRuleCall_2_0 = (RuleCall)cFooAssignment_2.eContents().get(0);
		
		//NullValueInterpreted returns NullValue:
		//    "#30" value=NULL_STRING foo=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#30" value=NULL_STRING foo=ID?
		public Group getGroup() { return cGroup; }
		
		//"#30"
		public Keyword getNumberSignDigitThreeDigitZeroKeyword_0() { return cNumberSignDigitThreeDigitZeroKeyword_0; }
		
		//value=NULL_STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//NULL_STRING
		public RuleCall getValueNULL_STRINGParserRuleCall_1_0() { return cValueNULL_STRINGParserRuleCall_1_0; }
		
		//foo=ID?
		public Assignment getFooAssignment_2() { return cFooAssignment_2; }
		
		//ID
		public RuleCall getFooIDTerminalRuleCall_2_0() { return cFooIDTerminalRuleCall_2_0; }
	}
	public class NULL_STRINGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.NULL_STRING");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NULL_STRING:
		//    STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class NullCrossRefGeneratedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.NullCrossRefGenerated");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefEObjectCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefEObjectIDTerminalRuleCall_1_0_1 = (RuleCall)cRefEObjectCrossReference_1_0.eContents().get(1);
		
		//NullCrossRefGenerated returns NullCrossRef:
		//    "#31" ref=[ecore::EObject|ID];
		@Override public ParserRule getRule() { return rule; }
		
		//"#31" ref=[ecore::EObject|ID]
		public Group getGroup() { return cGroup; }
		
		//"#31"
		public Keyword getNumberSignDigitThreeDigitOneKeyword_0() { return cNumberSignDigitThreeDigitOneKeyword_0; }
		
		//ref=[ecore::EObject|ID]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getRefEObjectCrossReference_1_0() { return cRefEObjectCrossReference_1_0; }
		
		//ID
		public RuleCall getRefEObjectIDTerminalRuleCall_1_0_1() { return cRefEObjectIDTerminalRuleCall_1_0_1; }
	}
	public class NullCrossRefInterpretedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.NullCrossRefInterpreted");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeDigitTwoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefEObjectCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefEObjectIDTerminalRuleCall_1_0_1 = (RuleCall)cRefEObjectCrossReference_1_0.eContents().get(1);
		private final Assignment cFooAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFooIDTerminalRuleCall_2_0 = (RuleCall)cFooAssignment_2.eContents().get(0);
		
		//NullCrossRefInterpreted returns NullCrossRef:
		//    "#32" ref=[ecore::EObject|ID] foo=ID?;
		@Override public ParserRule getRule() { return rule; }
		
		//"#32" ref=[ecore::EObject|ID] foo=ID?
		public Group getGroup() { return cGroup; }
		
		//"#32"
		public Keyword getNumberSignDigitThreeDigitTwoKeyword_0() { return cNumberSignDigitThreeDigitTwoKeyword_0; }
		
		//ref=[ecore::EObject|ID]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[ecore::EObject|ID]
		public CrossReference getRefEObjectCrossReference_1_0() { return cRefEObjectCrossReference_1_0; }
		
		//ID
		public RuleCall getRefEObjectIDTerminalRuleCall_1_0_1() { return cRefEObjectIDTerminalRuleCall_1_0_1; }
		
		//foo=ID?
		public Assignment getFooAssignment_2() { return cFooAssignment_2; }
		
		//ID
		public RuleCall getFooIDTerminalRuleCall_2_0() { return cFooIDTerminalRuleCall_2_0; }
	}
	public class FragmentCallerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.FragmentCaller");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeDigitThreeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVal1Assignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVal1IDTerminalRuleCall_1_0 = (RuleCall)cVal1Assignment_1.eContents().get(0);
		private final RuleCall cFragment1ParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cValAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValIDTerminalRuleCall_3_0 = (RuleCall)cValAssignment_3.eContents().get(0);
		
		//FragmentCaller returns FragmentCallerType:
		//    "#33" val1=ID Fragment1 val=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//"#33" val1=ID Fragment1 val=ID
		public Group getGroup() { return cGroup; }
		
		//"#33"
		public Keyword getNumberSignDigitThreeDigitThreeKeyword_0() { return cNumberSignDigitThreeDigitThreeKeyword_0; }
		
		//val1=ID
		public Assignment getVal1Assignment_1() { return cVal1Assignment_1; }
		
		//ID
		public RuleCall getVal1IDTerminalRuleCall_1_0() { return cVal1IDTerminalRuleCall_1_0; }
		
		//Fragment1
		public RuleCall getFragment1ParserRuleCall_2() { return cFragment1ParserRuleCall_2; }
		
		//val=ID
		public Assignment getValAssignment_3() { return cValAssignment_3; }
		
		//ID
		public RuleCall getValIDTerminalRuleCall_3_0() { return cValIDTerminalRuleCall_3_0; }
	}
	public class Fragment1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.Fragment1");
		private final Assignment cFragValAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFragValIDTerminalRuleCall_0 = (RuleCall)cFragValAssignment.eContents().get(0);
		
		//fragment Fragment1 returns FragmentCallerType:
		//    fragVal=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//fragVal=ID
		public Assignment getFragValAssignment() { return cFragValAssignment; }
		
		//ID
		public RuleCall getFragValIDTerminalRuleCall_0() { return cFragValIDTerminalRuleCall_0; }
	}
	public class ParameterCallerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.ParameterCaller");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeDigitFourKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cKw1Keyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cPAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cPParameterizedParserRuleCall_1_0_1_0 = (RuleCall)cPAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw2Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cPAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cPParameterizedParserRuleCall_1_1_1_0 = (RuleCall)cPAssignment_1_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cKw3Keyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cPAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cPParameterizedParserRuleCall_1_2_1_0 = (RuleCall)cPAssignment_1_2_1.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cKw4Keyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cPAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cPParameterizedParserRuleCall_1_3_1_0 = (RuleCall)cPAssignment_1_3_1.eContents().get(0);
		
		//ParameterCaller:
		//    "#34" ("kw1" p=Parameterized<true, true> | "kw2" p=Parameterized<true, false> | "kw3" p=Parameterized<false, true> | "kw4" p=Parameterized<false, false>);
		@Override public ParserRule getRule() { return rule; }
		
		//"#34" ("kw1" p=Parameterized<true, true> | "kw2" p=Parameterized<true, false> | "kw3" p=Parameterized<false, true> | "kw4" p=Parameterized<false, false>)
		public Group getGroup() { return cGroup; }
		
		//"#34"
		public Keyword getNumberSignDigitThreeDigitFourKeyword_0() { return cNumberSignDigitThreeDigitFourKeyword_0; }
		
		//("kw1" p=Parameterized<true, true> | "kw2" p=Parameterized<true, false> | "kw3" p=Parameterized<false, true> | "kw4" p=Parameterized<false, false>)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"kw1" p=Parameterized<true, true>
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0_0() { return cKw1Keyword_1_0_0; }
		
		//p=Parameterized<true, true>
		public Assignment getPAssignment_1_0_1() { return cPAssignment_1_0_1; }
		
		//Parameterized<true, true>
		public RuleCall getPParameterizedParserRuleCall_1_0_1_0() { return cPParameterizedParserRuleCall_1_0_1_0; }
		
		//"kw2" p=Parameterized<true, false>
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_1_0() { return cKw2Keyword_1_1_0; }
		
		//p=Parameterized<true, false>
		public Assignment getPAssignment_1_1_1() { return cPAssignment_1_1_1; }
		
		//Parameterized<true, false>
		public RuleCall getPParameterizedParserRuleCall_1_1_1_0() { return cPParameterizedParserRuleCall_1_1_1_0; }
		
		//"kw3" p=Parameterized<false, true>
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//"kw3"
		public Keyword getKw3Keyword_1_2_0() { return cKw3Keyword_1_2_0; }
		
		//p=Parameterized<false, true>
		public Assignment getPAssignment_1_2_1() { return cPAssignment_1_2_1; }
		
		//Parameterized<false, true>
		public RuleCall getPParameterizedParserRuleCall_1_2_1_0() { return cPParameterizedParserRuleCall_1_2_1_0; }
		
		//"kw4" p=Parameterized<false, false>
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//"kw4"
		public Keyword getKw4Keyword_1_3_0() { return cKw4Keyword_1_3_0; }
		
		//p=Parameterized<false, false>
		public Assignment getPAssignment_1_3_1() { return cPAssignment_1_3_1; }
		
		//Parameterized<false, false>
		public RuleCall getPParameterizedParserRuleCall_1_3_1_0() { return cPParameterizedParserRuleCall_1_3_1_0; }
	}
	public class ParameterizedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.Parameterized");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cKwp1Keyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cV1Assignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cV1IDTerminalRuleCall_0_1_0 = (RuleCall)cV1Assignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cKwp2Keyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cV2Assignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cV2IDTerminalRuleCall_1_1_0 = (RuleCall)cV2Assignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Keyword cKwp3Keyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cV3Assignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cV3IDTerminalRuleCall_1_2_1_0 = (RuleCall)cV3Assignment_1_2_1.eContents().get(0);
		
		//Parameterized<P, Q>:
		//     <P> "kwp1" v1=ID | <!P> "kwp2" v2=ID (<Q> "kwp3" v3=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//<P> "kwp1" v1=ID | <!P> "kwp2" v2=ID (<Q> "kwp3" v3=ID)?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//<P> "kwp1" v1=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//"kwp1"
		public Keyword getKwp1Keyword_0_0() { return cKwp1Keyword_0_0; }
		
		//v1=ID
		public Assignment getV1Assignment_0_1() { return cV1Assignment_0_1; }
		
		//ID
		public RuleCall getV1IDTerminalRuleCall_0_1_0() { return cV1IDTerminalRuleCall_0_1_0; }
		
		//<!P> "kwp2" v2=ID (<Q> "kwp3" v3=ID)?
		public Group getGroup_1() { return cGroup_1; }
		
		//"kwp2"
		public Keyword getKwp2Keyword_1_0() { return cKwp2Keyword_1_0; }
		
		//v2=ID
		public Assignment getV2Assignment_1_1() { return cV2Assignment_1_1; }
		
		//ID
		public RuleCall getV2IDTerminalRuleCall_1_1_0() { return cV2IDTerminalRuleCall_1_1_0; }
		
		//(<Q> "kwp3" v3=ID)?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//"kwp3"
		public Keyword getKwp3Keyword_1_2_0() { return cKwp3Keyword_1_2_0; }
		
		//v3=ID
		public Assignment getV3Assignment_1_2_1() { return cV3Assignment_1_2_1; }
		
		//ID
		public RuleCall getV3IDTerminalRuleCall_1_2_1_0() { return cV3IDTerminalRuleCall_1_2_1_0; }
	}
	public class ParameterDelegationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.ParameterDelegation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitThreeDigitFiveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cKw1Keyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cPAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cPDelegationParserRuleCall_1_0_1_0 = (RuleCall)cPAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cKw2Keyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cPAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cPDelegationParserRuleCall_1_1_1_0 = (RuleCall)cPAssignment_1_1_1.eContents().get(0);
		
		//ParameterDelegation:
		//    "#35" ("kw1" p=Delegation<true, true> | "kw2" p=Delegation<true, false>);
		@Override public ParserRule getRule() { return rule; }
		
		//"#35" ("kw1" p=Delegation<true, true> | "kw2" p=Delegation<true, false>)
		public Group getGroup() { return cGroup; }
		
		//"#35"
		public Keyword getNumberSignDigitThreeDigitFiveKeyword_0() { return cNumberSignDigitThreeDigitFiveKeyword_0; }
		
		//("kw1" p=Delegation<true, true> | "kw2" p=Delegation<true, false>)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"kw1" p=Delegation<true, true>
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"kw1"
		public Keyword getKw1Keyword_1_0_0() { return cKw1Keyword_1_0_0; }
		
		//p=Delegation<true, true>
		public Assignment getPAssignment_1_0_1() { return cPAssignment_1_0_1; }
		
		//Delegation<true, true>
		public RuleCall getPDelegationParserRuleCall_1_0_1_0() { return cPDelegationParserRuleCall_1_0_1_0; }
		
		//"kw2" p=Delegation<true, false>
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//"kw2"
		public Keyword getKw2Keyword_1_1_0() { return cKw2Keyword_1_1_0; }
		
		//p=Delegation<true, false>
		public Assignment getPAssignment_1_1_1() { return cPAssignment_1_1_1; }
		
		//Delegation<true, false>
		public RuleCall getPDelegationParserRuleCall_1_1_1_0() { return cPDelegationParserRuleCall_1_1_1_0; }
	}
	public class DelegationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.Delegation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Alternatives cAlternatives_0_0 = (Alternatives)cGroup_0.eContents().get(0);
		private final Group cGroup_0_0_0 = (Group)cAlternatives_0_0.eContents().get(0);
		private final Assignment cPAssignment_0_0_0_0 = (Assignment)cGroup_0_0_0.eContents().get(0);
		private final RuleCall cPIDTerminalRuleCall_0_0_0_0_0 = (RuleCall)cPAssignment_0_0_0_0.eContents().get(0);
		private final Group cGroup_0_0_1 = (Group)cAlternatives_0_0.eContents().get(1);
		private final Assignment cNpAssignment_0_0_1_0 = (Assignment)cGroup_0_0_1.eContents().get(0);
		private final RuleCall cNpINTTerminalRuleCall_0_0_1_0_0 = (RuleCall)cNpAssignment_0_0_1_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cKwdKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cDelegationParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final Action cDelegationALeftAction_1_2_0 = (Action)cGroup_1_2.eContents().get(0);
		private final Assignment cRc2Assignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cRc2DelegationParserRuleCall_1_2_1_0 = (RuleCall)cRc2Assignment_1_2_1.eContents().get(0);
		
		//Delegation<D, P>:
		//    <!D> (<P> p=ID | <!P> np=INT) | <D> "kwd" Delegation<false, P> ({DelegationA.left=current} rc2=Delegation<false, P>)?;
		@Override public ParserRule getRule() { return rule; }
		
		//<!D> (<P> p=ID | <!P> np=INT) | <D> "kwd" Delegation<false, P> ({DelegationA.left=current} rc2=Delegation<false, P>)?
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//<!D> (<P> p=ID | <!P> np=INT)
		public Group getGroup_0() { return cGroup_0; }
		
		//(<P> p=ID | <!P> np=INT)
		public Alternatives getAlternatives_0_0() { return cAlternatives_0_0; }
		
		//<P> p=ID
		public Group getGroup_0_0_0() { return cGroup_0_0_0; }
		
		//p=ID
		public Assignment getPAssignment_0_0_0_0() { return cPAssignment_0_0_0_0; }
		
		//ID
		public RuleCall getPIDTerminalRuleCall_0_0_0_0_0() { return cPIDTerminalRuleCall_0_0_0_0_0; }
		
		//<!P> np=INT
		public Group getGroup_0_0_1() { return cGroup_0_0_1; }
		
		//np=INT
		public Assignment getNpAssignment_0_0_1_0() { return cNpAssignment_0_0_1_0; }
		
		//INT
		public RuleCall getNpINTTerminalRuleCall_0_0_1_0_0() { return cNpINTTerminalRuleCall_0_0_1_0_0; }
		
		//<D> "kwd" Delegation<false, P> ({DelegationA.left=current} rc2=Delegation<false, P>)?
		public Group getGroup_1() { return cGroup_1; }
		
		//"kwd"
		public Keyword getKwdKeyword_1_0() { return cKwdKeyword_1_0; }
		
		//Delegation<false, P>
		public RuleCall getDelegationParserRuleCall_1_1() { return cDelegationParserRuleCall_1_1; }
		
		//({DelegationA.left=current} rc2=Delegation<false, P>)?
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//{DelegationA.left=current}
		public Action getDelegationALeftAction_1_2_0() { return cDelegationALeftAction_1_2_0; }
		
		//rc2=Delegation<false, P>
		public Assignment getRc2Assignment_1_2_1() { return cRc2Assignment_1_2_1; }
		
		//Delegation<false, P>
		public RuleCall getRc2DelegationParserRuleCall_1_2_1_0() { return cRc2DelegationParserRuleCall_1_2_1_0; }
	}
	
	public class DefEnum1Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.DefEnum1");
		private final EnumLiteralDeclaration cKw1EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cKw1Kw1Keyword_0 = (Keyword)cKw1EnumLiteralDeclaration.eContents().get(0);
		
		//enum DefEnum1 returns DefEnum:
		//    kw1;
		public EnumRule getRule() { return rule; }
		
		//kw1
		public EnumLiteralDeclaration getKw1EnumLiteralDeclaration() { return cKw1EnumLiteralDeclaration; }
		
		public Keyword getKw1Kw1Keyword_0() { return cKw1Kw1Keyword_0; }
	}
	public class DefEnum2Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.DefEnum2");
		private final EnumLiteralDeclaration cKw2EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cKw2Kw2Keyword_0 = (Keyword)cKw2EnumLiteralDeclaration.eContents().get(0);
		
		//enum DefEnum2 returns DefEnum:
		//    kw2;
		public EnumRule getRule() { return rule; }
		
		//kw2
		public EnumLiteralDeclaration getKw2EnumLiteralDeclaration() { return cKw2EnumLiteralDeclaration; }
		
		public Keyword getKw2Kw2Keyword_0() { return cKw2Kw2Keyword_0; }
	}
	public class DefEnum3Elements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.DefEnum3");
		private final EnumLiteralDeclaration cKw3EnumLiteralDeclaration = (EnumLiteralDeclaration)rule.eContents().get(1);
		private final Keyword cKw3Kw3Keyword_0 = (Keyword)cKw3EnumLiteralDeclaration.eContents().get(0);
		
		//enum DefEnum3 returns DefEnum:
		//    kw3;
		public EnumRule getRule() { return rule; }
		
		//kw3
		public EnumLiteralDeclaration getKw3EnumLiteralDeclaration() { return cKw3EnumLiteralDeclaration; }
		
		public Keyword getKw3Kw3Keyword_0() { return cKw3Kw3Keyword_0; }
	}
	
	private final ModelElements pModel;
	private final SimpleGroupElements pSimpleGroup;
	private final SimpleAlternativeElements pSimpleAlternative;
	private final SimpleMultiplicitiesElements pSimpleMultiplicities;
	private final GroupMultiplicitiesElements pGroupMultiplicities;
	private final AlternativeMultiplicitiesElements pAlternativeMultiplicities;
	private final List1Elements pList1;
	private final List2Elements pList2;
	private final AltList1Elements pAltList1;
	private final AltList2Elements pAltList2;
	private final SingleKeywordsElements pSingleKeywords;
	private final SingleKeywordsOrIDElements pSingleKeywordsOrID;
	private final SingleTerminalsElements pSingleTerminals;
	private final TerminalRule tID1;
	private final TerminalRule tID2;
	private final TerminalRule tID3;
	private final SingleEnumElements pSingleEnum;
	private final DefEnum1Elements eDefEnum1;
	private final DefEnum2Elements eDefEnum2;
	private final DefEnum3Elements eDefEnum3;
	private final SingleCrossReferenceElements pSingleCrossReference;
	private final SingleContainmentReferenceElements pSingleContainmentReference;
	private final SingleContainmentReferenceChild1Elements pSingleContainmentReferenceChild1;
	private final SingleContainmentReferenceChild2Elements pSingleContainmentReferenceChild2;
	private final SingleContainmentReferenceChild3Elements pSingleContainmentReferenceChild3;
	private final MultiKeywordsElements pMultiKeywords;
	private final MultiKeywordsOrIDElements pMultiKeywordsOrID;
	private final MultiTerminalsElements pMultiTerminals;
	private final DependentAlternative1Elements pDependentAlternative1;
	private final DependentAlternative2Elements pDependentAlternative2;
	private final OptionalElements pOptional;
	private final FloatElements pFloat;
	private final UnorderedAlternativeElements pUnorderedAlternative;
	private final UnorderedAlternativeValElements pUnorderedAlternativeVal;
	private final UnorderedAlternativeValDelegateElements pUnorderedAlternativeValDelegate;
	private final UnorderedAlternativeVal2Elements pUnorderedAlternativeVal2;
	private final UnorderedGroupElements pUnorderedGroup;
	private final UnorderedGroupValElements pUnorderedGroupVal;
	private final UnorderedGroupValDelegateElements pUnorderedGroupValDelegate;
	private final UnorderedGroupVal2Elements pUnorderedGroupVal2;
	private final UnorderedGroupOptionalElements pUnorderedGroupOptional;
	private final UnorderedGroupBooleanElements pUnorderedGroupBoolean;
	private final Complex1Elements pComplex1;
	private final OptionalDoubleElements pOptionalDouble;
	private final DOUBLEElements pDOUBLE;
	private final NullValueGeneratedElements pNullValueGenerated;
	private final NullValueInterpretedElements pNullValueInterpreted;
	private final NULL_STRINGElements pNULL_STRING;
	private final NullCrossRefGeneratedElements pNullCrossRefGenerated;
	private final NullCrossRefInterpretedElements pNullCrossRefInterpreted;
	private final FragmentCallerElements pFragmentCaller;
	private final Fragment1Elements pFragment1;
	private final ParameterCallerElements pParameterCaller;
	private final ParameterizedElements pParameterized;
	private final ParameterDelegationElements pParameterDelegation;
	private final DelegationElements pDelegation;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SequencerTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSimpleGroup = new SimpleGroupElements();
		this.pSimpleAlternative = new SimpleAlternativeElements();
		this.pSimpleMultiplicities = new SimpleMultiplicitiesElements();
		this.pGroupMultiplicities = new GroupMultiplicitiesElements();
		this.pAlternativeMultiplicities = new AlternativeMultiplicitiesElements();
		this.pList1 = new List1Elements();
		this.pList2 = new List2Elements();
		this.pAltList1 = new AltList1Elements();
		this.pAltList2 = new AltList2Elements();
		this.pSingleKeywords = new SingleKeywordsElements();
		this.pSingleKeywordsOrID = new SingleKeywordsOrIDElements();
		this.pSingleTerminals = new SingleTerminalsElements();
		this.tID1 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.ID1");
		this.tID2 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.ID2");
		this.tID3 = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.serializer.SequencerTestLanguage.ID3");
		this.pSingleEnum = new SingleEnumElements();
		this.eDefEnum1 = new DefEnum1Elements();
		this.eDefEnum2 = new DefEnum2Elements();
		this.eDefEnum3 = new DefEnum3Elements();
		this.pSingleCrossReference = new SingleCrossReferenceElements();
		this.pSingleContainmentReference = new SingleContainmentReferenceElements();
		this.pSingleContainmentReferenceChild1 = new SingleContainmentReferenceChild1Elements();
		this.pSingleContainmentReferenceChild2 = new SingleContainmentReferenceChild2Elements();
		this.pSingleContainmentReferenceChild3 = new SingleContainmentReferenceChild3Elements();
		this.pMultiKeywords = new MultiKeywordsElements();
		this.pMultiKeywordsOrID = new MultiKeywordsOrIDElements();
		this.pMultiTerminals = new MultiTerminalsElements();
		this.pDependentAlternative1 = new DependentAlternative1Elements();
		this.pDependentAlternative2 = new DependentAlternative2Elements();
		this.pOptional = new OptionalElements();
		this.pFloat = new FloatElements();
		this.pUnorderedAlternative = new UnorderedAlternativeElements();
		this.pUnorderedAlternativeVal = new UnorderedAlternativeValElements();
		this.pUnorderedAlternativeValDelegate = new UnorderedAlternativeValDelegateElements();
		this.pUnorderedAlternativeVal2 = new UnorderedAlternativeVal2Elements();
		this.pUnorderedGroup = new UnorderedGroupElements();
		this.pUnorderedGroupVal = new UnorderedGroupValElements();
		this.pUnorderedGroupValDelegate = new UnorderedGroupValDelegateElements();
		this.pUnorderedGroupVal2 = new UnorderedGroupVal2Elements();
		this.pUnorderedGroupOptional = new UnorderedGroupOptionalElements();
		this.pUnorderedGroupBoolean = new UnorderedGroupBooleanElements();
		this.pComplex1 = new Complex1Elements();
		this.pOptionalDouble = new OptionalDoubleElements();
		this.pDOUBLE = new DOUBLEElements();
		this.pNullValueGenerated = new NullValueGeneratedElements();
		this.pNullValueInterpreted = new NullValueInterpretedElements();
		this.pNULL_STRING = new NULL_STRINGElements();
		this.pNullCrossRefGenerated = new NullCrossRefGeneratedElements();
		this.pNullCrossRefInterpreted = new NullCrossRefInterpretedElements();
		this.pFragmentCaller = new FragmentCallerElements();
		this.pFragment1 = new Fragment1Elements();
		this.pParameterCaller = new ParameterCallerElements();
		this.pParameterized = new ParameterizedElements();
		this.pParameterDelegation = new ParameterDelegationElements();
		this.pDelegation = new DelegationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.serializer.SequencerTestLanguage".equals(grammar.getName())) {
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
	//    x1=SimpleGroup | x2=SimpleAlternative | x3=SimpleMultiplicities | x4=GroupMultiplicities |
	//    x5=AlternativeMultiplicities | x6=List1 | x7=List2 | x8=AltList1 | x9=AltList2 |
	//    x10=SingleKeywords | x11=SingleKeywordsOrID | x12=SingleTerminals |
	//    x10=MultiKeywords | x11=MultiKeywordsOrID | x12=MultiTerminals |
	//    x13=SingleEnum | x14=SingleCrossReference | x15=SingleContainmentReference |
	//    x19=DependentAlternative1 | x20=DependentAlternative2 | x21=Optional | x22=Float |
	//    x23=UnorderedAlternative | x24=UnorderedGroup | x25=UnorderedGroupOptional |
	//    x26=UnorderedGroupBoolean | x27=Complex1 | x28=OptionalDouble |
	//    x29=NullValueGenerated | x30=NullValueInterpreted | x31=NullCrossRefGenerated | x32=NullCrossRefInterpreted |
	//    x33=FragmentCaller | x34=ParameterCaller | x35=ParameterDelegation;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//SimpleGroup:
	//    "#1" val1=ID val2=ID;
	public SimpleGroupElements getSimpleGroupAccess() {
		return pSimpleGroup;
	}
	
	public ParserRule getSimpleGroupRule() {
		return getSimpleGroupAccess().getRule();
	}
	
	//SimpleAlternative:
	//    "#2" ("kw1" val1=ID | "kw2" val2=ID);
	public SimpleAlternativeElements getSimpleAlternativeAccess() {
		return pSimpleAlternative;
	}
	
	public ParserRule getSimpleAlternativeRule() {
		return getSimpleAlternativeAccess().getRule();
	}
	
	//SimpleMultiplicities:
	//    "#3" val1=ID "kw1" val2=ID? "kw2" val3+=ID+ "kw3" val4+=ID*;
	public SimpleMultiplicitiesElements getSimpleMultiplicitiesAccess() {
		return pSimpleMultiplicities;
	}
	
	public ParserRule getSimpleMultiplicitiesRule() {
		return getSimpleMultiplicitiesAccess().getRule();
	}
	
	//GroupMultiplicities:
	//    "#4" val1=ID "kw1" (val2=ID val3=ID)? "kw2" (val4+=ID val5+=ID)+ "kw3" (val6+=ID val7+=ID)*;
	public GroupMultiplicitiesElements getGroupMultiplicitiesAccess() {
		return pGroupMultiplicities;
	}
	
	public ParserRule getGroupMultiplicitiesRule() {
		return getGroupMultiplicitiesAccess().getRule();
	}
	
	//AlternativeMultiplicities:
	//    "#5" (val2=ID | "kw1" val3=ID)? "kw2" (val4+=ID | "kw3" val5+=ID)+ "kw4" (val6+=ID | ("kw5" val7+=ID))*;
	public AlternativeMultiplicitiesElements getAlternativeMultiplicitiesAccess() {
		return pAlternativeMultiplicities;
	}
	
	public ParserRule getAlternativeMultiplicitiesRule() {
		return getAlternativeMultiplicitiesAccess().getRule();
	}
	
	//List1:
	//    "#6" val1+=ID ("," val1+=ID)*;
	public List1Elements getList1Access() {
		return pList1;
	}
	
	public ParserRule getList1Rule() {
		return getList1Access().getRule();
	}
	
	//List2:
	//    "#7" {List2} (val1+=ID ("," val1+=ID)*)?;
	public List2Elements getList2Access() {
		return pList2;
	}
	
	public ParserRule getList2Rule() {
		return getList2Access().getRule();
	}
	
	//AltList1:
	//    "#8" (val1=ID val2=ID | "kw1" val1=ID val3=ID | "kw2" val1=ID val4=ID?);
	public AltList1Elements getAltList1Access() {
		return pAltList1;
	}
	
	public ParserRule getAltList1Rule() {
		return getAltList1Access().getRule();
	}
	
	//AltList2:
	//    "#9" (val1+=ID val2=ID | "kw" val1+=ID ("," val1+=ID)* val3=ID);
	public AltList2Elements getAltList2Access() {
		return pAltList2;
	}
	
	public ParserRule getAltList2Rule() {
		return getAltList2Access().getRule();
	}
	
	//SingleKeywords:
	//    "#10" val=("kw1" | "kw2" | "kw3");
	public SingleKeywordsElements getSingleKeywordsAccess() {
		return pSingleKeywords;
	}
	
	public ParserRule getSingleKeywordsRule() {
		return getSingleKeywordsAccess().getRule();
	}
	
	//SingleKeywordsOrID:
	//    "#11" val=("kw1" | "kw2" | "kw3" | ID);
	public SingleKeywordsOrIDElements getSingleKeywordsOrIDAccess() {
		return pSingleKeywordsOrID;
	}
	
	public ParserRule getSingleKeywordsOrIDRule() {
		return getSingleKeywordsOrIDAccess().getRule();
	}
	
	//SingleTerminals:
	//    "#12" val=(ID1 | ID2);
	public SingleTerminalsElements getSingleTerminalsAccess() {
		return pSingleTerminals;
	}
	
	public ParserRule getSingleTerminalsRule() {
		return getSingleTerminalsAccess().getRule();
	}
	
	//terminal ID1:
	//    '$1' ID;
	public TerminalRule getID1Rule() {
		return tID1;
	}
	
	//terminal ID2:
	//    '$2' ID;
	public TerminalRule getID2Rule() {
		return tID2;
	}
	
	//terminal ID3:
	//    '$3' ID;
	public TerminalRule getID3Rule() {
		return tID3;
	}
	
	//SingleEnum:
	//    "#13" val=(DefEnum1 | DefEnum2 | DefEnum3);
	public SingleEnumElements getSingleEnumAccess() {
		return pSingleEnum;
	}
	
	public ParserRule getSingleEnumRule() {
		return getSingleEnumAccess().getRule();
	}
	
	//enum DefEnum1 returns DefEnum:
	//    kw1;
	public DefEnum1Elements getDefEnum1Access() {
		return eDefEnum1;
	}
	
	public EnumRule getDefEnum1Rule() {
		return getDefEnum1Access().getRule();
	}
	
	//enum DefEnum2 returns DefEnum:
	//    kw2;
	public DefEnum2Elements getDefEnum2Access() {
		return eDefEnum2;
	}
	
	public EnumRule getDefEnum2Rule() {
		return getDefEnum2Access().getRule();
	}
	
	//enum DefEnum3 returns DefEnum:
	//    kw3;
	public DefEnum3Elements getDefEnum3Access() {
		return eDefEnum3;
	}
	
	public EnumRule getDefEnum3Rule() {
		return getDefEnum3Access().getRule();
	}
	
	//SingleCrossReference:
	//    "#14" name=(ID1 | ID2 | ID3) (ref=[SingleCrossReference|ID1] | ref=[SingleCrossReference|ID2] |
	//    ref=[SingleCrossReference|ID3]);
	public SingleCrossReferenceElements getSingleCrossReferenceAccess() {
		return pSingleCrossReference;
	}
	
	public ParserRule getSingleCrossReferenceRule() {
		return getSingleCrossReferenceAccess().getRule();
	}
	
	//SingleContainmentReference:
	//    "#15" child=(SingleContainmentReferenceChild1 | SingleContainmentReferenceChild2 | SingleContainmentReferenceChild3);
	public SingleContainmentReferenceElements getSingleContainmentReferenceAccess() {
		return pSingleContainmentReference;
	}
	
	public ParserRule getSingleContainmentReferenceRule() {
		return getSingleContainmentReferenceAccess().getRule();
	}
	
	//SingleContainmentReferenceChild1:
	//    val='kw1';
	public SingleContainmentReferenceChild1Elements getSingleContainmentReferenceChild1Access() {
		return pSingleContainmentReferenceChild1;
	}
	
	public ParserRule getSingleContainmentReferenceChild1Rule() {
		return getSingleContainmentReferenceChild1Access().getRule();
	}
	
	//SingleContainmentReferenceChild2:
	//    val='kw2';
	public SingleContainmentReferenceChild2Elements getSingleContainmentReferenceChild2Access() {
		return pSingleContainmentReferenceChild2;
	}
	
	public ParserRule getSingleContainmentReferenceChild2Rule() {
		return getSingleContainmentReferenceChild2Access().getRule();
	}
	
	//SingleContainmentReferenceChild3:
	//    val='kw3';
	public SingleContainmentReferenceChild3Elements getSingleContainmentReferenceChild3Access() {
		return pSingleContainmentReferenceChild3;
	}
	
	public ParserRule getSingleContainmentReferenceChild3Rule() {
		return getSingleContainmentReferenceChild3Access().getRule();
	}
	
	//MultiKeywords:
	//    "#16" val+=("kw1" | "kw2" | "kw3");
	public MultiKeywordsElements getMultiKeywordsAccess() {
		return pMultiKeywords;
	}
	
	public ParserRule getMultiKeywordsRule() {
		return getMultiKeywordsAccess().getRule();
	}
	
	//MultiKeywordsOrID:
	//    "#17" val+=("kw1" | "kw2" | "kw3" | ID);
	public MultiKeywordsOrIDElements getMultiKeywordsOrIDAccess() {
		return pMultiKeywordsOrID;
	}
	
	public ParserRule getMultiKeywordsOrIDRule() {
		return getMultiKeywordsOrIDAccess().getRule();
	}
	
	//MultiTerminals:
	//    "#18" val+=(ID1 | ID2);
	public MultiTerminalsElements getMultiTerminalsAccess() {
		return pMultiTerminals;
	}
	
	public ParserRule getMultiTerminalsRule() {
		return getMultiTerminalsAccess().getRule();
	}
	
	//DependentAlternative1:
	//    "#19" (val=ID | val=ID flag?="kw1");
	public DependentAlternative1Elements getDependentAlternative1Access() {
		return pDependentAlternative1;
	}
	
	public ParserRule getDependentAlternative1Rule() {
		return getDependentAlternative1Access().getRule();
	}
	
	//DependentAlternative2:
	//    "#20" (val+=ID val+=ID+| val+=ID+ flag?="kw1");
	public DependentAlternative2Elements getDependentAlternative2Access() {
		return pDependentAlternative2;
	}
	
	public ParserRule getDependentAlternative2Rule() {
		return getDependentAlternative2Access().getRule();
	}
	
	//Optional:
	//    "#21" int0=INT (int1=INT int2=INT)?;
	public OptionalElements getOptionalAccess() {
		return pOptional;
	}
	
	public ParserRule getOptionalRule() {
		return getOptionalAccess().getRule();
	}
	
	//Float:
	//    "#22" {Float} 'Bye';
	public FloatElements getFloatAccess() {
		return pFloat;
	}
	
	public ParserRule getFloatRule() {
		return getFloatAccess().getRule();
	}
	
	//UnorderedAlternative:
	//    "#23" {UnorderedAlternative} (val1+=ID | val2+=INT | val3+=UnorderedAlternativeVal | val4+=UnorderedAlternativeValDelegate)*;
	public UnorderedAlternativeElements getUnorderedAlternativeAccess() {
		return pUnorderedAlternative;
	}
	
	public ParserRule getUnorderedAlternativeRule() {
		return getUnorderedAlternativeAccess().getRule();
	}
	
	//UnorderedAlternativeVal:
	//    "kw1" val=ID;
	public UnorderedAlternativeValElements getUnorderedAlternativeValAccess() {
		return pUnorderedAlternativeVal;
	}
	
	public ParserRule getUnorderedAlternativeValRule() {
		return getUnorderedAlternativeValAccess().getRule();
	}
	
	//UnorderedAlternativeValDelegate:
	//    UnorderedAlternativeVal2;
	public UnorderedAlternativeValDelegateElements getUnorderedAlternativeValDelegateAccess() {
		return pUnorderedAlternativeValDelegate;
	}
	
	public ParserRule getUnorderedAlternativeValDelegateRule() {
		return getUnorderedAlternativeValDelegateAccess().getRule();
	}
	
	//UnorderedAlternativeVal2:
	//    "kw2" val=ID;
	public UnorderedAlternativeVal2Elements getUnorderedAlternativeVal2Access() {
		return pUnorderedAlternativeVal2;
	}
	
	public ParserRule getUnorderedAlternativeVal2Rule() {
		return getUnorderedAlternativeVal2Access().getRule();
	}
	
	//UnorderedGroup:
	//    "#24" (val1=ID & val2=INT & val3=UnorderedGroupVal & val4=UnorderedGroupValDelegate);
	public UnorderedGroupElements getUnorderedGroupAccess() {
		return pUnorderedGroup;
	}
	
	public ParserRule getUnorderedGroupRule() {
		return getUnorderedGroupAccess().getRule();
	}
	
	//UnorderedGroupVal:
	//    "kw1" val=ID;
	public UnorderedGroupValElements getUnorderedGroupValAccess() {
		return pUnorderedGroupVal;
	}
	
	public ParserRule getUnorderedGroupValRule() {
		return getUnorderedGroupValAccess().getRule();
	}
	
	//UnorderedGroupValDelegate:
	//    UnorderedGroupVal2;
	public UnorderedGroupValDelegateElements getUnorderedGroupValDelegateAccess() {
		return pUnorderedGroupValDelegate;
	}
	
	public ParserRule getUnorderedGroupValDelegateRule() {
		return getUnorderedGroupValDelegateAccess().getRule();
	}
	
	//UnorderedGroupVal2:
	//    "kw2" val=ID;
	public UnorderedGroupVal2Elements getUnorderedGroupVal2Access() {
		return pUnorderedGroupVal2;
	}
	
	public ParserRule getUnorderedGroupVal2Rule() {
		return getUnorderedGroupVal2Access().getRule();
	}
	
	//UnorderedGroupOptional:
	//    "#25" {UnorderedGroupOptional} (("kw1" val1=ID)? & ("kw2" va2=ID)? & ("kw3" val3=ID)?);
	public UnorderedGroupOptionalElements getUnorderedGroupOptionalAccess() {
		return pUnorderedGroupOptional;
	}
	
	public ParserRule getUnorderedGroupOptionalRule() {
		return getUnorderedGroupOptionalAccess().getRule();
	}
	
	//UnorderedGroupBoolean:
	//    '#26' {UnorderedGroupBoolean} (val1?='kw1'?  & val2?='kw2'? & val3?='kw3'?);
	public UnorderedGroupBooleanElements getUnorderedGroupBooleanAccess() {
		return pUnorderedGroupBoolean;
	}
	
	public ParserRule getUnorderedGroupBooleanRule() {
		return getUnorderedGroupBooleanAccess().getRule();
	}
	
	//Complex1:
	//    '#27' {Complex1} ("kw1" val1=ID)? ("kw2" val2=ID)? (("kw3" val3+=ID) | ("kw4" val4+=ID) | ("kw5" val5+=ID) | ("kw6" val6+=ID))*;
	public Complex1Elements getComplex1Access() {
		return pComplex1;
	}
	
	public ParserRule getComplex1Rule() {
		return getComplex1Access().getRule();
	}
	
	//OptionalDouble:
	//    "#28" double0=DOUBLE (double1=DOUBLE double2=DOUBLE)?;
	public OptionalDoubleElements getOptionalDoubleAccess() {
		return pOptionalDouble;
	}
	
	public ParserRule getOptionalDoubleRule() {
		return getOptionalDoubleAccess().getRule();
	}
	
	//DOUBLE returns ecore::EDouble:
	//    INT ("." INT)?;
	public DOUBLEElements getDOUBLEAccess() {
		return pDOUBLE;
	}
	
	public ParserRule getDOUBLERule() {
		return getDOUBLEAccess().getRule();
	}
	
	//NullValueGenerated returns NullValue:
	//    "#29" value=NULL_STRING;
	public NullValueGeneratedElements getNullValueGeneratedAccess() {
		return pNullValueGenerated;
	}
	
	public ParserRule getNullValueGeneratedRule() {
		return getNullValueGeneratedAccess().getRule();
	}
	
	//NullValueInterpreted returns NullValue:
	//    "#30" value=NULL_STRING foo=ID?;
	public NullValueInterpretedElements getNullValueInterpretedAccess() {
		return pNullValueInterpreted;
	}
	
	public ParserRule getNullValueInterpretedRule() {
		return getNullValueInterpretedAccess().getRule();
	}
	
	//NULL_STRING:
	//    STRING;
	public NULL_STRINGElements getNULL_STRINGAccess() {
		return pNULL_STRING;
	}
	
	public ParserRule getNULL_STRINGRule() {
		return getNULL_STRINGAccess().getRule();
	}
	
	//NullCrossRefGenerated returns NullCrossRef:
	//    "#31" ref=[ecore::EObject|ID];
	public NullCrossRefGeneratedElements getNullCrossRefGeneratedAccess() {
		return pNullCrossRefGenerated;
	}
	
	public ParserRule getNullCrossRefGeneratedRule() {
		return getNullCrossRefGeneratedAccess().getRule();
	}
	
	//NullCrossRefInterpreted returns NullCrossRef:
	//    "#32" ref=[ecore::EObject|ID] foo=ID?;
	public NullCrossRefInterpretedElements getNullCrossRefInterpretedAccess() {
		return pNullCrossRefInterpreted;
	}
	
	public ParserRule getNullCrossRefInterpretedRule() {
		return getNullCrossRefInterpretedAccess().getRule();
	}
	
	//FragmentCaller returns FragmentCallerType:
	//    "#33" val1=ID Fragment1 val=ID;
	public FragmentCallerElements getFragmentCallerAccess() {
		return pFragmentCaller;
	}
	
	public ParserRule getFragmentCallerRule() {
		return getFragmentCallerAccess().getRule();
	}
	
	//fragment Fragment1 returns FragmentCallerType:
	//    fragVal=ID;
	public Fragment1Elements getFragment1Access() {
		return pFragment1;
	}
	
	public ParserRule getFragment1Rule() {
		return getFragment1Access().getRule();
	}
	
	//ParameterCaller:
	//    "#34" ("kw1" p=Parameterized<true, true> | "kw2" p=Parameterized<true, false> | "kw3" p=Parameterized<false, true> | "kw4" p=Parameterized<false, false>);
	public ParameterCallerElements getParameterCallerAccess() {
		return pParameterCaller;
	}
	
	public ParserRule getParameterCallerRule() {
		return getParameterCallerAccess().getRule();
	}
	
	//Parameterized<P, Q>:
	//     <P> "kwp1" v1=ID | <!P> "kwp2" v2=ID (<Q> "kwp3" v3=ID)?;
	public ParameterizedElements getParameterizedAccess() {
		return pParameterized;
	}
	
	public ParserRule getParameterizedRule() {
		return getParameterizedAccess().getRule();
	}
	
	//ParameterDelegation:
	//    "#35" ("kw1" p=Delegation<true, true> | "kw2" p=Delegation<true, false>);
	public ParameterDelegationElements getParameterDelegationAccess() {
		return pParameterDelegation;
	}
	
	public ParserRule getParameterDelegationRule() {
		return getParameterDelegationAccess().getRule();
	}
	
	//Delegation<D, P>:
	//    <!D> (<P> p=ID | <!P> np=INT) | <D> "kwd" Delegation<false, P> ({DelegationA.left=current} rc2=Delegation<false, P>)?;
	public DelegationElements getDelegationAccess() {
		return pDelegation;
	}
	
	public ParserRule getDelegationRule() {
		return getDelegationAccess().getRule();
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
