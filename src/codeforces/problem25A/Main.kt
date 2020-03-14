package codeforces.problem25A

fun main() {
    readLine()!!
    val numbers = readLine()!!.split(' ').map { it.toInt() }

    val first = numbers[0]
    val second = numbers[1]
    val third = numbers[2]

    var unusualIsEven = false
    if ((first + second) % 2 == 0) {
        if (first % 2 != 0) {
            unusualIsEven = true
        }
    } else if (third % 2 != 0) {
        unusualIsEven = true
    }

    for ((i, number) in numbers.withIndex()) {
        if (unusualIsEven && number % 2 == 0) {
            println(i + 1)
            break
        }
        if (!unusualIsEven && number % 2 != 0) {
            println(i + 1)
            break
        }
    }
}
