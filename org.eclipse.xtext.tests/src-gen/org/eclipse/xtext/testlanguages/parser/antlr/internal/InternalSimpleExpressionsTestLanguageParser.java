package org.eclipse.xtext.testlanguages.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.services.SimpleExpressionsTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalSimpleExpressionsTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSimpleExpressionsTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimpleExpressionsTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimpleExpressionsTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimpleExpressionsTestLanguage.g"; }



     	private SimpleExpressionsTestLanguageGrammarAccess grammarAccess;

        public InternalSimpleExpressionsTestLanguageParser(TokenStream input, SimpleExpressionsTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Sequence";
       	}

       	@Override
       	protected SimpleExpressionsTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSequence"
    // InternalSimpleExpressionsTestLanguage.g:69:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalSimpleExpressionsTestLanguage.g:69:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalSimpleExpressionsTestLanguage.g:70:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalSimpleExpressionsTestLanguage.g:76:1: ruleSequence returns [EObject current=null] : (this_Addition_0= ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalSimpleExpressionsTestLanguage.g:82:2: ( (this_Addition_0= ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* ) )
            // InternalSimpleExpressionsTestLanguage.g:83:2: (this_Addition_0= ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* )
            {
            // InternalSimpleExpressionsTestLanguage.g:83:2: (this_Addition_0= ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* )
            // InternalSimpleExpressionsTestLanguage.g:84:3: this_Addition_0= ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )*
            {

            			newCompositeNode(grammarAccess.getSequenceAccess().getAdditionParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_3);
            this_Addition_0=ruleAddition();

            state._fsp--;


            			current = this_Addition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleExpressionsTestLanguage.g:92:3: ( () ( (lv_expressions_2_0= ruleAddition ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimpleExpressionsTestLanguage.g:93:4: () ( (lv_expressions_2_0= ruleAddition ) )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:93:4: ()
            	    // InternalSimpleExpressionsTestLanguage.g:94:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getSequenceAccess().getSequenceExpressionsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSimpleExpressionsTestLanguage.g:100:4: ( (lv_expressions_2_0= ruleAddition ) )
            	    // InternalSimpleExpressionsTestLanguage.g:101:5: (lv_expressions_2_0= ruleAddition )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:101:5: (lv_expressions_2_0= ruleAddition )
            	    // InternalSimpleExpressionsTestLanguage.g:102:6: lv_expressions_2_0= ruleAddition
            	    {

            	    						newCompositeNode(grammarAccess.getSequenceAccess().getExpressionsAdditionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_expressions_2_0=ruleAddition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_2_0,
            	    							"org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Addition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAddition"
    // InternalSimpleExpressionsTestLanguage.g:124:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalSimpleExpressionsTestLanguage.g:124:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalSimpleExpressionsTestLanguage.g:125:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalSimpleExpressionsTestLanguage.g:131:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleExpressionsTestLanguage.g:137:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* ) )
            // InternalSimpleExpressionsTestLanguage.g:138:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* )
            {
            // InternalSimpleExpressionsTestLanguage.g:138:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* )
            // InternalSimpleExpressionsTestLanguage.g:139:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_4);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleExpressionsTestLanguage.g:147:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimpleExpressionsTestLanguage.g:148:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:148:4: ()
            	    // InternalSimpleExpressionsTestLanguage.g:149:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getAdditionAccess().getOpValuesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSimpleExpressionsTestLanguage.g:155:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalSimpleExpressionsTestLanguage.g:156:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:156:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalSimpleExpressionsTestLanguage.g:157:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:157:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==11) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==12) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalSimpleExpressionsTestLanguage.g:158:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,11,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSimpleExpressionsTestLanguage.g:169:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,12,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSimpleExpressionsTestLanguage.g:182:4: ( (lv_values_3_0= ruleMultiplication ) )
            	    // InternalSimpleExpressionsTestLanguage.g:183:5: (lv_values_3_0= ruleMultiplication )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:183:5: (lv_values_3_0= ruleMultiplication )
            	    // InternalSimpleExpressionsTestLanguage.g:184:6: lv_values_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getValuesMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    lv_values_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalSimpleExpressionsTestLanguage.g:206:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalSimpleExpressionsTestLanguage.g:206:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalSimpleExpressionsTestLanguage.g:207:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalSimpleExpressionsTestLanguage.g:213:1: ruleMultiplication returns [EObject current=null] : (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Term_0 = null;

        EObject lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalSimpleExpressionsTestLanguage.g:219:2: ( (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* ) )
            // InternalSimpleExpressionsTestLanguage.g:220:2: (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* )
            {
            // InternalSimpleExpressionsTestLanguage.g:220:2: (this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* )
            // InternalSimpleExpressionsTestLanguage.g:221:3: this_Term_0= ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getTermParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_6);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSimpleExpressionsTestLanguage.g:229:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimpleExpressionsTestLanguage.g:230:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:230:4: ()
            	    // InternalSimpleExpressionsTestLanguage.g:231:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMultiplicationAccess().getOpValuesAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSimpleExpressionsTestLanguage.g:237:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalSimpleExpressionsTestLanguage.g:238:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:238:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalSimpleExpressionsTestLanguage.g:239:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:239:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==13) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==14) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalSimpleExpressionsTestLanguage.g:240:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,13,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSimpleExpressionsTestLanguage.g:251:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,14,FollowSets000.FOLLOW_5); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSimpleExpressionsTestLanguage.g:264:4: ( (lv_values_3_0= ruleTerm ) )
            	    // InternalSimpleExpressionsTestLanguage.g:265:5: (lv_values_3_0= ruleTerm )
            	    {
            	    // InternalSimpleExpressionsTestLanguage.g:265:5: (lv_values_3_0= ruleTerm )
            	    // InternalSimpleExpressionsTestLanguage.g:266:6: lv_values_3_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getValuesTermParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_values_3_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"org.eclipse.xtext.testlanguages.SimpleExpressionsTestLanguage.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleTerm"
    // InternalSimpleExpressionsTestLanguage.g:288:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalSimpleExpressionsTestLanguage.g:288:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalSimpleExpressionsTestLanguage.g:289:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalSimpleExpressionsTestLanguage.g:295:1: ruleTerm returns [EObject current=null] : (this_Atom_0= ruleAtom | this_Parens_1= ruleParens ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject this_Parens_1 = null;



        	enterRule();

        try {
            // InternalSimpleExpressionsTestLanguage.g:301:2: ( (this_Atom_0= ruleAtom | this_Parens_1= ruleParens ) )
            // InternalSimpleExpressionsTestLanguage.g:302:2: (this_Atom_0= ruleAtom | this_Parens_1= ruleParens )
            {
            // InternalSimpleExpressionsTestLanguage.g:302:2: (this_Atom_0= ruleAtom | this_Parens_1= ruleParens )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimpleExpressionsTestLanguage.g:303:3: this_Atom_0= ruleAtom
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getAtomParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Atom_0=ruleAtom();

                    state._fsp--;


                    			current = this_Atom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimpleExpressionsTestLanguage.g:312:3: this_Parens_1= ruleParens
                    {

                    			newCompositeNode(grammarAccess.getTermAccess().getParensParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Parens_1=ruleParens();

                    state._fsp--;


                    			current = this_Parens_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // InternalSimpleExpressionsTestLanguage.g:324:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSimpleExpressionsTestLanguage.g:324:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSimpleExpressionsTestLanguage.g:325:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSimpleExpressionsTestLanguage.g:331:1: ruleAtom returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSimpleExpressionsTestLanguage.g:337:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSimpleExpressionsTestLanguage.g:338:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSimpleExpressionsTestLanguage.g:338:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimpleExpressionsTestLanguage.g:339:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSimpleExpressionsTestLanguage.g:339:3: (lv_name_0_0= RULE_ID )
            // InternalSimpleExpressionsTestLanguage.g:340:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAtomAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtomRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParens"
    // InternalSimpleExpressionsTestLanguage.g:359:1: entryRuleParens returns [EObject current=null] : iv_ruleParens= ruleParens EOF ;
    public final EObject entryRuleParens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParens = null;


        try {
            // InternalSimpleExpressionsTestLanguage.g:359:47: (iv_ruleParens= ruleParens EOF )
            // InternalSimpleExpressionsTestLanguage.g:360:2: iv_ruleParens= ruleParens EOF
            {
             newCompositeNode(grammarAccess.getParensRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParens=ruleParens();

            state._fsp--;

             current =iv_ruleParens; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParens"


    // $ANTLR start "ruleParens"
    // InternalSimpleExpressionsTestLanguage.g:366:1: ruleParens returns [EObject current=null] : (otherlv_0= '(' this_Addition_1= ruleAddition otherlv_2= ')' ) ;
    public final EObject ruleParens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Addition_1 = null;



        	enterRule();

        try {
            // InternalSimpleExpressionsTestLanguage.g:372:2: ( (otherlv_0= '(' this_Addition_1= ruleAddition otherlv_2= ')' ) )
            // InternalSimpleExpressionsTestLanguage.g:373:2: (otherlv_0= '(' this_Addition_1= ruleAddition otherlv_2= ')' )
            {
            // InternalSimpleExpressionsTestLanguage.g:373:2: (otherlv_0= '(' this_Addition_1= ruleAddition otherlv_2= ')' )
            // InternalSimpleExpressionsTestLanguage.g:374:3: otherlv_0= '(' this_Addition_1= ruleAddition otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getParensAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParensAccess().getAdditionParserRuleCall_1());
            		
            pushFollow(FollowSets000.FOLLOW_7);
            this_Addition_1=ruleAddition();

            state._fsp--;


            			current = this_Addition_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParensAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParens"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    }


}