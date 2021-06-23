package functions

fun main() {
    val a: Int = 10
    val b: Int = 15

    fun sum(a: Int, b: Int) : Int {
        return a + b
    }
    println(sum(a, b))

    fun sayHello() {
        println("Hello")
    }
    sayHello()
}