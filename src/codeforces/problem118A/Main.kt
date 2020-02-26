package codeforces.problem118A

import java.lang.StringBuilder

fun convertWord(word: String): String {
    val initialModifications = word.toLowerCase().filter { "aeiouy".indexOf(it) == -1 }

    val result = StringBuilder()
    for (char in initialModifications) {
        result.append(".$char")
    }

    return result.toString()
}

fun main() {
    val input = readLine()!!
    println(convertWord(input))
}
