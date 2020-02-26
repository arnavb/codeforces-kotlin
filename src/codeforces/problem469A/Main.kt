package codeforces.problem469A

fun readInts() = readLine()!!.split(' ').map { it.toInt() }

fun becomesTheGuy(levels: Int, littleXLevels: List<Int>, littleYLevels: List<Int>): Boolean {
    for (i in 1..levels) {
        if (i !in littleXLevels && i !in littleYLevels) {
            return false
        }
    }

    return true
}

fun main() {
    val levels = readLine()!!.toInt()
    val littleXLevels = readInts().drop(1)
    val littleYLevels = readInts().drop(1)

    if (becomesTheGuy(levels, littleXLevels, littleYLevels)) {
        println("I become the guy.")
    } else {
        println("Oh, my keyboard!")
    }
}
