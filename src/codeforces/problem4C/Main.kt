package codeforces.problem4C

fun main() {
    val testCases = readLine()!!.toInt()

    val database = hashMapOf<String, Int>()

    repeat(testCases) {
        val username = readLine()!!

        if (username in database) {
            database[username] = database[username]!! + 1
            println("$username${database[username]}")
        } else {
            database[username] = 0
            println("OK")
        }
    }
}
