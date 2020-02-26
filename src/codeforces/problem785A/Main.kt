package codeforces.problem785A

fun main() {
    val numPolyhedrons = readLine()!!.toInt()

    var sum = 0
    for (i in 0 until numPolyhedrons) {
        val currentShape = readLine()!!

        sum += when (currentShape[0]) {
            'T' -> 4
            'C' -> 6
            'O' -> 8
            'D' -> 12
            else -> 20
        }
    }

    println(sum)
}
