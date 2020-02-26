package codeforces.problem467A

fun main() {
    val testCases = readLine()!!.toInt()

    var sum = 0

    repeat(testCases) {
        val (people, capacity) = readLine()!!.split(' ').map { it.toInt() }
        if (capacity - people >= 2) {
            ++sum
        }
    }

    println(sum)
}
