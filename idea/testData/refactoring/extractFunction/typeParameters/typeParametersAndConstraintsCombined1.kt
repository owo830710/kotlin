// PARAM_TYPES: A<T>
// PARAM_TYPES: A<T>.B<U>
// PARAM_TYPES: V, Data
// PARAM_DESCRIPTOR: public final class A<T : Data> where T : DataEx defined in root package
// PARAM_DESCRIPTOR: public final inner class B<U : Data> where U : DataExEx defined in A
// PARAM_DESCRIPTOR: value-parameter val v: V defined in A.B.foo
open class Data(val x: Int)
interface DataEx
interface DataExEx

// SIBLING:
class A<T: Data>(val t: T) where T: DataEx {
    inner class B<U: Data>(val u: U) where U: DataExEx {
        fun <V: Data> foo(v: V): Int where V: DataEx {
            return <selection>t.x + u.x + v.x</selection>
        }
    }
}