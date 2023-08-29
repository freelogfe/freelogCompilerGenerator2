// Generated from src\test\java\com\freelog\cgg\ExpressionDefinition.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');
var ExpressionDefinitionListener = require('./ExpressionDefinitionListener').ExpressionDefinitionListener;
var ExpressionDefinitionVisitor = require('./ExpressionDefinitionVisitor').ExpressionDefinitionVisitor;

var grammarFileName = "ExpressionDefinition.g4";


var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u0013\\\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0003",
    "\u0002\u0006\u0002\u001a\n\u0002\r\u0002\u000e\u0002\u001b\u0003\u0002",
    "\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003\"\n\u0003\u0003\u0004",
    "\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004",
    "\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0007\u0004",
    "0\n\u0004\f\u0004\u000e\u00043\u000b\u0004\u0003\u0005\u0003\u0005\u0003",
    "\u0005\u0003\u0005\u0005\u00059\n\u0005\u0003\u0006\u0003\u0006\u0003",
    "\u0006\u0003\u0006\u0003\u0006\u0007\u0006@\n\u0006\f\u0006\u000e\u0006",
    "C\u000b\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003",
    "\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0003\b\u0005\bP\n\b\u0003",
    "\t\u0003\t\u0003\n\u0003\n\u0003\u000b\u0003\u000b\u0005\u000bX\n\u000b",
    "\u0003\f\u0003\f\u0003\f\u0002\u0003\u0006\r\u0002\u0004\u0006\b\n\f",
    "\u000e\u0010\u0012\u0014\u0016\u0002\u0006\u0003\u0002\u000f\u0010\u0003",
    "\u0002\r\u000e\u0003\u0002\u0003\u0004\u0003\u0002\b\t\u0002\\\u0002",
    "\u0019\u0003\u0002\u0002\u0002\u0004!\u0003\u0002\u0002\u0002\u0006",
    "#\u0003\u0002\u0002\u0002\b8\u0003\u0002\u0002\u0002\n:\u0003\u0002",
    "\u0002\u0002\fF\u0003\u0002\u0002\u0002\u000eO\u0003\u0002\u0002\u0002",
    "\u0010Q\u0003\u0002\u0002\u0002\u0012S\u0003\u0002\u0002\u0002\u0014",
    "W\u0003\u0002\u0002\u0002\u0016Y\u0003\u0002\u0002\u0002\u0018\u001a",
    "\u0005\u0004\u0003\u0002\u0019\u0018\u0003\u0002\u0002\u0002\u001a\u001b",
    "\u0003\u0002\u0002\u0002\u001b\u0019\u0003\u0002\u0002\u0002\u001b\u001c",
    "\u0003\u0002\u0002\u0002\u001c\u001d\u0003\u0002\u0002\u0002\u001d\u001e",
    "\u0007\u0002\u0002\u0003\u001e\u0003\u0003\u0002\u0002\u0002\u001f\"",
    "\u0005\u0006\u0004\u0002 \"\u0007\u0013\u0002\u0002!\u001f\u0003\u0002",
    "\u0002\u0002! \u0003\u0002\u0002\u0002\"\u0005\u0003\u0002\u0002\u0002",
    "#$\b\u0004\u0001\u0002$%\u0005\b\u0005\u0002%1\u0003\u0002\u0002\u0002",
    "&\'\f\u0006\u0002\u0002\'(\u0007\u0011\u0002\u0002(0\u0005\u0006\u0004",
    "\u0007)*\f\u0005\u0002\u0002*+\t\u0002\u0002\u0002+0\u0005\u0006\u0004",
    "\u0006,-\f\u0004\u0002\u0002-.\t\u0003\u0002\u0002.0\u0005\u0006\u0004",
    "\u0005/&\u0003\u0002\u0002\u0002/)\u0003\u0002\u0002\u0002/,\u0003\u0002",
    "\u0002\u000203\u0003\u0002\u0002\u00021/\u0003\u0002\u0002\u000212\u0003",
    "\u0002\u0002\u00022\u0007\u0003\u0002\u0002\u000231\u0003\u0002\u0002",
    "\u000245\t\u0003\u0002\u000259\u0005\b\u0005\u000269\u0005\n\u0006\u0002",
    "79\u0005\u000e\b\u000284\u0003\u0002\u0002\u000286\u0003\u0002\u0002",
    "\u000287\u0003\u0002\u0002\u00029\t\u0003\u0002\u0002\u0002:;\u0005",
    "\f\u0007\u0002;<\u0007\u000b\u0002\u0002<A\u0005\u0006\u0004\u0002=",
    ">\u0007\n\u0002\u0002>@\u0005\u0006\u0004\u0002?=\u0003\u0002\u0002",
    "\u0002@C\u0003\u0002\u0002\u0002A?\u0003\u0002\u0002\u0002AB\u0003\u0002",
    "\u0002\u0002BD\u0003\u0002\u0002\u0002CA\u0003\u0002\u0002\u0002DE\u0007",
    "\f\u0002\u0002E\u000b\u0003\u0002\u0002\u0002FG\t\u0004\u0002\u0002",
    "G\r\u0003\u0002\u0002\u0002HP\u0005\u0010\t\u0002IP\u0005\u0012\n\u0002",
    "JK\u0007\u000b\u0002\u0002KL\u0005\u0006\u0004\u0002LM\u0007\f\u0002",
    "\u0002MP\u0003\u0002\u0002\u0002NP\u0005\u0014\u000b\u0002OH\u0003\u0002",
    "\u0002\u0002OI\u0003\u0002\u0002\u0002OJ\u0003\u0002\u0002\u0002ON\u0003",
    "\u0002\u0002\u0002P\u000f\u0003\u0002\u0002\u0002QR\u0007\u0005\u0002",
    "\u0002R\u0011\u0003\u0002\u0002\u0002ST\t\u0005\u0002\u0002T\u0013\u0003",
    "\u0002\u0002\u0002UX\u0005\u0016\f\u0002VX\u0007\u0012\u0002\u0002W",
    "U\u0003\u0002\u0002\u0002WV\u0003\u0002\u0002\u0002X\u0015\u0003\u0002",
    "\u0002\u0002YZ\u0007\u0006\u0002\u0002Z\u0017\u0003\u0002\u0002\u0002",
    "\n\u001b!/18AOW"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'sum'", "'avg'", null, null, "'exhibited'", 
                     "'pi'", "'e'", "','", "'('", "')'", "'+'", "'-'", "'*'", 
                     "'/'", "'^'" ];

var symbolicNames = [ null, null, null, "SCIENTIFIC_NUMBER", "VARIABLE_CONTRACT", 
                      "VARIABLE_CONTRACT_ATTRIBUTE", "PI", "EULER", "COMMA", 
                      "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", 
                      "POW", "ID", "NEWLINE" ];

var ruleNames =  [ "prog", "stat", "expression", "signedAtom", "built_in_function", 
                   "funcname", "atom", "scientific", "constant", "variable", 
                   "environment_variable" ];

function ExpressionDefinitionParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

ExpressionDefinitionParser.prototype = Object.create(antlr4.Parser.prototype);
ExpressionDefinitionParser.prototype.constructor = ExpressionDefinitionParser;

Object.defineProperty(ExpressionDefinitionParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

ExpressionDefinitionParser.EOF = antlr4.Token.EOF;
ExpressionDefinitionParser.T__0 = 1;
ExpressionDefinitionParser.T__1 = 2;
ExpressionDefinitionParser.SCIENTIFIC_NUMBER = 3;
ExpressionDefinitionParser.VARIABLE_CONTRACT = 4;
ExpressionDefinitionParser.VARIABLE_CONTRACT_ATTRIBUTE = 5;
ExpressionDefinitionParser.PI = 6;
ExpressionDefinitionParser.EULER = 7;
ExpressionDefinitionParser.COMMA = 8;
ExpressionDefinitionParser.LPAREN = 9;
ExpressionDefinitionParser.RPAREN = 10;
ExpressionDefinitionParser.PLUS = 11;
ExpressionDefinitionParser.MINUS = 12;
ExpressionDefinitionParser.TIMES = 13;
ExpressionDefinitionParser.DIV = 14;
ExpressionDefinitionParser.POW = 15;
ExpressionDefinitionParser.ID = 16;
ExpressionDefinitionParser.NEWLINE = 17;

ExpressionDefinitionParser.RULE_prog = 0;
ExpressionDefinitionParser.RULE_stat = 1;
ExpressionDefinitionParser.RULE_expression = 2;
ExpressionDefinitionParser.RULE_signedAtom = 3;
ExpressionDefinitionParser.RULE_built_in_function = 4;
ExpressionDefinitionParser.RULE_funcname = 5;
ExpressionDefinitionParser.RULE_atom = 6;
ExpressionDefinitionParser.RULE_scientific = 7;
ExpressionDefinitionParser.RULE_constant = 8;
ExpressionDefinitionParser.RULE_variable = 9;
ExpressionDefinitionParser.RULE_environment_variable = 10;


function ProgContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_prog;
    return this;
}

ProgContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ProgContext.prototype.constructor = ProgContext;

ProgContext.prototype.EOF = function() {
    return this.getToken(ExpressionDefinitionParser.EOF, 0);
};

ProgContext.prototype.stat = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatContext);
    } else {
        return this.getTypedRuleContext(StatContext,i);
    }
};

ProgContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterProg(this);
	}
};

ProgContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitProg(this);
	}
};

ProgContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitProg(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ExpressionDefinitionParser.ProgContext = ProgContext;

ExpressionDefinitionParser.prototype.prog = function() {

    var localctx = new ProgContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, ExpressionDefinitionParser.RULE_prog);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 23; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 22;
            this.stat();
            this.state = 25; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << ExpressionDefinitionParser.T__0) | (1 << ExpressionDefinitionParser.T__1) | (1 << ExpressionDefinitionParser.SCIENTIFIC_NUMBER) | (1 << ExpressionDefinitionParser.VARIABLE_CONTRACT) | (1 << ExpressionDefinitionParser.PI) | (1 << ExpressionDefinitionParser.EULER) | (1 << ExpressionDefinitionParser.LPAREN) | (1 << ExpressionDefinitionParser.PLUS) | (1 << ExpressionDefinitionParser.MINUS) | (1 << ExpressionDefinitionParser.ID) | (1 << ExpressionDefinitionParser.NEWLINE))) !== 0));
        this.state = 27;
        this.match(ExpressionDefinitionParser.EOF);
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


function StatContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_stat;
    return this;
}

StatContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatContext.prototype.constructor = StatContext;


 
StatContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};


function BlankContext(parser, ctx) {
	StatContext.call(this, parser);
    StatContext.prototype.copyFrom.call(this, ctx);
    return this;
}

BlankContext.prototype = Object.create(StatContext.prototype);
BlankContext.prototype.constructor = BlankContext;

ExpressionDefinitionParser.BlankContext = BlankContext;

BlankContext.prototype.NEWLINE = function() {
    return this.getToken(ExpressionDefinitionParser.NEWLINE, 0);
};
BlankContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterBlank(this);
	}
};

BlankContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitBlank(this);
	}
};

BlankContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitBlank(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function PrintExprContext(parser, ctx) {
	StatContext.call(this, parser);
    StatContext.prototype.copyFrom.call(this, ctx);
    return this;
}

PrintExprContext.prototype = Object.create(StatContext.prototype);
PrintExprContext.prototype.constructor = PrintExprContext;

ExpressionDefinitionParser.PrintExprContext = PrintExprContext;

PrintExprContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};
PrintExprContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterPrintExpr(this);
	}
};

PrintExprContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitPrintExpr(this);
	}
};

PrintExprContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitPrintExpr(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ExpressionDefinitionParser.StatContext = StatContext;

ExpressionDefinitionParser.prototype.stat = function() {

    var localctx = new StatContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, ExpressionDefinitionParser.RULE_stat);
    try {
        this.state = 31;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ExpressionDefinitionParser.T__0:
        case ExpressionDefinitionParser.T__1:
        case ExpressionDefinitionParser.SCIENTIFIC_NUMBER:
        case ExpressionDefinitionParser.VARIABLE_CONTRACT:
        case ExpressionDefinitionParser.PI:
        case ExpressionDefinitionParser.EULER:
        case ExpressionDefinitionParser.LPAREN:
        case ExpressionDefinitionParser.PLUS:
        case ExpressionDefinitionParser.MINUS:
        case ExpressionDefinitionParser.ID:
            localctx = new PrintExprContext(this, localctx);
            this.enterOuterAlt(localctx, 1);
            this.state = 29;
            this.expression(0);
            break;
        case ExpressionDefinitionParser.NEWLINE:
            localctx = new BlankContext(this, localctx);
            this.enterOuterAlt(localctx, 2);
            this.state = 30;
            this.match(ExpressionDefinitionParser.NEWLINE);
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


function ExpressionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_expression;
    return this;
}

ExpressionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ExpressionContext.prototype.constructor = ExpressionContext;


 
ExpressionContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};

function CalculateSignContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

CalculateSignContext.prototype = Object.create(ExpressionContext.prototype);
CalculateSignContext.prototype.constructor = CalculateSignContext;

ExpressionDefinitionParser.CalculateSignContext = CalculateSignContext;

CalculateSignContext.prototype.signedAtom = function() {
    return this.getTypedRuleContext(SignedAtomContext,0);
};
CalculateSignContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterCalculateSign(this);
	}
};

CalculateSignContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitCalculateSign(this);
	}
};

CalculateSignContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitCalculateSign(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function CalculatePluContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    this.op = null; // Token;
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

CalculatePluContext.prototype = Object.create(ExpressionContext.prototype);
CalculatePluContext.prototype.constructor = CalculatePluContext;

ExpressionDefinitionParser.CalculatePluContext = CalculatePluContext;

CalculatePluContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};

CalculatePluContext.prototype.PLUS = function() {
    return this.getToken(ExpressionDefinitionParser.PLUS, 0);
};

CalculatePluContext.prototype.MINUS = function() {
    return this.getToken(ExpressionDefinitionParser.MINUS, 0);
};
CalculatePluContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterCalculatePlu(this);
	}
};

CalculatePluContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitCalculatePlu(this);
	}
};

CalculatePluContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitCalculatePlu(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function CalculatePowContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    this.op = null; // Token;
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

CalculatePowContext.prototype = Object.create(ExpressionContext.prototype);
CalculatePowContext.prototype.constructor = CalculatePowContext;

ExpressionDefinitionParser.CalculatePowContext = CalculatePowContext;

CalculatePowContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};

CalculatePowContext.prototype.POW = function() {
    return this.getToken(ExpressionDefinitionParser.POW, 0);
};
CalculatePowContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterCalculatePow(this);
	}
};

CalculatePowContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitCalculatePow(this);
	}
};

CalculatePowContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitCalculatePow(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function CalculateTimContext(parser, ctx) {
	ExpressionContext.call(this, parser);
    this.op = null; // Token;
    ExpressionContext.prototype.copyFrom.call(this, ctx);
    return this;
}

CalculateTimContext.prototype = Object.create(ExpressionContext.prototype);
CalculateTimContext.prototype.constructor = CalculateTimContext;

ExpressionDefinitionParser.CalculateTimContext = CalculateTimContext;

CalculateTimContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};

CalculateTimContext.prototype.TIMES = function() {
    return this.getToken(ExpressionDefinitionParser.TIMES, 0);
};

CalculateTimContext.prototype.DIV = function() {
    return this.getToken(ExpressionDefinitionParser.DIV, 0);
};
CalculateTimContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterCalculateTim(this);
	}
};

CalculateTimContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitCalculateTim(this);
	}
};

CalculateTimContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitCalculateTim(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ExpressionDefinitionParser.prototype.expression = function(_p) {
	if(_p===undefined) {
	    _p = 0;
	}
    var _parentctx = this._ctx;
    var _parentState = this.state;
    var localctx = new ExpressionContext(this, this._ctx, _parentState);
    var _prevctx = localctx;
    var _startState = 4;
    this.enterRecursionRule(localctx, 4, ExpressionDefinitionParser.RULE_expression, _p);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        localctx = new CalculateSignContext(this, localctx);
        this._ctx = localctx;
        _prevctx = localctx;

        this.state = 34;
        this.signedAtom();
        this._ctx.stop = this._input.LT(-1);
        this.state = 47;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,3,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                if(this._parseListeners!==null) {
                    this.triggerExitRuleEvent();
                }
                _prevctx = localctx;
                this.state = 45;
                this._errHandler.sync(this);
                var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
                switch(la_) {
                case 1:
                    localctx = new CalculatePowContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ExpressionDefinitionParser.RULE_expression);
                    this.state = 36;
                    if (!( this.precpred(this._ctx, 4))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 4)");
                    }
                    this.state = 37;
                    localctx.op = this.match(ExpressionDefinitionParser.POW);
                    this.state = 38;
                    this.expression(5);
                    break;

                case 2:
                    localctx = new CalculateTimContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ExpressionDefinitionParser.RULE_expression);
                    this.state = 39;
                    if (!( this.precpred(this._ctx, 3))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 3)");
                    }
                    this.state = 40;
                    localctx.op = this._input.LT(1);
                    _la = this._input.LA(1);
                    if(!(_la===ExpressionDefinitionParser.TIMES || _la===ExpressionDefinitionParser.DIV)) {
                        localctx.op = this._errHandler.recoverInline(this);
                    }
                    else {
                    	this._errHandler.reportMatch(this);
                        this.consume();
                    }
                    this.state = 41;
                    this.expression(4);
                    break;

                case 3:
                    localctx = new CalculatePluContext(this, new ExpressionContext(this, _parentctx, _parentState));
                    this.pushNewRecursionContext(localctx, _startState, ExpressionDefinitionParser.RULE_expression);
                    this.state = 42;
                    if (!( this.precpred(this._ctx, 2))) {
                        throw new antlr4.error.FailedPredicateException(this, "this.precpred(this._ctx, 2)");
                    }
                    this.state = 43;
                    localctx.op = this._input.LT(1);
                    _la = this._input.LA(1);
                    if(!(_la===ExpressionDefinitionParser.PLUS || _la===ExpressionDefinitionParser.MINUS)) {
                        localctx.op = this._errHandler.recoverInline(this);
                    }
                    else {
                    	this._errHandler.reportMatch(this);
                        this.consume();
                    }
                    this.state = 44;
                    this.expression(3);
                    break;

                } 
            }
            this.state = 49;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,3,this._ctx);
        }

    } catch( error) {
        if(error instanceof antlr4.error.RecognitionException) {
	        localctx.exception = error;
	        this._errHandler.reportError(this, error);
	        this._errHandler.recover(this, error);
	    } else {
	    	throw error;
	    }
    } finally {
        this.unrollRecursionContexts(_parentctx)
    }
    return localctx;
};


function SignedAtomContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_signedAtom;
    return this;
}

SignedAtomContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SignedAtomContext.prototype.constructor = SignedAtomContext;


 
SignedAtomContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};


function Signed4FunctionContext(parser, ctx) {
	SignedAtomContext.call(this, parser);
    SignedAtomContext.prototype.copyFrom.call(this, ctx);
    return this;
}

Signed4FunctionContext.prototype = Object.create(SignedAtomContext.prototype);
Signed4FunctionContext.prototype.constructor = Signed4FunctionContext;

ExpressionDefinitionParser.Signed4FunctionContext = Signed4FunctionContext;

Signed4FunctionContext.prototype.built_in_function = function() {
    return this.getTypedRuleContext(Built_in_functionContext,0);
};
Signed4FunctionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterSigned4Function(this);
	}
};

Signed4FunctionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitSigned4Function(this);
	}
};

Signed4FunctionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitSigned4Function(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function Signed4AtomContext(parser, ctx) {
	SignedAtomContext.call(this, parser);
    SignedAtomContext.prototype.copyFrom.call(this, ctx);
    return this;
}

Signed4AtomContext.prototype = Object.create(SignedAtomContext.prototype);
Signed4AtomContext.prototype.constructor = Signed4AtomContext;

ExpressionDefinitionParser.Signed4AtomContext = Signed4AtomContext;

Signed4AtomContext.prototype.atom = function() {
    return this.getTypedRuleContext(AtomContext,0);
};
Signed4AtomContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterSigned4Atom(this);
	}
};

Signed4AtomContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitSigned4Atom(this);
	}
};

Signed4AtomContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitSigned4Atom(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function Signed4SelfContext(parser, ctx) {
	SignedAtomContext.call(this, parser);
    this.op = null; // Token;
    SignedAtomContext.prototype.copyFrom.call(this, ctx);
    return this;
}

Signed4SelfContext.prototype = Object.create(SignedAtomContext.prototype);
Signed4SelfContext.prototype.constructor = Signed4SelfContext;

ExpressionDefinitionParser.Signed4SelfContext = Signed4SelfContext;

Signed4SelfContext.prototype.signedAtom = function() {
    return this.getTypedRuleContext(SignedAtomContext,0);
};

Signed4SelfContext.prototype.PLUS = function() {
    return this.getToken(ExpressionDefinitionParser.PLUS, 0);
};

Signed4SelfContext.prototype.MINUS = function() {
    return this.getToken(ExpressionDefinitionParser.MINUS, 0);
};
Signed4SelfContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterSigned4Self(this);
	}
};

Signed4SelfContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitSigned4Self(this);
	}
};

Signed4SelfContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitSigned4Self(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ExpressionDefinitionParser.SignedAtomContext = SignedAtomContext;

ExpressionDefinitionParser.prototype.signedAtom = function() {

    var localctx = new SignedAtomContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, ExpressionDefinitionParser.RULE_signedAtom);
    var _la = 0; // Token type
    try {
        this.state = 54;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ExpressionDefinitionParser.PLUS:
        case ExpressionDefinitionParser.MINUS:
            localctx = new Signed4SelfContext(this, localctx);
            this.enterOuterAlt(localctx, 1);
            this.state = 50;
            localctx.op = this._input.LT(1);
            _la = this._input.LA(1);
            if(!(_la===ExpressionDefinitionParser.PLUS || _la===ExpressionDefinitionParser.MINUS)) {
                localctx.op = this._errHandler.recoverInline(this);
            }
            else {
            	this._errHandler.reportMatch(this);
                this.consume();
            }
            this.state = 51;
            this.signedAtom();
            break;
        case ExpressionDefinitionParser.T__0:
        case ExpressionDefinitionParser.T__1:
            localctx = new Signed4FunctionContext(this, localctx);
            this.enterOuterAlt(localctx, 2);
            this.state = 52;
            this.built_in_function();
            break;
        case ExpressionDefinitionParser.SCIENTIFIC_NUMBER:
        case ExpressionDefinitionParser.VARIABLE_CONTRACT:
        case ExpressionDefinitionParser.PI:
        case ExpressionDefinitionParser.EULER:
        case ExpressionDefinitionParser.LPAREN:
        case ExpressionDefinitionParser.ID:
            localctx = new Signed4AtomContext(this, localctx);
            this.enterOuterAlt(localctx, 3);
            this.state = 53;
            this.atom();
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


function Built_in_functionContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_built_in_function;
    this._expression = null; // ExpressionContext
    this.args = []; // of ExpressionContexts
    return this;
}

Built_in_functionContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Built_in_functionContext.prototype.constructor = Built_in_functionContext;

Built_in_functionContext.prototype.funcname = function() {
    return this.getTypedRuleContext(FuncnameContext,0);
};

Built_in_functionContext.prototype.LPAREN = function() {
    return this.getToken(ExpressionDefinitionParser.LPAREN, 0);
};

Built_in_functionContext.prototype.RPAREN = function() {
    return this.getToken(ExpressionDefinitionParser.RPAREN, 0);
};

Built_in_functionContext.prototype.expression = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(ExpressionContext);
    } else {
        return this.getTypedRuleContext(ExpressionContext,i);
    }
};

Built_in_functionContext.prototype.COMMA = function(i) {
	if(i===undefined) {
		i = null;
	}
    if(i===null) {
        return this.getTokens(ExpressionDefinitionParser.COMMA);
    } else {
        return this.getToken(ExpressionDefinitionParser.COMMA, i);
    }
};


Built_in_functionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterBuilt_in_function(this);
	}
};

Built_in_functionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitBuilt_in_function(this);
	}
};

Built_in_functionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitBuilt_in_function(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ExpressionDefinitionParser.Built_in_functionContext = Built_in_functionContext;

ExpressionDefinitionParser.prototype.built_in_function = function() {

    var localctx = new Built_in_functionContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, ExpressionDefinitionParser.RULE_built_in_function);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 56;
        this.funcname();
        this.state = 57;
        this.match(ExpressionDefinitionParser.LPAREN);
        this.state = 58;
        localctx._expression = this.expression(0);
        localctx.args.push(localctx._expression);
        this.state = 63;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        while(_la===ExpressionDefinitionParser.COMMA) {
            this.state = 59;
            this.match(ExpressionDefinitionParser.COMMA);
            this.state = 60;
            localctx._expression = this.expression(0);
            localctx.args.push(localctx._expression);
            this.state = 65;
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        }
        this.state = 66;
        this.match(ExpressionDefinitionParser.RPAREN);
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


function FuncnameContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_funcname;
    return this;
}

FuncnameContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
FuncnameContext.prototype.constructor = FuncnameContext;


FuncnameContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterFuncname(this);
	}
};

FuncnameContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitFuncname(this);
	}
};

FuncnameContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitFuncname(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ExpressionDefinitionParser.FuncnameContext = FuncnameContext;

ExpressionDefinitionParser.prototype.funcname = function() {

    var localctx = new FuncnameContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, ExpressionDefinitionParser.RULE_funcname);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 68;
        _la = this._input.LA(1);
        if(!(_la===ExpressionDefinitionParser.T__0 || _la===ExpressionDefinitionParser.T__1)) {
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


function AtomContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_atom;
    return this;
}

AtomContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
AtomContext.prototype.constructor = AtomContext;


 
AtomContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};


function Atom4ScientificContext(parser, ctx) {
	AtomContext.call(this, parser);
    AtomContext.prototype.copyFrom.call(this, ctx);
    return this;
}

Atom4ScientificContext.prototype = Object.create(AtomContext.prototype);
Atom4ScientificContext.prototype.constructor = Atom4ScientificContext;

ExpressionDefinitionParser.Atom4ScientificContext = Atom4ScientificContext;

Atom4ScientificContext.prototype.scientific = function() {
    return this.getTypedRuleContext(ScientificContext,0);
};
Atom4ScientificContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterAtom4Scientific(this);
	}
};

Atom4ScientificContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitAtom4Scientific(this);
	}
};

Atom4ScientificContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitAtom4Scientific(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function Atom4VariableContext(parser, ctx) {
	AtomContext.call(this, parser);
    AtomContext.prototype.copyFrom.call(this, ctx);
    return this;
}

Atom4VariableContext.prototype = Object.create(AtomContext.prototype);
Atom4VariableContext.prototype.constructor = Atom4VariableContext;

ExpressionDefinitionParser.Atom4VariableContext = Atom4VariableContext;

Atom4VariableContext.prototype.variable = function() {
    return this.getTypedRuleContext(VariableContext,0);
};
Atom4VariableContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterAtom4Variable(this);
	}
};

Atom4VariableContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitAtom4Variable(this);
	}
};

Atom4VariableContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitAtom4Variable(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function Atom4ConstantContext(parser, ctx) {
	AtomContext.call(this, parser);
    AtomContext.prototype.copyFrom.call(this, ctx);
    return this;
}

Atom4ConstantContext.prototype = Object.create(AtomContext.prototype);
Atom4ConstantContext.prototype.constructor = Atom4ConstantContext;

ExpressionDefinitionParser.Atom4ConstantContext = Atom4ConstantContext;

Atom4ConstantContext.prototype.constant = function() {
    return this.getTypedRuleContext(ConstantContext,0);
};
Atom4ConstantContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterAtom4Constant(this);
	}
};

Atom4ConstantContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitAtom4Constant(this);
	}
};

Atom4ConstantContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitAtom4Constant(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function Atom4ExpressionContext(parser, ctx) {
	AtomContext.call(this, parser);
    AtomContext.prototype.copyFrom.call(this, ctx);
    return this;
}

Atom4ExpressionContext.prototype = Object.create(AtomContext.prototype);
Atom4ExpressionContext.prototype.constructor = Atom4ExpressionContext;

ExpressionDefinitionParser.Atom4ExpressionContext = Atom4ExpressionContext;

Atom4ExpressionContext.prototype.LPAREN = function() {
    return this.getToken(ExpressionDefinitionParser.LPAREN, 0);
};

Atom4ExpressionContext.prototype.expression = function() {
    return this.getTypedRuleContext(ExpressionContext,0);
};

Atom4ExpressionContext.prototype.RPAREN = function() {
    return this.getToken(ExpressionDefinitionParser.RPAREN, 0);
};
Atom4ExpressionContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterAtom4Expression(this);
	}
};

Atom4ExpressionContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitAtom4Expression(this);
	}
};

Atom4ExpressionContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitAtom4Expression(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ExpressionDefinitionParser.AtomContext = AtomContext;

ExpressionDefinitionParser.prototype.atom = function() {

    var localctx = new AtomContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, ExpressionDefinitionParser.RULE_atom);
    try {
        this.state = 77;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ExpressionDefinitionParser.SCIENTIFIC_NUMBER:
            localctx = new Atom4ScientificContext(this, localctx);
            this.enterOuterAlt(localctx, 1);
            this.state = 70;
            this.scientific();
            break;
        case ExpressionDefinitionParser.PI:
        case ExpressionDefinitionParser.EULER:
            localctx = new Atom4ConstantContext(this, localctx);
            this.enterOuterAlt(localctx, 2);
            this.state = 71;
            this.constant();
            break;
        case ExpressionDefinitionParser.LPAREN:
            localctx = new Atom4ExpressionContext(this, localctx);
            this.enterOuterAlt(localctx, 3);
            this.state = 72;
            this.match(ExpressionDefinitionParser.LPAREN);
            this.state = 73;
            this.expression(0);
            this.state = 74;
            this.match(ExpressionDefinitionParser.RPAREN);
            break;
        case ExpressionDefinitionParser.VARIABLE_CONTRACT:
        case ExpressionDefinitionParser.ID:
            localctx = new Atom4VariableContext(this, localctx);
            this.enterOuterAlt(localctx, 4);
            this.state = 76;
            this.variable();
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


function ScientificContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_scientific;
    return this;
}

ScientificContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ScientificContext.prototype.constructor = ScientificContext;

ScientificContext.prototype.SCIENTIFIC_NUMBER = function() {
    return this.getToken(ExpressionDefinitionParser.SCIENTIFIC_NUMBER, 0);
};

ScientificContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterScientific(this);
	}
};

ScientificContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitScientific(this);
	}
};

ScientificContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitScientific(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ExpressionDefinitionParser.ScientificContext = ScientificContext;

ExpressionDefinitionParser.prototype.scientific = function() {

    var localctx = new ScientificContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, ExpressionDefinitionParser.RULE_scientific);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 79;
        this.match(ExpressionDefinitionParser.SCIENTIFIC_NUMBER);
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


function ConstantContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_constant;
    return this;
}

ConstantContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ConstantContext.prototype.constructor = ConstantContext;

ConstantContext.prototype.PI = function() {
    return this.getToken(ExpressionDefinitionParser.PI, 0);
};

ConstantContext.prototype.EULER = function() {
    return this.getToken(ExpressionDefinitionParser.EULER, 0);
};

ConstantContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterConstant(this);
	}
};

ConstantContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitConstant(this);
	}
};

ConstantContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitConstant(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ExpressionDefinitionParser.ConstantContext = ConstantContext;

ExpressionDefinitionParser.prototype.constant = function() {

    var localctx = new ConstantContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, ExpressionDefinitionParser.RULE_constant);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 81;
        _la = this._input.LA(1);
        if(!(_la===ExpressionDefinitionParser.PI || _la===ExpressionDefinitionParser.EULER)) {
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


function VariableContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_variable;
    return this;
}

VariableContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VariableContext.prototype.constructor = VariableContext;


 
VariableContext.prototype.copyFrom = function(ctx) {
    antlr4.ParserRuleContext.prototype.copyFrom.call(this, ctx);
};


function VariableEnvironmentContext(parser, ctx) {
	VariableContext.call(this, parser);
    VariableContext.prototype.copyFrom.call(this, ctx);
    return this;
}

VariableEnvironmentContext.prototype = Object.create(VariableContext.prototype);
VariableEnvironmentContext.prototype.constructor = VariableEnvironmentContext;

ExpressionDefinitionParser.VariableEnvironmentContext = VariableEnvironmentContext;

VariableEnvironmentContext.prototype.environment_variable = function() {
    return this.getTypedRuleContext(Environment_variableContext,0);
};
VariableEnvironmentContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterVariableEnvironment(this);
	}
};

VariableEnvironmentContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitVariableEnvironment(this);
	}
};

VariableEnvironmentContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitVariableEnvironment(this);
    } else {
        return visitor.visitChildren(this);
    }
};


function VariableArgContext(parser, ctx) {
	VariableContext.call(this, parser);
    VariableContext.prototype.copyFrom.call(this, ctx);
    return this;
}

VariableArgContext.prototype = Object.create(VariableContext.prototype);
VariableArgContext.prototype.constructor = VariableArgContext;

ExpressionDefinitionParser.VariableArgContext = VariableArgContext;

VariableArgContext.prototype.ID = function() {
    return this.getToken(ExpressionDefinitionParser.ID, 0);
};
VariableArgContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterVariableArg(this);
	}
};

VariableArgContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitVariableArg(this);
	}
};

VariableArgContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitVariableArg(this);
    } else {
        return visitor.visitChildren(this);
    }
};



ExpressionDefinitionParser.VariableContext = VariableContext;

ExpressionDefinitionParser.prototype.variable = function() {

    var localctx = new VariableContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, ExpressionDefinitionParser.RULE_variable);
    try {
        this.state = 85;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case ExpressionDefinitionParser.VARIABLE_CONTRACT:
            localctx = new VariableEnvironmentContext(this, localctx);
            this.enterOuterAlt(localctx, 1);
            this.state = 83;
            this.environment_variable();
            break;
        case ExpressionDefinitionParser.ID:
            localctx = new VariableArgContext(this, localctx);
            this.enterOuterAlt(localctx, 2);
            this.state = 84;
            this.match(ExpressionDefinitionParser.ID);
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


function Environment_variableContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = ExpressionDefinitionParser.RULE_environment_variable;
    return this;
}

Environment_variableContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
Environment_variableContext.prototype.constructor = Environment_variableContext;

Environment_variableContext.prototype.VARIABLE_CONTRACT = function() {
    return this.getToken(ExpressionDefinitionParser.VARIABLE_CONTRACT, 0);
};

Environment_variableContext.prototype.enterRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.enterEnvironment_variable(this);
	}
};

Environment_variableContext.prototype.exitRule = function(listener) {
    if(listener instanceof ExpressionDefinitionListener ) {
        listener.exitEnvironment_variable(this);
	}
};

Environment_variableContext.prototype.accept = function(visitor) {
    if ( visitor instanceof ExpressionDefinitionVisitor ) {
        return visitor.visitEnvironment_variable(this);
    } else {
        return visitor.visitChildren(this);
    }
};




ExpressionDefinitionParser.Environment_variableContext = Environment_variableContext;

ExpressionDefinitionParser.prototype.environment_variable = function() {

    var localctx = new Environment_variableContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, ExpressionDefinitionParser.RULE_environment_variable);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 87;
        this.match(ExpressionDefinitionParser.VARIABLE_CONTRACT);
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


ExpressionDefinitionParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 2:
			return this.expression_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

ExpressionDefinitionParser.prototype.expression_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.precpred(this._ctx, 4);
		case 1:
			return this.precpred(this._ctx, 3);
		case 2:
			return this.precpred(this._ctx, 2);
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.ExpressionDefinitionParser = ExpressionDefinitionParser;
