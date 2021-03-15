// Generated from src\test\java\com\freelog\cgg\A.g4 by ANTLR 4.8
package com.freelog.cgg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AParser}.
 */
public interface AListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(AParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(AParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(AParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(AParser.LineContext ctx);
}