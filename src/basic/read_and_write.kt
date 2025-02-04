package basic

fun main() {


//    Read age and name
    println("Enter your name:")
    val name = readln()

    print( "Enter your age:")
    val age = readln().toInt()

    for(i in 1..age) {


        if(i == age){
            println("$name this is your age: $age!")
            return
        }

        println("$i...")
    }


}