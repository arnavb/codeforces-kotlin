package codeforces.problem155A

fun main() {
    readLine()!!
    val contests = readLine()!!.split(' ').map { it.toInt() }

    var amazingPerformances = 0

    var minimum = contests[0]
    var maximum = contests[0]

    for (i in 1 until contests.size) {
        if (contests[i] > maximum) {
            maximum = contests[i]
            ++amazingPerformances
        }
        if (contests[i] < minimum) {
            minimum = contests[i]
            ++amazingPerformances
        }
    }

    println(amazingPerformances)
}
