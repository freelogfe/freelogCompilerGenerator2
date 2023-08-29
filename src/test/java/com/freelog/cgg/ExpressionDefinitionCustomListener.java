package com.freelog.cgg;

import com.alibaba.fastjson.JSONObject;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExpressionDefinitionCustomListener extends ExpressionDefinitionBaseListener {

    private ParseTreeProperty<BigDecimal> values = new ParseTreeProperty<>();
    public Map<String, BigDecimal> expressions = new HashMap<>();

    @Override
    public void exitPrintExpr(ExpressionDefinitionParser.PrintExprContext ctx) {
        expressions.put(ctx.getText(), getValue(ctx.expression()));
    }

    @Override
    public void exitCalculatePow(ExpressionDefinitionParser.CalculatePowContext ctx) {
        ExpressionDefinitionParser.ExpressionContext ctxA = ctx.expression(0);
        ExpressionDefinitionParser.ExpressionContext ctxB = ctx.expression(1);
        BigDecimal a = getValue(ctxA);
        BigDecimal b = getValue(ctxB);
        if (a != null && b != null) {
            setValue(ctx, a.pow(b.intValue()));
        }
    }

    @Override
    public void exitCalculatePlu(ExpressionDefinitionParser.CalculatePluContext ctx) {
        ExpressionDefinitionParser.ExpressionContext ctxA = ctx.expression(0);
        ExpressionDefinitionParser.ExpressionContext ctxB = ctx.expression(1);
        BigDecimal a = getValue(ctxA);
        BigDecimal b = getValue(ctxB);
        if (a != null && b != null) {
            setValue(ctx, ctx.op.getType() == ExpressionDefinitionParser.PLUS ? a.add(b) : a.subtract(b));
        }
    }

    @Override
    public void exitCalculateTim(ExpressionDefinitionParser.CalculateTimContext ctx) {
        ExpressionDefinitionParser.ExpressionContext ctxA = ctx.expression(0);
        ExpressionDefinitionParser.ExpressionContext ctxB = ctx.expression(1);
        BigDecimal a = getValue(ctxA);
        BigDecimal b = getValue(ctxB);
        if (a != null && b != null) {
            setValue(ctx, ctx.op.getType() == ExpressionDefinitionParser.TIMES ? a.multiply(b) : a.setScale(2).divide(b, RoundingMode.HALF_EVEN));
        }
    }

    @Override
    public void exitCalculateSign(ExpressionDefinitionParser.CalculateSignContext ctx) {
        setValue(ctx, getValue(ctx.signedAtom()));
    }

    @Override
    public void exitSigned4Self(ExpressionDefinitionParser.Signed4SelfContext ctx) {
        setValue(ctx, ctx.op.getType() == ExpressionDefinitionParser.PLUS ? getValue(ctx.signedAtom()) : BigDecimal.ZERO.subtract(getValue(ctx.signedAtom())));
    }

    @Override
    public void exitSigned4Function(ExpressionDefinitionParser.Signed4FunctionContext ctx) {
        setValue(ctx, getValue(ctx.built_in_function()));
    }

    @Override
    public void exitSigned4Atom(ExpressionDefinitionParser.Signed4AtomContext ctx) {
        setValue(ctx, getValue(ctx.atom()));
    }

    @Override
    public void exitBuilt_in_function(ExpressionDefinitionParser.Built_in_functionContext ctx) {
        List<BigDecimal> args = ctx.expression().stream().map(this::getValue).collect(Collectors.toList());
        String name = ctx.funcname().getText();
        switch (name) {
            case "sum":
                setValue(ctx, sum(args));
                break;
            case "avg":
                setValue(ctx, avg(args));
                break;
        }
    }

    @Override
    public void exitAtom4Scientific(ExpressionDefinitionParser.Atom4ScientificContext ctx) {
        setValue(ctx, getValue(ctx.scientific()));
    }

    @Override
    public void exitAtom4Constant(ExpressionDefinitionParser.Atom4ConstantContext ctx) {
        setValue(ctx, getValue(ctx.constant()));
    }

    @Override
    public void exitAtom4Expression(ExpressionDefinitionParser.Atom4ExpressionContext ctx) {
        setValue(ctx, getValue(ctx.expression()));
    }

    @Override
    public void exitScientific(ExpressionDefinitionParser.ScientificContext ctx) {
        setValue(ctx, new BigDecimal(ctx.getText()));
    }

    @Override
    public void exitConstant(ExpressionDefinitionParser.ConstantContext ctx) {
        BigDecimal value = null;
        if (ctx.PI() != null) {
            value = new BigDecimal(Math.PI).setScale(2, RoundingMode.HALF_EVEN);
        } else if (ctx.EULER() != null) {
            value = new BigDecimal(Math.E).setScale(2, RoundingMode.HALF_EVEN);
        }
        if (value == null) {
            throw new IllegalArgumentException();
        } else {
            setValue(ctx, value);
        }
    }

    public void setValue(ParseTree node, BigDecimal value) {
        values.put(node, value);
    }

    public BigDecimal getValue(ParseTree node) {
        return values.get(node);
    }

    public BigDecimal sum(List<BigDecimal> args) {
        return args.stream().reduce(BigDecimal::add).get();
    }

    public BigDecimal avg(List<BigDecimal> args) {
        return sum(args).divide(new BigDecimal(args.size()), RoundingMode.HALF_EVEN);
    }

    public String listValues() {
        try {
            Class c = ParseTreeProperty.class;
            Field field = c.getDeclaredField("annotations");
            field.setAccessible(true);
            Map<ParseTree, BigDecimal> numbers = (Map<ParseTree, BigDecimal>) field.get(values);
            return JSONObject.toJSONString(numbers.values().stream().map(BigDecimal::toString).collect(Collectors.toList()));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}