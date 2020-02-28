package codeforces.problem1297A

fun main() {
    val testCases = readLine()!!.toInt()

    repeat(testCases) {
        val likes = readLine()!!.toLong()

        if (likes in 0..999) {
            println(likes)
        } else if (likes < 1_000_000L) {
            val remainder = likes % 1_000L

            when {
                likes >= 999_500L -> println("1M")
                remainder >= 500L -> println("${(likes / 1_000L) + 1}K")
                else -> println("${likes / 1_000L}K")
            }
        } else {
            val remainder = likes % 1_000_000L

            if (remainder >= 500_000L) {
                println("${(likes / 1_000_000L) + 1}M")
            } else {
                println("${likes / 1_000_000L}M")
            }
        }
    }
}
