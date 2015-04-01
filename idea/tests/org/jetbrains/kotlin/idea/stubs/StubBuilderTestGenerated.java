/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.stubs;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/stubs")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class StubBuilderTestGenerated extends AbstractStubBuilderTest {
    public void testAllFilesPresentInStubs() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/stubs"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("AnnotationClass.kt")
    public void testAnnotationClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/AnnotationClass.kt");
        doTest(fileName);
    }

    @TestMetadata("AnnotationOnClass.kt")
    public void testAnnotationOnClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/AnnotationOnClass.kt");
        doTest(fileName);
    }

    @TestMetadata("AnnotationOnFunction.kt")
    public void testAnnotationOnFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/AnnotationOnFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("AnnotationOnLocalFunction.kt")
    public void testAnnotationOnLocalFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/AnnotationOnLocalFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("AnnotationsOnPrimaryCtr.kt")
    public void testAnnotationsOnPrimaryCtr() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/AnnotationsOnPrimaryCtr.kt");
        doTest(fileName);
    }

    @TestMetadata("AnonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/AnonymousObject.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassObject.kt")
    public void testClassObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/ClassObject.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassProperty.kt")
    public void testClassProperty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/ClassProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("ClassTypeParameters.kt")
    public void testClassTypeParameters() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/ClassTypeParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("DanglingAnnotations.kt")
    public void testDanglingAnnotations() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/DanglingAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("DynamicType.kt")
    public void testDynamicType() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/DynamicType.kt");
        doTest(fileName);
    }

    @TestMetadata("FilePackage.kt")
    public void testFilePackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/FilePackage.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionInNotNamedObject.kt")
    public void testFunctionInNotNamedObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/FunctionInNotNamedObject.kt");
        doTest(fileName);
    }

    @TestMetadata("FunctionParameters.kt")
    public void testFunctionParameters() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/FunctionParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("InnerClass.kt")
    public void testInnerClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/InnerClass.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalClass.kt")
    public void testLocalClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/LocalClass.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalClassInLocalFunction.kt")
    public void testLocalClassInLocalFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/LocalClassInLocalFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("LocalNamedObject.kt")
    public void testLocalNamedObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/LocalNamedObject.kt");
        doTest(fileName);
    }

    @TestMetadata("ManyAnnotationsOnFunction.kt")
    public void testManyAnnotationsOnFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/ManyAnnotationsOnFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("MembersInLocalClass.kt")
    public void testMembersInLocalClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/MembersInLocalClass.kt");
        doTest(fileName);
    }

    @TestMetadata("MembersInLocalObject.kt")
    public void testMembersInLocalObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/MembersInLocalObject.kt");
        doTest(fileName);
    }

    @TestMetadata("NamedObject.kt")
    public void testNamedObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/NamedObject.kt");
        doTest(fileName);
    }

    @TestMetadata("NotStorePropertiesFrom.kt")
    public void testNotStorePropertiesFrom() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/NotStorePropertiesFrom.kt");
        doTest(fileName);
    }

    @TestMetadata("NotStorePropertyFromDelegate.kt")
    public void testNotStorePropertyFromDelegate() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/NotStorePropertyFromDelegate.kt");
        doTest(fileName);
    }

    @TestMetadata("NotStorePropertyFromInitializer.kt")
    public void testNotStorePropertyFromInitializer() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/NotStorePropertyFromInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("ObjectInInitializer.kt")
    public void testObjectInInitializer() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/ObjectInInitializer.kt");
        doTest(fileName);
    }

    @TestMetadata("ObjectInPropertyDelegate.kt")
    public void testObjectInPropertyDelegate() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/ObjectInPropertyDelegate.kt");
        doTest(fileName);
    }

    @TestMetadata("PackageProperty.kt")
    public void testPackageProperty() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/PackageProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("ParametersWithFqName.kt")
    public void testParametersWithFqName() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/ParametersWithFqName.kt");
        doTest(fileName);
    }

    @TestMetadata("PropertyAsPropertyInitalizerInvalidCode.kt")
    public void testPropertyAsPropertyInitalizerInvalidCode() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/PropertyAsPropertyInitalizerInvalidCode.kt");
        doTest(fileName);
    }

    @TestMetadata("QualifiedAnnotationOnFunction.kt")
    public void testQualifiedAnnotationOnFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/QualifiedAnnotationOnFunction.kt");
        doTest(fileName);
    }

    @TestMetadata("SecondaryConstructors.kt")
    public void testSecondaryConstructors() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/SecondaryConstructors.kt");
        doTest(fileName);
    }

    @TestMetadata("SimpleEnumBuild.kt")
    public void testSimpleEnumBuild() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/SimpleEnumBuild.kt");
        doTest(fileName);
    }

    @TestMetadata("StarProjection.kt")
    public void testStarProjection() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/stubs/StarProjection.kt");
        doTest(fileName);
    }
}
