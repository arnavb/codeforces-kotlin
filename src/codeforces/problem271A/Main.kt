package codeforces.problem271A

fun isUniqueYear(currentYear: Int): Boolean {
    val digits = BooleanArray(10)
    var year = currentYear

    while (year > 0) {
        val currentDigit = year % 10
        if (digits[currentDigit]) {
            return false
        }
        digits[currentDigit] = true
        year /= 10
    }
    return true
}

fun nextUniqueYear(startingYear: Int): Int {
    var currentYear = startingYear + 1

    while (!isUniqueYear(currentYear)) {
        ++currentYear
    }
    return currentYear
}

fun main() {
    val startingYear = readLine()!!.toInt()

    println(nextUniqueYear(startingYear))
}
