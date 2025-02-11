package lists

fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val mutableList = mutableListOf(10, 20, 30)

    mutableList.add(40)

    println("list: $list")
    println("mutableList: $mutableList")


    println("\n-------------- \n ")


    println("\n filters \n ")

    val listWithManyElements = listOf(1, 2, 3, true, false, "sorvete", "torta", "pave", "brigadeiro", 4, 5, 6, 7, 8, 9, 10)

    val intList = listWithManyElements.filterIsInstance<Int>()
    val intListWithHigherThan2 = listWithManyElements.filter{ it is Int && it > 2}
    val intListWithPairElements = listWithManyElements.filter{ it is Int && it % 2 == 0}
    val intListWithOddElements = listWithManyElements.filter{ it is Int && it % 2 == 1}

    val stringList = listWithManyElements.filterIsInstance<String>()


    println("listWithManyElements: $listWithManyElements")
    println("intList: $intList")
    println("intListWithHigherThan2: $intListWithHigherThan2")
    println("intListWithOddElements: $intListWithOddElements")
    println("intListWithPairElements: $intListWithPairElements")
    println("stringList: $stringList")


    println("\n order \n ")

    val intListDescSorted = intList.sortedDescending()
    val stringListDescSorted = stringList.sortedDescending()

    val intListSorted = intListDescSorted.sorted()
    val stringListSorted = stringListDescSorted.sorted()


    println("intList: $intList")
    println("stringList: $stringList")

    println("intListDescSorted: $intListDescSorted")
    println("stringListDescSorted: $stringListDescSorted")

    println("intListSorted: $intListSorted")
    println("stringListSorted: $stringListSorted")


    println("\n find/max/min \n ")

    val maxIntValue = intList.max()
    val minIntValue = intList.min()

    val findTheFirstOddElement = listWithManyElements.find { it is Int && it % 2 == 1}
    val findTheLastOddElement = listWithManyElements.findLast { it is Int && it % 2 == 1 }

    println("intlist: $intList")
    println("maxIntValue: $maxIntValue")
    println("minIntValue: $minIntValue")
    println("------------")
    println("listWithManyElements: $listWithManyElements")
    println("findTheFirstOddElement: $findTheFirstOddElement")
    println("findTheLastOddElement: $findTheLastOddElement")


    println("\n elementAt/indexOf \n ")


    val findTheFifthElement = listWithManyElements.elementAt(4)
    val findTheSixthElement = listWithManyElements.elementAt(5)

    val findTheIndexOfElement1 = listWithManyElements.indexOf("sorvete")
    val findTheIndexOfElement2 = listWithManyElements.indexOf(8)

    println("listWithManyElements: $listWithManyElements")

    println("findTheFifthElement: $findTheFifthElement")
    println("findTheSixthElement: $findTheSixthElement")

    println("findTheIndexOfElement1: $findTheIndexOfElement1")
    println("findTheIndexOfElement2: $findTheIndexOfElement2")


    println("\n map \n ")

    val booleansElementsHigherThen5 = intList.map { it > 5}

    println("intlist: $intList")
    println("booleansElementsHigherThen5: $booleansElementsHigherThen5")

}