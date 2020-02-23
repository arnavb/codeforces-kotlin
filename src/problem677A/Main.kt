package problem677A

fun readInts() = readLine()!!.split(' ').map { it.toInt() }

fun minWidth(maxHeight: Int, heights: List<Int>): Int {
    var result = 0
    for (height in heights) {
        if (height > maxHeight) {
            ++result
        }
        ++result
    }
    return result
}

fun main() {
    val (_, maxHeight) = readInts()
    val heights = readInts()

    println(minWidth(maxHeight, heights))
}
