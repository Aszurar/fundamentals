package exception_control_structures


fun main() {

    var x = 1

    try {
        x = 20 / 0
    } catch (e: Exception) {
        println("\nException caught: ${e.message}")
    } finally {
        println("Finally block is always executed, even if there is an exception or no")
    }

}
