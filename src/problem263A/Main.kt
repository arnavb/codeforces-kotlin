package problem263A

import kotlin.math.abs

fun minimumMoves(i: Int, j: Int) =
    abs(i - 3) + abs(j - 3)

fun main() {
    var moves = -1
    for (i in 1..5) {
        val currentRow = readLine()!!

        if ('1' in currentRow) {
            val digitPos = currentRow.split(' ').indexOf("1") + 1
            moves = minimumMoves(i, digitPos)
        }
    }

    println(moves)
}
