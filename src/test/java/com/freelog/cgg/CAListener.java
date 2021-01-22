package com.freelog.cgg;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class CAListener extends ABaseListener {

    private TokenStreamRewriter rewriter;

    public CAListener(TokenStream stream) {
        rewriter = new TokenStreamRewriter(stream);
    }
}
