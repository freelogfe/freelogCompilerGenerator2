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
		ID=23, STRING=24, COMMENT=25, COMMENT_LINE=26, WS=27, SEMVER=28;
	public static final int
		RULE_mapping_rule_section = 0, RULE_mapping_rule_part = 1, RULE_mapping_rule = 2, 
		RULE_comment_section = 3, RULE_rule_add = 4, RULE_rule_alter = 5, RULE_rule_activate_theme = 6, 
		RULE_candidate = 7, RULE_resource_name = 8, RULE_object_name = 9, RULE_action = 10, 
		RULE_line_code = 11, RULE_set_labels = 12, RULE_replace = 13, RULE_show = 14, 
		RULE_hide = 15, RULE_set_title = 16, RULE_set_cover = 17, RULE_add_attr = 18, 
		RULE_delete_attr = 19, RULE_scope = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"mapping_rule_section", "mapping_rule_part", "mapping_rule", "comment_section", 
			"rule_add", "rule_alter", "rule_activate_theme", "candidate", "resource_name", 
			"object_name", "action", "line_code", "set_labels", "replace", "show", 
			"hide", "set_title", "set_cover", "add_attr", "delete_attr", "scope"
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
			"STRING", "COMMENT", "COMMENT_LINE", "WS", "SEMVER"
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
		public List<Mapping_rule_partContext> mapping_rule_part() {
			return getRuleContexts(Mapping_rule_partContext.class);
		}
		public Mapping_rule_partContext mapping_rule_part(int i) {
			return getRuleContext(Mapping_rule_partContext.class,i);
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
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALTER) | (1L << ACTIVATE_THEME) | (1L << COMMENT) | (1L << COMMENT_LINE))) != 0)) {
				{
				{
				setState(42);
				mapping_rule_part();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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

	public static class Mapping_rule_partContext extends ParserRuleContext {
		public Mapping_ruleContext mapping_rule() {
			return getRuleContext(Mapping_ruleContext.class,0);
		}
		public List<Comment_sectionContext> comment_section() {
			return getRuleContexts(Comment_sectionContext.class);
		}
		public Comment_sectionContext comment_section(int i) {
			return getRuleContext(Comment_sectionContext.class,i);
		}
		public Mapping_rule_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping_rule_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterMapping_rule_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitMapping_rule_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitMapping_rule_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mapping_rule_partContext mapping_rule_part() throws RecognitionException {
		Mapping_rule_partContext _localctx = new Mapping_rule_partContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mapping_rule_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==COMMENT_LINE) {
				{
				{
				setState(50);
				comment_section();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			mapping_rule();
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
		enterRule(_localctx, 4, RULE_mapping_rule);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				rule_add();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				rule_alter();
				}
				break;
			case ACTIVATE_THEME:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
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

	public static class Comment_sectionContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(MappingRule.COMMENT, 0); }
		public TerminalNode COMMENT_LINE() { return getToken(MappingRule.COMMENT_LINE, 0); }
		public Comment_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterComment_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitComment_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitComment_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comment_sectionContext comment_section() throws RecognitionException {
		Comment_sectionContext _localctx = new Comment_sectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !(_la==COMMENT || _la==COMMENT_LINE) ) {
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
		enterRule(_localctx, 8, RULE_rule_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ADD);
			setState(66);
			candidate();
			setState(67);
			match(AS);
			setState(68);
			match(ID);
			setState(69);
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
		enterRule(_localctx, 10, RULE_rule_alter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ALTER);
			setState(72);
			match(ID);
			setState(73);
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
		enterRule(_localctx, 12, RULE_rule_activate_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ACTIVATE_THEME);
			setState(76);
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
		enterRule(_localctx, 14, RULE_candidate);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				resource_name();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
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
		enterRule(_localctx, 16, RULE_resource_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DOLLAR);
			setState(83);
			((Resource_nameContext)_localctx).userName = match(ID);
			setState(84);
			match(SLASH);
			setState(85);
			((Resource_nameContext)_localctx).resourceName = match(ID);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(86);
				match(AT);
				setState(87);
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
		enterRule(_localctx, 18, RULE_object_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(HASH);
			setState(91);
			((Object_nameContext)_localctx).bucketName = match(ID);
			setState(92);
			match(SLASH);
			setState(93);
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
		enterRule(_localctx, 20, RULE_action);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(DO);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET_LABELS) | (1L << REPLACE) | (1L << SHOW) | (1L << HIDE) | (1L << SET_TITLE) | (1L << SET_COVER) | (1L << ADD_ATTR) | (1L << DELETE_ATTR))) != 0)) {
					{
					{
					setState(96);
					line_code();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
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
				setState(103);
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
		enterRule(_localctx, 22, RULE_line_code);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET_LABELS:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				set_labels();
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				replace();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				show();
				}
				break;
			case HIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				hide();
				}
				break;
			case SET_TITLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				set_title();
				}
				break;
			case SET_COVER:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				set_cover();
				}
				break;
			case ADD_ATTR:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				add_attr();
				}
				break;
			case DELETE_ATTR:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
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
		enterRule(_localctx, 24, RULE_set_labels);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(SET_LABELS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(SET_LABELS);
				setState(118);
				match(ID);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(119);
					match(COMMA);
					setState(120);
					match(ID);
					}
					}
					setState(125);
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
		enterRule(_localctx, 26, RULE_replace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(REPLACE);
			setState(129);
			((ReplaceContext)_localctx).target = candidate();
			setState(130);
			match(WITH);
			setState(131);
			((ReplaceContext)_localctx).source = candidate();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(132);
				match(UNDER);
				setState(133);
				scope();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(134);
					match(COMMA);
					setState(135);
					scope();
					}
					}
					setState(140);
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
		enterRule(_localctx, 28, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		enterRule(_localctx, 30, RULE_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		public TerminalNode STRING() { return getToken(MappingRule.STRING, 0); }
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
		enterRule(_localctx, 32, RULE_set_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SET_TITLE);
			setState(148);
			((Set_titleContext)_localctx).title = match(STRING);
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
		enterRule(_localctx, 34, RULE_set_cover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(SET_COVER);
			setState(151);
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
		enterRule(_localctx, 36, RULE_add_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ADD_ATTR);
			setState(154);
			((Add_attrContext)_localctx).key = match(ID);
			setState(155);
			((Add_attrContext)_localctx).value = match(ID);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(156);
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
		enterRule(_localctx, 38, RULE_delete_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DELETE_ATTR);
			setState(160);
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
		enterRule(_localctx, 40, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			candidate();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT) {
				{
				{
				setState(163);
				match(GT);
				setState(164);
				candidate();
				}
				}
				setState(169);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\3\2\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\5\4@\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t"+
		"S\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\7\fd\n\f\f\f\16\fg\13\f\3\f\3\f\5\fk\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\ru\n\r\3\16\3\16\3\16\3\16\3\16\7\16|\n\16\f\16\16\16\177\13"+
		"\16\5\16\u0081\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u008b"+
		"\n\17\f\17\16\17\u008e\13\17\5\17\u0090\n\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00a0\n\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\7\26\u00a8\n\26\f\26\16\26\u00ab\13\26\3\26\2\2\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3\3\2\33\34\2\u00ac\2"+
		"/\3\2\2\2\4\67\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nC\3\2\2\2\fI\3\2\2\2\16"+
		"M\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24\\\3\2\2\2\26j\3\2\2\2\30t\3\2\2\2"+
		"\32\u0080\3\2\2\2\34\u0082\3\2\2\2\36\u0091\3\2\2\2 \u0093\3\2\2\2\"\u0095"+
		"\3\2\2\2$\u0098\3\2\2\2&\u009b\3\2\2\2(\u00a1\3\2\2\2*\u00a4\3\2\2\2,"+
		".\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61"+
		"/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3"+
		"\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\5\6\4\2;\5\3"+
		"\2\2\2<@\5\n\6\2=@\5\f\7\2>@\5\16\b\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7"+
		"\3\2\2\2AB\t\2\2\2B\t\3\2\2\2CD\7\3\2\2DE\5\20\t\2EF\7\6\2\2FG\7\31\2"+
		"\2GH\5\26\f\2H\13\3\2\2\2IJ\7\4\2\2JK\7\31\2\2KL\5\26\f\2L\r\3\2\2\2M"+
		"N\7\5\2\2NO\7\31\2\2O\17\3\2\2\2PS\5\22\n\2QS\5\24\13\2RP\3\2\2\2RQ\3"+
		"\2\2\2S\21\3\2\2\2TU\7\23\2\2UV\7\31\2\2VW\7\26\2\2WZ\7\31\2\2XY\7\24"+
		"\2\2Y[\7\36\2\2ZX\3\2\2\2Z[\3\2\2\2[\23\3\2\2\2\\]\7\25\2\2]^\7\31\2\2"+
		"^_\7\26\2\2_`\7\31\2\2`\25\3\2\2\2ae\7\7\2\2bd\5\30\r\2cb\3\2\2\2dg\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hk\7\b\2\2ik\5\30\r\2ja"+
		"\3\2\2\2ji\3\2\2\2k\27\3\2\2\2lu\5\32\16\2mu\5\34\17\2nu\5\36\20\2ou\5"+
		" \21\2pu\5\"\22\2qu\5$\23\2ru\5&\24\2su\5(\25\2tl\3\2\2\2tm\3\2\2\2tn"+
		"\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\31\3\2\2\2"+
		"v\u0081\7\t\2\2wx\7\t\2\2x}\7\31\2\2yz\7\30\2\2z|\7\31\2\2{y\3\2\2\2|"+
		"\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080v\3"+
		"\2\2\2\u0080w\3\2\2\2\u0081\33\3\2\2\2\u0082\u0083\7\n\2\2\u0083\u0084"+
		"\5\20\t\2\u0084\u0085\7\21\2\2\u0085\u008f\5\20\t\2\u0086\u0087\7\22\2"+
		"\2\u0087\u008c\5*\26\2\u0088\u0089\7\30\2\2\u0089\u008b\5*\26\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0086\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\35\3\2\2\2\u0091\u0092\7\13\2\2\u0092\37\3\2\2\2"+
		"\u0093\u0094\7\f\2\2\u0094!\3\2\2\2\u0095\u0096\7\r\2\2\u0096\u0097\7"+
		"\32\2\2\u0097#\3\2\2\2\u0098\u0099\7\16\2\2\u0099\u009a\7\32\2\2\u009a"+
		"%\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\7\31\2\2\u009d\u009f\7\31\2"+
		"\2\u009e\u00a0\7\31\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\'\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\7\31\2\2\u00a3)\3\2\2\2\u00a4"+
		"\u00a9\5\20\t\2\u00a5\u00a6\7\27\2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"+\3\2\2\2\u00ab\u00a9\3\2\2\2\20/\67?RZejt}\u0080\u008c\u008f\u009f\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}