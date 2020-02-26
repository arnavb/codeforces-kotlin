package codeforces.problem116A

fun main() {
    val numStops = readLine()!!.toInt()

    var currentlyOnBoard = 0
    var capacity = 0
    for (i in 0 until numStops) {
        val (exiting, entering) = readLine()!!.split(' ').map { it.toInt() }
        currentlyOnBoard += entering
        currentlyOnBoard -= exiting

        if (currentlyOnBoard > capacity) {
            capacity = currentlyOnBoard
        }
    }

    println(capacity)
}
