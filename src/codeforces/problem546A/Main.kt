package codeforces.problem546A

fun main() {
    val (firstCost, initialMoney, numBananas) =
        readLine()!!.split(' ').map { it.toLong() }

    var totalCost = firstCost

    for (i in 2..numBananas) {
        totalCost += firstCost * i
    }

    if (totalCost > initialMoney) {
        println(totalCost - initialMoney)
    } else {
        println(0)
    }
}
