/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.highlighter;

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
@TestMetadata("idea/testData/diagnosticMessage/js")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DiagnosticMessageJsTestGenerated extends AbstractDiagnosticMessageJsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.JS, testDataFilePath);
    }

    public void testAllFilesPresentInJs() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/diagnosticMessage/js"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, false);
    }

    @TestMetadata("jsCodeErrorHtml.kt")
    public void testJsCodeErrorHtml() throws Exception {
        runTest("idea/testData/diagnosticMessage/js/jsCodeErrorHtml.kt");
    }

    @TestMetadata("jsCodeErrorText.kt")
    public void testJsCodeErrorText() throws Exception {
        runTest("idea/testData/diagnosticMessage/js/jsCodeErrorText.kt");
    }
}
