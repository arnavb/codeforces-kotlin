package codeforces.problem160A

fun main() {
    readLine()!!
    val coins = readLine()!!.split(' ').map { it.toInt() }.sortedDescending()

    var yourSum = 0
    var numCoins = 0
    var twinSum = coins.sum()

    for (coin in coins) {
        if (yourSum <= twinSum) {
            yourSum += coin
            twinSum -= coin
            ++numCoins
        }
    }
    println(numCoins)
}

