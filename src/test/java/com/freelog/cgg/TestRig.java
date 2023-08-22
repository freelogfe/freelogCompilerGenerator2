package com.freelog.cgg;

import com.freelog.cg.tool.Rig;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestRig {

    private static final Logger logger = LoggerFactory.getLogger(TestRig.class);

    public static void main(String[] args) throws Exception {
        Rig rig = new Rig();
        rig.grammarName = "com.freelog.cgg.ExpressionDefinition";
        rig.startRuleName = "prog";
        rig.showTokens = true;
        rig.trace = true;
        rig.printTree = true;
        rig.gui = true;
        rig.inputFiles.add(FileUtils.getFile(TestRig.class.getClassLoader().getResource("A.sc").getPath()).getAbsolutePath());

        rig.process();
    }
}