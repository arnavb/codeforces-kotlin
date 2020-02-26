package codeforces.problem1186A

fun main() {
    val (participants, pens, notebooks) = readLine()!!.split(' ').map { it.toInt() }
    if (pens >= participants && notebooks >= participants) {
        println("Yes")
    } else {
        println("No")
    }
}
