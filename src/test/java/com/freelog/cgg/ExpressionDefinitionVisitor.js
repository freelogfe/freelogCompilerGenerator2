// Generated from src\test\java\com\freelog\cgg\ExpressionDefinition.g4 by ANTLR 4.8
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete generic visitor for a parse tree produced by ExpressionDefinitionParser.

function ExpressionDefinitionVisitor() {
	antlr4.tree.ParseTreeVisitor.call(this);
	return this;
}

ExpressionDefinitionVisitor.prototype = Object.create(antlr4.tree.ParseTreeVisitor.prototype);
ExpressionDefinitionVisitor.prototype.constructor = ExpressionDefinitionVisitor;

// Visit a parse tree produced by ExpressionDefinitionParser#prog.
ExpressionDefinitionVisitor.prototype.visitProg = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#printExpr.
ExpressionDefinitionVisitor.prototype.visitPrintExpr = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#blank.
ExpressionDefinitionVisitor.prototype.visitBlank = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#calculateSign.
ExpressionDefinitionVisitor.prototype.visitCalculateSign = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#calculatePlu.
ExpressionDefinitionVisitor.prototype.visitCalculatePlu = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#calculatePow.
ExpressionDefinitionVisitor.prototype.visitCalculatePow = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#calculateTim.
ExpressionDefinitionVisitor.prototype.visitCalculateTim = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#signed4Self.
ExpressionDefinitionVisitor.prototype.visitSigned4Self = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#signed4Function.
ExpressionDefinitionVisitor.prototype.visitSigned4Function = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#signed4Atom.
ExpressionDefinitionVisitor.prototype.visitSigned4Atom = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#built_in_function.
ExpressionDefinitionVisitor.prototype.visitBuilt_in_function = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#funcname.
ExpressionDefinitionVisitor.prototype.visitFuncname = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#atom4Scientific.
ExpressionDefinitionVisitor.prototype.visitAtom4Scientific = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#atom4Constant.
ExpressionDefinitionVisitor.prototype.visitAtom4Constant = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#atom4Expression.
ExpressionDefinitionVisitor.prototype.visitAtom4Expression = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#atom4Variable.
ExpressionDefinitionVisitor.prototype.visitAtom4Variable = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#scientific.
ExpressionDefinitionVisitor.prototype.visitScientific = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#constant.
ExpressionDefinitionVisitor.prototype.visitConstant = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#VariableEnvironment.
ExpressionDefinitionVisitor.prototype.visitVariableEnvironment = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#VariableArg.
ExpressionDefinitionVisitor.prototype.visitVariableArg = function(ctx) {
  return this.visitChildren(ctx);
};


// Visit a parse tree produced by ExpressionDefinitionParser#environment_variable.
ExpressionDefinitionVisitor.prototype.visitEnvironment_variable = function(ctx) {
  return this.visitChildren(ctx);
};



exports.ExpressionDefinitionVisitor = ExpressionDefinitionVisitor;