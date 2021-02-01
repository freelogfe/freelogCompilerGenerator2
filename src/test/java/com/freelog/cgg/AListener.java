// Generated from src\test\java\com\freelog\cgg\A.g4 by ANTLR 4.8
package com.freelog.cgg;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AParser}.
 */
public interface AListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AParser#rows}.
	 * @param ctx the parse tree
	 */
	void enterRows(AParser.RowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#rows}.
	 * @param ctx the parse tree
	 */
	void exitRows(AParser.RowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(AParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(AParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(AParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link AParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(AParser.EContext ctx);
}