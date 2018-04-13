/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/dumpDeclarations")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DumpDeclarationsTestGenerated extends AbstractDumpDeclarationsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInDumpDeclarations() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/dumpDeclarations"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/annotation.kt");
    }

    @TestMetadata("classMembers.kt")
    public void testClassMembers() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/classMembers.kt");
    }

    @TestMetadata("classes.kt")
    public void testClasses() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/classes.kt");
    }

    @TestMetadata("interfaces.kt")
    public void testInterfaces() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/interfaces.kt");
    }

    @TestMetadata("localClasses.kt")
    public void testLocalClasses() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/localClasses.kt");
    }

    @TestMetadata("multifileFacadeMembers.kt")
    public void testMultifileFacadeMembers() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/multifileFacadeMembers.kt");
    }

    @TestMetadata("suspendLambda.kt")
    public void testSuspendLambda() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/suspendLambda.kt");
    }

    @TestMetadata("suspendOverride.kt")
    public void testSuspendOverride() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/suspendOverride.kt");
    }

    @TestMetadata("topLevelMembers.kt")
    public void testTopLevelMembers() throws Exception {
        runTest("compiler/testData/codegen/dumpDeclarations/topLevelMembers.kt");
    }
}
