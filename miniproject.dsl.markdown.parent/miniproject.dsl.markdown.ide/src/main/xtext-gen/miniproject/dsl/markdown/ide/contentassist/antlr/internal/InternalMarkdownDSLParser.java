package miniproject.dsl.markdown.ide.contentassist.antlr.internal;

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
import miniproject.dsl.markdown.services.MarkdownDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMarkdownDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'##'", "'**'", "'*'", "'~~'", "'!['", "']('", "')'", "'|'", "'|---'", "'-'", "':'", "'>'", "'---'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMarkdownDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarkdownDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarkdownDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMarkdownDSL.g"; }


    	private MarkdownDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MarkdownDSLGrammarAccess grammarAccess) {
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
    // InternalMarkdownDSL.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:55:1: ( ruleModel EOF )
            // InternalMarkdownDSL.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalMarkdownDSL.g:63:1: ruleModel : ( ( rule__Model__ElementAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:67:2: ( ( ( rule__Model__ElementAssignment )* ) )
            // InternalMarkdownDSL.g:68:2: ( ( rule__Model__ElementAssignment )* )
            {
            // InternalMarkdownDSL.g:68:2: ( ( rule__Model__ElementAssignment )* )
            // InternalMarkdownDSL.g:69:3: ( rule__Model__ElementAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementAssignment()); 
            }
            // InternalMarkdownDSL.g:70:3: ( rule__Model__ElementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=12)||LA1_0==14||LA1_0==16||LA1_0==19||(LA1_0>=22 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMarkdownDSL.g:70:4: rule__Model__ElementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementAssignment()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDocument"
    // InternalMarkdownDSL.g:79:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:80:1: ( ruleDocument EOF )
            // InternalMarkdownDSL.g:81:1: ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalMarkdownDSL.g:88:1: ruleDocument : ( ( rule__Document__Alternatives ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:92:2: ( ( ( rule__Document__Alternatives ) ) )
            // InternalMarkdownDSL.g:93:2: ( ( rule__Document__Alternatives ) )
            {
            // InternalMarkdownDSL.g:93:2: ( ( rule__Document__Alternatives ) )
            // InternalMarkdownDSL.g:94:3: ( rule__Document__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getAlternatives()); 
            }
            // InternalMarkdownDSL.g:95:3: ( rule__Document__Alternatives )
            // InternalMarkdownDSL.g:95:4: rule__Document__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Document__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleText"
    // InternalMarkdownDSL.g:104:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:105:1: ( ruleText EOF )
            // InternalMarkdownDSL.g:106:1: ruleText EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMarkdownDSL.g:113:1: ruleText : ( ( rule__Text__Alternatives ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:117:2: ( ( ( rule__Text__Alternatives ) ) )
            // InternalMarkdownDSL.g:118:2: ( ( rule__Text__Alternatives ) )
            {
            // InternalMarkdownDSL.g:118:2: ( ( rule__Text__Alternatives ) )
            // InternalMarkdownDSL.g:119:3: ( rule__Text__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getAlternatives()); 
            }
            // InternalMarkdownDSL.g:120:3: ( rule__Text__Alternatives )
            // InternalMarkdownDSL.g:120:4: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Text__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getAlternatives()); 
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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleEntity"
    // InternalMarkdownDSL.g:129:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:130:1: ( ruleEntity EOF )
            // InternalMarkdownDSL.g:131:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMarkdownDSL.g:138:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:142:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalMarkdownDSL.g:143:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalMarkdownDSL.g:143:2: ( ( rule__Entity__Alternatives ) )
            // InternalMarkdownDSL.g:144:3: ( rule__Entity__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getAlternatives()); 
            }
            // InternalMarkdownDSL.g:145:3: ( rule__Entity__Alternatives )
            // InternalMarkdownDSL.g:145:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleHeading"
    // InternalMarkdownDSL.g:154:1: entryRuleHeading : ruleHeading EOF ;
    public final void entryRuleHeading() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:155:1: ( ruleHeading EOF )
            // InternalMarkdownDSL.g:156:1: ruleHeading EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHeading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHeading"


    // $ANTLR start "ruleHeading"
    // InternalMarkdownDSL.g:163:1: ruleHeading : ( ( rule__Heading__Alternatives ) ) ;
    public final void ruleHeading() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:167:2: ( ( ( rule__Heading__Alternatives ) ) )
            // InternalMarkdownDSL.g:168:2: ( ( rule__Heading__Alternatives ) )
            {
            // InternalMarkdownDSL.g:168:2: ( ( rule__Heading__Alternatives ) )
            // InternalMarkdownDSL.g:169:3: ( rule__Heading__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingAccess().getAlternatives()); 
            }
            // InternalMarkdownDSL.g:170:3: ( rule__Heading__Alternatives )
            // InternalMarkdownDSL.g:170:4: rule__Heading__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingAccess().getAlternatives()); 
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
    // $ANTLR end "ruleHeading"


    // $ANTLR start "entryRuleParagraph"
    // InternalMarkdownDSL.g:179:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:180:1: ( ruleParagraph EOF )
            // InternalMarkdownDSL.g:181:1: ruleParagraph EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParagraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalMarkdownDSL.g:188:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:192:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // InternalMarkdownDSL.g:193:2: ( ( rule__Paragraph__Group__0 ) )
            {
            // InternalMarkdownDSL.g:193:2: ( ( rule__Paragraph__Group__0 ) )
            // InternalMarkdownDSL.g:194:3: ( rule__Paragraph__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:195:3: ( rule__Paragraph__Group__0 )
            // InternalMarkdownDSL.g:195:4: rule__Paragraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getGroup()); 
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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRulePlaintext"
    // InternalMarkdownDSL.g:204:1: entryRulePlaintext : rulePlaintext EOF ;
    public final void entryRulePlaintext() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:205:1: ( rulePlaintext EOF )
            // InternalMarkdownDSL.g:206:1: rulePlaintext EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlaintextRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlaintext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlaintextRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePlaintext"


    // $ANTLR start "rulePlaintext"
    // InternalMarkdownDSL.g:213:1: rulePlaintext : ( ( rule__Plaintext__ContentAssignment ) ) ;
    public final void rulePlaintext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:217:2: ( ( ( rule__Plaintext__ContentAssignment ) ) )
            // InternalMarkdownDSL.g:218:2: ( ( rule__Plaintext__ContentAssignment ) )
            {
            // InternalMarkdownDSL.g:218:2: ( ( rule__Plaintext__ContentAssignment ) )
            // InternalMarkdownDSL.g:219:3: ( rule__Plaintext__ContentAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlaintextAccess().getContentAssignment()); 
            }
            // InternalMarkdownDSL.g:220:3: ( rule__Plaintext__ContentAssignment )
            // InternalMarkdownDSL.g:220:4: rule__Plaintext__ContentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Plaintext__ContentAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlaintextAccess().getContentAssignment()); 
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
    // $ANTLR end "rulePlaintext"


    // $ANTLR start "entryRuleBold"
    // InternalMarkdownDSL.g:229:1: entryRuleBold : ruleBold EOF ;
    public final void entryRuleBold() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:230:1: ( ruleBold EOF )
            // InternalMarkdownDSL.g:231:1: ruleBold EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoldRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBold();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoldRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBold"


    // $ANTLR start "ruleBold"
    // InternalMarkdownDSL.g:238:1: ruleBold : ( ( rule__Bold__Group__0 ) ) ;
    public final void ruleBold() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:242:2: ( ( ( rule__Bold__Group__0 ) ) )
            // InternalMarkdownDSL.g:243:2: ( ( rule__Bold__Group__0 ) )
            {
            // InternalMarkdownDSL.g:243:2: ( ( rule__Bold__Group__0 ) )
            // InternalMarkdownDSL.g:244:3: ( rule__Bold__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoldAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:245:3: ( rule__Bold__Group__0 )
            // InternalMarkdownDSL.g:245:4: rule__Bold__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bold__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoldAccess().getGroup()); 
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
    // $ANTLR end "ruleBold"


    // $ANTLR start "entryRuleItalic"
    // InternalMarkdownDSL.g:254:1: entryRuleItalic : ruleItalic EOF ;
    public final void entryRuleItalic() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:255:1: ( ruleItalic EOF )
            // InternalMarkdownDSL.g:256:1: ruleItalic EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleItalic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleItalic"


    // $ANTLR start "ruleItalic"
    // InternalMarkdownDSL.g:263:1: ruleItalic : ( ( rule__Italic__Group__0 ) ) ;
    public final void ruleItalic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:267:2: ( ( ( rule__Italic__Group__0 ) ) )
            // InternalMarkdownDSL.g:268:2: ( ( rule__Italic__Group__0 ) )
            {
            // InternalMarkdownDSL.g:268:2: ( ( rule__Italic__Group__0 ) )
            // InternalMarkdownDSL.g:269:3: ( rule__Italic__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:270:3: ( rule__Italic__Group__0 )
            // InternalMarkdownDSL.g:270:4: rule__Italic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Italic__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicAccess().getGroup()); 
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
    // $ANTLR end "ruleItalic"


    // $ANTLR start "entryRuleStrikethrough"
    // InternalMarkdownDSL.g:279:1: entryRuleStrikethrough : ruleStrikethrough EOF ;
    public final void entryRuleStrikethrough() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:280:1: ( ruleStrikethrough EOF )
            // InternalMarkdownDSL.g:281:1: ruleStrikethrough EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrikethroughRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStrikethrough();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrikethroughRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStrikethrough"


    // $ANTLR start "ruleStrikethrough"
    // InternalMarkdownDSL.g:288:1: ruleStrikethrough : ( ( rule__Strikethrough__Group__0 ) ) ;
    public final void ruleStrikethrough() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:292:2: ( ( ( rule__Strikethrough__Group__0 ) ) )
            // InternalMarkdownDSL.g:293:2: ( ( rule__Strikethrough__Group__0 ) )
            {
            // InternalMarkdownDSL.g:293:2: ( ( rule__Strikethrough__Group__0 ) )
            // InternalMarkdownDSL.g:294:3: ( rule__Strikethrough__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrikethroughAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:295:3: ( rule__Strikethrough__Group__0 )
            // InternalMarkdownDSL.g:295:4: rule__Strikethrough__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Strikethrough__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrikethroughAccess().getGroup()); 
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
    // $ANTLR end "ruleStrikethrough"


    // $ANTLR start "entryRuleLists"
    // InternalMarkdownDSL.g:304:1: entryRuleLists : ruleLists EOF ;
    public final void entryRuleLists() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:305:1: ( ruleLists EOF )
            // InternalMarkdownDSL.g:306:1: ruleLists EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLists();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListsRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLists"


    // $ANTLR start "ruleLists"
    // InternalMarkdownDSL.g:313:1: ruleLists : ( ( rule__Lists__Alternatives ) ) ;
    public final void ruleLists() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:317:2: ( ( ( rule__Lists__Alternatives ) ) )
            // InternalMarkdownDSL.g:318:2: ( ( rule__Lists__Alternatives ) )
            {
            // InternalMarkdownDSL.g:318:2: ( ( rule__Lists__Alternatives ) )
            // InternalMarkdownDSL.g:319:3: ( rule__Lists__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListsAccess().getAlternatives()); 
            }
            // InternalMarkdownDSL.g:320:3: ( rule__Lists__Alternatives )
            // InternalMarkdownDSL.g:320:4: rule__Lists__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Lists__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListsAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLists"


    // $ANTLR start "entryRuleUnordered"
    // InternalMarkdownDSL.g:329:1: entryRuleUnordered : ruleUnordered EOF ;
    public final void entryRuleUnordered() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:330:1: ( ruleUnordered EOF )
            // InternalMarkdownDSL.g:331:1: ruleUnordered EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUnordered();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUnordered"


    // $ANTLR start "ruleUnordered"
    // InternalMarkdownDSL.g:338:1: ruleUnordered : ( ( rule__Unordered__Group__0 ) ) ;
    public final void ruleUnordered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:342:2: ( ( ( rule__Unordered__Group__0 ) ) )
            // InternalMarkdownDSL.g:343:2: ( ( rule__Unordered__Group__0 ) )
            {
            // InternalMarkdownDSL.g:343:2: ( ( rule__Unordered__Group__0 ) )
            // InternalMarkdownDSL.g:344:3: ( rule__Unordered__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:345:3: ( rule__Unordered__Group__0 )
            // InternalMarkdownDSL.g:345:4: rule__Unordered__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Unordered__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getGroup()); 
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
    // $ANTLR end "ruleUnordered"


    // $ANTLR start "entryRuleOrdered"
    // InternalMarkdownDSL.g:354:1: entryRuleOrdered : ruleOrdered EOF ;
    public final void entryRuleOrdered() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:355:1: ( ruleOrdered EOF )
            // InternalMarkdownDSL.g:356:1: ruleOrdered EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrdered();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrdered"


    // $ANTLR start "ruleOrdered"
    // InternalMarkdownDSL.g:363:1: ruleOrdered : ( ( rule__Ordered__Group__0 ) ) ;
    public final void ruleOrdered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:367:2: ( ( ( rule__Ordered__Group__0 ) ) )
            // InternalMarkdownDSL.g:368:2: ( ( rule__Ordered__Group__0 ) )
            {
            // InternalMarkdownDSL.g:368:2: ( ( rule__Ordered__Group__0 ) )
            // InternalMarkdownDSL.g:369:3: ( rule__Ordered__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:370:3: ( rule__Ordered__Group__0 )
            // InternalMarkdownDSL.g:370:4: rule__Ordered__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ordered__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getGroup()); 
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
    // $ANTLR end "ruleOrdered"


    // $ANTLR start "entryRuleBlockquote"
    // InternalMarkdownDSL.g:379:1: entryRuleBlockquote : ruleBlockquote EOF ;
    public final void entryRuleBlockquote() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:380:1: ( ruleBlockquote EOF )
            // InternalMarkdownDSL.g:381:1: ruleBlockquote EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockquoteRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBlockquote();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockquoteRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBlockquote"


    // $ANTLR start "ruleBlockquote"
    // InternalMarkdownDSL.g:388:1: ruleBlockquote : ( ( ( rule__Blockquote__BlockAssignment ) ) ( ( rule__Blockquote__BlockAssignment )* ) ) ;
    public final void ruleBlockquote() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:392:2: ( ( ( ( rule__Blockquote__BlockAssignment ) ) ( ( rule__Blockquote__BlockAssignment )* ) ) )
            // InternalMarkdownDSL.g:393:2: ( ( ( rule__Blockquote__BlockAssignment ) ) ( ( rule__Blockquote__BlockAssignment )* ) )
            {
            // InternalMarkdownDSL.g:393:2: ( ( ( rule__Blockquote__BlockAssignment ) ) ( ( rule__Blockquote__BlockAssignment )* ) )
            // InternalMarkdownDSL.g:394:3: ( ( rule__Blockquote__BlockAssignment ) ) ( ( rule__Blockquote__BlockAssignment )* )
            {
            // InternalMarkdownDSL.g:394:3: ( ( rule__Blockquote__BlockAssignment ) )
            // InternalMarkdownDSL.g:395:4: ( rule__Blockquote__BlockAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockquoteAccess().getBlockAssignment()); 
            }
            // InternalMarkdownDSL.g:396:4: ( rule__Blockquote__BlockAssignment )
            // InternalMarkdownDSL.g:396:5: rule__Blockquote__BlockAssignment
            {
            pushFollow(FOLLOW_4);
            rule__Blockquote__BlockAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockquoteAccess().getBlockAssignment()); 
            }

            }

            // InternalMarkdownDSL.g:399:3: ( ( rule__Blockquote__BlockAssignment )* )
            // InternalMarkdownDSL.g:400:4: ( rule__Blockquote__BlockAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockquoteAccess().getBlockAssignment()); 
            }
            // InternalMarkdownDSL.g:401:4: ( rule__Blockquote__BlockAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalMarkdownDSL()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMarkdownDSL.g:401:5: rule__Blockquote__BlockAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Blockquote__BlockAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockquoteAccess().getBlockAssignment()); 
            }

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
    // $ANTLR end "ruleBlockquote"


    // $ANTLR start "entryRuleImage"
    // InternalMarkdownDSL.g:411:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:412:1: ( ruleImage EOF )
            // InternalMarkdownDSL.g:413:1: ruleImage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalMarkdownDSL.g:420:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:424:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalMarkdownDSL.g:425:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalMarkdownDSL.g:425:2: ( ( rule__Image__Group__0 ) )
            // InternalMarkdownDSL.g:426:3: ( rule__Image__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:427:3: ( rule__Image__Group__0 )
            // InternalMarkdownDSL.g:427:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getGroup()); 
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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleTable"
    // InternalMarkdownDSL.g:436:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:437:1: ( ruleTable EOF )
            // InternalMarkdownDSL.g:438:1: ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMarkdownDSL.g:445:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:449:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMarkdownDSL.g:450:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMarkdownDSL.g:450:2: ( ( rule__Table__Group__0 ) )
            // InternalMarkdownDSL.g:451:3: ( rule__Table__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:452:3: ( rule__Table__Group__0 )
            // InternalMarkdownDSL.g:452:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup()); 
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleThr"
    // InternalMarkdownDSL.g:461:1: entryRuleThr : ruleThr EOF ;
    public final void entryRuleThr() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:462:1: ( ruleThr EOF )
            // InternalMarkdownDSL.g:463:1: ruleThr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleThr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleThr"


    // $ANTLR start "ruleThr"
    // InternalMarkdownDSL.g:470:1: ruleThr : ( ( rule__Thr__Group__0 ) ) ;
    public final void ruleThr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:474:2: ( ( ( rule__Thr__Group__0 ) ) )
            // InternalMarkdownDSL.g:475:2: ( ( rule__Thr__Group__0 ) )
            {
            // InternalMarkdownDSL.g:475:2: ( ( rule__Thr__Group__0 ) )
            // InternalMarkdownDSL.g:476:3: ( rule__Thr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:477:3: ( rule__Thr__Group__0 )
            // InternalMarkdownDSL.g:477:4: rule__Thr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Thr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getGroup()); 
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
    // $ANTLR end "ruleThr"


    // $ANTLR start "entryRuleTbody"
    // InternalMarkdownDSL.g:486:1: entryRuleTbody : ruleTbody EOF ;
    public final void entryRuleTbody() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:487:1: ( ruleTbody EOF )
            // InternalMarkdownDSL.g:488:1: ruleTbody EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTbody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTbody"


    // $ANTLR start "ruleTbody"
    // InternalMarkdownDSL.g:495:1: ruleTbody : ( ( rule__Tbody__Group__0 ) ) ;
    public final void ruleTbody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:499:2: ( ( ( rule__Tbody__Group__0 ) ) )
            // InternalMarkdownDSL.g:500:2: ( ( rule__Tbody__Group__0 ) )
            {
            // InternalMarkdownDSL.g:500:2: ( ( rule__Tbody__Group__0 ) )
            // InternalMarkdownDSL.g:501:3: ( rule__Tbody__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:502:3: ( rule__Tbody__Group__0 )
            // InternalMarkdownDSL.g:502:4: rule__Tbody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tbody__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getGroup()); 
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
    // $ANTLR end "ruleTbody"


    // $ANTLR start "entryRuleHorizonrule"
    // InternalMarkdownDSL.g:511:1: entryRuleHorizonrule : ruleHorizonrule EOF ;
    public final void entryRuleHorizonrule() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:512:1: ( ruleHorizonrule EOF )
            // InternalMarkdownDSL.g:513:1: ruleHorizonrule EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizonruleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleHorizonrule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizonruleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHorizonrule"


    // $ANTLR start "ruleHorizonrule"
    // InternalMarkdownDSL.g:520:1: ruleHorizonrule : ( ( rule__Horizonrule__Group__0 ) ) ;
    public final void ruleHorizonrule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:524:2: ( ( ( rule__Horizonrule__Group__0 ) ) )
            // InternalMarkdownDSL.g:525:2: ( ( rule__Horizonrule__Group__0 ) )
            {
            // InternalMarkdownDSL.g:525:2: ( ( rule__Horizonrule__Group__0 ) )
            // InternalMarkdownDSL.g:526:3: ( rule__Horizonrule__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizonruleAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:527:3: ( rule__Horizonrule__Group__0 )
            // InternalMarkdownDSL.g:527:4: rule__Horizonrule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Horizonrule__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizonruleAccess().getGroup()); 
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
    // $ANTLR end "ruleHorizonrule"


    // $ANTLR start "entryRuleEmoticon"
    // InternalMarkdownDSL.g:536:1: entryRuleEmoticon : ruleEmoticon EOF ;
    public final void entryRuleEmoticon() throws RecognitionException {
        try {
            // InternalMarkdownDSL.g:537:1: ( ruleEmoticon EOF )
            // InternalMarkdownDSL.g:538:1: ruleEmoticon EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmoticonRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEmoticon();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmoticonRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEmoticon"


    // $ANTLR start "ruleEmoticon"
    // InternalMarkdownDSL.g:545:1: ruleEmoticon : ( ( rule__Emoticon__Group__0 ) ) ;
    public final void ruleEmoticon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:549:2: ( ( ( rule__Emoticon__Group__0 ) ) )
            // InternalMarkdownDSL.g:550:2: ( ( rule__Emoticon__Group__0 ) )
            {
            // InternalMarkdownDSL.g:550:2: ( ( rule__Emoticon__Group__0 ) )
            // InternalMarkdownDSL.g:551:3: ( rule__Emoticon__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmoticonAccess().getGroup()); 
            }
            // InternalMarkdownDSL.g:552:3: ( rule__Emoticon__Group__0 )
            // InternalMarkdownDSL.g:552:4: rule__Emoticon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Emoticon__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmoticonAccess().getGroup()); 
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
    // $ANTLR end "ruleEmoticon"


    // $ANTLR start "rule__Document__Alternatives"
    // InternalMarkdownDSL.g:560:1: rule__Document__Alternatives : ( ( ( rule__Document__TextsAssignment_0 ) ) | ( ( rule__Document__EntitiesAssignment_1 ) ) );
    public final void rule__Document__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:564:1: ( ( ( rule__Document__TextsAssignment_0 ) ) | ( ( rule__Document__EntitiesAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING||(LA3_0>=11 && LA3_0<=12)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT||LA3_0==14||LA3_0==16||LA3_0==19||(LA3_0>=22 && LA3_0<=24)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMarkdownDSL.g:565:2: ( ( rule__Document__TextsAssignment_0 ) )
                    {
                    // InternalMarkdownDSL.g:565:2: ( ( rule__Document__TextsAssignment_0 ) )
                    // InternalMarkdownDSL.g:566:3: ( rule__Document__TextsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getTextsAssignment_0()); 
                    }
                    // InternalMarkdownDSL.g:567:3: ( rule__Document__TextsAssignment_0 )
                    // InternalMarkdownDSL.g:567:4: rule__Document__TextsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__TextsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getTextsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkdownDSL.g:571:2: ( ( rule__Document__EntitiesAssignment_1 ) )
                    {
                    // InternalMarkdownDSL.g:571:2: ( ( rule__Document__EntitiesAssignment_1 ) )
                    // InternalMarkdownDSL.g:572:3: ( rule__Document__EntitiesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getEntitiesAssignment_1()); 
                    }
                    // InternalMarkdownDSL.g:573:3: ( rule__Document__EntitiesAssignment_1 )
                    // InternalMarkdownDSL.g:573:4: rule__Document__EntitiesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__EntitiesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getEntitiesAssignment_1()); 
                    }

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
    // $ANTLR end "rule__Document__Alternatives"


    // $ANTLR start "rule__Text__Alternatives"
    // InternalMarkdownDSL.g:581:1: rule__Text__Alternatives : ( ( ( rule__Text__HeadingsAssignment_0 ) ) | ( ( rule__Text__ParagraphsAssignment_1 ) ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:585:1: ( ( ( rule__Text__HeadingsAssignment_0 ) ) | ( ( rule__Text__ParagraphsAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMarkdownDSL.g:586:2: ( ( rule__Text__HeadingsAssignment_0 ) )
                    {
                    // InternalMarkdownDSL.g:586:2: ( ( rule__Text__HeadingsAssignment_0 ) )
                    // InternalMarkdownDSL.g:587:3: ( rule__Text__HeadingsAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getHeadingsAssignment_0()); 
                    }
                    // InternalMarkdownDSL.g:588:3: ( rule__Text__HeadingsAssignment_0 )
                    // InternalMarkdownDSL.g:588:4: rule__Text__HeadingsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__HeadingsAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getHeadingsAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkdownDSL.g:592:2: ( ( rule__Text__ParagraphsAssignment_1 ) )
                    {
                    // InternalMarkdownDSL.g:592:2: ( ( rule__Text__ParagraphsAssignment_1 ) )
                    // InternalMarkdownDSL.g:593:3: ( rule__Text__ParagraphsAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getParagraphsAssignment_1()); 
                    }
                    // InternalMarkdownDSL.g:594:3: ( rule__Text__ParagraphsAssignment_1 )
                    // InternalMarkdownDSL.g:594:4: rule__Text__ParagraphsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__ParagraphsAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getParagraphsAssignment_1()); 
                    }

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
    // $ANTLR end "rule__Text__Alternatives"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalMarkdownDSL.g:602:1: rule__Entity__Alternatives : ( ( ( rule__Entity__BlockquotesAssignment_0 ) ) | ( ( rule__Entity__ImagesAssignment_1 ) ) | ( ( rule__Entity__TablesAssignment_2 ) ) | ( ( rule__Entity__ListsAssignment_3 ) ) | ( ( rule__Entity__HorizonrulesAssignment_4 ) ) | ( ( rule__Entity__EmoticonsAssignment_5 ) ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:606:1: ( ( ( rule__Entity__BlockquotesAssignment_0 ) ) | ( ( rule__Entity__ImagesAssignment_1 ) ) | ( ( rule__Entity__TablesAssignment_2 ) ) | ( ( rule__Entity__ListsAssignment_3 ) ) | ( ( rule__Entity__HorizonrulesAssignment_4 ) ) | ( ( rule__Entity__EmoticonsAssignment_5 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case RULE_INT:
            case 14:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 22:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMarkdownDSL.g:607:2: ( ( rule__Entity__BlockquotesAssignment_0 ) )
                    {
                    // InternalMarkdownDSL.g:607:2: ( ( rule__Entity__BlockquotesAssignment_0 ) )
                    // InternalMarkdownDSL.g:608:3: ( rule__Entity__BlockquotesAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getBlockquotesAssignment_0()); 
                    }
                    // InternalMarkdownDSL.g:609:3: ( rule__Entity__BlockquotesAssignment_0 )
                    // InternalMarkdownDSL.g:609:4: rule__Entity__BlockquotesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__BlockquotesAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getBlockquotesAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkdownDSL.g:613:2: ( ( rule__Entity__ImagesAssignment_1 ) )
                    {
                    // InternalMarkdownDSL.g:613:2: ( ( rule__Entity__ImagesAssignment_1 ) )
                    // InternalMarkdownDSL.g:614:3: ( rule__Entity__ImagesAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getImagesAssignment_1()); 
                    }
                    // InternalMarkdownDSL.g:615:3: ( rule__Entity__ImagesAssignment_1 )
                    // InternalMarkdownDSL.g:615:4: rule__Entity__ImagesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__ImagesAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getImagesAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMarkdownDSL.g:619:2: ( ( rule__Entity__TablesAssignment_2 ) )
                    {
                    // InternalMarkdownDSL.g:619:2: ( ( rule__Entity__TablesAssignment_2 ) )
                    // InternalMarkdownDSL.g:620:3: ( rule__Entity__TablesAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getTablesAssignment_2()); 
                    }
                    // InternalMarkdownDSL.g:621:3: ( rule__Entity__TablesAssignment_2 )
                    // InternalMarkdownDSL.g:621:4: rule__Entity__TablesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__TablesAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getTablesAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMarkdownDSL.g:625:2: ( ( rule__Entity__ListsAssignment_3 ) )
                    {
                    // InternalMarkdownDSL.g:625:2: ( ( rule__Entity__ListsAssignment_3 ) )
                    // InternalMarkdownDSL.g:626:3: ( rule__Entity__ListsAssignment_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getListsAssignment_3()); 
                    }
                    // InternalMarkdownDSL.g:627:3: ( rule__Entity__ListsAssignment_3 )
                    // InternalMarkdownDSL.g:627:4: rule__Entity__ListsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__ListsAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getListsAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMarkdownDSL.g:631:2: ( ( rule__Entity__HorizonrulesAssignment_4 ) )
                    {
                    // InternalMarkdownDSL.g:631:2: ( ( rule__Entity__HorizonrulesAssignment_4 ) )
                    // InternalMarkdownDSL.g:632:3: ( rule__Entity__HorizonrulesAssignment_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getHorizonrulesAssignment_4()); 
                    }
                    // InternalMarkdownDSL.g:633:3: ( rule__Entity__HorizonrulesAssignment_4 )
                    // InternalMarkdownDSL.g:633:4: rule__Entity__HorizonrulesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__HorizonrulesAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getHorizonrulesAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMarkdownDSL.g:637:2: ( ( rule__Entity__EmoticonsAssignment_5 ) )
                    {
                    // InternalMarkdownDSL.g:637:2: ( ( rule__Entity__EmoticonsAssignment_5 ) )
                    // InternalMarkdownDSL.g:638:3: ( rule__Entity__EmoticonsAssignment_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityAccess().getEmoticonsAssignment_5()); 
                    }
                    // InternalMarkdownDSL.g:639:3: ( rule__Entity__EmoticonsAssignment_5 )
                    // InternalMarkdownDSL.g:639:4: rule__Entity__EmoticonsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__EmoticonsAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityAccess().getEmoticonsAssignment_5()); 
                    }

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
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__Heading__Alternatives"
    // InternalMarkdownDSL.g:647:1: rule__Heading__Alternatives : ( ( ( rule__Heading__Group_0__0 ) ) | ( ( rule__Heading__Group_1__0 ) ) );
    public final void rule__Heading__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:651:1: ( ( ( rule__Heading__Group_0__0 ) ) | ( ( rule__Heading__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMarkdownDSL.g:652:2: ( ( rule__Heading__Group_0__0 ) )
                    {
                    // InternalMarkdownDSL.g:652:2: ( ( rule__Heading__Group_0__0 ) )
                    // InternalMarkdownDSL.g:653:3: ( rule__Heading__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeadingAccess().getGroup_0()); 
                    }
                    // InternalMarkdownDSL.g:654:3: ( rule__Heading__Group_0__0 )
                    // InternalMarkdownDSL.g:654:4: rule__Heading__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeadingAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkdownDSL.g:658:2: ( ( rule__Heading__Group_1__0 ) )
                    {
                    // InternalMarkdownDSL.g:658:2: ( ( rule__Heading__Group_1__0 ) )
                    // InternalMarkdownDSL.g:659:3: ( rule__Heading__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHeadingAccess().getGroup_1()); 
                    }
                    // InternalMarkdownDSL.g:660:3: ( rule__Heading__Group_1__0 )
                    // InternalMarkdownDSL.g:660:4: rule__Heading__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Heading__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHeadingAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__Heading__Alternatives"


    // $ANTLR start "rule__Lists__Alternatives"
    // InternalMarkdownDSL.g:668:1: rule__Lists__Alternatives : ( ( ( rule__Lists__OlAssignment_0 ) ) | ( ( rule__Lists__UlAssignment_1 ) ) );
    public final void rule__Lists__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:672:1: ( ( ( rule__Lists__OlAssignment_0 ) ) | ( ( rule__Lists__UlAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMarkdownDSL.g:673:2: ( ( rule__Lists__OlAssignment_0 ) )
                    {
                    // InternalMarkdownDSL.g:673:2: ( ( rule__Lists__OlAssignment_0 ) )
                    // InternalMarkdownDSL.g:674:3: ( rule__Lists__OlAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListsAccess().getOlAssignment_0()); 
                    }
                    // InternalMarkdownDSL.g:675:3: ( rule__Lists__OlAssignment_0 )
                    // InternalMarkdownDSL.g:675:4: rule__Lists__OlAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lists__OlAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListsAccess().getOlAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMarkdownDSL.g:679:2: ( ( rule__Lists__UlAssignment_1 ) )
                    {
                    // InternalMarkdownDSL.g:679:2: ( ( rule__Lists__UlAssignment_1 ) )
                    // InternalMarkdownDSL.g:680:3: ( rule__Lists__UlAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getListsAccess().getUlAssignment_1()); 
                    }
                    // InternalMarkdownDSL.g:681:3: ( rule__Lists__UlAssignment_1 )
                    // InternalMarkdownDSL.g:681:4: rule__Lists__UlAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lists__UlAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getListsAccess().getUlAssignment_1()); 
                    }

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
    // $ANTLR end "rule__Lists__Alternatives"


    // $ANTLR start "rule__Heading__Group_0__0"
    // InternalMarkdownDSL.g:689:1: rule__Heading__Group_0__0 : rule__Heading__Group_0__0__Impl rule__Heading__Group_0__1 ;
    public final void rule__Heading__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:693:1: ( rule__Heading__Group_0__0__Impl rule__Heading__Group_0__1 )
            // InternalMarkdownDSL.g:694:2: rule__Heading__Group_0__0__Impl rule__Heading__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Heading__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Heading__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group_0__0"


    // $ANTLR start "rule__Heading__Group_0__0__Impl"
    // InternalMarkdownDSL.g:701:1: rule__Heading__Group_0__0__Impl : ( '#' ) ;
    public final void rule__Heading__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:705:1: ( ( '#' ) )
            // InternalMarkdownDSL.g:706:1: ( '#' )
            {
            // InternalMarkdownDSL.g:706:1: ( '#' )
            // InternalMarkdownDSL.g:707:2: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingAccess().getNumberSignKeyword_0_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingAccess().getNumberSignKeyword_0_0()); 
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
    // $ANTLR end "rule__Heading__Group_0__0__Impl"


    // $ANTLR start "rule__Heading__Group_0__1"
    // InternalMarkdownDSL.g:716:1: rule__Heading__Group_0__1 : rule__Heading__Group_0__1__Impl ;
    public final void rule__Heading__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:720:1: ( rule__Heading__Group_0__1__Impl )
            // InternalMarkdownDSL.g:721:2: rule__Heading__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group_0__1"


    // $ANTLR start "rule__Heading__Group_0__1__Impl"
    // InternalMarkdownDSL.g:727:1: rule__Heading__Group_0__1__Impl : ( ( rule__Heading__H1sAssignment_0_1 ) ) ;
    public final void rule__Heading__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:731:1: ( ( ( rule__Heading__H1sAssignment_0_1 ) ) )
            // InternalMarkdownDSL.g:732:1: ( ( rule__Heading__H1sAssignment_0_1 ) )
            {
            // InternalMarkdownDSL.g:732:1: ( ( rule__Heading__H1sAssignment_0_1 ) )
            // InternalMarkdownDSL.g:733:2: ( rule__Heading__H1sAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingAccess().getH1sAssignment_0_1()); 
            }
            // InternalMarkdownDSL.g:734:2: ( rule__Heading__H1sAssignment_0_1 )
            // InternalMarkdownDSL.g:734:3: rule__Heading__H1sAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Heading__H1sAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingAccess().getH1sAssignment_0_1()); 
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
    // $ANTLR end "rule__Heading__Group_0__1__Impl"


    // $ANTLR start "rule__Heading__Group_1__0"
    // InternalMarkdownDSL.g:743:1: rule__Heading__Group_1__0 : rule__Heading__Group_1__0__Impl rule__Heading__Group_1__1 ;
    public final void rule__Heading__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:747:1: ( rule__Heading__Group_1__0__Impl rule__Heading__Group_1__1 )
            // InternalMarkdownDSL.g:748:2: rule__Heading__Group_1__0__Impl rule__Heading__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Heading__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Heading__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group_1__0"


    // $ANTLR start "rule__Heading__Group_1__0__Impl"
    // InternalMarkdownDSL.g:755:1: rule__Heading__Group_1__0__Impl : ( '##' ) ;
    public final void rule__Heading__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:759:1: ( ( '##' ) )
            // InternalMarkdownDSL.g:760:1: ( '##' )
            {
            // InternalMarkdownDSL.g:760:1: ( '##' )
            // InternalMarkdownDSL.g:761:2: '##'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingAccess().getNumberSignNumberSignKeyword_1_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingAccess().getNumberSignNumberSignKeyword_1_0()); 
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
    // $ANTLR end "rule__Heading__Group_1__0__Impl"


    // $ANTLR start "rule__Heading__Group_1__1"
    // InternalMarkdownDSL.g:770:1: rule__Heading__Group_1__1 : rule__Heading__Group_1__1__Impl ;
    public final void rule__Heading__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:774:1: ( rule__Heading__Group_1__1__Impl )
            // InternalMarkdownDSL.g:775:2: rule__Heading__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Heading__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Heading__Group_1__1"


    // $ANTLR start "rule__Heading__Group_1__1__Impl"
    // InternalMarkdownDSL.g:781:1: rule__Heading__Group_1__1__Impl : ( ( rule__Heading__H2sAssignment_1_1 ) ) ;
    public final void rule__Heading__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:785:1: ( ( ( rule__Heading__H2sAssignment_1_1 ) ) )
            // InternalMarkdownDSL.g:786:1: ( ( rule__Heading__H2sAssignment_1_1 ) )
            {
            // InternalMarkdownDSL.g:786:1: ( ( rule__Heading__H2sAssignment_1_1 ) )
            // InternalMarkdownDSL.g:787:2: ( rule__Heading__H2sAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingAccess().getH2sAssignment_1_1()); 
            }
            // InternalMarkdownDSL.g:788:2: ( rule__Heading__H2sAssignment_1_1 )
            // InternalMarkdownDSL.g:788:3: rule__Heading__H2sAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Heading__H2sAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingAccess().getH2sAssignment_1_1()); 
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
    // $ANTLR end "rule__Heading__Group_1__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // InternalMarkdownDSL.g:797:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:801:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalMarkdownDSL.g:802:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0"


    // $ANTLR start "rule__Paragraph__Group__0__Impl"
    // InternalMarkdownDSL.g:809:1: rule__Paragraph__Group__0__Impl : ( ( ( rule__Paragraph__ContentAssignment_0 ) ) ( ( rule__Paragraph__ContentAssignment_0 )* ) ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:813:1: ( ( ( ( rule__Paragraph__ContentAssignment_0 ) ) ( ( rule__Paragraph__ContentAssignment_0 )* ) ) )
            // InternalMarkdownDSL.g:814:1: ( ( ( rule__Paragraph__ContentAssignment_0 ) ) ( ( rule__Paragraph__ContentAssignment_0 )* ) )
            {
            // InternalMarkdownDSL.g:814:1: ( ( ( rule__Paragraph__ContentAssignment_0 ) ) ( ( rule__Paragraph__ContentAssignment_0 )* ) )
            // InternalMarkdownDSL.g:815:2: ( ( rule__Paragraph__ContentAssignment_0 ) ) ( ( rule__Paragraph__ContentAssignment_0 )* )
            {
            // InternalMarkdownDSL.g:815:2: ( ( rule__Paragraph__ContentAssignment_0 ) )
            // InternalMarkdownDSL.g:816:3: ( rule__Paragraph__ContentAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getContentAssignment_0()); 
            }
            // InternalMarkdownDSL.g:817:3: ( rule__Paragraph__ContentAssignment_0 )
            // InternalMarkdownDSL.g:817:4: rule__Paragraph__ContentAssignment_0
            {
            pushFollow(FOLLOW_7);
            rule__Paragraph__ContentAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getContentAssignment_0()); 
            }

            }

            // InternalMarkdownDSL.g:820:2: ( ( rule__Paragraph__ContentAssignment_0 )* )
            // InternalMarkdownDSL.g:821:3: ( rule__Paragraph__ContentAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getContentAssignment_0()); 
            }
            // InternalMarkdownDSL.g:822:3: ( rule__Paragraph__ContentAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred12_InternalMarkdownDSL()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalMarkdownDSL.g:822:4: rule__Paragraph__ContentAssignment_0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Paragraph__ContentAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getContentAssignment_0()); 
            }

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
    // $ANTLR end "rule__Paragraph__Group__0__Impl"


    // $ANTLR start "rule__Paragraph__Group__1"
    // InternalMarkdownDSL.g:831:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:835:1: ( rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2 )
            // InternalMarkdownDSL.g:836:2: rule__Paragraph__Group__1__Impl rule__Paragraph__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Paragraph__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__1"


    // $ANTLR start "rule__Paragraph__Group__1__Impl"
    // InternalMarkdownDSL.g:843:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__BoldtextAssignment_1 )* ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:847:1: ( ( ( rule__Paragraph__BoldtextAssignment_1 )* ) )
            // InternalMarkdownDSL.g:848:1: ( ( rule__Paragraph__BoldtextAssignment_1 )* )
            {
            // InternalMarkdownDSL.g:848:1: ( ( rule__Paragraph__BoldtextAssignment_1 )* )
            // InternalMarkdownDSL.g:849:2: ( rule__Paragraph__BoldtextAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getBoldtextAssignment_1()); 
            }
            // InternalMarkdownDSL.g:850:2: ( rule__Paragraph__BoldtextAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==13) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMarkdownDSL.g:850:3: rule__Paragraph__BoldtextAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Paragraph__BoldtextAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getBoldtextAssignment_1()); 
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
    // $ANTLR end "rule__Paragraph__Group__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__2"
    // InternalMarkdownDSL.g:858:1: rule__Paragraph__Group__2 : rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3 ;
    public final void rule__Paragraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:862:1: ( rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3 )
            // InternalMarkdownDSL.g:863:2: rule__Paragraph__Group__2__Impl rule__Paragraph__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Paragraph__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__2"


    // $ANTLR start "rule__Paragraph__Group__2__Impl"
    // InternalMarkdownDSL.g:870:1: rule__Paragraph__Group__2__Impl : ( ( rule__Paragraph__ItalictextAssignment_2 )* ) ;
    public final void rule__Paragraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:874:1: ( ( ( rule__Paragraph__ItalictextAssignment_2 )* ) )
            // InternalMarkdownDSL.g:875:1: ( ( rule__Paragraph__ItalictextAssignment_2 )* )
            {
            // InternalMarkdownDSL.g:875:1: ( ( rule__Paragraph__ItalictextAssignment_2 )* )
            // InternalMarkdownDSL.g:876:2: ( rule__Paragraph__ItalictextAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getItalictextAssignment_2()); 
            }
            // InternalMarkdownDSL.g:877:2: ( rule__Paragraph__ItalictextAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_STRING) ) {
                        int LA10_3 = input.LA(3);

                        if ( (LA10_3==14) ) {
                            int LA10_4 = input.LA(4);

                            if ( (LA10_4==RULE_STRING) ) {
                                int LA10_5 = input.LA(5);

                                if ( (synpred14_InternalMarkdownDSL()) ) {
                                    alt10=1;
                                }


                            }
                            else if ( (LA10_4==EOF||LA10_4==RULE_INT||(LA10_4>=11 && LA10_4<=12)||(LA10_4>=14 && LA10_4<=16)||LA10_4==19||(LA10_4>=22 && LA10_4<=24)) ) {
                                alt10=1;
                            }


                        }


                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalMarkdownDSL.g:877:3: rule__Paragraph__ItalictextAssignment_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Paragraph__ItalictextAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getItalictextAssignment_2()); 
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
    // $ANTLR end "rule__Paragraph__Group__2__Impl"


    // $ANTLR start "rule__Paragraph__Group__3"
    // InternalMarkdownDSL.g:885:1: rule__Paragraph__Group__3 : rule__Paragraph__Group__3__Impl ;
    public final void rule__Paragraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:889:1: ( rule__Paragraph__Group__3__Impl )
            // InternalMarkdownDSL.g:890:2: rule__Paragraph__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__3"


    // $ANTLR start "rule__Paragraph__Group__3__Impl"
    // InternalMarkdownDSL.g:896:1: rule__Paragraph__Group__3__Impl : ( ( rule__Paragraph__TextstrikeAssignment_3 )* ) ;
    public final void rule__Paragraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:900:1: ( ( ( rule__Paragraph__TextstrikeAssignment_3 )* ) )
            // InternalMarkdownDSL.g:901:1: ( ( rule__Paragraph__TextstrikeAssignment_3 )* )
            {
            // InternalMarkdownDSL.g:901:1: ( ( rule__Paragraph__TextstrikeAssignment_3 )* )
            // InternalMarkdownDSL.g:902:2: ( rule__Paragraph__TextstrikeAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getTextstrikeAssignment_3()); 
            }
            // InternalMarkdownDSL.g:903:2: ( rule__Paragraph__TextstrikeAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMarkdownDSL.g:903:3: rule__Paragraph__TextstrikeAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Paragraph__TextstrikeAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getTextstrikeAssignment_3()); 
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
    // $ANTLR end "rule__Paragraph__Group__3__Impl"


    // $ANTLR start "rule__Bold__Group__0"
    // InternalMarkdownDSL.g:912:1: rule__Bold__Group__0 : rule__Bold__Group__0__Impl rule__Bold__Group__1 ;
    public final void rule__Bold__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:916:1: ( rule__Bold__Group__0__Impl rule__Bold__Group__1 )
            // InternalMarkdownDSL.g:917:2: rule__Bold__Group__0__Impl rule__Bold__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Bold__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bold__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group__0"


    // $ANTLR start "rule__Bold__Group__0__Impl"
    // InternalMarkdownDSL.g:924:1: rule__Bold__Group__0__Impl : ( '**' ) ;
    public final void rule__Bold__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:928:1: ( ( '**' ) )
            // InternalMarkdownDSL.g:929:1: ( '**' )
            {
            // InternalMarkdownDSL.g:929:1: ( '**' )
            // InternalMarkdownDSL.g:930:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_0()); 
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
    // $ANTLR end "rule__Bold__Group__0__Impl"


    // $ANTLR start "rule__Bold__Group__1"
    // InternalMarkdownDSL.g:939:1: rule__Bold__Group__1 : rule__Bold__Group__1__Impl rule__Bold__Group__2 ;
    public final void rule__Bold__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:943:1: ( rule__Bold__Group__1__Impl rule__Bold__Group__2 )
            // InternalMarkdownDSL.g:944:2: rule__Bold__Group__1__Impl rule__Bold__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Bold__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bold__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group__1"


    // $ANTLR start "rule__Bold__Group__1__Impl"
    // InternalMarkdownDSL.g:951:1: rule__Bold__Group__1__Impl : ( ( rule__Bold__ContentAssignment_1 ) ) ;
    public final void rule__Bold__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:955:1: ( ( ( rule__Bold__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:956:1: ( ( rule__Bold__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:956:1: ( ( rule__Bold__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:957:2: ( rule__Bold__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoldAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:958:2: ( rule__Bold__ContentAssignment_1 )
            // InternalMarkdownDSL.g:958:3: rule__Bold__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bold__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoldAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Bold__Group__1__Impl"


    // $ANTLR start "rule__Bold__Group__2"
    // InternalMarkdownDSL.g:966:1: rule__Bold__Group__2 : rule__Bold__Group__2__Impl ;
    public final void rule__Bold__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:970:1: ( rule__Bold__Group__2__Impl )
            // InternalMarkdownDSL.g:971:2: rule__Bold__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bold__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bold__Group__2"


    // $ANTLR start "rule__Bold__Group__2__Impl"
    // InternalMarkdownDSL.g:977:1: rule__Bold__Group__2__Impl : ( '**' ) ;
    public final void rule__Bold__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:981:1: ( ( '**' ) )
            // InternalMarkdownDSL.g:982:1: ( '**' )
            {
            // InternalMarkdownDSL.g:982:1: ( '**' )
            // InternalMarkdownDSL.g:983:2: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_2()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoldAccess().getAsteriskAsteriskKeyword_2()); 
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
    // $ANTLR end "rule__Bold__Group__2__Impl"


    // $ANTLR start "rule__Italic__Group__0"
    // InternalMarkdownDSL.g:993:1: rule__Italic__Group__0 : rule__Italic__Group__0__Impl rule__Italic__Group__1 ;
    public final void rule__Italic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:997:1: ( rule__Italic__Group__0__Impl rule__Italic__Group__1 )
            // InternalMarkdownDSL.g:998:2: rule__Italic__Group__0__Impl rule__Italic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Italic__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Italic__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group__0"


    // $ANTLR start "rule__Italic__Group__0__Impl"
    // InternalMarkdownDSL.g:1005:1: rule__Italic__Group__0__Impl : ( '*' ) ;
    public final void rule__Italic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1009:1: ( ( '*' ) )
            // InternalMarkdownDSL.g:1010:1: ( '*' )
            {
            // InternalMarkdownDSL.g:1010:1: ( '*' )
            // InternalMarkdownDSL.g:1011:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicAccess().getAsteriskKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicAccess().getAsteriskKeyword_0()); 
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
    // $ANTLR end "rule__Italic__Group__0__Impl"


    // $ANTLR start "rule__Italic__Group__1"
    // InternalMarkdownDSL.g:1020:1: rule__Italic__Group__1 : rule__Italic__Group__1__Impl rule__Italic__Group__2 ;
    public final void rule__Italic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1024:1: ( rule__Italic__Group__1__Impl rule__Italic__Group__2 )
            // InternalMarkdownDSL.g:1025:2: rule__Italic__Group__1__Impl rule__Italic__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Italic__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Italic__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group__1"


    // $ANTLR start "rule__Italic__Group__1__Impl"
    // InternalMarkdownDSL.g:1032:1: rule__Italic__Group__1__Impl : ( ( rule__Italic__ContentAssignment_1 ) ) ;
    public final void rule__Italic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1036:1: ( ( ( rule__Italic__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:1037:1: ( ( rule__Italic__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:1037:1: ( ( rule__Italic__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:1038:2: ( rule__Italic__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:1039:2: ( rule__Italic__ContentAssignment_1 )
            // InternalMarkdownDSL.g:1039:3: rule__Italic__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Italic__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Italic__Group__1__Impl"


    // $ANTLR start "rule__Italic__Group__2"
    // InternalMarkdownDSL.g:1047:1: rule__Italic__Group__2 : rule__Italic__Group__2__Impl ;
    public final void rule__Italic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1051:1: ( rule__Italic__Group__2__Impl )
            // InternalMarkdownDSL.g:1052:2: rule__Italic__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Italic__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Italic__Group__2"


    // $ANTLR start "rule__Italic__Group__2__Impl"
    // InternalMarkdownDSL.g:1058:1: rule__Italic__Group__2__Impl : ( '*' ) ;
    public final void rule__Italic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1062:1: ( ( '*' ) )
            // InternalMarkdownDSL.g:1063:1: ( '*' )
            {
            // InternalMarkdownDSL.g:1063:1: ( '*' )
            // InternalMarkdownDSL.g:1064:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicAccess().getAsteriskKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicAccess().getAsteriskKeyword_2()); 
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
    // $ANTLR end "rule__Italic__Group__2__Impl"


    // $ANTLR start "rule__Strikethrough__Group__0"
    // InternalMarkdownDSL.g:1074:1: rule__Strikethrough__Group__0 : rule__Strikethrough__Group__0__Impl rule__Strikethrough__Group__1 ;
    public final void rule__Strikethrough__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1078:1: ( rule__Strikethrough__Group__0__Impl rule__Strikethrough__Group__1 )
            // InternalMarkdownDSL.g:1079:2: rule__Strikethrough__Group__0__Impl rule__Strikethrough__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Strikethrough__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Strikethrough__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strikethrough__Group__0"


    // $ANTLR start "rule__Strikethrough__Group__0__Impl"
    // InternalMarkdownDSL.g:1086:1: rule__Strikethrough__Group__0__Impl : ( '~~' ) ;
    public final void rule__Strikethrough__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1090:1: ( ( '~~' ) )
            // InternalMarkdownDSL.g:1091:1: ( '~~' )
            {
            // InternalMarkdownDSL.g:1091:1: ( '~~' )
            // InternalMarkdownDSL.g:1092:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrikethroughAccess().getTildeTildeKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrikethroughAccess().getTildeTildeKeyword_0()); 
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
    // $ANTLR end "rule__Strikethrough__Group__0__Impl"


    // $ANTLR start "rule__Strikethrough__Group__1"
    // InternalMarkdownDSL.g:1101:1: rule__Strikethrough__Group__1 : rule__Strikethrough__Group__1__Impl rule__Strikethrough__Group__2 ;
    public final void rule__Strikethrough__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1105:1: ( rule__Strikethrough__Group__1__Impl rule__Strikethrough__Group__2 )
            // InternalMarkdownDSL.g:1106:2: rule__Strikethrough__Group__1__Impl rule__Strikethrough__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Strikethrough__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Strikethrough__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strikethrough__Group__1"


    // $ANTLR start "rule__Strikethrough__Group__1__Impl"
    // InternalMarkdownDSL.g:1113:1: rule__Strikethrough__Group__1__Impl : ( ( rule__Strikethrough__ContentAssignment_1 ) ) ;
    public final void rule__Strikethrough__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1117:1: ( ( ( rule__Strikethrough__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:1118:1: ( ( rule__Strikethrough__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:1118:1: ( ( rule__Strikethrough__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:1119:2: ( rule__Strikethrough__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrikethroughAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:1120:2: ( rule__Strikethrough__ContentAssignment_1 )
            // InternalMarkdownDSL.g:1120:3: rule__Strikethrough__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Strikethrough__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrikethroughAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Strikethrough__Group__1__Impl"


    // $ANTLR start "rule__Strikethrough__Group__2"
    // InternalMarkdownDSL.g:1128:1: rule__Strikethrough__Group__2 : rule__Strikethrough__Group__2__Impl ;
    public final void rule__Strikethrough__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1132:1: ( rule__Strikethrough__Group__2__Impl )
            // InternalMarkdownDSL.g:1133:2: rule__Strikethrough__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Strikethrough__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strikethrough__Group__2"


    // $ANTLR start "rule__Strikethrough__Group__2__Impl"
    // InternalMarkdownDSL.g:1139:1: rule__Strikethrough__Group__2__Impl : ( '~~' ) ;
    public final void rule__Strikethrough__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1143:1: ( ( '~~' ) )
            // InternalMarkdownDSL.g:1144:1: ( '~~' )
            {
            // InternalMarkdownDSL.g:1144:1: ( '~~' )
            // InternalMarkdownDSL.g:1145:2: '~~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrikethroughAccess().getTildeTildeKeyword_2()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrikethroughAccess().getTildeTildeKeyword_2()); 
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
    // $ANTLR end "rule__Strikethrough__Group__2__Impl"


    // $ANTLR start "rule__Unordered__Group__0"
    // InternalMarkdownDSL.g:1155:1: rule__Unordered__Group__0 : rule__Unordered__Group__0__Impl rule__Unordered__Group__1 ;
    public final void rule__Unordered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1159:1: ( rule__Unordered__Group__0__Impl rule__Unordered__Group__1 )
            // InternalMarkdownDSL.g:1160:2: rule__Unordered__Group__0__Impl rule__Unordered__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Unordered__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Unordered__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unordered__Group__0"


    // $ANTLR start "rule__Unordered__Group__0__Impl"
    // InternalMarkdownDSL.g:1167:1: rule__Unordered__Group__0__Impl : ( ( rule__Unordered__TypeAssignment_0 ) ) ;
    public final void rule__Unordered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1171:1: ( ( ( rule__Unordered__TypeAssignment_0 ) ) )
            // InternalMarkdownDSL.g:1172:1: ( ( rule__Unordered__TypeAssignment_0 ) )
            {
            // InternalMarkdownDSL.g:1172:1: ( ( rule__Unordered__TypeAssignment_0 ) )
            // InternalMarkdownDSL.g:1173:2: ( rule__Unordered__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getTypeAssignment_0()); 
            }
            // InternalMarkdownDSL.g:1174:2: ( rule__Unordered__TypeAssignment_0 )
            // InternalMarkdownDSL.g:1174:3: rule__Unordered__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Unordered__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__Unordered__Group__0__Impl"


    // $ANTLR start "rule__Unordered__Group__1"
    // InternalMarkdownDSL.g:1182:1: rule__Unordered__Group__1 : rule__Unordered__Group__1__Impl rule__Unordered__Group__2 ;
    public final void rule__Unordered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1186:1: ( rule__Unordered__Group__1__Impl rule__Unordered__Group__2 )
            // InternalMarkdownDSL.g:1187:2: rule__Unordered__Group__1__Impl rule__Unordered__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Unordered__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Unordered__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unordered__Group__1"


    // $ANTLR start "rule__Unordered__Group__1__Impl"
    // InternalMarkdownDSL.g:1194:1: rule__Unordered__Group__1__Impl : ( ( rule__Unordered__ContentAssignment_1 ) ) ;
    public final void rule__Unordered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1198:1: ( ( ( rule__Unordered__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:1199:1: ( ( rule__Unordered__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:1199:1: ( ( rule__Unordered__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:1200:2: ( rule__Unordered__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:1201:2: ( rule__Unordered__ContentAssignment_1 )
            // InternalMarkdownDSL.g:1201:3: rule__Unordered__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Unordered__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Unordered__Group__1__Impl"


    // $ANTLR start "rule__Unordered__Group__2"
    // InternalMarkdownDSL.g:1209:1: rule__Unordered__Group__2 : rule__Unordered__Group__2__Impl rule__Unordered__Group__3 ;
    public final void rule__Unordered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1213:1: ( rule__Unordered__Group__2__Impl rule__Unordered__Group__3 )
            // InternalMarkdownDSL.g:1214:2: rule__Unordered__Group__2__Impl rule__Unordered__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Unordered__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Unordered__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unordered__Group__2"


    // $ANTLR start "rule__Unordered__Group__2__Impl"
    // InternalMarkdownDSL.g:1221:1: rule__Unordered__Group__2__Impl : ( ( rule__Unordered__BoldtextAssignment_2 )? ) ;
    public final void rule__Unordered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1225:1: ( ( ( rule__Unordered__BoldtextAssignment_2 )? ) )
            // InternalMarkdownDSL.g:1226:1: ( ( rule__Unordered__BoldtextAssignment_2 )? )
            {
            // InternalMarkdownDSL.g:1226:1: ( ( rule__Unordered__BoldtextAssignment_2 )? )
            // InternalMarkdownDSL.g:1227:2: ( rule__Unordered__BoldtextAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getBoldtextAssignment_2()); 
            }
            // InternalMarkdownDSL.g:1228:2: ( rule__Unordered__BoldtextAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred16_InternalMarkdownDSL()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalMarkdownDSL.g:1228:3: rule__Unordered__BoldtextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unordered__BoldtextAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getBoldtextAssignment_2()); 
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
    // $ANTLR end "rule__Unordered__Group__2__Impl"


    // $ANTLR start "rule__Unordered__Group__3"
    // InternalMarkdownDSL.g:1236:1: rule__Unordered__Group__3 : rule__Unordered__Group__3__Impl rule__Unordered__Group__4 ;
    public final void rule__Unordered__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1240:1: ( rule__Unordered__Group__3__Impl rule__Unordered__Group__4 )
            // InternalMarkdownDSL.g:1241:2: rule__Unordered__Group__3__Impl rule__Unordered__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Unordered__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Unordered__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unordered__Group__3"


    // $ANTLR start "rule__Unordered__Group__3__Impl"
    // InternalMarkdownDSL.g:1248:1: rule__Unordered__Group__3__Impl : ( ( rule__Unordered__ItalictextAssignment_3 )? ) ;
    public final void rule__Unordered__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1252:1: ( ( ( rule__Unordered__ItalictextAssignment_3 )? ) )
            // InternalMarkdownDSL.g:1253:1: ( ( rule__Unordered__ItalictextAssignment_3 )? )
            {
            // InternalMarkdownDSL.g:1253:1: ( ( rule__Unordered__ItalictextAssignment_3 )? )
            // InternalMarkdownDSL.g:1254:2: ( rule__Unordered__ItalictextAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getItalictextAssignment_3()); 
            }
            // InternalMarkdownDSL.g:1255:2: ( rule__Unordered__ItalictextAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred17_InternalMarkdownDSL()) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalMarkdownDSL.g:1255:3: rule__Unordered__ItalictextAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unordered__ItalictextAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getItalictextAssignment_3()); 
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
    // $ANTLR end "rule__Unordered__Group__3__Impl"


    // $ANTLR start "rule__Unordered__Group__4"
    // InternalMarkdownDSL.g:1263:1: rule__Unordered__Group__4 : rule__Unordered__Group__4__Impl ;
    public final void rule__Unordered__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1267:1: ( rule__Unordered__Group__4__Impl )
            // InternalMarkdownDSL.g:1268:2: rule__Unordered__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Unordered__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unordered__Group__4"


    // $ANTLR start "rule__Unordered__Group__4__Impl"
    // InternalMarkdownDSL.g:1274:1: rule__Unordered__Group__4__Impl : ( ( rule__Unordered__TextstrikeAssignment_4 )? ) ;
    public final void rule__Unordered__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1278:1: ( ( ( rule__Unordered__TextstrikeAssignment_4 )? ) )
            // InternalMarkdownDSL.g:1279:1: ( ( rule__Unordered__TextstrikeAssignment_4 )? )
            {
            // InternalMarkdownDSL.g:1279:1: ( ( rule__Unordered__TextstrikeAssignment_4 )? )
            // InternalMarkdownDSL.g:1280:2: ( rule__Unordered__TextstrikeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getTextstrikeAssignment_4()); 
            }
            // InternalMarkdownDSL.g:1281:2: ( rule__Unordered__TextstrikeAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMarkdownDSL.g:1281:3: rule__Unordered__TextstrikeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Unordered__TextstrikeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getTextstrikeAssignment_4()); 
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
    // $ANTLR end "rule__Unordered__Group__4__Impl"


    // $ANTLR start "rule__Ordered__Group__0"
    // InternalMarkdownDSL.g:1290:1: rule__Ordered__Group__0 : rule__Ordered__Group__0__Impl rule__Ordered__Group__1 ;
    public final void rule__Ordered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1294:1: ( rule__Ordered__Group__0__Impl rule__Ordered__Group__1 )
            // InternalMarkdownDSL.g:1295:2: rule__Ordered__Group__0__Impl rule__Ordered__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Ordered__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ordered__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordered__Group__0"


    // $ANTLR start "rule__Ordered__Group__0__Impl"
    // InternalMarkdownDSL.g:1302:1: rule__Ordered__Group__0__Impl : ( ( rule__Ordered__TypeAssignment_0 ) ) ;
    public final void rule__Ordered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1306:1: ( ( ( rule__Ordered__TypeAssignment_0 ) ) )
            // InternalMarkdownDSL.g:1307:1: ( ( rule__Ordered__TypeAssignment_0 ) )
            {
            // InternalMarkdownDSL.g:1307:1: ( ( rule__Ordered__TypeAssignment_0 ) )
            // InternalMarkdownDSL.g:1308:2: ( rule__Ordered__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getTypeAssignment_0()); 
            }
            // InternalMarkdownDSL.g:1309:2: ( rule__Ordered__TypeAssignment_0 )
            // InternalMarkdownDSL.g:1309:3: rule__Ordered__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ordered__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__Ordered__Group__0__Impl"


    // $ANTLR start "rule__Ordered__Group__1"
    // InternalMarkdownDSL.g:1317:1: rule__Ordered__Group__1 : rule__Ordered__Group__1__Impl rule__Ordered__Group__2 ;
    public final void rule__Ordered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1321:1: ( rule__Ordered__Group__1__Impl rule__Ordered__Group__2 )
            // InternalMarkdownDSL.g:1322:2: rule__Ordered__Group__1__Impl rule__Ordered__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Ordered__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ordered__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordered__Group__1"


    // $ANTLR start "rule__Ordered__Group__1__Impl"
    // InternalMarkdownDSL.g:1329:1: rule__Ordered__Group__1__Impl : ( ( rule__Ordered__ContentAssignment_1 ) ) ;
    public final void rule__Ordered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1333:1: ( ( ( rule__Ordered__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:1334:1: ( ( rule__Ordered__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:1334:1: ( ( rule__Ordered__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:1335:2: ( rule__Ordered__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:1336:2: ( rule__Ordered__ContentAssignment_1 )
            // InternalMarkdownDSL.g:1336:3: rule__Ordered__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ordered__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Ordered__Group__1__Impl"


    // $ANTLR start "rule__Ordered__Group__2"
    // InternalMarkdownDSL.g:1344:1: rule__Ordered__Group__2 : rule__Ordered__Group__2__Impl rule__Ordered__Group__3 ;
    public final void rule__Ordered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1348:1: ( rule__Ordered__Group__2__Impl rule__Ordered__Group__3 )
            // InternalMarkdownDSL.g:1349:2: rule__Ordered__Group__2__Impl rule__Ordered__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Ordered__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ordered__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordered__Group__2"


    // $ANTLR start "rule__Ordered__Group__2__Impl"
    // InternalMarkdownDSL.g:1356:1: rule__Ordered__Group__2__Impl : ( ( rule__Ordered__BoldtextAssignment_2 )? ) ;
    public final void rule__Ordered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1360:1: ( ( ( rule__Ordered__BoldtextAssignment_2 )? ) )
            // InternalMarkdownDSL.g:1361:1: ( ( rule__Ordered__BoldtextAssignment_2 )? )
            {
            // InternalMarkdownDSL.g:1361:1: ( ( rule__Ordered__BoldtextAssignment_2 )? )
            // InternalMarkdownDSL.g:1362:2: ( rule__Ordered__BoldtextAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getBoldtextAssignment_2()); 
            }
            // InternalMarkdownDSL.g:1363:2: ( rule__Ordered__BoldtextAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred19_InternalMarkdownDSL()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalMarkdownDSL.g:1363:3: rule__Ordered__BoldtextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ordered__BoldtextAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getBoldtextAssignment_2()); 
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
    // $ANTLR end "rule__Ordered__Group__2__Impl"


    // $ANTLR start "rule__Ordered__Group__3"
    // InternalMarkdownDSL.g:1371:1: rule__Ordered__Group__3 : rule__Ordered__Group__3__Impl rule__Ordered__Group__4 ;
    public final void rule__Ordered__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1375:1: ( rule__Ordered__Group__3__Impl rule__Ordered__Group__4 )
            // InternalMarkdownDSL.g:1376:2: rule__Ordered__Group__3__Impl rule__Ordered__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Ordered__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Ordered__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordered__Group__3"


    // $ANTLR start "rule__Ordered__Group__3__Impl"
    // InternalMarkdownDSL.g:1383:1: rule__Ordered__Group__3__Impl : ( ( rule__Ordered__ItalictextAssignment_3 )? ) ;
    public final void rule__Ordered__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1387:1: ( ( ( rule__Ordered__ItalictextAssignment_3 )? ) )
            // InternalMarkdownDSL.g:1388:1: ( ( rule__Ordered__ItalictextAssignment_3 )? )
            {
            // InternalMarkdownDSL.g:1388:1: ( ( rule__Ordered__ItalictextAssignment_3 )? )
            // InternalMarkdownDSL.g:1389:2: ( rule__Ordered__ItalictextAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getItalictextAssignment_3()); 
            }
            // InternalMarkdownDSL.g:1390:2: ( rule__Ordered__ItalictextAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (synpred20_InternalMarkdownDSL()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalMarkdownDSL.g:1390:3: rule__Ordered__ItalictextAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ordered__ItalictextAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getItalictextAssignment_3()); 
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
    // $ANTLR end "rule__Ordered__Group__3__Impl"


    // $ANTLR start "rule__Ordered__Group__4"
    // InternalMarkdownDSL.g:1398:1: rule__Ordered__Group__4 : rule__Ordered__Group__4__Impl ;
    public final void rule__Ordered__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1402:1: ( rule__Ordered__Group__4__Impl )
            // InternalMarkdownDSL.g:1403:2: rule__Ordered__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ordered__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ordered__Group__4"


    // $ANTLR start "rule__Ordered__Group__4__Impl"
    // InternalMarkdownDSL.g:1409:1: rule__Ordered__Group__4__Impl : ( ( rule__Ordered__TextstrikeAssignment_4 )? ) ;
    public final void rule__Ordered__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1413:1: ( ( ( rule__Ordered__TextstrikeAssignment_4 )? ) )
            // InternalMarkdownDSL.g:1414:1: ( ( rule__Ordered__TextstrikeAssignment_4 )? )
            {
            // InternalMarkdownDSL.g:1414:1: ( ( rule__Ordered__TextstrikeAssignment_4 )? )
            // InternalMarkdownDSL.g:1415:2: ( rule__Ordered__TextstrikeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getTextstrikeAssignment_4()); 
            }
            // InternalMarkdownDSL.g:1416:2: ( rule__Ordered__TextstrikeAssignment_4 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMarkdownDSL.g:1416:3: rule__Ordered__TextstrikeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ordered__TextstrikeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getTextstrikeAssignment_4()); 
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
    // $ANTLR end "rule__Ordered__Group__4__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalMarkdownDSL.g:1425:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1429:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalMarkdownDSL.g:1430:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Image__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalMarkdownDSL.g:1437:1: rule__Image__Group__0__Impl : ( '![' ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1441:1: ( ( '![' ) )
            // InternalMarkdownDSL.g:1442:1: ( '![' )
            {
            // InternalMarkdownDSL.g:1442:1: ( '![' )
            // InternalMarkdownDSL.g:1443:2: '!['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getExclamationMarkLeftSquareBracketKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getExclamationMarkLeftSquareBracketKeyword_0()); 
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
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalMarkdownDSL.g:1452:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1456:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalMarkdownDSL.g:1457:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Image__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Image__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalMarkdownDSL.g:1464:1: rule__Image__Group__1__Impl : ( ( rule__Image__NameAssignment_1 ) ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1468:1: ( ( ( rule__Image__NameAssignment_1 ) ) )
            // InternalMarkdownDSL.g:1469:1: ( ( rule__Image__NameAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:1469:1: ( ( rule__Image__NameAssignment_1 ) )
            // InternalMarkdownDSL.g:1470:2: ( rule__Image__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getNameAssignment_1()); 
            }
            // InternalMarkdownDSL.g:1471:2: ( rule__Image__NameAssignment_1 )
            // InternalMarkdownDSL.g:1471:3: rule__Image__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // InternalMarkdownDSL.g:1479:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1483:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalMarkdownDSL.g:1484:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Image__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Image__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // InternalMarkdownDSL.g:1491:1: rule__Image__Group__2__Impl : ( '](' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1495:1: ( ( '](' ) )
            // InternalMarkdownDSL.g:1496:1: ( '](' )
            {
            // InternalMarkdownDSL.g:1496:1: ( '](' )
            // InternalMarkdownDSL.g:1497:2: ']('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getRightSquareBracketLeftParenthesisKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getRightSquareBracketLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // InternalMarkdownDSL.g:1506:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1510:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalMarkdownDSL.g:1511:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Image__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Image__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // InternalMarkdownDSL.g:1518:1: rule__Image__Group__3__Impl : ( ( rule__Image__UrlAssignment_3 ) ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1522:1: ( ( ( rule__Image__UrlAssignment_3 ) ) )
            // InternalMarkdownDSL.g:1523:1: ( ( rule__Image__UrlAssignment_3 ) )
            {
            // InternalMarkdownDSL.g:1523:1: ( ( rule__Image__UrlAssignment_3 ) )
            // InternalMarkdownDSL.g:1524:2: ( rule__Image__UrlAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getUrlAssignment_3()); 
            }
            // InternalMarkdownDSL.g:1525:2: ( rule__Image__UrlAssignment_3 )
            // InternalMarkdownDSL.g:1525:3: rule__Image__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Image__UrlAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getUrlAssignment_3()); 
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
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // InternalMarkdownDSL.g:1533:1: rule__Image__Group__4 : rule__Image__Group__4__Impl ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1537:1: ( rule__Image__Group__4__Impl )
            // InternalMarkdownDSL.g:1538:2: rule__Image__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // InternalMarkdownDSL.g:1544:1: rule__Image__Group__4__Impl : ( ')' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1548:1: ( ( ')' ) )
            // InternalMarkdownDSL.g:1549:1: ( ')' )
            {
            // InternalMarkdownDSL.g:1549:1: ( ')' )
            // InternalMarkdownDSL.g:1550:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalMarkdownDSL.g:1560:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1564:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMarkdownDSL.g:1565:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Table__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalMarkdownDSL.g:1572:1: rule__Table__Group__0__Impl : ( ( ( rule__Table__ThrAssignment_0 ) ) ( ( rule__Table__ThrAssignment_0 )* ) ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1576:1: ( ( ( ( rule__Table__ThrAssignment_0 ) ) ( ( rule__Table__ThrAssignment_0 )* ) ) )
            // InternalMarkdownDSL.g:1577:1: ( ( ( rule__Table__ThrAssignment_0 ) ) ( ( rule__Table__ThrAssignment_0 )* ) )
            {
            // InternalMarkdownDSL.g:1577:1: ( ( ( rule__Table__ThrAssignment_0 ) ) ( ( rule__Table__ThrAssignment_0 )* ) )
            // InternalMarkdownDSL.g:1578:2: ( ( rule__Table__ThrAssignment_0 ) ) ( ( rule__Table__ThrAssignment_0 )* )
            {
            // InternalMarkdownDSL.g:1578:2: ( ( rule__Table__ThrAssignment_0 ) )
            // InternalMarkdownDSL.g:1579:3: ( rule__Table__ThrAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getThrAssignment_0()); 
            }
            // InternalMarkdownDSL.g:1580:3: ( rule__Table__ThrAssignment_0 )
            // InternalMarkdownDSL.g:1580:4: rule__Table__ThrAssignment_0
            {
            pushFollow(FOLLOW_18);
            rule__Table__ThrAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getThrAssignment_0()); 
            }

            }

            // InternalMarkdownDSL.g:1583:2: ( ( rule__Table__ThrAssignment_0 )* )
            // InternalMarkdownDSL.g:1584:3: ( rule__Table__ThrAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getThrAssignment_0()); 
            }
            // InternalMarkdownDSL.g:1585:3: ( rule__Table__ThrAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_STRING) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalMarkdownDSL.g:1585:4: rule__Table__ThrAssignment_0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Table__ThrAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getThrAssignment_0()); 
            }

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
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalMarkdownDSL.g:1594:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1598:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMarkdownDSL.g:1599:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Table__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalMarkdownDSL.g:1606:1: rule__Table__Group__1__Impl : ( ( '|' ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1610:1: ( ( ( '|' ) ) )
            // InternalMarkdownDSL.g:1611:1: ( ( '|' ) )
            {
            // InternalMarkdownDSL.g:1611:1: ( ( '|' ) )
            // InternalMarkdownDSL.g:1612:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getVerticalLineKeyword_1()); 
            }
            // InternalMarkdownDSL.g:1613:2: ( '|' )
            // InternalMarkdownDSL.g:1613:3: '|'
            {
            match(input,19,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getVerticalLineKeyword_1()); 
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
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalMarkdownDSL.g:1621:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1625:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMarkdownDSL.g:1626:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Table__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalMarkdownDSL.g:1633:1: rule__Table__Group__2__Impl : ( ( ( rule__Table__Group_2__0 ) ) ( ( rule__Table__Group_2__0 )* ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1637:1: ( ( ( ( rule__Table__Group_2__0 ) ) ( ( rule__Table__Group_2__0 )* ) ) )
            // InternalMarkdownDSL.g:1638:1: ( ( ( rule__Table__Group_2__0 ) ) ( ( rule__Table__Group_2__0 )* ) )
            {
            // InternalMarkdownDSL.g:1638:1: ( ( ( rule__Table__Group_2__0 ) ) ( ( rule__Table__Group_2__0 )* ) )
            // InternalMarkdownDSL.g:1639:2: ( ( rule__Table__Group_2__0 ) ) ( ( rule__Table__Group_2__0 )* )
            {
            // InternalMarkdownDSL.g:1639:2: ( ( rule__Table__Group_2__0 ) )
            // InternalMarkdownDSL.g:1640:3: ( rule__Table__Group_2__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_2()); 
            }
            // InternalMarkdownDSL.g:1641:3: ( rule__Table__Group_2__0 )
            // InternalMarkdownDSL.g:1641:4: rule__Table__Group_2__0
            {
            pushFollow(FOLLOW_20);
            rule__Table__Group_2__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup_2()); 
            }

            }

            // InternalMarkdownDSL.g:1644:2: ( ( rule__Table__Group_2__0 )* )
            // InternalMarkdownDSL.g:1645:3: ( rule__Table__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_2()); 
            }
            // InternalMarkdownDSL.g:1646:3: ( rule__Table__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMarkdownDSL.g:1646:4: rule__Table__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Table__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup_2()); 
            }

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
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalMarkdownDSL.g:1655:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1659:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalMarkdownDSL.g:1660:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Table__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalMarkdownDSL.g:1667:1: rule__Table__Group__3__Impl : ( ( '|' ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1671:1: ( ( ( '|' ) ) )
            // InternalMarkdownDSL.g:1672:1: ( ( '|' ) )
            {
            // InternalMarkdownDSL.g:1672:1: ( ( '|' ) )
            // InternalMarkdownDSL.g:1673:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getVerticalLineKeyword_3()); 
            }
            // InternalMarkdownDSL.g:1674:2: ( '|' )
            // InternalMarkdownDSL.g:1674:3: '|'
            {
            match(input,19,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getVerticalLineKeyword_3()); 
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
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalMarkdownDSL.g:1682:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1686:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalMarkdownDSL.g:1687:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Table__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalMarkdownDSL.g:1694:1: rule__Table__Group__4__Impl : ( ( ( rule__Table__TbodyAssignment_4 ) ) ( ( rule__Table__TbodyAssignment_4 )* ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1698:1: ( ( ( ( rule__Table__TbodyAssignment_4 ) ) ( ( rule__Table__TbodyAssignment_4 )* ) ) )
            // InternalMarkdownDSL.g:1699:1: ( ( ( rule__Table__TbodyAssignment_4 ) ) ( ( rule__Table__TbodyAssignment_4 )* ) )
            {
            // InternalMarkdownDSL.g:1699:1: ( ( ( rule__Table__TbodyAssignment_4 ) ) ( ( rule__Table__TbodyAssignment_4 )* ) )
            // InternalMarkdownDSL.g:1700:2: ( ( rule__Table__TbodyAssignment_4 ) ) ( ( rule__Table__TbodyAssignment_4 )* )
            {
            // InternalMarkdownDSL.g:1700:2: ( ( rule__Table__TbodyAssignment_4 ) )
            // InternalMarkdownDSL.g:1701:3: ( rule__Table__TbodyAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTbodyAssignment_4()); 
            }
            // InternalMarkdownDSL.g:1702:3: ( rule__Table__TbodyAssignment_4 )
            // InternalMarkdownDSL.g:1702:4: rule__Table__TbodyAssignment_4
            {
            pushFollow(FOLLOW_18);
            rule__Table__TbodyAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getTbodyAssignment_4()); 
            }

            }

            // InternalMarkdownDSL.g:1705:2: ( ( rule__Table__TbodyAssignment_4 )* )
            // InternalMarkdownDSL.g:1706:3: ( rule__Table__TbodyAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTbodyAssignment_4()); 
            }
            // InternalMarkdownDSL.g:1707:3: ( rule__Table__TbodyAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // InternalMarkdownDSL.g:1707:4: rule__Table__TbodyAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Table__TbodyAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getTbodyAssignment_4()); 
            }

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
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalMarkdownDSL.g:1716:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1720:1: ( rule__Table__Group__5__Impl )
            // InternalMarkdownDSL.g:1721:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalMarkdownDSL.g:1727:1: rule__Table__Group__5__Impl : ( ( '|' ) ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1731:1: ( ( ( '|' ) ) )
            // InternalMarkdownDSL.g:1732:1: ( ( '|' ) )
            {
            // InternalMarkdownDSL.g:1732:1: ( ( '|' ) )
            // InternalMarkdownDSL.g:1733:2: ( '|' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getVerticalLineKeyword_5()); 
            }
            // InternalMarkdownDSL.g:1734:2: ( '|' )
            // InternalMarkdownDSL.g:1734:3: '|'
            {
            match(input,19,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getVerticalLineKeyword_5()); 
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
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group_2__0"
    // InternalMarkdownDSL.g:1743:1: rule__Table__Group_2__0 : rule__Table__Group_2__0__Impl rule__Table__Group_2__1 ;
    public final void rule__Table__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1747:1: ( rule__Table__Group_2__0__Impl rule__Table__Group_2__1 )
            // InternalMarkdownDSL.g:1748:2: rule__Table__Group_2__0__Impl rule__Table__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Table__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Table__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__0"


    // $ANTLR start "rule__Table__Group_2__0__Impl"
    // InternalMarkdownDSL.g:1755:1: rule__Table__Group_2__0__Impl : ( '|---' ) ;
    public final void rule__Table__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1759:1: ( ( '|---' ) )
            // InternalMarkdownDSL.g:1760:1: ( '|---' )
            {
            // InternalMarkdownDSL.g:1760:1: ( '|---' )
            // InternalMarkdownDSL.g:1761:2: '|---'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getVerticalLineHyphenMinusHyphenMinusHyphenMinusKeyword_2_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getVerticalLineHyphenMinusHyphenMinusHyphenMinusKeyword_2_0()); 
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
    // $ANTLR end "rule__Table__Group_2__0__Impl"


    // $ANTLR start "rule__Table__Group_2__1"
    // InternalMarkdownDSL.g:1770:1: rule__Table__Group_2__1 : rule__Table__Group_2__1__Impl ;
    public final void rule__Table__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1774:1: ( rule__Table__Group_2__1__Impl )
            // InternalMarkdownDSL.g:1775:2: rule__Table__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_2__1"


    // $ANTLR start "rule__Table__Group_2__1__Impl"
    // InternalMarkdownDSL.g:1781:1: rule__Table__Group_2__1__Impl : ( ( '-' )* ) ;
    public final void rule__Table__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1785:1: ( ( ( '-' )* ) )
            // InternalMarkdownDSL.g:1786:1: ( ( '-' )* )
            {
            // InternalMarkdownDSL.g:1786:1: ( ( '-' )* )
            // InternalMarkdownDSL.g:1787:2: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getHyphenMinusKeyword_2_1()); 
            }
            // InternalMarkdownDSL.g:1788:2: ( '-' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMarkdownDSL.g:1788:3: '-'
            	    {
            	    match(input,21,FOLLOW_22); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getHyphenMinusKeyword_2_1()); 
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
    // $ANTLR end "rule__Table__Group_2__1__Impl"


    // $ANTLR start "rule__Thr__Group__0"
    // InternalMarkdownDSL.g:1797:1: rule__Thr__Group__0 : rule__Thr__Group__0__Impl rule__Thr__Group__1 ;
    public final void rule__Thr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1801:1: ( rule__Thr__Group__0__Impl rule__Thr__Group__1 )
            // InternalMarkdownDSL.g:1802:2: rule__Thr__Group__0__Impl rule__Thr__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Thr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Thr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thr__Group__0"


    // $ANTLR start "rule__Thr__Group__0__Impl"
    // InternalMarkdownDSL.g:1809:1: rule__Thr__Group__0__Impl : ( '|' ) ;
    public final void rule__Thr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1813:1: ( ( '|' ) )
            // InternalMarkdownDSL.g:1814:1: ( '|' )
            {
            // InternalMarkdownDSL.g:1814:1: ( '|' )
            // InternalMarkdownDSL.g:1815:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getVerticalLineKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getVerticalLineKeyword_0()); 
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
    // $ANTLR end "rule__Thr__Group__0__Impl"


    // $ANTLR start "rule__Thr__Group__1"
    // InternalMarkdownDSL.g:1824:1: rule__Thr__Group__1 : rule__Thr__Group__1__Impl rule__Thr__Group__2 ;
    public final void rule__Thr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1828:1: ( rule__Thr__Group__1__Impl rule__Thr__Group__2 )
            // InternalMarkdownDSL.g:1829:2: rule__Thr__Group__1__Impl rule__Thr__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Thr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Thr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thr__Group__1"


    // $ANTLR start "rule__Thr__Group__1__Impl"
    // InternalMarkdownDSL.g:1836:1: rule__Thr__Group__1__Impl : ( ( rule__Thr__ContentAssignment_1 ) ) ;
    public final void rule__Thr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1840:1: ( ( ( rule__Thr__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:1841:1: ( ( rule__Thr__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:1841:1: ( ( rule__Thr__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:1842:2: ( rule__Thr__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:1843:2: ( rule__Thr__ContentAssignment_1 )
            // InternalMarkdownDSL.g:1843:3: rule__Thr__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Thr__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Thr__Group__1__Impl"


    // $ANTLR start "rule__Thr__Group__2"
    // InternalMarkdownDSL.g:1851:1: rule__Thr__Group__2 : rule__Thr__Group__2__Impl rule__Thr__Group__3 ;
    public final void rule__Thr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1855:1: ( rule__Thr__Group__2__Impl rule__Thr__Group__3 )
            // InternalMarkdownDSL.g:1856:2: rule__Thr__Group__2__Impl rule__Thr__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Thr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Thr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thr__Group__2"


    // $ANTLR start "rule__Thr__Group__2__Impl"
    // InternalMarkdownDSL.g:1863:1: rule__Thr__Group__2__Impl : ( ( rule__Thr__BoldtextAssignment_2 )? ) ;
    public final void rule__Thr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1867:1: ( ( ( rule__Thr__BoldtextAssignment_2 )? ) )
            // InternalMarkdownDSL.g:1868:1: ( ( rule__Thr__BoldtextAssignment_2 )? )
            {
            // InternalMarkdownDSL.g:1868:1: ( ( rule__Thr__BoldtextAssignment_2 )? )
            // InternalMarkdownDSL.g:1869:2: ( rule__Thr__BoldtextAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getBoldtextAssignment_2()); 
            }
            // InternalMarkdownDSL.g:1870:2: ( rule__Thr__BoldtextAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                int LA22_1 = input.LA(2);

                if ( (synpred26_InternalMarkdownDSL()) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalMarkdownDSL.g:1870:3: rule__Thr__BoldtextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Thr__BoldtextAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getBoldtextAssignment_2()); 
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
    // $ANTLR end "rule__Thr__Group__2__Impl"


    // $ANTLR start "rule__Thr__Group__3"
    // InternalMarkdownDSL.g:1878:1: rule__Thr__Group__3 : rule__Thr__Group__3__Impl rule__Thr__Group__4 ;
    public final void rule__Thr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1882:1: ( rule__Thr__Group__3__Impl rule__Thr__Group__4 )
            // InternalMarkdownDSL.g:1883:2: rule__Thr__Group__3__Impl rule__Thr__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Thr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Thr__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thr__Group__3"


    // $ANTLR start "rule__Thr__Group__3__Impl"
    // InternalMarkdownDSL.g:1890:1: rule__Thr__Group__3__Impl : ( ( rule__Thr__ItalictextAssignment_3 )? ) ;
    public final void rule__Thr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1894:1: ( ( ( rule__Thr__ItalictextAssignment_3 )? ) )
            // InternalMarkdownDSL.g:1895:1: ( ( rule__Thr__ItalictextAssignment_3 )? )
            {
            // InternalMarkdownDSL.g:1895:1: ( ( rule__Thr__ItalictextAssignment_3 )? )
            // InternalMarkdownDSL.g:1896:2: ( rule__Thr__ItalictextAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getItalictextAssignment_3()); 
            }
            // InternalMarkdownDSL.g:1897:2: ( rule__Thr__ItalictextAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (synpred27_InternalMarkdownDSL()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalMarkdownDSL.g:1897:3: rule__Thr__ItalictextAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Thr__ItalictextAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getItalictextAssignment_3()); 
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
    // $ANTLR end "rule__Thr__Group__3__Impl"


    // $ANTLR start "rule__Thr__Group__4"
    // InternalMarkdownDSL.g:1905:1: rule__Thr__Group__4 : rule__Thr__Group__4__Impl ;
    public final void rule__Thr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1909:1: ( rule__Thr__Group__4__Impl )
            // InternalMarkdownDSL.g:1910:2: rule__Thr__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Thr__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Thr__Group__4"


    // $ANTLR start "rule__Thr__Group__4__Impl"
    // InternalMarkdownDSL.g:1916:1: rule__Thr__Group__4__Impl : ( ( rule__Thr__TextstrikeAssignment_4 )? ) ;
    public final void rule__Thr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1920:1: ( ( ( rule__Thr__TextstrikeAssignment_4 )? ) )
            // InternalMarkdownDSL.g:1921:1: ( ( rule__Thr__TextstrikeAssignment_4 )? )
            {
            // InternalMarkdownDSL.g:1921:1: ( ( rule__Thr__TextstrikeAssignment_4 )? )
            // InternalMarkdownDSL.g:1922:2: ( rule__Thr__TextstrikeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getTextstrikeAssignment_4()); 
            }
            // InternalMarkdownDSL.g:1923:2: ( rule__Thr__TextstrikeAssignment_4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMarkdownDSL.g:1923:3: rule__Thr__TextstrikeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Thr__TextstrikeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getTextstrikeAssignment_4()); 
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
    // $ANTLR end "rule__Thr__Group__4__Impl"


    // $ANTLR start "rule__Tbody__Group__0"
    // InternalMarkdownDSL.g:1932:1: rule__Tbody__Group__0 : rule__Tbody__Group__0__Impl rule__Tbody__Group__1 ;
    public final void rule__Tbody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1936:1: ( rule__Tbody__Group__0__Impl rule__Tbody__Group__1 )
            // InternalMarkdownDSL.g:1937:2: rule__Tbody__Group__0__Impl rule__Tbody__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Tbody__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tbody__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tbody__Group__0"


    // $ANTLR start "rule__Tbody__Group__0__Impl"
    // InternalMarkdownDSL.g:1944:1: rule__Tbody__Group__0__Impl : ( '|' ) ;
    public final void rule__Tbody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1948:1: ( ( '|' ) )
            // InternalMarkdownDSL.g:1949:1: ( '|' )
            {
            // InternalMarkdownDSL.g:1949:1: ( '|' )
            // InternalMarkdownDSL.g:1950:2: '|'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getVerticalLineKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getVerticalLineKeyword_0()); 
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
    // $ANTLR end "rule__Tbody__Group__0__Impl"


    // $ANTLR start "rule__Tbody__Group__1"
    // InternalMarkdownDSL.g:1959:1: rule__Tbody__Group__1 : rule__Tbody__Group__1__Impl rule__Tbody__Group__2 ;
    public final void rule__Tbody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1963:1: ( rule__Tbody__Group__1__Impl rule__Tbody__Group__2 )
            // InternalMarkdownDSL.g:1964:2: rule__Tbody__Group__1__Impl rule__Tbody__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Tbody__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tbody__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tbody__Group__1"


    // $ANTLR start "rule__Tbody__Group__1__Impl"
    // InternalMarkdownDSL.g:1971:1: rule__Tbody__Group__1__Impl : ( ( rule__Tbody__ContentAssignment_1 ) ) ;
    public final void rule__Tbody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1975:1: ( ( ( rule__Tbody__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:1976:1: ( ( rule__Tbody__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:1976:1: ( ( rule__Tbody__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:1977:2: ( rule__Tbody__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:1978:2: ( rule__Tbody__ContentAssignment_1 )
            // InternalMarkdownDSL.g:1978:3: rule__Tbody__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tbody__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Tbody__Group__1__Impl"


    // $ANTLR start "rule__Tbody__Group__2"
    // InternalMarkdownDSL.g:1986:1: rule__Tbody__Group__2 : rule__Tbody__Group__2__Impl rule__Tbody__Group__3 ;
    public final void rule__Tbody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:1990:1: ( rule__Tbody__Group__2__Impl rule__Tbody__Group__3 )
            // InternalMarkdownDSL.g:1991:2: rule__Tbody__Group__2__Impl rule__Tbody__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Tbody__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tbody__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tbody__Group__2"


    // $ANTLR start "rule__Tbody__Group__2__Impl"
    // InternalMarkdownDSL.g:1998:1: rule__Tbody__Group__2__Impl : ( ( rule__Tbody__BoldtextAssignment_2 )? ) ;
    public final void rule__Tbody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2002:1: ( ( ( rule__Tbody__BoldtextAssignment_2 )? ) )
            // InternalMarkdownDSL.g:2003:1: ( ( rule__Tbody__BoldtextAssignment_2 )? )
            {
            // InternalMarkdownDSL.g:2003:1: ( ( rule__Tbody__BoldtextAssignment_2 )? )
            // InternalMarkdownDSL.g:2004:2: ( rule__Tbody__BoldtextAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getBoldtextAssignment_2()); 
            }
            // InternalMarkdownDSL.g:2005:2: ( rule__Tbody__BoldtextAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (synpred29_InternalMarkdownDSL()) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalMarkdownDSL.g:2005:3: rule__Tbody__BoldtextAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tbody__BoldtextAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getBoldtextAssignment_2()); 
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
    // $ANTLR end "rule__Tbody__Group__2__Impl"


    // $ANTLR start "rule__Tbody__Group__3"
    // InternalMarkdownDSL.g:2013:1: rule__Tbody__Group__3 : rule__Tbody__Group__3__Impl rule__Tbody__Group__4 ;
    public final void rule__Tbody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2017:1: ( rule__Tbody__Group__3__Impl rule__Tbody__Group__4 )
            // InternalMarkdownDSL.g:2018:2: rule__Tbody__Group__3__Impl rule__Tbody__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Tbody__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Tbody__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tbody__Group__3"


    // $ANTLR start "rule__Tbody__Group__3__Impl"
    // InternalMarkdownDSL.g:2025:1: rule__Tbody__Group__3__Impl : ( ( rule__Tbody__ItalictextAssignment_3 )? ) ;
    public final void rule__Tbody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2029:1: ( ( ( rule__Tbody__ItalictextAssignment_3 )? ) )
            // InternalMarkdownDSL.g:2030:1: ( ( rule__Tbody__ItalictextAssignment_3 )? )
            {
            // InternalMarkdownDSL.g:2030:1: ( ( rule__Tbody__ItalictextAssignment_3 )? )
            // InternalMarkdownDSL.g:2031:2: ( rule__Tbody__ItalictextAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getItalictextAssignment_3()); 
            }
            // InternalMarkdownDSL.g:2032:2: ( rule__Tbody__ItalictextAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred30_InternalMarkdownDSL()) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalMarkdownDSL.g:2032:3: rule__Tbody__ItalictextAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tbody__ItalictextAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getItalictextAssignment_3()); 
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
    // $ANTLR end "rule__Tbody__Group__3__Impl"


    // $ANTLR start "rule__Tbody__Group__4"
    // InternalMarkdownDSL.g:2040:1: rule__Tbody__Group__4 : rule__Tbody__Group__4__Impl ;
    public final void rule__Tbody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2044:1: ( rule__Tbody__Group__4__Impl )
            // InternalMarkdownDSL.g:2045:2: rule__Tbody__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tbody__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tbody__Group__4"


    // $ANTLR start "rule__Tbody__Group__4__Impl"
    // InternalMarkdownDSL.g:2051:1: rule__Tbody__Group__4__Impl : ( ( rule__Tbody__TextstrikeAssignment_4 )? ) ;
    public final void rule__Tbody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2055:1: ( ( ( rule__Tbody__TextstrikeAssignment_4 )? ) )
            // InternalMarkdownDSL.g:2056:1: ( ( rule__Tbody__TextstrikeAssignment_4 )? )
            {
            // InternalMarkdownDSL.g:2056:1: ( ( rule__Tbody__TextstrikeAssignment_4 )? )
            // InternalMarkdownDSL.g:2057:2: ( rule__Tbody__TextstrikeAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getTextstrikeAssignment_4()); 
            }
            // InternalMarkdownDSL.g:2058:2: ( rule__Tbody__TextstrikeAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMarkdownDSL.g:2058:3: rule__Tbody__TextstrikeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tbody__TextstrikeAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getTextstrikeAssignment_4()); 
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
    // $ANTLR end "rule__Tbody__Group__4__Impl"


    // $ANTLR start "rule__Horizonrule__Group__0"
    // InternalMarkdownDSL.g:2067:1: rule__Horizonrule__Group__0 : rule__Horizonrule__Group__0__Impl rule__Horizonrule__Group__1 ;
    public final void rule__Horizonrule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2071:1: ( rule__Horizonrule__Group__0__Impl rule__Horizonrule__Group__1 )
            // InternalMarkdownDSL.g:2072:2: rule__Horizonrule__Group__0__Impl rule__Horizonrule__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Horizonrule__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Horizonrule__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizonrule__Group__0"


    // $ANTLR start "rule__Horizonrule__Group__0__Impl"
    // InternalMarkdownDSL.g:2079:1: rule__Horizonrule__Group__0__Impl : ( ( rule__Horizonrule__HrAssignment_0 ) ) ;
    public final void rule__Horizonrule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2083:1: ( ( ( rule__Horizonrule__HrAssignment_0 ) ) )
            // InternalMarkdownDSL.g:2084:1: ( ( rule__Horizonrule__HrAssignment_0 ) )
            {
            // InternalMarkdownDSL.g:2084:1: ( ( rule__Horizonrule__HrAssignment_0 ) )
            // InternalMarkdownDSL.g:2085:2: ( rule__Horizonrule__HrAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizonruleAccess().getHrAssignment_0()); 
            }
            // InternalMarkdownDSL.g:2086:2: ( rule__Horizonrule__HrAssignment_0 )
            // InternalMarkdownDSL.g:2086:3: rule__Horizonrule__HrAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Horizonrule__HrAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizonruleAccess().getHrAssignment_0()); 
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
    // $ANTLR end "rule__Horizonrule__Group__0__Impl"


    // $ANTLR start "rule__Horizonrule__Group__1"
    // InternalMarkdownDSL.g:2094:1: rule__Horizonrule__Group__1 : rule__Horizonrule__Group__1__Impl ;
    public final void rule__Horizonrule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2098:1: ( rule__Horizonrule__Group__1__Impl )
            // InternalMarkdownDSL.g:2099:2: rule__Horizonrule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Horizonrule__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Horizonrule__Group__1"


    // $ANTLR start "rule__Horizonrule__Group__1__Impl"
    // InternalMarkdownDSL.g:2105:1: rule__Horizonrule__Group__1__Impl : ( ( '-' )* ) ;
    public final void rule__Horizonrule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2109:1: ( ( ( '-' )* ) )
            // InternalMarkdownDSL.g:2110:1: ( ( '-' )* )
            {
            // InternalMarkdownDSL.g:2110:1: ( ( '-' )* )
            // InternalMarkdownDSL.g:2111:2: ( '-' )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizonruleAccess().getHyphenMinusKeyword_1()); 
            }
            // InternalMarkdownDSL.g:2112:2: ( '-' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMarkdownDSL.g:2112:3: '-'
            	    {
            	    match(input,21,FOLLOW_22); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizonruleAccess().getHyphenMinusKeyword_1()); 
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
    // $ANTLR end "rule__Horizonrule__Group__1__Impl"


    // $ANTLR start "rule__Emoticon__Group__0"
    // InternalMarkdownDSL.g:2121:1: rule__Emoticon__Group__0 : rule__Emoticon__Group__0__Impl rule__Emoticon__Group__1 ;
    public final void rule__Emoticon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2125:1: ( rule__Emoticon__Group__0__Impl rule__Emoticon__Group__1 )
            // InternalMarkdownDSL.g:2126:2: rule__Emoticon__Group__0__Impl rule__Emoticon__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Emoticon__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Emoticon__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emoticon__Group__0"


    // $ANTLR start "rule__Emoticon__Group__0__Impl"
    // InternalMarkdownDSL.g:2133:1: rule__Emoticon__Group__0__Impl : ( ':' ) ;
    public final void rule__Emoticon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2137:1: ( ( ':' ) )
            // InternalMarkdownDSL.g:2138:1: ( ':' )
            {
            // InternalMarkdownDSL.g:2138:1: ( ':' )
            // InternalMarkdownDSL.g:2139:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmoticonAccess().getColonKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmoticonAccess().getColonKeyword_0()); 
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
    // $ANTLR end "rule__Emoticon__Group__0__Impl"


    // $ANTLR start "rule__Emoticon__Group__1"
    // InternalMarkdownDSL.g:2148:1: rule__Emoticon__Group__1 : rule__Emoticon__Group__1__Impl rule__Emoticon__Group__2 ;
    public final void rule__Emoticon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2152:1: ( rule__Emoticon__Group__1__Impl rule__Emoticon__Group__2 )
            // InternalMarkdownDSL.g:2153:2: rule__Emoticon__Group__1__Impl rule__Emoticon__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Emoticon__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Emoticon__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emoticon__Group__1"


    // $ANTLR start "rule__Emoticon__Group__1__Impl"
    // InternalMarkdownDSL.g:2160:1: rule__Emoticon__Group__1__Impl : ( ( rule__Emoticon__ContentAssignment_1 ) ) ;
    public final void rule__Emoticon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2164:1: ( ( ( rule__Emoticon__ContentAssignment_1 ) ) )
            // InternalMarkdownDSL.g:2165:1: ( ( rule__Emoticon__ContentAssignment_1 ) )
            {
            // InternalMarkdownDSL.g:2165:1: ( ( rule__Emoticon__ContentAssignment_1 ) )
            // InternalMarkdownDSL.g:2166:2: ( rule__Emoticon__ContentAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmoticonAccess().getContentAssignment_1()); 
            }
            // InternalMarkdownDSL.g:2167:2: ( rule__Emoticon__ContentAssignment_1 )
            // InternalMarkdownDSL.g:2167:3: rule__Emoticon__ContentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Emoticon__ContentAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmoticonAccess().getContentAssignment_1()); 
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
    // $ANTLR end "rule__Emoticon__Group__1__Impl"


    // $ANTLR start "rule__Emoticon__Group__2"
    // InternalMarkdownDSL.g:2175:1: rule__Emoticon__Group__2 : rule__Emoticon__Group__2__Impl ;
    public final void rule__Emoticon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2179:1: ( rule__Emoticon__Group__2__Impl )
            // InternalMarkdownDSL.g:2180:2: rule__Emoticon__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Emoticon__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Emoticon__Group__2"


    // $ANTLR start "rule__Emoticon__Group__2__Impl"
    // InternalMarkdownDSL.g:2186:1: rule__Emoticon__Group__2__Impl : ( ':' ) ;
    public final void rule__Emoticon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2190:1: ( ( ':' ) )
            // InternalMarkdownDSL.g:2191:1: ( ':' )
            {
            // InternalMarkdownDSL.g:2191:1: ( ':' )
            // InternalMarkdownDSL.g:2192:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmoticonAccess().getColonKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmoticonAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Emoticon__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementAssignment"
    // InternalMarkdownDSL.g:2202:1: rule__Model__ElementAssignment : ( ruleDocument ) ;
    public final void rule__Model__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2206:1: ( ( ruleDocument ) )
            // InternalMarkdownDSL.g:2207:2: ( ruleDocument )
            {
            // InternalMarkdownDSL.g:2207:2: ( ruleDocument )
            // InternalMarkdownDSL.g:2208:3: ruleDocument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getElementDocumentParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getElementDocumentParserRuleCall_0()); 
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
    // $ANTLR end "rule__Model__ElementAssignment"


    // $ANTLR start "rule__Document__TextsAssignment_0"
    // InternalMarkdownDSL.g:2217:1: rule__Document__TextsAssignment_0 : ( ruleText ) ;
    public final void rule__Document__TextsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2221:1: ( ( ruleText ) )
            // InternalMarkdownDSL.g:2222:2: ( ruleText )
            {
            // InternalMarkdownDSL.g:2222:2: ( ruleText )
            // InternalMarkdownDSL.g:2223:3: ruleText
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getTextsTextParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getTextsTextParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Document__TextsAssignment_0"


    // $ANTLR start "rule__Document__EntitiesAssignment_1"
    // InternalMarkdownDSL.g:2232:1: rule__Document__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__Document__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2236:1: ( ( ruleEntity ) )
            // InternalMarkdownDSL.g:2237:2: ( ruleEntity )
            {
            // InternalMarkdownDSL.g:2237:2: ( ruleEntity )
            // InternalMarkdownDSL.g:2238:3: ruleEntity
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getEntitiesEntityParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getEntitiesEntityParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Document__EntitiesAssignment_1"


    // $ANTLR start "rule__Text__HeadingsAssignment_0"
    // InternalMarkdownDSL.g:2247:1: rule__Text__HeadingsAssignment_0 : ( ruleHeading ) ;
    public final void rule__Text__HeadingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2251:1: ( ( ruleHeading ) )
            // InternalMarkdownDSL.g:2252:2: ( ruleHeading )
            {
            // InternalMarkdownDSL.g:2252:2: ( ruleHeading )
            // InternalMarkdownDSL.g:2253:3: ruleHeading
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getHeadingsHeadingParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHeading();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getHeadingsHeadingParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Text__HeadingsAssignment_0"


    // $ANTLR start "rule__Text__ParagraphsAssignment_1"
    // InternalMarkdownDSL.g:2262:1: rule__Text__ParagraphsAssignment_1 : ( ruleParagraph ) ;
    public final void rule__Text__ParagraphsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2266:1: ( ( ruleParagraph ) )
            // InternalMarkdownDSL.g:2267:2: ( ruleParagraph )
            {
            // InternalMarkdownDSL.g:2267:2: ( ruleParagraph )
            // InternalMarkdownDSL.g:2268:3: ruleParagraph
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAccess().getParagraphsParagraphParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Text__ParagraphsAssignment_1"


    // $ANTLR start "rule__Entity__BlockquotesAssignment_0"
    // InternalMarkdownDSL.g:2277:1: rule__Entity__BlockquotesAssignment_0 : ( ruleBlockquote ) ;
    public final void rule__Entity__BlockquotesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2281:1: ( ( ruleBlockquote ) )
            // InternalMarkdownDSL.g:2282:2: ( ruleBlockquote )
            {
            // InternalMarkdownDSL.g:2282:2: ( ruleBlockquote )
            // InternalMarkdownDSL.g:2283:3: ruleBlockquote
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getBlockquotesBlockquoteParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBlockquote();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getBlockquotesBlockquoteParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Entity__BlockquotesAssignment_0"


    // $ANTLR start "rule__Entity__ImagesAssignment_1"
    // InternalMarkdownDSL.g:2292:1: rule__Entity__ImagesAssignment_1 : ( ruleImage ) ;
    public final void rule__Entity__ImagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2296:1: ( ( ruleImage ) )
            // InternalMarkdownDSL.g:2297:2: ( ruleImage )
            {
            // InternalMarkdownDSL.g:2297:2: ( ruleImage )
            // InternalMarkdownDSL.g:2298:3: ruleImage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getImagesImageParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getImagesImageParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Entity__ImagesAssignment_1"


    // $ANTLR start "rule__Entity__TablesAssignment_2"
    // InternalMarkdownDSL.g:2307:1: rule__Entity__TablesAssignment_2 : ( ruleTable ) ;
    public final void rule__Entity__TablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2311:1: ( ( ruleTable ) )
            // InternalMarkdownDSL.g:2312:2: ( ruleTable )
            {
            // InternalMarkdownDSL.g:2312:2: ( ruleTable )
            // InternalMarkdownDSL.g:2313:3: ruleTable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getTablesTableParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getTablesTableParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Entity__TablesAssignment_2"


    // $ANTLR start "rule__Entity__ListsAssignment_3"
    // InternalMarkdownDSL.g:2322:1: rule__Entity__ListsAssignment_3 : ( ruleLists ) ;
    public final void rule__Entity__ListsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2326:1: ( ( ruleLists ) )
            // InternalMarkdownDSL.g:2327:2: ( ruleLists )
            {
            // InternalMarkdownDSL.g:2327:2: ( ruleLists )
            // InternalMarkdownDSL.g:2328:3: ruleLists
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getListsListsParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLists();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getListsListsParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Entity__ListsAssignment_3"


    // $ANTLR start "rule__Entity__HorizonrulesAssignment_4"
    // InternalMarkdownDSL.g:2337:1: rule__Entity__HorizonrulesAssignment_4 : ( ruleHorizonrule ) ;
    public final void rule__Entity__HorizonrulesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2341:1: ( ( ruleHorizonrule ) )
            // InternalMarkdownDSL.g:2342:2: ( ruleHorizonrule )
            {
            // InternalMarkdownDSL.g:2342:2: ( ruleHorizonrule )
            // InternalMarkdownDSL.g:2343:3: ruleHorizonrule
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getHorizonrulesHorizonruleParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleHorizonrule();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getHorizonrulesHorizonruleParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Entity__HorizonrulesAssignment_4"


    // $ANTLR start "rule__Entity__EmoticonsAssignment_5"
    // InternalMarkdownDSL.g:2352:1: rule__Entity__EmoticonsAssignment_5 : ( ruleEmoticon ) ;
    public final void rule__Entity__EmoticonsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2356:1: ( ( ruleEmoticon ) )
            // InternalMarkdownDSL.g:2357:2: ( ruleEmoticon )
            {
            // InternalMarkdownDSL.g:2357:2: ( ruleEmoticon )
            // InternalMarkdownDSL.g:2358:3: ruleEmoticon
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEmoticonsEmoticonParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmoticon();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEmoticonsEmoticonParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Entity__EmoticonsAssignment_5"


    // $ANTLR start "rule__Heading__H1sAssignment_0_1"
    // InternalMarkdownDSL.g:2367:1: rule__Heading__H1sAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Heading__H1sAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2371:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2372:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2372:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2373:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingAccess().getH1sSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingAccess().getH1sSTRINGTerminalRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Heading__H1sAssignment_0_1"


    // $ANTLR start "rule__Heading__H2sAssignment_1_1"
    // InternalMarkdownDSL.g:2382:1: rule__Heading__H2sAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Heading__H2sAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2386:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2387:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2387:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2388:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHeadingAccess().getH2sSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHeadingAccess().getH2sSTRINGTerminalRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Heading__H2sAssignment_1_1"


    // $ANTLR start "rule__Paragraph__ContentAssignment_0"
    // InternalMarkdownDSL.g:2397:1: rule__Paragraph__ContentAssignment_0 : ( rulePlaintext ) ;
    public final void rule__Paragraph__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2401:1: ( ( rulePlaintext ) )
            // InternalMarkdownDSL.g:2402:2: ( rulePlaintext )
            {
            // InternalMarkdownDSL.g:2402:2: ( rulePlaintext )
            // InternalMarkdownDSL.g:2403:3: rulePlaintext
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getContentPlaintextParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlaintext();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getContentPlaintextParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Paragraph__ContentAssignment_0"


    // $ANTLR start "rule__Paragraph__BoldtextAssignment_1"
    // InternalMarkdownDSL.g:2412:1: rule__Paragraph__BoldtextAssignment_1 : ( ruleBold ) ;
    public final void rule__Paragraph__BoldtextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2416:1: ( ( ruleBold ) )
            // InternalMarkdownDSL.g:2417:2: ( ruleBold )
            {
            // InternalMarkdownDSL.g:2417:2: ( ruleBold )
            // InternalMarkdownDSL.g:2418:3: ruleBold
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getBoldtextBoldParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBold();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getBoldtextBoldParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Paragraph__BoldtextAssignment_1"


    // $ANTLR start "rule__Paragraph__ItalictextAssignment_2"
    // InternalMarkdownDSL.g:2427:1: rule__Paragraph__ItalictextAssignment_2 : ( ruleItalic ) ;
    public final void rule__Paragraph__ItalictextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2431:1: ( ( ruleItalic ) )
            // InternalMarkdownDSL.g:2432:2: ( ruleItalic )
            {
            // InternalMarkdownDSL.g:2432:2: ( ruleItalic )
            // InternalMarkdownDSL.g:2433:3: ruleItalic
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getItalictextItalicParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleItalic();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getItalictextItalicParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Paragraph__ItalictextAssignment_2"


    // $ANTLR start "rule__Paragraph__TextstrikeAssignment_3"
    // InternalMarkdownDSL.g:2442:1: rule__Paragraph__TextstrikeAssignment_3 : ( ruleStrikethrough ) ;
    public final void rule__Paragraph__TextstrikeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2446:1: ( ( ruleStrikethrough ) )
            // InternalMarkdownDSL.g:2447:2: ( ruleStrikethrough )
            {
            // InternalMarkdownDSL.g:2447:2: ( ruleStrikethrough )
            // InternalMarkdownDSL.g:2448:3: ruleStrikethrough
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParagraphAccess().getTextstrikeStrikethroughParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStrikethrough();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParagraphAccess().getTextstrikeStrikethroughParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Paragraph__TextstrikeAssignment_3"


    // $ANTLR start "rule__Plaintext__ContentAssignment"
    // InternalMarkdownDSL.g:2457:1: rule__Plaintext__ContentAssignment : ( RULE_STRING ) ;
    public final void rule__Plaintext__ContentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2461:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2462:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2462:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2463:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlaintextAccess().getContentSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlaintextAccess().getContentSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__Plaintext__ContentAssignment"


    // $ANTLR start "rule__Bold__ContentAssignment_1"
    // InternalMarkdownDSL.g:2472:1: rule__Bold__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Bold__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2476:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2477:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2477:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2478:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoldAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoldAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Bold__ContentAssignment_1"


    // $ANTLR start "rule__Italic__ContentAssignment_1"
    // InternalMarkdownDSL.g:2487:1: rule__Italic__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Italic__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2491:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2492:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2492:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2493:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getItalicAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getItalicAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Italic__ContentAssignment_1"


    // $ANTLR start "rule__Strikethrough__ContentAssignment_1"
    // InternalMarkdownDSL.g:2502:1: rule__Strikethrough__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Strikethrough__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2506:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2507:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2507:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2508:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrikethroughAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrikethroughAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Strikethrough__ContentAssignment_1"


    // $ANTLR start "rule__Lists__OlAssignment_0"
    // InternalMarkdownDSL.g:2517:1: rule__Lists__OlAssignment_0 : ( ruleOrdered ) ;
    public final void rule__Lists__OlAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2521:1: ( ( ruleOrdered ) )
            // InternalMarkdownDSL.g:2522:2: ( ruleOrdered )
            {
            // InternalMarkdownDSL.g:2522:2: ( ruleOrdered )
            // InternalMarkdownDSL.g:2523:3: ruleOrdered
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListsAccess().getOlOrderedParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOrdered();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListsAccess().getOlOrderedParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Lists__OlAssignment_0"


    // $ANTLR start "rule__Lists__UlAssignment_1"
    // InternalMarkdownDSL.g:2532:1: rule__Lists__UlAssignment_1 : ( ruleUnordered ) ;
    public final void rule__Lists__UlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2536:1: ( ( ruleUnordered ) )
            // InternalMarkdownDSL.g:2537:2: ( ruleUnordered )
            {
            // InternalMarkdownDSL.g:2537:2: ( ruleUnordered )
            // InternalMarkdownDSL.g:2538:3: ruleUnordered
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListsAccess().getUlUnorderedParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUnordered();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListsAccess().getUlUnorderedParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Lists__UlAssignment_1"


    // $ANTLR start "rule__Unordered__TypeAssignment_0"
    // InternalMarkdownDSL.g:2547:1: rule__Unordered__TypeAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Unordered__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2551:1: ( ( ( '*' ) ) )
            // InternalMarkdownDSL.g:2552:2: ( ( '*' ) )
            {
            // InternalMarkdownDSL.g:2552:2: ( ( '*' ) )
            // InternalMarkdownDSL.g:2553:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getTypeAsteriskKeyword_0_0()); 
            }
            // InternalMarkdownDSL.g:2554:3: ( '*' )
            // InternalMarkdownDSL.g:2555:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getTypeAsteriskKeyword_0_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getTypeAsteriskKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getTypeAsteriskKeyword_0_0()); 
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
    // $ANTLR end "rule__Unordered__TypeAssignment_0"


    // $ANTLR start "rule__Unordered__ContentAssignment_1"
    // InternalMarkdownDSL.g:2566:1: rule__Unordered__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Unordered__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2570:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2571:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2571:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2572:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Unordered__ContentAssignment_1"


    // $ANTLR start "rule__Unordered__BoldtextAssignment_2"
    // InternalMarkdownDSL.g:2581:1: rule__Unordered__BoldtextAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Unordered__BoldtextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2585:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2586:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2586:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2587:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getBoldtextBoldCrossReference_2_0()); 
            }
            // InternalMarkdownDSL.g:2588:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2589:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getBoldtextBoldCrossReference_2_0()); 
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
    // $ANTLR end "rule__Unordered__BoldtextAssignment_2"


    // $ANTLR start "rule__Unordered__ItalictextAssignment_3"
    // InternalMarkdownDSL.g:2600:1: rule__Unordered__ItalictextAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Unordered__ItalictextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2604:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2605:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2605:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2606:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getItalictextItalicCrossReference_3_0()); 
            }
            // InternalMarkdownDSL.g:2607:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2608:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getItalictextItalicCrossReference_3_0()); 
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
    // $ANTLR end "rule__Unordered__ItalictextAssignment_3"


    // $ANTLR start "rule__Unordered__TextstrikeAssignment_4"
    // InternalMarkdownDSL.g:2619:1: rule__Unordered__TextstrikeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Unordered__TextstrikeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2623:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2624:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2624:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2625:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
            }
            // InternalMarkdownDSL.g:2626:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2627:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnorderedAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnorderedAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
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
    // $ANTLR end "rule__Unordered__TextstrikeAssignment_4"


    // $ANTLR start "rule__Ordered__TypeAssignment_0"
    // InternalMarkdownDSL.g:2638:1: rule__Ordered__TypeAssignment_0 : ( RULE_INT ) ;
    public final void rule__Ordered__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2642:1: ( ( RULE_INT ) )
            // InternalMarkdownDSL.g:2643:2: ( RULE_INT )
            {
            // InternalMarkdownDSL.g:2643:2: ( RULE_INT )
            // InternalMarkdownDSL.g:2644:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getTypeINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getTypeINTTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Ordered__TypeAssignment_0"


    // $ANTLR start "rule__Ordered__ContentAssignment_1"
    // InternalMarkdownDSL.g:2653:1: rule__Ordered__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Ordered__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2657:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2658:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2658:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2659:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Ordered__ContentAssignment_1"


    // $ANTLR start "rule__Ordered__BoldtextAssignment_2"
    // InternalMarkdownDSL.g:2668:1: rule__Ordered__BoldtextAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Ordered__BoldtextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2672:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2673:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2673:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2674:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getBoldtextBoldCrossReference_2_0()); 
            }
            // InternalMarkdownDSL.g:2675:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2676:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getBoldtextBoldCrossReference_2_0()); 
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
    // $ANTLR end "rule__Ordered__BoldtextAssignment_2"


    // $ANTLR start "rule__Ordered__ItalictextAssignment_3"
    // InternalMarkdownDSL.g:2687:1: rule__Ordered__ItalictextAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Ordered__ItalictextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2691:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2692:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2692:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2693:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getItalictextItalicCrossReference_3_0()); 
            }
            // InternalMarkdownDSL.g:2694:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2695:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getItalictextItalicCrossReference_3_0()); 
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
    // $ANTLR end "rule__Ordered__ItalictextAssignment_3"


    // $ANTLR start "rule__Ordered__TextstrikeAssignment_4"
    // InternalMarkdownDSL.g:2706:1: rule__Ordered__TextstrikeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Ordered__TextstrikeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2710:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2711:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2711:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2712:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
            }
            // InternalMarkdownDSL.g:2713:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2714:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrderedAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrderedAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
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
    // $ANTLR end "rule__Ordered__TextstrikeAssignment_4"


    // $ANTLR start "rule__Blockquote__BlockAssignment"
    // InternalMarkdownDSL.g:2725:1: rule__Blockquote__BlockAssignment : ( ( '>' ) ) ;
    public final void rule__Blockquote__BlockAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2729:1: ( ( ( '>' ) ) )
            // InternalMarkdownDSL.g:2730:2: ( ( '>' ) )
            {
            // InternalMarkdownDSL.g:2730:2: ( ( '>' ) )
            // InternalMarkdownDSL.g:2731:3: ( '>' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockquoteAccess().getBlockGreaterThanSignKeyword_0()); 
            }
            // InternalMarkdownDSL.g:2732:3: ( '>' )
            // InternalMarkdownDSL.g:2733:4: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBlockquoteAccess().getBlockGreaterThanSignKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockquoteAccess().getBlockGreaterThanSignKeyword_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBlockquoteAccess().getBlockGreaterThanSignKeyword_0()); 
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
    // $ANTLR end "rule__Blockquote__BlockAssignment"


    // $ANTLR start "rule__Image__NameAssignment_1"
    // InternalMarkdownDSL.g:2744:1: rule__Image__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Image__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2748:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2749:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2749:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2750:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getNameSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Image__NameAssignment_1"


    // $ANTLR start "rule__Image__UrlAssignment_3"
    // InternalMarkdownDSL.g:2759:1: rule__Image__UrlAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Image__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2763:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2764:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2764:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2765:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Image__UrlAssignment_3"


    // $ANTLR start "rule__Table__ThrAssignment_0"
    // InternalMarkdownDSL.g:2774:1: rule__Table__ThrAssignment_0 : ( ruleThr ) ;
    public final void rule__Table__ThrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2778:1: ( ( ruleThr ) )
            // InternalMarkdownDSL.g:2779:2: ( ruleThr )
            {
            // InternalMarkdownDSL.g:2779:2: ( ruleThr )
            // InternalMarkdownDSL.g:2780:3: ruleThr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getThrThrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleThr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getThrThrParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Table__ThrAssignment_0"


    // $ANTLR start "rule__Table__TbodyAssignment_4"
    // InternalMarkdownDSL.g:2789:1: rule__Table__TbodyAssignment_4 : ( ruleTbody ) ;
    public final void rule__Table__TbodyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2793:1: ( ( ruleTbody ) )
            // InternalMarkdownDSL.g:2794:2: ( ruleTbody )
            {
            // InternalMarkdownDSL.g:2794:2: ( ruleTbody )
            // InternalMarkdownDSL.g:2795:3: ruleTbody
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTbodyTbodyParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTbody();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getTbodyTbodyParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Table__TbodyAssignment_4"


    // $ANTLR start "rule__Thr__ContentAssignment_1"
    // InternalMarkdownDSL.g:2804:1: rule__Thr__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Thr__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2808:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2809:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2809:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2810:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Thr__ContentAssignment_1"


    // $ANTLR start "rule__Thr__BoldtextAssignment_2"
    // InternalMarkdownDSL.g:2819:1: rule__Thr__BoldtextAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Thr__BoldtextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2823:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2824:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2824:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2825:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getBoldtextBoldCrossReference_2_0()); 
            }
            // InternalMarkdownDSL.g:2826:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2827:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getBoldtextBoldCrossReference_2_0()); 
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
    // $ANTLR end "rule__Thr__BoldtextAssignment_2"


    // $ANTLR start "rule__Thr__ItalictextAssignment_3"
    // InternalMarkdownDSL.g:2838:1: rule__Thr__ItalictextAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Thr__ItalictextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2842:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2843:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2843:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2844:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getItalictextItalicCrossReference_3_0()); 
            }
            // InternalMarkdownDSL.g:2845:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2846:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getItalictextItalicCrossReference_3_0()); 
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
    // $ANTLR end "rule__Thr__ItalictextAssignment_3"


    // $ANTLR start "rule__Thr__TextstrikeAssignment_4"
    // InternalMarkdownDSL.g:2857:1: rule__Thr__TextstrikeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Thr__TextstrikeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2861:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2862:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2862:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2863:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
            }
            // InternalMarkdownDSL.g:2864:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2865:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getThrAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getThrAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
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
    // $ANTLR end "rule__Thr__TextstrikeAssignment_4"


    // $ANTLR start "rule__Tbody__ContentAssignment_1"
    // InternalMarkdownDSL.g:2876:1: rule__Tbody__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tbody__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2880:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2881:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2881:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2882:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Tbody__ContentAssignment_1"


    // $ANTLR start "rule__Tbody__BoldtextAssignment_2"
    // InternalMarkdownDSL.g:2891:1: rule__Tbody__BoldtextAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Tbody__BoldtextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2895:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2896:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2896:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2897:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getBoldtextBoldCrossReference_2_0()); 
            }
            // InternalMarkdownDSL.g:2898:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2899:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getBoldtextBoldIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getBoldtextBoldCrossReference_2_0()); 
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
    // $ANTLR end "rule__Tbody__BoldtextAssignment_2"


    // $ANTLR start "rule__Tbody__ItalictextAssignment_3"
    // InternalMarkdownDSL.g:2910:1: rule__Tbody__ItalictextAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Tbody__ItalictextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2914:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2915:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2915:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2916:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getItalictextItalicCrossReference_3_0()); 
            }
            // InternalMarkdownDSL.g:2917:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2918:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getItalictextItalicIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getItalictextItalicCrossReference_3_0()); 
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
    // $ANTLR end "rule__Tbody__ItalictextAssignment_3"


    // $ANTLR start "rule__Tbody__TextstrikeAssignment_4"
    // InternalMarkdownDSL.g:2929:1: rule__Tbody__TextstrikeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Tbody__TextstrikeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2933:1: ( ( ( RULE_ID ) ) )
            // InternalMarkdownDSL.g:2934:2: ( ( RULE_ID ) )
            {
            // InternalMarkdownDSL.g:2934:2: ( ( RULE_ID ) )
            // InternalMarkdownDSL.g:2935:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
            }
            // InternalMarkdownDSL.g:2936:3: ( RULE_ID )
            // InternalMarkdownDSL.g:2937:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTbodyAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getTextstrikeStrikethroughIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTbodyAccess().getTextstrikeStrikethroughCrossReference_4_0()); 
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
    // $ANTLR end "rule__Tbody__TextstrikeAssignment_4"


    // $ANTLR start "rule__Horizonrule__HrAssignment_0"
    // InternalMarkdownDSL.g:2948:1: rule__Horizonrule__HrAssignment_0 : ( ( '---' ) ) ;
    public final void rule__Horizonrule__HrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2952:1: ( ( ( '---' ) ) )
            // InternalMarkdownDSL.g:2953:2: ( ( '---' ) )
            {
            // InternalMarkdownDSL.g:2953:2: ( ( '---' ) )
            // InternalMarkdownDSL.g:2954:3: ( '---' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizonruleAccess().getHrHyphenMinusHyphenMinusHyphenMinusKeyword_0_0()); 
            }
            // InternalMarkdownDSL.g:2955:3: ( '---' )
            // InternalMarkdownDSL.g:2956:4: '---'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHorizonruleAccess().getHrHyphenMinusHyphenMinusHyphenMinusKeyword_0_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizonruleAccess().getHrHyphenMinusHyphenMinusHyphenMinusKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHorizonruleAccess().getHrHyphenMinusHyphenMinusHyphenMinusKeyword_0_0()); 
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
    // $ANTLR end "rule__Horizonrule__HrAssignment_0"


    // $ANTLR start "rule__Emoticon__ContentAssignment_1"
    // InternalMarkdownDSL.g:2967:1: rule__Emoticon__ContentAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Emoticon__ContentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarkdownDSL.g:2971:1: ( ( RULE_STRING ) )
            // InternalMarkdownDSL.g:2972:2: ( RULE_STRING )
            {
            // InternalMarkdownDSL.g:2972:2: ( RULE_STRING )
            // InternalMarkdownDSL.g:2973:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmoticonAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmoticonAccess().getContentSTRINGTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Emoticon__ContentAssignment_1"

    // $ANTLR start synpred2_InternalMarkdownDSL
    public final void synpred2_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:401:5: ( rule__Blockquote__BlockAssignment )
        // InternalMarkdownDSL.g:401:5: rule__Blockquote__BlockAssignment
        {
        pushFollow(FOLLOW_2);
        rule__Blockquote__BlockAssignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMarkdownDSL

    // $ANTLR start synpred12_InternalMarkdownDSL
    public final void synpred12_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:822:4: ( rule__Paragraph__ContentAssignment_0 )
        // InternalMarkdownDSL.g:822:4: rule__Paragraph__ContentAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__Paragraph__ContentAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalMarkdownDSL

    // $ANTLR start synpred14_InternalMarkdownDSL
    public final void synpred14_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:877:3: ( rule__Paragraph__ItalictextAssignment_2 )
        // InternalMarkdownDSL.g:877:3: rule__Paragraph__ItalictextAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Paragraph__ItalictextAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalMarkdownDSL

    // $ANTLR start synpred16_InternalMarkdownDSL
    public final void synpred16_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:1228:3: ( rule__Unordered__BoldtextAssignment_2 )
        // InternalMarkdownDSL.g:1228:3: rule__Unordered__BoldtextAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Unordered__BoldtextAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalMarkdownDSL

    // $ANTLR start synpred17_InternalMarkdownDSL
    public final void synpred17_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:1255:3: ( rule__Unordered__ItalictextAssignment_3 )
        // InternalMarkdownDSL.g:1255:3: rule__Unordered__ItalictextAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__Unordered__ItalictextAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalMarkdownDSL

    // $ANTLR start synpred19_InternalMarkdownDSL
    public final void synpred19_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:1363:3: ( rule__Ordered__BoldtextAssignment_2 )
        // InternalMarkdownDSL.g:1363:3: rule__Ordered__BoldtextAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Ordered__BoldtextAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalMarkdownDSL

    // $ANTLR start synpred20_InternalMarkdownDSL
    public final void synpred20_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:1390:3: ( rule__Ordered__ItalictextAssignment_3 )
        // InternalMarkdownDSL.g:1390:3: rule__Ordered__ItalictextAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__Ordered__ItalictextAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalMarkdownDSL

    // $ANTLR start synpred24_InternalMarkdownDSL
    public final void synpred24_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:1707:4: ( rule__Table__TbodyAssignment_4 )
        // InternalMarkdownDSL.g:1707:4: rule__Table__TbodyAssignment_4
        {
        pushFollow(FOLLOW_2);
        rule__Table__TbodyAssignment_4();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalMarkdownDSL

    // $ANTLR start synpred26_InternalMarkdownDSL
    public final void synpred26_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:1870:3: ( rule__Thr__BoldtextAssignment_2 )
        // InternalMarkdownDSL.g:1870:3: rule__Thr__BoldtextAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Thr__BoldtextAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalMarkdownDSL

    // $ANTLR start synpred27_InternalMarkdownDSL
    public final void synpred27_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:1897:3: ( rule__Thr__ItalictextAssignment_3 )
        // InternalMarkdownDSL.g:1897:3: rule__Thr__ItalictextAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__Thr__ItalictextAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalMarkdownDSL

    // $ANTLR start synpred29_InternalMarkdownDSL
    public final void synpred29_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:2005:3: ( rule__Tbody__BoldtextAssignment_2 )
        // InternalMarkdownDSL.g:2005:3: rule__Tbody__BoldtextAssignment_2
        {
        pushFollow(FOLLOW_2);
        rule__Tbody__BoldtextAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalMarkdownDSL

    // $ANTLR start synpred30_InternalMarkdownDSL
    public final void synpred30_InternalMarkdownDSL_fragment() throws RecognitionException {   
        // InternalMarkdownDSL.g:2032:3: ( rule__Tbody__ItalictextAssignment_3 )
        // InternalMarkdownDSL.g:2032:3: rule__Tbody__ItalictextAssignment_3
        {
        pushFollow(FOLLOW_2);
        rule__Tbody__ItalictextAssignment_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalMarkdownDSL

    // Delegated rules

    public final boolean synpred2_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalMarkdownDSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalMarkdownDSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\uffff\2\3\1\uffff\1\5\1\uffff\2\5\3\uffff\1\5\1\uffff\1\5\3\uffff";
    static final String dfa_3s = "\1\23\2\4\1\uffff\1\4\1\uffff\2\4\1\5\1\0\1\5\1\4\1\23\1\4\2\5\1\23";
    static final String dfa_4s = "\1\23\2\30\1\uffff\1\30\1\uffff\2\30\1\23\1\0\1\23\1\30\1\23\1\30\3\23";
    static final String dfa_5s = "\3\uffff\1\2\1\uffff\1\1\13\uffff";
    static final String dfa_6s = "\11\uffff\1\0\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\1\uffff\1\3\4\uffff\2\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\3\3",
            "\1\3\1\5\1\3\4\uffff\6\3\2\uffff\1\4\2\uffff\3\3",
            "",
            "\1\6\1\uffff\1\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\2\uffff\1\5\2\uffff\3\5",
            "",
            "\1\5\1\10\1\5\4\uffff\6\5\2\uffff\1\7\2\uffff\3\5",
            "\1\11\1\uffff\1\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\2\uffff\1\5\1\3\1\uffff\3\5",
            "\1\12\15\uffff\1\13",
            "\1\uffff",
            "\1\14\15\uffff\1\13",
            "\1\15\1\uffff\1\5\4\uffff\2\5\1\uffff\1\5\1\uffff\1\5\2\uffff\1\5\1\3\1\uffff\3\5",
            "\1\13",
            "\1\5\1\16\1\5\4\uffff\6\5\2\uffff\1\7\2\uffff\3\5",
            "\1\17\15\uffff\1\13",
            "\1\20\15\uffff\1\13",
            "\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 1707:3: ( rule__Table__TbodyAssignment_4 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_9 = input.LA(1);

                         
                        int index20_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_InternalMarkdownDSL()) ) {s = 5;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index20_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001C95852L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001812L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});

}