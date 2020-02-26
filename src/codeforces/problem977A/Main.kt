package codeforces.problem977A

fun numSubtractions(number: Long, iterations: Long): Long {
    var modifiedNumber = number

    for (i in 0 until iterations) {
        if (modifiedNumber % 10L == 0L) {
            modifiedNumber /= 10L
        } else {
            --modifiedNumber
        }
    }

    return modifiedNumber
}

fun main() {
    val (number, iterations) = readLine()!!.split(' ').map { it.toLong() }
    println(numSubtractions(number, iterations))
}
