// Generated from src\test\java\com\freelog\cgg\A.g4 by ANTLR 4.8
package com.freelog.cgg;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(AParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link AParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnObject(AParser.AnObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link AParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyObject(AParser.EmptyObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(AParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnArray}
	 * labeled alternative in {@link AParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnArray(AParser.AnArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link AParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArray(AParser.EmptyArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(AParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(AParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(AParser.ArrayValueContext ctx);
}