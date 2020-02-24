package problem270A

import kotlin.math.floor

fun possibleFence(angle: Int): Boolean {
    /*
     * Using: a = 180(n - 2) / n
     *        a * n = 180n - 360
     *        (a - 180)n = -360
     *        n = -360/(a - 180) = 360/(180 - a)
    */
    if (angle == 180) { // To prevent division by 0
        return false
    }

    val possibleSideLength = 360.0 / (180 - angle)

    return possibleSideLength == floor(possibleSideLength)
}

fun main() {
    val testCases = readLine()!!.toInt()

    val outputs = mutableListOf<String>()

    repeat(testCases) {
        val angle = readLine()!!.toInt()
        outputs.add(if (possibleFence(angle)) "YES" else "NO")
    }

    println(outputs.joinToString("\n"))
}
