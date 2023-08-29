// Generated from src\test\java\com\freelog\cgg\ExpressionDefinition.g4 by ANTLR 4.8
package com.freelog.cgg;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionDefinitionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionDefinitionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionDefinitionParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExpressionDefinitionParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExpressionDefinitionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(ExpressionDefinitionParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExpressionDefinitionParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(ExpressionDefinitionParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calculateSign}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculateSign(ExpressionDefinitionParser.CalculateSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calculatePlu}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculatePlu(ExpressionDefinitionParser.CalculatePluContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calculatePow}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculatePow(ExpressionDefinitionParser.CalculatePowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calculateTim}
	 * labeled alternative in {@link ExpressionDefinitionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculateTim(ExpressionDefinitionParser.CalculateTimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signed4Self}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned4Self(ExpressionDefinitionParser.Signed4SelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signed4Function}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned4Function(ExpressionDefinitionParser.Signed4FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signed4Atom}
	 * labeled alternative in {@link ExpressionDefinitionParser#signedAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned4Atom(ExpressionDefinitionParser.Signed4AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionDefinitionParser#built_in_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_in_function(ExpressionDefinitionParser.Built_in_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionDefinitionParser#funcname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncname(ExpressionDefinitionParser.FuncnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom4Scientific}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom4Scientific(ExpressionDefinitionParser.Atom4ScientificContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom4Constant}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom4Constant(ExpressionDefinitionParser.Atom4ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom4Expression}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom4Expression(ExpressionDefinitionParser.Atom4ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atom4Variable}
	 * labeled alternative in {@link ExpressionDefinitionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom4Variable(ExpressionDefinitionParser.Atom4VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionDefinitionParser#scientific}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientific(ExpressionDefinitionParser.ScientificContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionDefinitionParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ExpressionDefinitionParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableEnvironment}
	 * labeled alternative in {@link ExpressionDefinitionParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableEnvironment(ExpressionDefinitionParser.VariableEnvironmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableArg}
	 * labeled alternative in {@link ExpressionDefinitionParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArg(ExpressionDefinitionParser.VariableArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionDefinitionParser#environment_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironment_variable(ExpressionDefinitionParser.Environment_variableContext ctx);
}