/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

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
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalJsCompilerRunnerTestGenerated extends AbstractIncrementalJsCompilerRunnerTest {
    @TestMetadata("jps-plugin/testData/incremental/pureKotlin")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class PureKotlin extends AbstractIncrementalJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        @TestMetadata("accessingFunctionsViaPackagePart")
        public void testAccessingFunctionsViaPackagePart() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/accessingFunctionsViaPackagePart/");
        }

        @TestMetadata("accessingPropertiesViaField")
        public void testAccessingPropertiesViaField() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/accessingPropertiesViaField/");
        }

        @TestMetadata("addClass")
        public void testAddClass() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/addClass/");
        }

        @TestMetadata("addFileWithFunctionOverload")
        public void testAddFileWithFunctionOverload() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/addFileWithFunctionOverload/");
        }

        @TestMetadata("addMemberTypeAlias")
        public void testAddMemberTypeAlias() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/addMemberTypeAlias/");
        }

        @TestMetadata("addTopLevelTypeAlias")
        public void testAddTopLevelTypeAlias() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/addTopLevelTypeAlias/");
        }

        @TestMetadata("allConstants")
        public void testAllConstants() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/allConstants/");
        }

        public void testAllFilesPresentInPureKotlin() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/pureKotlin"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("annotations")
        public void testAnnotations() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/annotations/");
        }

        @TestMetadata("anonymousObjectChanged")
        public void testAnonymousObjectChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/anonymousObjectChanged/");
        }

        @TestMetadata("changeTypeImplicitlyWithCircularDependency")
        public void testChangeTypeImplicitlyWithCircularDependency() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/changeTypeImplicitlyWithCircularDependency/");
        }

        @TestMetadata("changeWithRemovingUsage")
        public void testChangeWithRemovingUsage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/changeWithRemovingUsage/");
        }

        @TestMetadata("classInlineFunctionChanged")
        public void testClassInlineFunctionChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/classInlineFunctionChanged/");
        }

        @TestMetadata("classObjectConstantChanged")
        public void testClassObjectConstantChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/classObjectConstantChanged/");
        }

        @TestMetadata("classRecreated")
        public void testClassRecreated() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/classRecreated/");
        }

        @TestMetadata("classSignatureChanged")
        public void testClassSignatureChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/classSignatureChanged/");
        }

        @TestMetadata("classSignatureUnchanged")
        public void testClassSignatureUnchanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/classSignatureUnchanged/");
        }

        @TestMetadata("compilationErrorThenFixedOtherPackage")
        public void testCompilationErrorThenFixedOtherPackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedOtherPackage/");
        }

        @TestMetadata("compilationErrorThenFixedSamePackage")
        public void testCompilationErrorThenFixedSamePackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedSamePackage/");
        }

        @TestMetadata("compilationErrorThenFixedWithPhantomPart")
        public void testCompilationErrorThenFixedWithPhantomPart() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedWithPhantomPart/");
        }

        @TestMetadata("compilationErrorThenFixedWithPhantomPart2")
        public void testCompilationErrorThenFixedWithPhantomPart2() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedWithPhantomPart2/");
        }

        @TestMetadata("compilationErrorThenFixedWithPhantomPart3")
        public void testCompilationErrorThenFixedWithPhantomPart3() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/compilationErrorThenFixedWithPhantomPart3/");
        }

        @TestMetadata("constantRemoved")
        public void testConstantRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/constantRemoved/");
        }

        @TestMetadata("constantValueChanged")
        public void testConstantValueChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/constantValueChanged/");
        }

        @TestMetadata("constantsUnchanged")
        public void testConstantsUnchanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/constantsUnchanged/");
        }

        @TestMetadata("defaultArgumentInConstructorAdded")
        public void testDefaultArgumentInConstructorAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultArgumentInConstructorAdded/");
        }

        @TestMetadata("defaultArgumentInConstructorRemoved")
        public void testDefaultArgumentInConstructorRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultArgumentInConstructorRemoved/");
        }

        @TestMetadata("defaultValueAdded")
        public void testDefaultValueAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultValueAdded/");
        }

        @TestMetadata("defaultValueChanged")
        public void testDefaultValueChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultValueChanged/");
        }

        @TestMetadata("defaultValueInConstructorChanged")
        public void testDefaultValueInConstructorChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultValueInConstructorChanged/");
        }

        @TestMetadata("defaultValueInConstructorRemoved")
        public void testDefaultValueInConstructorRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultValueInConstructorRemoved/");
        }

        @TestMetadata("defaultValueRemoved1")
        public void testDefaultValueRemoved1() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultValueRemoved1/");
        }

        @TestMetadata("defaultValueRemoved2")
        public void testDefaultValueRemoved2() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/defaultValueRemoved2/");
        }

        @TestMetadata("delegatedPropertyInlineExtensionAccessor")
        public void testDelegatedPropertyInlineExtensionAccessor() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/delegatedPropertyInlineExtensionAccessor/");
        }

        @TestMetadata("delegatedPropertyInlineMethodAccessor")
        public void testDelegatedPropertyInlineMethodAccessor() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/delegatedPropertyInlineMethodAccessor/");
        }

        @TestMetadata("dependencyClassReferenced")
        public void testDependencyClassReferenced() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/dependencyClassReferenced/");
        }

        @TestMetadata("fileWithConstantRemoved")
        public void testFileWithConstantRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/fileWithConstantRemoved/");
        }

        @TestMetadata("fileWithInlineFunctionRemoved")
        public void testFileWithInlineFunctionRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/fileWithInlineFunctionRemoved/");
        }

        @TestMetadata("filesExchangePackages")
        public void testFilesExchangePackages() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/filesExchangePackages/");
        }

        @TestMetadata("funRedeclaration")
        public void testFunRedeclaration() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/funRedeclaration/");
        }

        @TestMetadata("funVsConstructorOverloadConflict")
        public void testFunVsConstructorOverloadConflict() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/funVsConstructorOverloadConflict/");
        }

        @TestMetadata("functionBecameInline")
        public void testFunctionBecameInline() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/functionBecameInline/");
        }

        @TestMetadata("functionReferencingClass")
        public void testFunctionReferencingClass() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/functionReferencingClass/");
        }

        @TestMetadata("independentClasses")
        public void testIndependentClasses() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/independentClasses/");
        }

        @TestMetadata("inlineFunctionBecomesNonInline")
        public void testInlineFunctionBecomesNonInline() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineFunctionBecomesNonInline/");
        }

        @TestMetadata("inlineFunctionUsageAdded")
        public void testInlineFunctionUsageAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineFunctionUsageAdded/");
        }

        @TestMetadata("inlineFunctionsCircularDependency")
        public void testInlineFunctionsCircularDependency() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineFunctionsCircularDependency/");
        }

        @TestMetadata("inlineFunctionsUnchanged")
        public void testInlineFunctionsUnchanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineFunctionsUnchanged/");
        }

        @TestMetadata("inlineLinesChanged")
        public void testInlineLinesChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineLinesChanged/");
        }

        @TestMetadata("inlineModifiedWithUsage")
        public void testInlineModifiedWithUsage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineModifiedWithUsage/");
        }

        @TestMetadata("inlinePrivateFunctionAdded")
        public void testInlinePrivateFunctionAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlinePrivateFunctionAdded/");
        }

        @TestMetadata("inlinePropertyInClass")
        public void testInlinePropertyInClass() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlinePropertyInClass/");
        }

        @TestMetadata("inlinePropertyOnTopLevel")
        public void testInlinePropertyOnTopLevel() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlinePropertyOnTopLevel/");
        }

        @TestMetadata("inlineTwoFunctionsOneChanged")
        public void testInlineTwoFunctionsOneChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineTwoFunctionsOneChanged/");
        }

        @TestMetadata("inlineUsedWhereDeclared")
        public void testInlineUsedWhereDeclared() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/inlineUsedWhereDeclared/");
        }

        @TestMetadata("internalClassChanged")
        public void testInternalClassChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/internalClassChanged/");
        }

        @TestMetadata("internalMemberInClassChanged")
        public void testInternalMemberInClassChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/internalMemberInClassChanged/");
        }

        @TestMetadata("internalTypealias")
        public void testInternalTypealias() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/internalTypealias/");
        }

        @TestMetadata("internalTypealiasConstructor")
        public void testInternalTypealiasConstructor() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/internalTypealiasConstructor/");
        }

        @TestMetadata("internalTypealiasObject")
        public void testInternalTypealiasObject() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/internalTypealiasObject/");
        }

        @TestMetadata("localClassChanged")
        public void testLocalClassChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/localClassChanged/");
        }

        @TestMetadata("moveClass")
        public void testMoveClass() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/moveClass/");
        }

        @TestMetadata("moveFileWithChangingPackage")
        public void testMoveFileWithChangingPackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/moveFileWithChangingPackage/");
        }

        @TestMetadata("moveFileWithoutChangingPackage")
        public void testMoveFileWithoutChangingPackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/moveFileWithoutChangingPackage/");
        }

        @TestMetadata("multiplePackagesModified")
        public void testMultiplePackagesModified() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/multiplePackagesModified/");
        }

        @TestMetadata("objectConstantChanged")
        public void testObjectConstantChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/objectConstantChanged/");
        }

        @TestMetadata("ourClassReferenced")
        public void testOurClassReferenced() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/ourClassReferenced/");
        }

        @TestMetadata("packageConstantChanged")
        public void testPackageConstantChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageConstantChanged/");
        }

        @TestMetadata("packageFileAdded")
        public void testPackageFileAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageFileAdded/");
        }

        @TestMetadata("packageFileChangedPackage")
        public void testPackageFileChangedPackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageFileChangedPackage/");
        }

        @TestMetadata("packageFileChangedThenOtherRemoved")
        public void testPackageFileChangedThenOtherRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageFileChangedThenOtherRemoved/");
        }

        @TestMetadata("packageFileRemoved")
        public void testPackageFileRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageFileRemoved/");
        }

        @TestMetadata("packageFilesChangedInTurn")
        public void testPackageFilesChangedInTurn() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageFilesChangedInTurn/");
        }

        @TestMetadata("packageInlineFunctionAccessingField")
        public void testPackageInlineFunctionAccessingField() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionAccessingField/");
        }

        @TestMetadata("packageInlineFunctionFromOurPackage")
        public void testPackageInlineFunctionFromOurPackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionFromOurPackage/");
        }

        @TestMetadata("packagePrivateOnlyChanged")
        public void testPackagePrivateOnlyChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packagePrivateOnlyChanged/");
        }

        @TestMetadata("packageRecreated")
        public void testPackageRecreated() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageRecreated/");
        }

        @TestMetadata("packageRecreatedAfterRenaming")
        public void testPackageRecreatedAfterRenaming() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageRecreatedAfterRenaming/");
        }

        @TestMetadata("packageRemoved")
        public void testPackageRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/packageRemoved/");
        }

        @TestMetadata("privateConstantsChanged")
        public void testPrivateConstantsChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateConstantsChanged/");
        }

        @TestMetadata("privateMethodAdded")
        public void testPrivateMethodAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateMethodAdded/");
        }

        @TestMetadata("privateMethodDeleted")
        public void testPrivateMethodDeleted() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateMethodDeleted/");
        }

        @TestMetadata("privateMethodSignatureChanged")
        public void testPrivateMethodSignatureChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateMethodSignatureChanged/");
        }

        @TestMetadata("privateSecondaryConstructorAdded")
        public void testPrivateSecondaryConstructorAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateSecondaryConstructorAdded/");
        }

        @TestMetadata("privateSecondaryConstructorDeleted")
        public void testPrivateSecondaryConstructorDeleted() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateSecondaryConstructorDeleted/");
        }

        @TestMetadata("privateValAccessorChanged")
        public void testPrivateValAccessorChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateValAccessorChanged/");
        }

        @TestMetadata("privateValAdded")
        public void testPrivateValAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateValAdded/");
        }

        @TestMetadata("privateValDeleted")
        public void testPrivateValDeleted() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateValDeleted/");
        }

        @TestMetadata("privateValSignatureChanged")
        public void testPrivateValSignatureChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateValSignatureChanged/");
        }

        @TestMetadata("privateVarAdded")
        public void testPrivateVarAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateVarAdded/");
        }

        @TestMetadata("privateVarDeleted")
        public void testPrivateVarDeleted() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateVarDeleted/");
        }

        @TestMetadata("privateVarSignatureChanged")
        public void testPrivateVarSignatureChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/privateVarSignatureChanged/");
        }

        @TestMetadata("propertyRedeclaration")
        public void testPropertyRedeclaration() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/propertyRedeclaration/");
        }

        @TestMetadata("publicPropertyWithPrivateSetter")
        public void testPublicPropertyWithPrivateSetter() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/publicPropertyWithPrivateSetter/");
        }

        @TestMetadata("removeAndRestoreCompanion")
        public void testRemoveAndRestoreCompanion() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeAndRestoreCompanion/");
        }

        @TestMetadata("removeAndRestoreCompanionWithImplicitUsages")
        public void testRemoveAndRestoreCompanionWithImplicitUsages() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeAndRestoreCompanionWithImplicitUsages/");
        }

        @TestMetadata("removeClass")
        public void testRemoveClass() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeClass/");
        }

        @TestMetadata("removeClassInDefaultPackage")
        public void testRemoveClassInDefaultPackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeClassInDefaultPackage/");
        }

        @TestMetadata("removeFileWithFunctionOverload")
        public void testRemoveFileWithFunctionOverload() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeFileWithFunctionOverload/");
        }

        @TestMetadata("removeMemberTypeAlias")
        public void testRemoveMemberTypeAlias() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeMemberTypeAlias/");
        }

        @TestMetadata("removeTopLevelTypeAlias")
        public void testRemoveTopLevelTypeAlias() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeTopLevelTypeAlias/");
        }

        @TestMetadata("removeUnusedFile")
        public void testRemoveUnusedFile() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/removeUnusedFile/");
        }

        @TestMetadata("renameClass")
        public void testRenameClass() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/renameClass/");
        }

        @TestMetadata("renameFileWithFunctionOverload")
        public void testRenameFileWithFunctionOverload() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/renameFileWithFunctionOverload/");
        }

        @TestMetadata("returnTypeChanged")
        public void testReturnTypeChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/returnTypeChanged/");
        }

        @TestMetadata("simpleClassDependency")
        public void testSimpleClassDependency() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/simpleClassDependency/");
        }

        @TestMetadata("soleFileChangesPackage")
        public void testSoleFileChangesPackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/soleFileChangesPackage/");
        }

        @TestMetadata("subpackage")
        public void testSubpackage() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/subpackage/");
        }

        @TestMetadata("suspendWithStateMachine")
        public void testSuspendWithStateMachine() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/suspendWithStateMachine/");
        }

        @TestMetadata("topLevelFunctionSameSignature")
        public void testTopLevelFunctionSameSignature() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/topLevelFunctionSameSignature/");
        }

        @TestMetadata("topLevelMembersInTwoFiles")
        public void testTopLevelMembersInTwoFiles() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/topLevelMembersInTwoFiles/");
        }

        @TestMetadata("topLevelPrivateValUsageAdded")
        public void testTopLevelPrivateValUsageAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/topLevelPrivateValUsageAdded/");
        }

        @TestMetadata("traitClassObjectConstantChanged")
        public void testTraitClassObjectConstantChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/traitClassObjectConstantChanged/");
        }

        @TestMetadata("valAddCustomAccessor")
        public void testValAddCustomAccessor() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/valAddCustomAccessor/");
        }

        @TestMetadata("valRemoveCustomAccessor")
        public void testValRemoveCustomAccessor() throws Exception {
            runTest("jps-plugin/testData/incremental/pureKotlin/valRemoveCustomAccessor/");
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/classHierarchyAffected")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ClassHierarchyAffected extends AbstractIncrementalJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInClassHierarchyAffected() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/classHierarchyAffected"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
        }

        @TestMetadata("annotationFlagRemoved")
        public void testAnnotationFlagRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/annotationFlagRemoved/");
        }

        @TestMetadata("annotationListChanged")
        public void testAnnotationListChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/annotationListChanged/");
        }

        @TestMetadata("bridgeGenerated")
        public void testBridgeGenerated() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/bridgeGenerated/");
        }

        @TestMetadata("classBecameFinal")
        public void testClassBecameFinal() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/classBecameFinal/");
        }

        @TestMetadata("classBecameInterface")
        public void testClassBecameInterface() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/classBecameInterface/");
        }

        @TestMetadata("classBecamePrivate")
        public void testClassBecamePrivate() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/classBecamePrivate/");
        }

        @TestMetadata("classMovedIntoOtherClass")
        public void testClassMovedIntoOtherClass() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/classMovedIntoOtherClass/");
        }

        @TestMetadata("classRemoved")
        public void testClassRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/classRemoved/");
        }

        @TestMetadata("classRemovedAndRestored")
        public void testClassRemovedAndRestored() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/classRemovedAndRestored/");
        }

        @TestMetadata("companionObjectInheritedMemberChanged")
        public void testCompanionObjectInheritedMemberChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/companionObjectInheritedMemberChanged/");
        }

        @TestMetadata("companionObjectMemberChanged")
        public void testCompanionObjectMemberChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/companionObjectMemberChanged/");
        }

        @TestMetadata("companionObjectNameChanged")
        public void testCompanionObjectNameChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/companionObjectNameChanged/");
        }

        @TestMetadata("companionObjectToSimpleObject")
        public void testCompanionObjectToSimpleObject() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/companionObjectToSimpleObject/");
        }

        @TestMetadata("constructorVisibilityChanged")
        public void testConstructorVisibilityChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/constructorVisibilityChanged/");
        }

        @TestMetadata("enumEntryAdded")
        public void testEnumEntryAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/enumEntryAdded/");
        }

        @TestMetadata("enumEntryRemoved")
        public void testEnumEntryRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/enumEntryRemoved/");
        }

        @TestMetadata("enumMemberChanged")
        public void testEnumMemberChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/enumMemberChanged/");
        }

        @TestMetadata("flagsAndMemberInDifferentClassesChanged")
        public void testFlagsAndMemberInDifferentClassesChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/flagsAndMemberInDifferentClassesChanged/");
        }

        @TestMetadata("flagsAndMemberInSameClassChanged")
        public void testFlagsAndMemberInSameClassChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/flagsAndMemberInSameClassChanged/");
        }

        @TestMetadata("implcitUpcast")
        public void testImplcitUpcast() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/implcitUpcast/");
        }

        @TestMetadata("inferredTypeArgumentChanged")
        public void testInferredTypeArgumentChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/inferredTypeArgumentChanged/");
        }

        @TestMetadata("inferredTypeChanged")
        public void testInferredTypeChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/inferredTypeChanged/");
        }

        @TestMetadata("lambdaParameterAffected")
        public void testLambdaParameterAffected() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/lambdaParameterAffected/");
        }

        @TestMetadata("methodAdded")
        public void testMethodAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/methodAdded/");
        }

        @TestMetadata("methodAnnotationAdded")
        public void testMethodAnnotationAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/methodAnnotationAdded/");
        }

        @TestMetadata("methodNullabilityChanged")
        public void testMethodNullabilityChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/methodNullabilityChanged/");
        }

        @TestMetadata("methodParameterWithDefaultValueAdded")
        public void testMethodParameterWithDefaultValueAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/methodParameterWithDefaultValueAdded/");
        }

        @TestMetadata("methodRemoved")
        public void testMethodRemoved() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/methodRemoved/");
        }

        @TestMetadata("overrideExplicit")
        public void testOverrideExplicit() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/overrideExplicit/");
        }

        @TestMetadata("overrideImplicit")
        public void testOverrideImplicit() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/overrideImplicit/");
        }

        @TestMetadata("propertyNullabilityChanged")
        public void testPropertyNullabilityChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/propertyNullabilityChanged/");
        }

        @TestMetadata("sealedClassImplAdded")
        public void testSealedClassImplAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/sealedClassImplAdded/");
        }

        @TestMetadata("sealedClassIndirectImplAdded")
        public void testSealedClassIndirectImplAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/sealedClassIndirectImplAdded/");
        }

        @TestMetadata("sealedClassNestedImplAdded")
        public void testSealedClassNestedImplAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/sealedClassNestedImplAdded/");
        }

        @TestMetadata("secondaryConstructorAdded")
        public void testSecondaryConstructorAdded() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/secondaryConstructorAdded/");
        }

        @TestMetadata("starProjectionUpperBoundChanged")
        public void testStarProjectionUpperBoundChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/starProjectionUpperBoundChanged/");
        }

        @TestMetadata("supertypesListChanged")
        public void testSupertypesListChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/supertypesListChanged/");
        }

        @TestMetadata("typeParameterListChanged")
        public void testTypeParameterListChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/typeParameterListChanged/");
        }

        @TestMetadata("varianceChanged")
        public void testVarianceChanged() throws Exception {
            runTest("jps-plugin/testData/incremental/classHierarchyAffected/varianceChanged/");
        }
    }

    @TestMetadata("jps-plugin/testData/incremental/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractIncrementalJsCompilerRunnerTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInJs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/js"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
        }

        @TestMetadata("jps-plugin/testData/incremental/js/friendsModuleDisabled")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class FriendsModuleDisabled extends AbstractIncrementalJsCompilerRunnerTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
            }

            public void testAllFilesPresentInFriendsModuleDisabled() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/js/friendsModuleDisabled"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
            }

            @TestMetadata("internalInlineFunctionIsChanged")
            public void testInternalInlineFunctionIsChanged() throws Exception {
                runTest("jps-plugin/testData/incremental/js/friendsModuleDisabled/internalInlineFunctionIsChanged/");
            }

            @TestMetadata("jps-plugin/testData/incremental/js/friendsModuleDisabled/internalInlineFunctionIsChanged")
            @TestDataPath("$PROJECT_ROOT")
            @RunWith(JUnit3RunnerWithInners.class)
            public static class InternalInlineFunctionIsChanged extends AbstractIncrementalJsCompilerRunnerTest {
                private void runTest(String testDataFilePath) throws Exception {
                    KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
                }

                public void testAllFilesPresentInInternalInlineFunctionIsChanged() throws Exception {
                    KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/js/friendsModuleDisabled/internalInlineFunctionIsChanged"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, true);
                }
            }
        }
    }
}
