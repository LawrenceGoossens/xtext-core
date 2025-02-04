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
import org.eclipse.xtext.testlanguages.services.ActionTestLanguageGrammarAccess;



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
public class InternalActionTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalActionTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActionTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActionTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActionTestLanguage.g"; }



     	private ActionTestLanguageGrammarAccess grammarAccess;

        public InternalActionTestLanguageParser(TokenStream input, ActionTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ActionTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalActionTestLanguage.g:69:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalActionTestLanguage.g:69:46: (iv_ruleModel= ruleModel EOF )
            // InternalActionTestLanguage.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalActionTestLanguage.g:76:1: ruleModel returns [EObject current=null] : (this_Child_0= ruleChild ( () ( (lv_right_2_0= ruleChild ) ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Child_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalActionTestLanguage.g:82:2: ( (this_Child_0= ruleChild ( () ( (lv_right_2_0= ruleChild ) ) )? ) )
            // InternalActionTestLanguage.g:83:2: (this_Child_0= ruleChild ( () ( (lv_right_2_0= ruleChild ) ) )? )
            {
            // InternalActionTestLanguage.g:83:2: (this_Child_0= ruleChild ( () ( (lv_right_2_0= ruleChild ) ) )? )
            // InternalActionTestLanguage.g:84:3: this_Child_0= ruleChild ( () ( (lv_right_2_0= ruleChild ) ) )?
            {

            			newCompositeNode(grammarAccess.getModelAccess().getChildParserRuleCall_0());
            		
            pushFollow(FollowSets000.FOLLOW_3);
            this_Child_0=ruleChild();

            state._fsp--;


            			current = this_Child_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalActionTestLanguage.g:92:3: ( () ( (lv_right_2_0= ruleChild ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalActionTestLanguage.g:93:4: () ( (lv_right_2_0= ruleChild ) )
                    {
                    // InternalActionTestLanguage.g:93:4: ()
                    // InternalActionTestLanguage.g:94:5: 
                    {

                    					current = forceCreateModelElementAndSet(
                    						grammarAccess.getModelAccess().getParentLeftAction_1_0(),
                    						current);
                    				

                    }

                    // InternalActionTestLanguage.g:100:4: ( (lv_right_2_0= ruleChild ) )
                    // InternalActionTestLanguage.g:101:5: (lv_right_2_0= ruleChild )
                    {
                    // InternalActionTestLanguage.g:101:5: (lv_right_2_0= ruleChild )
                    // InternalActionTestLanguage.g:102:6: lv_right_2_0= ruleChild
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getRightChildParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_2_0=ruleChild();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.eclipse.xtext.testlanguages.ActionTestLanguage.Child");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleChild"
    // InternalActionTestLanguage.g:124:1: entryRuleChild returns [EObject current=null] : iv_ruleChild= ruleChild EOF ;
    public final EObject entryRuleChild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild = null;


        try {
            // InternalActionTestLanguage.g:124:46: (iv_ruleChild= ruleChild EOF )
            // InternalActionTestLanguage.g:125:2: iv_ruleChild= ruleChild EOF
            {
             newCompositeNode(grammarAccess.getChildRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild=ruleChild();

            state._fsp--;

             current =iv_ruleChild; 
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
    // $ANTLR end "entryRuleChild"


    // $ANTLR start "ruleChild"
    // InternalActionTestLanguage.g:131:1: ruleChild returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleChild() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalActionTestLanguage.g:137:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalActionTestLanguage.g:138:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalActionTestLanguage.g:138:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalActionTestLanguage.g:139:3: (lv_name_0_0= RULE_ID )
            {
            // InternalActionTestLanguage.g:139:3: (lv_name_0_0= RULE_ID )
            // InternalActionTestLanguage.g:140:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getChildAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChildRule());
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
    // $ANTLR end "ruleChild"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    }


}