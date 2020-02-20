package problem617A

fun minimumSteps(totalSteps: Int): Int {
    var neededSteps = totalSteps
    var stepCount = 0

    for (stepLength in 5 downTo 1) {
        while (neededSteps >= stepLength) {
            neededSteps -= stepLength
            ++stepCount
        }
    }

    return stepCount
}

fun main() {
    val input = readLine()!!.toInt()
    println(minimumSteps(input))
}
