package codeforces.problem41A

fun main() {
    val firstWord = readLine()!!
    val secondWord = readLine()!!

    println(if (firstWord == secondWord.reversed()) "YES" else "NO")
}
