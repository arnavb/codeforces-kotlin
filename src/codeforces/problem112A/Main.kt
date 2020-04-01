package codeforces.problem112A

fun compareStrings(first: String, second: String): Int {
    val comparison = first.compareTo(second, true)

    return when {
        comparison > 0 -> 1
        comparison == 0 -> 0
        else -> -1
    }
}

fun main() {
    val first = readLine()!!
    val second = readLine()!!
    println(compareStrings(first, second))
}
