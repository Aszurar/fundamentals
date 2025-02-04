package math_operators

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.ln
import kotlin.math.pow

fun main() {
    val num = 4
    val num2 = 2
    val num3 = 3

//    basic
    println("Basic Operators")

    println("num = $num")
    println("num2 = $num2")
    println("num3 = $num3")
    println("num + num2 = ${num + num2}")
    println("num - num2 = ${num - num2}")
    println("num * num2 = ${num * num2}")
    println("num / num2 = ${num / num2}")
    println("num3 / num = ${num3 / num}")
    println("num3 % num = ${num3 % num}")
    println("num3.toFloat / num = ${num3.toFloat() / num}")
    println("num % num2 = ${num % num2}")


    println("\n\n")

// ++ / --
    var num4 = 10
    var num5 = 20

    println("Increment and Decrement Operators")

    println("num4 = $num4")
    println("num5 = $num5")
    num4++
    num5++

    println("num4++ = $num4")
    println("num5++ = $num5")


    println("\n\n")

//+= , -= , *= , /=, ...
    println("Composite assignment")

    var num6 = 1

    println("num6 = $num6")
    num6 += num // num6 = 1 + 4
    println("+= $num6")

    println("num6 = $num6")
    num6 -= num // num6 = 5 - 4
    println("-= $num6")

    println("num6 = $num6")
    num6 *= num //num6 = 1 * 4
    println("*= $num6")


    println("num6 = $num6")
    num6 /= num //num6 = 4 / 4
    println("/= $num6")

    println("num6 = $num6")
    num6 %= num  //num6 = 1 * 4
    println("%= $num6")


    println("\n\n")

// Math lib => Java
    println("math lib from Java")

    val value = 2.75
    println("value = $value")
    val valueRounded = Math.round(value)

    println("Math.round(value) = $valueRounded")

    val valueFloor = Math.floor(value)
    println("Math.floor(value) = $valueFloor")

    val valueCeil = Math.ceil(value)
    println("Math.ceil(value) = $valueCeil")


//    pow

    print("Pow: 2(ˆ3)")
    val base = 2.0
    val exponent = 3.0
    val valuePow = Math.pow(base, exponent)

    println("2ˆ3 = $valuePow")


//    logaritm
    val logValue = Math.log(100.00)
    println("10 log 10 = $logValue")


    println("\n\n")


// Math lib => Kotlin
    println("math lib from Kotlin")

    val value2 = 2.75
    println("value = $value")
    val valueRounded2 = Math.round(value)

    println("Math.round(value) = $valueRounded")

    val valueFloor2 = floor(value)
    println("Math.floor2(value) = $valueFloor2")

    val valueCeil2 = ceil(value)
    println("Math.ceil2(value) = $valueCeil2")


//    pow

    print("Pow: 2(ˆ3)")
    val base2 = 2.0
    val exponent2 = 3.0
    val valuePow2 = base.pow(exponent)

    println("2ˆ3 = $valuePow")


//    logaritm
    val logValue2 = ln(100.00)
    println("10 log 10 = $logValue2")

}