package nulls_and_operators

import java.util.*

fun main() {
    val test: String? = null
    val result: String = test ?: "1" // => operador elvis

    println("test: $test")
    println("result: $result")

    // operadpr de chamada segura
    var newTest = -1
    newTest = test?.toInt() ?: 0

    println("newTest: $newTest")


    if(test != null) {
        println(test!!.uppercase(Locale.getDefault()))
    }


    //  Operador safe cast
    var newValue = test as? Int
    println("newValue: $newValue")


    test?.let {
        println(it)
    }
}
