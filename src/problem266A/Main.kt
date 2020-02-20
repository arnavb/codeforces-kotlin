package problem266A

fun containsDuplicateNeighbors(stones: List<Char>): Boolean {
    for (i in 0 until stones.size - 1) {
        if (stones[i] == stones[i + 1]) {
            return true
        }
    }

    return false
}

fun removeDuplicateNeighbors(stones: MutableList<Char>): Int {
    var numRemoved = 0
    for (i in stones.size - 1 downTo 1) {
        if (stones[i] == stones[i - 1]) {
            stones.removeAt(i)
            ++numRemoved
        }
    }
    return numRemoved
}

fun main() {
    readLine()!!
    val stones = readLine()!!.toMutableList()
    var numRemoved = 0

    while (containsDuplicateNeighbors(stones)) {
        numRemoved += removeDuplicateNeighbors(stones)
    }

    println(numRemoved)
}
