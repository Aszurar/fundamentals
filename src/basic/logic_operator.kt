package basic

fun main() {
    val a = true
    val b = false
    val c = true

//    && -
    val result = a && b
    val result2 = a && c
    val result3 = a && b && c

    println("&& - AND Operator")
    println("result1: $result")
    println("result2: $result2")
    println("result3: $result3")
    println("result1 + result2: ${result && result2}")
    println("result1 + result2 + result3: ${result && result2 && result3}")

    println("\n\n")
//    ||
    val result4 = a || b
    val result5 = a || c
    val result6 = a || b || c

    println("|| - OR Operator")
    println("result4: $result4")
    println("result5: $result5")
    println("result6: $result6")
    println("result4 + result5: ${result4 || result5}")
    println("result4 + result5 + result6: ${result4 || result5 || result6}")

    println("\n\n")

//    !
    val e = true
    val f = !e

    println("! - NOT Operator")
    println("e: $e")
    println("f: $f")
    println("!e: ${!e}")
    println("!f: ${!f}")

    println("\n\n")

//    ==
    val g = 10
    val h = 5

    println("== - EQUALS Operator")
    println("g: $g")
    println("h: $h")
    println("g == h: ${g == h}")

    println("\n\n")

//    !=
    println("\n!= - NOT EQUALS Operator")
    println("g != h: ${g != h}")

    println("\n\n")

//    is
    val i: Any = 1
    val j: Any = "1"

    println("is - IN Operator")
    println("i is String: ${i is String}")
    println("j is String: ${j is String}")

    println("i !is Int: ${i !is Int}")
    println("j !is Int: ${j !is Int}")

    println("\n\n")

//    in
    val range = 1..10
    val x = 5
    val y = 15
    println("in - IN Operator")
    println("x in range: ${x in range}")
    println("y in range: ${y in range}")

    println("x !in range: ${x !in range}")
    println("y !in range: ${y !in range}")



}