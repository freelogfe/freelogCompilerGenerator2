// Generated from src\test\java\com\freelog\cgg\ExpressionDefinition.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by ExpressionDefinitionParser.
function ExpressionDefinitionListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

ExpressionDefinitionListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
ExpressionDefinitionListener.prototype.constructor = ExpressionDefinitionListener;

// Enter a parse tree produced by ExpressionDefinitionParser#prog.
ExpressionDefinitionListener.prototype.enterProg = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#prog.
ExpressionDefinitionListener.prototype.exitProg = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#printExpr.
ExpressionDefinitionListener.prototype.enterPrintExpr = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#printExpr.
ExpressionDefinitionListener.prototype.exitPrintExpr = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#blank.
ExpressionDefinitionListener.prototype.enterBlank = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#blank.
ExpressionDefinitionListener.prototype.exitBlank = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#calculateSign.
ExpressionDefinitionListener.prototype.enterCalculateSign = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#calculateSign.
ExpressionDefinitionListener.prototype.exitCalculateSign = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#calculatePlu.
ExpressionDefinitionListener.prototype.enterCalculatePlu = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#calculatePlu.
ExpressionDefinitionListener.prototype.exitCalculatePlu = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#calculatePow.
ExpressionDefinitionListener.prototype.enterCalculatePow = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#calculatePow.
ExpressionDefinitionListener.prototype.exitCalculatePow = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#calculateTim.
ExpressionDefinitionListener.prototype.enterCalculateTim = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#calculateTim.
ExpressionDefinitionListener.prototype.exitCalculateTim = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#signed4Self.
ExpressionDefinitionListener.prototype.enterSigned4Self = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#signed4Self.
ExpressionDefinitionListener.prototype.exitSigned4Self = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#signed4Function.
ExpressionDefinitionListener.prototype.enterSigned4Function = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#signed4Function.
ExpressionDefinitionListener.prototype.exitSigned4Function = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#signed4Atom.
ExpressionDefinitionListener.prototype.enterSigned4Atom = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#signed4Atom.
ExpressionDefinitionListener.prototype.exitSigned4Atom = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#built_in_function.
ExpressionDefinitionListener.prototype.enterBuilt_in_function = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#built_in_function.
ExpressionDefinitionListener.prototype.exitBuilt_in_function = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#funcname.
ExpressionDefinitionListener.prototype.enterFuncname = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#funcname.
ExpressionDefinitionListener.prototype.exitFuncname = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#atom4Scientific.
ExpressionDefinitionListener.prototype.enterAtom4Scientific = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#atom4Scientific.
ExpressionDefinitionListener.prototype.exitAtom4Scientific = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#atom4Constant.
ExpressionDefinitionListener.prototype.enterAtom4Constant = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#atom4Constant.
ExpressionDefinitionListener.prototype.exitAtom4Constant = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#atom4Expression.
ExpressionDefinitionListener.prototype.enterAtom4Expression = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#atom4Expression.
ExpressionDefinitionListener.prototype.exitAtom4Expression = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#atom4Variable.
ExpressionDefinitionListener.prototype.enterAtom4Variable = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#atom4Variable.
ExpressionDefinitionListener.prototype.exitAtom4Variable = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#scientific.
ExpressionDefinitionListener.prototype.enterScientific = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#scientific.
ExpressionDefinitionListener.prototype.exitScientific = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#constant.
ExpressionDefinitionListener.prototype.enterConstant = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#constant.
ExpressionDefinitionListener.prototype.exitConstant = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#VariableEnvironment.
ExpressionDefinitionListener.prototype.enterVariableEnvironment = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#VariableEnvironment.
ExpressionDefinitionListener.prototype.exitVariableEnvironment = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#VariableArg.
ExpressionDefinitionListener.prototype.enterVariableArg = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#VariableArg.
ExpressionDefinitionListener.prototype.exitVariableArg = function(ctx) {
};


// Enter a parse tree produced by ExpressionDefinitionParser#environment_variable.
ExpressionDefinitionListener.prototype.enterEnvironment_variable = function(ctx) {
};

// Exit a parse tree produced by ExpressionDefinitionParser#environment_variable.
ExpressionDefinitionListener.prototype.exitEnvironment_variable = function(ctx) {
};



exports.ExpressionDefinitionListener = ExpressionDefinitionListener;