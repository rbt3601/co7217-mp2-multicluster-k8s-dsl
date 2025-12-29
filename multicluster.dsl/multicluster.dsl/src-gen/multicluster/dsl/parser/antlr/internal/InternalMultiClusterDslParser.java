package multicluster.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'namespace'", "'}'", "'cluster'", "'deployment'", "'image'", "'replicas'", "'resources'", "'cpu'", "'memory'", "'health'", "'readinessPath'", "'livenessPath'", "'service'", "'type'", "'port'", "'targetPort'", "'ingress'", "'path'", "'configMap'", "'autoscaling'", "'minReplicas'", "'maxReplicas'", "'cpuUtilization'", "'ClusterIP'", "'NodePort'", "'LoadBalancer'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalMultiClusterDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMultiClusterDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMultiClusterDsl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalMultiClusterDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_application_0_0= ruleApplication ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_application_0_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:78:2: ( ( (lv_application_0_0= ruleApplication ) ) )
            // InternalMultiClusterDsl.g:79:2: ( (lv_application_0_0= ruleApplication ) )
            {
            // InternalMultiClusterDsl.g:79:2: ( (lv_application_0_0= ruleApplication ) )
            // InternalMultiClusterDsl.g:80:3: (lv_application_0_0= ruleApplication )
            {
            // InternalMultiClusterDsl.g:80:3: (lv_application_0_0= ruleApplication )
            // InternalMultiClusterDsl.g:81:4: lv_application_0_0= ruleApplication
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
    // InternalMultiClusterDsl.g:101:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMultiClusterDsl.g:101:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalMultiClusterDsl.g:102:2: iv_ruleApplication= ruleApplication EOF
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
    // InternalMultiClusterDsl.g:108:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= RULE_STRING ) ) )? ( (lv_clusters_5_0= ruleCluster ) )* otherlv_6= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_namespace_4_0=null;
        Token otherlv_6=null;
        EObject lv_clusters_5_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:114:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= RULE_STRING ) ) )? ( (lv_clusters_5_0= ruleCluster ) )* otherlv_6= '}' ) )
            // InternalMultiClusterDsl.g:115:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= RULE_STRING ) ) )? ( (lv_clusters_5_0= ruleCluster ) )* otherlv_6= '}' )
            {
            // InternalMultiClusterDsl.g:115:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= RULE_STRING ) ) )? ( (lv_clusters_5_0= ruleCluster ) )* otherlv_6= '}' )
            // InternalMultiClusterDsl.g:116:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'namespace' ( (lv_namespace_4_0= RULE_STRING ) ) )? ( (lv_clusters_5_0= ruleCluster ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            // InternalMultiClusterDsl.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMultiClusterDsl.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMultiClusterDsl.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalMultiClusterDsl.g:122:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMultiClusterDsl.g:142:3: (otherlv_3= 'namespace' ( (lv_namespace_4_0= RULE_STRING ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMultiClusterDsl.g:143:4: otherlv_3= 'namespace' ( (lv_namespace_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getNamespaceKeyword_3_0());
                    			
                    // InternalMultiClusterDsl.g:147:4: ( (lv_namespace_4_0= RULE_STRING ) )
                    // InternalMultiClusterDsl.g:148:5: (lv_namespace_4_0= RULE_STRING )
                    {
                    // InternalMultiClusterDsl.g:148:5: (lv_namespace_4_0= RULE_STRING )
                    // InternalMultiClusterDsl.g:149:6: lv_namespace_4_0= RULE_STRING
                    {
                    lv_namespace_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_namespace_4_0, grammarAccess.getApplicationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getApplicationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"namespace",
                    							lv_namespace_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMultiClusterDsl.g:166:3: ( (lv_clusters_5_0= ruleCluster ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMultiClusterDsl.g:167:4: (lv_clusters_5_0= ruleCluster )
            	    {
            	    // InternalMultiClusterDsl.g:167:4: (lv_clusters_5_0= ruleCluster )
            	    // InternalMultiClusterDsl.g:168:5: lv_clusters_5_0= ruleCluster
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getClustersClusterParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_clusters_5_0=ruleCluster();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"clusters",
            	    						lv_clusters_5_0,
            	    						"multicluster.dsl.MultiClusterDsl.Cluster");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMultiClusterDsl.g:193:1: entryRuleCluster returns [EObject current=null] : iv_ruleCluster= ruleCluster EOF ;
    public final EObject entryRuleCluster() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCluster = null;


        try {
            // InternalMultiClusterDsl.g:193:48: (iv_ruleCluster= ruleCluster EOF )
            // InternalMultiClusterDsl.g:194:2: iv_ruleCluster= ruleCluster EOF
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
    // InternalMultiClusterDsl.g:200:1: ruleCluster returns [EObject current=null] : (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_service_4_0= ruleService ) )? ( (lv_ingress_5_0= ruleIngress ) )? ( (lv_configMap_6_0= ruleConfigMap ) )? ( (lv_autoscaling_7_0= ruleAutoScaling ) )? otherlv_8= '}' ) ;
    public final EObject ruleCluster() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_deployment_3_0 = null;

        EObject lv_service_4_0 = null;

        EObject lv_ingress_5_0 = null;

        EObject lv_configMap_6_0 = null;

        EObject lv_autoscaling_7_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:206:2: ( (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_service_4_0= ruleService ) )? ( (lv_ingress_5_0= ruleIngress ) )? ( (lv_configMap_6_0= ruleConfigMap ) )? ( (lv_autoscaling_7_0= ruleAutoScaling ) )? otherlv_8= '}' ) )
            // InternalMultiClusterDsl.g:207:2: (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_service_4_0= ruleService ) )? ( (lv_ingress_5_0= ruleIngress ) )? ( (lv_configMap_6_0= ruleConfigMap ) )? ( (lv_autoscaling_7_0= ruleAutoScaling ) )? otherlv_8= '}' )
            {
            // InternalMultiClusterDsl.g:207:2: (otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_service_4_0= ruleService ) )? ( (lv_ingress_5_0= ruleIngress ) )? ( (lv_configMap_6_0= ruleConfigMap ) )? ( (lv_autoscaling_7_0= ruleAutoScaling ) )? otherlv_8= '}' )
            // InternalMultiClusterDsl.g:208:3: otherlv_0= 'cluster' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_deployment_3_0= ruleDeployment ) ) ( (lv_service_4_0= ruleService ) )? ( (lv_ingress_5_0= ruleIngress ) )? ( (lv_configMap_6_0= ruleConfigMap ) )? ( (lv_autoscaling_7_0= ruleAutoScaling ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClusterAccess().getClusterKeyword_0());
            		
            // InternalMultiClusterDsl.g:212:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMultiClusterDsl.g:213:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMultiClusterDsl.g:213:4: (lv_name_1_0= RULE_ID )
            // InternalMultiClusterDsl.g:214:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMultiClusterDsl.g:234:3: ( (lv_deployment_3_0= ruleDeployment ) )
            // InternalMultiClusterDsl.g:235:4: (lv_deployment_3_0= ruleDeployment )
            {
            // InternalMultiClusterDsl.g:235:4: (lv_deployment_3_0= ruleDeployment )
            // InternalMultiClusterDsl.g:236:5: lv_deployment_3_0= ruleDeployment
            {

            					newCompositeNode(grammarAccess.getClusterAccess().getDeploymentDeploymentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalMultiClusterDsl.g:253:3: ( (lv_service_4_0= ruleService ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMultiClusterDsl.g:254:4: (lv_service_4_0= ruleService )
                    {
                    // InternalMultiClusterDsl.g:254:4: (lv_service_4_0= ruleService )
                    // InternalMultiClusterDsl.g:255:5: lv_service_4_0= ruleService
                    {

                    					newCompositeNode(grammarAccess.getClusterAccess().getServiceServiceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_service_4_0=ruleService();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterRule());
                    					}
                    					set(
                    						current,
                    						"service",
                    						lv_service_4_0,
                    						"multicluster.dsl.MultiClusterDsl.Service");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMultiClusterDsl.g:272:3: ( (lv_ingress_5_0= ruleIngress ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMultiClusterDsl.g:273:4: (lv_ingress_5_0= ruleIngress )
                    {
                    // InternalMultiClusterDsl.g:273:4: (lv_ingress_5_0= ruleIngress )
                    // InternalMultiClusterDsl.g:274:5: lv_ingress_5_0= ruleIngress
                    {

                    					newCompositeNode(grammarAccess.getClusterAccess().getIngressIngressParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_ingress_5_0=ruleIngress();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterRule());
                    					}
                    					set(
                    						current,
                    						"ingress",
                    						lv_ingress_5_0,
                    						"multicluster.dsl.MultiClusterDsl.Ingress");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMultiClusterDsl.g:291:3: ( (lv_configMap_6_0= ruleConfigMap ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMultiClusterDsl.g:292:4: (lv_configMap_6_0= ruleConfigMap )
                    {
                    // InternalMultiClusterDsl.g:292:4: (lv_configMap_6_0= ruleConfigMap )
                    // InternalMultiClusterDsl.g:293:5: lv_configMap_6_0= ruleConfigMap
                    {

                    					newCompositeNode(grammarAccess.getClusterAccess().getConfigMapConfigMapParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_configMap_6_0=ruleConfigMap();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterRule());
                    					}
                    					set(
                    						current,
                    						"configMap",
                    						lv_configMap_6_0,
                    						"multicluster.dsl.MultiClusterDsl.ConfigMap");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMultiClusterDsl.g:310:3: ( (lv_autoscaling_7_0= ruleAutoScaling ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMultiClusterDsl.g:311:4: (lv_autoscaling_7_0= ruleAutoScaling )
                    {
                    // InternalMultiClusterDsl.g:311:4: (lv_autoscaling_7_0= ruleAutoScaling )
                    // InternalMultiClusterDsl.g:312:5: lv_autoscaling_7_0= ruleAutoScaling
                    {

                    					newCompositeNode(grammarAccess.getClusterAccess().getAutoscalingAutoScalingParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_autoscaling_7_0=ruleAutoScaling();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClusterRule());
                    					}
                    					set(
                    						current,
                    						"autoscaling",
                    						lv_autoscaling_7_0,
                    						"multicluster.dsl.MultiClusterDsl.AutoScaling");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMultiClusterDsl.g:337:1: entryRuleDeployment returns [EObject current=null] : iv_ruleDeployment= ruleDeployment EOF ;
    public final EObject entryRuleDeployment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeployment = null;


        try {
            // InternalMultiClusterDsl.g:337:51: (iv_ruleDeployment= ruleDeployment EOF )
            // InternalMultiClusterDsl.g:338:2: iv_ruleDeployment= ruleDeployment EOF
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
    // InternalMultiClusterDsl.g:344:1: ruleDeployment returns [EObject current=null] : (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) ( (lv_health_7_0= ruleHealth ) )? otherlv_8= '}' ) ;
    public final EObject ruleDeployment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_image_3_0=null;
        Token otherlv_4=null;
        Token lv_replicas_5_0=null;
        Token otherlv_8=null;
        EObject lv_resources_6_0 = null;

        EObject lv_health_7_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:350:2: ( (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) ( (lv_health_7_0= ruleHealth ) )? otherlv_8= '}' ) )
            // InternalMultiClusterDsl.g:351:2: (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) ( (lv_health_7_0= ruleHealth ) )? otherlv_8= '}' )
            {
            // InternalMultiClusterDsl.g:351:2: (otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) ( (lv_health_7_0= ruleHealth ) )? otherlv_8= '}' )
            // InternalMultiClusterDsl.g:352:3: otherlv_0= 'deployment' otherlv_1= '{' otherlv_2= 'image' ( (lv_image_3_0= RULE_STRING ) ) otherlv_4= 'replicas' ( (lv_replicas_5_0= RULE_INT ) ) ( (lv_resources_6_0= ruleResources ) ) ( (lv_health_7_0= ruleHealth ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDeploymentAccess().getDeploymentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDeploymentAccess().getImageKeyword_2());
            		
            // InternalMultiClusterDsl.g:364:3: ( (lv_image_3_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:365:4: (lv_image_3_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:365:4: (lv_image_3_0= RULE_STRING )
            // InternalMultiClusterDsl.g:366:5: lv_image_3_0= RULE_STRING
            {
            lv_image_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getDeploymentAccess().getReplicasKeyword_4());
            		
            // InternalMultiClusterDsl.g:386:3: ( (lv_replicas_5_0= RULE_INT ) )
            // InternalMultiClusterDsl.g:387:4: (lv_replicas_5_0= RULE_INT )
            {
            // InternalMultiClusterDsl.g:387:4: (lv_replicas_5_0= RULE_INT )
            // InternalMultiClusterDsl.g:388:5: lv_replicas_5_0= RULE_INT
            {
            lv_replicas_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            // InternalMultiClusterDsl.g:404:3: ( (lv_resources_6_0= ruleResources ) )
            // InternalMultiClusterDsl.g:405:4: (lv_resources_6_0= ruleResources )
            {
            // InternalMultiClusterDsl.g:405:4: (lv_resources_6_0= ruleResources )
            // InternalMultiClusterDsl.g:406:5: lv_resources_6_0= ruleResources
            {

            					newCompositeNode(grammarAccess.getDeploymentAccess().getResourcesResourcesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMultiClusterDsl.g:423:3: ( (lv_health_7_0= ruleHealth ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMultiClusterDsl.g:424:4: (lv_health_7_0= ruleHealth )
                    {
                    // InternalMultiClusterDsl.g:424:4: (lv_health_7_0= ruleHealth )
                    // InternalMultiClusterDsl.g:425:5: lv_health_7_0= ruleHealth
                    {

                    					newCompositeNode(grammarAccess.getDeploymentAccess().getHealthHealthParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_health_7_0=ruleHealth();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeploymentRule());
                    					}
                    					set(
                    						current,
                    						"health",
                    						lv_health_7_0,
                    						"multicluster.dsl.MultiClusterDsl.Health");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMultiClusterDsl.g:450:1: entryRuleResources returns [EObject current=null] : iv_ruleResources= ruleResources EOF ;
    public final EObject entryRuleResources() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResources = null;


        try {
            // InternalMultiClusterDsl.g:450:50: (iv_ruleResources= ruleResources EOF )
            // InternalMultiClusterDsl.g:451:2: iv_ruleResources= ruleResources EOF
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
    // InternalMultiClusterDsl.g:457:1: ruleResources returns [EObject current=null] : (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
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
            // InternalMultiClusterDsl.g:463:2: ( (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMultiClusterDsl.g:464:2: (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMultiClusterDsl.g:464:2: (otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMultiClusterDsl.g:465:3: otherlv_0= 'resources' otherlv_1= '{' otherlv_2= 'cpu' ( (lv_cpu_3_0= RULE_STRING ) ) otherlv_4= 'memory' ( (lv_memory_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResourcesAccess().getResourcesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getResourcesAccess().getCpuKeyword_2());
            		
            // InternalMultiClusterDsl.g:477:3: ( (lv_cpu_3_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:478:4: (lv_cpu_3_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:478:4: (lv_cpu_3_0= RULE_STRING )
            // InternalMultiClusterDsl.g:479:5: lv_cpu_3_0= RULE_STRING
            {
            lv_cpu_3_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            otherlv_4=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getResourcesAccess().getMemoryKeyword_4());
            		
            // InternalMultiClusterDsl.g:499:3: ( (lv_memory_5_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:500:4: (lv_memory_5_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:500:4: (lv_memory_5_0= RULE_STRING )
            // InternalMultiClusterDsl.g:501:5: lv_memory_5_0= RULE_STRING
            {
            lv_memory_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleHealth"
    // InternalMultiClusterDsl.g:525:1: entryRuleHealth returns [EObject current=null] : iv_ruleHealth= ruleHealth EOF ;
    public final EObject entryRuleHealth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealth = null;


        try {
            // InternalMultiClusterDsl.g:525:47: (iv_ruleHealth= ruleHealth EOF )
            // InternalMultiClusterDsl.g:526:2: iv_ruleHealth= ruleHealth EOF
            {
             newCompositeNode(grammarAccess.getHealthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealth=ruleHealth();

            state._fsp--;

             current =iv_ruleHealth; 
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
    // $ANTLR end "entryRuleHealth"


    // $ANTLR start "ruleHealth"
    // InternalMultiClusterDsl.g:532:1: ruleHealth returns [EObject current=null] : (otherlv_0= 'health' otherlv_1= '{' otherlv_2= 'readinessPath' ( (lv_readinessPath_3_0= RULE_STRING ) ) otherlv_4= 'livenessPath' ( (lv_livenessPath_5_0= RULE_STRING ) ) otherlv_6= '}' ) ;
    public final EObject ruleHealth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_readinessPath_3_0=null;
        Token otherlv_4=null;
        Token lv_livenessPath_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMultiClusterDsl.g:538:2: ( (otherlv_0= 'health' otherlv_1= '{' otherlv_2= 'readinessPath' ( (lv_readinessPath_3_0= RULE_STRING ) ) otherlv_4= 'livenessPath' ( (lv_livenessPath_5_0= RULE_STRING ) ) otherlv_6= '}' ) )
            // InternalMultiClusterDsl.g:539:2: (otherlv_0= 'health' otherlv_1= '{' otherlv_2= 'readinessPath' ( (lv_readinessPath_3_0= RULE_STRING ) ) otherlv_4= 'livenessPath' ( (lv_livenessPath_5_0= RULE_STRING ) ) otherlv_6= '}' )
            {
            // InternalMultiClusterDsl.g:539:2: (otherlv_0= 'health' otherlv_1= '{' otherlv_2= 'readinessPath' ( (lv_readinessPath_3_0= RULE_STRING ) ) otherlv_4= 'livenessPath' ( (lv_livenessPath_5_0= RULE_STRING ) ) otherlv_6= '}' )
            // InternalMultiClusterDsl.g:540:3: otherlv_0= 'health' otherlv_1= '{' otherlv_2= 'readinessPath' ( (lv_readinessPath_3_0= RULE_STRING ) ) otherlv_4= 'livenessPath' ( (lv_livenessPath_5_0= RULE_STRING ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHealthAccess().getHealthKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getHealthAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getHealthAccess().getReadinessPathKeyword_2());
            		
            // InternalMultiClusterDsl.g:552:3: ( (lv_readinessPath_3_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:553:4: (lv_readinessPath_3_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:553:4: (lv_readinessPath_3_0= RULE_STRING )
            // InternalMultiClusterDsl.g:554:5: lv_readinessPath_3_0= RULE_STRING
            {
            lv_readinessPath_3_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_readinessPath_3_0, grammarAccess.getHealthAccess().getReadinessPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"readinessPath",
            						lv_readinessPath_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getHealthAccess().getLivenessPathKeyword_4());
            		
            // InternalMultiClusterDsl.g:574:3: ( (lv_livenessPath_5_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:575:4: (lv_livenessPath_5_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:575:4: (lv_livenessPath_5_0= RULE_STRING )
            // InternalMultiClusterDsl.g:576:5: lv_livenessPath_5_0= RULE_STRING
            {
            lv_livenessPath_5_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            					newLeafNode(lv_livenessPath_5_0, grammarAccess.getHealthAccess().getLivenessPathSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHealthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"livenessPath",
            						lv_livenessPath_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getHealthAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleHealth"


    // $ANTLR start "entryRuleService"
    // InternalMultiClusterDsl.g:600:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalMultiClusterDsl.g:600:48: (iv_ruleService= ruleService EOF )
            // InternalMultiClusterDsl.g:601:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMultiClusterDsl.g:607:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleServiceType ) ) otherlv_4= 'port' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= 'targetPort' ( (lv_targetPort_7_0= RULE_INT ) ) otherlv_8= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_port_5_0=null;
        Token otherlv_6=null;
        Token lv_targetPort_7_0=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:613:2: ( (otherlv_0= 'service' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleServiceType ) ) otherlv_4= 'port' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= 'targetPort' ( (lv_targetPort_7_0= RULE_INT ) ) otherlv_8= '}' ) )
            // InternalMultiClusterDsl.g:614:2: (otherlv_0= 'service' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleServiceType ) ) otherlv_4= 'port' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= 'targetPort' ( (lv_targetPort_7_0= RULE_INT ) ) otherlv_8= '}' )
            {
            // InternalMultiClusterDsl.g:614:2: (otherlv_0= 'service' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleServiceType ) ) otherlv_4= 'port' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= 'targetPort' ( (lv_targetPort_7_0= RULE_INT ) ) otherlv_8= '}' )
            // InternalMultiClusterDsl.g:615:3: otherlv_0= 'service' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleServiceType ) ) otherlv_4= 'port' ( (lv_port_5_0= RULE_INT ) ) otherlv_6= 'targetPort' ( (lv_targetPort_7_0= RULE_INT ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getTypeKeyword_2());
            		
            // InternalMultiClusterDsl.g:627:3: ( (lv_type_3_0= ruleServiceType ) )
            // InternalMultiClusterDsl.g:628:4: (lv_type_3_0= ruleServiceType )
            {
            // InternalMultiClusterDsl.g:628:4: (lv_type_3_0= ruleServiceType )
            // InternalMultiClusterDsl.g:629:5: lv_type_3_0= ruleServiceType
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getTypeServiceTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_type_3_0=ruleServiceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"multicluster.dsl.MultiClusterDsl.ServiceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getPortKeyword_4());
            		
            // InternalMultiClusterDsl.g:650:3: ( (lv_port_5_0= RULE_INT ) )
            // InternalMultiClusterDsl.g:651:4: (lv_port_5_0= RULE_INT )
            {
            // InternalMultiClusterDsl.g:651:4: (lv_port_5_0= RULE_INT )
            // InternalMultiClusterDsl.g:652:5: lv_port_5_0= RULE_INT
            {
            lv_port_5_0=(Token)match(input,RULE_INT,FOLLOW_26); 

            					newLeafNode(lv_port_5_0, grammarAccess.getServiceAccess().getPortINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getTargetPortKeyword_6());
            		
            // InternalMultiClusterDsl.g:672:3: ( (lv_targetPort_7_0= RULE_INT ) )
            // InternalMultiClusterDsl.g:673:4: (lv_targetPort_7_0= RULE_INT )
            {
            // InternalMultiClusterDsl.g:673:4: (lv_targetPort_7_0= RULE_INT )
            // InternalMultiClusterDsl.g:674:5: lv_targetPort_7_0= RULE_INT
            {
            lv_targetPort_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_targetPort_7_0, grammarAccess.getServiceAccess().getTargetPortINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"targetPort",
            						lv_targetPort_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleIngress"
    // InternalMultiClusterDsl.g:698:1: entryRuleIngress returns [EObject current=null] : iv_ruleIngress= ruleIngress EOF ;
    public final EObject entryRuleIngress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngress = null;


        try {
            // InternalMultiClusterDsl.g:698:48: (iv_ruleIngress= ruleIngress EOF )
            // InternalMultiClusterDsl.g:699:2: iv_ruleIngress= ruleIngress EOF
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
    // InternalMultiClusterDsl.g:705:1: ruleIngress returns [EObject current=null] : (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' ) ;
    public final EObject ruleIngress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMultiClusterDsl.g:711:2: ( (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' ) )
            // InternalMultiClusterDsl.g:712:2: (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' )
            {
            // InternalMultiClusterDsl.g:712:2: (otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}' )
            // InternalMultiClusterDsl.g:713:3: otherlv_0= 'ingress' otherlv_1= '{' otherlv_2= 'path' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIngressAccess().getIngressKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getIngressAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getIngressAccess().getPathKeyword_2());
            		
            // InternalMultiClusterDsl.g:725:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:726:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:726:4: (lv_path_3_0= RULE_STRING )
            // InternalMultiClusterDsl.g:727:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleConfigMap"
    // InternalMultiClusterDsl.g:751:1: entryRuleConfigMap returns [EObject current=null] : iv_ruleConfigMap= ruleConfigMap EOF ;
    public final EObject entryRuleConfigMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigMap = null;


        try {
            // InternalMultiClusterDsl.g:751:50: (iv_ruleConfigMap= ruleConfigMap EOF )
            // InternalMultiClusterDsl.g:752:2: iv_ruleConfigMap= ruleConfigMap EOF
            {
             newCompositeNode(grammarAccess.getConfigMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigMap=ruleConfigMap();

            state._fsp--;

             current =iv_ruleConfigMap; 
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
    // $ANTLR end "entryRuleConfigMap"


    // $ANTLR start "ruleConfigMap"
    // InternalMultiClusterDsl.g:758:1: ruleConfigMap returns [EObject current=null] : (otherlv_0= 'configMap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleConfigEntry ) )+ otherlv_4= '}' ) ;
    public final EObject ruleConfigMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalMultiClusterDsl.g:764:2: ( (otherlv_0= 'configMap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleConfigEntry ) )+ otherlv_4= '}' ) )
            // InternalMultiClusterDsl.g:765:2: (otherlv_0= 'configMap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleConfigEntry ) )+ otherlv_4= '}' )
            {
            // InternalMultiClusterDsl.g:765:2: (otherlv_0= 'configMap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleConfigEntry ) )+ otherlv_4= '}' )
            // InternalMultiClusterDsl.g:766:3: otherlv_0= 'configMap' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entries_3_0= ruleConfigEntry ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigMapAccess().getConfigMapKeyword_0());
            		
            // InternalMultiClusterDsl.g:770:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMultiClusterDsl.g:771:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMultiClusterDsl.g:771:4: (lv_name_1_0= RULE_ID )
            // InternalMultiClusterDsl.g:772:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigMapAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigMapRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigMapAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMultiClusterDsl.g:792:3: ( (lv_entries_3_0= ruleConfigEntry ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMultiClusterDsl.g:793:4: (lv_entries_3_0= ruleConfigEntry )
            	    {
            	    // InternalMultiClusterDsl.g:793:4: (lv_entries_3_0= ruleConfigEntry )
            	    // InternalMultiClusterDsl.g:794:5: lv_entries_3_0= ruleConfigEntry
            	    {

            	    					newCompositeNode(grammarAccess.getConfigMapAccess().getEntriesConfigEntryParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_entries_3_0=ruleConfigEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigMapRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entries",
            	    						lv_entries_3_0,
            	    						"multicluster.dsl.MultiClusterDsl.ConfigEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigMapAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleConfigMap"


    // $ANTLR start "entryRuleConfigEntry"
    // InternalMultiClusterDsl.g:819:1: entryRuleConfigEntry returns [EObject current=null] : iv_ruleConfigEntry= ruleConfigEntry EOF ;
    public final EObject entryRuleConfigEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigEntry = null;


        try {
            // InternalMultiClusterDsl.g:819:52: (iv_ruleConfigEntry= ruleConfigEntry EOF )
            // InternalMultiClusterDsl.g:820:2: iv_ruleConfigEntry= ruleConfigEntry EOF
            {
             newCompositeNode(grammarAccess.getConfigEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigEntry=ruleConfigEntry();

            state._fsp--;

             current =iv_ruleConfigEntry; 
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
    // $ANTLR end "entryRuleConfigEntry"


    // $ANTLR start "ruleConfigEntry"
    // InternalMultiClusterDsl.g:826:1: ruleConfigEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfigEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMultiClusterDsl.g:832:2: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalMultiClusterDsl.g:833:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalMultiClusterDsl.g:833:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalMultiClusterDsl.g:834:3: ( (lv_key_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalMultiClusterDsl.g:834:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalMultiClusterDsl.g:835:4: (lv_key_0_0= RULE_ID )
            {
            // InternalMultiClusterDsl.g:835:4: (lv_key_0_0= RULE_ID )
            // InternalMultiClusterDsl.g:836:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_key_0_0, grammarAccess.getConfigEntryAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMultiClusterDsl.g:852:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalMultiClusterDsl.g:853:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalMultiClusterDsl.g:853:4: (lv_value_1_0= RULE_STRING )
            // InternalMultiClusterDsl.g:854:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getConfigEntryAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


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
    // $ANTLR end "ruleConfigEntry"


    // $ANTLR start "entryRuleAutoScaling"
    // InternalMultiClusterDsl.g:874:1: entryRuleAutoScaling returns [EObject current=null] : iv_ruleAutoScaling= ruleAutoScaling EOF ;
    public final EObject entryRuleAutoScaling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoScaling = null;


        try {
            // InternalMultiClusterDsl.g:874:52: (iv_ruleAutoScaling= ruleAutoScaling EOF )
            // InternalMultiClusterDsl.g:875:2: iv_ruleAutoScaling= ruleAutoScaling EOF
            {
             newCompositeNode(grammarAccess.getAutoScalingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutoScaling=ruleAutoScaling();

            state._fsp--;

             current =iv_ruleAutoScaling; 
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
    // $ANTLR end "entryRuleAutoScaling"


    // $ANTLR start "ruleAutoScaling"
    // InternalMultiClusterDsl.g:881:1: ruleAutoScaling returns [EObject current=null] : (otherlv_0= 'autoscaling' otherlv_1= '{' otherlv_2= 'minReplicas' ( (lv_minReplicas_3_0= RULE_INT ) ) otherlv_4= 'maxReplicas' ( (lv_maxReplicas_5_0= RULE_INT ) ) otherlv_6= 'cpuUtilization' ( (lv_cpuUtilization_7_0= RULE_INT ) ) otherlv_8= '}' ) ;
    public final EObject ruleAutoScaling() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_minReplicas_3_0=null;
        Token otherlv_4=null;
        Token lv_maxReplicas_5_0=null;
        Token otherlv_6=null;
        Token lv_cpuUtilization_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMultiClusterDsl.g:887:2: ( (otherlv_0= 'autoscaling' otherlv_1= '{' otherlv_2= 'minReplicas' ( (lv_minReplicas_3_0= RULE_INT ) ) otherlv_4= 'maxReplicas' ( (lv_maxReplicas_5_0= RULE_INT ) ) otherlv_6= 'cpuUtilization' ( (lv_cpuUtilization_7_0= RULE_INT ) ) otherlv_8= '}' ) )
            // InternalMultiClusterDsl.g:888:2: (otherlv_0= 'autoscaling' otherlv_1= '{' otherlv_2= 'minReplicas' ( (lv_minReplicas_3_0= RULE_INT ) ) otherlv_4= 'maxReplicas' ( (lv_maxReplicas_5_0= RULE_INT ) ) otherlv_6= 'cpuUtilization' ( (lv_cpuUtilization_7_0= RULE_INT ) ) otherlv_8= '}' )
            {
            // InternalMultiClusterDsl.g:888:2: (otherlv_0= 'autoscaling' otherlv_1= '{' otherlv_2= 'minReplicas' ( (lv_minReplicas_3_0= RULE_INT ) ) otherlv_4= 'maxReplicas' ( (lv_maxReplicas_5_0= RULE_INT ) ) otherlv_6= 'cpuUtilization' ( (lv_cpuUtilization_7_0= RULE_INT ) ) otherlv_8= '}' )
            // InternalMultiClusterDsl.g:889:3: otherlv_0= 'autoscaling' otherlv_1= '{' otherlv_2= 'minReplicas' ( (lv_minReplicas_3_0= RULE_INT ) ) otherlv_4= 'maxReplicas' ( (lv_maxReplicas_5_0= RULE_INT ) ) otherlv_6= 'cpuUtilization' ( (lv_cpuUtilization_7_0= RULE_INT ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAutoScalingAccess().getAutoscalingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAutoScalingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAutoScalingAccess().getMinReplicasKeyword_2());
            		
            // InternalMultiClusterDsl.g:901:3: ( (lv_minReplicas_3_0= RULE_INT ) )
            // InternalMultiClusterDsl.g:902:4: (lv_minReplicas_3_0= RULE_INT )
            {
            // InternalMultiClusterDsl.g:902:4: (lv_minReplicas_3_0= RULE_INT )
            // InternalMultiClusterDsl.g:903:5: lv_minReplicas_3_0= RULE_INT
            {
            lv_minReplicas_3_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_minReplicas_3_0, grammarAccess.getAutoScalingAccess().getMinReplicasINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutoScalingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minReplicas",
            						lv_minReplicas_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAutoScalingAccess().getMaxReplicasKeyword_4());
            		
            // InternalMultiClusterDsl.g:923:3: ( (lv_maxReplicas_5_0= RULE_INT ) )
            // InternalMultiClusterDsl.g:924:4: (lv_maxReplicas_5_0= RULE_INT )
            {
            // InternalMultiClusterDsl.g:924:4: (lv_maxReplicas_5_0= RULE_INT )
            // InternalMultiClusterDsl.g:925:5: lv_maxReplicas_5_0= RULE_INT
            {
            lv_maxReplicas_5_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            					newLeafNode(lv_maxReplicas_5_0, grammarAccess.getAutoScalingAccess().getMaxReplicasINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutoScalingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxReplicas",
            						lv_maxReplicas_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getAutoScalingAccess().getCpuUtilizationKeyword_6());
            		
            // InternalMultiClusterDsl.g:945:3: ( (lv_cpuUtilization_7_0= RULE_INT ) )
            // InternalMultiClusterDsl.g:946:4: (lv_cpuUtilization_7_0= RULE_INT )
            {
            // InternalMultiClusterDsl.g:946:4: (lv_cpuUtilization_7_0= RULE_INT )
            // InternalMultiClusterDsl.g:947:5: lv_cpuUtilization_7_0= RULE_INT
            {
            lv_cpuUtilization_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_cpuUtilization_7_0, grammarAccess.getAutoScalingAccess().getCpuUtilizationINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutoScalingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cpuUtilization",
            						lv_cpuUtilization_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAutoScalingAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAutoScaling"


    // $ANTLR start "ruleServiceType"
    // InternalMultiClusterDsl.g:971:1: ruleServiceType returns [Enumerator current=null] : ( (enumLiteral_0= 'ClusterIP' ) | (enumLiteral_1= 'NodePort' ) | (enumLiteral_2= 'LoadBalancer' ) ) ;
    public final Enumerator ruleServiceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMultiClusterDsl.g:977:2: ( ( (enumLiteral_0= 'ClusterIP' ) | (enumLiteral_1= 'NodePort' ) | (enumLiteral_2= 'LoadBalancer' ) ) )
            // InternalMultiClusterDsl.g:978:2: ( (enumLiteral_0= 'ClusterIP' ) | (enumLiteral_1= 'NodePort' ) | (enumLiteral_2= 'LoadBalancer' ) )
            {
            // InternalMultiClusterDsl.g:978:2: ( (enumLiteral_0= 'ClusterIP' ) | (enumLiteral_1= 'NodePort' ) | (enumLiteral_2= 'LoadBalancer' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case 38:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMultiClusterDsl.g:979:3: (enumLiteral_0= 'ClusterIP' )
                    {
                    // InternalMultiClusterDsl.g:979:3: (enumLiteral_0= 'ClusterIP' )
                    // InternalMultiClusterDsl.g:980:4: enumLiteral_0= 'ClusterIP'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getServiceTypeAccess().getClusterIPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getServiceTypeAccess().getClusterIPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMultiClusterDsl.g:987:3: (enumLiteral_1= 'NodePort' )
                    {
                    // InternalMultiClusterDsl.g:987:3: (enumLiteral_1= 'NodePort' )
                    // InternalMultiClusterDsl.g:988:4: enumLiteral_1= 'NodePort'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getServiceTypeAccess().getNodePortEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getServiceTypeAccess().getNodePortEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMultiClusterDsl.g:995:3: (enumLiteral_2= 'LoadBalancer' )
                    {
                    // InternalMultiClusterDsl.g:995:3: (enumLiteral_2= 'LoadBalancer' )
                    // InternalMultiClusterDsl.g:996:4: enumLiteral_2= 'LoadBalancer'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getServiceTypeAccess().getLoadBalancerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getServiceTypeAccess().getLoadBalancerEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleServiceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001A2004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000001A0004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000180004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});

}