// Generated from src\test\java\com\freelog\ccg\MappingRule.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var MappingRuleListener = require('./MappingRuleListener').MappingRuleListener;
var MappingRuleVisitor = require('./MappingRuleVisitor').MappingRuleVisitor;

var grammarFileName = "MappingRule.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u001c\u009f\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004",
    "\t\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007",
    "\u0004\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f",
    "\u0004\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0004\u0010\t\u0010",
    "\u0004\u0011\t\u0011\u0004\u0012\t\u0012\u0004\u0013\t\u0013\u0004\u0014",
    "\t\u0014\u0003\u0002\u0007\u0002*\n\u0002\f\u0002\u000e\u0002-\u000b",
    "\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0005",
    "\u00034\n\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003",
    "\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0005\u0007E",
    "\n\u0007\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bM\n",
    "\b\u0003\t\u0003\t\u0003\t\u0003\t\u0003\t\u0003\n\u0003\n\u0007\nV",
    "\n\n\f\n\u000e\nY\u000b\n\u0003\n\u0003\n\u0005\n]\n\n\u0003\u000b\u0003",
    "\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003",
    "\u000b\u0005\u000bg\n\u000b\u0003\f\u0003\f\u0003\f\u0003\f\u0003\f",
    "\u0007\fn\n\f\f\f\u000e\fq\u000b\f\u0005\fs\n\f\u0003\r\u0003\r\u0003",
    "\r\u0003\r\u0003\r\u0003\r\u0003\r\u0003\r\u0007\r}\n\r\f\r\u000e\r",
    "\u0080\u000b\r\u0005\r\u0082\n\r\u0003\u000e\u0003\u000e\u0003\u000f",
    "\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011",
    "\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0012\u0005\u0012",
    "\u0092\n\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0003",
    "\u0014\u0003\u0014\u0007\u0014\u009a\n\u0014\f\u0014\u000e\u0014\u009d",
    "\u000b\u0014\u0003\u0014\u0002\u0002\u0015\u0002\u0004\u0006\b\n\f\u000e",
    "\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0002\u0002\u0002",
    "\u009f\u0002+\u0003\u0002\u0002\u0002\u00043\u0003\u0002\u0002\u0002",
    "\u00065\u0003\u0002\u0002\u0002\b;\u0003\u0002\u0002\u0002\n?\u0003",
    "\u0002\u0002\u0002\fD\u0003\u0002\u0002\u0002\u000eF\u0003\u0002\u0002",
    "\u0002\u0010N\u0003\u0002\u0002\u0002\u0012\\\u0003\u0002\u0002\u0002",
    "\u0014f\u0003\u0002\u0002\u0002\u0016r\u0003\u0002\u0002\u0002\u0018",
    "t\u0003\u0002\u0002\u0002\u001a\u0083\u0003\u0002\u0002\u0002\u001c",
    "\u0085\u0003\u0002\u0002\u0002\u001e\u0087\u0003\u0002\u0002\u0002 ",
    "\u008a\u0003\u0002\u0002\u0002\"\u008d\u0003\u0002\u0002\u0002$\u0093",
    "\u0003\u0002\u0002\u0002&\u0096\u0003\u0002\u0002\u0002(*\u0005\u0004",
    "\u0003\u0002)(\u0003\u0002\u0002\u0002*-\u0003\u0002\u0002\u0002+)\u0003",
    "\u0002\u0002\u0002+,\u0003\u0002\u0002\u0002,.\u0003\u0002\u0002\u0002",
    "-+\u0003\u0002\u0002\u0002./\u0007\u0002\u0002\u0003/\u0003\u0003\u0002",
    "\u0002\u000204\u0005\u0006\u0004\u000214\u0005\b\u0005\u000224\u0005",
    "\n\u0006\u000230\u0003\u0002\u0002\u000231\u0003\u0002\u0002\u00023",
    "2\u0003\u0002\u0002\u00024\u0005\u0003\u0002\u0002\u000256\u0007\u0003",
    "\u0002\u000267\u0005\f\u0007\u000278\u0007\u0006\u0002\u000289\u0007",
    "\u0019\u0002\u00029:\u0005\u0012\n\u0002:\u0007\u0003\u0002\u0002\u0002",
    ";<\u0007\u0004\u0002\u0002<=\u0007\u0019\u0002\u0002=>\u0005\u0012\n",
    "\u0002>\t\u0003\u0002\u0002\u0002?@\u0007\u0005\u0002\u0002@A\u0007",
    "\u0019\u0002\u0002A\u000b\u0003\u0002\u0002\u0002BE\u0005\u000e\b\u0002",
    "CE\u0005\u0010\t\u0002DB\u0003\u0002\u0002\u0002DC\u0003\u0002\u0002",
    "\u0002E\r\u0003\u0002\u0002\u0002FG\u0007\u0013\u0002\u0002GH\u0007",
    "\u0019\u0002\u0002HI\u0007\u0016\u0002\u0002IL\u0007\u0019\u0002\u0002",
    "JK\u0007\u0014\u0002\u0002KM\u0007\u001c\u0002\u0002LJ\u0003\u0002\u0002",
    "\u0002LM\u0003\u0002\u0002\u0002M\u000f\u0003\u0002\u0002\u0002NO\u0007",
    "\u0015\u0002\u0002OP\u0007\u0019\u0002\u0002PQ\u0007\u0016\u0002\u0002",
    "QR\u0007\u0019\u0002\u0002R\u0011\u0003\u0002\u0002\u0002SW\u0007\u0007",
    "\u0002\u0002TV\u0005\u0014\u000b\u0002UT\u0003\u0002\u0002\u0002VY\u0003",
    "\u0002\u0002\u0002WU\u0003\u0002\u0002\u0002WX\u0003\u0002\u0002\u0002",
    "XZ\u0003\u0002\u0002\u0002YW\u0003\u0002\u0002\u0002Z]\u0007\b\u0002",
    "\u0002[]\u0005\u0014\u000b\u0002\\S\u0003\u0002\u0002\u0002\\[\u0003",
    "\u0002\u0002\u0002]\u0013\u0003\u0002\u0002\u0002^g\u0005\u0016\f\u0002",
    "_g\u0005\u0018\r\u0002`g\u0005\u001a\u000e\u0002ag\u0005\u001c\u000f",
    "\u0002bg\u0005\u001e\u0010\u0002cg\u0005 \u0011\u0002dg\u0005\"\u0012",
    "\u0002eg\u0005$\u0013\u0002f^\u0003\u0002\u0002\u0002f_\u0003\u0002",
    "\u0002\u0002f`\u0003\u0002\u0002\u0002fa\u0003\u0002\u0002\u0002fb\u0003",
    "\u0002\u0002\u0002fc\u0003\u0002\u0002\u0002fd\u0003\u0002\u0002\u0002",
    "fe\u0003\u0002\u0002\u0002g\u0015\u0003\u0002\u0002\u0002hs\u0007\t",
    "\u0002\u0002ij\u0007\t\u0002\u0002jo\u0007\u0019\u0002\u0002kl\u0007",
    "\u0018\u0002\u0002ln\u0007\u0019\u0002\u0002mk\u0003\u0002\u0002\u0002",
    "nq\u0003\u0002\u0002\u0002om\u0003\u0002\u0002\u0002op\u0003\u0002\u0002",
    "\u0002ps\u0003\u0002\u0002\u0002qo\u0003\u0002\u0002\u0002rh\u0003\u0002",
    "\u0002\u0002ri\u0003\u0002\u0002\u0002s\u0017\u0003\u0002\u0002\u0002",
    "tu\u0007\n\u0002\u0002uv\u0005\f\u0007\u0002vw\u0007\u0011\u0002\u0002",
    "w\u0081\u0005\f\u0007\u0002xy\u0007\u0012\u0002\u0002y~\u0005&\u0014",
    "\u0002z{\u0007\u0018\u0002\u0002{}\u0005&\u0014\u0002|z\u0003\u0002",
    "\u0002\u0002}\u0080\u0003\u0002\u0002\u0002~|\u0003\u0002\u0002\u0002",
    "~\u007f\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002",
    "\u0080~\u0003\u0002\u0002\u0002\u0081x\u0003\u0002\u0002\u0002\u0081",
    "\u0082\u0003\u0002\u0002\u0002\u0082\u0019\u0003\u0002\u0002\u0002\u0083",
    "\u0084\u0007\u000b\u0002\u0002\u0084\u001b\u0003\u0002\u0002\u0002\u0085",
    "\u0086\u0007\f\u0002\u0002\u0086\u001d\u0003\u0002\u0002\u0002\u0087",
    "\u0088\u0007\r\u0002\u0002\u0088\u0089\u0007\u001a\u0002\u0002\u0089",
    "\u001f\u0003\u0002\u0002\u0002\u008a\u008b\u0007\u000e\u0002\u0002\u008b",
    "\u008c\u0007\u001a\u0002\u0002\u008c!\u0003\u0002\u0002\u0002\u008d",
    "\u008e\u0007\u000f\u0002\u0002\u008e\u008f\u0007\u0019\u0002\u0002\u008f",
    "\u0091\u0007\u0019\u0002\u0002\u0090\u0092\u0007\u0019\u0002\u0002\u0091",
    "\u0090\u0003\u0002\u0002\u0002\u0091\u0092\u0003\u0002\u0002\u0002\u0092",
    "#\u0003\u0002\u0002\u0002\u0093\u0094\u0007\u0010\u0002\u0002\u0094",
    "\u0095\u0007\u0019\u0002\u0002\u0095%\u0003\u0002\u0002\u0002\u0096",
    "\u009b\u0005\f\u0007\u0002\u0097\u0098\u0007\u0017\u0002\u0002\u0098",
    "\u009a\u0005\f\u0007\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u009a",
    "\u009d\u0003\u0002\u0002\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009b",
    "\u009c\u0003\u0002\u0002\u0002\u009c\'\u0003\u0002\u0002\u0002\u009d",
    "\u009b\u0003\u0002\u0002\u0002\u000f+3DLW\\for~\u0081\u0091\u009b"].join("");


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
                      "STRING", "WS", "SEMVER" ];

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
MappingRule.STRING = 24;
MappingRule.WS = 25;
MappingRule.SEMVER = 26;

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

Mapping_rule_sectionContext.prototype.EOF = function() {
    return this.getToken(MappingRule.EOF, 0);
};

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
        this.state = 44;
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
        this.state = 49;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.ADD:
            this.enterOuterAlt(localctx, 1);
            this.state = 46;
            this.rule_add();
            break;
        case MappingRule.ALTER:
            this.enterOuterAlt(localctx, 2);
            this.state = 47;
            this.rule_alter();
            break;
        case MappingRule.ACTIVATE_THEME:
            this.enterOuterAlt(localctx, 3);
            this.state = 48;
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
        this.state = 51;
        this.match(MappingRule.ADD);
        this.state = 52;
        this.candidate();
        this.state = 53;
        this.match(MappingRule.AS);
        this.state = 54;
        this.match(MappingRule.ID);
        this.state = 55;
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
        this.state = 57;
        this.match(MappingRule.ALTER);
        this.state = 58;
        this.match(MappingRule.ID);
        this.state = 59;
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
        this.state = 61;
        this.match(MappingRule.ACTIVATE_THEME);
        this.state = 62;
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
        this.state = 66;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.DOLLAR:
            this.enterOuterAlt(localctx, 1);
            this.state = 64;
            this.resource_name();
            break;
        case MappingRule.HASH:
            this.enterOuterAlt(localctx, 2);
            this.state = 65;
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
        this.state = 68;
        this.match(MappingRule.DOLLAR);
        this.state = 69;
        localctx.userName = this.match(MappingRule.ID);
        this.state = 70;
        this.match(MappingRule.SLASH);
        this.state = 71;
        localctx.resourceName = this.match(MappingRule.ID);
        this.state = 74;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.AT) {
            this.state = 72;
            this.match(MappingRule.AT);
            this.state = 73;
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
        this.state = 76;
        this.match(MappingRule.HASH);
        this.state = 77;
        localctx.bucketName = this.match(MappingRule.ID);
        this.state = 78;
        this.match(MappingRule.SLASH);
        this.state = 79;
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
        this.state = 90;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.DO:
            this.enterOuterAlt(localctx, 1);
            this.state = 81;
            this.match(MappingRule.DO);
            this.state = 85;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << MappingRule.SET_LABELS) | (1 << MappingRule.REPLACE) | (1 << MappingRule.SHOW) | (1 << MappingRule.HIDE) | (1 << MappingRule.SET_TITLE) | (1 << MappingRule.SET_COVER) | (1 << MappingRule.ADD_ATTR) | (1 << MappingRule.DELETE_ATTR))) !== 0)) {
                this.state = 82;
                this.line_code();
                this.state = 87;
                this._errHandler.sync(this);
                _la = this._input.LA(1);
            }
            this.state = 88;
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
            this.state = 89;
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
        this.state = 100;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case MappingRule.SET_LABELS:
            this.enterOuterAlt(localctx, 1);
            this.state = 92;
            this.set_labels();
            break;
        case MappingRule.REPLACE:
            this.enterOuterAlt(localctx, 2);
            this.state = 93;
            this.replace();
            break;
        case MappingRule.SHOW:
            this.enterOuterAlt(localctx, 3);
            this.state = 94;
            this.show();
            break;
        case MappingRule.HIDE:
            this.enterOuterAlt(localctx, 4);
            this.state = 95;
            this.hide();
            break;
        case MappingRule.SET_TITLE:
            this.enterOuterAlt(localctx, 5);
            this.state = 96;
            this.set_title();
            break;
        case MappingRule.SET_COVER:
            this.enterOuterAlt(localctx, 6);
            this.state = 97;
            this.set_cover();
            break;
        case MappingRule.ADD_ATTR:
            this.enterOuterAlt(localctx, 7);
            this.state = 98;
            this.add_attr();
            break;
        case MappingRule.DELETE_ATTR:
            this.enterOuterAlt(localctx, 8);
            this.state = 99;
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
        this.state = 112;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 102;
            this.match(MappingRule.SET_LABELS);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 103;
            this.match(MappingRule.SET_LABELS);
            this.state = 104;
            this.match(MappingRule.ID);
            this.state = 109;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MappingRule.COMMA) {
                this.state = 105;
                this.match(MappingRule.COMMA);
                this.state = 106;
                this.match(MappingRule.ID);
                this.state = 111;
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
        this.state = 114;
        this.match(MappingRule.REPLACE);
        this.state = 115;
        localctx.target = this.candidate();
        this.state = 116;
        this.match(MappingRule.WITH);
        this.state = 117;
        localctx.source = this.candidate();
        this.state = 127;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.UNDER) {
            this.state = 118;
            this.match(MappingRule.UNDER);
            this.state = 119;
            this.scope();
            this.state = 124;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
            while(_la===MappingRule.COMMA) {
                this.state = 120;
                this.match(MappingRule.COMMA);
                this.state = 121;
                this.scope();
                this.state = 126;
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
        this.state = 129;
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
        this.state = 131;
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
    this.enterRule(localctx, 28, MappingRule.RULE_set_title);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 133;
        this.match(MappingRule.SET_TITLE);
        this.state = 134;
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
    this.enterRule(localctx, 30, MappingRule.RULE_set_cover);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 136;
        this.match(MappingRule.SET_COVER);
        this.state = 137;
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
    this.enterRule(localctx, 32, MappingRule.RULE_add_attr);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 139;
        this.match(MappingRule.ADD_ATTR);
        this.state = 140;
        localctx.key = this.match(MappingRule.ID);
        this.state = 141;
        localctx.value = this.match(MappingRule.ID);
        this.state = 143;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if(_la===MappingRule.ID) {
            this.state = 142;
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
    this.enterRule(localctx, 34, MappingRule.RULE_delete_attr);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 145;
        this.match(MappingRule.DELETE_ATTR);
        this.state = 146;
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
    this.enterRule(localctx, 36, MappingRule.RULE_scope);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 148;
        this.candidate();
        this.state = 153;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===MappingRule.GT) {
            this.state = 149;
            this.match(MappingRule.GT);
            this.state = 150;
            this.candidate();
            this.state = 155;
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
