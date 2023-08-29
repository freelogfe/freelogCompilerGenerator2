package com.freelog.cgg;

import com.freelog.cg.tool.Rig;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExpressionDefinitionTestRig {

    private static final Logger logger = LoggerFactory.getLogger(ExpressionDefinitionTestRig.class);

    public static void main(String[] args) throws Exception {
        Rig rig = new Rig();
        rig.grammarName = "com.freelog.cgg.ExpressionDefinition";
        rig.startRuleName = "prog";
        rig.showTokens = true;
        rig.trace = true;
        rig.printTree = true;
        rig.gui = true;
        rig.inputFiles.add(FileUtils.getFile(ExpressionDefinitionTestRig.class.getClassLoader().getResource("ExpressionDefinition.sc").getPath()).getAbsolutePath());

        rig.process();
    }
}