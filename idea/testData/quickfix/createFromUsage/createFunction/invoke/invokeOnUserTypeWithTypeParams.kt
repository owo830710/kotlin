// "Create member function 'invoke'" "true"

class A<T>(val n: T)
class B<T>(val m: T)

fun <U, V> test(u: U): B<V> {
    return A(u)<caret>(u, "u")
}