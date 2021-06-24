package classes

fun main() {
    var cat = Cat("Tom", 10, "semiz")
    println(cat.weight)
    cat.weight = 11
    println(cat.weight)
    cat.sleep(3)
    val cats = arrayOf(Cat("Jon", 12, "persian"), cat)
    println(cats[0].name + " " + cats[1].name)


  //оператор ?.
    var str: String? = "test"
    str = null
    var c: Int? = str?.length
    println(c)

    //оператор ?:
    var str2: String? = null
    var d: String? = str2 ?: "eto nol"
    println(d)




}