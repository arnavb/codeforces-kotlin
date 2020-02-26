package codeforces.problem791A

fun numYears(a: Int, b: Int): Int {
    var numYears = 0
    var limak = a
    var bob = b

    while (limak <= bob) {
        limak *= 3
        bob *= 2
        ++numYears
    }

    return numYears
}

fun main() {
    val (a, b) = readLine()!!.split(' ').map { it.toInt() }
    println(numYears(a, b))
}
