// Generated from src\test\java\com\freelog\ccg\MappingRule.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var MappingRuleListener = require('./MappingRuleListener').MappingRuleListener;
var MappingRuleVisitor = require('./MappingRuleVisitor').MappingRuleVisitor;

var grammarFileName = "MappingRule.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u001b\u009d\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004",
    "\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007",
    "\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f",
    "\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010",
    "\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014",
    "\t\u0014\u0003\u0002\u0007\u0002*\n\u0002\f\u0002\u000e\u0002-\u000b",
    "\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u00032\n\u0003\u0003",
    "\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0007\u0003\u0007\u0005\u0007C\n\u0007\u0003\b\u0003\b",
    "\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bK\n\b\u0003\t\u0003\t\u0003",
    "\t\u0003\t\u0003\t\u0003\n\u0003\n\u0007\nT\n\n\f\n\u000e\nW\u000b\n",
    "\u0003\n\u0003\n\u0005\n[\n\n\u0003\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0005\u000be",
    "\n\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f\u0007\fl\n\f\f\f\u000e",
    "\fo\u000b\f\u0005\fq\n\f\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0007\r{\n\r\f\r\u000e\r~\u000b\r\u0005\r\u0080\n",
    "\r\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u0010\u0003",
    "\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0003",
    "\u0012\u0003\u0012\u0003\u0012\u0005\u0012\u0090\n\u0012\u0003\u0013",
    "\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014",
    "\u0098\n\u0014\f\u0014\u000e\u0014\u009b\u000b\u0014\u0003\u0014\u0002",
    "\u0002\u0015\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018",
    "\u001a\u001c\u001e \"$&\u0002\u0002\u0002\u009d\u0002+\u0003\u0002\u0002",
    "\u0002\u00041\u0003\u0002\u0002\u0002\u00063\u0003\u0002\u0002\u0002",
    "\b9\u0003\u0002\u0002\u0002\n=\u0003\u0002\u0002\u0002\fB\u0003\u0002",
    "\u0002\u0002\u000eD\u0003\u0002\u0002\u0002\u0010L\u0003\u0002\u0002",
    "\u0002\u0012Z\u0003\u0002\u0002\u0002\u0014d\u0003\u0002\u0002\u0002",
    "\u0016p\u0003\u0002\u0002\u0002\u0018r\u0003\u0002\u0002\u0002\u001a",
    "\u0081\u0003\u0002\u0002\u0002\u001c\u0083\u0003\u0002\u0002\u0002\u001e",
    "\u0085\u0003\u0002\u0002\u0002 \u0088\u0003\u0002\u0002\u0002\"\u008b",
    "\u0003\u0002\u0002\u0002$\u0091\u0003\u0002\u0002\u0002&\u0094\u0003",
    "\u0002\u0002\u0002(*\u0005\u0004\u0003\u0002)(\u0003\u0002\u0002\u0002",
    "*-\u0003\u0002\u0002\u0002+)\u0003\u0002\u0002\u0002+,\u0003\u0002\u0002",
    "\u0002,\u0003\u0003\u0002\u0002\u0002-+\u0003\u0002\u0002\u0002.2\u0005",
    "\u0006\u0004\u0002/2\u0005\b\u0005\u000202\u0005\n\u0006\u00021.\u0003",
    "\u0002\u0002\u00021/\u0003\u0002\u0002\u000210\u0003\u0002\u0002\u0002",
    "2\u0005\u0003\u0002\u0002\u000234\u0007\u0003\u0002\u000245\u0005\f",
    "\u0007\u000256\u0007\u0006\u0002\u000267\u0007\u0019\u0002\u000278\u0005",
    "\u0012\n\u00028\u0007\u0003\u0002\u0002\u00029:\u0007\u0004\u0002\u0002",
    ":;\u0007\u0019\u0002\u0002;<\u0005\u0012\n\u0002<\t\u0003\u0002\u0002",
    "\u0002=>\u0007\u0005\u0002\u0002>?\u0007\u0019\u0002\u0002?\u000b\u0003",
    "\u0002\u0002\u0002@C\u0005\u000e\b\u0002AC\u0005\u0010\t\u0002B@\u0003",
    "\u0002\u0002\u0002BA\u0003\u0002\u0002\u0002C\r\u0003\u0002\u0002\u0002",
    "DE\u0007\u0013\u0002\u0002EF\u0007\u0019\u0002\u0002FG\u0007\u0016\u0002",
    "\u0002GJ\u0007\u0019\u0002\u0002HI\u0007\u0014\u0002\u0002IK\u0007\u001b",
    "\u0002\u0002JH\u0003\u0002\u0002\u0002JK\u0003\u0002\u0002\u0002K\u000f",
    "\u0003\u0002\u0002\u0002LM\u0007\u0015\u0002\u0002MN\u0007\u0019\u0002",
    "\u0002NO\u0007\u0016\u0002\u0002OP\u0007\u0019\u0002\u0002P\u0011\u0003",
    "\u0002\u0002\u0002QU\u0007\u0007\u0002\u0002RT\u0005\u0014\u000b\u0002",
    "SR\u0003\u0002\u0002\u0002TW\u0003\u0002\u0002\u0002US\u0003\u0002\u0002",
    "\u0002UV\u0003\u0002\u0002\u0002VX\u0003\u0002\u0002\u0002WU\u0003\u0002",
    "\u0002\u0002X[\u0007\b\u0002\u0002Y[\u0005\u0014\u000b\u0002ZQ\u0003",
    "\u0002\u0002\u0002ZY\u0003\u0002\u0002\u0002[\u0013\u0003\u0002\u0002",
    "\u0002\\e\u0005\u0016\f\u0002]e\u0005\u0018\r\u0002^e\u0005\u001a\u000e",
    "\u0002_e\u0005\u001c\u000f\u0002`e\u0005\u001e\u0010\u0002ae\u0005 ",
    "\u0011\u0002be\u0005\"\u0012\u0002ce\u0005$\u0013\u0002d\\\u0003\u0002",
    "\u0002\u0002d]\u0003\u0002\u0002\u0002d^\u0003\u0002\u0002\u0002d_\u0003",
    "\u0002\u0002\u0002d`\u0003\u0002\u0002\u0002da\u0003\u0002\u0002\u0002",
    "db\u0003\u0002\u0002\u0002dc\u0003\u0002\u0002\u0002e\u0015\u0003\u0002",
    "\u0002\u0002fq\u0007\t\u0002\u0002gh\u0007\t\u0002\u0002hm\u0007\u0019",
    "\u0002\u0002ij\u0007\u0018\u0002\u0002jl\u0007\u0019\u0002\u0002ki\u0003",
    "\u0002\u0002\u0002lo\u0003\u0002\u0002\u0002mk\u0003\u0002\u0002\u0002",
    "mn\u0003\u0002\u0002\u0002nq\u0003\u0002\u0002\u0002om\u0003\u0002\u0002",
    "\u0002pf\u0003\u0002\u0002\u0002pg\u0003\u0002\u0002\u0002q\u0017\u0003",
    "\u0002\u0002\u0002rs\u0007\n\u0002\u0002st\u0005\f\u0007\u0002tu\u0007",
    "\u0011\u0002\u0002u\u007f\u0005\f\u0007\u0002vw\u0007\u0012\u0002\u0002",
    "w|\u0005&\u0014\u0002xy\u0007\u0018\u0002\u0002y{\u0005&\u0014\u0002",
    "zx\u0003\u0002\u0002\u0002{~\u0003\u0002\u0002\u0002|z\u0003\u0002\u0002",
    "\u0002|}\u0003\u0002\u0002\u0002}\u0080\u0003\u0002\u0002\u0002~|\u0003",
    "\u0002\u0002\u0002\u007fv\u0003\u0002\u0002\u0002\u007f\u0080\u0003",
    "\u0002\u0002\u0002\u0080\u0019\u0003\u0002\u0002\u0002\u0081\u0082\u0007",
    "\u000b\u0002\u0002\u0082\u001b\u0003\u0002\u0002\u0002\u0083\u0084\u0007",
    "\f\u0002\u0002\u0084\u001d\u0003\u0002\u0002\u0002\u0085\u0086\u0007",
    "\r\u0002\u0002\u0086\u0087\u0007\u0019\u0002\u0002\u0087\u001f\u0003",
    "\u0002\u0002\u0002\u0088\u0089\u0007\u000e\u0002\u0002\u0089\u008a\u0007",
    "\u0019\u0002\u0002\u008a!\u0003\u0002\u0002\u0002\u008b\u008c\u0007",
    "\u000f\u0002\u0002\u008c\u008d\u0007\u0019\u0002\u0002\u008d\u008f\u0007",
    "\u0019\u0002\u0002\u008e\u0090\u0007\u0019\u0002\u0002\u008f\u008e\u0003",
    "\u0002\u0002\u0002\u008f\u0090\u0003\u0002\u0002\u0002\u0090#\u0003",
    "\u0002\u0002\u0002\u0091\u0092\u0007\u0010\u0002\u0002\u0092\u0093\u0007",
    "\u0019\u0002\u0002\u0093%\u0003\u0002\u0002\u0002\u0094\u0099\u0005",
    "\f\u0007\u0002\u0095\u0096\u0007\u0017\u0002\u0002\u0096\u0098\u0005",
    "\f\u0007\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0098\u009b\u0003",
    "\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u0099\u009a\u0003",
    "\u0002\u0002\u0002\u009a\'\u0003\u0002\u0002\u0002\u009b\u0099\u0003",
    "\u0002\u0002\u0002\u000f+1BJUZdmp|\u007f\u008f\u0099"].join("");


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
                      "WS", "SEMVER" ];

var ruleNames =  [ "mapping_rule_section", "mapping_rule", "rule_add", "rule_alter", 
                   "rule_activate_theme", "candidate", "resource_name", 
                   "object_name", "action", "line_code", "set_labels", "replace", 
                   "show", "hide", "set_title", "set_cover", "add_attr", 
                   "delete_attr", "scope" ];

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
MappingRule.WS = 24;
MappingRule.SEMVER = 25;

MappingRule.RULE_mapping_rule_section = 0;
MappingRule.RULE_mapping_rule = 1;
MappingRule.RULE_rule_add = 2;
MappingRule.RULE_rule_alter = 3;
MappingRule.RULE_rule_activate_theme = 4;
MappingRule.RULE_candidate = 5;
MappingRule.RULE_resource_name = 6;
MappingRule.RULE_object_name = 7;
MappingRule.RULE_action = 8;
MappingRule.RULE_line_code = 9;
MappingRule.RULE_set_labels = 10;
MappingRule.RULE_replace = 11;
MappingRule.RULE_show = 12;
MappingRule.RULE_hide = 13;
MappingRule.RULE_set_title = 14;
MappingRule.RULE_set_cover = 15;
MappingRule.RULE_add_attr = 16;
MappingRule.RULE_delete_attr = 17;
MappingRule.RULE_scope = 18;


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

Mapping_rule_sectionContext.prototype.mapping_rule = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(Mapping_ruleContext);
    } else {
        return this.getTypedRuleContext(Mapping_ruleContext,i);
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
        this.state = 41;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MappingRule.ADD) | (1 << MappingRule.ALTER) | (1 << MappingRule.ACTIVATE_THEME))) !== 0)) {
            this.state = 38;
            this.mapping_rule();
            this.state = 43;
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
    this.enterRule(localctx, 2, MappingRule.RULE_mapping_rule);
    try {
        this.state = 47;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.ADD:
            this.enterOuterAlt(localctx, 1);
            this.state = 44;
            this.rule_add();
            break;
        case MappingRule.ALTER:
            this.enterOuterAlt(localctx, 2);
            this.state = 45;
            this.rule_alter();
            break;
        case MappingRule.ACTIVATE_THEME:
            this.enterOuterAlt(localctx, 3);
            this.state = 46;
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
    this.enterRule(localctx, 4, MappingRule.RULE_rule_add);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 49;
        this.match(MappingRule.ADD);
        this.state = 50;
        this.candidate();
        this.state = 51;
        this.match(MappingRule.AS);
        this.state = 52;
        this.match(MappingRule.ID);
        this.state = 53;
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
    this.enterRule(localctx, 6, MappingRule.RULE_rule_alter);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 55;
        this.match(MappingRule.ALTER);
        this.state = 56;
        this.match(MappingRule.ID);
        this.state = 57;
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
    this.enterRule(localctx, 8, MappingRule.RULE_rule_activate_theme);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 59;
        this.match(MappingRule.ACTIVATE_THEME);
        this.state = 60;
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
    this.enterRule(localctx, 10, MappingRule.RULE_candidate);
    try {
        this.state = 64;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.DOLLAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 62;
            this.resource_name();
            break;
        case MappingRule.HASH:
            this.enterOuterAlt(localctx, 2);
            this.state = 63;
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
    this.enterRule(localctx, 12, MappingRule.RULE_resource_name);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 66;
        this.match(MappingRule.DOLLAR);
        this.state = 67;
        localctx.userName = this.match(MappingRule.ID);
        this.state = 68;
        this.match(MappingRule.SLASH);
        this.state = 69;
        localctx.resourceName = this.match(MappingRule.ID);
        this.state = 72;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.AT) {
            this.state = 70;
            this.match(MappingRule.AT);
            this.state = 71;
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
    this.enterRule(localctx, 14, MappingRule.RULE_object_name);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 74;
        this.match(MappingRule.HASH);
        this.state = 75;
        localctx.bucketName = this.match(MappingRule.ID);
        this.state = 76;
        this.match(MappingRule.SLASH);
        this.state = 77;
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
    this.enterRule(localctx, 16, MappingRule.RULE_action);
    var _la = 0; // Token type
    try {
        this.state = 88;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.DO:
            this.enterOuterAlt(localctx, 1);
            this.state = 79;
            this.match(MappingRule.DO);
            this.state = 83;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MappingRule.SET_LABELS) | (1 << MappingRule.REPLACE) | (1 << MappingRule.SHOW) | (1 << MappingRule.HIDE) | (1 << MappingRule.SET_TITLE) | (1 << MappingRule.SET_COVER) | (1 << MappingRule.ADD_ATTR) | (1 << MappingRule.DELETE_ATTR))) !== 0)) {
                this.state = 80;
                this.line_code();
                this.state = 85;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 86;
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
            this.state = 87;
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
    this.enterRule(localctx, 18, MappingRule.RULE_line_code);
    try {
        this.state = 98;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.SET_LABELS:
            this.enterOuterAlt(localctx, 1);
            this.state = 90;
            this.set_labels();
            break;
        case MappingRule.REPLACE:
            this.enterOuterAlt(localctx, 2);
            this.state = 91;
            this.replace();
            break;
        case MappingRule.SHOW:
            this.enterOuterAlt(localctx, 3);
            this.state = 92;
            this.show();
            break;
        case MappingRule.HIDE:
            this.enterOuterAlt(localctx, 4);
            this.state = 93;
            this.hide();
            break;
        case MappingRule.SET_TITLE:
            this.enterOuterAlt(localctx, 5);
            this.state = 94;
            this.set_title();
            break;
        case MappingRule.SET_COVER:
            this.enterOuterAlt(localctx, 6);
            this.state = 95;
            this.set_cover();
            break;
        case MappingRule.ADD_ATTR:
            this.enterOuterAlt(localctx, 7);
            this.state = 96;
            this.add_attr();
            break;
        case MappingRule.DELETE_ATTR:
            this.enterOuterAlt(localctx, 8);
            this.state = 97;
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
    this.enterRule(localctx, 20, MappingRule.RULE_set_labels);
    var _la = 0; // Token type
    try {
        this.state = 110;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 100;
            this.match(MappingRule.SET_LABELS);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 101;
            this.match(MappingRule.SET_LABELS);
            this.state = 102;
            this.match(MappingRule.ID);
            this.state = 107;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MappingRule.COMMA) {
                this.state = 103;
                this.match(MappingRule.COMMA);
                this.state = 104;
                this.match(MappingRule.ID);
                this.state = 109;
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
    this.enterRule(localctx, 22, MappingRule.RULE_replace);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 112;
        this.match(MappingRule.REPLACE);
        this.state = 113;
        localctx.target = this.candidate();
        this.state = 114;
        this.match(MappingRule.WITH);
        this.state = 115;
        localctx.source = this.candidate();
        this.state = 125;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.UNDER) {
            this.state = 116;
            this.match(MappingRule.UNDER);
            this.state = 117;
            this.scope();
            this.state = 122;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MappingRule.COMMA) {
                this.state = 118;
                this.match(MappingRule.COMMA);
                this.state = 119;
                this.scope();
                this.state = 124;
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
    this.enterRule(localctx, 24, MappingRule.RULE_show);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 127;
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
    this.enterRule(localctx, 26, MappingRule.RULE_hide);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 129;
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
    return this;
}

Set_titleContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Set_titleContext.prototype.constructor = Set_titleContext;

Set_titleContext.prototype.SET_TITLE = function() {
    return this.getToken(MappingRule.SET_TITLE, 0);
};

Set_titleContext.prototype.ID = function() {
    return this.getToken(MappingRule.ID, 0);
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
    this.enterRule(localctx, 28, MappingRule.RULE_set_title);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 131;
        this.match(MappingRule.SET_TITLE);
        this.state = 132;
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
    return this;
}

Set_coverContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Set_coverContext.prototype.constructor = Set_coverContext;

Set_coverContext.prototype.SET_COVER = function() {
    return this.getToken(MappingRule.SET_COVER, 0);
};

Set_coverContext.prototype.ID = function() {
    return this.getToken(MappingRule.ID, 0);
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
    this.enterRule(localctx, 30, MappingRule.RULE_set_cover);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 134;
        this.match(MappingRule.SET_COVER);
        this.state = 135;
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
    this.enterRule(localctx, 32, MappingRule.RULE_add_attr);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 137;
        this.match(MappingRule.ADD_ATTR);
        this.state = 138;
        localctx.key = this.match(MappingRule.ID);
        this.state = 139;
        localctx.value = this.match(MappingRule.ID);
        this.state = 141;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.ID) {
            this.state = 140;
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
    this.enterRule(localctx, 34, MappingRule.RULE_delete_attr);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 143;
        this.match(MappingRule.DELETE_ATTR);
        this.state = 144;
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
    this.enterRule(localctx, 36, MappingRule.RULE_scope);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 146;
        this.candidate();
        this.state = 151;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===MappingRule.GT) {
            this.state = 147;
            this.match(MappingRule.GT);
            this.state = 148;
            this.candidate();
            this.state = 153;
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
