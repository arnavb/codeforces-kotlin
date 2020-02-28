package codeforces.problem318A

fun main() {
    val (number, position) = readLine()!!.split(' ').map { it.toLong() }

    if (number % 2L == 0L) {
        if (position <= number / 2L) {
            println(position * 2L - 1L)
        } else {
            println((position - number / 2L) * 2L)
        }
    } else {
        if (position <= number / 2L + 1L) {
            println(position * 2L - 1L)
        } else {
            println((position - (number / 2L + 1L)) * 2L)
        }
    }
}
