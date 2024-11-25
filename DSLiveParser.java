// Generated from DSLive.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DSLiveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TOKEN=6, NEWLINE=7, WS=8;
	public static final int
		RULE_pilha = 0, RULE_funcao = 1, RULE_apagarPilha = 2, RULE_nome_pilha = 3, 
		RULE_push = 4, RULE_pop = 5, RULE_get_Top = 6, RULE_token = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"pilha", "funcao", "apagarPilha", "nome_pilha", "push", "pop", "get_Top", 
			"token"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Create'", "'Delete'", "'Push'", "'Pop'", "'Get_Top'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TOKEN", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DSLive.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSLiveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PilhaContext extends ParserRuleContext {
		public Nome_pilhaContext nome_pilha() {
			return getRuleContext(Nome_pilhaContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DSLiveParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(DSLiveParser.EOF, 0); }
		public List<FuncaoContext> funcao() {
			return getRuleContexts(FuncaoContext.class);
		}
		public FuncaoContext funcao(int i) {
			return getRuleContext(FuncaoContext.class,i);
		}
		public PilhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pilha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterPilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitPilha(this);
		}
	}

	public final PilhaContext pilha() throws RecognitionException {
		PilhaContext _localctx = new PilhaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pilha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			nome_pilha();
			setState(18);
			match(NEWLINE);
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				funcao();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) );
			setState(24);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public PushContext push() {
			return getRuleContext(PushContext.class,0);
		}
		public PopContext pop() {
			return getRuleContext(PopContext.class,0);
		}
		public Get_TopContext get_Top() {
			return getRuleContext(Get_TopContext.class,0);
		}
		public ApagarPilhaContext apagarPilha() {
			return getRuleContext(ApagarPilhaContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DSLiveParser.NEWLINE, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(26);
				push();
				}
				break;
			case T__3:
				{
				setState(27);
				pop();
				}
				break;
			case T__4:
				{
				setState(28);
				get_Top();
				}
				break;
			case T__1:
				{
				setState(29);
				apagarPilha();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(32);
				match(NEWLINE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ApagarPilhaContext extends ParserRuleContext {
		public Nome_pilhaContext nome_pilha() {
			return getRuleContext(Nome_pilhaContext.class,0);
		}
		public ApagarPilhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apagarPilha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterApagarPilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitApagarPilha(this);
		}
	}

	public final ApagarPilhaContext apagarPilha() throws RecognitionException {
		ApagarPilhaContext _localctx = new ApagarPilhaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_apagarPilha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__1);
			setState(36);
			nome_pilha();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nome_pilhaContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(DSLiveParser.TOKEN, 0); }
		public Nome_pilhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_pilha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterNome_pilha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitNome_pilha(this);
		}
	}

	public final Nome_pilhaContext nome_pilha() throws RecognitionException {
		Nome_pilhaContext _localctx = new Nome_pilhaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nome_pilha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PushContext extends ParserRuleContext {
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public PushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitPush(this);
		}
	}

	public final PushContext push() throws RecognitionException {
		PushContext _localctx = new PushContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__2);
			setState(41);
			token();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PopContext extends ParserRuleContext {
		public PopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterPop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitPop(this);
		}
	}

	public final PopContext pop() throws RecognitionException {
		PopContext _localctx = new PopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Get_TopContext extends ParserRuleContext {
		public Get_TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_Top; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterGet_Top(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitGet_Top(this);
		}
	}

	public final Get_TopContext get_Top() throws RecognitionException {
		Get_TopContext _localctx = new Get_TopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_get_Top);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TokenContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(DSLiveParser.TOKEN, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLiveListener ) ((DSLiveListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0003\u0001\""+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0000\u0000.\u0000\u0010\u0001\u0000\u0000\u0000\u0002"+
		"\u001e\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006&\u0001"+
		"\u0000\u0000\u0000\b(\u0001\u0000\u0000\u0000\n+\u0001\u0000\u0000\u0000"+
		"\f-\u0001\u0000\u0000\u0000\u000e/\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0005\u0001\u0000\u0000\u0011\u0012\u0003\u0006\u0003\u0000\u0012\u0014"+
		"\u0005\u0007\u0000\u0000\u0013\u0015\u0003\u0002\u0001\u0000\u0014\u0013"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u0001"+
		"\u0001\u0000\u0000\u0000\u001a\u001f\u0003\b\u0004\u0000\u001b\u001f\u0003"+
		"\n\u0005\u0000\u001c\u001f\u0003\f\u0006\u0000\u001d\u001f\u0003\u0004"+
		"\u0002\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001e\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \"\u0005\u0007\u0000\u0000"+
		"! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000"+
		"\u0000\u0000#$\u0005\u0002\u0000\u0000$%\u0003\u0006\u0003\u0000%\u0005"+
		"\u0001\u0000\u0000\u0000&\'\u0005\u0006\u0000\u0000\'\u0007\u0001\u0000"+
		"\u0000\u0000()\u0005\u0003\u0000\u0000)*\u0003\u000e\u0007\u0000*\t\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0004\u0000\u0000,\u000b\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0005\u0000\u0000.\r\u0001\u0000\u0000\u0000/0\u0005\u0006"+
		"\u0000\u00000\u000f\u0001\u0000\u0000\u0000\u0003\u0016\u001e!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}