package codeforces.problem200B

fun main() {
    readLine()!!
    val drinks = readLine()!!.split(' ').map { it.toInt() }

    println(drinks.average())
}
