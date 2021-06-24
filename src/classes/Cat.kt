package classes

class Cat(val name: String, var weight: Int, val breed: String) {

    init {
        println("Кот создан")
    }



    fun sleep(age: Int) {
        if (age < 3)
            println("сопит")
        else
            println("храпит")
    }

    override fun toString(): String {
        return "Cat(name='$name', weight=$weight, breed='$breed')"
    }

}