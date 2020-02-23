package problem1154A

fun findOriginalNumbers(numbers: List<Int>): List<Int> {
    val maximum = numbers.max()!!

    val result = mutableListOf<Int>()
    for (num in numbers) {
        if (num != maximum) {
            result.add(maximum - num)
        }
    }

    return result
}

fun main() {
    val input = readLine()!!.split(' ').map { it.toInt() }
    val (a, b, c) = findOriginalNumbers(input)
    println("$a $b $c")
}
