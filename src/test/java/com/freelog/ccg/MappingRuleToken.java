// Generated from src\test\java\com\freelog\ccg\MappingRuleToken.g4 by ANTLR 4.8
package com.freelog.ccg;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MappingRuleToken extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, ALTER=2, ACTIVATE_THEME=3, AS=4, DO=5, END=6, SET_LABELS=7, REPLACE=8, 
		SHOW=9, HIDE=10, SET_TITLE=11, SET_COVER=12, ADD_ATTR=13, DELETE_ATTR=14, 
		WITH=15, UNDER=16, DOLLAR=17, AT=18, HASH=19, SLASH=20, GT=21, COMMA=22, 
		ID=23, WS=24, SEMVER=25;
	public static final int
		SEMVER_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "SEMVER_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "ALTER", "ACTIVATE_THEME", "AS", "DO", "END", "SET_LABELS", "REPLACE", 
			"SHOW", "HIDE", "SET_TITLE", "SET_COVER", "ADD_ATTR", "DELETE_ATTR", 
			"WITH", "UNDER", "DOLLAR", "AT", "HASH", "SLASH", "GT", "COMMA", "ID", 
			"WS", "SEMVER", "INT", "POSITIVE_INT", "DIGIT", "ALPHABET"
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


	public MappingRuleToken(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MappingRuleToken.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00e9\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\6\30\u00c4\n\30\r\30\16\30\u00c5\3\31\6\31\u00c9\n\31"+
		"\r\31\16\31\u00ca\3\31\3\31\3\32\5\32\u00d0\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\5\33\u00db\n\33\3\33\3\33\3\34\3\34\7\34\u00e1"+
		"\n\34\f\34\16\34\u00e4\13\34\3\35\3\35\3\36\3\36\2\2\37\4\3\6\4\b\5\n"+
		"\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&"+
		"\24(\25*\26,\27.\30\60\31\62\32\64\33\66\28\2:\2<\2\4\2\3\b\4\2/\60aa"+
		"\5\2\13\f\17\17\"\"\4\2``\u0080\u0080\3\2\63;\3\2\62;\4\2C\\c|\2\u00ea"+
		"\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2"+
		"\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2"+
		"\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2"+
		"\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2"+
		"\2\2\62\3\2\2\2\3\64\3\2\2\2\4>\3\2\2\2\6B\3\2\2\2\bH\3\2\2\2\nW\3\2\2"+
		"\2\fZ\3\2\2\2\16]\3\2\2\2\20a\3\2\2\2\22l\3\2\2\2\24t\3\2\2\2\26y\3\2"+
		"\2\2\30~\3\2\2\2\32\u0088\3\2\2\2\34\u0092\3\2\2\2\36\u009b\3\2\2\2 \u00a7"+
		"\3\2\2\2\"\u00ac\3\2\2\2$\u00b2\3\2\2\2&\u00b4\3\2\2\2(\u00b8\3\2\2\2"+
		"*\u00ba\3\2\2\2,\u00bc\3\2\2\2.\u00be\3\2\2\2\60\u00c3\3\2\2\2\62\u00c8"+
		"\3\2\2\2\64\u00cf\3\2\2\2\66\u00da\3\2\2\28\u00de\3\2\2\2:\u00e5\3\2\2"+
		"\2<\u00e7\3\2\2\2>?\7c\2\2?@\7f\2\2@A\7f\2\2A\5\3\2\2\2BC\7c\2\2CD\7n"+
		"\2\2DE\7v\2\2EF\7g\2\2FG\7t\2\2G\7\3\2\2\2HI\7c\2\2IJ\7e\2\2JK\7v\2\2"+
		"KL\7k\2\2LM\7x\2\2MN\7c\2\2NO\7v\2\2OP\7g\2\2PQ\7a\2\2QR\7v\2\2RS\7j\2"+
		"\2ST\7g\2\2TU\7o\2\2UV\7g\2\2V\t\3\2\2\2WX\7c\2\2XY\7u\2\2Y\13\3\2\2\2"+
		"Z[\7f\2\2[\\\7q\2\2\\\r\3\2\2\2]^\7g\2\2^_\7p\2\2_`\7f\2\2`\17\3\2\2\2"+
		"ab\7u\2\2bc\7g\2\2cd\7v\2\2de\7a\2\2ef\7n\2\2fg\7c\2\2gh\7d\2\2hi\7g\2"+
		"\2ij\7n\2\2jk\7u\2\2k\21\3\2\2\2lm\7t\2\2mn\7g\2\2no\7r\2\2op\7n\2\2p"+
		"q\7c\2\2qr\7e\2\2rs\7g\2\2s\23\3\2\2\2tu\7u\2\2uv\7j\2\2vw\7q\2\2wx\7"+
		"y\2\2x\25\3\2\2\2yz\7j\2\2z{\7k\2\2{|\7f\2\2|}\7g\2\2}\27\3\2\2\2~\177"+
		"\7u\2\2\177\u0080\7g\2\2\u0080\u0081\7v\2\2\u0081\u0082\7a\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7k\2\2\u0084\u0085\7v\2\2\u0085\u0086\7n\2\2\u0086"+
		"\u0087\7g\2\2\u0087\31\3\2\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7a\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2"+
		"\u008e\u008f\7x\2\2\u008f\u0090\7g\2\2\u0090\u0091\7t\2\2\u0091\33\3\2"+
		"\2\2\u0092\u0093\7c\2\2\u0093\u0094\7f\2\2\u0094\u0095\7f\2\2\u0095\u0096"+
		"\7a\2\2\u0096\u0097\7c\2\2\u0097\u0098\7v\2\2\u0098\u0099\7v\2\2\u0099"+
		"\u009a\7t\2\2\u009a\35\3\2\2\2\u009b\u009c\7f\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1\u00a2\7a\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\37\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7j\2\2\u00ab!\3\2\2\2\u00ac\u00ad"+
		"\7w\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1#\3\2\2\2\u00b2\u00b3\7&\2\2\u00b3%\3\2\2\2\u00b4\u00b5"+
		"\7B\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\23\2\2\u00b7\'\3\2\2\2\u00b8"+
		"\u00b9\7%\2\2\u00b9)\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb+\3\2\2\2\u00bc"+
		"\u00bd\7@\2\2\u00bd-\3\2\2\2\u00be\u00bf\7.\2\2\u00bf/\3\2\2\2\u00c0\u00c4"+
		"\5<\36\2\u00c1\u00c4\5:\35\2\u00c2\u00c4\t\2\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\61\3\2\2\2\u00c7\u00c9\t\3\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\b\31\3\2\u00cd\63\3\2\2\2\u00ce\u00d0\t\4\2"+
		"\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\58\34\2\u00d2\u00d3\7\60\2\2\u00d3\u00d4\58\34\2\u00d4\u00d5\7\60\2\2"+
		"\u00d5\u00d6\58\34\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\32\4\2\u00d8\65"+
		"\3\2\2\2\u00d9\u00db\7/\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\58\34\2\u00dd\67\3\2\2\2\u00de\u00e2\t\5\2"+
		"\2\u00df\u00e1\t\6\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e39\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e6\t\6\2\2\u00e6;\3\2\2\2\u00e7\u00e8\t\7\2\2\u00e8=\3\2\2\2\n\2\3"+
		"\u00c3\u00c5\u00ca\u00cf\u00da\u00e2\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}