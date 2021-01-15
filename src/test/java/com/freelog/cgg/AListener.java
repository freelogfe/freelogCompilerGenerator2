// Generated from src\test\java\com\freelog\cgg\A.g4 by ANTLR 4.8
package com.freelog.cgg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AParser}.
 */
public interface AListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(AParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(AParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link AParser#object}.
	 * @param ctx the parse tree
	 */
	void enterAnObject(AParser.AnObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnObject}
	 * labeled alternative in {@link AParser#object}.
	 * @param ctx the parse tree
	 */
	void exitAnObject(AParser.AnObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link AParser#object}.
	 * @param ctx the parse tree
	 */
	void enterEmptyObject(AParser.EmptyObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyObject}
	 * labeled alternative in {@link AParser#object}.
	 * @param ctx the parse tree
	 */
	void exitEmptyObject(AParser.EmptyObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(AParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(AParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnArray}
	 * labeled alternative in {@link AParser#array}.
	 * @param ctx the parse tree
	 */
	void enterAnArray(AParser.AnArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnArray}
	 * labeled alternative in {@link AParser#array}.
	 * @param ctx the parse tree
	 */
	void exitAnArray(AParser.AnArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link AParser#array}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArray(AParser.EmptyArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArray}
	 * labeled alternative in {@link AParser#array}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArray(AParser.EmptyArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void enterString(AParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void exitString(AParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void enterAtom(AParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atom}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void exitAtom(AParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(AParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(AParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(AParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(AParser.ArrayValueContext ctx);
}