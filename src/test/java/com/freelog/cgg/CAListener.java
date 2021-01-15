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

    private ParseTreeProperty<String> xmls = new ParseTreeProperty<>();

    public String getXML(ParseTree ctx) {
        return xmls.get(ctx);
    }

    public void setXML(ParseTree ctx, String xml) {
        xmls.put(ctx, xml);
    }

    public static String stripQuotes(String s) {
        if (s == null || s.charAt(0) != '"') return s;
        return s.substring(1, s.length() - 1);
    }

    @Override
    public void exitString(AParser.StringContext ctx) {
        setXML(ctx, stripQuotes(ctx.getText()));
    }

    @Override
    public void exitAtom(AParser.AtomContext ctx) {
        setXML(ctx, ctx.getText());
    }

    @Override
    public void exitObjectValue(AParser.ObjectValueContext ctx) {
        setXML(ctx, getXML(ctx.object()));
    }

    @Override
    public void exitArrayValue(AParser.ArrayValueContext ctx) {
        setXML(ctx, getXML(ctx.array()));
    }

    @Override
    public void exitPair(AParser.PairContext ctx) {
        String tag = stripQuotes(ctx.STRING().getText());
        AParser.ValueContext vctx = ctx.value();
        String value = String.format("<%s>%s<%s>\n", tag, getXML(vctx), tag);

        setXML(ctx, value);
    }

    @Override
    public void exitAnObject(AParser.AnObjectContext ctx) {
        StringBuilder buff = new StringBuilder();
        buff.append("\n");
        for (AParser.PairContext pctx : ctx.pair()) {
            buff.append(getXML(pctx));
        }

        setXML(ctx, buff.toString());
    }

    @Override
    public void exitAnArray(AParser.AnArrayContext ctx) {
        StringBuilder buff = new StringBuilder();
        buff.append("\n");
        for (AParser.ValueContext vctx : ctx.value()) {
            buff.append("<element>");
            buff.append(getXML(vctx));
            buff.append("</element>");
            buff.append("\n");
        }

        setXML(ctx, buff.toString());
    }

    @Override
    public void exitJson(AParser.JsonContext ctx) {
        StringBuilder buff = new StringBuilder();
        buff.append(String.format("<%s>%s<%s>",
                ctx.getClass().getSimpleName(),
                getXML(ctx.children.get(0)),
                ctx.getClass().getSimpleName()));
        System.out.println(buff.toString());
    }
}
