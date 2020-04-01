package codeforces.problem1315A

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val testCases = nextInt()

    repeat(testCases) {
        val a = nextInt()
        val b = nextInt()
        val x = nextInt()
        val y = nextInt()

        val possibleAreas = IntArray(4)

        possibleAreas[0] = x * b
        possibleAreas[1] = (a - x - 1) * b
        possibleAreas[2] = y * a
        possibleAreas[3] = (b - y - 1) * a

        println(possibleAreas.max())
    }
}
