package codeforces.problem1157A

fun f(x: Int): Int {
    var number = x + 1
    while (number % 10 == 0) {
        number /= 10
    }
    return number
}

fun reachableNumbersCount(x: Int): Int {
    val foundNumbers = hashSetOf<Int>()

    var current = x
    while (!foundNumbers.contains(current)) {
        foundNumbers.add(current)
        current = f(current)
    }
    return foundNumbers.size
}

fun main() {
    val input = readLine()!!.toInt()
    val count = reachableNumbersCount(input)

    println(count)
}
