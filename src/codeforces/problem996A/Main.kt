package codeforces.problem996A

fun minimumBills(money: Long): Long {
    var numberOfBills = 0L
    var moneyTracker = money

    for (bill in intArrayOf(100, 20, 10, 5, 1)) {
        while (moneyTracker >= bill) {
            moneyTracker -= bill
            ++numberOfBills
        }
    }
    return numberOfBills
}

fun main() {
    val money = readLine()!!.toLong()
    println(minimumBills(money))
}
