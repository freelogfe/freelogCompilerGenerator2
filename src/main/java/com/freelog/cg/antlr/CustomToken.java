package com.freelog.cg.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

public class CustomToken extends CommonToken {

    public String srcName;

    public CustomToken(Pair<TokenSource, CharStream> source, int type, int channel, int start, int stop) {
        super(source, type, channel, start, stop);
    }

    public CustomToken(int type, String text) {
        super(type, text);
    }

    @Override
    public String toString() {
        return srcName + ":" + super.toString();
    }
}
