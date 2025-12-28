package multicluster.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import multicluster.dsl.services.MultiClusterDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMultiClusterDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'}'", "'cluster'", "'deployment'", "'image'", "'replicas'", "'resources'", "'cpu'", "'memory'", "'ingress'", "'path'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMultiClusterDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMultiClusterDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMultiClusterDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMultiClusterDsl.g"; }



     	private MultiClusterDslGrammarAccess grammarAccess;

        public InternalMultiClusterDslParser(TokenStream input, MultiClusterDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MultiClusterDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMultiClusterDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMultiClusterDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMultiClusterDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMultiClusterDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_application_0_0= ruleApplication ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:77:2: ( ( (lv_application_0_0= ruleApplication ) ) )
            // InternalMultiClusterDsl.g:78:2: ( (lv_application_0_0= ruleApplication ) )
            {
            // InternalMultiClusterDsl.g:78:2: ( (lv_application_0_0= ruleApplication ) )
            // InternalMultiClusterDsl.g:79:3: (lv_application_0_0= ruleApplication )
            {
            // InternalMultiClusterDsl.g:79:3: (lv_application_0_0= ruleApplication )
            // InternalMultiClusterDsl.g:80:4: lv_application_0_0= ruleApplication
            {

            				newCompositeNode(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_application_0_0=ruleApplication();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"application",
            					lv_application_0_0,
            					"multicluster.dsl.MultiClusterDsl.Application");
            				afterParserOrEnumRuleCall();
            			

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


    // $ANTLR start "entryRuleApplication"
    // InternalMultiClusterDsl.g:100:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMultiClusterDsl.g:100:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalMultiClusterDsl.g:101:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMultiClusterDsl.g:107:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clusters_3_0= ruleCluster ) )* otherlv_4= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_clusters_3_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:113:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clusters_3_0= ruleCluster ) )* otherlv_4= '}' ) )
            // InternalMultiClusterDsl.g:114:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clusters_3_0= ruleCluster ) )* otherlv_4= '}' )
            {
            // InternalMultiClusterDsl.g:114:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clusters_3_0= ruleCluster ) )* otherlv_4= '}' )
            // InternalMultiClusterDsl.g:115:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_clusters_3_0= ruleCluster ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalMultiClusterDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMultiClusterDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMultiClusterDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMultiClusterDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMultiClusterDsl.g:141:3: ( (lv_clusters_3_0= ruleCluster ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMultiClusterDsl.g:142:4: (lv_clusters_3_0= ruleCluster )
            	    {
            	    // InternalMultiClusterDsl.g:142:4: (lv_clusters_3_0= ruleCluster )
            	    // InternalMultiClusterDsl.g:143:5: lv_clusters_3_0= ruleCluster
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getClustersClusterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_clusters_3_0=ruleCluster();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clusters",
            	    						lv_clusters_3_0,
            	    						"multicluster.dsl.MultiClusterDsl.Cluster");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleCluster"
    // InternalMultiClusterDsl.g:168:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // InternalMultiClusterDsl.g:168:48: (iv_ruleCluster= ruleCluster EOF )
            // InternalMultiClusterDsl.g:169:2: iv_ruleCluster= ruleCluster EOF
            {
             newCompositeNode(grammarAccess.getClusterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCluster=ruleCluster();

            state._fsp--;

             current =iv_ruleCluster; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // InternalMultiClusterDsl.g:175:1: ruleCluster returns [EObject current=null] : (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_ingress_4_0= ruleIngress ) )? otherlv_5= '}' ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_deployment_3_0 = null;

        EObject lv_ingress_4_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:181:2: ( (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_ingress_4_0= ruleIngress ) )? otherlv_5= '}' ) )
            // InternalMultiClusterDsl.g:182:2: (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_ingress_4_0= ruleIngress ) )? otherlv_5= '}' )
            {
            // InternalMultiClusterDsl.g:182:2: (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_ingress_4_0= ruleIngress ) )? otherlv_5= '}' )
            // InternalMultiClusterDsl.g:183:3: otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_ingress_4_0= ruleIngress ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClusterAccess().getClusterKeyword_0());
            		
            // InternalMultiClusterDsl.g:187:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMultiClusterDsl.g:188:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMultiClusterDsl.g:188:4: (lv_name_1_0= RULE_ID )
            // InternalMultiClusterDsl.g:189:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClusterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClusterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMultiClusterDsl.g:209:3: ( (lv_deployment_3_0= ruleDeployment ) )
            // InternalMultiClusterDsl.g:210:4: (lv_deployment_3_0= ruleDeployment )
            {
            // InternalMultiClusterDsl.g:210:4: (lv_deployment_3_0= ruleDeployment )
            // InternalMultiClusterDsl.g:211:5: lv_deployment_3_0= ruleDeployment
            {

            					newCompositeNode(grammarAccess.getClusterAccess().getDeploymentDeploymentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_deployment_3_0=ruleDeployment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClusterRule());
            					}
            					set(
            						current,
            						"deployment",
            						lv_deployment_3_0,
            						"multicluster.dsl.MultiClusterDsl.Deployment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMultiClusterDsl.g:228:3: ( (lv_ingress_4_0= ruleIngress ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMultiClusterDsl.g:229:4: (lv_ingress_4_0= ruleIngress )
                    {
                    // InternalMultiClusterDsl.g:229:4: (lv_ingress_4_0= ruleIngress )
                    // InternalMultiClusterDsl.g:230:5: lv_ingress_4_0= ruleIngress
                    {

                    					newCompositeNode(grammarAccess.getClusterAccess().getIngressIngressParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_ingress_4_0=ruleIngress();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterRule());
                    					}
                    					set(
                    						current,
                    						"ingress",
                    						lv_ingress_4_0,
                    						"multicluster.dsl.MultiClusterDsl.Ingress");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleDeployment"
    // InternalMultiClusterDsl.g:255:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalMultiClusterDsl.g:255:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalMultiClusterDsl.g:256:2: iv_ruleDeployment= ruleDeployment EOF
            {
             newCompositeNode(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeployment=ruleDeployment();

            state._fsp--;

             current =iv_ruleDeployment; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalMultiClusterDsl.g:262:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) otherlv_7= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_image_3_0=null;
        Token otherlv_4=null;
        Token lv_replicas_5_0=null;
        Token otherlv_7=null;
        EObject lv_resources_6_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:268:2: ( (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) otherlv_7= '}' ) )
            // InternalMultiClusterDsl.g:269:2: (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) otherlv_7= '}' )
            {
            // InternalMultiClusterDsl.g:269:2: (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) otherlv_7= '}' )
            // InternalMultiClusterDsl.g:270:3: otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getImageKeyword_2());
            		
            // InternalMultiClusterDsl.g:282:3: ( (lv_image_3_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:283:4: (lv_image_3_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:283:4: (lv_image_3_0= RULE_STRING )
            // InternalMultiClusterDsl.g:284:5: lv_image_3_0= RULE_STRING
            {
            lv_image_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_image_3_0, grammarAccess.getDeploymentAccess().getImageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeploymentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"image",
            						lv_image_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getDeploymentAccess().getReplicasKeyword_4());
            		
            // InternalMultiClusterDsl.g:304:3: ( (lv_replicas_5_0= RULE_INT ) )
            // InternalMultiClusterDsl.g:305:4: (lv_replicas_5_0= RULE_INT )
            {
            // InternalMultiClusterDsl.g:305:4: (lv_replicas_5_0= RULE_INT )
            // InternalMultiClusterDsl.g:306:5: lv_replicas_5_0= RULE_INT
            {
            lv_replicas_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_replicas_5_0, grammarAccess.getDeploymentAccess().getReplicasINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeploymentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"replicas",
            						lv_replicas_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMultiClusterDsl.g:322:3: ( (lv_resources_6_0= ruleResources ) )
            // InternalMultiClusterDsl.g:323:4: (lv_resources_6_0= ruleResources )
            {
            // InternalMultiClusterDsl.g:323:4: (lv_resources_6_0= ruleResources )
            // InternalMultiClusterDsl.g:324:5: lv_resources_6_0= ruleResources
            {

            					newCompositeNode(grammarAccess.getDeploymentAccess().getResourcesResourcesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_resources_6_0=ruleResources();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeploymentRule());
            					}
            					set(
            						current,
            						"resources",
            						lv_resources_6_0,
            						"multicluster.dsl.MultiClusterDsl.Resources");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleResources"
    // InternalMultiClusterDsl.g:349:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalMultiClusterDsl.g:349:50: (iv_ruleResources= ruleResources EOF )
            // InternalMultiClusterDsl.g:350:2: iv_ruleResources= ruleResources EOF
            {
             newCompositeNode(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResources=ruleResources();

            state._fsp--;

             current =iv_ruleResources; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalMultiClusterDsl.g:356:1: ruleResources returns [EObject current=null] : (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleResources() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_cpu_3_0=null;
        Token otherlv_4=null;
        Token lv_memory_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMultiClusterDsl.g:362:2: ( (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMultiClusterDsl.g:363:2: (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMultiClusterDsl.g:363:2: (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMultiClusterDsl.g:364:3: otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getResourcesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getResourcesAccess().getCpuKeyword_2());
            		
            // InternalMultiClusterDsl.g:376:3: ( (lv_cpu_3_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:377:4: (lv_cpu_3_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:377:4: (lv_cpu_3_0= RULE_STRING )
            // InternalMultiClusterDsl.g:378:5: lv_cpu_3_0= RULE_STRING
            {
            lv_cpu_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_cpu_3_0, grammarAccess.getResourcesAccess().getCpuSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourcesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cpu",
            						lv_cpu_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getResourcesAccess().getMemoryKeyword_4());
            		
            // InternalMultiClusterDsl.g:398:3: ( (lv_memory_5_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:399:4: (lv_memory_5_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:399:4: (lv_memory_5_0= RULE_STRING )
            // InternalMultiClusterDsl.g:400:5: lv_memory_5_0= RULE_STRING
            {
            lv_memory_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_memory_5_0, grammarAccess.getResourcesAccess().getMemorySTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourcesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"memory",
            						lv_memory_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleIngress"
    // InternalMultiClusterDsl.g:424:1: entryRuleIngress returns [EObject current=null] : iv_ruleIngress= ruleIngress EOF ;
    public final EObject entryRuleIngress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngress = null;


        try {
            // InternalMultiClusterDsl.g:424:48: (iv_ruleIngress= ruleIngress EOF )
            // InternalMultiClusterDsl.g:425:2: iv_ruleIngress= ruleIngress EOF
            {
             newCompositeNode(grammarAccess.getIngressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIngress=ruleIngress();

            state._fsp--;

             current =iv_ruleIngress; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIngress"


    // $ANTLR start "ruleIngress"
    // InternalMultiClusterDsl.g:431:1: ruleIngress returns [EObject current=null] : (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleIngress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMultiClusterDsl.g:437:2: ( (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalMultiClusterDsl.g:438:2: (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalMultiClusterDsl.g:438:2: (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalMultiClusterDsl.g:439:3: otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIngressAccess().getIngressKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIngressAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getIngressAccess().getPathKeyword_2());
            		
            // InternalMultiClusterDsl.g:451:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:452:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:452:4: (lv_path_3_0= RULE_STRING )
            // InternalMultiClusterDsl.g:453:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_path_3_0, grammarAccess.getIngressAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIngressRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIngressAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleIngress"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});

}