package codeforces.problem443A

fun numDistinctCharacters(set: String): Int {
    var i = 1
    val seenCharacters = BooleanArray(26)

    while (set[i] != '}') {
        if (set[i] != ',' && set[i] != ' ') {
            // Mark seen characters
            seenCharacters[(set[i].toUpperCase() - 65).toInt()] = true
        }

        ++i
    }

    return seenCharacters.count { it }
}

fun main() {
    val set = readLine()!!

    println(numDistinctCharacters(set))
}
