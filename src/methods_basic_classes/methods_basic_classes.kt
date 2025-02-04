package methods_basic_classes

fun main() {
    val age = 25
    var ageDouble = age.toDouble()
    val monthPercent = 1.0/12

    val twoMonths = 2
    val tenMonths = 10



//  Se passou 2 meses
    ageDouble += twoMonths * monthPercent
    val result = "Depois de $twoMonths meses: $ageDouble anos."
    println(result)


//  Se passou 10 meses(total de 1 ano)
    ageDouble += tenMonths * monthPercent
    println("Depois de $tenMonths meses: " + ageDouble.toString().plus("anos."))
}