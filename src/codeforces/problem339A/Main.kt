package codeforces.problem339A

fun rearrangeSum(sum: String) =
    sum.split('+').map { it.toInt() }.sorted().joinToString("+")

fun main() {
    val input = readLine()!!
    println(rearrangeSum(input))
}
