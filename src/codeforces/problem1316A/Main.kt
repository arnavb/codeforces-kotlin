package codeforces.problem1316A

fun readIntList() = readLine()!!.split(' ').map { it.toInt() }

fun main() {
    val testCases = readLine()!!.toInt()

    repeat(testCases) {
        val (_, highestPossibleScore) = readIntList()
        val scores = readIntList().toMutableList()

        for (i in 1 until scores.size) {
            while (scores[0] < highestPossibleScore && scores[i] > 0) {
                ++scores[0]
                --scores[i]
            }
        }
        println(scores[0])
    }
}
