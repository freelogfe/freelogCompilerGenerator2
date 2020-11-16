package com.freelog.cg.antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class VerboseListener extends BaseErrorListener {

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        StringBuffer buf = new StringBuffer();
        buf.append("<html><body>");

        buf.append("rule stack: " + stack);
        buf.append("<br>");
        buf.append("line " + line + ":" + charPositionInLine + " at" + offendingSymbol + ": " + msg);

        buf.append("</body></html>");

        JDialog dialog = new JDialog();
        Container contentPane = dialog.getContentPane();
        JLabel label = new JLabel(buf.toString());
        label.setFont(new Font("", Font.PLAIN, 18));
        contentPane.add(label);
        contentPane.setBackground(Color.white);

        dialog.setTitle("Syntax error");
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
    }
}
