package problem510A

fun main() {
    val (rows, columns) = readLine()!!.split(' ').map { it.toInt() }

    var onRight = true

    repeat((rows - 1) / 2) {
        println("#".repeat(columns))
        if (onRight) {
            print(".".repeat(columns - 1))
            println("#")
        } else {
            print("#")
            println(".".repeat(columns - 1))
        }
        onRight = !onRight
    }

    println("#".repeat(columns)) // Last line
}
