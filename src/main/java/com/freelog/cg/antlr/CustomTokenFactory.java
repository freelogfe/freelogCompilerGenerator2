package com.freelog.cg.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

public class CustomTokenFactory implements TokenFactory<CustomToken> {

    CharStream input;

    public CustomTokenFactory(CharStream input) {
        this.input = input;
    }

    @Override
    public CustomToken create(Pair<TokenSource, CharStream> source, int type, String text, int channel, int start, int stop, int line, int charPositionInLine) {
        CustomToken token = new CustomToken(source, type, channel, start, stop);
        token.setLine(line);
        token.setCharPositionInLine(charPositionInLine);
        token.srcName = input.getSourceName();

        return token;
    }

    @Override
    public CustomToken create(int type, String text) {
        return new CustomToken(type, text);
    }
}
