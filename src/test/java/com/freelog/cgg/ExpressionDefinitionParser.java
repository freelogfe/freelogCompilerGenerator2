// Generated from src\test\java\com\freelog\cgg\ExpressionDefinition.g4 by ANTLR 4.8
package com.freelog.cgg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionDefinitionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SCIENTIFIC_NUMBER=3, VARIABLE_CONTRACT=4, VARIABLE_CONTRACT_ATTRIBUTE=5, 
		PI=6, EULER=7, COMMA=8, LPAREN=9, RPAREN=10, PLUS=11, MINUS=12, TIMES=13, 
		DIV=14, POW=15, ID=16, NEWLINE=17;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expression = 2, RULE_signedAtom = 3, 
		RULE_built_in_function = 4, RULE_funcname = 5, RULE_atom = 6, RULE_scientific = 7, 
		RULE_constant = 8, RULE_variable = 9, RULE_environment_variable = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expression", "signedAtom", "built_in_function", "funcname", 
			"atom", "scientific", "constant", "variable", "environment_variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'sum'", "'avg'", null, null, "'exhibited'", "'pi'", "'e'", "','", 
			"'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SCIENTIFIC_NUMBER", "VARIABLE_CONTRACT", "VARIABLE_CONTRACT_ATTRIBUTE", 
			"PI", "EULER", "COMMA", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", 
			"DIV", "POW", "ID", "NEWLINE"
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
	public String getGrammarFileName() { return "ExpressionDefinition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionDefinitionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExpressionDefinitionParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				stat();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << SCIENTIFIC_NUMBER) | (1L << VARIABLE_CONTRACT) | (1L << PI) | (1L << EULER) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << ID) | (1L << NEWLINE))) != 0) );
			setState(27);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(ExpressionDefinitionParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case SCIENTIFIC_NUMBER:
			case VARIABLE_CONTRACT:
			case PI:
			case EULER:
			case LPAREN:
			case PLUS:
			case MINUS:
			case ID:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				expression(0);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalculateSignContext extends ExpressionContext {
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public CalculateSignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterCalculateSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitCalculateSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitCalculateSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculatePluContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ExpressionDefinitionParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExpressionDefinitionParser.MINUS, 0); }
		public CalculatePluContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterCalculatePlu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitCalculatePlu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitCalculatePlu(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculatePowContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode POW() { return getToken(ExpressionDefinitionParser.POW, 0); }
		public CalculatePowContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterCalculatePow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitCalculatePow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitCalculatePow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculateTimContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES() { return getToken(ExpressionDefinitionParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ExpressionDefinitionParser.DIV, 0); }
		public CalculateTimContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterCalculateTim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitCalculateTim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitCalculateTim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CalculateSignContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(34);
			signedAtom();
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new CalculatePowContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(37);
						((CalculatePowContext)_localctx).op = match(POW);
						setState(38);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new CalculateTimContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(39);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(40);
						((CalculateTimContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
							((CalculateTimContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new CalculatePluContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(42);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(43);
						((CalculatePluContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((CalculatePluContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(44);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SignedAtomContext extends ParserRuleContext {
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
	 
		public SignedAtomContext() { }
		public void copyFrom(SignedAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Signed4FunctionContext extends SignedAtomContext {
		public Built_in_functionContext built_in_function() {
			return getRuleContext(Built_in_functionContext.class,0);
		}
		public Signed4FunctionContext(SignedAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterSigned4Function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitSigned4Function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitSigned4Function(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Signed4AtomContext extends SignedAtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Signed4AtomContext(SignedAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterSigned4Atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitSigned4Atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitSigned4Atom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Signed4SelfContext extends SignedAtomContext {
		public Token op;
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(ExpressionDefinitionParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ExpressionDefinitionParser.MINUS, 0); }
		public Signed4SelfContext(SignedAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterSigned4Self(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitSigned4Self(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitSigned4Self(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signedAtom);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				_localctx = new Signed4SelfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				((Signed4SelfContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((Signed4SelfContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(51);
				signedAtom();
				}
				break;
			case T__0:
			case T__1:
				_localctx = new Signed4FunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				built_in_function();
				}
				break;
			case SCIENTIFIC_NUMBER:
			case VARIABLE_CONTRACT:
			case PI:
			case EULER:
			case LPAREN:
			case ID:
				_localctx = new Signed4AtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Built_in_functionContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> args = new ArrayList<ExpressionContext>();
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ExpressionDefinitionParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ExpressionDefinitionParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpressionDefinitionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpressionDefinitionParser.COMMA, i);
		}
		public Built_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_built_in_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterBuilt_in_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitBuilt_in_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitBuilt_in_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Built_in_functionContext built_in_function() throws RecognitionException {
		Built_in_functionContext _localctx = new Built_in_functionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_built_in_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			funcname();
			setState(57);
			match(LPAREN);
			setState(58);
			((Built_in_functionContext)_localctx).expression = expression(0);
			((Built_in_functionContext)_localctx).args.add(((Built_in_functionContext)_localctx).expression);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				((Built_in_functionContext)_localctx).expression = expression(0);
				((Built_in_functionContext)_localctx).args.add(((Built_in_functionContext)_localctx).expression);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(RPAREN);
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

	public static class FuncnameContext extends ParserRuleContext {
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atom4ScientificContext extends AtomContext {
		public ScientificContext scientific() {
			return getRuleContext(ScientificContext.class,0);
		}
		public Atom4ScientificContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterAtom4Scientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitAtom4Scientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitAtom4Scientific(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom4VariableContext extends AtomContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Atom4VariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterAtom4Variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitAtom4Variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitAtom4Variable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom4ConstantContext extends AtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Atom4ConstantContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterAtom4Constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitAtom4Constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitAtom4Constant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom4ExpressionContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(ExpressionDefinitionParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExpressionDefinitionParser.RPAREN, 0); }
		public Atom4ExpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterAtom4Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitAtom4Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitAtom4Expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCIENTIFIC_NUMBER:
				_localctx = new Atom4ScientificContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				scientific();
				}
				break;
			case PI:
			case EULER:
				_localctx = new Atom4ConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				constant();
				}
				break;
			case LPAREN:
				_localctx = new Atom4ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(LPAREN);
				setState(73);
				expression(0);
				setState(74);
				match(RPAREN);
				}
				break;
			case VARIABLE_CONTRACT:
			case ID:
				_localctx = new Atom4VariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ScientificContext extends ParserRuleContext {
		public TerminalNode SCIENTIFIC_NUMBER() { return getToken(ExpressionDefinitionParser.SCIENTIFIC_NUMBER, 0); }
		public ScientificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterScientific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitScientific(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitScientific(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScientificContext scientific() throws RecognitionException {
		ScientificContext _localctx = new ScientificContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scientific);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(SCIENTIFIC_NUMBER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(ExpressionDefinitionParser.PI, 0); }
		public TerminalNode EULER() { return getToken(ExpressionDefinitionParser.EULER, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==PI || _la==EULER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableEnvironmentContext extends VariableContext {
		public Environment_variableContext environment_variable() {
			return getRuleContext(Environment_variableContext.class,0);
		}
		public VariableEnvironmentContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterVariableEnvironment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitVariableEnvironment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitVariableEnvironment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableArgContext extends VariableContext {
		public TerminalNode ID() { return getToken(ExpressionDefinitionParser.ID, 0); }
		public VariableArgContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterVariableArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitVariableArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitVariableArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_CONTRACT:
				_localctx = new VariableEnvironmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				environment_variable();
				}
				break;
			case ID:
				_localctx = new VariableArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Environment_variableContext extends ParserRuleContext {
		public TerminalNode VARIABLE_CONTRACT() { return getToken(ExpressionDefinitionParser.VARIABLE_CONTRACT, 0); }
		public Environment_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environment_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).enterEnvironment_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionDefinitionListener ) ((ExpressionDefinitionListener)listener).exitEnvironment_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionDefinitionVisitor ) return ((ExpressionDefinitionVisitor<? extends T>)visitor).visitEnvironment_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Environment_variableContext environment_variable() throws RecognitionException {
		Environment_variableContext _localctx = new Environment_variableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_environment_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(VARIABLE_CONTRACT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\\\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13\4\3"+
		"\5\3\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\5\13X\n\13\3\f\3\f\3\f\2\3\6\r\2\4\6\b\n\f\16\20\22\24\26\2\6"+
		"\3\2\17\20\3\2\r\16\3\2\3\4\3\2\b\t\2\\\2\31\3\2\2\2\4!\3\2\2\2\6#\3\2"+
		"\2\2\b8\3\2\2\2\n:\3\2\2\2\fF\3\2\2\2\16O\3\2\2\2\20Q\3\2\2\2\22S\3\2"+
		"\2\2\24W\3\2\2\2\26Y\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2"+
		"\37\"\5\6\4\2 \"\7\23\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\b\4\1\2"+
		"$%\5\b\5\2%\61\3\2\2\2&\'\f\6\2\2\'(\7\21\2\2(\60\5\6\4\7)*\f\5\2\2*+"+
		"\t\2\2\2+\60\5\6\4\6,-\f\4\2\2-.\t\3\2\2.\60\5\6\4\5/&\3\2\2\2/)\3\2\2"+
		"\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\7\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\t\3\2\2\659\5\b\5\2\669\5\n\6\2\679\5\16\b\28\64\3\2\2"+
		"\28\66\3\2\2\28\67\3\2\2\29\t\3\2\2\2:;\5\f\7\2;<\7\13\2\2<A\5\6\4\2="+
		">\7\n\2\2>@\5\6\4\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\f\2\2E\13\3\2\2\2FG\t\4\2\2G\r\3\2\2\2HP\5\20\t\2IP\5\22"+
		"\n\2JK\7\13\2\2KL\5\6\4\2LM\7\f\2\2MP\3\2\2\2NP\5\24\13\2OH\3\2\2\2OI"+
		"\3\2\2\2OJ\3\2\2\2ON\3\2\2\2P\17\3\2\2\2QR\7\5\2\2R\21\3\2\2\2ST\t\5\2"+
		"\2T\23\3\2\2\2UX\5\26\f\2VX\7\22\2\2WU\3\2\2\2WV\3\2\2\2X\25\3\2\2\2Y"+
		"Z\7\6\2\2Z\27\3\2\2\2\n\33!/\618AOW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}