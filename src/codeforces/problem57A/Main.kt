package codeforces.problem57A

const val HELLO = "hello"

fun saidHello(input: String): Boolean {
    var helloPos = 0
    var seenLetters = 0

    for (char in input) {
        if (char == HELLO[helloPos]) {
            ++seenLetters

            if (seenLetters == 5) {
                return true
            }

            ++helloPos
        }
    }

    return false
}

fun main() {
    val input = readLine()!!

    println(if (saidHello(input)) "YES" else "NO")
}
