// "Create type parameter 'Test' in class 'C'" "false"
// ACTION: Add 'testng' to classpath
// ACTION: Add 'JUnit4' to classpath
// ACTION: Add 'JUnit5.0' to classpath
// ACTION: Create annotation 'Test'
// ACTION: Make internal
// ACTION: Make private
// ACTION: Make protected
// ERROR: Unresolved reference: Test
class C {
    @<caret>Test fun foo() {

    }
}