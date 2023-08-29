// Generated from src\test\java\com\freelog\cgg\ExpressionDefinition.g4 by ANTLR 4.8
package com.freelog.cgg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionDefinitionParser}.
 */
public interface ExpressionDefinitionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionDefinitionParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExpressionDefinitionParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionDefinitionParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExpressionDefinitionParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExpressionDefinitionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(ExpressionDefinitionParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExpressionDefinitionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(ExpressionDefinitionParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExpressionDefinitionParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ExpressionDefinitionParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExpressionDefinitionParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ExpressionDefinitionParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calculateSign}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalculateSign(ExpressionDefinitionParser.CalculateSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calculateSign}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalculateSign(ExpressionDefinitionParser.CalculateSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calculatePlu}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalculatePlu(ExpressionDefinitionParser.CalculatePluContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calculatePlu}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalculatePlu(ExpressionDefinitionParser.CalculatePluContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calculatePow}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalculatePow(ExpressionDefinitionParser.CalculatePowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calculatePow}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalculatePow(ExpressionDefinitionParser.CalculatePowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calculateTim}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCalculateTim(ExpressionDefinitionParser.CalculateTimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calculateTim}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCalculateTim(ExpressionDefinitionParser.CalculateTimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signed4Self}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSigned4Self(ExpressionDefinitionParser.Signed4SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signed4Self}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSigned4Self(ExpressionDefinitionParser.Signed4SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signed4Function}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSigned4Function(ExpressionDefinitionParser.Signed4FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signed4Function}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSigned4Function(ExpressionDefinitionParser.Signed4FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signed4Atom}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSigned4Atom(ExpressionDefinitionParser.Signed4AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signed4Atom}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSigned4Atom(ExpressionDefinitionParser.Signed4AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionDefinitionParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void enterBuilt_in_function(ExpressionDefinitionParser.Built_in_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionDefinitionParser#built_in_function}.
	 * @param ctx the parse tree
	 */
	void exitBuilt_in_function(ExpressionDefinitionParser.Built_in_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionDefinitionParser#funcname}.
	 * @param ctx the parse tree
	 */
	void enterFuncname(ExpressionDefinitionParser.FuncnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionDefinitionParser#funcname}.
	 * @param ctx the parse tree
	 */
	void exitFuncname(ExpressionDefinitionParser.FuncnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom4Scientific}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom4Scientific(ExpressionDefinitionParser.Atom4ScientificContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom4Scientific}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom4Scientific(ExpressionDefinitionParser.Atom4ScientificContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom4Constant}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom4Constant(ExpressionDefinitionParser.Atom4ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom4Constant}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom4Constant(ExpressionDefinitionParser.Atom4ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom4Expression}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom4Expression(ExpressionDefinitionParser.Atom4ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom4Expression}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom4Expression(ExpressionDefinitionParser.Atom4ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom4Variable}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom4Variable(ExpressionDefinitionParser.Atom4VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom4Variable}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom4Variable(ExpressionDefinitionParser.Atom4VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionDefinitionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(ExpressionDefinitionParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionDefinitionParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(ExpressionDefinitionParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionDefinitionParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ExpressionDefinitionParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionDefinitionParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ExpressionDefinitionParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableEnvironment}
	 * labeled alternative in {@link ExpressionDefinitionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariableEnvironment(ExpressionDefinitionParser.VariableEnvironmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableEnvironment}
	 * labeled alternative in {@link ExpressionDefinitionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariableEnvironment(ExpressionDefinitionParser.VariableEnvironmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableArg}
	 * labeled alternative in {@link ExpressionDefinitionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariableArg(ExpressionDefinitionParser.VariableArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableArg}
	 * labeled alternative in {@link ExpressionDefinitionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariableArg(ExpressionDefinitionParser.VariableArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionDefinitionParser#environment_variable}.
	 * @param ctx the parse tree
	 */
	void enterEnvironment_variable(ExpressionDefinitionParser.Environment_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionDefinitionParser#environment_variable}.
	 * @param ctx the parse tree
	 */
	void exitEnvironment_variable(ExpressionDefinitionParser.Environment_variableContext ctx);
}