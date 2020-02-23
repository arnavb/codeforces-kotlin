package problem1097A

fun canPlayCard(yourCard: String, tableCards: List<String>): Boolean {
    for (card in tableCards) {
        if (yourCard[0] == card[0] || yourCard[1] == card[1]) {
            return true
        }
    }
    return false
}

fun main() {
    val yourCard = readLine()!!
    val tableCards = readLine()!!.split(' ')

    println(if (canPlayCard(yourCard, tableCards)) "YES" else "NO")
}
