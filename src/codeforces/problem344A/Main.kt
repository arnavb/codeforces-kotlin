package codeforces.problem344A

fun main() {
    val testCases = readLine()!!.toInt()

    var groups = 0
    var previousPair = -1

    repeat(testCases) {
        val currentPair = readLine()!!.toInt()
        if (currentPair != previousPair) {
            ++groups
            previousPair = currentPair
        }
    }

    println(groups)
}
