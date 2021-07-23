// Generated from src\test\java\com\freelog\ccg\MappingRule.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var MappingRuleListener = require('./MappingRuleListener').MappingRuleListener;
var MappingRuleVisitor = require('./MappingRuleVisitor').MappingRuleVisitor;

var grammarFileName = "MappingRule.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u001e\u00ad\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004",
    "\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007",
    "\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f",
    "\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010",
    "\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014",
    "\t\u0014\u0004\u0015\t\u0015\u0004\u0016\t\u0016\u0003\u0002\u0007\u0002",
    ".\n\u0002\f\u0002\u000e\u00021\u000b\u0002\u0003\u0002\u0003\u0002\u0003",
    "\u0003\u0007\u00036\n\u0003\f\u0003\u000e\u00039\u000b\u0003\u0003\u0003",
    "\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004@\n\u0004",
    "\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006",
    "\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007",
    "\u0003\b\u0003\b\u0003\b\u0003\t\u0003\t\u0005\tS\n\t\u0003\n\u0003",
    "\n\u0003\n\u0003\n\u0003\n\u0003\n\u0005\n[\n\n\u0003\u000b\u0003\u000b",
    "\u0003\u000b\u0003\u000b\u0003\u000b\u0003\f\u0003\f\u0007\fd\n\f\f",
    "\f\u000e\fg\u000b\f\u0003\f\u0003\f\u0005\fk\n\f\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0005\ru\n\r\u0003\u000e",
    "\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0007\u000e|\n\u000e",
    "\f\u000e\u000e\u000e\u007f\u000b\u000e\u0005\u000e\u0081\n\u000e\u0003",
    "\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003",
    "\u000f\u0003\u000f\u0007\u000f\u008b\n\u000f\f\u000f\u000e\u000f\u008e",
    "\u000b\u000f\u0005\u000f\u0090\n\u000f\u0003\u0010\u0003\u0010\u0003",
    "\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003",
    "\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0005",
    "\u0014\u00a0\n\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016",
    "\u0003\u0016\u0003\u0016\u0007\u0016\u00a8\n\u0016\f\u0016\u000e\u0016",
    "\u00ab\u000b\u0016\u0003\u0016\u0002\u0002\u0017\u0002\u0004\u0006\b",
    "\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0002",
    "\u0003\u0003\u0002\u001b\u001c\u0002\u00ac\u0002/\u0003\u0002\u0002",
    "\u0002\u00047\u0003\u0002\u0002\u0002\u0006?\u0003\u0002\u0002\u0002",
    "\bA\u0003\u0002\u0002\u0002\nC\u0003\u0002\u0002\u0002\fI\u0003\u0002",
    "\u0002\u0002\u000eM\u0003\u0002\u0002\u0002\u0010R\u0003\u0002\u0002",
    "\u0002\u0012T\u0003\u0002\u0002\u0002\u0014\\\u0003\u0002\u0002\u0002",
    "\u0016j\u0003\u0002\u0002\u0002\u0018t\u0003\u0002\u0002\u0002\u001a",
    "\u0080\u0003\u0002\u0002\u0002\u001c\u0082\u0003\u0002\u0002\u0002\u001e",
    "\u0091\u0003\u0002\u0002\u0002 \u0093\u0003\u0002\u0002\u0002\"\u0095",
    "\u0003\u0002\u0002\u0002$\u0098\u0003\u0002\u0002\u0002&\u009b\u0003",
    "\u0002\u0002\u0002(\u00a1\u0003\u0002\u0002\u0002*\u00a4\u0003\u0002",
    "\u0002\u0002,.\u0005\u0004\u0003\u0002-,\u0003\u0002\u0002\u0002.1\u0003",
    "\u0002\u0002\u0002/-\u0003\u0002\u0002\u0002/0\u0003\u0002\u0002\u0002",
    "02\u0003\u0002\u0002\u00021/\u0003\u0002\u0002\u000223\u0007\u0002\u0002",
    "\u00033\u0003\u0003\u0002\u0002\u000246\u0005\b\u0005\u000254\u0003",
    "\u0002\u0002\u000269\u0003\u0002\u0002\u000275\u0003\u0002\u0002\u0002",
    "78\u0003\u0002\u0002\u00028:\u0003\u0002\u0002\u000297\u0003\u0002\u0002",
    "\u0002:;\u0005\u0006\u0004\u0002;\u0005\u0003\u0002\u0002\u0002<@\u0005",
    "\n\u0006\u0002=@\u0005\f\u0007\u0002>@\u0005\u000e\b\u0002?<\u0003\u0002",
    "\u0002\u0002?=\u0003\u0002\u0002\u0002?>\u0003\u0002\u0002\u0002@\u0007",
    "\u0003\u0002\u0002\u0002AB\t\u0002\u0002\u0002B\t\u0003\u0002\u0002",
    "\u0002CD\u0007\u0003\u0002\u0002DE\u0005\u0010\t\u0002EF\u0007\u0006",
    "\u0002\u0002FG\u0007\u0019\u0002\u0002GH\u0005\u0016\f\u0002H\u000b",
    "\u0003\u0002\u0002\u0002IJ\u0007\u0004\u0002\u0002JK\u0007\u0019\u0002",
    "\u0002KL\u0005\u0016\f\u0002L\r\u0003\u0002\u0002\u0002MN\u0007\u0005",
    "\u0002\u0002NO\u0007\u0019\u0002\u0002O\u000f\u0003\u0002\u0002\u0002",
    "PS\u0005\u0012\n\u0002QS\u0005\u0014\u000b\u0002RP\u0003\u0002\u0002",
    "\u0002RQ\u0003\u0002\u0002\u0002S\u0011\u0003\u0002\u0002\u0002TU\u0007",
    "\u0013\u0002\u0002UV\u0007\u0019\u0002\u0002VW\u0007\u0016\u0002\u0002",
    "WZ\u0007\u0019\u0002\u0002XY\u0007\u0014\u0002\u0002Y[\u0007\u001e\u0002",
    "\u0002ZX\u0003\u0002\u0002\u0002Z[\u0003\u0002\u0002\u0002[\u0013\u0003",
    "\u0002\u0002\u0002\\]\u0007\u0015\u0002\u0002]^\u0007\u0019\u0002\u0002",
    "^_\u0007\u0016\u0002\u0002_`\u0007\u0019\u0002\u0002`\u0015\u0003\u0002",
    "\u0002\u0002ae\u0007\u0007\u0002\u0002bd\u0005\u0018\r\u0002cb\u0003",
    "\u0002\u0002\u0002dg\u0003\u0002\u0002\u0002ec\u0003\u0002\u0002\u0002",
    "ef\u0003\u0002\u0002\u0002fh\u0003\u0002\u0002\u0002ge\u0003\u0002\u0002",
    "\u0002hk\u0007\b\u0002\u0002ik\u0005\u0018\r\u0002ja\u0003\u0002\u0002",
    "\u0002ji\u0003\u0002\u0002\u0002k\u0017\u0003\u0002\u0002\u0002lu\u0005",
    "\u001a\u000e\u0002mu\u0005\u001c\u000f\u0002nu\u0005\u001e\u0010\u0002",
    "ou\u0005 \u0011\u0002pu\u0005\"\u0012\u0002qu\u0005$\u0013\u0002ru\u0005",
    "&\u0014\u0002su\u0005(\u0015\u0002tl\u0003\u0002\u0002\u0002tm\u0003",
    "\u0002\u0002\u0002tn\u0003\u0002\u0002\u0002to\u0003\u0002\u0002\u0002",
    "tp\u0003\u0002\u0002\u0002tq\u0003\u0002\u0002\u0002tr\u0003\u0002\u0002",
    "\u0002ts\u0003\u0002\u0002\u0002u\u0019\u0003\u0002\u0002\u0002v\u0081",
    "\u0007\t\u0002\u0002wx\u0007\t\u0002\u0002x}\u0007\u0019\u0002\u0002",
    "yz\u0007\u0018\u0002\u0002z|\u0007\u0019\u0002\u0002{y\u0003\u0002\u0002",
    "\u0002|\u007f\u0003\u0002\u0002\u0002}{\u0003\u0002\u0002\u0002}~\u0003",
    "\u0002\u0002\u0002~\u0081\u0003\u0002\u0002\u0002\u007f}\u0003\u0002",
    "\u0002\u0002\u0080v\u0003\u0002\u0002\u0002\u0080w\u0003\u0002\u0002",
    "\u0002\u0081\u001b\u0003\u0002\u0002\u0002\u0082\u0083\u0007\n\u0002",
    "\u0002\u0083\u0084\u0005\u0010\t\u0002\u0084\u0085\u0007\u0011\u0002",
    "\u0002\u0085\u008f\u0005\u0010\t\u0002\u0086\u0087\u0007\u0012\u0002",
    "\u0002\u0087\u008c\u0005*\u0016\u0002\u0088\u0089\u0007\u0018\u0002",
    "\u0002\u0089\u008b\u0005*\u0016\u0002\u008a\u0088\u0003\u0002\u0002",
    "\u0002\u008b\u008e\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002",
    "\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u0090\u0003\u0002\u0002",
    "\u0002\u008e\u008c\u0003\u0002\u0002\u0002\u008f\u0086\u0003\u0002\u0002",
    "\u0002\u008f\u0090\u0003\u0002\u0002\u0002\u0090\u001d\u0003\u0002\u0002",
    "\u0002\u0091\u0092\u0007\u000b\u0002\u0002\u0092\u001f\u0003\u0002\u0002",
    "\u0002\u0093\u0094\u0007\f\u0002\u0002\u0094!\u0003\u0002\u0002\u0002",
    "\u0095\u0096\u0007\r\u0002\u0002\u0096\u0097\u0007\u001a\u0002\u0002",
    "\u0097#\u0003\u0002\u0002\u0002\u0098\u0099\u0007\u000e\u0002\u0002",
    "\u0099\u009a\u0007\u001a\u0002\u0002\u009a%\u0003\u0002\u0002\u0002",
    "\u009b\u009c\u0007\u000f\u0002\u0002\u009c\u009d\u0007\u0019\u0002\u0002",
    "\u009d\u009f\u0007\u0019\u0002\u0002\u009e\u00a0\u0007\u0019\u0002\u0002",
    "\u009f\u009e\u0003\u0002\u0002\u0002\u009f\u00a0\u0003\u0002\u0002\u0002",
    "\u00a0\'\u0003\u0002\u0002\u0002\u00a1\u00a2\u0007\u0010\u0002\u0002",
    "\u00a2\u00a3\u0007\u0019\u0002\u0002\u00a3)\u0003\u0002\u0002\u0002",
    "\u00a4\u00a9\u0005\u0010\t\u0002\u00a5\u00a6\u0007\u0017\u0002\u0002",
    "\u00a6\u00a8\u0005\u0010\t\u0002\u00a7\u00a5\u0003\u0002\u0002\u0002",
    "\u00a8\u00ab\u0003\u0002\u0002\u0002\u00a9\u00a7\u0003\u0002\u0002\u0002",
    "\u00a9\u00aa\u0003\u0002\u0002\u0002\u00aa+\u0003\u0002\u0002\u0002",
    "\u00ab\u00a9\u0003\u0002\u0002\u0002\u0010/7?RZejt}\u0080\u008c\u008f",
    "\u009f\u00a9"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'add'", "'alter'", "'activate_theme'", "'as'", 
                     "'do'", "'end'", "'set_labels'", "'replace'", "'show'", 
                     "'hide'", "'set_title'", "'set_cover'", "'add_attr'", 
                     "'delete_attr'", "'with'", "'under'", "'$'", "'@'", 
                     "'#'", "'/'", "'>'", "','" ];

var symbolicNames = [ null, "ADD", "ALTER", "ACTIVATE_THEME", "AS", "DO", 
                      "END", "SET_LABELS", "REPLACE", "SHOW", "HIDE", "SET_TITLE", 
                      "SET_COVER", "ADD_ATTR", "DELETE_ATTR", "WITH", "UNDER", 
                      "DOLLAR", "AT", "HASH", "SLASH", "GT", "COMMA", "ID", 
                      "STRING", "COMMENT", "COMMENT_LINE", "WS", "SEMVER" ];

var ruleNames =  [ "mapping_rule_section", "mapping_rule_part", "mapping_rule", 
                   "comment_section", "rule_add", "rule_alter", "rule_activate_theme", 
                   "candidate", "resource_name", "object_name", "action", 
                   "line_code", "set_labels", "replace", "show", "hide", 
                   "set_title", "set_cover", "add_attr", "delete_attr", 
                   "scope" ];

function MappingRule (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

MappingRule.prototype = Object.create(antlr4.Parser.prototype);
MappingRule.prototype.constructor = MappingRule;

Object.defineProperty(MappingRule.prototype, "atn", {
	get : function() {
		return atn;
	}
});

MappingRule.EOF = antlr4.Token.EOF;
MappingRule.ADD = 1;
MappingRule.ALTER = 2;
MappingRule.ACTIVATE_THEME = 3;
MappingRule.AS = 4;
MappingRule.DO = 5;
MappingRule.END = 6;
MappingRule.SET_LABELS = 7;
MappingRule.REPLACE = 8;
MappingRule.SHOW = 9;
MappingRule.HIDE = 10;
MappingRule.SET_TITLE = 11;
MappingRule.SET_COVER = 12;
MappingRule.ADD_ATTR = 13;
MappingRule.DELETE_ATTR = 14;
MappingRule.WITH = 15;
MappingRule.UNDER = 16;
MappingRule.DOLLAR = 17;
MappingRule.AT = 18;
MappingRule.HASH = 19;
MappingRule.SLASH = 20;
MappingRule.GT = 21;
MappingRule.COMMA = 22;
MappingRule.ID = 23;
MappingRule.STRING = 24;
MappingRule.COMMENT = 25;
MappingRule.COMMENT_LINE = 26;
MappingRule.WS = 27;
MappingRule.SEMVER = 28;

MappingRule.RULE_mapping_rule_section = 0;
MappingRule.RULE_mapping_rule_part = 1;
MappingRule.RULE_mapping_rule = 2;
MappingRule.RULE_comment_section = 3;
MappingRule.RULE_rule_add = 4;
MappingRule.RULE_rule_alter = 5;
MappingRule.RULE_rule_activate_theme = 6;
MappingRule.RULE_candidate = 7;
MappingRule.RULE_resource_name = 8;
MappingRule.RULE_object_name = 9;
MappingRule.RULE_action = 10;
MappingRule.RULE_line_code = 11;
MappingRule.RULE_set_labels = 12;
MappingRule.RULE_replace = 13;
MappingRule.RULE_show = 14;
MappingRule.RULE_hide = 15;
MappingRule.RULE_set_title = 16;
MappingRule.RULE_set_cover = 17;
MappingRule.RULE_add_attr = 18;
MappingRule.RULE_delete_attr = 19;
MappingRule.RULE_scope = 20;


function Mapping_rule_sectionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_mapping_rule_section;
    return this;
}

Mapping_rule_sectionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Mapping_rule_sectionContext.prototype.constructor = Mapping_rule_sectionContext;

Mapping_rule_sectionContext.prototype.EOF = function() {
    return this.getToken(MappingRule.EOF, 0);
};

Mapping_rule_sectionContext.prototype.mapping_rule_part = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Mapping_rule_partContext);
    } else {
        return this.getTypedRuleContext(Mapping_rule_partContext,i);
    }
};

Mapping_rule_sectionContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterMapping_rule_section(this);
	}
};

Mapping_rule_sectionContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitMapping_rule_section(this);
	}
};

Mapping_rule_sectionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitMapping_rule_section(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Mapping_rule_sectionContext = Mapping_rule_sectionContext;

MappingRule.prototype.mapping_rule_section = function() {

    var localctx = new Mapping_rule_sectionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, MappingRule.RULE_mapping_rule_section);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 45;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MappingRule.ADD) | (1 << MappingRule.ALTER) | (1 << MappingRule.ACTIVATE_THEME) | (1 << MappingRule.COMMENT) | (1 << MappingRule.COMMENT_LINE))) !== 0)) {
            this.state = 42;
            this.mapping_rule_part();
            this.state = 47;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 48;
        this.match(MappingRule.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Mapping_rule_partContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_mapping_rule_part;
    return this;
}

Mapping_rule_partContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Mapping_rule_partContext.prototype.constructor = Mapping_rule_partContext;

Mapping_rule_partContext.prototype.mapping_rule = function() {
    return this.getTypedRuleContext(Mapping_ruleContext,0);
};

Mapping_rule_partContext.prototype.comment_section = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Comment_sectionContext);
    } else {
        return this.getTypedRuleContext(Comment_sectionContext,i);
    }
};

Mapping_rule_partContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterMapping_rule_part(this);
	}
};

Mapping_rule_partContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitMapping_rule_part(this);
	}
};

Mapping_rule_partContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitMapping_rule_part(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Mapping_rule_partContext = Mapping_rule_partContext;

MappingRule.prototype.mapping_rule_part = function() {

    var localctx = new Mapping_rule_partContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, MappingRule.RULE_mapping_rule_part);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 53;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===MappingRule.COMMENT || _la===MappingRule.COMMENT_LINE) {
            this.state = 50;
            this.comment_section();
            this.state = 55;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 56;
        this.mapping_rule();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Mapping_ruleContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_mapping_rule;
    return this;
}

Mapping_ruleContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Mapping_ruleContext.prototype.constructor = Mapping_ruleContext;

Mapping_ruleContext.prototype.rule_add = function() {
    return this.getTypedRuleContext(Rule_addContext,0);
};

Mapping_ruleContext.prototype.rule_alter = function() {
    return this.getTypedRuleContext(Rule_alterContext,0);
};

Mapping_ruleContext.prototype.rule_activate_theme = function() {
    return this.getTypedRuleContext(Rule_activate_themeContext,0);
};

Mapping_ruleContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterMapping_rule(this);
	}
};

Mapping_ruleContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitMapping_rule(this);
	}
};

Mapping_ruleContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitMapping_rule(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Mapping_ruleContext = Mapping_ruleContext;

MappingRule.prototype.mapping_rule = function() {

    var localctx = new Mapping_ruleContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, MappingRule.RULE_mapping_rule);
    try {
        this.state = 61;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.ADD:
            this.enterOuterAlt(localctx, 1);
            this.state = 58;
            this.rule_add();
            break;
        case MappingRule.ALTER:
            this.enterOuterAlt(localctx, 2);
            this.state = 59;
            this.rule_alter();
            break;
        case MappingRule.ACTIVATE_THEME:
            this.enterOuterAlt(localctx, 3);
            this.state = 60;
            this.rule_activate_theme();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Comment_sectionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_comment_section;
    return this;
}

Comment_sectionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Comment_sectionContext.prototype.constructor = Comment_sectionContext;

Comment_sectionContext.prototype.COMMENT = function() {
    return this.getToken(MappingRule.COMMENT, 0);
};

Comment_sectionContext.prototype.COMMENT_LINE = function() {
    return this.getToken(MappingRule.COMMENT_LINE, 0);
};

Comment_sectionContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterComment_section(this);
	}
};

Comment_sectionContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitComment_section(this);
	}
};

Comment_sectionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitComment_section(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Comment_sectionContext = Comment_sectionContext;

MappingRule.prototype.comment_section = function() {

    var localctx = new Comment_sectionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, MappingRule.RULE_comment_section);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 63;
        _la = this._input.LA(1);
        if(!(_la===MappingRule.COMMENT || _la===MappingRule.COMMENT_LINE)) {
        this._errHandler.recoverInline(this);
        }
        else {
        	this._errHandler.reportMatch(this);
            this.consume();
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Rule_addContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_rule_add;
    return this;
}

Rule_addContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Rule_addContext.prototype.constructor = Rule_addContext;

Rule_addContext.prototype.ADD = function() {
    return this.getToken(MappingRule.ADD, 0);
};

Rule_addContext.prototype.candidate = function() {
    return this.getTypedRuleContext(CandidateContext,0);
};

Rule_addContext.prototype.AS = function() {
    return this.getToken(MappingRule.AS, 0);
};

Rule_addContext.prototype.ID = function() {
    return this.getToken(MappingRule.ID, 0);
};

Rule_addContext.prototype.action = function() {
    return this.getTypedRuleContext(ActionContext,0);
};

Rule_addContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterRule_add(this);
	}
};

Rule_addContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitRule_add(this);
	}
};

Rule_addContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitRule_add(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Rule_addContext = Rule_addContext;

MappingRule.prototype.rule_add = function() {

    var localctx = new Rule_addContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, MappingRule.RULE_rule_add);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 65;
        this.match(MappingRule.ADD);
        this.state = 66;
        this.candidate();
        this.state = 67;
        this.match(MappingRule.AS);
        this.state = 68;
        this.match(MappingRule.ID);
        this.state = 69;
        this.action();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Rule_alterContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_rule_alter;
    return this;
}

Rule_alterContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Rule_alterContext.prototype.constructor = Rule_alterContext;

Rule_alterContext.prototype.ALTER = function() {
    return this.getToken(MappingRule.ALTER, 0);
};

Rule_alterContext.prototype.ID = function() {
    return this.getToken(MappingRule.ID, 0);
};

Rule_alterContext.prototype.action = function() {
    return this.getTypedRuleContext(ActionContext,0);
};

Rule_alterContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterRule_alter(this);
	}
};

Rule_alterContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitRule_alter(this);
	}
};

Rule_alterContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitRule_alter(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Rule_alterContext = Rule_alterContext;

MappingRule.prototype.rule_alter = function() {

    var localctx = new Rule_alterContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, MappingRule.RULE_rule_alter);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 71;
        this.match(MappingRule.ALTER);
        this.state = 72;
        this.match(MappingRule.ID);
        this.state = 73;
        this.action();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Rule_activate_themeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_rule_activate_theme;
    return this;
}

Rule_activate_themeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Rule_activate_themeContext.prototype.constructor = Rule_activate_themeContext;

Rule_activate_themeContext.prototype.ACTIVATE_THEME = function() {
    return this.getToken(MappingRule.ACTIVATE_THEME, 0);
};

Rule_activate_themeContext.prototype.ID = function() {
    return this.getToken(MappingRule.ID, 0);
};

Rule_activate_themeContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterRule_activate_theme(this);
	}
};

Rule_activate_themeContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitRule_activate_theme(this);
	}
};

Rule_activate_themeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitRule_activate_theme(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Rule_activate_themeContext = Rule_activate_themeContext;

MappingRule.prototype.rule_activate_theme = function() {

    var localctx = new Rule_activate_themeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, MappingRule.RULE_rule_activate_theme);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 75;
        this.match(MappingRule.ACTIVATE_THEME);
        this.state = 76;
        this.match(MappingRule.ID);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function CandidateContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_candidate;
    return this;
}

CandidateContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
CandidateContext.prototype.constructor = CandidateContext;

CandidateContext.prototype.resource_name = function() {
    return this.getTypedRuleContext(Resource_nameContext,0);
};

CandidateContext.prototype.object_name = function() {
    return this.getTypedRuleContext(Object_nameContext,0);
};

CandidateContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterCandidate(this);
	}
};

CandidateContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitCandidate(this);
	}
};

CandidateContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitCandidate(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.CandidateContext = CandidateContext;

MappingRule.prototype.candidate = function() {

    var localctx = new CandidateContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, MappingRule.RULE_candidate);
    try {
        this.state = 80;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.DOLLAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 78;
            this.resource_name();
            break;
        case MappingRule.HASH:
            this.enterOuterAlt(localctx, 2);
            this.state = 79;
            this.object_name();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Resource_nameContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_resource_name;
    this.userName = null; // Token
    this.resourceName = null; // Token
    return this;
}

Resource_nameContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Resource_nameContext.prototype.constructor = Resource_nameContext;

Resource_nameContext.prototype.DOLLAR = function() {
    return this.getToken(MappingRule.DOLLAR, 0);
};

Resource_nameContext.prototype.SLASH = function() {
    return this.getToken(MappingRule.SLASH, 0);
};

Resource_nameContext.prototype.ID = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MappingRule.ID);
    } else {
        return this.getToken(MappingRule.ID, i);
    }
};


Resource_nameContext.prototype.AT = function() {
    return this.getToken(MappingRule.AT, 0);
};

Resource_nameContext.prototype.SEMVER = function() {
    return this.getToken(MappingRule.SEMVER, 0);
};

Resource_nameContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterResource_name(this);
	}
};

Resource_nameContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitResource_name(this);
	}
};

Resource_nameContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitResource_name(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Resource_nameContext = Resource_nameContext;

MappingRule.prototype.resource_name = function() {

    var localctx = new Resource_nameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, MappingRule.RULE_resource_name);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 82;
        this.match(MappingRule.DOLLAR);
        this.state = 83;
        localctx.userName = this.match(MappingRule.ID);
        this.state = 84;
        this.match(MappingRule.SLASH);
        this.state = 85;
        localctx.resourceName = this.match(MappingRule.ID);
        this.state = 88;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.AT) {
            this.state = 86;
            this.match(MappingRule.AT);
            this.state = 87;
            this.match(MappingRule.SEMVER);
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Object_nameContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_object_name;
    this.bucketName = null; // Token
    this.objectName = null; // Token
    return this;
}

Object_nameContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Object_nameContext.prototype.constructor = Object_nameContext;

Object_nameContext.prototype.HASH = function() {
    return this.getToken(MappingRule.HASH, 0);
};

Object_nameContext.prototype.SLASH = function() {
    return this.getToken(MappingRule.SLASH, 0);
};

Object_nameContext.prototype.ID = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MappingRule.ID);
    } else {
        return this.getToken(MappingRule.ID, i);
    }
};


Object_nameContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterObject_name(this);
	}
};

Object_nameContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitObject_name(this);
	}
};

Object_nameContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitObject_name(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Object_nameContext = Object_nameContext;

MappingRule.prototype.object_name = function() {

    var localctx = new Object_nameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, MappingRule.RULE_object_name);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 90;
        this.match(MappingRule.HASH);
        this.state = 91;
        localctx.bucketName = this.match(MappingRule.ID);
        this.state = 92;
        this.match(MappingRule.SLASH);
        this.state = 93;
        localctx.objectName = this.match(MappingRule.ID);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ActionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_action;
    return this;
}

ActionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ActionContext.prototype.constructor = ActionContext;

ActionContext.prototype.DO = function() {
    return this.getToken(MappingRule.DO, 0);
};

ActionContext.prototype.END = function() {
    return this.getToken(MappingRule.END, 0);
};

ActionContext.prototype.line_code = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Line_codeContext);
    } else {
        return this.getTypedRuleContext(Line_codeContext,i);
    }
};

ActionContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterAction(this);
	}
};

ActionContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitAction(this);
	}
};

ActionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitAction(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.ActionContext = ActionContext;

MappingRule.prototype.action = function() {

    var localctx = new ActionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, MappingRule.RULE_action);
    var _la = 0; // Token type
    try {
        this.state = 104;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.DO:
            this.enterOuterAlt(localctx, 1);
            this.state = 95;
            this.match(MappingRule.DO);
            this.state = 99;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MappingRule.SET_LABELS) | (1 << MappingRule.REPLACE) | (1 << MappingRule.SHOW) | (1 << MappingRule.HIDE) | (1 << MappingRule.SET_TITLE) | (1 << MappingRule.SET_COVER) | (1 << MappingRule.ADD_ATTR) | (1 << MappingRule.DELETE_ATTR))) !== 0)) {
                this.state = 96;
                this.line_code();
                this.state = 101;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 102;
            this.match(MappingRule.END);
            break;
        case MappingRule.SET_LABELS:
        case MappingRule.REPLACE:
        case MappingRule.SHOW:
        case MappingRule.HIDE:
        case MappingRule.SET_TITLE:
        case MappingRule.SET_COVER:
        case MappingRule.ADD_ATTR:
        case MappingRule.DELETE_ATTR:
            this.enterOuterAlt(localctx, 2);
            this.state = 103;
            this.line_code();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Line_codeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_line_code;
    return this;
}

Line_codeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Line_codeContext.prototype.constructor = Line_codeContext;

Line_codeContext.prototype.set_labels = function() {
    return this.getTypedRuleContext(Set_labelsContext,0);
};

Line_codeContext.prototype.replace = function() {
    return this.getTypedRuleContext(ReplaceContext,0);
};

Line_codeContext.prototype.show = function() {
    return this.getTypedRuleContext(ShowContext,0);
};

Line_codeContext.prototype.hide = function() {
    return this.getTypedRuleContext(HideContext,0);
};

Line_codeContext.prototype.set_title = function() {
    return this.getTypedRuleContext(Set_titleContext,0);
};

Line_codeContext.prototype.set_cover = function() {
    return this.getTypedRuleContext(Set_coverContext,0);
};

Line_codeContext.prototype.add_attr = function() {
    return this.getTypedRuleContext(Add_attrContext,0);
};

Line_codeContext.prototype.delete_attr = function() {
    return this.getTypedRuleContext(Delete_attrContext,0);
};

Line_codeContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterLine_code(this);
	}
};

Line_codeContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitLine_code(this);
	}
};

Line_codeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitLine_code(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Line_codeContext = Line_codeContext;

MappingRule.prototype.line_code = function() {

    var localctx = new Line_codeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, MappingRule.RULE_line_code);
    try {
        this.state = 114;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.SET_LABELS:
            this.enterOuterAlt(localctx, 1);
            this.state = 106;
            this.set_labels();
            break;
        case MappingRule.REPLACE:
            this.enterOuterAlt(localctx, 2);
            this.state = 107;
            this.replace();
            break;
        case MappingRule.SHOW:
            this.enterOuterAlt(localctx, 3);
            this.state = 108;
            this.show();
            break;
        case MappingRule.HIDE:
            this.enterOuterAlt(localctx, 4);
            this.state = 109;
            this.hide();
            break;
        case MappingRule.SET_TITLE:
            this.enterOuterAlt(localctx, 5);
            this.state = 110;
            this.set_title();
            break;
        case MappingRule.SET_COVER:
            this.enterOuterAlt(localctx, 6);
            this.state = 111;
            this.set_cover();
            break;
        case MappingRule.ADD_ATTR:
            this.enterOuterAlt(localctx, 7);
            this.state = 112;
            this.add_attr();
            break;
        case MappingRule.DELETE_ATTR:
            this.enterOuterAlt(localctx, 8);
            this.state = 113;
            this.delete_attr();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Set_labelsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_set_labels;
    return this;
}

Set_labelsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Set_labelsContext.prototype.constructor = Set_labelsContext;

Set_labelsContext.prototype.SET_LABELS = function() {
    return this.getToken(MappingRule.SET_LABELS, 0);
};

Set_labelsContext.prototype.ID = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MappingRule.ID);
    } else {
        return this.getToken(MappingRule.ID, i);
    }
};


Set_labelsContext.prototype.COMMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MappingRule.COMMA);
    } else {
        return this.getToken(MappingRule.COMMA, i);
    }
};


Set_labelsContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterSet_labels(this);
	}
};

Set_labelsContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitSet_labels(this);
	}
};

Set_labelsContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitSet_labels(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Set_labelsContext = Set_labelsContext;

MappingRule.prototype.set_labels = function() {

    var localctx = new Set_labelsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, MappingRule.RULE_set_labels);
    var _la = 0; // Token type
    try {
        this.state = 126;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,9,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 116;
            this.match(MappingRule.SET_LABELS);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 117;
            this.match(MappingRule.SET_LABELS);
            this.state = 118;
            this.match(MappingRule.ID);
            this.state = 123;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MappingRule.COMMA) {
                this.state = 119;
                this.match(MappingRule.COMMA);
                this.state = 120;
                this.match(MappingRule.ID);
                this.state = 125;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ReplaceContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_replace;
    this.target = null; // CandidateContext
    this.source = null; // CandidateContext
    return this;
}

ReplaceContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ReplaceContext.prototype.constructor = ReplaceContext;

ReplaceContext.prototype.REPLACE = function() {
    return this.getToken(MappingRule.REPLACE, 0);
};

ReplaceContext.prototype.WITH = function() {
    return this.getToken(MappingRule.WITH, 0);
};

ReplaceContext.prototype.candidate = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(CandidateContext);
    } else {
        return this.getTypedRuleContext(CandidateContext,i);
    }
};

ReplaceContext.prototype.UNDER = function() {
    return this.getToken(MappingRule.UNDER, 0);
};

ReplaceContext.prototype.scope = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ScopeContext);
    } else {
        return this.getTypedRuleContext(ScopeContext,i);
    }
};

ReplaceContext.prototype.COMMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MappingRule.COMMA);
    } else {
        return this.getToken(MappingRule.COMMA, i);
    }
};


ReplaceContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterReplace(this);
	}
};

ReplaceContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitReplace(this);
	}
};

ReplaceContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitReplace(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.ReplaceContext = ReplaceContext;

MappingRule.prototype.replace = function() {

    var localctx = new ReplaceContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, MappingRule.RULE_replace);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 128;
        this.match(MappingRule.REPLACE);
        this.state = 129;
        localctx.target = this.candidate();
        this.state = 130;
        this.match(MappingRule.WITH);
        this.state = 131;
        localctx.source = this.candidate();
        this.state = 141;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.UNDER) {
            this.state = 132;
            this.match(MappingRule.UNDER);
            this.state = 133;
            this.scope();
            this.state = 138;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MappingRule.COMMA) {
                this.state = 134;
                this.match(MappingRule.COMMA);
                this.state = 135;
                this.scope();
                this.state = 140;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ShowContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_show;
    return this;
}

ShowContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ShowContext.prototype.constructor = ShowContext;

ShowContext.prototype.SHOW = function() {
    return this.getToken(MappingRule.SHOW, 0);
};

ShowContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterShow(this);
	}
};

ShowContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitShow(this);
	}
};

ShowContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitShow(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.ShowContext = ShowContext;

MappingRule.prototype.show = function() {

    var localctx = new ShowContext(this, this._ctx, this.state);
    this.enterRule(localctx, 28, MappingRule.RULE_show);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 143;
        this.match(MappingRule.SHOW);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function HideContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_hide;
    return this;
}

HideContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
HideContext.prototype.constructor = HideContext;

HideContext.prototype.HIDE = function() {
    return this.getToken(MappingRule.HIDE, 0);
};

HideContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterHide(this);
	}
};

HideContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitHide(this);
	}
};

HideContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitHide(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.HideContext = HideContext;

MappingRule.prototype.hide = function() {

    var localctx = new HideContext(this, this._ctx, this.state);
    this.enterRule(localctx, 30, MappingRule.RULE_hide);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 145;
        this.match(MappingRule.HIDE);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Set_titleContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_set_title;
    this.title = null; // Token
    return this;
}

Set_titleContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Set_titleContext.prototype.constructor = Set_titleContext;

Set_titleContext.prototype.SET_TITLE = function() {
    return this.getToken(MappingRule.SET_TITLE, 0);
};

Set_titleContext.prototype.STRING = function() {
    return this.getToken(MappingRule.STRING, 0);
};

Set_titleContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterSet_title(this);
	}
};

Set_titleContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitSet_title(this);
	}
};

Set_titleContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitSet_title(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Set_titleContext = Set_titleContext;

MappingRule.prototype.set_title = function() {

    var localctx = new Set_titleContext(this, this._ctx, this.state);
    this.enterRule(localctx, 32, MappingRule.RULE_set_title);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 147;
        this.match(MappingRule.SET_TITLE);
        this.state = 148;
        localctx.title = this.match(MappingRule.STRING);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Set_coverContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_set_cover;
    this.cover = null; // Token
    return this;
}

Set_coverContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Set_coverContext.prototype.constructor = Set_coverContext;

Set_coverContext.prototype.SET_COVER = function() {
    return this.getToken(MappingRule.SET_COVER, 0);
};

Set_coverContext.prototype.STRING = function() {
    return this.getToken(MappingRule.STRING, 0);
};

Set_coverContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterSet_cover(this);
	}
};

Set_coverContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitSet_cover(this);
	}
};

Set_coverContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitSet_cover(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Set_coverContext = Set_coverContext;

MappingRule.prototype.set_cover = function() {

    var localctx = new Set_coverContext(this, this._ctx, this.state);
    this.enterRule(localctx, 34, MappingRule.RULE_set_cover);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 150;
        this.match(MappingRule.SET_COVER);
        this.state = 151;
        localctx.cover = this.match(MappingRule.STRING);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Add_attrContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_add_attr;
    this.key = null; // Token
    this.value = null; // Token
    this.description = null; // Token
    return this;
}

Add_attrContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Add_attrContext.prototype.constructor = Add_attrContext;

Add_attrContext.prototype.ADD_ATTR = function() {
    return this.getToken(MappingRule.ADD_ATTR, 0);
};

Add_attrContext.prototype.ID = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MappingRule.ID);
    } else {
        return this.getToken(MappingRule.ID, i);
    }
};


Add_attrContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterAdd_attr(this);
	}
};

Add_attrContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitAdd_attr(this);
	}
};

Add_attrContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitAdd_attr(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Add_attrContext = Add_attrContext;

MappingRule.prototype.add_attr = function() {

    var localctx = new Add_attrContext(this, this._ctx, this.state);
    this.enterRule(localctx, 36, MappingRule.RULE_add_attr);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 153;
        this.match(MappingRule.ADD_ATTR);
        this.state = 154;
        localctx.key = this.match(MappingRule.ID);
        this.state = 155;
        localctx.value = this.match(MappingRule.ID);
        this.state = 157;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.ID) {
            this.state = 156;
            localctx.description = this.match(MappingRule.ID);
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function Delete_attrContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_delete_attr;
    this.key = null; // Token
    return this;
}

Delete_attrContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Delete_attrContext.prototype.constructor = Delete_attrContext;

Delete_attrContext.prototype.DELETE_ATTR = function() {
    return this.getToken(MappingRule.DELETE_ATTR, 0);
};

Delete_attrContext.prototype.ID = function() {
    return this.getToken(MappingRule.ID, 0);
};

Delete_attrContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterDelete_attr(this);
	}
};

Delete_attrContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitDelete_attr(this);
	}
};

Delete_attrContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitDelete_attr(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.Delete_attrContext = Delete_attrContext;

MappingRule.prototype.delete_attr = function() {

    var localctx = new Delete_attrContext(this, this._ctx, this.state);
    this.enterRule(localctx, 38, MappingRule.RULE_delete_attr);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 159;
        this.match(MappingRule.DELETE_ATTR);
        this.state = 160;
        localctx.key = this.match(MappingRule.ID);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


function ScopeContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = MappingRule.RULE_scope;
    return this;
}

ScopeContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ScopeContext.prototype.constructor = ScopeContext;

ScopeContext.prototype.candidate = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(CandidateContext);
    } else {
        return this.getTypedRuleContext(CandidateContext,i);
    }
};

ScopeContext.prototype.GT = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(MappingRule.GT);
    } else {
        return this.getToken(MappingRule.GT, i);
    }
};


ScopeContext.prototype.enterRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.enterScope(this);
	}
};

ScopeContext.prototype.exitRule = function(listener) {
    if(listener instanceof MappingRuleListener ) {
        listener.exitScope(this);
	}
};

ScopeContext.prototype.accept = function(visitor) {
    if ( visitor instanceof MappingRuleVisitor ) {
        return visitor.visitScope(this);
    } else {
        return visitor.visitChildren(this);
    }
};




MappingRule.ScopeContext = ScopeContext;

MappingRule.prototype.scope = function() {

    var localctx = new ScopeContext(this, this._ctx, this.state);
    this.enterRule(localctx, 40, MappingRule.RULE_scope);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 162;
        this.candidate();
        this.state = 167;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===MappingRule.GT) {
            this.state = 163;
            this.match(MappingRule.GT);
            this.state = 164;
            this.candidate();
            this.state = 169;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


exports.MappingRule = MappingRule;
