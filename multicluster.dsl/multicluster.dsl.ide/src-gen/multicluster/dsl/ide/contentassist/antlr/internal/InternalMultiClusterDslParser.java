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


    // $ANTLR start "entryRuleIngress"
    // InternalMultiClusterDsl.g:178:1: entryRuleIngress : ruleIngress EOF ;
    public final void entryRuleIngress() throws RecognitionException {
        try {
            // InternalMultiClusterDsl.g:179:1: ( ruleIngress EOF )
            // InternalMultiClusterDsl.g:180:1: ruleIngress EOF
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
    // InternalMultiClusterDsl.g:187:1: ruleIngress : ( ( rule__Ingress__Group__0 ) ) ;
    public final void ruleIngress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:191:2: ( ( ( rule__Ingress__Group__0 ) ) )
            // InternalMultiClusterDsl.g:192:2: ( ( rule__Ingress__Group__0 ) )
            {
            // InternalMultiClusterDsl.g:192:2: ( ( rule__Ingress__Group__0 ) )
            // InternalMultiClusterDsl.g:193:3: ( rule__Ingress__Group__0 )
            {
             before(grammarAccess.getIngressAccess().getGroup()); 
            // InternalMultiClusterDsl.g:194:3: ( rule__Ingress__Group__0 )
            // InternalMultiClusterDsl.g:194:4: rule__Ingress__Group__0
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


    // $ANTLR start "rule__Application__Group__0"
    // InternalMultiClusterDsl.g:202:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:206:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalMultiClusterDsl.g:207:2: rule__Application__Group__0__Impl rule__Application__Group__1
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
    // InternalMultiClusterDsl.g:214:1: rule__Application__Group__0__Impl : ( 'application' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:218:1: ( ( 'application' ) )
            // InternalMultiClusterDsl.g:219:1: ( 'application' )
            {
            // InternalMultiClusterDsl.g:219:1: ( 'application' )
            // InternalMultiClusterDsl.g:220:2: 'application'
            {
             before(grammarAccess.getApplicationAccess().getApplicationKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:229:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:233:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalMultiClusterDsl.g:234:2: rule__Application__Group__1__Impl rule__Application__Group__2
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
    // InternalMultiClusterDsl.g:241:1: rule__Application__Group__1__Impl : ( ( rule__Application__NameAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:245:1: ( ( ( rule__Application__NameAssignment_1 ) ) )
            // InternalMultiClusterDsl.g:246:1: ( ( rule__Application__NameAssignment_1 ) )
            {
            // InternalMultiClusterDsl.g:246:1: ( ( rule__Application__NameAssignment_1 ) )
            // InternalMultiClusterDsl.g:247:2: ( rule__Application__NameAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getNameAssignment_1()); 
            // InternalMultiClusterDsl.g:248:2: ( rule__Application__NameAssignment_1 )
            // InternalMultiClusterDsl.g:248:3: rule__Application__NameAssignment_1
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
    // InternalMultiClusterDsl.g:256:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:260:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalMultiClusterDsl.g:261:2: rule__Application__Group__2__Impl rule__Application__Group__3
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
    // InternalMultiClusterDsl.g:268:1: rule__Application__Group__2__Impl : ( '{' ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:272:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:273:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:273:1: ( '{' )
            // InternalMultiClusterDsl.g:274:2: '{'
            {
             before(grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:283:1: rule__Application__Group__3 : rule__Application__Group__3__Impl rule__Application__Group__4 ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:287:1: ( rule__Application__Group__3__Impl rule__Application__Group__4 )
            // InternalMultiClusterDsl.g:288:2: rule__Application__Group__3__Impl rule__Application__Group__4
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
    // InternalMultiClusterDsl.g:295:1: rule__Application__Group__3__Impl : ( ( rule__Application__ClustersAssignment_3 )* ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:299:1: ( ( ( rule__Application__ClustersAssignment_3 )* ) )
            // InternalMultiClusterDsl.g:300:1: ( ( rule__Application__ClustersAssignment_3 )* )
            {
            // InternalMultiClusterDsl.g:300:1: ( ( rule__Application__ClustersAssignment_3 )* )
            // InternalMultiClusterDsl.g:301:2: ( rule__Application__ClustersAssignment_3 )*
            {
             before(grammarAccess.getApplicationAccess().getClustersAssignment_3()); 
            // InternalMultiClusterDsl.g:302:2: ( rule__Application__ClustersAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMultiClusterDsl.g:302:3: rule__Application__ClustersAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Application__ClustersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getClustersAssignment_3()); 

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
    // InternalMultiClusterDsl.g:310:1: rule__Application__Group__4 : rule__Application__Group__4__Impl ;
    public final void rule__Application__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:314:1: ( rule__Application__Group__4__Impl )
            // InternalMultiClusterDsl.g:315:2: rule__Application__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__4__Impl();

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
    // InternalMultiClusterDsl.g:321:1: rule__Application__Group__4__Impl : ( '}' ) ;
    public final void rule__Application__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:325:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:326:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:326:1: ( '}' )
            // InternalMultiClusterDsl.g:327:2: '}'
            {
             before(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Cluster__Group__0"
    // InternalMultiClusterDsl.g:337:1: rule__Cluster__Group__0 : rule__Cluster__Group__0__Impl rule__Cluster__Group__1 ;
    public final void rule__Cluster__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:341:1: ( rule__Cluster__Group__0__Impl rule__Cluster__Group__1 )
            // InternalMultiClusterDsl.g:342:2: rule__Cluster__Group__0__Impl rule__Cluster__Group__1
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
    // InternalMultiClusterDsl.g:349:1: rule__Cluster__Group__0__Impl : ( 'cluster' ) ;
    public final void rule__Cluster__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:353:1: ( ( 'cluster' ) )
            // InternalMultiClusterDsl.g:354:1: ( 'cluster' )
            {
            // InternalMultiClusterDsl.g:354:1: ( 'cluster' )
            // InternalMultiClusterDsl.g:355:2: 'cluster'
            {
             before(grammarAccess.getClusterAccess().getClusterKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:364:1: rule__Cluster__Group__1 : rule__Cluster__Group__1__Impl rule__Cluster__Group__2 ;
    public final void rule__Cluster__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:368:1: ( rule__Cluster__Group__1__Impl rule__Cluster__Group__2 )
            // InternalMultiClusterDsl.g:369:2: rule__Cluster__Group__1__Impl rule__Cluster__Group__2
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
    // InternalMultiClusterDsl.g:376:1: rule__Cluster__Group__1__Impl : ( ( rule__Cluster__NameAssignment_1 ) ) ;
    public final void rule__Cluster__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:380:1: ( ( ( rule__Cluster__NameAssignment_1 ) ) )
            // InternalMultiClusterDsl.g:381:1: ( ( rule__Cluster__NameAssignment_1 ) )
            {
            // InternalMultiClusterDsl.g:381:1: ( ( rule__Cluster__NameAssignment_1 ) )
            // InternalMultiClusterDsl.g:382:2: ( rule__Cluster__NameAssignment_1 )
            {
             before(grammarAccess.getClusterAccess().getNameAssignment_1()); 
            // InternalMultiClusterDsl.g:383:2: ( rule__Cluster__NameAssignment_1 )
            // InternalMultiClusterDsl.g:383:3: rule__Cluster__NameAssignment_1
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
    // InternalMultiClusterDsl.g:391:1: rule__Cluster__Group__2 : rule__Cluster__Group__2__Impl rule__Cluster__Group__3 ;
    public final void rule__Cluster__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:395:1: ( rule__Cluster__Group__2__Impl rule__Cluster__Group__3 )
            // InternalMultiClusterDsl.g:396:2: rule__Cluster__Group__2__Impl rule__Cluster__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalMultiClusterDsl.g:403:1: rule__Cluster__Group__2__Impl : ( '{' ) ;
    public final void rule__Cluster__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:407:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:408:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:408:1: ( '{' )
            // InternalMultiClusterDsl.g:409:2: '{'
            {
             before(grammarAccess.getClusterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:418:1: rule__Cluster__Group__3 : rule__Cluster__Group__3__Impl rule__Cluster__Group__4 ;
    public final void rule__Cluster__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:422:1: ( rule__Cluster__Group__3__Impl rule__Cluster__Group__4 )
            // InternalMultiClusterDsl.g:423:2: rule__Cluster__Group__3__Impl rule__Cluster__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalMultiClusterDsl.g:430:1: rule__Cluster__Group__3__Impl : ( ( rule__Cluster__DeploymentAssignment_3 ) ) ;
    public final void rule__Cluster__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:434:1: ( ( ( rule__Cluster__DeploymentAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:435:1: ( ( rule__Cluster__DeploymentAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:435:1: ( ( rule__Cluster__DeploymentAssignment_3 ) )
            // InternalMultiClusterDsl.g:436:2: ( rule__Cluster__DeploymentAssignment_3 )
            {
             before(grammarAccess.getClusterAccess().getDeploymentAssignment_3()); 
            // InternalMultiClusterDsl.g:437:2: ( rule__Cluster__DeploymentAssignment_3 )
            // InternalMultiClusterDsl.g:437:3: rule__Cluster__DeploymentAssignment_3
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
    // InternalMultiClusterDsl.g:445:1: rule__Cluster__Group__4 : rule__Cluster__Group__4__Impl rule__Cluster__Group__5 ;
    public final void rule__Cluster__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:449:1: ( rule__Cluster__Group__4__Impl rule__Cluster__Group__5 )
            // InternalMultiClusterDsl.g:450:2: rule__Cluster__Group__4__Impl rule__Cluster__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMultiClusterDsl.g:457:1: rule__Cluster__Group__4__Impl : ( ( rule__Cluster__IngressAssignment_4 )? ) ;
    public final void rule__Cluster__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:461:1: ( ( ( rule__Cluster__IngressAssignment_4 )? ) )
            // InternalMultiClusterDsl.g:462:1: ( ( rule__Cluster__IngressAssignment_4 )? )
            {
            // InternalMultiClusterDsl.g:462:1: ( ( rule__Cluster__IngressAssignment_4 )? )
            // InternalMultiClusterDsl.g:463:2: ( rule__Cluster__IngressAssignment_4 )?
            {
             before(grammarAccess.getClusterAccess().getIngressAssignment_4()); 
            // InternalMultiClusterDsl.g:464:2: ( rule__Cluster__IngressAssignment_4 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMultiClusterDsl.g:464:3: rule__Cluster__IngressAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cluster__IngressAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClusterAccess().getIngressAssignment_4()); 

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
    // InternalMultiClusterDsl.g:472:1: rule__Cluster__Group__5 : rule__Cluster__Group__5__Impl ;
    public final void rule__Cluster__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:476:1: ( rule__Cluster__Group__5__Impl )
            // InternalMultiClusterDsl.g:477:2: rule__Cluster__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cluster__Group__5__Impl();

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
    // InternalMultiClusterDsl.g:483:1: rule__Cluster__Group__5__Impl : ( '}' ) ;
    public final void rule__Cluster__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:487:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:488:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:488:1: ( '}' )
            // InternalMultiClusterDsl.g:489:2: '}'
            {
             before(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClusterAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Deployment__Group__0"
    // InternalMultiClusterDsl.g:499:1: rule__Deployment__Group__0 : rule__Deployment__Group__0__Impl rule__Deployment__Group__1 ;
    public final void rule__Deployment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:503:1: ( rule__Deployment__Group__0__Impl rule__Deployment__Group__1 )
            // InternalMultiClusterDsl.g:504:2: rule__Deployment__Group__0__Impl rule__Deployment__Group__1
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
    // InternalMultiClusterDsl.g:511:1: rule__Deployment__Group__0__Impl : ( 'deployment' ) ;
    public final void rule__Deployment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:515:1: ( ( 'deployment' ) )
            // InternalMultiClusterDsl.g:516:1: ( 'deployment' )
            {
            // InternalMultiClusterDsl.g:516:1: ( 'deployment' )
            // InternalMultiClusterDsl.g:517:2: 'deployment'
            {
             before(grammarAccess.getDeploymentAccess().getDeploymentKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:526:1: rule__Deployment__Group__1 : rule__Deployment__Group__1__Impl rule__Deployment__Group__2 ;
    public final void rule__Deployment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:530:1: ( rule__Deployment__Group__1__Impl rule__Deployment__Group__2 )
            // InternalMultiClusterDsl.g:531:2: rule__Deployment__Group__1__Impl rule__Deployment__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMultiClusterDsl.g:538:1: rule__Deployment__Group__1__Impl : ( '{' ) ;
    public final void rule__Deployment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:542:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:543:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:543:1: ( '{' )
            // InternalMultiClusterDsl.g:544:2: '{'
            {
             before(grammarAccess.getDeploymentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:553:1: rule__Deployment__Group__2 : rule__Deployment__Group__2__Impl rule__Deployment__Group__3 ;
    public final void rule__Deployment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:557:1: ( rule__Deployment__Group__2__Impl rule__Deployment__Group__3 )
            // InternalMultiClusterDsl.g:558:2: rule__Deployment__Group__2__Impl rule__Deployment__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMultiClusterDsl.g:565:1: rule__Deployment__Group__2__Impl : ( 'image' ) ;
    public final void rule__Deployment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:569:1: ( ( 'image' ) )
            // InternalMultiClusterDsl.g:570:1: ( 'image' )
            {
            // InternalMultiClusterDsl.g:570:1: ( 'image' )
            // InternalMultiClusterDsl.g:571:2: 'image'
            {
             before(grammarAccess.getDeploymentAccess().getImageKeyword_2()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:580:1: rule__Deployment__Group__3 : rule__Deployment__Group__3__Impl rule__Deployment__Group__4 ;
    public final void rule__Deployment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:584:1: ( rule__Deployment__Group__3__Impl rule__Deployment__Group__4 )
            // InternalMultiClusterDsl.g:585:2: rule__Deployment__Group__3__Impl rule__Deployment__Group__4
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
    // InternalMultiClusterDsl.g:592:1: rule__Deployment__Group__3__Impl : ( ( rule__Deployment__ImageAssignment_3 ) ) ;
    public final void rule__Deployment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:596:1: ( ( ( rule__Deployment__ImageAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:597:1: ( ( rule__Deployment__ImageAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:597:1: ( ( rule__Deployment__ImageAssignment_3 ) )
            // InternalMultiClusterDsl.g:598:2: ( rule__Deployment__ImageAssignment_3 )
            {
             before(grammarAccess.getDeploymentAccess().getImageAssignment_3()); 
            // InternalMultiClusterDsl.g:599:2: ( rule__Deployment__ImageAssignment_3 )
            // InternalMultiClusterDsl.g:599:3: rule__Deployment__ImageAssignment_3
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
    // InternalMultiClusterDsl.g:607:1: rule__Deployment__Group__4 : rule__Deployment__Group__4__Impl rule__Deployment__Group__5 ;
    public final void rule__Deployment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:611:1: ( rule__Deployment__Group__4__Impl rule__Deployment__Group__5 )
            // InternalMultiClusterDsl.g:612:2: rule__Deployment__Group__4__Impl rule__Deployment__Group__5
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
    // InternalMultiClusterDsl.g:619:1: rule__Deployment__Group__4__Impl : ( 'replicas' ) ;
    public final void rule__Deployment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:623:1: ( ( 'replicas' ) )
            // InternalMultiClusterDsl.g:624:1: ( 'replicas' )
            {
            // InternalMultiClusterDsl.g:624:1: ( 'replicas' )
            // InternalMultiClusterDsl.g:625:2: 'replicas'
            {
             before(grammarAccess.getDeploymentAccess().getReplicasKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:634:1: rule__Deployment__Group__5 : rule__Deployment__Group__5__Impl rule__Deployment__Group__6 ;
    public final void rule__Deployment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:638:1: ( rule__Deployment__Group__5__Impl rule__Deployment__Group__6 )
            // InternalMultiClusterDsl.g:639:2: rule__Deployment__Group__5__Impl rule__Deployment__Group__6
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
    // InternalMultiClusterDsl.g:646:1: rule__Deployment__Group__5__Impl : ( ( rule__Deployment__ReplicasAssignment_5 ) ) ;
    public final void rule__Deployment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:650:1: ( ( ( rule__Deployment__ReplicasAssignment_5 ) ) )
            // InternalMultiClusterDsl.g:651:1: ( ( rule__Deployment__ReplicasAssignment_5 ) )
            {
            // InternalMultiClusterDsl.g:651:1: ( ( rule__Deployment__ReplicasAssignment_5 ) )
            // InternalMultiClusterDsl.g:652:2: ( rule__Deployment__ReplicasAssignment_5 )
            {
             before(grammarAccess.getDeploymentAccess().getReplicasAssignment_5()); 
            // InternalMultiClusterDsl.g:653:2: ( rule__Deployment__ReplicasAssignment_5 )
            // InternalMultiClusterDsl.g:653:3: rule__Deployment__ReplicasAssignment_5
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
    // InternalMultiClusterDsl.g:661:1: rule__Deployment__Group__6 : rule__Deployment__Group__6__Impl rule__Deployment__Group__7 ;
    public final void rule__Deployment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:665:1: ( rule__Deployment__Group__6__Impl rule__Deployment__Group__7 )
            // InternalMultiClusterDsl.g:666:2: rule__Deployment__Group__6__Impl rule__Deployment__Group__7
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
    // InternalMultiClusterDsl.g:673:1: rule__Deployment__Group__6__Impl : ( ( rule__Deployment__ResourcesAssignment_6 ) ) ;
    public final void rule__Deployment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:677:1: ( ( ( rule__Deployment__ResourcesAssignment_6 ) ) )
            // InternalMultiClusterDsl.g:678:1: ( ( rule__Deployment__ResourcesAssignment_6 ) )
            {
            // InternalMultiClusterDsl.g:678:1: ( ( rule__Deployment__ResourcesAssignment_6 ) )
            // InternalMultiClusterDsl.g:679:2: ( rule__Deployment__ResourcesAssignment_6 )
            {
             before(grammarAccess.getDeploymentAccess().getResourcesAssignment_6()); 
            // InternalMultiClusterDsl.g:680:2: ( rule__Deployment__ResourcesAssignment_6 )
            // InternalMultiClusterDsl.g:680:3: rule__Deployment__ResourcesAssignment_6
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
    // InternalMultiClusterDsl.g:688:1: rule__Deployment__Group__7 : rule__Deployment__Group__7__Impl ;
    public final void rule__Deployment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:692:1: ( rule__Deployment__Group__7__Impl )
            // InternalMultiClusterDsl.g:693:2: rule__Deployment__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Deployment__Group__7__Impl();

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
    // InternalMultiClusterDsl.g:699:1: rule__Deployment__Group__7__Impl : ( '}' ) ;
    public final void rule__Deployment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:703:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:704:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:704:1: ( '}' )
            // InternalMultiClusterDsl.g:705:2: '}'
            {
             before(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDeploymentAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__Resources__Group__0"
    // InternalMultiClusterDsl.g:715:1: rule__Resources__Group__0 : rule__Resources__Group__0__Impl rule__Resources__Group__1 ;
    public final void rule__Resources__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:719:1: ( rule__Resources__Group__0__Impl rule__Resources__Group__1 )
            // InternalMultiClusterDsl.g:720:2: rule__Resources__Group__0__Impl rule__Resources__Group__1
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
    // InternalMultiClusterDsl.g:727:1: rule__Resources__Group__0__Impl : ( 'resources' ) ;
    public final void rule__Resources__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:731:1: ( ( 'resources' ) )
            // InternalMultiClusterDsl.g:732:1: ( 'resources' )
            {
            // InternalMultiClusterDsl.g:732:1: ( 'resources' )
            // InternalMultiClusterDsl.g:733:2: 'resources'
            {
             before(grammarAccess.getResourcesAccess().getResourcesKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:742:1: rule__Resources__Group__1 : rule__Resources__Group__1__Impl rule__Resources__Group__2 ;
    public final void rule__Resources__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:746:1: ( rule__Resources__Group__1__Impl rule__Resources__Group__2 )
            // InternalMultiClusterDsl.g:747:2: rule__Resources__Group__1__Impl rule__Resources__Group__2
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
    // InternalMultiClusterDsl.g:754:1: rule__Resources__Group__1__Impl : ( '{' ) ;
    public final void rule__Resources__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:758:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:759:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:759:1: ( '{' )
            // InternalMultiClusterDsl.g:760:2: '{'
            {
             before(grammarAccess.getResourcesAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:769:1: rule__Resources__Group__2 : rule__Resources__Group__2__Impl rule__Resources__Group__3 ;
    public final void rule__Resources__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:773:1: ( rule__Resources__Group__2__Impl rule__Resources__Group__3 )
            // InternalMultiClusterDsl.g:774:2: rule__Resources__Group__2__Impl rule__Resources__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMultiClusterDsl.g:781:1: rule__Resources__Group__2__Impl : ( 'cpu' ) ;
    public final void rule__Resources__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:785:1: ( ( 'cpu' ) )
            // InternalMultiClusterDsl.g:786:1: ( 'cpu' )
            {
            // InternalMultiClusterDsl.g:786:1: ( 'cpu' )
            // InternalMultiClusterDsl.g:787:2: 'cpu'
            {
             before(grammarAccess.getResourcesAccess().getCpuKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:796:1: rule__Resources__Group__3 : rule__Resources__Group__3__Impl rule__Resources__Group__4 ;
    public final void rule__Resources__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:800:1: ( rule__Resources__Group__3__Impl rule__Resources__Group__4 )
            // InternalMultiClusterDsl.g:801:2: rule__Resources__Group__3__Impl rule__Resources__Group__4
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
    // InternalMultiClusterDsl.g:808:1: rule__Resources__Group__3__Impl : ( ( rule__Resources__CpuAssignment_3 ) ) ;
    public final void rule__Resources__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:812:1: ( ( ( rule__Resources__CpuAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:813:1: ( ( rule__Resources__CpuAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:813:1: ( ( rule__Resources__CpuAssignment_3 ) )
            // InternalMultiClusterDsl.g:814:2: ( rule__Resources__CpuAssignment_3 )
            {
             before(grammarAccess.getResourcesAccess().getCpuAssignment_3()); 
            // InternalMultiClusterDsl.g:815:2: ( rule__Resources__CpuAssignment_3 )
            // InternalMultiClusterDsl.g:815:3: rule__Resources__CpuAssignment_3
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
    // InternalMultiClusterDsl.g:823:1: rule__Resources__Group__4 : rule__Resources__Group__4__Impl rule__Resources__Group__5 ;
    public final void rule__Resources__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:827:1: ( rule__Resources__Group__4__Impl rule__Resources__Group__5 )
            // InternalMultiClusterDsl.g:828:2: rule__Resources__Group__4__Impl rule__Resources__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalMultiClusterDsl.g:835:1: rule__Resources__Group__4__Impl : ( 'memory' ) ;
    public final void rule__Resources__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:839:1: ( ( 'memory' ) )
            // InternalMultiClusterDsl.g:840:1: ( 'memory' )
            {
            // InternalMultiClusterDsl.g:840:1: ( 'memory' )
            // InternalMultiClusterDsl.g:841:2: 'memory'
            {
             before(grammarAccess.getResourcesAccess().getMemoryKeyword_4()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:850:1: rule__Resources__Group__5 : rule__Resources__Group__5__Impl rule__Resources__Group__6 ;
    public final void rule__Resources__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:854:1: ( rule__Resources__Group__5__Impl rule__Resources__Group__6 )
            // InternalMultiClusterDsl.g:855:2: rule__Resources__Group__5__Impl rule__Resources__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalMultiClusterDsl.g:862:1: rule__Resources__Group__5__Impl : ( ( rule__Resources__MemoryAssignment_5 ) ) ;
    public final void rule__Resources__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:866:1: ( ( ( rule__Resources__MemoryAssignment_5 ) ) )
            // InternalMultiClusterDsl.g:867:1: ( ( rule__Resources__MemoryAssignment_5 ) )
            {
            // InternalMultiClusterDsl.g:867:1: ( ( rule__Resources__MemoryAssignment_5 ) )
            // InternalMultiClusterDsl.g:868:2: ( rule__Resources__MemoryAssignment_5 )
            {
             before(grammarAccess.getResourcesAccess().getMemoryAssignment_5()); 
            // InternalMultiClusterDsl.g:869:2: ( rule__Resources__MemoryAssignment_5 )
            // InternalMultiClusterDsl.g:869:3: rule__Resources__MemoryAssignment_5
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
    // InternalMultiClusterDsl.g:877:1: rule__Resources__Group__6 : rule__Resources__Group__6__Impl ;
    public final void rule__Resources__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:881:1: ( rule__Resources__Group__6__Impl )
            // InternalMultiClusterDsl.g:882:2: rule__Resources__Group__6__Impl
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
    // InternalMultiClusterDsl.g:888:1: rule__Resources__Group__6__Impl : ( '}' ) ;
    public final void rule__Resources__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:892:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:893:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:893:1: ( '}' )
            // InternalMultiClusterDsl.g:894:2: '}'
            {
             before(grammarAccess.getResourcesAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Ingress__Group__0"
    // InternalMultiClusterDsl.g:904:1: rule__Ingress__Group__0 : rule__Ingress__Group__0__Impl rule__Ingress__Group__1 ;
    public final void rule__Ingress__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:908:1: ( rule__Ingress__Group__0__Impl rule__Ingress__Group__1 )
            // InternalMultiClusterDsl.g:909:2: rule__Ingress__Group__0__Impl rule__Ingress__Group__1
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
    // InternalMultiClusterDsl.g:916:1: rule__Ingress__Group__0__Impl : ( 'ingress' ) ;
    public final void rule__Ingress__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:920:1: ( ( 'ingress' ) )
            // InternalMultiClusterDsl.g:921:1: ( 'ingress' )
            {
            // InternalMultiClusterDsl.g:921:1: ( 'ingress' )
            // InternalMultiClusterDsl.g:922:2: 'ingress'
            {
             before(grammarAccess.getIngressAccess().getIngressKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:931:1: rule__Ingress__Group__1 : rule__Ingress__Group__1__Impl rule__Ingress__Group__2 ;
    public final void rule__Ingress__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:935:1: ( rule__Ingress__Group__1__Impl rule__Ingress__Group__2 )
            // InternalMultiClusterDsl.g:936:2: rule__Ingress__Group__1__Impl rule__Ingress__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalMultiClusterDsl.g:943:1: rule__Ingress__Group__1__Impl : ( '{' ) ;
    public final void rule__Ingress__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:947:1: ( ( '{' ) )
            // InternalMultiClusterDsl.g:948:1: ( '{' )
            {
            // InternalMultiClusterDsl.g:948:1: ( '{' )
            // InternalMultiClusterDsl.g:949:2: '{'
            {
             before(grammarAccess.getIngressAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:958:1: rule__Ingress__Group__2 : rule__Ingress__Group__2__Impl rule__Ingress__Group__3 ;
    public final void rule__Ingress__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:962:1: ( rule__Ingress__Group__2__Impl rule__Ingress__Group__3 )
            // InternalMultiClusterDsl.g:963:2: rule__Ingress__Group__2__Impl rule__Ingress__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMultiClusterDsl.g:970:1: rule__Ingress__Group__2__Impl : ( 'path' ) ;
    public final void rule__Ingress__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:974:1: ( ( 'path' ) )
            // InternalMultiClusterDsl.g:975:1: ( 'path' )
            {
            // InternalMultiClusterDsl.g:975:1: ( 'path' )
            // InternalMultiClusterDsl.g:976:2: 'path'
            {
             before(grammarAccess.getIngressAccess().getPathKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMultiClusterDsl.g:985:1: rule__Ingress__Group__3 : rule__Ingress__Group__3__Impl rule__Ingress__Group__4 ;
    public final void rule__Ingress__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:989:1: ( rule__Ingress__Group__3__Impl rule__Ingress__Group__4 )
            // InternalMultiClusterDsl.g:990:2: rule__Ingress__Group__3__Impl rule__Ingress__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalMultiClusterDsl.g:997:1: rule__Ingress__Group__3__Impl : ( ( rule__Ingress__PathAssignment_3 ) ) ;
    public final void rule__Ingress__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1001:1: ( ( ( rule__Ingress__PathAssignment_3 ) ) )
            // InternalMultiClusterDsl.g:1002:1: ( ( rule__Ingress__PathAssignment_3 ) )
            {
            // InternalMultiClusterDsl.g:1002:1: ( ( rule__Ingress__PathAssignment_3 ) )
            // InternalMultiClusterDsl.g:1003:2: ( rule__Ingress__PathAssignment_3 )
            {
             before(grammarAccess.getIngressAccess().getPathAssignment_3()); 
            // InternalMultiClusterDsl.g:1004:2: ( rule__Ingress__PathAssignment_3 )
            // InternalMultiClusterDsl.g:1004:3: rule__Ingress__PathAssignment_3
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
    // InternalMultiClusterDsl.g:1012:1: rule__Ingress__Group__4 : rule__Ingress__Group__4__Impl ;
    public final void rule__Ingress__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1016:1: ( rule__Ingress__Group__4__Impl )
            // InternalMultiClusterDsl.g:1017:2: rule__Ingress__Group__4__Impl
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
    // InternalMultiClusterDsl.g:1023:1: rule__Ingress__Group__4__Impl : ( '}' ) ;
    public final void rule__Ingress__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1027:1: ( ( '}' ) )
            // InternalMultiClusterDsl.g:1028:1: ( '}' )
            {
            // InternalMultiClusterDsl.g:1028:1: ( '}' )
            // InternalMultiClusterDsl.g:1029:2: '}'
            {
             before(grammarAccess.getIngressAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__ApplicationAssignment"
    // InternalMultiClusterDsl.g:1039:1: rule__Model__ApplicationAssignment : ( ruleApplication ) ;
    public final void rule__Model__ApplicationAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1043:1: ( ( ruleApplication ) )
            // InternalMultiClusterDsl.g:1044:2: ( ruleApplication )
            {
            // InternalMultiClusterDsl.g:1044:2: ( ruleApplication )
            // InternalMultiClusterDsl.g:1045:3: ruleApplication
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
    // InternalMultiClusterDsl.g:1054:1: rule__Application__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Application__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1058:1: ( ( RULE_ID ) )
            // InternalMultiClusterDsl.g:1059:2: ( RULE_ID )
            {
            // InternalMultiClusterDsl.g:1059:2: ( RULE_ID )
            // InternalMultiClusterDsl.g:1060:3: RULE_ID
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


    // $ANTLR start "rule__Application__ClustersAssignment_3"
    // InternalMultiClusterDsl.g:1069:1: rule__Application__ClustersAssignment_3 : ( ruleCluster ) ;
    public final void rule__Application__ClustersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1073:1: ( ( ruleCluster ) )
            // InternalMultiClusterDsl.g:1074:2: ( ruleCluster )
            {
            // InternalMultiClusterDsl.g:1074:2: ( ruleCluster )
            // InternalMultiClusterDsl.g:1075:3: ruleCluster
            {
             before(grammarAccess.getApplicationAccess().getClustersClusterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCluster();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getClustersClusterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Application__ClustersAssignment_3"


    // $ANTLR start "rule__Cluster__NameAssignment_1"
    // InternalMultiClusterDsl.g:1084:1: rule__Cluster__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Cluster__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1088:1: ( ( RULE_ID ) )
            // InternalMultiClusterDsl.g:1089:2: ( RULE_ID )
            {
            // InternalMultiClusterDsl.g:1089:2: ( RULE_ID )
            // InternalMultiClusterDsl.g:1090:3: RULE_ID
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
    // InternalMultiClusterDsl.g:1099:1: rule__Cluster__DeploymentAssignment_3 : ( ruleDeployment ) ;
    public final void rule__Cluster__DeploymentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1103:1: ( ( ruleDeployment ) )
            // InternalMultiClusterDsl.g:1104:2: ( ruleDeployment )
            {
            // InternalMultiClusterDsl.g:1104:2: ( ruleDeployment )
            // InternalMultiClusterDsl.g:1105:3: ruleDeployment
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


    // $ANTLR start "rule__Cluster__IngressAssignment_4"
    // InternalMultiClusterDsl.g:1114:1: rule__Cluster__IngressAssignment_4 : ( ruleIngress ) ;
    public final void rule__Cluster__IngressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1118:1: ( ( ruleIngress ) )
            // InternalMultiClusterDsl.g:1119:2: ( ruleIngress )
            {
            // InternalMultiClusterDsl.g:1119:2: ( ruleIngress )
            // InternalMultiClusterDsl.g:1120:3: ruleIngress
            {
             before(grammarAccess.getClusterAccess().getIngressIngressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleIngress();

            state._fsp--;

             after(grammarAccess.getClusterAccess().getIngressIngressParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Cluster__IngressAssignment_4"


    // $ANTLR start "rule__Deployment__ImageAssignment_3"
    // InternalMultiClusterDsl.g:1129:1: rule__Deployment__ImageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Deployment__ImageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1133:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:1134:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:1134:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:1135:3: RULE_STRING
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
    // InternalMultiClusterDsl.g:1144:1: rule__Deployment__ReplicasAssignment_5 : ( RULE_INT ) ;
    public final void rule__Deployment__ReplicasAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1148:1: ( ( RULE_INT ) )
            // InternalMultiClusterDsl.g:1149:2: ( RULE_INT )
            {
            // InternalMultiClusterDsl.g:1149:2: ( RULE_INT )
            // InternalMultiClusterDsl.g:1150:3: RULE_INT
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
    // InternalMultiClusterDsl.g:1159:1: rule__Deployment__ResourcesAssignment_6 : ( ruleResources ) ;
    public final void rule__Deployment__ResourcesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1163:1: ( ( ruleResources ) )
            // InternalMultiClusterDsl.g:1164:2: ( ruleResources )
            {
            // InternalMultiClusterDsl.g:1164:2: ( ruleResources )
            // InternalMultiClusterDsl.g:1165:3: ruleResources
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


    // $ANTLR start "rule__Resources__CpuAssignment_3"
    // InternalMultiClusterDsl.g:1174:1: rule__Resources__CpuAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Resources__CpuAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1178:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:1179:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:1179:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:1180:3: RULE_STRING
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
    // InternalMultiClusterDsl.g:1189:1: rule__Resources__MemoryAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Resources__MemoryAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1193:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:1194:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:1194:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:1195:3: RULE_STRING
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


    // $ANTLR start "rule__Ingress__PathAssignment_3"
    // InternalMultiClusterDsl.g:1204:1: rule__Ingress__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Ingress__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMultiClusterDsl.g:1208:1: ( ( RULE_STRING ) )
            // InternalMultiClusterDsl.g:1209:2: ( RULE_STRING )
            {
            // InternalMultiClusterDsl.g:1209:2: ( RULE_STRING )
            // InternalMultiClusterDsl.g:1210:3: RULE_STRING
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});

}