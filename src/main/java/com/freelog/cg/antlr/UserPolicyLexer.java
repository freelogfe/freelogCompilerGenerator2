// Generated from generated_grammars/UserPolicy.g4 by ANTLR 4.8

    package com.freelog.cg.antlr;
    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UserPolicyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SELF=8, TERMINATE=9, 
		SUBJECT_ID=10, UOID=11, ACCOUNT_NUMBER=12, SUBJECT_SERVICE_NAME=13, EVENT_SERVICE_NAME=14, 
		ANY_CONTRACT=15, WITH=16, OF=17, REQUIRE=18, USER_ID=19, FEATHER=20, BARB=21, 
		INT=22, MONEY_AMOUNT=23, TIME=24, DATE=25, PHONE_NUMBER_CN_MOBILE=26, 
		EMAIL=27, PERIOD=28, ID=29, WS=30, LPAREN=31, RPAREN=32, PLUS=33, MINUS=34, 
		TIMES=35, DIV=36, GT=37, LT=38, EQ=39, COMMA=40, POINT=41, POW=42, PI=43, 
		SCIENTIFIC_NUMBER=44, EULER=45, SUM=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SELF", "TERMINATE", 
			"SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", "SUBJECT_SERVICE_NAME", "EVENT_SERVICE_NAME", 
			"ANY_CONTRACT", "WITH", "OF", "REQUIRE", "USER_ID", "FEATHER", "BARB", 
			"INT", "MONEY_AMOUNT", "TIME", "DATE", "PHONE_NUMBER_CN_MOBILE", "EMAIL", 
			"LOCAL_SUBPART", "DOMAIN_SUBPART", "PERIOD", "TWO_DIGITS", "THREE_DIGITS", 
			"FOUR_DIGITS", "NIGHT_DIGITS", "ELEVEN_DIGITS", "ID", "WS", "DIGIT", 
			"ALPHABET", "HEX_DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", 
			"LT", "EQ", "COMMA", "POINT", "POW", "PI", "SCIENTIFIC_NUMBER", "EULER", 
			"SUM", "NUMBER", "SIGN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'contract'", "':'", "'proceed'", "'to'", "'on'", "'authorized'", 
			"'unauthorized'", "'self'", "'terminate'", null, null, null, null, null, 
			"'AnyContract'", "'with'", "'of'", "'require'", null, "'feather'", "'barb'", 
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'='", "','", "'.'", "'^'", "'pi'", 
			null, "'e'", "'sum'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SELF", "TERMINATE", 
			"SUBJECT_ID", "UOID", "ACCOUNT_NUMBER", "SUBJECT_SERVICE_NAME", "EVENT_SERVICE_NAME", 
			"ANY_CONTRACT", "WITH", "OF", "REQUIRE", "USER_ID", "FEATHER", "BARB", 
			"INT", "MONEY_AMOUNT", "TIME", "DATE", "PHONE_NUMBER_CN_MOBILE", "EMAIL", 
			"PERIOD", "ID", "WS", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
			"GT", "LT", "EQ", "COMMA", "POINT", "POW", "PI", "SCIENTIFIC_NUMBER", 
			"EULER", "SUM"
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


	    public static String getCycle(){
	        return UserPolicyParser.getCycle();
	    }


	public UserPolicyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UserPolicy.g4"; }

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

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return SUBJECT_ID_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean SUBJECT_ID_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return getCycle() != null  && getCycle().equals("subject");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0230\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\6\13\u00ef\n\13\r\13\16\13\u00f0\3\f\3\f\3\f\3\r\3\r\3\r\6\r\u00f9\n"+
		"\r\r\r\16\r\u00fa\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0121"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\6\27\u0131\n\27\r\27\16\27\u0132\3\30\3\30\6\30\u0137\n\30\r\30"+
		"\16\30\u0138\3\30\3\30\3\30\5\30\u013e\n\30\5\30\u0140\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0147\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\7\34\u0154\n\34\f\34\16\34\u0157\13\34\3\34\3\34\3\34"+
		"\3\34\7\34\u015d\n\34\f\34\16\34\u0160\13\34\3\35\6\35\u0163\n\35\r\35"+
		"\16\35\u0164\3\36\6\36\u0168\n\36\r\36\16\36\u0169\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0177\n\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0182\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u018f\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u019a\n\37\5\37\u019c\n\37\3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\7%\u01b3\n%\f%\16%\u01b6"+
		"\13%\3&\6&\u01b9\n&\r&\16&\u01ba\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3"+
		"I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\5Q\u0217\n"+
		"Q\3Q\5Q\u021a\nQ\3R\3R\3S\3S\3S\3S\3T\6T\u0223\nT\rT\16T\u0224\3T\3T\6"+
		"T\u0229\nT\rT\16T\u022a\5T\u022d\nT\3U\3U\2\2V\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\36?\2A\2C\2E\2G\2I\37"+
		"K M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y"+
		"\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087!\u0089\"\u008b#\u008d$\u008f"+
		"%\u0091&\u0093\'\u0095(\u0097)\u0099*\u009b+\u009d,\u009f-\u00a1.\u00a3"+
		"/\u00a5\60\u00a7\2\u00a9\2\3\2$\f\2##&&((*/\62=??C\\aac|\u0080\u0080\6"+
		"\2//\62;C\\c|\4\2//aa\5\2\13\f\17\17\"\"\3\2\62;\4\2C\\c|\5\2\62;CHch"+
		"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2K"+
		"Kkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\4\2--//\2\u0226\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\2=\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\3\u00ab\3\2\2\2\5\u00b4\3\2\2\2\7\u00b6\3\2\2\2\t\u00be\3\2\2\2\13"+
		"\u00c1\3\2\2\2\r\u00c4\3\2\2\2\17\u00cf\3\2\2\2\21\u00dc\3\2\2\2\23\u00e1"+
		"\3\2\2\2\25\u00eb\3\2\2\2\27\u00f2\3\2\2\2\31\u00f5\3\2\2\2\33\u00fc\3"+
		"\2\2\2\35\u00ff\3\2\2\2\37\u0102\3\2\2\2!\u010e\3\2\2\2#\u0113\3\2\2\2"+
		"%\u0116\3\2\2\2\'\u0120\3\2\2\2)\u0122\3\2\2\2+\u012a\3\2\2\2-\u0130\3"+
		"\2\2\2/\u0134\3\2\2\2\61\u0141\3\2\2\2\63\u0148\3\2\2\2\65\u014e\3\2\2"+
		"\2\67\u0150\3\2\2\29\u0162\3\2\2\2;\u0167\3\2\2\2=\u019b\3\2\2\2?\u019d"+
		"\3\2\2\2A\u01a0\3\2\2\2C\u01a3\3\2\2\2E\u01a6\3\2\2\2G\u01aa\3\2\2\2I"+
		"\u01ae\3\2\2\2K\u01b8\3\2\2\2M\u01be\3\2\2\2O\u01c0\3\2\2\2Q\u01c2\3\2"+
		"\2\2S\u01c4\3\2\2\2U\u01c6\3\2\2\2W\u01c8\3\2\2\2Y\u01ca\3\2\2\2[\u01cc"+
		"\3\2\2\2]\u01ce\3\2\2\2_\u01d0\3\2\2\2a\u01d2\3\2\2\2c\u01d4\3\2\2\2e"+
		"\u01d6\3\2\2\2g\u01d8\3\2\2\2i\u01da\3\2\2\2k\u01dc\3\2\2\2m\u01de\3\2"+
		"\2\2o\u01e0\3\2\2\2q\u01e2\3\2\2\2s\u01e4\3\2\2\2u\u01e6\3\2\2\2w\u01e8"+
		"\3\2\2\2y\u01ea\3\2\2\2{\u01ec\3\2\2\2}\u01ee\3\2\2\2\177\u01f0\3\2\2"+
		"\2\u0081\u01f2\3\2\2\2\u0083\u01f4\3\2\2\2\u0085\u01f6\3\2\2\2\u0087\u01f8"+
		"\3\2\2\2\u0089\u01fa\3\2\2\2\u008b\u01fc\3\2\2\2\u008d\u01fe\3\2\2\2\u008f"+
		"\u0200\3\2\2\2\u0091\u0202\3\2\2\2\u0093\u0204\3\2\2\2\u0095\u0206\3\2"+
		"\2\2\u0097\u0208\3\2\2\2\u0099\u020a\3\2\2\2\u009b\u020c\3\2\2\2\u009d"+
		"\u020e\3\2\2\2\u009f\u0210\3\2\2\2\u00a1\u0213\3\2\2\2\u00a3\u021b\3\2"+
		"\2\2\u00a5\u021d\3\2\2\2\u00a7\u0222\3\2\2\2\u00a9\u022e\3\2\2\2\u00ab"+
		"\u00ac\7e\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2"+
		"\u00af\u00b0\7t\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\4\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\6\3\2\2\2\u00b6\u00b7"+
		"\7r\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7e\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7f\2\2\u00bd\b\3\2\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf\u00c0\7q\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7q\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7w\2\2\u00c6"+
		"\u00c7\7v\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca\u00cb\7k\2\2\u00cb\u00cc\7|\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7f\2\2\u00ce\16\3\2\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7j\2\2\u00d5"+
		"\u00d6\7q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7|\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7f\2\2\u00db\20\3\2\2\2\u00dc\u00dd\7"+
		"u\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7h\2\2\u00e0\22"+
		"\3\2\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		"\u00e5\7o\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7c\2\2"+
		"\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\24\3\2\2\2\u00eb\u00ec\6"+
		"\13\2\2\u00ec\u00ee\7,\2\2\u00ed\u00ef\5Q)\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\26\3\2\2"+
		"\2\u00f2\u00f3\7B\2\2\u00f3\u00f4\5I%\2\u00f4\30\3\2\2\2\u00f5\u00f8\7"+
		"%\2\2\u00f6\u00f9\5O(\2\u00f7\u00f9\5M\'\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\32\3\2\2\2\u00fc\u00fd\7`\2\2\u00fd\u00fe\5I%\2\u00fe\34\3\2\2\2\u00ff"+
		"\u0100\7\u0080\2\2\u0100\u0101\5I%\2\u0101\36\3\2\2\2\u0102\u0103\7C\2"+
		"\2\u0103\u0104\7p\2\2\u0104\u0105\7{\2\2\u0105\u0106\7E\2\2\u0106\u0107"+
		"\7q\2\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109\u010a\7t\2\2\u010a"+
		"\u010b\7c\2\2\u010b\u010c\7e\2\2\u010c\u010d\7v\2\2\u010d \3\2\2\2\u010e"+
		"\u010f\7y\2\2\u010f\u0110\7k\2\2\u0110\u0111\7v\2\2\u0111\u0112\7j\2\2"+
		"\u0112\"\3\2\2\2\u0113\u0114\7q\2\2\u0114\u0115\7h\2\2\u0115$\3\2\2\2"+
		"\u0116\u0117\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7s\2\2\u0119\u011a"+
		"\7w\2\2\u011a\u011b\7k\2\2\u011b\u011c\7t\2\2\u011c\u011d\7g\2\2\u011d"+
		"&\3\2\2\2\u011e\u0121\5\65\33\2\u011f\u0121\5\67\34\2\u0120\u011e\3\2"+
		"\2\2\u0120\u011f\3\2\2\2\u0121(\3\2\2\2\u0122\u0123\7h\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7c\2\2\u0125\u0126\7v\2\2\u0126\u0127\7j\2\2\u0127"+
		"\u0128\7g\2\2\u0128\u0129\7t\2\2\u0129*\3\2\2\2\u012a\u012b\7d\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7t\2\2\u012d\u012e\7d\2\2\u012e,\3\2\2\2\u012f"+
		"\u0131\5M\'\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133.\3\2\2\2\u0134\u0136\7&\2\2\u0135\u0137"+
		"\5M\'\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013f\3\2\2\2\u013a\u013b\7\60\2\2\u013b\u013d\5"+
		"M\'\2\u013c\u013e\5M\'\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		"\u0140\3\2\2\2\u013f\u013a\3\2\2\2\u013f\u0140\3\2\2\2\u0140\60\3\2\2"+
		"\2\u0141\u0142\5? \2\u0142\u0143\7<\2\2\u0143\u0146\5? \2\u0144\u0145"+
		"\7<\2\2\u0145\u0147\5? \2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\62\3\2\2\2\u0148\u0149\5C\"\2\u0149\u014a\7/\2\2\u014a\u014b\5? \2\u014b"+
		"\u014c\7/\2\2\u014c\u014d\5? \2\u014d\64\3\2\2\2\u014e\u014f\5G$\2\u014f"+
		"\66\3\2\2\2\u0150\u0155\59\35\2\u0151\u0152\7\60\2\2\u0152\u0154\59\35"+
		"\2\u0153\u0151\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7B\2\2\u0159"+
		"\u015e\5;\36\2\u015a\u015b\7\60\2\2\u015b\u015d\5;\36\2\u015c\u015a\3"+
		"\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"8\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\t\2\2\2\u0162\u0161\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165:\3"+
		"\2\2\2\u0166\u0168\t\3\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a<\3\2\2\2\u016b\u016c\7e\2\2\u016c"+
		"\u016d\7{\2\2\u016d\u016e\7e\2\2\u016e\u016f\7n\2\2\u016f\u0177\7g\2\2"+
		"\u0170\u0171\7e\2\2\u0171\u0172\7{\2\2\u0172\u0173\7e\2\2\u0173\u0174"+
		"\7n\2\2\u0174\u0175\7g\2\2\u0175\u0177\7u\2\2\u0176\u016b\3\2\2\2\u0176"+
		"\u0170\3\2\2\2\u0177\u019c\3\2\2\2\u0178\u0179\7y\2\2\u0179\u017a\7g\2"+
		"\2\u017a\u017b\7g\2\2\u017b\u0182\7m\2\2\u017c\u017d\7y\2\2\u017d\u017e"+
		"\7g\2\2\u017e\u017f\7g\2\2\u017f\u0180\7m\2\2\u0180\u0182\7u\2\2\u0181"+
		"\u0178\3\2\2\2\u0181\u017c\3\2\2\2\u0182\u019c\3\2\2\2\u0183\u0184\7o"+
		"\2\2\u0184\u0185\7q\2\2\u0185\u0186\7p\2\2\u0186\u0187\7v\2\2\u0187\u018f"+
		"\7j\2\2\u0188\u0189\7o\2\2\u0189\u018a\7q\2\2\u018a\u018b\7p\2\2\u018b"+
		"\u018c\7v\2\2\u018c\u018d\7j\2\2\u018d\u018f\7u\2\2\u018e\u0183\3\2\2"+
		"\2\u018e\u0188\3\2\2\2\u018f\u019c\3\2\2\2\u0190\u0191\7{\2\2\u0191\u0192"+
		"\7g\2\2\u0192\u0193\7c\2\2\u0193\u019a\7t\2\2\u0194\u0195\7{\2\2\u0195"+
		"\u0196\7g\2\2\u0196\u0197\7c\2\2\u0197\u0198\7t\2\2\u0198\u019a\7u\2\2"+
		"\u0199\u0190\3\2\2\2\u0199\u0194\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0176"+
		"\3\2\2\2\u019b\u0181\3\2\2\2\u019b\u018e\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		">\3\2\2\2\u019d\u019e\5M\'\2\u019e\u019f\5M\'\2\u019f@\3\2\2\2\u01a0\u01a1"+
		"\5? \2\u01a1\u01a2\5M\'\2\u01a2B\3\2\2\2\u01a3\u01a4\5? \2\u01a4\u01a5"+
		"\5? \2\u01a5D\3\2\2\2\u01a6\u01a7\5C\"\2\u01a7\u01a8\5C\"\2\u01a8\u01a9"+
		"\5M\'\2\u01a9F\3\2\2\2\u01aa\u01ab\5C\"\2\u01ab\u01ac\5C\"\2\u01ac\u01ad"+
		"\5A!\2\u01adH\3\2\2\2\u01ae\u01b4\5O(\2\u01af\u01b3\5O(\2\u01b0\u01b3"+
		"\5-\27\2\u01b1\u01b3\t\4\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5J\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\t\5\2\2\u01b8\u01b7"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\b&\2\2\u01bdL\3\2\2\2\u01be\u01bf\t\6\2\2\u01bf"+
		"N\3\2\2\2\u01c0\u01c1\t\7\2\2\u01c1P\3\2\2\2\u01c2\u01c3\t\b\2\2\u01c3"+
		"R\3\2\2\2\u01c4\u01c5\t\t\2\2\u01c5T\3\2\2\2\u01c6\u01c7\t\n\2\2\u01c7"+
		"V\3\2\2\2\u01c8\u01c9\t\13\2\2\u01c9X\3\2\2\2\u01ca\u01cb\t\f\2\2\u01cb"+
		"Z\3\2\2\2\u01cc\u01cd\t\r\2\2\u01cd\\\3\2\2\2\u01ce\u01cf\t\16\2\2\u01cf"+
		"^\3\2\2\2\u01d0\u01d1\t\17\2\2\u01d1`\3\2\2\2\u01d2\u01d3\t\20\2\2\u01d3"+
		"b\3\2\2\2\u01d4\u01d5\t\21\2\2\u01d5d\3\2\2\2\u01d6\u01d7\t\22\2\2\u01d7"+
		"f\3\2\2\2\u01d8\u01d9\t\23\2\2\u01d9h\3\2\2\2\u01da\u01db\t\24\2\2\u01db"+
		"j\3\2\2\2\u01dc\u01dd\t\25\2\2\u01ddl\3\2\2\2\u01de\u01df\t\26\2\2\u01df"+
		"n\3\2\2\2\u01e0\u01e1\t\27\2\2\u01e1p\3\2\2\2\u01e2\u01e3\t\30\2\2\u01e3"+
		"r\3\2\2\2\u01e4\u01e5\t\31\2\2\u01e5t\3\2\2\2\u01e6\u01e7\t\32\2\2\u01e7"+
		"v\3\2\2\2\u01e8\u01e9\t\33\2\2\u01e9x\3\2\2\2\u01ea\u01eb\t\34\2\2\u01eb"+
		"z\3\2\2\2\u01ec\u01ed\t\35\2\2\u01ed|\3\2\2\2\u01ee\u01ef\t\36\2\2\u01ef"+
		"~\3\2\2\2\u01f0\u01f1\t\37\2\2\u01f1\u0080\3\2\2\2\u01f2\u01f3\t \2\2"+
		"\u01f3\u0082\3\2\2\2\u01f4\u01f5\t!\2\2\u01f5\u0084\3\2\2\2\u01f6\u01f7"+
		"\t\"\2\2\u01f7\u0086\3\2\2\2\u01f8\u01f9\7*\2\2\u01f9\u0088\3\2\2\2\u01fa"+
		"\u01fb\7+\2\2\u01fb\u008a\3\2\2\2\u01fc\u01fd\7-\2\2\u01fd\u008c\3\2\2"+
		"\2\u01fe\u01ff\7/\2\2\u01ff\u008e\3\2\2\2\u0200\u0201\7,\2\2\u0201\u0090"+
		"\3\2\2\2\u0202\u0203\7\61\2\2\u0203\u0092\3\2\2\2\u0204\u0205\7@\2\2\u0205"+
		"\u0094\3\2\2\2\u0206\u0207\7>\2\2\u0207\u0096\3\2\2\2\u0208\u0209\7?\2"+
		"\2\u0209\u0098\3\2\2\2\u020a\u020b\7.\2\2\u020b\u009a\3\2\2\2\u020c\u020d"+
		"\7\60\2\2\u020d\u009c\3\2\2\2\u020e\u020f\7`\2\2\u020f\u009e\3\2\2\2\u0210"+
		"\u0211\7r\2\2\u0211\u0212\7k\2\2\u0212\u00a0\3\2\2\2\u0213\u0219\5\u00a7"+
		"T\2\u0214\u0216\t\r\2\2\u0215\u0217\5\u00a9U\2\u0216\u0215\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\5\u00a7T\2\u0219\u0214"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u00a2\3\2\2\2\u021b\u021c\7g\2\2\u021c"+
		"\u00a4\3\2\2\2\u021d\u021e\7u\2\2\u021e\u021f\7w\2\2\u021f\u0220\7o\2"+
		"\2\u0220\u00a6\3\2\2\2\u0221\u0223\4\62;\2\u0222\u0221\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u022c\3\2\2\2\u0226"+
		"\u0228\7\60\2\2\u0227\u0229\4\62;\2\u0228\u0227\3\2\2\2\u0229\u022a\3"+
		"\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c"+
		"\u0226\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u00a8\3\2\2\2\u022e\u022f\t#"+
		"\2\2\u022f\u00aa\3\2\2\2\35\2\u00f0\u00f8\u00fa\u0120\u0132\u0138\u013d"+
		"\u013f\u0146\u0155\u015e\u0164\u0169\u0176\u0181\u018e\u0199\u019b\u01b2"+
		"\u01b4\u01ba\u0216\u0219\u0224\u022a\u022c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}