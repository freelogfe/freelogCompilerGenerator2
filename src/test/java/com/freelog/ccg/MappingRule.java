// Generated from src\test\java\com\freelog\ccg\MappingRule.g4 by ANTLR 4.8
package com.freelog.ccg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MappingRule extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, ALTER=2, ACTIVATE_THEME=3, AS=4, DO=5, END=6, SET_LABELS=7, REPLACE=8, 
		SHOW=9, HIDE=10, SET_TITLE=11, SET_COVER=12, ADD_ATTR=13, DELETE_ATTR=14, 
		WITH=15, UNDER=16, DOLLAR=17, AT=18, HASH=19, SLASH=20, GT=21, COMMA=22, 
		ID=23, STRING=24, WS=25, SEMVER=26;
	public static final int
		RULE_mapping_rule_section = 0, RULE_mapping_rule = 1, RULE_rule_add = 2, 
		RULE_rule_alter = 3, RULE_rule_activate_theme = 4, RULE_candidate = 5, 
		RULE_resource_name = 6, RULE_object_name = 7, RULE_action = 8, RULE_line_code = 9, 
		RULE_set_labels = 10, RULE_replace = 11, RULE_show = 12, RULE_hide = 13, 
		RULE_set_title = 14, RULE_set_cover = 15, RULE_add_attr = 16, RULE_delete_attr = 17, 
		RULE_scope = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"mapping_rule_section", "mapping_rule", "rule_add", "rule_alter", "rule_activate_theme", 
			"candidate", "resource_name", "object_name", "action", "line_code", "set_labels", 
			"replace", "show", "hide", "set_title", "set_cover", "add_attr", "delete_attr", 
			"scope"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'add'", "'alter'", "'activate_theme'", "'as'", "'do'", "'end'", 
			"'set_labels'", "'replace'", "'show'", "'hide'", "'set_title'", "'set_cover'", 
			"'add_attr'", "'delete_attr'", "'with'", "'under'", "'$'", "'@'", "'#'", 
			"'/'", "'>'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "ALTER", "ACTIVATE_THEME", "AS", "DO", "END", "SET_LABELS", 
			"REPLACE", "SHOW", "HIDE", "SET_TITLE", "SET_COVER", "ADD_ATTR", "DELETE_ATTR", 
			"WITH", "UNDER", "DOLLAR", "AT", "HASH", "SLASH", "GT", "COMMA", "ID", 
			"STRING", "WS", "SEMVER"
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
	public String getGrammarFileName() { return "MappingRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MappingRule(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Mapping_rule_sectionContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MappingRule.EOF, 0); }
		public List<Mapping_ruleContext> mapping_rule() {
			return getRuleContexts(Mapping_ruleContext.class);
		}
		public Mapping_ruleContext mapping_rule(int i) {
			return getRuleContext(Mapping_ruleContext.class,i);
		}
		public Mapping_rule_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping_rule_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterMapping_rule_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitMapping_rule_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitMapping_rule_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mapping_rule_sectionContext mapping_rule_section() throws RecognitionException {
		Mapping_rule_sectionContext _localctx = new Mapping_rule_sectionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mapping_rule_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALTER) | (1L << ACTIVATE_THEME))) != 0)) {
				{
				{
				setState(38);
				mapping_rule();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	public static class Mapping_ruleContext extends ParserRuleContext {
		public Rule_addContext rule_add() {
			return getRuleContext(Rule_addContext.class,0);
		}
		public Rule_alterContext rule_alter() {
			return getRuleContext(Rule_alterContext.class,0);
		}
		public Rule_activate_themeContext rule_activate_theme() {
			return getRuleContext(Rule_activate_themeContext.class,0);
		}
		public Mapping_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterMapping_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitMapping_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitMapping_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mapping_ruleContext mapping_rule() throws RecognitionException {
		Mapping_ruleContext _localctx = new Mapping_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapping_rule);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				rule_add();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				rule_alter();
				}
				break;
			case ACTIVATE_THEME:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				rule_activate_theme();
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

	public static class Rule_addContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(MappingRule.ADD, 0); }
		public CandidateContext candidate() {
			return getRuleContext(CandidateContext.class,0);
		}
		public TerminalNode AS() { return getToken(MappingRule.AS, 0); }
		public TerminalNode ID() { return getToken(MappingRule.ID, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public Rule_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterRule_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitRule_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitRule_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_addContext rule_add() throws RecognitionException {
		Rule_addContext _localctx = new Rule_addContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rule_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ADD);
			setState(52);
			candidate();
			setState(53);
			match(AS);
			setState(54);
			match(ID);
			setState(55);
			action();
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

	public static class Rule_alterContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(MappingRule.ALTER, 0); }
		public TerminalNode ID() { return getToken(MappingRule.ID, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public Rule_alterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_alter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterRule_alter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitRule_alter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitRule_alter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_alterContext rule_alter() throws RecognitionException {
		Rule_alterContext _localctx = new Rule_alterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rule_alter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ALTER);
			setState(58);
			match(ID);
			setState(59);
			action();
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

	public static class Rule_activate_themeContext extends ParserRuleContext {
		public TerminalNode ACTIVATE_THEME() { return getToken(MappingRule.ACTIVATE_THEME, 0); }
		public TerminalNode ID() { return getToken(MappingRule.ID, 0); }
		public Rule_activate_themeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_activate_theme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterRule_activate_theme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitRule_activate_theme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitRule_activate_theme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_activate_themeContext rule_activate_theme() throws RecognitionException {
		Rule_activate_themeContext _localctx = new Rule_activate_themeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rule_activate_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(ACTIVATE_THEME);
			setState(62);
			match(ID);
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

	public static class CandidateContext extends ParserRuleContext {
		public Resource_nameContext resource_name() {
			return getRuleContext(Resource_nameContext.class,0);
		}
		public Object_nameContext object_name() {
			return getRuleContext(Object_nameContext.class,0);
		}
		public CandidateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_candidate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterCandidate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitCandidate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitCandidate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CandidateContext candidate() throws RecognitionException {
		CandidateContext _localctx = new CandidateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_candidate);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				resource_name();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				object_name();
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

	public static class Resource_nameContext extends ParserRuleContext {
		public Token userName;
		public Token resourceName;
		public TerminalNode DOLLAR() { return getToken(MappingRule.DOLLAR, 0); }
		public TerminalNode SLASH() { return getToken(MappingRule.SLASH, 0); }
		public List<TerminalNode> ID() { return getTokens(MappingRule.ID); }
		public TerminalNode ID(int i) {
			return getToken(MappingRule.ID, i);
		}
		public TerminalNode AT() { return getToken(MappingRule.AT, 0); }
		public TerminalNode SEMVER() { return getToken(MappingRule.SEMVER, 0); }
		public Resource_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterResource_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitResource_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitResource_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_nameContext resource_name() throws RecognitionException {
		Resource_nameContext _localctx = new Resource_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_resource_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DOLLAR);
			setState(69);
			((Resource_nameContext)_localctx).userName = match(ID);
			setState(70);
			match(SLASH);
			setState(71);
			((Resource_nameContext)_localctx).resourceName = match(ID);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(72);
				match(AT);
				setState(73);
				match(SEMVER);
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

	public static class Object_nameContext extends ParserRuleContext {
		public Token bucketName;
		public Token objectName;
		public TerminalNode HASH() { return getToken(MappingRule.HASH, 0); }
		public TerminalNode SLASH() { return getToken(MappingRule.SLASH, 0); }
		public List<TerminalNode> ID() { return getTokens(MappingRule.ID); }
		public TerminalNode ID(int i) {
			return getToken(MappingRule.ID, i);
		}
		public Object_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterObject_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitObject_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitObject_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_nameContext object_name() throws RecognitionException {
		Object_nameContext _localctx = new Object_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_object_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(HASH);
			setState(77);
			((Object_nameContext)_localctx).bucketName = match(ID);
			setState(78);
			match(SLASH);
			setState(79);
			((Object_nameContext)_localctx).objectName = match(ID);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(MappingRule.DO, 0); }
		public TerminalNode END() { return getToken(MappingRule.END, 0); }
		public List<Line_codeContext> line_code() {
			return getRuleContexts(Line_codeContext.class);
		}
		public Line_codeContext line_code(int i) {
			return getRuleContext(Line_codeContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_action);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(DO);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET_LABELS) | (1L << REPLACE) | (1L << SHOW) | (1L << HIDE) | (1L << SET_TITLE) | (1L << SET_COVER) | (1L << ADD_ATTR) | (1L << DELETE_ATTR))) != 0)) {
					{
					{
					setState(82);
					line_code();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(END);
				}
				break;
			case SET_LABELS:
			case REPLACE:
			case SHOW:
			case HIDE:
			case SET_TITLE:
			case SET_COVER:
			case ADD_ATTR:
			case DELETE_ATTR:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				line_code();
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

	public static class Line_codeContext extends ParserRuleContext {
		public Set_labelsContext set_labels() {
			return getRuleContext(Set_labelsContext.class,0);
		}
		public ReplaceContext replace() {
			return getRuleContext(ReplaceContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public HideContext hide() {
			return getRuleContext(HideContext.class,0);
		}
		public Set_titleContext set_title() {
			return getRuleContext(Set_titleContext.class,0);
		}
		public Set_coverContext set_cover() {
			return getRuleContext(Set_coverContext.class,0);
		}
		public Add_attrContext add_attr() {
			return getRuleContext(Add_attrContext.class,0);
		}
		public Delete_attrContext delete_attr() {
			return getRuleContext(Delete_attrContext.class,0);
		}
		public Line_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterLine_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitLine_code(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitLine_code(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_codeContext line_code() throws RecognitionException {
		Line_codeContext _localctx = new Line_codeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line_code);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET_LABELS:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				set_labels();
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				replace();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				show();
				}
				break;
			case HIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				hide();
				}
				break;
			case SET_TITLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				set_title();
				}
				break;
			case SET_COVER:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				set_cover();
				}
				break;
			case ADD_ATTR:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				add_attr();
				}
				break;
			case DELETE_ATTR:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				delete_attr();
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

	public static class Set_labelsContext extends ParserRuleContext {
		public TerminalNode SET_LABELS() { return getToken(MappingRule.SET_LABELS, 0); }
		public List<TerminalNode> ID() { return getTokens(MappingRule.ID); }
		public TerminalNode ID(int i) {
			return getToken(MappingRule.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MappingRule.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MappingRule.COMMA, i);
		}
		public Set_labelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterSet_labels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitSet_labels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitSet_labels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_labelsContext set_labels() throws RecognitionException {
		Set_labelsContext _localctx = new Set_labelsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_set_labels);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(SET_LABELS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(SET_LABELS);
				setState(104);
				match(ID);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(105);
					match(COMMA);
					setState(106);
					match(ID);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class ReplaceContext extends ParserRuleContext {
		public CandidateContext target;
		public CandidateContext source;
		public TerminalNode REPLACE() { return getToken(MappingRule.REPLACE, 0); }
		public TerminalNode WITH() { return getToken(MappingRule.WITH, 0); }
		public List<CandidateContext> candidate() {
			return getRuleContexts(CandidateContext.class);
		}
		public CandidateContext candidate(int i) {
			return getRuleContext(CandidateContext.class,i);
		}
		public TerminalNode UNDER() { return getToken(MappingRule.UNDER, 0); }
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MappingRule.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MappingRule.COMMA, i);
		}
		public ReplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterReplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitReplace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitReplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceContext replace() throws RecognitionException {
		ReplaceContext _localctx = new ReplaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_replace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(REPLACE);
			setState(115);
			((ReplaceContext)_localctx).target = candidate();
			setState(116);
			match(WITH);
			setState(117);
			((ReplaceContext)_localctx).source = candidate();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(118);
				match(UNDER);
				setState(119);
				scope();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(120);
					match(COMMA);
					setState(121);
					scope();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(MappingRule.SHOW, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SHOW);
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

	public static class HideContext extends ParserRuleContext {
		public TerminalNode HIDE() { return getToken(MappingRule.HIDE, 0); }
		public HideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterHide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitHide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitHide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HideContext hide() throws RecognitionException {
		HideContext _localctx = new HideContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(HIDE);
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

	public static class Set_titleContext extends ParserRuleContext {
		public Token title;
		public TerminalNode SET_TITLE() { return getToken(MappingRule.SET_TITLE, 0); }
		public TerminalNode ID() { return getToken(MappingRule.ID, 0); }
		public Set_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterSet_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitSet_title(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitSet_title(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_titleContext set_title() throws RecognitionException {
		Set_titleContext _localctx = new Set_titleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_set_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SET_TITLE);
			setState(134);
			((Set_titleContext)_localctx).title = match(ID);
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

	public static class Set_coverContext extends ParserRuleContext {
		public Token cover;
		public TerminalNode SET_COVER() { return getToken(MappingRule.SET_COVER, 0); }
		public TerminalNode STRING() { return getToken(MappingRule.STRING, 0); }
		public Set_coverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_cover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterSet_cover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitSet_cover(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitSet_cover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_coverContext set_cover() throws RecognitionException {
		Set_coverContext _localctx = new Set_coverContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_set_cover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(SET_COVER);
			setState(137);
			((Set_coverContext)_localctx).cover = match(STRING);
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

	public static class Add_attrContext extends ParserRuleContext {
		public Token key;
		public Token value;
		public Token description;
		public TerminalNode ADD_ATTR() { return getToken(MappingRule.ADD_ATTR, 0); }
		public List<TerminalNode> ID() { return getTokens(MappingRule.ID); }
		public TerminalNode ID(int i) {
			return getToken(MappingRule.ID, i);
		}
		public Add_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterAdd_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitAdd_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitAdd_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_attrContext add_attr() throws RecognitionException {
		Add_attrContext _localctx = new Add_attrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_add_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ADD_ATTR);
			setState(140);
			((Add_attrContext)_localctx).key = match(ID);
			setState(141);
			((Add_attrContext)_localctx).value = match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(142);
				((Add_attrContext)_localctx).description = match(ID);
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

	public static class Delete_attrContext extends ParserRuleContext {
		public Token key;
		public TerminalNode DELETE_ATTR() { return getToken(MappingRule.DELETE_ATTR, 0); }
		public TerminalNode ID() { return getToken(MappingRule.ID, 0); }
		public Delete_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterDelete_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitDelete_attr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitDelete_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_attrContext delete_attr() throws RecognitionException {
		Delete_attrContext _localctx = new Delete_attrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delete_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DELETE_ATTR);
			setState(146);
			((Delete_attrContext)_localctx).key = match(ID);
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

	public static class ScopeContext extends ParserRuleContext {
		public List<CandidateContext> candidate() {
			return getRuleContexts(CandidateContext.class);
		}
		public CandidateContext candidate(int i) {
			return getRuleContext(CandidateContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(MappingRule.GT); }
		public TerminalNode GT(int i) {
			return getToken(MappingRule.GT, i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			candidate();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT) {
				{
				{
				setState(149);
				match(GT);
				setState(150);
				candidate();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u009f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\5\7E\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bM\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\7\nV\n\n\f\n\16\nY\13\n\3\n\3\n\5\n]\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13g\n\13\3\f\3\f\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13\f\5\f"+
		"s\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r}\n\r\f\r\16\r\u0080\13\r\5\r"+
		"\u0082\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\5\22\u0092\n\22\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u009a\n"+
		"\24\f\24\16\24\u009d\13\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\2\2\u009f\2+\3\2\2\2\4\63\3\2\2\2\6\65\3\2\2\2\b;\3\2\2"+
		"\2\n?\3\2\2\2\fD\3\2\2\2\16F\3\2\2\2\20N\3\2\2\2\22\\\3\2\2\2\24f\3\2"+
		"\2\2\26r\3\2\2\2\30t\3\2\2\2\32\u0083\3\2\2\2\34\u0085\3\2\2\2\36\u0087"+
		"\3\2\2\2 \u008a\3\2\2\2\"\u008d\3\2\2\2$\u0093\3\2\2\2&\u0096\3\2\2\2"+
		"(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2"+
		"./\7\2\2\3/\3\3\2\2\2\60\64\5\6\4\2\61\64\5\b\5\2\62\64\5\n\6\2\63\60"+
		"\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\5\3\2\2\2\65\66\7\3\2\2\66\67"+
		"\5\f\7\2\678\7\6\2\289\7\31\2\29:\5\22\n\2:\7\3\2\2\2;<\7\4\2\2<=\7\31"+
		"\2\2=>\5\22\n\2>\t\3\2\2\2?@\7\5\2\2@A\7\31\2\2A\13\3\2\2\2BE\5\16\b\2"+
		"CE\5\20\t\2DB\3\2\2\2DC\3\2\2\2E\r\3\2\2\2FG\7\23\2\2GH\7\31\2\2HI\7\26"+
		"\2\2IL\7\31\2\2JK\7\24\2\2KM\7\34\2\2LJ\3\2\2\2LM\3\2\2\2M\17\3\2\2\2"+
		"NO\7\25\2\2OP\7\31\2\2PQ\7\26\2\2QR\7\31\2\2R\21\3\2\2\2SW\7\7\2\2TV\5"+
		"\24\13\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z"+
		"]\7\b\2\2[]\5\24\13\2\\S\3\2\2\2\\[\3\2\2\2]\23\3\2\2\2^g\5\26\f\2_g\5"+
		"\30\r\2`g\5\32\16\2ag\5\34\17\2bg\5\36\20\2cg\5 \21\2dg\5\"\22\2eg\5$"+
		"\23\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3"+
		"\2\2\2fe\3\2\2\2g\25\3\2\2\2hs\7\t\2\2ij\7\t\2\2jo\7\31\2\2kl\7\30\2\2"+
		"ln\7\31\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2"+
		"\2rh\3\2\2\2ri\3\2\2\2s\27\3\2\2\2tu\7\n\2\2uv\5\f\7\2vw\7\21\2\2w\u0081"+
		"\5\f\7\2xy\7\22\2\2y~\5&\24\2z{\7\30\2\2{}\5&\24\2|z\3\2\2\2}\u0080\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081x"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083\u0084\7\13\2\2\u0084"+
		"\33\3\2\2\2\u0085\u0086\7\f\2\2\u0086\35\3\2\2\2\u0087\u0088\7\r\2\2\u0088"+
		"\u0089\7\31\2\2\u0089\37\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u008c\7\32"+
		"\2\2\u008c!\3\2\2\2\u008d\u008e\7\17\2\2\u008e\u008f\7\31\2\2\u008f\u0091"+
		"\7\31\2\2\u0090\u0092\7\31\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092#\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0095\7\31\2\2\u0095%\3\2\2"+
		"\2\u0096\u009b\5\f\7\2\u0097\u0098\7\27\2\2\u0098\u009a\5\f\7\2\u0099"+
		"\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\'\3\2\2\2\u009d\u009b\3\2\2\2\17+\63DLW\\for~\u0081\u0091\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}