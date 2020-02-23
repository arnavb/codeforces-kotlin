package problem734A

fun wonMoreGames(chessGames: String): String {
    val antonWins = chessGames.count { it == 'A' }
    val danikWins = chessGames.length - antonWins

    return when {
        antonWins > danikWins -> "Anton"
        antonWins < danikWins -> "Danik"
        else -> "Friendship"
    }
}

fun main() {
    readLine()!!
    val chessGames = readLine()!!

    println(wonMoreGames(chessGames))
}
