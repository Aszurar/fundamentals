package late_inits

fun main() {

    lateinit var name: String


    name = "Lucas de Lima"

    println("Testando 2: $name")


    val age: Int by lazy {
        10
    }

    println("Idade: $age")

}