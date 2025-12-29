package multicluster.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import multicluster.dsl.services.MultiClusterDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMultiClusterDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ClusterIP'", "'NodePort'", "'LoadBalancer'", "'application'", "'{'", "'}'", "'namespace'", "'cluster'", "'deployment'", "'image'", "'replicas'", "'resources'", "'cpu'", "'memory'", "'health'", "'readinessPath'", "'livenessPath'", "'service'", "'type'", "'port'", "'targetPort'", "'ingress'", "'path'", "'configMap'", "'autoscaling'", "'minReplicas'", "'maxReplicas'", "'cpuUtilization'"
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

    	public void setGrammarAccess(MultiClusterDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMultiClusterDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:54:1: ( ruleModel EOF )
            // InternalMultiClusterDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMultiClusterDsl.g:62:1: ruleModel : ( ( rule__Model__ApplicationAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:66:2: ( ( ( rule__Model__ApplicationAssignment ) ) )
            // InternalMultiClusterDsl.g:67:2: ( ( rule__Model__ApplicationAssignment ) )
            {
            // InternalMultiClusterDsl.g:67:2: ( ( rule__Model__ApplicationAssignment ) )
            // InternalMultiClusterDsl.g:68:3: ( rule__Model__ApplicationAssignment )
            {
             before(grammarAccess.getModelAccess().getApplicationAssignment()); 
            // InternalMultiClusterDsl.g:69:3: ( rule__Model__ApplicationAssignment )
            // InternalMultiClusterDsl.g:69:4: rule__Model__ApplicationAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ApplicationAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getApplicationAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleApplication"
    // InternalMultiClusterDsl.g:78:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:79:1: ( ruleApplication EOF )
            // InternalMultiClusterDsl.g:80:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMultiClusterDsl.g:87:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:91:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalMultiClusterDsl.g:92:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:92:2: ( ( rule__Application__Group__0 ) )
            // InternalMultiClusterDsl.g:93:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalMultiClusterDsl.g:94:3: ( rule__Application__Group__0 )
            // InternalMultiClusterDsl.g:94:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleCluster"
    // InternalMultiClusterDsl.g:103:1: entryRuleCluster : ruleCluster EOF ;
    public final void entryRuleCluster() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:104:1: ( ruleCluster EOF )
            // InternalMultiClusterDsl.g:105:1: ruleCluster EOF
            {
             before(grammarAccess.getClusterRule()); 
            pushFollow(FOLLOW_1);
            ruleCluster();

            state._fsp--;

             after(grammarAccess.getClusterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCluster"


    // $ANTLR start "ruleCluster"
    // InternalMultiClusterDsl.g:112:1: ruleCluster : ( ( rule__Cluster__Group__0 ) ) ;
    public final void ruleCluster() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:116:2: ( ( ( rule__Cluster__Group__0 ) ) )
            // InternalMultiClusterDsl.g:117:2: ( ( rule__Cluster__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:117:2: ( ( rule__Cluster__Group__0 ) )
            // InternalMultiClusterDsl.g:118:3: ( rule__Cluster__Group__0 )
            {
             before(grammarAccess.getClusterAccess().getGroup()); 
            // InternalMultiClusterDsl.g:119:3: ( rule__Cluster__Group__0 )
            // InternalMultiClusterDsl.g:119:4: rule__Cluster__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cluster__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCluster"


    // $ANTLR start "entryRuleDeployment"
    // InternalMultiClusterDsl.g:128:1: entryRuleDeployment : ruleDeployment EOF ;
    public final void entryRuleDeployment() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:129:1: ( ruleDeployment EOF )
            // InternalMultiClusterDsl.g:130:1: ruleDeployment EOF
            {
             before(grammarAccess.getDeploymentRule()); 
            pushFollow(FOLLOW_1);
            ruleDeployment();

            state._fsp--;

             after(grammarAccess.getDeploymentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeployment"


    // $ANTLR start "ruleDeployment"
    // InternalMultiClusterDsl.g:137:1: ruleDeployment : ( ( rule__Deployment__Group__0 ) ) ;
    public final void ruleDeployment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:141:2: ( ( ( rule__Deployment__Group__0 ) ) )
            // InternalMultiClusterDsl.g:142:2: ( ( rule__Deployment__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:142:2: ( ( rule__Deployment__Group__0 ) )
            // InternalMultiClusterDsl.g:143:3: ( rule__Deployment__Group__0 )
            {
             before(grammarAccess.getDeploymentAccess().getGroup()); 
            // InternalMultiClusterDsl.g:144:3: ( rule__Deployment__Group__0 )
            // InternalMultiClusterDsl.g:144:4: rule__Deployment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeployment"


    // $ANTLR start "entryRuleResources"
    // InternalMultiClusterDsl.g:153:1: entryRuleResources : ruleResources EOF ;
    public final void entryRuleResources() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:154:1: ( ruleResources EOF )
            // InternalMultiClusterDsl.g:155:1: ruleResources EOF
            {
             before(grammarAccess.getResourcesRule()); 
            pushFollow(FOLLOW_1);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getResourcesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResources"


    // $ANTLR start "ruleResources"
    // InternalMultiClusterDsl.g:162:1: ruleResources : ( ( rule__Resources__Group__0 ) ) ;
    public final void ruleResources() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:166:2: ( ( ( rule__Resources__Group__0 ) ) )
            // InternalMultiClusterDsl.g:167:2: ( ( rule__Resources__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:167:2: ( ( rule__Resources__Group__0 ) )
            // InternalMultiClusterDsl.g:168:3: ( rule__Resources__Group__0 )
            {
             before(grammarAccess.getResourcesAccess().getGroup()); 
            // InternalMultiClusterDsl.g:169:3: ( rule__Resources__Group__0 )
            // InternalMultiClusterDsl.g:169:4: rule__Resources__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResources"


    // $ANTLR start "entryRuleHealth"
    // InternalMultiClusterDsl.g:178:1: entryRuleHealth : ruleHealth EOF ;
    public final void entryRuleHealth() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:179:1: ( ruleHealth EOF )
            // InternalMultiClusterDsl.g:180:1: ruleHealth EOF
            {
             before(grammarAccess.getHealthRule()); 
            pushFollow(FOLLOW_1);
            ruleHealth();

            state._fsp--;

             after(grammarAccess.getHealthRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHealth"


    // $ANTLR start "ruleHealth"
    // InternalMultiClusterDsl.g:187:1: ruleHealth : ( ( rule__Health__Group__0 ) ) ;
    public final void ruleHealth() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:191:2: ( ( ( rule__Health__Group__0 ) ) )
            // InternalMultiClusterDsl.g:192:2: ( ( rule__Health__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:192:2: ( ( rule__Health__Group__0 ) )
            // InternalMultiClusterDsl.g:193:3: ( rule__Health__Group__0 )
            {
             before(grammarAccess.getHealthAccess().getGroup()); 
            // InternalMultiClusterDsl.g:194:3: ( rule__Health__Group__0 )
            // InternalMultiClusterDsl.g:194:4: rule__Health__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Health__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHealthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHealth"


    // $ANTLR start "entryRuleService"
    // InternalMultiClusterDsl.g:203:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:204:1: ( ruleService EOF )
            // InternalMultiClusterDsl.g:205:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalMultiClusterDsl.g:212:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:216:2: ( ( ( rule__Service__Group__0 ) ) )
            // InternalMultiClusterDsl.g:217:2: ( ( rule__Service__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:217:2: ( ( rule__Service__Group__0 ) )
            // InternalMultiClusterDsl.g:218:3: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // InternalMultiClusterDsl.g:219:3: ( rule__Service__Group__0 )
            // InternalMultiClusterDsl.g:219:4: rule__Service__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleIngress"
    // InternalMultiClusterDsl.g:228:1: entryRuleIngress : ruleIngress EOF ;
    public final void entryRuleIngress() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:229:1: ( ruleIngress EOF )
            // InternalMultiClusterDsl.g:230:1: ruleIngress EOF
            {
             before(grammarAccess.getIngressRule()); 
            pushFollow(FOLLOW_1);
            ruleIngress();

            state._fsp--;

             after(grammarAccess.getIngressRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngress"


    // $ANTLR start "ruleIngress"
    // InternalMultiClusterDsl.g:237:1: ruleIngress : ( ( rule__Ingress__Group__0 ) ) ;
    public final void ruleIngress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:241:2: ( ( ( rule__Ingress__Group__0 ) ) )
            // InternalMultiClusterDsl.g:242:2: ( ( rule__Ingress__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:242:2: ( ( rule__Ingress__Group__0 ) )
            // InternalMultiClusterDsl.g:243:3: ( rule__Ingress__Group__0 )
            {
             before(grammarAccess.getIngressAccess().getGroup()); 
            // InternalMultiClusterDsl.g:244:3: ( rule__Ingress__Group__0 )
            // InternalMultiClusterDsl.g:244:4: rule__Ingress__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ingress__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngress"


    // $ANTLR start "entryRuleConfigMap"
    // InternalMultiClusterDsl.g:253:1: entryRuleConfigMap : ruleConfigMap EOF ;
    public final void entryRuleConfigMap() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:254:1: ( ruleConfigMap EOF )
            // InternalMultiClusterDsl.g:255:1: ruleConfigMap EOF
            {
             before(grammarAccess.getConfigMapRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigMap();

            state._fsp--;

             after(grammarAccess.getConfigMapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigMap"


    // $ANTLR start "ruleConfigMap"
    // InternalMultiClusterDsl.g:262:1: ruleConfigMap : ( ( rule__ConfigMap__Group__0 ) ) ;
    public final void ruleConfigMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:266:2: ( ( ( rule__ConfigMap__Group__0 ) ) )
            // InternalMultiClusterDsl.g:267:2: ( ( rule__ConfigMap__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:267:2: ( ( rule__ConfigMap__Group__0 ) )
            // InternalMultiClusterDsl.g:268:3: ( rule__ConfigMap__Group__0 )
            {
             before(grammarAccess.getConfigMapAccess().getGroup()); 
            // InternalMultiClusterDsl.g:269:3: ( rule__ConfigMap__Group__0 )
            // InternalMultiClusterDsl.g:269:4: rule__ConfigMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigMap"


    // $ANTLR start "entryRuleConfigEntry"
    // InternalMultiClusterDsl.g:278:1: entryRuleConfigEntry : ruleConfigEntry EOF ;
    public final void entryRuleConfigEntry() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:279:1: ( ruleConfigEntry EOF )
            // InternalMultiClusterDsl.g:280:1: ruleConfigEntry EOF
            {
             before(grammarAccess.getConfigEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleConfigEntry();

            state._fsp--;

             after(grammarAccess.getConfigEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfigEntry"


    // $ANTLR start "ruleConfigEntry"
    // InternalMultiClusterDsl.g:287:1: ruleConfigEntry : ( ( rule__ConfigEntry__Group__0 ) ) ;
    public final void ruleConfigEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:291:2: ( ( ( rule__ConfigEntry__Group__0 ) ) )
            // InternalMultiClusterDsl.g:292:2: ( ( rule__ConfigEntry__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:292:2: ( ( rule__ConfigEntry__Group__0 ) )
            // InternalMultiClusterDsl.g:293:3: ( rule__ConfigEntry__Group__0 )
            {
             before(grammarAccess.getConfigEntryAccess().getGroup()); 
            // InternalMultiClusterDsl.g:294:3: ( rule__ConfigEntry__Group__0 )
            // InternalMultiClusterDsl.g:294:4: rule__ConfigEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfigEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfigEntry"


    // $ANTLR start "entryRuleAutoScaling"
    // InternalMultiClusterDsl.g:303:1: entryRuleAutoScaling : ruleAutoScaling EOF ;
    public final void entryRuleAutoScaling() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:304:1: ( ruleAutoScaling EOF )
            // InternalMultiClusterDsl.g:305:1: ruleAutoScaling EOF
            {
             before(grammarAccess.getAutoScalingRule()); 
            pushFollow(FOLLOW_1);
            ruleAutoScaling();

            state._fsp--;

             after(grammarAccess.getAutoScalingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutoScaling"


    // $ANTLR start "ruleAutoScaling"
    // InternalMultiClusterDsl.g:312:1: ruleAutoScaling : ( ( rule__AutoScaling__Group__0 ) ) ;
    public final void ruleAutoScaling() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:316:2: ( ( ( rule__AutoScaling__Group__0 ) ) )
            // InternalMultiClusterDsl.g:317:2: ( ( rule__AutoScaling__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:317:2: ( ( rule__AutoScaling__Group__0 ) )
            // InternalMultiClusterDsl.g:318:3: ( rule__AutoScaling__Group__0 )
            {
             before(grammarAccess.getAutoScalingAccess().getGroup()); 
            // InternalMultiClusterDsl.g:319:3: ( rule__AutoScaling__Group__0 )
            // InternalMultiClusterDsl.g:319:4: rule__AutoScaling__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutoScalingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutoScaling"


    // $ANTLR start "ruleServiceType"
    // InternalMultiClusterDsl.g:328:1: ruleServiceType : ( ( rule__ServiceType__Alternatives ) ) ;
    public final void ruleServiceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:332:1: ( ( ( rule__ServiceType__Alternatives ) ) )
            // InternalMultiClusterDsl.g:333:2: ( ( rule__ServiceType__Alternatives ) )
            {
            // InternalMultiClusterDsl.g:333:2: ( ( rule__ServiceType__Alternatives ) )
            // InternalMultiClusterDsl.g:334:3: ( rule__ServiceType__Alternatives )
            {
             before(grammarAccess.getServiceTypeAccess().getAlternatives()); 
            // InternalMultiClusterDsl.g:335:3: ( rule__ServiceType__Alternatives )
            // InternalMultiClusterDsl.g:335:4: rule__ServiceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ServiceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceType"


    // $ANTLR start "rule__ServiceType__Alternatives"
    // InternalMultiClusterDsl.g:343:1: rule__ServiceType__Alternatives : ( ( ( 'ClusterIP' ) ) | ( ( 'NodePort' ) ) | ( ( 'LoadBalancer' ) ) );
    public final void rule__ServiceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:347:1: ( ( ( 'ClusterIP' ) ) | ( ( 'NodePort' ) ) | ( ( 'LoadBalancer' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMultiClusterDsl.g:348:2: ( ( 'ClusterIP' ) )
                    {
                    // InternalMultiClusterDsl.g:348:2: ( ( 'ClusterIP' ) )
                    // InternalMultiClusterDsl.g:349:3: ( 'ClusterIP' )
                    {
                     before(grammarAccess.getServiceTypeAccess().getClusterIPEnumLiteralDeclaration_0()); 
                    // InternalMultiClusterDsl.g:350:3: ( 'ClusterIP' )
                    // InternalMultiClusterDsl.g:350:4: 'ClusterIP'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getServiceTypeAccess().getClusterIPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMultiClusterDsl.g:354:2: ( ( 'NodePort' ) )
                    {
                    // InternalMultiClusterDsl.g:354:2: ( ( 'NodePort' ) )
                    // InternalMultiClusterDsl.g:355:3: ( 'NodePort' )
                    {
                     before(grammarAccess.getServiceTypeAccess().getNodePortEnumLiteralDeclaration_1()); 
                    // InternalMultiClusterDsl.g:356:3: ( 'NodePort' )
                    // InternalMultiClusterDsl.g:356:4: 'NodePort'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getServiceTypeAccess().getNodePortEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMultiClusterDsl.g:360:2: ( ( 'LoadBalancer' ) )
                    {
                    // InternalMultiClusterDsl.g:360:2: ( ( 'LoadBalancer' ) )
                    // InternalMultiClusterDsl.g:361:3: ( 'LoadBalancer' )
                    {
                     before(grammarAccess.getServiceTypeAccess().getLoadBalancerEnumLiteralDeclaration_2()); 
                    // InternalMultiClusterDsl.g:362:3: ( 'LoadBalancer' )
                    // InternalMultiClusterDsl.g:362:4: 'LoadBalancer'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getServiceTypeAccess().getLoadBalancerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceType__Alternatives"


    // $ANTLR start "rule__Application__Group__0"
    // InternalMultiClusterDsl.g:370:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:374:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalMultiClusterDsl.g:375:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalMultiClusterDsl.g:382:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:386:1: ( ( 'application' ) )
            // InternalMultiClusterDsl.g:387:1: ( 'application' )
            {
            // InternalMultiClusterDsl.g:387:1: ( 'application' )
            // InternalMultiClusterDsl.g:388:2: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalMultiClusterDsl.g:397:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:401:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalMultiClusterDsl.g:402:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalMultiClusterDsl.g:409:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:413:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalMultiClusterDsl.g:414:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalMultiClusterDsl.g:414:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalMultiClusterDsl.g:415:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalMultiClusterDsl.g:416:2: ( rule__Application__NameAssignment_1 )
            // InternalMultiClusterDsl.g:416:3: rule__Application__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalMultiClusterDsl.g:424:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:428:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalMultiClusterDsl.g:429:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalMultiClusterDsl.g:436:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:440:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:441:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:441:1: ( '{' )
            // InternalMultiClusterDsl.g:442:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalMultiClusterDsl.g:451:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:455:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalMultiClusterDsl.g:456:2: rule__Application__Group__3__Impl rule__Application__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalMultiClusterDsl.g:463:1: rule__Application__Group__3__Impl : ( ( rule__Application__Group_3__0 )? ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:467:1: ( ( ( rule__Application__Group_3__0 )? ) )
            // InternalMultiClusterDsl.g:468:1: ( ( rule__Application__Group_3__0 )? )
            {
            // InternalMultiClusterDsl.g:468:1: ( ( rule__Application__Group_3__0 )? )
            // InternalMultiClusterDsl.g:469:2: ( rule__Application__Group_3__0 )?
            {
             before(grammarAccess.getApplicationAccess().getGroup_3()); 
            // InternalMultiClusterDsl.g:470:2: ( rule__Application__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMultiClusterDsl.g:470:3: rule__Application__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Application__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Application__Group__4"
    // InternalMultiClusterDsl.g:478:1: rule__Application__Group__4 : rule__Application__Group__4__Impl rule__Application__Group__5 ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:482:1: ( rule__Application__Group__4__Impl rule__Application__Group__5 )
            // InternalMultiClusterDsl.g:483:2: rule__Application__Group__4__Impl rule__Application__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Application__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4"


    // $ANTLR start "rule__Application__Group__4__Impl"
    // InternalMultiClusterDsl.g:490:1: rule__Application__Group__4__Impl : ( ( rule__Application__ClustersAssignment_4 )* ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:494:1: ( ( ( rule__Application__ClustersAssignment_4 )* ) )
            // InternalMultiClusterDsl.g:495:1: ( ( rule__Application__ClustersAssignment_4 )* )
            {
            // InternalMultiClusterDsl.g:495:1: ( ( rule__Application__ClustersAssignment_4 )* )
            // InternalMultiClusterDsl.g:496:2: ( rule__Application__ClustersAssignment_4 )*
            {
             before(grammarAccess.getApplicationAccess().getClustersAssignment_4()); 
            // InternalMultiClusterDsl.g:497:2: ( rule__Application__ClustersAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMultiClusterDsl.g:497:3: rule__Application__ClustersAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Application__ClustersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getClustersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__4__Impl"


    // $ANTLR start "rule__Application__Group__5"
    // InternalMultiClusterDsl.g:505:1: rule__Application__Group__5 : rule__Application__Group__5__Impl ;
    public final void rule__Application__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:509:1: ( rule__Application__Group__5__Impl )
            // InternalMultiClusterDsl.g:510:2: rule__Application__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5"


    // $ANTLR start "rule__Application__Group__5__Impl"
    // InternalMultiClusterDsl.g:516:1: rule__Application__Group__5__Impl : ( '}' ) ;
    public final void rule__Application__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:520:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:521:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:521:1: ( '}' )
            // InternalMultiClusterDsl.g:522:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group__5__Impl"


    // $ANTLR start "rule__Application__Group_3__0"
    // InternalMultiClusterDsl.g:532:1: rule__Application__Group_3__0 : rule__Application__Group_3__0__Impl rule__Application__Group_3__1 ;
    public final void rule__Application__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:536:1: ( rule__Application__Group_3__0__Impl rule__Application__Group_3__1 )
            // InternalMultiClusterDsl.g:537:2: rule__Application__Group_3__0__Impl rule__Application__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Application__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__0"


    // $ANTLR start "rule__Application__Group_3__0__Impl"
    // InternalMultiClusterDsl.g:544:1: rule__Application__Group_3__0__Impl : ( 'namespace' ) ;
    public final void rule__Application__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:548:1: ( ( 'namespace' ) )
            // InternalMultiClusterDsl.g:549:1: ( 'namespace' )
            {
            // InternalMultiClusterDsl.g:549:1: ( 'namespace' )
            // InternalMultiClusterDsl.g:550:2: 'namespace'
            {
             before(grammarAccess.getApplicationAccess().getNamespaceKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNamespaceKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__0__Impl"


    // $ANTLR start "rule__Application__Group_3__1"
    // InternalMultiClusterDsl.g:559:1: rule__Application__Group_3__1 : rule__Application__Group_3__1__Impl ;
    public final void rule__Application__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:563:1: ( rule__Application__Group_3__1__Impl )
            // InternalMultiClusterDsl.g:564:2: rule__Application__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__1"


    // $ANTLR start "rule__Application__Group_3__1__Impl"
    // InternalMultiClusterDsl.g:570:1: rule__Application__Group_3__1__Impl : ( ( rule__Application__NamespaceAssignment_3_1 ) ) ;
    public final void rule__Application__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:574:1: ( ( ( rule__Application__NamespaceAssignment_3_1 ) ) )
            // InternalMultiClusterDsl.g:575:1: ( ( rule__Application__NamespaceAssignment_3_1 ) )
            {
            // InternalMultiClusterDsl.g:575:1: ( ( rule__Application__NamespaceAssignment_3_1 ) )
            // InternalMultiClusterDsl.g:576:2: ( rule__Application__NamespaceAssignment_3_1 )
            {
             before(grammarAccess.getApplicationAccess().getNamespaceAssignment_3_1()); 
            // InternalMultiClusterDsl.g:577:2: ( rule__Application__NamespaceAssignment_3_1 )
            // InternalMultiClusterDsl.g:577:3: rule__Application__NamespaceAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__NamespaceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getNamespaceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__Group_3__1__Impl"


    // $ANTLR start "rule__Cluster__Group__0"
    // InternalMultiClusterDsl.g:586:1: rule__Cluster__Group__0 : rule__Cluster__Group__0__Impl rule__Cluster__Group__1 ;
    public final void rule__Cluster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:590:1: ( rule__Cluster__Group__0__Impl rule__Cluster__Group__1 )
            // InternalMultiClusterDsl.g:591:2: rule__Cluster__Group__0__Impl rule__Cluster__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Cluster__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__0"


    // $ANTLR start "rule__Cluster__Group__0__Impl"
    // InternalMultiClusterDsl.g:598:1: rule__Cluster__Group__0__Impl : ( 'cluster' ) ;
    public final void rule__Cluster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:602:1: ( ( 'cluster' ) )
            // InternalMultiClusterDsl.g:603:1: ( 'cluster' )
            {
            // InternalMultiClusterDsl.g:603:1: ( 'cluster' )
            // InternalMultiClusterDsl.g:604:2: 'cluster'
            {
             before(grammarAccess.getClusterAccess().getClusterKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClusterAccess().getClusterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__0__Impl"


    // $ANTLR start "rule__Cluster__Group__1"
    // InternalMultiClusterDsl.g:613:1: rule__Cluster__Group__1 : rule__Cluster__Group__1__Impl rule__Cluster__Group__2 ;
    public final void rule__Cluster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:617:1: ( rule__Cluster__Group__1__Impl rule__Cluster__Group__2 )
            // InternalMultiClusterDsl.g:618:2: rule__Cluster__Group__1__Impl rule__Cluster__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Cluster__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__1"


    // $ANTLR start "rule__Cluster__Group__1__Impl"
    // InternalMultiClusterDsl.g:625:1: rule__Cluster__Group__1__Impl : ( ( rule__Cluster__NameAssignment_1 ) ) ;
    public final void rule__Cluster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:629:1: ( ( ( rule__Cluster__NameAssignment_1 ) ) )
            // InternalMultiClusterDsl.g:630:1: ( ( rule__Cluster__NameAssignment_1 ) )
            {
            // InternalMultiClusterDsl.g:630:1: ( ( rule__Cluster__NameAssignment_1 ) )
            // InternalMultiClusterDsl.g:631:2: ( rule__Cluster__NameAssignment_1 )
            {
             before(grammarAccess.getClusterAccess().getNameAssignment_1()); 
            // InternalMultiClusterDsl.g:632:2: ( rule__Cluster__NameAssignment_1 )
            // InternalMultiClusterDsl.g:632:3: rule__Cluster__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cluster__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__1__Impl"


    // $ANTLR start "rule__Cluster__Group__2"
    // InternalMultiClusterDsl.g:640:1: rule__Cluster__Group__2 : rule__Cluster__Group__2__Impl rule__Cluster__Group__3 ;
    public final void rule__Cluster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:644:1: ( rule__Cluster__Group__2__Impl rule__Cluster__Group__3 )
            // InternalMultiClusterDsl.g:645:2: rule__Cluster__Group__2__Impl rule__Cluster__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Cluster__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__2"


    // $ANTLR start "rule__Cluster__Group__2__Impl"
    // InternalMultiClusterDsl.g:652:1: rule__Cluster__Group__2__Impl : ( '{' ) ;
    public final void rule__Cluster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:656:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:657:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:657:1: ( '{' )
            // InternalMultiClusterDsl.g:658:2: '{'
            {
             before(grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__2__Impl"


    // $ANTLR start "rule__Cluster__Group__3"
    // InternalMultiClusterDsl.g:667:1: rule__Cluster__Group__3 : rule__Cluster__Group__3__Impl rule__Cluster__Group__4 ;
    public final void rule__Cluster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:671:1: ( rule__Cluster__Group__3__Impl rule__Cluster__Group__4 )
            // InternalMultiClusterDsl.g:672:2: rule__Cluster__Group__3__Impl rule__Cluster__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Cluster__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__3"


    // $ANTLR start "rule__Cluster__Group__3__Impl"
    // InternalMultiClusterDsl.g:679:1: rule__Cluster__Group__3__Impl : ( ( rule__Cluster__DeploymentAssignment_3 ) ) ;
    public final void rule__Cluster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:683:1: ( ( ( rule__Cluster__DeploymentAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:684:1: ( ( rule__Cluster__DeploymentAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:684:1: ( ( rule__Cluster__DeploymentAssignment_3 ) )
            // InternalMultiClusterDsl.g:685:2: ( rule__Cluster__DeploymentAssignment_3 )
            {
             before(grammarAccess.getClusterAccess().getDeploymentAssignment_3()); 
            // InternalMultiClusterDsl.g:686:2: ( rule__Cluster__DeploymentAssignment_3 )
            // InternalMultiClusterDsl.g:686:3: rule__Cluster__DeploymentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cluster__DeploymentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClusterAccess().getDeploymentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__3__Impl"


    // $ANTLR start "rule__Cluster__Group__4"
    // InternalMultiClusterDsl.g:694:1: rule__Cluster__Group__4 : rule__Cluster__Group__4__Impl rule__Cluster__Group__5 ;
    public final void rule__Cluster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:698:1: ( rule__Cluster__Group__4__Impl rule__Cluster__Group__5 )
            // InternalMultiClusterDsl.g:699:2: rule__Cluster__Group__4__Impl rule__Cluster__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Cluster__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__4"


    // $ANTLR start "rule__Cluster__Group__4__Impl"
    // InternalMultiClusterDsl.g:706:1: rule__Cluster__Group__4__Impl : ( ( rule__Cluster__ServiceAssignment_4 )? ) ;
    public final void rule__Cluster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:710:1: ( ( ( rule__Cluster__ServiceAssignment_4 )? ) )
            // InternalMultiClusterDsl.g:711:1: ( ( rule__Cluster__ServiceAssignment_4 )? )
            {
            // InternalMultiClusterDsl.g:711:1: ( ( rule__Cluster__ServiceAssignment_4 )? )
            // InternalMultiClusterDsl.g:712:2: ( rule__Cluster__ServiceAssignment_4 )?
            {
             before(grammarAccess.getClusterAccess().getServiceAssignment_4()); 
            // InternalMultiClusterDsl.g:713:2: ( rule__Cluster__ServiceAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMultiClusterDsl.g:713:3: rule__Cluster__ServiceAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cluster__ServiceAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClusterAccess().getServiceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__4__Impl"


    // $ANTLR start "rule__Cluster__Group__5"
    // InternalMultiClusterDsl.g:721:1: rule__Cluster__Group__5 : rule__Cluster__Group__5__Impl rule__Cluster__Group__6 ;
    public final void rule__Cluster__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:725:1: ( rule__Cluster__Group__5__Impl rule__Cluster__Group__6 )
            // InternalMultiClusterDsl.g:726:2: rule__Cluster__Group__5__Impl rule__Cluster__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Cluster__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__5"


    // $ANTLR start "rule__Cluster__Group__5__Impl"
    // InternalMultiClusterDsl.g:733:1: rule__Cluster__Group__5__Impl : ( ( rule__Cluster__IngressAssignment_5 )? ) ;
    public final void rule__Cluster__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:737:1: ( ( ( rule__Cluster__IngressAssignment_5 )? ) )
            // InternalMultiClusterDsl.g:738:1: ( ( rule__Cluster__IngressAssignment_5 )? )
            {
            // InternalMultiClusterDsl.g:738:1: ( ( rule__Cluster__IngressAssignment_5 )? )
            // InternalMultiClusterDsl.g:739:2: ( rule__Cluster__IngressAssignment_5 )?
            {
             before(grammarAccess.getClusterAccess().getIngressAssignment_5()); 
            // InternalMultiClusterDsl.g:740:2: ( rule__Cluster__IngressAssignment_5 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMultiClusterDsl.g:740:3: rule__Cluster__IngressAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cluster__IngressAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClusterAccess().getIngressAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__5__Impl"


    // $ANTLR start "rule__Cluster__Group__6"
    // InternalMultiClusterDsl.g:748:1: rule__Cluster__Group__6 : rule__Cluster__Group__6__Impl rule__Cluster__Group__7 ;
    public final void rule__Cluster__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:752:1: ( rule__Cluster__Group__6__Impl rule__Cluster__Group__7 )
            // InternalMultiClusterDsl.g:753:2: rule__Cluster__Group__6__Impl rule__Cluster__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Cluster__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__6"


    // $ANTLR start "rule__Cluster__Group__6__Impl"
    // InternalMultiClusterDsl.g:760:1: rule__Cluster__Group__6__Impl : ( ( rule__Cluster__ConfigMapAssignment_6 )? ) ;
    public final void rule__Cluster__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:764:1: ( ( ( rule__Cluster__ConfigMapAssignment_6 )? ) )
            // InternalMultiClusterDsl.g:765:1: ( ( rule__Cluster__ConfigMapAssignment_6 )? )
            {
            // InternalMultiClusterDsl.g:765:1: ( ( rule__Cluster__ConfigMapAssignment_6 )? )
            // InternalMultiClusterDsl.g:766:2: ( rule__Cluster__ConfigMapAssignment_6 )?
            {
             before(grammarAccess.getClusterAccess().getConfigMapAssignment_6()); 
            // InternalMultiClusterDsl.g:767:2: ( rule__Cluster__ConfigMapAssignment_6 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMultiClusterDsl.g:767:3: rule__Cluster__ConfigMapAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cluster__ConfigMapAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClusterAccess().getConfigMapAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__6__Impl"


    // $ANTLR start "rule__Cluster__Group__7"
    // InternalMultiClusterDsl.g:775:1: rule__Cluster__Group__7 : rule__Cluster__Group__7__Impl rule__Cluster__Group__8 ;
    public final void rule__Cluster__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:779:1: ( rule__Cluster__Group__7__Impl rule__Cluster__Group__8 )
            // InternalMultiClusterDsl.g:780:2: rule__Cluster__Group__7__Impl rule__Cluster__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Cluster__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cluster__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__7"


    // $ANTLR start "rule__Cluster__Group__7__Impl"
    // InternalMultiClusterDsl.g:787:1: rule__Cluster__Group__7__Impl : ( ( rule__Cluster__AutoscalingAssignment_7 )? ) ;
    public final void rule__Cluster__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:791:1: ( ( ( rule__Cluster__AutoscalingAssignment_7 )? ) )
            // InternalMultiClusterDsl.g:792:1: ( ( rule__Cluster__AutoscalingAssignment_7 )? )
            {
            // InternalMultiClusterDsl.g:792:1: ( ( rule__Cluster__AutoscalingAssignment_7 )? )
            // InternalMultiClusterDsl.g:793:2: ( rule__Cluster__AutoscalingAssignment_7 )?
            {
             before(grammarAccess.getClusterAccess().getAutoscalingAssignment_7()); 
            // InternalMultiClusterDsl.g:794:2: ( rule__Cluster__AutoscalingAssignment_7 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMultiClusterDsl.g:794:3: rule__Cluster__AutoscalingAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cluster__AutoscalingAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClusterAccess().getAutoscalingAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__7__Impl"


    // $ANTLR start "rule__Cluster__Group__8"
    // InternalMultiClusterDsl.g:802:1: rule__Cluster__Group__8 : rule__Cluster__Group__8__Impl ;
    public final void rule__Cluster__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:806:1: ( rule__Cluster__Group__8__Impl )
            // InternalMultiClusterDsl.g:807:2: rule__Cluster__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cluster__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__8"


    // $ANTLR start "rule__Cluster__Group__8__Impl"
    // InternalMultiClusterDsl.g:813:1: rule__Cluster__Group__8__Impl : ( '}' ) ;
    public final void rule__Cluster__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:817:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:818:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:818:1: ( '}' )
            // InternalMultiClusterDsl.g:819:2: '}'
            {
             before(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__Group__8__Impl"


    // $ANTLR start "rule__Deployment__Group__0"
    // InternalMultiClusterDsl.g:829:1: rule__Deployment__Group__0 : rule__Deployment__Group__0__Impl rule__Deployment__Group__1 ;
    public final void rule__Deployment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:833:1: ( rule__Deployment__Group__0__Impl rule__Deployment__Group__1 )
            // InternalMultiClusterDsl.g:834:2: rule__Deployment__Group__0__Impl rule__Deployment__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Deployment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__0"


    // $ANTLR start "rule__Deployment__Group__0__Impl"
    // InternalMultiClusterDsl.g:841:1: rule__Deployment__Group__0__Impl : ( 'deployment' ) ;
    public final void rule__Deployment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:845:1: ( ( 'deployment' ) )
            // InternalMultiClusterDsl.g:846:1: ( 'deployment' )
            {
            // InternalMultiClusterDsl.g:846:1: ( 'deployment' )
            // InternalMultiClusterDsl.g:847:2: 'deployment'
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getDeploymentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__0__Impl"


    // $ANTLR start "rule__Deployment__Group__1"
    // InternalMultiClusterDsl.g:856:1: rule__Deployment__Group__1 : rule__Deployment__Group__1__Impl rule__Deployment__Group__2 ;
    public final void rule__Deployment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:860:1: ( rule__Deployment__Group__1__Impl rule__Deployment__Group__2 )
            // InternalMultiClusterDsl.g:861:2: rule__Deployment__Group__1__Impl rule__Deployment__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Deployment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__1"


    // $ANTLR start "rule__Deployment__Group__1__Impl"
    // InternalMultiClusterDsl.g:868:1: rule__Deployment__Group__1__Impl : ( '{' ) ;
    public final void rule__Deployment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:872:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:873:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:873:1: ( '{' )
            // InternalMultiClusterDsl.g:874:2: '{'
            {
             before(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__1__Impl"


    // $ANTLR start "rule__Deployment__Group__2"
    // InternalMultiClusterDsl.g:883:1: rule__Deployment__Group__2 : rule__Deployment__Group__2__Impl rule__Deployment__Group__3 ;
    public final void rule__Deployment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:887:1: ( rule__Deployment__Group__2__Impl rule__Deployment__Group__3 )
            // InternalMultiClusterDsl.g:888:2: rule__Deployment__Group__2__Impl rule__Deployment__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Deployment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__2"


    // $ANTLR start "rule__Deployment__Group__2__Impl"
    // InternalMultiClusterDsl.g:895:1: rule__Deployment__Group__2__Impl : ( 'image' ) ;
    public final void rule__Deployment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:899:1: ( ( 'image' ) )
            // InternalMultiClusterDsl.g:900:1: ( 'image' )
            {
            // InternalMultiClusterDsl.g:900:1: ( 'image' )
            // InternalMultiClusterDsl.g:901:2: 'image'
            {
             before(grammarAccess.getDeploymentAccess().getImageKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getImageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__2__Impl"


    // $ANTLR start "rule__Deployment__Group__3"
    // InternalMultiClusterDsl.g:910:1: rule__Deployment__Group__3 : rule__Deployment__Group__3__Impl rule__Deployment__Group__4 ;
    public final void rule__Deployment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:914:1: ( rule__Deployment__Group__3__Impl rule__Deployment__Group__4 )
            // InternalMultiClusterDsl.g:915:2: rule__Deployment__Group__3__Impl rule__Deployment__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Deployment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__3"


    // $ANTLR start "rule__Deployment__Group__3__Impl"
    // InternalMultiClusterDsl.g:922:1: rule__Deployment__Group__3__Impl : ( ( rule__Deployment__ImageAssignment_3 ) ) ;
    public final void rule__Deployment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:926:1: ( ( ( rule__Deployment__ImageAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:927:1: ( ( rule__Deployment__ImageAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:927:1: ( ( rule__Deployment__ImageAssignment_3 ) )
            // InternalMultiClusterDsl.g:928:2: ( rule__Deployment__ImageAssignment_3 )
            {
             before(grammarAccess.getDeploymentAccess().getImageAssignment_3()); 
            // InternalMultiClusterDsl.g:929:2: ( rule__Deployment__ImageAssignment_3 )
            // InternalMultiClusterDsl.g:929:3: rule__Deployment__ImageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__ImageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getImageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__3__Impl"


    // $ANTLR start "rule__Deployment__Group__4"
    // InternalMultiClusterDsl.g:937:1: rule__Deployment__Group__4 : rule__Deployment__Group__4__Impl rule__Deployment__Group__5 ;
    public final void rule__Deployment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:941:1: ( rule__Deployment__Group__4__Impl rule__Deployment__Group__5 )
            // InternalMultiClusterDsl.g:942:2: rule__Deployment__Group__4__Impl rule__Deployment__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Deployment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__4"


    // $ANTLR start "rule__Deployment__Group__4__Impl"
    // InternalMultiClusterDsl.g:949:1: rule__Deployment__Group__4__Impl : ( 'replicas' ) ;
    public final void rule__Deployment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:953:1: ( ( 'replicas' ) )
            // InternalMultiClusterDsl.g:954:1: ( 'replicas' )
            {
            // InternalMultiClusterDsl.g:954:1: ( 'replicas' )
            // InternalMultiClusterDsl.g:955:2: 'replicas'
            {
             before(grammarAccess.getDeploymentAccess().getReplicasKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getReplicasKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__4__Impl"


    // $ANTLR start "rule__Deployment__Group__5"
    // InternalMultiClusterDsl.g:964:1: rule__Deployment__Group__5 : rule__Deployment__Group__5__Impl rule__Deployment__Group__6 ;
    public final void rule__Deployment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:968:1: ( rule__Deployment__Group__5__Impl rule__Deployment__Group__6 )
            // InternalMultiClusterDsl.g:969:2: rule__Deployment__Group__5__Impl rule__Deployment__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Deployment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__5"


    // $ANTLR start "rule__Deployment__Group__5__Impl"
    // InternalMultiClusterDsl.g:976:1: rule__Deployment__Group__5__Impl : ( ( rule__Deployment__ReplicasAssignment_5 ) ) ;
    public final void rule__Deployment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:980:1: ( ( ( rule__Deployment__ReplicasAssignment_5 ) ) )
            // InternalMultiClusterDsl.g:981:1: ( ( rule__Deployment__ReplicasAssignment_5 ) )
            {
            // InternalMultiClusterDsl.g:981:1: ( ( rule__Deployment__ReplicasAssignment_5 ) )
            // InternalMultiClusterDsl.g:982:2: ( rule__Deployment__ReplicasAssignment_5 )
            {
             before(grammarAccess.getDeploymentAccess().getReplicasAssignment_5()); 
            // InternalMultiClusterDsl.g:983:2: ( rule__Deployment__ReplicasAssignment_5 )
            // InternalMultiClusterDsl.g:983:3: rule__Deployment__ReplicasAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__ReplicasAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getReplicasAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__5__Impl"


    // $ANTLR start "rule__Deployment__Group__6"
    // InternalMultiClusterDsl.g:991:1: rule__Deployment__Group__6 : rule__Deployment__Group__6__Impl rule__Deployment__Group__7 ;
    public final void rule__Deployment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:995:1: ( rule__Deployment__Group__6__Impl rule__Deployment__Group__7 )
            // InternalMultiClusterDsl.g:996:2: rule__Deployment__Group__6__Impl rule__Deployment__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Deployment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__6"


    // $ANTLR start "rule__Deployment__Group__6__Impl"
    // InternalMultiClusterDsl.g:1003:1: rule__Deployment__Group__6__Impl : ( ( rule__Deployment__ResourcesAssignment_6 ) ) ;
    public final void rule__Deployment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1007:1: ( ( ( rule__Deployment__ResourcesAssignment_6 ) ) )
            // InternalMultiClusterDsl.g:1008:1: ( ( rule__Deployment__ResourcesAssignment_6 ) )
            {
            // InternalMultiClusterDsl.g:1008:1: ( ( rule__Deployment__ResourcesAssignment_6 ) )
            // InternalMultiClusterDsl.g:1009:2: ( rule__Deployment__ResourcesAssignment_6 )
            {
             before(grammarAccess.getDeploymentAccess().getResourcesAssignment_6()); 
            // InternalMultiClusterDsl.g:1010:2: ( rule__Deployment__ResourcesAssignment_6 )
            // InternalMultiClusterDsl.g:1010:3: rule__Deployment__ResourcesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__ResourcesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeploymentAccess().getResourcesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__6__Impl"


    // $ANTLR start "rule__Deployment__Group__7"
    // InternalMultiClusterDsl.g:1018:1: rule__Deployment__Group__7 : rule__Deployment__Group__7__Impl rule__Deployment__Group__8 ;
    public final void rule__Deployment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1022:1: ( rule__Deployment__Group__7__Impl rule__Deployment__Group__8 )
            // InternalMultiClusterDsl.g:1023:2: rule__Deployment__Group__7__Impl rule__Deployment__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Deployment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Deployment__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__7"


    // $ANTLR start "rule__Deployment__Group__7__Impl"
    // InternalMultiClusterDsl.g:1030:1: rule__Deployment__Group__7__Impl : ( ( rule__Deployment__HealthAssignment_7 )? ) ;
    public final void rule__Deployment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1034:1: ( ( ( rule__Deployment__HealthAssignment_7 )? ) )
            // InternalMultiClusterDsl.g:1035:1: ( ( rule__Deployment__HealthAssignment_7 )? )
            {
            // InternalMultiClusterDsl.g:1035:1: ( ( rule__Deployment__HealthAssignment_7 )? )
            // InternalMultiClusterDsl.g:1036:2: ( rule__Deployment__HealthAssignment_7 )?
            {
             before(grammarAccess.getDeploymentAccess().getHealthAssignment_7()); 
            // InternalMultiClusterDsl.g:1037:2: ( rule__Deployment__HealthAssignment_7 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMultiClusterDsl.g:1037:3: rule__Deployment__HealthAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Deployment__HealthAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeploymentAccess().getHealthAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__7__Impl"


    // $ANTLR start "rule__Deployment__Group__8"
    // InternalMultiClusterDsl.g:1045:1: rule__Deployment__Group__8 : rule__Deployment__Group__8__Impl ;
    public final void rule__Deployment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1049:1: ( rule__Deployment__Group__8__Impl )
            // InternalMultiClusterDsl.g:1050:2: rule__Deployment__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__8"


    // $ANTLR start "rule__Deployment__Group__8__Impl"
    // InternalMultiClusterDsl.g:1056:1: rule__Deployment__Group__8__Impl : ( '}' ) ;
    public final void rule__Deployment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1060:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:1061:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:1061:1: ( '}' )
            // InternalMultiClusterDsl.g:1062:2: '}'
            {
             before(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__Group__8__Impl"


    // $ANTLR start "rule__Resources__Group__0"
    // InternalMultiClusterDsl.g:1072:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1076:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalMultiClusterDsl.g:1077:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Resources__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0"


    // $ANTLR start "rule__Resources__Group__0__Impl"
    // InternalMultiClusterDsl.g:1084:1: rule__Resources__Group__0__Impl : ( 'resources' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1088:1: ( ( 'resources' ) )
            // InternalMultiClusterDsl.g:1089:1: ( 'resources' )
            {
            // InternalMultiClusterDsl.g:1089:1: ( 'resources' )
            // InternalMultiClusterDsl.g:1090:2: 'resources'
            {
             before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__0__Impl"


    // $ANTLR start "rule__Resources__Group__1"
    // InternalMultiClusterDsl.g:1099:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1103:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalMultiClusterDsl.g:1104:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Resources__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1"


    // $ANTLR start "rule__Resources__Group__1__Impl"
    // InternalMultiClusterDsl.g:1111:1: rule__Resources__Group__1__Impl : ( '{' ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1115:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:1116:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:1116:1: ( '{' )
            // InternalMultiClusterDsl.g:1117:2: '{'
            {
             before(grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__1__Impl"


    // $ANTLR start "rule__Resources__Group__2"
    // InternalMultiClusterDsl.g:1126:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl rule__Resources__Group__3 ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1130:1: ( rule__Resources__Group__2__Impl rule__Resources__Group__3 )
            // InternalMultiClusterDsl.g:1131:2: rule__Resources__Group__2__Impl rule__Resources__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Resources__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2"


    // $ANTLR start "rule__Resources__Group__2__Impl"
    // InternalMultiClusterDsl.g:1138:1: rule__Resources__Group__2__Impl : ( 'cpu' ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1142:1: ( ( 'cpu' ) )
            // InternalMultiClusterDsl.g:1143:1: ( 'cpu' )
            {
            // InternalMultiClusterDsl.g:1143:1: ( 'cpu' )
            // InternalMultiClusterDsl.g:1144:2: 'cpu'
            {
             before(grammarAccess.getResourcesAccess().getCpuKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getCpuKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__2__Impl"


    // $ANTLR start "rule__Resources__Group__3"
    // InternalMultiClusterDsl.g:1153:1: rule__Resources__Group__3 : rule__Resources__Group__3__Impl rule__Resources__Group__4 ;
    public final void rule__Resources__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1157:1: ( rule__Resources__Group__3__Impl rule__Resources__Group__4 )
            // InternalMultiClusterDsl.g:1158:2: rule__Resources__Group__3__Impl rule__Resources__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Resources__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3"


    // $ANTLR start "rule__Resources__Group__3__Impl"
    // InternalMultiClusterDsl.g:1165:1: rule__Resources__Group__3__Impl : ( ( rule__Resources__CpuAssignment_3 ) ) ;
    public final void rule__Resources__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1169:1: ( ( ( rule__Resources__CpuAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:1170:1: ( ( rule__Resources__CpuAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:1170:1: ( ( rule__Resources__CpuAssignment_3 ) )
            // InternalMultiClusterDsl.g:1171:2: ( rule__Resources__CpuAssignment_3 )
            {
             before(grammarAccess.getResourcesAccess().getCpuAssignment_3()); 
            // InternalMultiClusterDsl.g:1172:2: ( rule__Resources__CpuAssignment_3 )
            // InternalMultiClusterDsl.g:1172:3: rule__Resources__CpuAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Resources__CpuAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getCpuAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__3__Impl"


    // $ANTLR start "rule__Resources__Group__4"
    // InternalMultiClusterDsl.g:1180:1: rule__Resources__Group__4 : rule__Resources__Group__4__Impl rule__Resources__Group__5 ;
    public final void rule__Resources__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1184:1: ( rule__Resources__Group__4__Impl rule__Resources__Group__5 )
            // InternalMultiClusterDsl.g:1185:2: rule__Resources__Group__4__Impl rule__Resources__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Resources__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__4"


    // $ANTLR start "rule__Resources__Group__4__Impl"
    // InternalMultiClusterDsl.g:1192:1: rule__Resources__Group__4__Impl : ( 'memory' ) ;
    public final void rule__Resources__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1196:1: ( ( 'memory' ) )
            // InternalMultiClusterDsl.g:1197:1: ( 'memory' )
            {
            // InternalMultiClusterDsl.g:1197:1: ( 'memory' )
            // InternalMultiClusterDsl.g:1198:2: 'memory'
            {
             before(grammarAccess.getResourcesAccess().getMemoryKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getMemoryKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__4__Impl"


    // $ANTLR start "rule__Resources__Group__5"
    // InternalMultiClusterDsl.g:1207:1: rule__Resources__Group__5 : rule__Resources__Group__5__Impl rule__Resources__Group__6 ;
    public final void rule__Resources__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1211:1: ( rule__Resources__Group__5__Impl rule__Resources__Group__6 )
            // InternalMultiClusterDsl.g:1212:2: rule__Resources__Group__5__Impl rule__Resources__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Resources__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resources__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__5"


    // $ANTLR start "rule__Resources__Group__5__Impl"
    // InternalMultiClusterDsl.g:1219:1: rule__Resources__Group__5__Impl : ( ( rule__Resources__MemoryAssignment_5 ) ) ;
    public final void rule__Resources__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1223:1: ( ( ( rule__Resources__MemoryAssignment_5 ) ) )
            // InternalMultiClusterDsl.g:1224:1: ( ( rule__Resources__MemoryAssignment_5 ) )
            {
            // InternalMultiClusterDsl.g:1224:1: ( ( rule__Resources__MemoryAssignment_5 ) )
            // InternalMultiClusterDsl.g:1225:2: ( rule__Resources__MemoryAssignment_5 )
            {
             before(grammarAccess.getResourcesAccess().getMemoryAssignment_5()); 
            // InternalMultiClusterDsl.g:1226:2: ( rule__Resources__MemoryAssignment_5 )
            // InternalMultiClusterDsl.g:1226:3: rule__Resources__MemoryAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Resources__MemoryAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getResourcesAccess().getMemoryAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__5__Impl"


    // $ANTLR start "rule__Resources__Group__6"
    // InternalMultiClusterDsl.g:1234:1: rule__Resources__Group__6 : rule__Resources__Group__6__Impl ;
    public final void rule__Resources__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1238:1: ( rule__Resources__Group__6__Impl )
            // InternalMultiClusterDsl.g:1239:2: rule__Resources__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resources__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__6"


    // $ANTLR start "rule__Resources__Group__6__Impl"
    // InternalMultiClusterDsl.g:1245:1: rule__Resources__Group__6__Impl : ( '}' ) ;
    public final void rule__Resources__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1249:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:1250:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:1250:1: ( '}' )
            // InternalMultiClusterDsl.g:1251:2: '}'
            {
             before(grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__Group__6__Impl"


    // $ANTLR start "rule__Health__Group__0"
    // InternalMultiClusterDsl.g:1261:1: rule__Health__Group__0 : rule__Health__Group__0__Impl rule__Health__Group__1 ;
    public final void rule__Health__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1265:1: ( rule__Health__Group__0__Impl rule__Health__Group__1 )
            // InternalMultiClusterDsl.g:1266:2: rule__Health__Group__0__Impl rule__Health__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Health__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Health__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__0"


    // $ANTLR start "rule__Health__Group__0__Impl"
    // InternalMultiClusterDsl.g:1273:1: rule__Health__Group__0__Impl : ( 'health' ) ;
    public final void rule__Health__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1277:1: ( ( 'health' ) )
            // InternalMultiClusterDsl.g:1278:1: ( 'health' )
            {
            // InternalMultiClusterDsl.g:1278:1: ( 'health' )
            // InternalMultiClusterDsl.g:1279:2: 'health'
            {
             before(grammarAccess.getHealthAccess().getHealthKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHealthAccess().getHealthKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__0__Impl"


    // $ANTLR start "rule__Health__Group__1"
    // InternalMultiClusterDsl.g:1288:1: rule__Health__Group__1 : rule__Health__Group__1__Impl rule__Health__Group__2 ;
    public final void rule__Health__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1292:1: ( rule__Health__Group__1__Impl rule__Health__Group__2 )
            // InternalMultiClusterDsl.g:1293:2: rule__Health__Group__1__Impl rule__Health__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Health__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Health__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__1"


    // $ANTLR start "rule__Health__Group__1__Impl"
    // InternalMultiClusterDsl.g:1300:1: rule__Health__Group__1__Impl : ( '{' ) ;
    public final void rule__Health__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1304:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:1305:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:1305:1: ( '{' )
            // InternalMultiClusterDsl.g:1306:2: '{'
            {
             before(grammarAccess.getHealthAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHealthAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__1__Impl"


    // $ANTLR start "rule__Health__Group__2"
    // InternalMultiClusterDsl.g:1315:1: rule__Health__Group__2 : rule__Health__Group__2__Impl rule__Health__Group__3 ;
    public final void rule__Health__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1319:1: ( rule__Health__Group__2__Impl rule__Health__Group__3 )
            // InternalMultiClusterDsl.g:1320:2: rule__Health__Group__2__Impl rule__Health__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Health__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Health__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__2"


    // $ANTLR start "rule__Health__Group__2__Impl"
    // InternalMultiClusterDsl.g:1327:1: rule__Health__Group__2__Impl : ( 'readinessPath' ) ;
    public final void rule__Health__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1331:1: ( ( 'readinessPath' ) )
            // InternalMultiClusterDsl.g:1332:1: ( 'readinessPath' )
            {
            // InternalMultiClusterDsl.g:1332:1: ( 'readinessPath' )
            // InternalMultiClusterDsl.g:1333:2: 'readinessPath'
            {
             before(grammarAccess.getHealthAccess().getReadinessPathKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHealthAccess().getReadinessPathKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__2__Impl"


    // $ANTLR start "rule__Health__Group__3"
    // InternalMultiClusterDsl.g:1342:1: rule__Health__Group__3 : rule__Health__Group__3__Impl rule__Health__Group__4 ;
    public final void rule__Health__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1346:1: ( rule__Health__Group__3__Impl rule__Health__Group__4 )
            // InternalMultiClusterDsl.g:1347:2: rule__Health__Group__3__Impl rule__Health__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Health__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Health__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__3"


    // $ANTLR start "rule__Health__Group__3__Impl"
    // InternalMultiClusterDsl.g:1354:1: rule__Health__Group__3__Impl : ( ( rule__Health__ReadinessPathAssignment_3 ) ) ;
    public final void rule__Health__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1358:1: ( ( ( rule__Health__ReadinessPathAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:1359:1: ( ( rule__Health__ReadinessPathAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:1359:1: ( ( rule__Health__ReadinessPathAssignment_3 ) )
            // InternalMultiClusterDsl.g:1360:2: ( rule__Health__ReadinessPathAssignment_3 )
            {
             before(grammarAccess.getHealthAccess().getReadinessPathAssignment_3()); 
            // InternalMultiClusterDsl.g:1361:2: ( rule__Health__ReadinessPathAssignment_3 )
            // InternalMultiClusterDsl.g:1361:3: rule__Health__ReadinessPathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Health__ReadinessPathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHealthAccess().getReadinessPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__3__Impl"


    // $ANTLR start "rule__Health__Group__4"
    // InternalMultiClusterDsl.g:1369:1: rule__Health__Group__4 : rule__Health__Group__4__Impl rule__Health__Group__5 ;
    public final void rule__Health__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1373:1: ( rule__Health__Group__4__Impl rule__Health__Group__5 )
            // InternalMultiClusterDsl.g:1374:2: rule__Health__Group__4__Impl rule__Health__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Health__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Health__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__4"


    // $ANTLR start "rule__Health__Group__4__Impl"
    // InternalMultiClusterDsl.g:1381:1: rule__Health__Group__4__Impl : ( 'livenessPath' ) ;
    public final void rule__Health__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1385:1: ( ( 'livenessPath' ) )
            // InternalMultiClusterDsl.g:1386:1: ( 'livenessPath' )
            {
            // InternalMultiClusterDsl.g:1386:1: ( 'livenessPath' )
            // InternalMultiClusterDsl.g:1387:2: 'livenessPath'
            {
             before(grammarAccess.getHealthAccess().getLivenessPathKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getHealthAccess().getLivenessPathKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__4__Impl"


    // $ANTLR start "rule__Health__Group__5"
    // InternalMultiClusterDsl.g:1396:1: rule__Health__Group__5 : rule__Health__Group__5__Impl rule__Health__Group__6 ;
    public final void rule__Health__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1400:1: ( rule__Health__Group__5__Impl rule__Health__Group__6 )
            // InternalMultiClusterDsl.g:1401:2: rule__Health__Group__5__Impl rule__Health__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Health__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Health__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__5"


    // $ANTLR start "rule__Health__Group__5__Impl"
    // InternalMultiClusterDsl.g:1408:1: rule__Health__Group__5__Impl : ( ( rule__Health__LivenessPathAssignment_5 ) ) ;
    public final void rule__Health__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1412:1: ( ( ( rule__Health__LivenessPathAssignment_5 ) ) )
            // InternalMultiClusterDsl.g:1413:1: ( ( rule__Health__LivenessPathAssignment_5 ) )
            {
            // InternalMultiClusterDsl.g:1413:1: ( ( rule__Health__LivenessPathAssignment_5 ) )
            // InternalMultiClusterDsl.g:1414:2: ( rule__Health__LivenessPathAssignment_5 )
            {
             before(grammarAccess.getHealthAccess().getLivenessPathAssignment_5()); 
            // InternalMultiClusterDsl.g:1415:2: ( rule__Health__LivenessPathAssignment_5 )
            // InternalMultiClusterDsl.g:1415:3: rule__Health__LivenessPathAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Health__LivenessPathAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHealthAccess().getLivenessPathAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__5__Impl"


    // $ANTLR start "rule__Health__Group__6"
    // InternalMultiClusterDsl.g:1423:1: rule__Health__Group__6 : rule__Health__Group__6__Impl ;
    public final void rule__Health__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1427:1: ( rule__Health__Group__6__Impl )
            // InternalMultiClusterDsl.g:1428:2: rule__Health__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Health__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__6"


    // $ANTLR start "rule__Health__Group__6__Impl"
    // InternalMultiClusterDsl.g:1434:1: rule__Health__Group__6__Impl : ( '}' ) ;
    public final void rule__Health__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1438:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:1439:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:1439:1: ( '}' )
            // InternalMultiClusterDsl.g:1440:2: '}'
            {
             before(grammarAccess.getHealthAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHealthAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // InternalMultiClusterDsl.g:1450:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1454:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // InternalMultiClusterDsl.g:1455:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // InternalMultiClusterDsl.g:1462:1: rule__Service__Group__0__Impl : ( 'service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1466:1: ( ( 'service' ) )
            // InternalMultiClusterDsl.g:1467:1: ( 'service' )
            {
            // InternalMultiClusterDsl.g:1467:1: ( 'service' )
            // InternalMultiClusterDsl.g:1468:2: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // InternalMultiClusterDsl.g:1477:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1481:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // InternalMultiClusterDsl.g:1482:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // InternalMultiClusterDsl.g:1489:1: rule__Service__Group__1__Impl : ( '{' ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1493:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:1494:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:1494:1: ( '{' )
            // InternalMultiClusterDsl.g:1495:2: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // InternalMultiClusterDsl.g:1504:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1508:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // InternalMultiClusterDsl.g:1509:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // InternalMultiClusterDsl.g:1516:1: rule__Service__Group__2__Impl : ( 'type' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1520:1: ( ( 'type' ) )
            // InternalMultiClusterDsl.g:1521:1: ( 'type' )
            {
            // InternalMultiClusterDsl.g:1521:1: ( 'type' )
            // InternalMultiClusterDsl.g:1522:2: 'type'
            {
             before(grammarAccess.getServiceAccess().getTypeKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // InternalMultiClusterDsl.g:1531:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1535:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // InternalMultiClusterDsl.g:1536:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // InternalMultiClusterDsl.g:1543:1: rule__Service__Group__3__Impl : ( ( rule__Service__TypeAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1547:1: ( ( ( rule__Service__TypeAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:1548:1: ( ( rule__Service__TypeAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:1548:1: ( ( rule__Service__TypeAssignment_3 ) )
            // InternalMultiClusterDsl.g:1549:2: ( rule__Service__TypeAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getTypeAssignment_3()); 
            // InternalMultiClusterDsl.g:1550:2: ( rule__Service__TypeAssignment_3 )
            // InternalMultiClusterDsl.g:1550:3: rule__Service__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Service__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // InternalMultiClusterDsl.g:1558:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1562:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // InternalMultiClusterDsl.g:1563:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // InternalMultiClusterDsl.g:1570:1: rule__Service__Group__4__Impl : ( 'port' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1574:1: ( ( 'port' ) )
            // InternalMultiClusterDsl.g:1575:1: ( 'port' )
            {
            // InternalMultiClusterDsl.g:1575:1: ( 'port' )
            // InternalMultiClusterDsl.g:1576:2: 'port'
            {
             before(grammarAccess.getServiceAccess().getPortKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPortKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // InternalMultiClusterDsl.g:1585:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1589:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // InternalMultiClusterDsl.g:1590:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // InternalMultiClusterDsl.g:1597:1: rule__Service__Group__5__Impl : ( ( rule__Service__PortAssignment_5 ) ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1601:1: ( ( ( rule__Service__PortAssignment_5 ) ) )
            // InternalMultiClusterDsl.g:1602:1: ( ( rule__Service__PortAssignment_5 ) )
            {
            // InternalMultiClusterDsl.g:1602:1: ( ( rule__Service__PortAssignment_5 ) )
            // InternalMultiClusterDsl.g:1603:2: ( rule__Service__PortAssignment_5 )
            {
             before(grammarAccess.getServiceAccess().getPortAssignment_5()); 
            // InternalMultiClusterDsl.g:1604:2: ( rule__Service__PortAssignment_5 )
            // InternalMultiClusterDsl.g:1604:3: rule__Service__PortAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Service__PortAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getPortAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // InternalMultiClusterDsl.g:1612:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1616:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // InternalMultiClusterDsl.g:1617:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // InternalMultiClusterDsl.g:1624:1: rule__Service__Group__6__Impl : ( 'targetPort' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1628:1: ( ( 'targetPort' ) )
            // InternalMultiClusterDsl.g:1629:1: ( 'targetPort' )
            {
            // InternalMultiClusterDsl.g:1629:1: ( 'targetPort' )
            // InternalMultiClusterDsl.g:1630:2: 'targetPort'
            {
             before(grammarAccess.getServiceAccess().getTargetPortKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getTargetPortKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // InternalMultiClusterDsl.g:1639:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1643:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // InternalMultiClusterDsl.g:1644:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Service__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // InternalMultiClusterDsl.g:1651:1: rule__Service__Group__7__Impl : ( ( rule__Service__TargetPortAssignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1655:1: ( ( ( rule__Service__TargetPortAssignment_7 ) ) )
            // InternalMultiClusterDsl.g:1656:1: ( ( rule__Service__TargetPortAssignment_7 ) )
            {
            // InternalMultiClusterDsl.g:1656:1: ( ( rule__Service__TargetPortAssignment_7 ) )
            // InternalMultiClusterDsl.g:1657:2: ( rule__Service__TargetPortAssignment_7 )
            {
             before(grammarAccess.getServiceAccess().getTargetPortAssignment_7()); 
            // InternalMultiClusterDsl.g:1658:2: ( rule__Service__TargetPortAssignment_7 )
            // InternalMultiClusterDsl.g:1658:3: rule__Service__TargetPortAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Service__TargetPortAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getTargetPortAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // InternalMultiClusterDsl.g:1666:1: rule__Service__Group__8 : rule__Service__Group__8__Impl ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1670:1: ( rule__Service__Group__8__Impl )
            // InternalMultiClusterDsl.g:1671:2: rule__Service__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Service__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // InternalMultiClusterDsl.g:1677:1: rule__Service__Group__8__Impl : ( '}' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1681:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:1682:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:1682:1: ( '}' )
            // InternalMultiClusterDsl.g:1683:2: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Ingress__Group__0"
    // InternalMultiClusterDsl.g:1693:1: rule__Ingress__Group__0 : rule__Ingress__Group__0__Impl rule__Ingress__Group__1 ;
    public final void rule__Ingress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1697:1: ( rule__Ingress__Group__0__Impl rule__Ingress__Group__1 )
            // InternalMultiClusterDsl.g:1698:2: rule__Ingress__Group__0__Impl rule__Ingress__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Ingress__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingress__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__0"


    // $ANTLR start "rule__Ingress__Group__0__Impl"
    // InternalMultiClusterDsl.g:1705:1: rule__Ingress__Group__0__Impl : ( 'ingress' ) ;
    public final void rule__Ingress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1709:1: ( ( 'ingress' ) )
            // InternalMultiClusterDsl.g:1710:1: ( 'ingress' )
            {
            // InternalMultiClusterDsl.g:1710:1: ( 'ingress' )
            // InternalMultiClusterDsl.g:1711:2: 'ingress'
            {
             before(grammarAccess.getIngressAccess().getIngressKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getIngressAccess().getIngressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__0__Impl"


    // $ANTLR start "rule__Ingress__Group__1"
    // InternalMultiClusterDsl.g:1720:1: rule__Ingress__Group__1 : rule__Ingress__Group__1__Impl rule__Ingress__Group__2 ;
    public final void rule__Ingress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1724:1: ( rule__Ingress__Group__1__Impl rule__Ingress__Group__2 )
            // InternalMultiClusterDsl.g:1725:2: rule__Ingress__Group__1__Impl rule__Ingress__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Ingress__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingress__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__1"


    // $ANTLR start "rule__Ingress__Group__1__Impl"
    // InternalMultiClusterDsl.g:1732:1: rule__Ingress__Group__1__Impl : ( '{' ) ;
    public final void rule__Ingress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1736:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:1737:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:1737:1: ( '{' )
            // InternalMultiClusterDsl.g:1738:2: '{'
            {
             before(grammarAccess.getIngressAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIngressAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__1__Impl"


    // $ANTLR start "rule__Ingress__Group__2"
    // InternalMultiClusterDsl.g:1747:1: rule__Ingress__Group__2 : rule__Ingress__Group__2__Impl rule__Ingress__Group__3 ;
    public final void rule__Ingress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1751:1: ( rule__Ingress__Group__2__Impl rule__Ingress__Group__3 )
            // InternalMultiClusterDsl.g:1752:2: rule__Ingress__Group__2__Impl rule__Ingress__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Ingress__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingress__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__2"


    // $ANTLR start "rule__Ingress__Group__2__Impl"
    // InternalMultiClusterDsl.g:1759:1: rule__Ingress__Group__2__Impl : ( 'path' ) ;
    public final void rule__Ingress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1763:1: ( ( 'path' ) )
            // InternalMultiClusterDsl.g:1764:1: ( 'path' )
            {
            // InternalMultiClusterDsl.g:1764:1: ( 'path' )
            // InternalMultiClusterDsl.g:1765:2: 'path'
            {
             before(grammarAccess.getIngressAccess().getPathKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getIngressAccess().getPathKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__2__Impl"


    // $ANTLR start "rule__Ingress__Group__3"
    // InternalMultiClusterDsl.g:1774:1: rule__Ingress__Group__3 : rule__Ingress__Group__3__Impl rule__Ingress__Group__4 ;
    public final void rule__Ingress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1778:1: ( rule__Ingress__Group__3__Impl rule__Ingress__Group__4 )
            // InternalMultiClusterDsl.g:1779:2: rule__Ingress__Group__3__Impl rule__Ingress__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Ingress__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ingress__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__3"


    // $ANTLR start "rule__Ingress__Group__3__Impl"
    // InternalMultiClusterDsl.g:1786:1: rule__Ingress__Group__3__Impl : ( ( rule__Ingress__PathAssignment_3 ) ) ;
    public final void rule__Ingress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1790:1: ( ( ( rule__Ingress__PathAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:1791:1: ( ( rule__Ingress__PathAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:1791:1: ( ( rule__Ingress__PathAssignment_3 ) )
            // InternalMultiClusterDsl.g:1792:2: ( rule__Ingress__PathAssignment_3 )
            {
             before(grammarAccess.getIngressAccess().getPathAssignment_3()); 
            // InternalMultiClusterDsl.g:1793:2: ( rule__Ingress__PathAssignment_3 )
            // InternalMultiClusterDsl.g:1793:3: rule__Ingress__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ingress__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIngressAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__3__Impl"


    // $ANTLR start "rule__Ingress__Group__4"
    // InternalMultiClusterDsl.g:1801:1: rule__Ingress__Group__4 : rule__Ingress__Group__4__Impl ;
    public final void rule__Ingress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1805:1: ( rule__Ingress__Group__4__Impl )
            // InternalMultiClusterDsl.g:1806:2: rule__Ingress__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ingress__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__4"


    // $ANTLR start "rule__Ingress__Group__4__Impl"
    // InternalMultiClusterDsl.g:1812:1: rule__Ingress__Group__4__Impl : ( '}' ) ;
    public final void rule__Ingress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1816:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:1817:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:1817:1: ( '}' )
            // InternalMultiClusterDsl.g:1818:2: '}'
            {
             before(grammarAccess.getIngressAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIngressAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__Group__4__Impl"


    // $ANTLR start "rule__ConfigMap__Group__0"
    // InternalMultiClusterDsl.g:1828:1: rule__ConfigMap__Group__0 : rule__ConfigMap__Group__0__Impl rule__ConfigMap__Group__1 ;
    public final void rule__ConfigMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1832:1: ( rule__ConfigMap__Group__0__Impl rule__ConfigMap__Group__1 )
            // InternalMultiClusterDsl.g:1833:2: rule__ConfigMap__Group__0__Impl rule__ConfigMap__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ConfigMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__0"


    // $ANTLR start "rule__ConfigMap__Group__0__Impl"
    // InternalMultiClusterDsl.g:1840:1: rule__ConfigMap__Group__0__Impl : ( 'configMap' ) ;
    public final void rule__ConfigMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1844:1: ( ( 'configMap' ) )
            // InternalMultiClusterDsl.g:1845:1: ( 'configMap' )
            {
            // InternalMultiClusterDsl.g:1845:1: ( 'configMap' )
            // InternalMultiClusterDsl.g:1846:2: 'configMap'
            {
             before(grammarAccess.getConfigMapAccess().getConfigMapKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConfigMapAccess().getConfigMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__0__Impl"


    // $ANTLR start "rule__ConfigMap__Group__1"
    // InternalMultiClusterDsl.g:1855:1: rule__ConfigMap__Group__1 : rule__ConfigMap__Group__1__Impl rule__ConfigMap__Group__2 ;
    public final void rule__ConfigMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1859:1: ( rule__ConfigMap__Group__1__Impl rule__ConfigMap__Group__2 )
            // InternalMultiClusterDsl.g:1860:2: rule__ConfigMap__Group__1__Impl rule__ConfigMap__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ConfigMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__1"


    // $ANTLR start "rule__ConfigMap__Group__1__Impl"
    // InternalMultiClusterDsl.g:1867:1: rule__ConfigMap__Group__1__Impl : ( ( rule__ConfigMap__NameAssignment_1 ) ) ;
    public final void rule__ConfigMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1871:1: ( ( ( rule__ConfigMap__NameAssignment_1 ) ) )
            // InternalMultiClusterDsl.g:1872:1: ( ( rule__ConfigMap__NameAssignment_1 ) )
            {
            // InternalMultiClusterDsl.g:1872:1: ( ( rule__ConfigMap__NameAssignment_1 ) )
            // InternalMultiClusterDsl.g:1873:2: ( rule__ConfigMap__NameAssignment_1 )
            {
             before(grammarAccess.getConfigMapAccess().getNameAssignment_1()); 
            // InternalMultiClusterDsl.g:1874:2: ( rule__ConfigMap__NameAssignment_1 )
            // InternalMultiClusterDsl.g:1874:3: rule__ConfigMap__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigMap__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigMapAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__1__Impl"


    // $ANTLR start "rule__ConfigMap__Group__2"
    // InternalMultiClusterDsl.g:1882:1: rule__ConfigMap__Group__2 : rule__ConfigMap__Group__2__Impl rule__ConfigMap__Group__3 ;
    public final void rule__ConfigMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1886:1: ( rule__ConfigMap__Group__2__Impl rule__ConfigMap__Group__3 )
            // InternalMultiClusterDsl.g:1887:2: rule__ConfigMap__Group__2__Impl rule__ConfigMap__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConfigMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigMap__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__2"


    // $ANTLR start "rule__ConfigMap__Group__2__Impl"
    // InternalMultiClusterDsl.g:1894:1: rule__ConfigMap__Group__2__Impl : ( '{' ) ;
    public final void rule__ConfigMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1898:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:1899:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:1899:1: ( '{' )
            // InternalMultiClusterDsl.g:1900:2: '{'
            {
             before(grammarAccess.getConfigMapAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConfigMapAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__2__Impl"


    // $ANTLR start "rule__ConfigMap__Group__3"
    // InternalMultiClusterDsl.g:1909:1: rule__ConfigMap__Group__3 : rule__ConfigMap__Group__3__Impl rule__ConfigMap__Group__4 ;
    public final void rule__ConfigMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1913:1: ( rule__ConfigMap__Group__3__Impl rule__ConfigMap__Group__4 )
            // InternalMultiClusterDsl.g:1914:2: rule__ConfigMap__Group__3__Impl rule__ConfigMap__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ConfigMap__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigMap__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__3"


    // $ANTLR start "rule__ConfigMap__Group__3__Impl"
    // InternalMultiClusterDsl.g:1921:1: rule__ConfigMap__Group__3__Impl : ( ( ( rule__ConfigMap__EntriesAssignment_3 ) ) ( ( rule__ConfigMap__EntriesAssignment_3 )* ) ) ;
    public final void rule__ConfigMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1925:1: ( ( ( ( rule__ConfigMap__EntriesAssignment_3 ) ) ( ( rule__ConfigMap__EntriesAssignment_3 )* ) ) )
            // InternalMultiClusterDsl.g:1926:1: ( ( ( rule__ConfigMap__EntriesAssignment_3 ) ) ( ( rule__ConfigMap__EntriesAssignment_3 )* ) )
            {
            // InternalMultiClusterDsl.g:1926:1: ( ( ( rule__ConfigMap__EntriesAssignment_3 ) ) ( ( rule__ConfigMap__EntriesAssignment_3 )* ) )
            // InternalMultiClusterDsl.g:1927:2: ( ( rule__ConfigMap__EntriesAssignment_3 ) ) ( ( rule__ConfigMap__EntriesAssignment_3 )* )
            {
            // InternalMultiClusterDsl.g:1927:2: ( ( rule__ConfigMap__EntriesAssignment_3 ) )
            // InternalMultiClusterDsl.g:1928:3: ( rule__ConfigMap__EntriesAssignment_3 )
            {
             before(grammarAccess.getConfigMapAccess().getEntriesAssignment_3()); 
            // InternalMultiClusterDsl.g:1929:3: ( rule__ConfigMap__EntriesAssignment_3 )
            // InternalMultiClusterDsl.g:1929:4: rule__ConfigMap__EntriesAssignment_3
            {
            pushFollow(FOLLOW_25);
            rule__ConfigMap__EntriesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfigMapAccess().getEntriesAssignment_3()); 

            }

            // InternalMultiClusterDsl.g:1932:2: ( ( rule__ConfigMap__EntriesAssignment_3 )* )
            // InternalMultiClusterDsl.g:1933:3: ( rule__ConfigMap__EntriesAssignment_3 )*
            {
             before(grammarAccess.getConfigMapAccess().getEntriesAssignment_3()); 
            // InternalMultiClusterDsl.g:1934:3: ( rule__ConfigMap__EntriesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMultiClusterDsl.g:1934:4: rule__ConfigMap__EntriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__ConfigMap__EntriesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getConfigMapAccess().getEntriesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__3__Impl"


    // $ANTLR start "rule__ConfigMap__Group__4"
    // InternalMultiClusterDsl.g:1943:1: rule__ConfigMap__Group__4 : rule__ConfigMap__Group__4__Impl ;
    public final void rule__ConfigMap__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1947:1: ( rule__ConfigMap__Group__4__Impl )
            // InternalMultiClusterDsl.g:1948:2: rule__ConfigMap__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigMap__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__4"


    // $ANTLR start "rule__ConfigMap__Group__4__Impl"
    // InternalMultiClusterDsl.g:1954:1: rule__ConfigMap__Group__4__Impl : ( '}' ) ;
    public final void rule__ConfigMap__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1958:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:1959:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:1959:1: ( '}' )
            // InternalMultiClusterDsl.g:1960:2: '}'
            {
             before(grammarAccess.getConfigMapAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConfigMapAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__Group__4__Impl"


    // $ANTLR start "rule__ConfigEntry__Group__0"
    // InternalMultiClusterDsl.g:1970:1: rule__ConfigEntry__Group__0 : rule__ConfigEntry__Group__0__Impl rule__ConfigEntry__Group__1 ;
    public final void rule__ConfigEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1974:1: ( rule__ConfigEntry__Group__0__Impl rule__ConfigEntry__Group__1 )
            // InternalMultiClusterDsl.g:1975:2: rule__ConfigEntry__Group__0__Impl rule__ConfigEntry__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ConfigEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConfigEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigEntry__Group__0"


    // $ANTLR start "rule__ConfigEntry__Group__0__Impl"
    // InternalMultiClusterDsl.g:1982:1: rule__ConfigEntry__Group__0__Impl : ( ( rule__ConfigEntry__KeyAssignment_0 ) ) ;
    public final void rule__ConfigEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1986:1: ( ( ( rule__ConfigEntry__KeyAssignment_0 ) ) )
            // InternalMultiClusterDsl.g:1987:1: ( ( rule__ConfigEntry__KeyAssignment_0 ) )
            {
            // InternalMultiClusterDsl.g:1987:1: ( ( rule__ConfigEntry__KeyAssignment_0 ) )
            // InternalMultiClusterDsl.g:1988:2: ( rule__ConfigEntry__KeyAssignment_0 )
            {
             before(grammarAccess.getConfigEntryAccess().getKeyAssignment_0()); 
            // InternalMultiClusterDsl.g:1989:2: ( rule__ConfigEntry__KeyAssignment_0 )
            // InternalMultiClusterDsl.g:1989:3: rule__ConfigEntry__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ConfigEntry__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConfigEntryAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigEntry__Group__0__Impl"


    // $ANTLR start "rule__ConfigEntry__Group__1"
    // InternalMultiClusterDsl.g:1997:1: rule__ConfigEntry__Group__1 : rule__ConfigEntry__Group__1__Impl ;
    public final void rule__ConfigEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2001:1: ( rule__ConfigEntry__Group__1__Impl )
            // InternalMultiClusterDsl.g:2002:2: rule__ConfigEntry__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConfigEntry__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigEntry__Group__1"


    // $ANTLR start "rule__ConfigEntry__Group__1__Impl"
    // InternalMultiClusterDsl.g:2008:1: rule__ConfigEntry__Group__1__Impl : ( ( rule__ConfigEntry__ValueAssignment_1 ) ) ;
    public final void rule__ConfigEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2012:1: ( ( ( rule__ConfigEntry__ValueAssignment_1 ) ) )
            // InternalMultiClusterDsl.g:2013:1: ( ( rule__ConfigEntry__ValueAssignment_1 ) )
            {
            // InternalMultiClusterDsl.g:2013:1: ( ( rule__ConfigEntry__ValueAssignment_1 ) )
            // InternalMultiClusterDsl.g:2014:2: ( rule__ConfigEntry__ValueAssignment_1 )
            {
             before(grammarAccess.getConfigEntryAccess().getValueAssignment_1()); 
            // InternalMultiClusterDsl.g:2015:2: ( rule__ConfigEntry__ValueAssignment_1 )
            // InternalMultiClusterDsl.g:2015:3: rule__ConfigEntry__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConfigEntry__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConfigEntryAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigEntry__Group__1__Impl"


    // $ANTLR start "rule__AutoScaling__Group__0"
    // InternalMultiClusterDsl.g:2024:1: rule__AutoScaling__Group__0 : rule__AutoScaling__Group__0__Impl rule__AutoScaling__Group__1 ;
    public final void rule__AutoScaling__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2028:1: ( rule__AutoScaling__Group__0__Impl rule__AutoScaling__Group__1 )
            // InternalMultiClusterDsl.g:2029:2: rule__AutoScaling__Group__0__Impl rule__AutoScaling__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AutoScaling__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__0"


    // $ANTLR start "rule__AutoScaling__Group__0__Impl"
    // InternalMultiClusterDsl.g:2036:1: rule__AutoScaling__Group__0__Impl : ( 'autoscaling' ) ;
    public final void rule__AutoScaling__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2040:1: ( ( 'autoscaling' ) )
            // InternalMultiClusterDsl.g:2041:1: ( 'autoscaling' )
            {
            // InternalMultiClusterDsl.g:2041:1: ( 'autoscaling' )
            // InternalMultiClusterDsl.g:2042:2: 'autoscaling'
            {
             before(grammarAccess.getAutoScalingAccess().getAutoscalingKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getAutoscalingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__0__Impl"


    // $ANTLR start "rule__AutoScaling__Group__1"
    // InternalMultiClusterDsl.g:2051:1: rule__AutoScaling__Group__1 : rule__AutoScaling__Group__1__Impl rule__AutoScaling__Group__2 ;
    public final void rule__AutoScaling__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2055:1: ( rule__AutoScaling__Group__1__Impl rule__AutoScaling__Group__2 )
            // InternalMultiClusterDsl.g:2056:2: rule__AutoScaling__Group__1__Impl rule__AutoScaling__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AutoScaling__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__1"


    // $ANTLR start "rule__AutoScaling__Group__1__Impl"
    // InternalMultiClusterDsl.g:2063:1: rule__AutoScaling__Group__1__Impl : ( '{' ) ;
    public final void rule__AutoScaling__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2067:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:2068:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:2068:1: ( '{' )
            // InternalMultiClusterDsl.g:2069:2: '{'
            {
             before(grammarAccess.getAutoScalingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__1__Impl"


    // $ANTLR start "rule__AutoScaling__Group__2"
    // InternalMultiClusterDsl.g:2078:1: rule__AutoScaling__Group__2 : rule__AutoScaling__Group__2__Impl rule__AutoScaling__Group__3 ;
    public final void rule__AutoScaling__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2082:1: ( rule__AutoScaling__Group__2__Impl rule__AutoScaling__Group__3 )
            // InternalMultiClusterDsl.g:2083:2: rule__AutoScaling__Group__2__Impl rule__AutoScaling__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AutoScaling__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__2"


    // $ANTLR start "rule__AutoScaling__Group__2__Impl"
    // InternalMultiClusterDsl.g:2090:1: rule__AutoScaling__Group__2__Impl : ( 'minReplicas' ) ;
    public final void rule__AutoScaling__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2094:1: ( ( 'minReplicas' ) )
            // InternalMultiClusterDsl.g:2095:1: ( 'minReplicas' )
            {
            // InternalMultiClusterDsl.g:2095:1: ( 'minReplicas' )
            // InternalMultiClusterDsl.g:2096:2: 'minReplicas'
            {
             before(grammarAccess.getAutoScalingAccess().getMinReplicasKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getMinReplicasKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__2__Impl"


    // $ANTLR start "rule__AutoScaling__Group__3"
    // InternalMultiClusterDsl.g:2105:1: rule__AutoScaling__Group__3 : rule__AutoScaling__Group__3__Impl rule__AutoScaling__Group__4 ;
    public final void rule__AutoScaling__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2109:1: ( rule__AutoScaling__Group__3__Impl rule__AutoScaling__Group__4 )
            // InternalMultiClusterDsl.g:2110:2: rule__AutoScaling__Group__3__Impl rule__AutoScaling__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__AutoScaling__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__3"


    // $ANTLR start "rule__AutoScaling__Group__3__Impl"
    // InternalMultiClusterDsl.g:2117:1: rule__AutoScaling__Group__3__Impl : ( ( rule__AutoScaling__MinReplicasAssignment_3 ) ) ;
    public final void rule__AutoScaling__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2121:1: ( ( ( rule__AutoScaling__MinReplicasAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:2122:1: ( ( rule__AutoScaling__MinReplicasAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:2122:1: ( ( rule__AutoScaling__MinReplicasAssignment_3 ) )
            // InternalMultiClusterDsl.g:2123:2: ( rule__AutoScaling__MinReplicasAssignment_3 )
            {
             before(grammarAccess.getAutoScalingAccess().getMinReplicasAssignment_3()); 
            // InternalMultiClusterDsl.g:2124:2: ( rule__AutoScaling__MinReplicasAssignment_3 )
            // InternalMultiClusterDsl.g:2124:3: rule__AutoScaling__MinReplicasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AutoScaling__MinReplicasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAutoScalingAccess().getMinReplicasAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__3__Impl"


    // $ANTLR start "rule__AutoScaling__Group__4"
    // InternalMultiClusterDsl.g:2132:1: rule__AutoScaling__Group__4 : rule__AutoScaling__Group__4__Impl rule__AutoScaling__Group__5 ;
    public final void rule__AutoScaling__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2136:1: ( rule__AutoScaling__Group__4__Impl rule__AutoScaling__Group__5 )
            // InternalMultiClusterDsl.g:2137:2: rule__AutoScaling__Group__4__Impl rule__AutoScaling__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__AutoScaling__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__4"


    // $ANTLR start "rule__AutoScaling__Group__4__Impl"
    // InternalMultiClusterDsl.g:2144:1: rule__AutoScaling__Group__4__Impl : ( 'maxReplicas' ) ;
    public final void rule__AutoScaling__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2148:1: ( ( 'maxReplicas' ) )
            // InternalMultiClusterDsl.g:2149:1: ( 'maxReplicas' )
            {
            // InternalMultiClusterDsl.g:2149:1: ( 'maxReplicas' )
            // InternalMultiClusterDsl.g:2150:2: 'maxReplicas'
            {
             before(grammarAccess.getAutoScalingAccess().getMaxReplicasKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getMaxReplicasKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__4__Impl"


    // $ANTLR start "rule__AutoScaling__Group__5"
    // InternalMultiClusterDsl.g:2159:1: rule__AutoScaling__Group__5 : rule__AutoScaling__Group__5__Impl rule__AutoScaling__Group__6 ;
    public final void rule__AutoScaling__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2163:1: ( rule__AutoScaling__Group__5__Impl rule__AutoScaling__Group__6 )
            // InternalMultiClusterDsl.g:2164:2: rule__AutoScaling__Group__5__Impl rule__AutoScaling__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__AutoScaling__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__5"


    // $ANTLR start "rule__AutoScaling__Group__5__Impl"
    // InternalMultiClusterDsl.g:2171:1: rule__AutoScaling__Group__5__Impl : ( ( rule__AutoScaling__MaxReplicasAssignment_5 ) ) ;
    public final void rule__AutoScaling__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2175:1: ( ( ( rule__AutoScaling__MaxReplicasAssignment_5 ) ) )
            // InternalMultiClusterDsl.g:2176:1: ( ( rule__AutoScaling__MaxReplicasAssignment_5 ) )
            {
            // InternalMultiClusterDsl.g:2176:1: ( ( rule__AutoScaling__MaxReplicasAssignment_5 ) )
            // InternalMultiClusterDsl.g:2177:2: ( rule__AutoScaling__MaxReplicasAssignment_5 )
            {
             before(grammarAccess.getAutoScalingAccess().getMaxReplicasAssignment_5()); 
            // InternalMultiClusterDsl.g:2178:2: ( rule__AutoScaling__MaxReplicasAssignment_5 )
            // InternalMultiClusterDsl.g:2178:3: rule__AutoScaling__MaxReplicasAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__AutoScaling__MaxReplicasAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAutoScalingAccess().getMaxReplicasAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__5__Impl"


    // $ANTLR start "rule__AutoScaling__Group__6"
    // InternalMultiClusterDsl.g:2186:1: rule__AutoScaling__Group__6 : rule__AutoScaling__Group__6__Impl rule__AutoScaling__Group__7 ;
    public final void rule__AutoScaling__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2190:1: ( rule__AutoScaling__Group__6__Impl rule__AutoScaling__Group__7 )
            // InternalMultiClusterDsl.g:2191:2: rule__AutoScaling__Group__6__Impl rule__AutoScaling__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__AutoScaling__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__6"


    // $ANTLR start "rule__AutoScaling__Group__6__Impl"
    // InternalMultiClusterDsl.g:2198:1: rule__AutoScaling__Group__6__Impl : ( 'cpuUtilization' ) ;
    public final void rule__AutoScaling__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2202:1: ( ( 'cpuUtilization' ) )
            // InternalMultiClusterDsl.g:2203:1: ( 'cpuUtilization' )
            {
            // InternalMultiClusterDsl.g:2203:1: ( 'cpuUtilization' )
            // InternalMultiClusterDsl.g:2204:2: 'cpuUtilization'
            {
             before(grammarAccess.getAutoScalingAccess().getCpuUtilizationKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getCpuUtilizationKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__6__Impl"


    // $ANTLR start "rule__AutoScaling__Group__7"
    // InternalMultiClusterDsl.g:2213:1: rule__AutoScaling__Group__7 : rule__AutoScaling__Group__7__Impl rule__AutoScaling__Group__8 ;
    public final void rule__AutoScaling__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2217:1: ( rule__AutoScaling__Group__7__Impl rule__AutoScaling__Group__8 )
            // InternalMultiClusterDsl.g:2218:2: rule__AutoScaling__Group__7__Impl rule__AutoScaling__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__AutoScaling__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__7"


    // $ANTLR start "rule__AutoScaling__Group__7__Impl"
    // InternalMultiClusterDsl.g:2225:1: rule__AutoScaling__Group__7__Impl : ( ( rule__AutoScaling__CpuUtilizationAssignment_7 ) ) ;
    public final void rule__AutoScaling__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2229:1: ( ( ( rule__AutoScaling__CpuUtilizationAssignment_7 ) ) )
            // InternalMultiClusterDsl.g:2230:1: ( ( rule__AutoScaling__CpuUtilizationAssignment_7 ) )
            {
            // InternalMultiClusterDsl.g:2230:1: ( ( rule__AutoScaling__CpuUtilizationAssignment_7 ) )
            // InternalMultiClusterDsl.g:2231:2: ( rule__AutoScaling__CpuUtilizationAssignment_7 )
            {
             before(grammarAccess.getAutoScalingAccess().getCpuUtilizationAssignment_7()); 
            // InternalMultiClusterDsl.g:2232:2: ( rule__AutoScaling__CpuUtilizationAssignment_7 )
            // InternalMultiClusterDsl.g:2232:3: rule__AutoScaling__CpuUtilizationAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AutoScaling__CpuUtilizationAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAutoScalingAccess().getCpuUtilizationAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__7__Impl"


    // $ANTLR start "rule__AutoScaling__Group__8"
    // InternalMultiClusterDsl.g:2240:1: rule__AutoScaling__Group__8 : rule__AutoScaling__Group__8__Impl ;
    public final void rule__AutoScaling__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2244:1: ( rule__AutoScaling__Group__8__Impl )
            // InternalMultiClusterDsl.g:2245:2: rule__AutoScaling__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutoScaling__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__8"


    // $ANTLR start "rule__AutoScaling__Group__8__Impl"
    // InternalMultiClusterDsl.g:2251:1: rule__AutoScaling__Group__8__Impl : ( '}' ) ;
    public final void rule__AutoScaling__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2255:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:2256:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:2256:1: ( '}' )
            // InternalMultiClusterDsl.g:2257:2: '}'
            {
             before(grammarAccess.getAutoScalingAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__Group__8__Impl"


    // $ANTLR start "rule__Model__ApplicationAssignment"
    // InternalMultiClusterDsl.g:2267:1: rule__Model__ApplicationAssignment : ( ruleApplication ) ;
    public final void rule__Model__ApplicationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2271:1: ( ( ruleApplication ) )
            // InternalMultiClusterDsl.g:2272:2: ( ruleApplication )
            {
            // InternalMultiClusterDsl.g:2272:2: ( ruleApplication )
            // InternalMultiClusterDsl.g:2273:3: ruleApplication
            {
             before(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getModelAccess().getApplicationApplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ApplicationAssignment"


    // $ANTLR start "rule__Application__NameAssignment_1"
    // InternalMultiClusterDsl.g:2282:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2286:1: ( ( RULE_ID ) )
            // InternalMultiClusterDsl.g:2287:2: ( RULE_ID )
            {
            // InternalMultiClusterDsl.g:2287:2: ( RULE_ID )
            // InternalMultiClusterDsl.g:2288:3: RULE_ID
            {
             before(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NameAssignment_1"


    // $ANTLR start "rule__Application__NamespaceAssignment_3_1"
    // InternalMultiClusterDsl.g:2297:1: rule__Application__NamespaceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Application__NamespaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2301:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2302:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2302:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2303:3: RULE_STRING
            {
             before(grammarAccess.getApplicationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getNamespaceSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__NamespaceAssignment_3_1"


    // $ANTLR start "rule__Application__ClustersAssignment_4"
    // InternalMultiClusterDsl.g:2312:1: rule__Application__ClustersAssignment_4 : ( ruleCluster ) ;
    public final void rule__Application__ClustersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2316:1: ( ( ruleCluster ) )
            // InternalMultiClusterDsl.g:2317:2: ( ruleCluster )
            {
            // InternalMultiClusterDsl.g:2317:2: ( ruleCluster )
            // InternalMultiClusterDsl.g:2318:3: ruleCluster
            {
             before(grammarAccess.getApplicationAccess().getClustersClusterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCluster();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getClustersClusterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Application__ClustersAssignment_4"


    // $ANTLR start "rule__Cluster__NameAssignment_1"
    // InternalMultiClusterDsl.g:2327:1: rule__Cluster__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cluster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2331:1: ( ( RULE_ID ) )
            // InternalMultiClusterDsl.g:2332:2: ( RULE_ID )
            {
            // InternalMultiClusterDsl.g:2332:2: ( RULE_ID )
            // InternalMultiClusterDsl.g:2333:3: RULE_ID
            {
             before(grammarAccess.getClusterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClusterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__NameAssignment_1"


    // $ANTLR start "rule__Cluster__DeploymentAssignment_3"
    // InternalMultiClusterDsl.g:2342:1: rule__Cluster__DeploymentAssignment_3 : ( ruleDeployment ) ;
    public final void rule__Cluster__DeploymentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2346:1: ( ( ruleDeployment ) )
            // InternalMultiClusterDsl.g:2347:2: ( ruleDeployment )
            {
            // InternalMultiClusterDsl.g:2347:2: ( ruleDeployment )
            // InternalMultiClusterDsl.g:2348:3: ruleDeployment
            {
             before(grammarAccess.getClusterAccess().getDeploymentDeploymentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeployment();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getDeploymentDeploymentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__DeploymentAssignment_3"


    // $ANTLR start "rule__Cluster__ServiceAssignment_4"
    // InternalMultiClusterDsl.g:2357:1: rule__Cluster__ServiceAssignment_4 : ( ruleService ) ;
    public final void rule__Cluster__ServiceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2361:1: ( ( ruleService ) )
            // InternalMultiClusterDsl.g:2362:2: ( ruleService )
            {
            // InternalMultiClusterDsl.g:2362:2: ( ruleService )
            // InternalMultiClusterDsl.g:2363:3: ruleService
            {
             before(grammarAccess.getClusterAccess().getServiceServiceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleService();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getServiceServiceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__ServiceAssignment_4"


    // $ANTLR start "rule__Cluster__IngressAssignment_5"
    // InternalMultiClusterDsl.g:2372:1: rule__Cluster__IngressAssignment_5 : ( ruleIngress ) ;
    public final void rule__Cluster__IngressAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2376:1: ( ( ruleIngress ) )
            // InternalMultiClusterDsl.g:2377:2: ( ruleIngress )
            {
            // InternalMultiClusterDsl.g:2377:2: ( ruleIngress )
            // InternalMultiClusterDsl.g:2378:3: ruleIngress
            {
             before(grammarAccess.getClusterAccess().getIngressIngressParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleIngress();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getIngressIngressParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__IngressAssignment_5"


    // $ANTLR start "rule__Cluster__ConfigMapAssignment_6"
    // InternalMultiClusterDsl.g:2387:1: rule__Cluster__ConfigMapAssignment_6 : ( ruleConfigMap ) ;
    public final void rule__Cluster__ConfigMapAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2391:1: ( ( ruleConfigMap ) )
            // InternalMultiClusterDsl.g:2392:2: ( ruleConfigMap )
            {
            // InternalMultiClusterDsl.g:2392:2: ( ruleConfigMap )
            // InternalMultiClusterDsl.g:2393:3: ruleConfigMap
            {
             before(grammarAccess.getClusterAccess().getConfigMapConfigMapParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigMap();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getConfigMapConfigMapParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__ConfigMapAssignment_6"


    // $ANTLR start "rule__Cluster__AutoscalingAssignment_7"
    // InternalMultiClusterDsl.g:2402:1: rule__Cluster__AutoscalingAssignment_7 : ( ruleAutoScaling ) ;
    public final void rule__Cluster__AutoscalingAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2406:1: ( ( ruleAutoScaling ) )
            // InternalMultiClusterDsl.g:2407:2: ( ruleAutoScaling )
            {
            // InternalMultiClusterDsl.g:2407:2: ( ruleAutoScaling )
            // InternalMultiClusterDsl.g:2408:3: ruleAutoScaling
            {
             before(grammarAccess.getClusterAccess().getAutoscalingAutoScalingParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAutoScaling();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getAutoscalingAutoScalingParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cluster__AutoscalingAssignment_7"


    // $ANTLR start "rule__Deployment__ImageAssignment_3"
    // InternalMultiClusterDsl.g:2417:1: rule__Deployment__ImageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Deployment__ImageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2421:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2422:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2422:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2423:3: RULE_STRING
            {
             before(grammarAccess.getDeploymentAccess().getImageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getImageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__ImageAssignment_3"


    // $ANTLR start "rule__Deployment__ReplicasAssignment_5"
    // InternalMultiClusterDsl.g:2432:1: rule__Deployment__ReplicasAssignment_5 : ( RULE_INT ) ;
    public final void rule__Deployment__ReplicasAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2436:1: ( ( RULE_INT ) )
            // InternalMultiClusterDsl.g:2437:2: ( RULE_INT )
            {
            // InternalMultiClusterDsl.g:2437:2: ( RULE_INT )
            // InternalMultiClusterDsl.g:2438:3: RULE_INT
            {
             before(grammarAccess.getDeploymentAccess().getReplicasINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getReplicasINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__ReplicasAssignment_5"


    // $ANTLR start "rule__Deployment__ResourcesAssignment_6"
    // InternalMultiClusterDsl.g:2447:1: rule__Deployment__ResourcesAssignment_6 : ( ruleResources ) ;
    public final void rule__Deployment__ResourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2451:1: ( ( ruleResources ) )
            // InternalMultiClusterDsl.g:2452:2: ( ruleResources )
            {
            // InternalMultiClusterDsl.g:2452:2: ( ruleResources )
            // InternalMultiClusterDsl.g:2453:3: ruleResources
            {
             before(grammarAccess.getDeploymentAccess().getResourcesResourcesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleResources();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getResourcesResourcesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__ResourcesAssignment_6"


    // $ANTLR start "rule__Deployment__HealthAssignment_7"
    // InternalMultiClusterDsl.g:2462:1: rule__Deployment__HealthAssignment_7 : ( ruleHealth ) ;
    public final void rule__Deployment__HealthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2466:1: ( ( ruleHealth ) )
            // InternalMultiClusterDsl.g:2467:2: ( ruleHealth )
            {
            // InternalMultiClusterDsl.g:2467:2: ( ruleHealth )
            // InternalMultiClusterDsl.g:2468:3: ruleHealth
            {
             before(grammarAccess.getDeploymentAccess().getHealthHealthParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleHealth();

            state._fsp--;

             after(grammarAccess.getDeploymentAccess().getHealthHealthParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deployment__HealthAssignment_7"


    // $ANTLR start "rule__Resources__CpuAssignment_3"
    // InternalMultiClusterDsl.g:2477:1: rule__Resources__CpuAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Resources__CpuAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2481:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2482:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2482:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2483:3: RULE_STRING
            {
             before(grammarAccess.getResourcesAccess().getCpuSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getCpuSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__CpuAssignment_3"


    // $ANTLR start "rule__Resources__MemoryAssignment_5"
    // InternalMultiClusterDsl.g:2492:1: rule__Resources__MemoryAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Resources__MemoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2496:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2497:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2497:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2498:3: RULE_STRING
            {
             before(grammarAccess.getResourcesAccess().getMemorySTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getResourcesAccess().getMemorySTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resources__MemoryAssignment_5"


    // $ANTLR start "rule__Health__ReadinessPathAssignment_3"
    // InternalMultiClusterDsl.g:2507:1: rule__Health__ReadinessPathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Health__ReadinessPathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2511:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2512:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2512:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2513:3: RULE_STRING
            {
             before(grammarAccess.getHealthAccess().getReadinessPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHealthAccess().getReadinessPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__ReadinessPathAssignment_3"


    // $ANTLR start "rule__Health__LivenessPathAssignment_5"
    // InternalMultiClusterDsl.g:2522:1: rule__Health__LivenessPathAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Health__LivenessPathAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2526:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2527:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2527:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2528:3: RULE_STRING
            {
             before(grammarAccess.getHealthAccess().getLivenessPathSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHealthAccess().getLivenessPathSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Health__LivenessPathAssignment_5"


    // $ANTLR start "rule__Service__TypeAssignment_3"
    // InternalMultiClusterDsl.g:2537:1: rule__Service__TypeAssignment_3 : ( ruleServiceType ) ;
    public final void rule__Service__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2541:1: ( ( ruleServiceType ) )
            // InternalMultiClusterDsl.g:2542:2: ( ruleServiceType )
            {
            // InternalMultiClusterDsl.g:2542:2: ( ruleServiceType )
            // InternalMultiClusterDsl.g:2543:3: ruleServiceType
            {
             before(grammarAccess.getServiceAccess().getTypeServiceTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceType();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getTypeServiceTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__TypeAssignment_3"


    // $ANTLR start "rule__Service__PortAssignment_5"
    // InternalMultiClusterDsl.g:2552:1: rule__Service__PortAssignment_5 : ( RULE_INT ) ;
    public final void rule__Service__PortAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2556:1: ( ( RULE_INT ) )
            // InternalMultiClusterDsl.g:2557:2: ( RULE_INT )
            {
            // InternalMultiClusterDsl.g:2557:2: ( RULE_INT )
            // InternalMultiClusterDsl.g:2558:3: RULE_INT
            {
             before(grammarAccess.getServiceAccess().getPortINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getPortINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__PortAssignment_5"


    // $ANTLR start "rule__Service__TargetPortAssignment_7"
    // InternalMultiClusterDsl.g:2567:1: rule__Service__TargetPortAssignment_7 : ( RULE_INT ) ;
    public final void rule__Service__TargetPortAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2571:1: ( ( RULE_INT ) )
            // InternalMultiClusterDsl.g:2572:2: ( RULE_INT )
            {
            // InternalMultiClusterDsl.g:2572:2: ( RULE_INT )
            // InternalMultiClusterDsl.g:2573:3: RULE_INT
            {
             before(grammarAccess.getServiceAccess().getTargetPortINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getServiceAccess().getTargetPortINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__TargetPortAssignment_7"


    // $ANTLR start "rule__Ingress__PathAssignment_3"
    // InternalMultiClusterDsl.g:2582:1: rule__Ingress__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Ingress__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2586:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2587:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2587:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2588:3: RULE_STRING
            {
             before(grammarAccess.getIngressAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getIngressAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingress__PathAssignment_3"


    // $ANTLR start "rule__ConfigMap__NameAssignment_1"
    // InternalMultiClusterDsl.g:2597:1: rule__ConfigMap__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConfigMap__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2601:1: ( ( RULE_ID ) )
            // InternalMultiClusterDsl.g:2602:2: ( RULE_ID )
            {
            // InternalMultiClusterDsl.g:2602:2: ( RULE_ID )
            // InternalMultiClusterDsl.g:2603:3: RULE_ID
            {
             before(grammarAccess.getConfigMapAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigMapAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__NameAssignment_1"


    // $ANTLR start "rule__ConfigMap__EntriesAssignment_3"
    // InternalMultiClusterDsl.g:2612:1: rule__ConfigMap__EntriesAssignment_3 : ( ruleConfigEntry ) ;
    public final void rule__ConfigMap__EntriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2616:1: ( ( ruleConfigEntry ) )
            // InternalMultiClusterDsl.g:2617:2: ( ruleConfigEntry )
            {
            // InternalMultiClusterDsl.g:2617:2: ( ruleConfigEntry )
            // InternalMultiClusterDsl.g:2618:3: ruleConfigEntry
            {
             before(grammarAccess.getConfigMapAccess().getEntriesConfigEntryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConfigEntry();

            state._fsp--;

             after(grammarAccess.getConfigMapAccess().getEntriesConfigEntryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigMap__EntriesAssignment_3"


    // $ANTLR start "rule__ConfigEntry__KeyAssignment_0"
    // InternalMultiClusterDsl.g:2627:1: rule__ConfigEntry__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__ConfigEntry__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2631:1: ( ( RULE_ID ) )
            // InternalMultiClusterDsl.g:2632:2: ( RULE_ID )
            {
            // InternalMultiClusterDsl.g:2632:2: ( RULE_ID )
            // InternalMultiClusterDsl.g:2633:3: RULE_ID
            {
             before(grammarAccess.getConfigEntryAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConfigEntryAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigEntry__KeyAssignment_0"


    // $ANTLR start "rule__ConfigEntry__ValueAssignment_1"
    // InternalMultiClusterDsl.g:2642:1: rule__ConfigEntry__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConfigEntry__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2646:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:2647:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:2647:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:2648:3: RULE_STRING
            {
             before(grammarAccess.getConfigEntryAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConfigEntryAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConfigEntry__ValueAssignment_1"


    // $ANTLR start "rule__AutoScaling__MinReplicasAssignment_3"
    // InternalMultiClusterDsl.g:2657:1: rule__AutoScaling__MinReplicasAssignment_3 : ( RULE_INT ) ;
    public final void rule__AutoScaling__MinReplicasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2661:1: ( ( RULE_INT ) )
            // InternalMultiClusterDsl.g:2662:2: ( RULE_INT )
            {
            // InternalMultiClusterDsl.g:2662:2: ( RULE_INT )
            // InternalMultiClusterDsl.g:2663:3: RULE_INT
            {
             before(grammarAccess.getAutoScalingAccess().getMinReplicasINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getMinReplicasINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__MinReplicasAssignment_3"


    // $ANTLR start "rule__AutoScaling__MaxReplicasAssignment_5"
    // InternalMultiClusterDsl.g:2672:1: rule__AutoScaling__MaxReplicasAssignment_5 : ( RULE_INT ) ;
    public final void rule__AutoScaling__MaxReplicasAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2676:1: ( ( RULE_INT ) )
            // InternalMultiClusterDsl.g:2677:2: ( RULE_INT )
            {
            // InternalMultiClusterDsl.g:2677:2: ( RULE_INT )
            // InternalMultiClusterDsl.g:2678:3: RULE_INT
            {
             before(grammarAccess.getAutoScalingAccess().getMaxReplicasINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getMaxReplicasINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__MaxReplicasAssignment_5"


    // $ANTLR start "rule__AutoScaling__CpuUtilizationAssignment_7"
    // InternalMultiClusterDsl.g:2687:1: rule__AutoScaling__CpuUtilizationAssignment_7 : ( RULE_INT ) ;
    public final void rule__AutoScaling__CpuUtilizationAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:2691:1: ( ( RULE_INT ) )
            // InternalMultiClusterDsl.g:2692:2: ( RULE_INT )
            {
            // InternalMultiClusterDsl.g:2692:2: ( RULE_INT )
            // InternalMultiClusterDsl.g:2693:3: RULE_INT
            {
             before(grammarAccess.getAutoScalingAccess().getCpuUtilizationINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAutoScalingAccess().getCpuUtilizationINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutoScaling__CpuUtilizationAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000D10010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});

}