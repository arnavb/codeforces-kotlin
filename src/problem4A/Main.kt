package problem4A

fun canDivideWatermelon(weight: Int) =
    (weight - 2) % 2 == 0 && weight > 2

fun main() {
    val input = readLine()!!.toInt()
    val result = canDivideWatermelon(input)
    println(if (result) "YES" else "NO")
}
