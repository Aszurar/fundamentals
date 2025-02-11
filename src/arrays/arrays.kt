package arrays

fun main() {
    val array: Array<Int> = arrayOf(1, 2, 3, 4, 5,)
    val secondArray: Array<String> = arrayOf("Lucas", "Sorvetão", "Sorvete")

    println("===== Valor direto =====")
    println("array: $array.")
    println("secondArray: $secondArray")
    print("\n")

    println("===== Valor tratado =====")
    val arrayFormatted = array.joinToString(prefix = "{ ", postfix = " }", separator = ", ")
    val secondArrayFormatted = secondArray.joinToString(prefix = "{ ", postfix = " }", separator = " | ")

    println("arrayFormatted: $arrayFormatted")
    println("secondArray: $secondArrayFormatted")
    println("")

    println("Soma de arrays")

    val thirdArray: Array<String> = arrayOf("Batata", "Sorvete", "Carangueijo")
    val thirdArrayFormatted = thirdArray.joinToString(prefix = "{ ", postfix = " }", separator = " - ")

    println("thirstArrayFormatted: $thirdArrayFormatted")


    val resultOfSum = secondArray + thirdArray
    val resultOfSumFormatted = resultOfSum.joinToString(prefix = "{ ", postfix = " }", separator = " - ")
    println("resultOfSum: $resultOfSumFormatted")



}