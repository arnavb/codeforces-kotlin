package problem1311A

fun main() {
    val testCases = readLine()!!.toInt()

    val outputs = mutableListOf<Char>()

    repeat(testCases) {
        val (a, b) = readLine()!!.split(' ').map { it.toInt() }

        when {
            b == a -> outputs.add('0')
            b > a && (b - a) % 2 != 0 -> outputs.add('1')
            b < a && (a - b) % 2 == 0 -> outputs.add('1')
            else -> outputs.add('2')
        }
    }

    println(outputs.joinToString("\n"))
}
