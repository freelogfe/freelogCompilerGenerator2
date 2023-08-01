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
		ADD_RELY=15, DELETE_RELY=16, WITH=17, UNDER=18, TO=19, FROM=20, DOLLAR=21, 
		AT=22, HASH=23, SLASH=24, GT=25, SEPARATOR=26, ID=27, STRING=28, COMMENT=29, 
		COMMENT_LINE=30, WS=31, SEMVER=32;
	public static final int
		RULE_mapping_rule_section = 0, RULE_mapping_rule = 1, RULE_comment_section = 2, 
		RULE_rule_add = 3, RULE_rule_alter = 4, RULE_rule_activate_theme = 5, 
		RULE_rule_comment_section = 6, RULE_candidate = 7, RULE_resource_name = 8, 
		RULE_object_name = 9, RULE_action = 10, RULE_line_code = 11, RULE_set_labels = 12, 
		RULE_replace = 13, RULE_show = 14, RULE_hide = 15, RULE_set_title = 16, 
		RULE_set_cover = 17, RULE_add_attr = 18, RULE_delete_attr = 19, RULE_add_rely = 20, 
		RULE_delete_rely = 21, RULE_line_code_comment_section = 22, RULE_scope = 23, 
		RULE_rely_target = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"mapping_rule_section", "mapping_rule", "comment_section", "rule_add", 
			"rule_alter", "rule_activate_theme", "rule_comment_section", "candidate", 
			"resource_name", "object_name", "action", "line_code", "set_labels", 
			"replace", "show", "hide", "set_title", "set_cover", "add_attr", "delete_attr", 
			"add_rely", "delete_rely", "line_code_comment_section", "scope", "rely_target"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'add'", "'alter'", "'activate_theme'", "'as'", "'do'", "'end'", 
			"'set_labels'", "'replace'", "'show'", "'hide'", "'set_title'", "'set_cover'", 
			"'add_attr'", "'delete_attr'", "'add_rely'", "'delete_rely'", "'with'", 
			"'under'", "'to'", "'from'", "'$'", "'@'", "'#'", "'/'", "'>'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "ALTER", "ACTIVATE_THEME", "AS", "DO", "END", "SET_LABELS", 
			"REPLACE", "SHOW", "HIDE", "SET_TITLE", "SET_COVER", "ADD_ATTR", "DELETE_ATTR", 
			"ADD_RELY", "DELETE_RELY", "WITH", "UNDER", "TO", "FROM", "DOLLAR", "AT", 
			"HASH", "SLASH", "GT", "SEPARATOR", "ID", "STRING", "COMMENT", "COMMENT_LINE", 
			"WS", "SEMVER"
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
		public List<Mapping_ruleContext> mapping_rule() {
			return getRuleContexts(Mapping_ruleContext.class);
		}
		public Mapping_ruleContext mapping_rule(int i) {
			return getRuleContext(Mapping_ruleContext.class,i);
		}
		public TerminalNode EOF() { return getToken(MappingRule.EOF, 0); }
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ALTER) | (1L << ACTIVATE_THEME) | (1L << COMMENT) | (1L << COMMENT_LINE))) != 0)) {
				{
				{
				setState(50);
				mapping_rule();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(56);
				match(EOF);
				}
				break;
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
		public Rule_comment_sectionContext rule_comment_section() {
			return getRuleContext(Rule_comment_sectionContext.class,0);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				rule_add();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				rule_alter();
				}
				break;
			case ACTIVATE_THEME:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				rule_activate_theme();
				}
				break;
			case COMMENT:
			case COMMENT_LINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				rule_comment_section();
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
		enterRule(_localctx, 4, RULE_comment_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
		enterRule(_localctx, 6, RULE_rule_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ADD);
			setState(68);
			candidate();
			setState(69);
			match(AS);
			setState(70);
			match(ID);
			setState(71);
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
		enterRule(_localctx, 8, RULE_rule_alter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ALTER);
			setState(74);
			match(ID);
			setState(75);
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
		enterRule(_localctx, 10, RULE_rule_activate_theme);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ACTIVATE_THEME);
			setState(78);
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

	public static class Rule_comment_sectionContext extends ParserRuleContext {
		public Comment_sectionContext comment_section() {
			return getRuleContext(Comment_sectionContext.class,0);
		}
		public Rule_comment_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_comment_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterRule_comment_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitRule_comment_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitRule_comment_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_comment_sectionContext rule_comment_section() throws RecognitionException {
		Rule_comment_sectionContext _localctx = new Rule_comment_sectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rule_comment_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			comment_section();
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				resource_name();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
			setState(86);
			match(DOLLAR);
			setState(87);
			((Resource_nameContext)_localctx).userName = match(ID);
			setState(88);
			match(SLASH);
			setState(89);
			((Resource_nameContext)_localctx).resourceName = match(ID);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(90);
				match(AT);
				setState(91);
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
			setState(94);
			match(HASH);
			setState(95);
			((Object_nameContext)_localctx).bucketName = match(ID);
			setState(96);
			match(SLASH);
			setState(97);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(DO);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET_LABELS) | (1L << REPLACE) | (1L << SHOW) | (1L << HIDE) | (1L << SET_TITLE) | (1L << SET_COVER) | (1L << ADD_ATTR) | (1L << DELETE_ATTR) | (1L << ADD_RELY) | (1L << DELETE_RELY) | (1L << COMMENT) | (1L << COMMENT_LINE))) != 0)) {
					{
					{
					setState(100);
					line_code();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
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
			case ADD_RELY:
			case DELETE_RELY:
			case COMMENT:
			case COMMENT_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
		public Add_relyContext add_rely() {
			return getRuleContext(Add_relyContext.class,0);
		}
		public Delete_relyContext delete_rely() {
			return getRuleContext(Delete_relyContext.class,0);
		}
		public Line_code_comment_sectionContext line_code_comment_section() {
			return getRuleContext(Line_code_comment_sectionContext.class,0);
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
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET_LABELS:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				set_labels();
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				replace();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				show();
				}
				break;
			case HIDE:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				hide();
				}
				break;
			case SET_TITLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				set_title();
				}
				break;
			case SET_COVER:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				set_cover();
				}
				break;
			case ADD_ATTR:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				add_attr();
				}
				break;
			case DELETE_ATTR:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				delete_attr();
				}
				break;
			case ADD_RELY:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				add_rely();
				}
				break;
			case DELETE_RELY:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				delete_rely();
				}
				break;
			case COMMENT:
			case COMMENT_LINE:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				line_code_comment_section();
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
		public List<TerminalNode> SEPARATOR() { return getTokens(MappingRule.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(MappingRule.SEPARATOR, i);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(SET_LABELS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(SET_LABELS);
				setState(125);
				match(ID);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(126);
					match(SEPARATOR);
					setState(127);
					match(ID);
					}
					}
					setState(132);
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
		public List<TerminalNode> SEPARATOR() { return getTokens(MappingRule.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(MappingRule.SEPARATOR, i);
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
			setState(135);
			match(REPLACE);
			setState(136);
			((ReplaceContext)_localctx).target = candidate();
			setState(137);
			match(WITH);
			setState(138);
			((ReplaceContext)_localctx).source = candidate();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDER) {
				{
				setState(139);
				match(UNDER);
				setState(140);
				scope();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARATOR) {
					{
					{
					setState(141);
					match(SEPARATOR);
					setState(142);
					scope();
					}
					}
					setState(147);
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
			setState(150);
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
			setState(152);
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
			setState(154);
			match(SET_TITLE);
			setState(155);
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
			setState(157);
			match(SET_COVER);
			setState(158);
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
		public List<TerminalNode> STRING() { return getTokens(MappingRule.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MappingRule.STRING, i);
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
			setState(160);
			match(ADD_ATTR);
			setState(161);
			((Add_attrContext)_localctx).key = match(STRING);
			setState(162);
			((Add_attrContext)_localctx).value = match(STRING);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(163);
				((Add_attrContext)_localctx).description = match(STRING);
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
		public TerminalNode STRING() { return getToken(MappingRule.STRING, 0); }
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
			setState(166);
			match(DELETE_ATTR);
			setState(167);
			((Delete_attrContext)_localctx).key = match(STRING);
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

	public static class Add_relyContext extends ParserRuleContext {
		public TerminalNode ADD_RELY() { return getToken(MappingRule.ADD_RELY, 0); }
		public List<CandidateContext> candidate() {
			return getRuleContexts(CandidateContext.class);
		}
		public CandidateContext candidate(int i) {
			return getRuleContext(CandidateContext.class,i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(MappingRule.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(MappingRule.SEPARATOR, i);
		}
		public TerminalNode TO() { return getToken(MappingRule.TO, 0); }
		public Rely_targetContext rely_target() {
			return getRuleContext(Rely_targetContext.class,0);
		}
		public Add_relyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_rely; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterAdd_rely(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitAdd_rely(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitAdd_rely(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_relyContext add_rely() throws RecognitionException {
		Add_relyContext _localctx = new Add_relyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_add_rely);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ADD_RELY);
			setState(170);
			candidate();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(171);
				match(SEPARATOR);
				setState(172);
				candidate();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(178);
				match(TO);
				setState(179);
				rely_target();
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

	public static class Delete_relyContext extends ParserRuleContext {
		public TerminalNode DELETE_RELY() { return getToken(MappingRule.DELETE_RELY, 0); }
		public List<CandidateContext> candidate() {
			return getRuleContexts(CandidateContext.class);
		}
		public CandidateContext candidate(int i) {
			return getRuleContext(CandidateContext.class,i);
		}
		public List<TerminalNode> SEPARATOR() { return getTokens(MappingRule.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(MappingRule.SEPARATOR, i);
		}
		public TerminalNode FROM() { return getToken(MappingRule.FROM, 0); }
		public Rely_targetContext rely_target() {
			return getRuleContext(Rely_targetContext.class,0);
		}
		public Delete_relyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_rely; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterDelete_rely(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitDelete_rely(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitDelete_rely(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_relyContext delete_rely() throws RecognitionException {
		Delete_relyContext _localctx = new Delete_relyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_delete_rely);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(DELETE_RELY);
			setState(183);
			candidate();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARATOR) {
				{
				{
				setState(184);
				match(SEPARATOR);
				setState(185);
				candidate();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(191);
				match(FROM);
				setState(192);
				rely_target();
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

	public static class Line_code_comment_sectionContext extends ParserRuleContext {
		public Comment_sectionContext comment_section() {
			return getRuleContext(Comment_sectionContext.class,0);
		}
		public Line_code_comment_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_code_comment_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterLine_code_comment_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitLine_code_comment_section(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitLine_code_comment_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_code_comment_sectionContext line_code_comment_section() throws RecognitionException {
		Line_code_comment_sectionContext _localctx = new Line_code_comment_sectionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_line_code_comment_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			comment_section();
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
		enterRule(_localctx, 46, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			candidate();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT) {
				{
				{
				setState(198);
				match(GT);
				setState(199);
				candidate();
				}
				}
				setState(204);
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

	public static class Rely_targetContext extends ParserRuleContext {
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
		public Rely_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rely_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).enterRely_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MappingRuleListener ) ((MappingRuleListener)listener).exitRely_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MappingRuleVisitor ) return ((MappingRuleVisitor<? extends T>)visitor).visitRely_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rely_targetContext rely_target() throws RecognitionException {
		Rely_targetContext _localctx = new Rely_targetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rely_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			candidate();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT) {
				{
				{
				setState(206);
				match(GT);
				setState(207);
				candidate();
				}
				}
				setState(212);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\5\2<\n\2\3\3\3\3\3\3\3\3"+
		"\5\3B\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\5\tW\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n_\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\f\3\f\5\fo\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0083\n\16\f\16\16\16\u0086\13\16\5\16\u0088\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u0092\n\17\f\17\16\17\u0095\13\17\5\17"+
		"\u0097\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\5\24\u00a7\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00b0"+
		"\n\26\f\26\16\26\u00b3\13\26\3\26\3\26\5\26\u00b7\n\26\3\27\3\27\3\27"+
		"\3\27\7\27\u00bd\n\27\f\27\16\27\u00c0\13\27\3\27\3\27\5\27\u00c4\n\27"+
		"\3\30\3\30\3\31\3\31\3\31\7\31\u00cb\n\31\f\31\16\31\u00ce\13\31\3\32"+
		"\3\32\3\32\7\32\u00d3\n\32\f\32\16\32\u00d6\13\32\3\32\2\2\33\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\2\37 \2\u00dc\2\67"+
		"\3\2\2\2\4A\3\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nK\3\2\2\2\fO\3\2\2\2\16R\3"+
		"\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24`\3\2\2\2\26n\3\2\2\2\30{\3\2\2\2\32"+
		"\u0087\3\2\2\2\34\u0089\3\2\2\2\36\u0098\3\2\2\2 \u009a\3\2\2\2\"\u009c"+
		"\3\2\2\2$\u009f\3\2\2\2&\u00a2\3\2\2\2(\u00a8\3\2\2\2*\u00ab\3\2\2\2,"+
		"\u00b8\3\2\2\2.\u00c5\3\2\2\2\60\u00c7\3\2\2\2\62\u00cf\3\2\2\2\64\66"+
		"\5\4\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\2:<\7\2\2\3;:\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=B\5\b\5\2>B\5\n"+
		"\6\2?B\5\f\7\2@B\5\16\b\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\5\3"+
		"\2\2\2CD\t\2\2\2D\7\3\2\2\2EF\7\3\2\2FG\5\20\t\2GH\7\6\2\2HI\7\35\2\2"+
		"IJ\5\26\f\2J\t\3\2\2\2KL\7\4\2\2LM\7\35\2\2MN\5\26\f\2N\13\3\2\2\2OP\7"+
		"\5\2\2PQ\7\35\2\2Q\r\3\2\2\2RS\5\6\4\2S\17\3\2\2\2TW\5\22\n\2UW\5\24\13"+
		"\2VT\3\2\2\2VU\3\2\2\2W\21\3\2\2\2XY\7\27\2\2YZ\7\35\2\2Z[\7\32\2\2[^"+
		"\7\35\2\2\\]\7\30\2\2]_\7\"\2\2^\\\3\2\2\2^_\3\2\2\2_\23\3\2\2\2`a\7\31"+
		"\2\2ab\7\35\2\2bc\7\32\2\2cd\7\35\2\2d\25\3\2\2\2ei\7\7\2\2fh\5\30\r\2"+
		"gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lo\7\b\2\2"+
		"mo\5\30\r\2ne\3\2\2\2nm\3\2\2\2o\27\3\2\2\2p|\5\32\16\2q|\5\34\17\2r|"+
		"\5\36\20\2s|\5 \21\2t|\5\"\22\2u|\5$\23\2v|\5&\24\2w|\5(\25\2x|\5*\26"+
		"\2y|\5,\27\2z|\5.\30\2{p\3\2\2\2{q\3\2\2\2{r\3\2\2\2{s\3\2\2\2{t\3\2\2"+
		"\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\31\3\2"+
		"\2\2}\u0088\7\t\2\2~\177\7\t\2\2\177\u0084\7\35\2\2\u0080\u0081\7\34\2"+
		"\2\u0081\u0083\7\35\2\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087}\3\2\2\2\u0087~\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a\7\n\2"+
		"\2\u008a\u008b\5\20\t\2\u008b\u008c\7\23\2\2\u008c\u0096\5\20\t\2\u008d"+
		"\u008e\7\24\2\2\u008e\u0093\5\60\31\2\u008f\u0090\7\34\2\2\u0090\u0092"+
		"\5\60\31\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u008d"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\35\3\2\2\2\u0098\u0099\7\13\2\2\u0099"+
		"\37\3\2\2\2\u009a\u009b\7\f\2\2\u009b!\3\2\2\2\u009c\u009d\7\r\2\2\u009d"+
		"\u009e\7\36\2\2\u009e#\3\2\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\7\36\2"+
		"\2\u00a1%\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\7\36\2\2\u00a4\u00a6"+
		"\7\36\2\2\u00a5\u00a7\7\36\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\'\3\2\2\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa\7\36\2\2\u00aa)\3\2"+
		"\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00b1\5\20\t\2\u00ad\u00ae\7\34\2\2\u00ae"+
		"\u00b0\5\20\t\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7\25\2\2\u00b5\u00b7\5\62\32\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7+\3\2\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00be\5\20\t\2\u00ba"+
		"\u00bb\7\34\2\2\u00bb\u00bd\5\20\t\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00c4\5\62\32\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4-\3\2\2\2\u00c5\u00c6\5\6\4\2\u00c6"+
		"/\3\2\2\2\u00c7\u00cc\5\20\t\2\u00c8\u00c9\7\33\2\2\u00c9\u00cb\5\20\t"+
		"\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\61\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d4\5\20\t\2\u00d0"+
		"\u00d1\7\33\2\2\u00d1\u00d3\5\20\t\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\63\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\25\67;AV^in{\u0084\u0087\u0093\u0096\u00a6\u00b1\u00b6"+
		"\u00be\u00c3\u00cc\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}