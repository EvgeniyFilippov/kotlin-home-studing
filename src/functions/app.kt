package functions

fun main() {
    val a: Int = 10
    val b: Int = 15

    fun sum(a: Int, b: Int): Int {
        return a + b
    }
    println(sum(a, b))

    fun sayHello() {
        println("Hello")
    }
    sayHello()

    var mySum = sum(2, 2)
    println(mySum)

    //функция со значениями по-умолчанию
    fun mySumWithDefault(a: Int, b: Int = 5, c: Int = 5): Int{
        return a + b + c
    }
    println(mySumWithDefault(1))
}