package codeforces.problem50A

import kotlin.math.max
import kotlin.math.min

fun main() {
    val (m, n) = readLine()!!.split(' ').map{ it.toInt() }
    val larger = max(m, n)
    val smaller = min(m, n)

    var numDominoes = 0
    if (smaller % 2 != 0) {
        numDominoes = larger / 2
    }

    numDominoes += larger * (smaller / 2)

    println(numDominoes)
}
