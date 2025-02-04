package conditional_structures

fun main() {

//    if - else

    println("Digite um número inteiro - x:")
    var x = readln().toInt()

    println("Digite um número inteiro - y:")
    var y = readln().toInt()

    println("Digite um número inteiro - z:")
    var z = readln().toInt()

    if(x > y) {
        println("$x(x) is greater than $y(y).")
    } else if(x < y) {
        println("$x(x) is less than $y(y).")
    } else if(x == y) {
        println("$x(x) is equal to $y(y).")
    } else if(z > x ) {
        println("$z(z) is greater than $x(x).")
    } else if(y > z) {
        println("$y(y) is greater than $z(z).")
    } else if(x > z) {
        println("$x(x) is greater than $z(z).")
    }

    println("\n\n")

//    Forma alternativa de lidar com if/else
    println("Digite um número inteiro - x:")
     x = readln().toInt()

    println("Digite um número inteiro - y:")
     y = readln().toInt()

    println("Digite um número inteiro - z:")
     z = readln().toInt()

    val result = if (x > y) {
        "$x(x) is greater than $y(y)."
    } else if (x < y) {
        "$x(x) is less than $y(y)."
    } else if (x == y) {
        "$x(x) is equal to $y(y)."
    } else if (z > x) {
        "$z(z) is greater than $x(x)."
    } else if (y > z) {
        "$y(y) is greater than $z(z)."
    } else if (x > z) {
        "$x(x) is greater than $z(z)."
    } else {
        "No condition is satisfied."
    }

    println(result)


}