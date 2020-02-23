package problem705A

fun hulkFeelings(layers: Int): String {
    val result = mutableListOf<String>()
    for (i in 0 until layers) {
        if (i % 2 == 0) {
            result.add("I hate")
        } else {
            result.add("I love")
        }
    }
    return "${result.joinToString(" that ")} it"
}

fun main() {
    val layers = readLine()!!.toInt()
    println(hulkFeelings(layers))
}
