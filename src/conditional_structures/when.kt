package conditional_structures

//when

fun main() {

    println("Digite um número inteiro - x")
    val x = readln().toInt()

    val result = when(x){
        in 1 .. 99 -> "1..100"
        100 -> "100"
        in 101.. 1000 -> "101..1000"
        else -> "Not found"
    }

    println("x in $result")

    println("\n")

    println("Digite um número inteiro - y")
    val y = readln().toInt()

    val resulty = when(y) {
        in 1 .. 999 -> "1..999"
        10_000 -> "10_000"
        in 10_001.. 123253265 -> "101..123253265"
        else -> "Not found"
    }

    println("y in $resulty")

}