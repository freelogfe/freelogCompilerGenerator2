package com.freelog.cgg;

public class CAVisitor extends ABaseVisitor<Integer> {

    @Override
    public Integer visitStat(AParser.StatContext ctx) {
        System.out.println(ctx.getSourceInterval());

        return super.visitStat(ctx);
    }
}
