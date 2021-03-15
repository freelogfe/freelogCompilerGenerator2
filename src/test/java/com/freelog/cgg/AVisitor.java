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
	 * Visit a parse tree produced by {@link AParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(AParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(AParser.LineContext ctx);
}