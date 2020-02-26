package codeforces.problem1296B

fun maximumBurlesSpent(number: Long): Long {
    var totalSpent = 0L
    var cardAmount = number

    while (cardAmount > 9) {
        val spent = cardAmount - cardAmount % 10
        cardAmount -= spent
        val cashBack = spent / 10
        cardAmount += cashBack
        totalSpent += spent
    }
    totalSpent += cardAmount

    return totalSpent
}

fun main() {
    val testCases = readLine()!!.toInt()
    val outputs = mutableListOf<Long>()

    for (i in 0 until testCases) {
        val input = readLine()!!.toLong()
        outputs.add(maximumBurlesSpent(input))
    }

    println(outputs.joinToString("\n"))
}
