package com.freelog.cg.antlr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CustomVisitor extends UserPolicyBaseVisitor<Void> {

    private static final Logger logger = LoggerFactory.getLogger(CustomVisitor.class);

    @Override
    public Void visitSubject(UserPolicyParser.SubjectContext ctx) {
        logger.info(ctx.getText());
        return null;
    }
}
