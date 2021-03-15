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
		ID=23, STRING=24, WS=25, SEMVER=26;
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
			"STRING", "WS", "SEMVER", "ESC", "UNICODE", "INT", "NATURAL_INT", "POSITIVE_INT", 
			"DIGIT", "HEX", "ALPHABET", "CHINESE_WORD"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0115\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\6\30\u00d1"+
		"\n\30\r\30\16\30\u00d2\3\31\3\31\3\31\7\31\u00d8\n\31\f\31\16\31\u00db"+
		"\13\31\3\31\3\31\3\32\6\32\u00e0\n\32\r\32\16\32\u00e1\3\32\3\32\3\33"+
		"\5\33\u00e7\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\5\34\u00f4\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\5\36\u00fd\n\36\3"+
		"\36\3\36\5\36\u0101\n\36\3\37\3\37\5\37\u0105\n\37\3 \3 \7 \u0109\n \f"+
		" \16 \u010c\13 \3!\3!\3\"\3\"\3#\3#\3$\3$\2\2%\4\3\6\4\b\5\n\6\f\7\16"+
		"\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26"+
		",\27.\30\60\31\62\32\64\33\66\348\2:\2<\2>\2@\2B\2D\2F\2H\2\4\2\3\13\4"+
		"\2/\60aa\4\2$$^^\5\2\13\f\17\17\"\"\4\2``\u0080\u0080\n\2$$\61\61^^dd"+
		"hhppttvv\3\2\63;\3\2\62;\5\2\62;CHch\4\2C\\c|\2\u0117\2\4\3\2\2\2\2\6"+
		"\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2"+
		"\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34"+
		"\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2("+
		"\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2"+
		"\64\3\2\2\2\3\66\3\2\2\2\4J\3\2\2\2\6N\3\2\2\2\bT\3\2\2\2\nc\3\2\2\2\f"+
		"f\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22x\3\2\2\2\24\u0080\3\2\2\2\26\u0085"+
		"\3\2\2\2\30\u008a\3\2\2\2\32\u0094\3\2\2\2\34\u009e\3\2\2\2\36\u00a7\3"+
		"\2\2\2 \u00b3\3\2\2\2\"\u00b8\3\2\2\2$\u00be\3\2\2\2&\u00c0\3\2\2\2(\u00c4"+
		"\3\2\2\2*\u00c6\3\2\2\2,\u00c8\3\2\2\2.\u00ca\3\2\2\2\60\u00d0\3\2\2\2"+
		"\62\u00d4\3\2\2\2\64\u00df\3\2\2\2\66\u00e6\3\2\2\28\u00f0\3\2\2\2:\u00f5"+
		"\3\2\2\2<\u0100\3\2\2\2>\u0104\3\2\2\2@\u0106\3\2\2\2B\u010d\3\2\2\2D"+
		"\u010f\3\2\2\2F\u0111\3\2\2\2H\u0113\3\2\2\2JK\7c\2\2KL\7f\2\2LM\7f\2"+
		"\2M\5\3\2\2\2NO\7c\2\2OP\7n\2\2PQ\7v\2\2QR\7g\2\2RS\7t\2\2S\7\3\2\2\2"+
		"TU\7c\2\2UV\7e\2\2VW\7v\2\2WX\7k\2\2XY\7x\2\2YZ\7c\2\2Z[\7v\2\2[\\\7g"+
		"\2\2\\]\7a\2\2]^\7v\2\2^_\7j\2\2_`\7g\2\2`a\7o\2\2ab\7g\2\2b\t\3\2\2\2"+
		"cd\7c\2\2de\7u\2\2e\13\3\2\2\2fg\7f\2\2gh\7q\2\2h\r\3\2\2\2ij\7g\2\2j"+
		"k\7p\2\2kl\7f\2\2l\17\3\2\2\2mn\7u\2\2no\7g\2\2op\7v\2\2pq\7a\2\2qr\7"+
		"n\2\2rs\7c\2\2st\7d\2\2tu\7g\2\2uv\7n\2\2vw\7u\2\2w\21\3\2\2\2xy\7t\2"+
		"\2yz\7g\2\2z{\7r\2\2{|\7n\2\2|}\7c\2\2}~\7e\2\2~\177\7g\2\2\177\23\3\2"+
		"\2\2\u0080\u0081\7u\2\2\u0081\u0082\7j\2\2\u0082\u0083\7q\2\2\u0083\u0084"+
		"\7y\2\2\u0084\25\3\2\2\2\u0085\u0086\7j\2\2\u0086\u0087\7k\2\2\u0087\u0088"+
		"\7f\2\2\u0088\u0089\7g\2\2\u0089\27\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e\7a\2\2\u008e\u008f\7v\2\2\u008f"+
		"\u0090\7k\2\2\u0090\u0091\7v\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2"+
		"\u0093\31\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\u0097\7"+
		"v\2\2\u0097\u0098\7a\2\2\u0098\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a\u009b"+
		"\7x\2\2\u009b\u009c\7g\2\2\u009c\u009d\7t\2\2\u009d\33\3\2\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7a\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7t\2\2"+
		"\u00a6\35\3\2\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7"+
		"n\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\7a\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7v\2\2\u00b1"+
		"\u00b2\7t\2\2\u00b2\37\3\2\2\2\u00b3\u00b4\7y\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\7j\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00ba\7p\2\2\u00ba\u00bb\7f\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2"+
		"\u00bd#\3\2\2\2\u00be\u00bf\7&\2\2\u00bf%\3\2\2\2\u00c0\u00c1\7B\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c3\b\23\2\2\u00c3\'\3\2\2\2\u00c4\u00c5\7%\2\2"+
		"\u00c5)\3\2\2\2\u00c6\u00c7\7\61\2\2\u00c7+\3\2\2\2\u00c8\u00c9\7@\2\2"+
		"\u00c9-\3\2\2\2\u00ca\u00cb\7.\2\2\u00cb/\3\2\2\2\u00cc\u00d1\5F#\2\u00cd"+
		"\u00d1\5H$\2\u00ce\u00d1\5B!\2\u00cf\u00d1\t\2\2\2\u00d0\u00cc\3\2\2\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\61\3\2\2\2\u00d4"+
		"\u00d9\7$\2\2\u00d5\u00d8\58\34\2\u00d6\u00d8\n\3\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$"+
		"\2\2\u00dd\63\3\2\2\2\u00de\u00e0\t\4\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\b\32\3\2\u00e4\65\3\2\2\2\u00e5\u00e7\t\5\2\2\u00e6\u00e5\3\2\2"+
		"\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\5>\37\2\u00e9\u00ea"+
		"\7\60\2\2\u00ea\u00eb\5>\37\2\u00eb\u00ec\7\60\2\2\u00ec\u00ed\5>\37\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\33\4\2\u00ef\67\3\2\2\2\u00f0\u00f3"+
		"\7^\2\2\u00f1\u00f4\t\6\2\2\u00f2\u00f4\5:\35\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f49\3\2\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\5D\"\2\u00f7"+
		"\u00f8\5D\"\2\u00f8\u00f9\5D\"\2\u00f9\u00fa\5D\"\2\u00fa;\3\2\2\2\u00fb"+
		"\u00fd\7/\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0101\5@ \2\u00ff\u0101\7\62\2\2\u0100\u00fc\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101=\3\2\2\2\u0102\u0105\5@ \2\u0103\u0105\7\62\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105?\3\2\2\2\u0106\u010a\t\7\2\2"+
		"\u0107\u0109\t\b\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010bA\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\t\b\2\2\u010eC\3\2\2\2\u010f\u0110\t\t\2\2\u0110E\3\2\2\2\u0111"+
		"\u0112\t\n\2\2\u0112G\3\2\2\2\u0113\u0114\4\u4e02\u9ff1\2\u0114I\3\2\2"+
		"\2\17\2\3\u00d0\u00d2\u00d7\u00d9\u00e1\u00e6\u00f3\u00fc\u0100\u0104"+
		"\u010a\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}