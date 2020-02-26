package codeforces.problem479A

fun main() {
    val numbers = listOf(readLine()!!, readLine()!!, readLine()!!).map { it.toInt() }

    val possibilities = mutableListOf(numbers.reduce { acc, i -> acc * i }, numbers.sum())
    possibilities.add(numbers[0] + numbers[1] * numbers[2])
    possibilities.add((numbers[0] + numbers[1]) * numbers[2])
    possibilities.add(numbers[0] * numbers[1] + numbers[2])
    possibilities.add(numbers[0] * (numbers[1] + numbers[2]))

    println(possibilities.max())
}
