package com.freelog.cg.antlr;

import org.antlr.v4.runtime.*;

public class BailErrorStrategy extends DefaultErrorStrategy {

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw new RuntimeException(e);
    }

    /**
     * 确保不会试图从子规则的问题中恢复
     */
    @Override
    public void sync(Parser recognizer) throws RecognitionException {
    }

    /**
     * 确保不会试图执行行内恢复
     */
    @Override
    public Token recoverInline(Parser recognizer) throws RecognitionException {
        throw new RuntimeException(new InputMismatchException(recognizer));
    }
}
