package codeforces.problem1303A

fun numZerosToRemove(string: String): Int {
    val totalZeros = string.count { it == '0' }

    var numLeadingZeros = 0
    for (char in string) {
        if (char == '1') {
            break
        }
        ++numLeadingZeros
    }

    var numTrailingZeros = 0
    for (i in string.length - 1 downTo 0) {
        if (string[i] == '1') {
            break
        }
        ++numTrailingZeros
    }

    val result = totalZeros - numLeadingZeros - numTrailingZeros

    return if (result > 0) result else 0
}

fun main() {
    val testCases = readLine()!!.toInt()

    repeat(testCases) {
        println(numZerosToRemove(readLine()!!))
    }
}
