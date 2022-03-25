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
		ADD_RELY=15, DELETE_RELY=16, WITH=17, UNDER=18, TO=19, FROM=20, DOLLAR=21, 
		AT=22, HASH=23, SLASH=24, GT=25, SEPARATOR=26, ID=27, STRING=28, COMMENT=29, 
		COMMENT_LINE=30, WS=31, SEMVER=32;
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
			"ADD_RELY", "DELETE_RELY", "WITH", "UNDER", "TO", "FROM", "DOLLAR", "AT", 
			"HASH", "SLASH", "GT", "SEPARATOR", "ID", "STRING", "COMMENT", "COMMENT_LINE", 
			"WS", "SEMVER", "ESC", "UNICODE", "INT", "NATURAL_INT", "POSITIVE_INT", 
			"DIGIT", "HEX", "ALPHABET", "CHINESE_WORD"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u015b\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\6\34\u00f7\n\34\r\34\16\34\u00f8\3\35\3\35\3\35\7\35"+
		"\u00fe\n\35\f\35\16\35\u0101\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36"+
		"\u0109\n\36\f\36\16\36\u010c\13\36\3\36\3\36\3\36\3\36\5\36\u0112\n\36"+
		"\3\36\5\36\u0115\n\36\3\37\3\37\3\37\3\37\7\37\u011b\n\37\f\37\16\37\u011e"+
		"\13\37\3\37\5\37\u0121\n\37\3\37\3\37\3 \6 \u0126\n \r \16 \u0127\3 \3"+
		" \3!\5!\u012d\n!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u013a\n\"\3#"+
		"\3#\3#\3#\3#\3#\3$\5$\u0143\n$\3$\3$\5$\u0147\n$\3%\3%\5%\u014b\n%\3&"+
		"\3&\7&\u014f\n&\f&\16&\u0152\13&\3\'\3\'\3(\3(\3)\3)\3*\3*\4\u010a\u011c"+
		"\2+\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36"+
		"\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<"+
		"\37> @!B\"D\2F\2H\2J\2L\2N\2P\2R\2T\2\4\2\3\13\n\2\13\f\17\17\"\"$&\61"+
		"\61@@BB~~\4\2$$^^\5\2\13\f\17\17\"\"\4\2``\u0080\u0080\n\2$$\61\61^^d"+
		"dhhppttvv\3\2\63;\3\2\62;\5\2\62;CHch\4\2C\\c|\2\u015f\2\4\3\2\2\2\2\6"+
		"\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2"+
		"\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34"+
		"\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2("+
		"\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2"+
		"\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2"+
		"@\3\2\2\2\3B\3\2\2\2\4V\3\2\2\2\6Z\3\2\2\2\b`\3\2\2\2\no\3\2\2\2\fr\3"+
		"\2\2\2\16u\3\2\2\2\20y\3\2\2\2\22\u0084\3\2\2\2\24\u008c\3\2\2\2\26\u0091"+
		"\3\2\2\2\30\u0096\3\2\2\2\32\u00a0\3\2\2\2\34\u00aa\3\2\2\2\36\u00b3\3"+
		"\2\2\2 \u00bf\3\2\2\2\"\u00c8\3\2\2\2$\u00d4\3\2\2\2&\u00d9\3\2\2\2(\u00df"+
		"\3\2\2\2*\u00e2\3\2\2\2,\u00e7\3\2\2\2.\u00e9\3\2\2\2\60\u00ed\3\2\2\2"+
		"\62\u00ef\3\2\2\2\64\u00f1\3\2\2\2\66\u00f3\3\2\2\28\u00f6\3\2\2\2:\u00fa"+
		"\3\2\2\2<\u0104\3\2\2\2>\u0116\3\2\2\2@\u0125\3\2\2\2B\u012c\3\2\2\2D"+
		"\u0136\3\2\2\2F\u013b\3\2\2\2H\u0146\3\2\2\2J\u014a\3\2\2\2L\u014c\3\2"+
		"\2\2N\u0153\3\2\2\2P\u0155\3\2\2\2R\u0157\3\2\2\2T\u0159\3\2\2\2VW\7c"+
		"\2\2WX\7f\2\2XY\7f\2\2Y\5\3\2\2\2Z[\7c\2\2[\\\7n\2\2\\]\7v\2\2]^\7g\2"+
		"\2^_\7t\2\2_\7\3\2\2\2`a\7c\2\2ab\7e\2\2bc\7v\2\2cd\7k\2\2de\7x\2\2ef"+
		"\7c\2\2fg\7v\2\2gh\7g\2\2hi\7a\2\2ij\7v\2\2jk\7j\2\2kl\7g\2\2lm\7o\2\2"+
		"mn\7g\2\2n\t\3\2\2\2op\7c\2\2pq\7u\2\2q\13\3\2\2\2rs\7f\2\2st\7q\2\2t"+
		"\r\3\2\2\2uv\7g\2\2vw\7p\2\2wx\7f\2\2x\17\3\2\2\2yz\7u\2\2z{\7g\2\2{|"+
		"\7v\2\2|}\7a\2\2}~\7n\2\2~\177\7c\2\2\177\u0080\7d\2\2\u0080\u0081\7g"+
		"\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\21\3\2\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7r\2\2\u0087\u0088\7n\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7e\2\2\u008a\u008b\7g\2\2\u008b\23\3\2\2\2\u008c"+
		"\u008d\7u\2\2\u008d\u008e\7j\2\2\u008e\u008f\7q\2\2\u008f\u0090\7y\2\2"+
		"\u0090\25\3\2\2\2\u0091\u0092\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7"+
		"f\2\2\u0094\u0095\7g\2\2\u0095\27\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7v\2\2\u0099\u009a\7a\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7v\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2"+
		"\u009f\31\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7"+
		"v\2\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7"+
		"\7x\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\33\3\2\2\2\u00aa\u00ab"+
		"\7c\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7a\2\2\u00ae"+
		"\u00af\7c\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7t\2\2"+
		"\u00b2\35\3\2\2\2\u00b3\u00b4\7f\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7"+
		"n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7a\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\37\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7f\2\2\u00c1"+
		"\u00c2\7f\2\2\u00c2\u00c3\7a\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2"+
		"\u00c5\u00c6\7n\2\2\u00c6\u00c7\7{\2\2\u00c7!\3\2\2\2\u00c8\u00c9\7f\2"+
		"\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7v\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7a\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7{\2\2\u00d3#\3\2\2\2\u00d4"+
		"\u00d5\7y\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7j\2\2"+
		"\u00d8%\3\2\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7f\2"+
		"\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de\'\3\2\2\2\u00df\u00e0\7"+
		"v\2\2\u00e0\u00e1\7q\2\2\u00e1)\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7o\2\2\u00e6+\3\2\2\2\u00e7\u00e8"+
		"\7&\2\2\u00e8-\3\2\2\2\u00e9\u00ea\7B\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec"+
		"\b\27\2\2\u00ec/\3\2\2\2\u00ed\u00ee\7%\2\2\u00ee\61\3\2\2\2\u00ef\u00f0"+
		"\7\61\2\2\u00f0\63\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2\65\3\2\2\2\u00f3\u00f4"+
		"\7~\2\2\u00f4\67\3\2\2\2\u00f5\u00f7\n\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f99\3\2\2\2"+
		"\u00fa\u00ff\7$\2\2\u00fb\u00fe\5D\"\2\u00fc\u00fe\n\3\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7$"+
		"\2\2\u0103;\3\2\2\2\u0104\u0105\7\61\2\2\u0105\u0106\7,\2\2\u0106\u010a"+
		"\3\2\2\2\u0107\u0109\13\2\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2"+
		"\u010a\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a"+
		"\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f\7\61\2\2\u010f\u0114\3\2\2\2\u0110"+
		"\u0112\7\17\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3"+
		"\2\2\2\u0113\u0115\7\f\2\2\u0114\u0111\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"=\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7\61\2\2\u0118\u011c\3\2\2"+
		"\2\u0119\u011b\13\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0121\7\17\2\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0123\7\f\2\2\u0123?\3\2\2\2\u0124\u0126\t\4\2\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b \3\2\u012aA\3\2\2\2\u012b\u012d"+
		"\t\5\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\5J%\2\u012f\u0130\7\60\2\2\u0130\u0131\5J%\2\u0131\u0132\7\60\2"+
		"\2\u0132\u0133\5J%\2\u0133\u0134\3\2\2\2\u0134\u0135\b!\4\2\u0135C\3\2"+
		"\2\2\u0136\u0139\7^\2\2\u0137\u013a\t\6\2\2\u0138\u013a\5F#\2\u0139\u0137"+
		"\3\2\2\2\u0139\u0138\3\2\2\2\u013aE\3\2\2\2\u013b\u013c\7w\2\2\u013c\u013d"+
		"\5P(\2\u013d\u013e\5P(\2\u013e\u013f\5P(\2\u013f\u0140\5P(\2\u0140G\3"+
		"\2\2\2\u0141\u0143\7/\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0147\5L&\2\u0145\u0147\7\62\2\2\u0146\u0142\3\2"+
		"\2\2\u0146\u0145\3\2\2\2\u0147I\3\2\2\2\u0148\u014b\5L&\2\u0149\u014b"+
		"\7\62\2\2\u014a\u0148\3\2\2\2\u014a\u0149\3\2\2\2\u014bK\3\2\2\2\u014c"+
		"\u0150\t\7\2\2\u014d\u014f\t\b\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151M\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0154\t\b\2\2\u0154O\3\2\2\2\u0155\u0156\t\t\2\2\u0156"+
		"Q\3\2\2\2\u0157\u0158\t\n\2\2\u0158S\3\2\2\2\u0159\u015a\4\u4e02\u9ff1"+
		"\2\u015aU\3\2\2\2\23\2\3\u00f8\u00fd\u00ff\u010a\u0111\u0114\u011c\u0120"+
		"\u0127\u012c\u0139\u0142\u0146\u014a\u0150\5\4\3\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}