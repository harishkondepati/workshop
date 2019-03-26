package org.jetbrains.kotlinworkshop.student.single._1BreakingSafety

/* optional task */

open class A(open val value: String) {
    init {
        value.toString()
    }
}

class B(override val value: String) : A(value)

fun main() {
    // Complete the declaration of the class A
    // so that NPE is thrown during the creation of its subclass B instance
    B("a")
}