package problem1296A

fun possibleOddSum(array: List<Int>): Boolean {
    return array.sum() % 2 != 0 ||
            (array.any { it % 2 == 0 } && array.any { it % 2 != 0 })
}

fun main() {
    val testCases = readLine()!!.toInt()

    val outputs = mutableListOf<String>()
    for (i in 0 until testCases) {
        readLine()!!
        val array = readLine()!!.split(' ').map { it.toInt() }
        outputs.add(if (possibleOddSum(array)) "YES" else "NO")
    }

    println(outputs.joinToString("\n"))
}
