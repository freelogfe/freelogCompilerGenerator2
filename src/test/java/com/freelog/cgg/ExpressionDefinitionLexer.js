// Generated from src\test\java\com\freelog\cgg\ExpressionDefinition.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');



var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0002\u0013\u0085\b\u0001\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004",
    "\u0004\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t",
    "\u0007\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004",
    "\f\t\f\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010",
    "\t\u0010\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013",
    "\u0004\u0014\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0003\u0002",
    "\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u00049\n\u0004",
    "\u0003\u0004\u0005\u0004<\n\u0004\u0003\u0005\u0003\u0005\u0003\u0005",
    "\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007",
    "\u0003\b\u0003\b\u0003\t\u0003\t\u0003\n\u0003\n\u0003\u000b\u0003\u000b",
    "\u0003\f\u0003\f\u0003\r\u0003\r\u0003\u000e\u0003\u000e\u0003\u000f",
    "\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011",
    "\u0003\u0011\u0007\u0011i\n\u0011\f\u0011\u000e\u0011l\u000b\u0011\u0003",
    "\u0012\u0005\u0012o\n\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003",
    "\u0013\u0003\u0014\u0006\u0014v\n\u0014\r\u0014\u000e\u0014w\u0003\u0014",
    "\u0003\u0014\u0006\u0014|\n\u0014\r\u0014\u000e\u0014}\u0005\u0014\u0080",
    "\n\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0002\u0002",
    "\u0017\u0003\u0003\u0005\u0004\u0007\u0005\t\u0006\u000b\u0007\r\b\u000f",
    "\t\u0011\n\u0013\u000b\u0015\f\u0017\r\u0019\u000e\u001b\u000f\u001d",
    "\u0010\u001f\u0011!\u0012#\u0013%\u0002\'\u0002)\u0002+\u0002\u0003",
    "\u0002\u0006\u0004\u0002GGgg\u0004\u0002--//\u0003\u00022;\u0004\u0002",
    "C\\c|\u0002\u0089\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003",
    "\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\t\u0003",
    "\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\r\u0003",
    "\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003",
    "\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003",
    "\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003",
    "\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003",
    "\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002!\u0003",
    "\u0002\u0002\u0002\u0002#\u0003\u0002\u0002\u0002\u0003-\u0003\u0002",
    "\u0002\u0002\u00051\u0003\u0002\u0002\u0002\u00075\u0003\u0002\u0002",
    "\u0002\t=\u0003\u0002\u0002\u0002\u000bE\u0003\u0002\u0002\u0002\rO",
    "\u0003\u0002\u0002\u0002\u000fR\u0003\u0002\u0002\u0002\u0011T\u0003",
    "\u0002\u0002\u0002\u0013V\u0003\u0002\u0002\u0002\u0015X\u0003\u0002",
    "\u0002\u0002\u0017Z\u0003\u0002\u0002\u0002\u0019\\\u0003\u0002\u0002",
    "\u0002\u001b^\u0003\u0002\u0002\u0002\u001d`\u0003\u0002\u0002\u0002",
    "\u001fb\u0003\u0002\u0002\u0002!d\u0003\u0002\u0002\u0002#n\u0003\u0002",
    "\u0002\u0002%r\u0003\u0002\u0002\u0002\'u\u0003\u0002\u0002\u0002)\u0081",
    "\u0003\u0002\u0002\u0002+\u0083\u0003\u0002\u0002\u0002-.\u0007u\u0002",
    "\u0002./\u0007w\u0002\u0002/0\u0007o\u0002\u00020\u0004\u0003\u0002",
    "\u0002\u000212\u0007c\u0002\u000223\u0007x\u0002\u000234\u0007i\u0002",
    "\u00024\u0006\u0003\u0002\u0002\u00025;\u0005\'\u0014\u000268\t\u0002",
    "\u0002\u000279\u0005%\u0013\u000287\u0003\u0002\u0002\u000289\u0003",
    "\u0002\u0002\u00029:\u0003\u0002\u0002\u0002:<\u0005\'\u0014\u0002;",
    "6\u0003\u0002\u0002\u0002;<\u0003\u0002\u0002\u0002<\b\u0003\u0002\u0002",
    "\u0002=>\u0007u\u0002\u0002>?\u0007g\u0002\u0002?@\u0007n\u0002\u0002",
    "@A\u0007h\u0002\u0002AB\u0003\u0002\u0002\u0002BC\u00070\u0002\u0002",
    "CD\u0005\u000b\u0006\u0002D\n\u0003\u0002\u0002\u0002EF\u0007g\u0002",
    "\u0002FG\u0007z\u0002\u0002GH\u0007j\u0002\u0002HI\u0007k\u0002\u0002",
    "IJ\u0007d\u0002\u0002JK\u0007k\u0002\u0002KL\u0007v\u0002\u0002LM\u0007",
    "g\u0002\u0002MN\u0007f\u0002\u0002N\f\u0003\u0002\u0002\u0002OP\u0007",
    "r\u0002\u0002PQ\u0007k\u0002\u0002Q\u000e\u0003\u0002\u0002\u0002RS",
    "\u0007g\u0002\u0002S\u0010\u0003\u0002\u0002\u0002TU\u0007.\u0002\u0002",
    "U\u0012\u0003\u0002\u0002\u0002VW\u0007*\u0002\u0002W\u0014\u0003\u0002",
    "\u0002\u0002XY\u0007+\u0002\u0002Y\u0016\u0003\u0002\u0002\u0002Z[\u0007",
    "-\u0002\u0002[\u0018\u0003\u0002\u0002\u0002\\]\u0007/\u0002\u0002]",
    "\u001a\u0003\u0002\u0002\u0002^_\u0007,\u0002\u0002_\u001c\u0003\u0002",
    "\u0002\u0002`a\u00071\u0002\u0002a\u001e\u0003\u0002\u0002\u0002bc\u0007",
    "`\u0002\u0002c \u0003\u0002\u0002\u0002dj\u0005+\u0016\u0002ei\u0005",
    "+\u0016\u0002fi\u0005)\u0015\u0002gi\u0007a\u0002\u0002he\u0003\u0002",
    "\u0002\u0002hf\u0003\u0002\u0002\u0002hg\u0003\u0002\u0002\u0002il\u0003",
    "\u0002\u0002\u0002jh\u0003\u0002\u0002\u0002jk\u0003\u0002\u0002\u0002",
    "k\"\u0003\u0002\u0002\u0002lj\u0003\u0002\u0002\u0002mo\u0007\u000f",
    "\u0002\u0002nm\u0003\u0002\u0002\u0002no\u0003\u0002\u0002\u0002op\u0003",
    "\u0002\u0002\u0002pq\u0007\f\u0002\u0002q$\u0003\u0002\u0002\u0002r",
    "s\t\u0003\u0002\u0002s&\u0003\u0002\u0002\u0002tv\u0005)\u0015\u0002",
    "ut\u0003\u0002\u0002\u0002vw\u0003\u0002\u0002\u0002wu\u0003\u0002\u0002",
    "\u0002wx\u0003\u0002\u0002\u0002x\u007f\u0003\u0002\u0002\u0002y{\u0007",
    "0\u0002\u0002z|\u0005)\u0015\u0002{z\u0003\u0002\u0002\u0002|}\u0003",
    "\u0002\u0002\u0002}{\u0003\u0002\u0002\u0002}~\u0003\u0002\u0002\u0002",
    "~\u0080\u0003\u0002\u0002\u0002\u007fy\u0003\u0002\u0002\u0002\u007f",
    "\u0080\u0003\u0002\u0002\u0002\u0080(\u0003\u0002\u0002\u0002\u0081",
    "\u0082\t\u0004\u0002\u0002\u0082*\u0003\u0002\u0002\u0002\u0083\u0084",
    "\t\u0005\u0002\u0002\u0084,\u0003\u0002\u0002\u0002\u000b\u00028;hj",
    "nw}\u007f\u0002"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

function ExpressionDefinitionLexer(input) {
	antlr4.Lexer.call(this, input);
    this._interp = new antlr4.atn.LexerATNSimulator(this, atn, decisionsToDFA, new antlr4.PredictionContextCache());
    return this;
}

ExpressionDefinitionLexer.prototype = Object.create(antlr4.Lexer.prototype);
ExpressionDefinitionLexer.prototype.constructor = ExpressionDefinitionLexer;

Object.defineProperty(ExpressionDefinitionLexer.prototype, "atn", {
        get : function() {
                return atn;
        }
});

ExpressionDefinitionLexer.EOF = antlr4.Token.EOF;
ExpressionDefinitionLexer.T__0 = 1;
ExpressionDefinitionLexer.T__1 = 2;
ExpressionDefinitionLexer.SCIENTIFIC_NUMBER = 3;
ExpressionDefinitionLexer.VARIABLE_CONTRACT = 4;
ExpressionDefinitionLexer.VARIABLE_CONTRACT_ATTRIBUTE = 5;
ExpressionDefinitionLexer.PI = 6;
ExpressionDefinitionLexer.EULER = 7;
ExpressionDefinitionLexer.COMMA = 8;
ExpressionDefinitionLexer.LPAREN = 9;
ExpressionDefinitionLexer.RPAREN = 10;
ExpressionDefinitionLexer.PLUS = 11;
ExpressionDefinitionLexer.MINUS = 12;
ExpressionDefinitionLexer.TIMES = 13;
ExpressionDefinitionLexer.DIV = 14;
ExpressionDefinitionLexer.POW = 15;
ExpressionDefinitionLexer.ID = 16;
ExpressionDefinitionLexer.NEWLINE = 17;

ExpressionDefinitionLexer.prototype.channelNames = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];

ExpressionDefinitionLexer.prototype.modeNames = [ "DEFAULT_MODE" ];

ExpressionDefinitionLexer.prototype.literalNames = [ null, "'sum'", "'avg'", 
                                                     null, null, "'exhibited'", 
                                                     "'pi'", "'e'", "','", 
                                                     "'('", "')'", "'+'", 
                                                     "'-'", "'*'", "'/'", 
                                                     "'^'" ];

ExpressionDefinitionLexer.prototype.symbolicNames = [ null, null, null, 
                                                      "SCIENTIFIC_NUMBER", 
                                                      "VARIABLE_CONTRACT", 
                                                      "VARIABLE_CONTRACT_ATTRIBUTE", 
                                                      "PI", "EULER", "COMMA", 
                                                      "LPAREN", "RPAREN", 
                                                      "PLUS", "MINUS", "TIMES", 
                                                      "DIV", "POW", "ID", 
                                                      "NEWLINE" ];

ExpressionDefinitionLexer.prototype.ruleNames = [ "T__0", "T__1", "SCIENTIFIC_NUMBER", 
                                                  "VARIABLE_CONTRACT", "VARIABLE_CONTRACT_ATTRIBUTE", 
                                                  "PI", "EULER", "COMMA", 
                                                  "LPAREN", "RPAREN", "PLUS", 
                                                  "MINUS", "TIMES", "DIV", 
                                                  "POW", "ID", "NEWLINE", 
                                                  "SIGN", "NUMBER", "DIGIT", 
                                                  "ALPHABET" ];

ExpressionDefinitionLexer.prototype.grammarFileName = "ExpressionDefinition.g4";


exports.ExpressionDefinitionLexer = ExpressionDefinitionLexer;

