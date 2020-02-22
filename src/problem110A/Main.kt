//package problem110A

fun isNearlyLucky(number: String): Boolean {
    var numLuckyDigits = 0
    for (digit in number) {
        if (digit == '4' || digit == '7') {
            ++numLuckyDigits
        }
    }

    val converted = numLuckyDigits.toString()
    return converted.all { it == '4' || it == '7' }
}

fun main() {
    val number = readLine()!!
    println(if (isNearlyLucky(number)) "YES" else "NO")
}
