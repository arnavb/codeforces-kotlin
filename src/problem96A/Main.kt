package problem96A

fun isDangerous(lineup: String): Boolean {
    var currentPlayer = lineup[0]
    var streakLength = 1

    for (i in 1 until lineup.length) {
        if (lineup[i] == currentPlayer) {
            ++streakLength

            if (streakLength == 7) {
                return true
            }
        } else {
            currentPlayer = lineup[i]
            streakLength = 1
        }
    }

    return false
}

fun main() {
    val input = readLine()!!

    println(if (isDangerous(input)) "YES" else "NO")
}
