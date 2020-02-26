package codeforces.problem69A

fun main() {
    val numLines = readLine()!!.toInt()

    var xTotal = 0
    var yTotal = 0
    var zTotal = 0
    for (i in 0 until numLines) {
        val (x, y, z) = readLine()!!.split(' ').map { it.toInt() }
        xTotal += x
        yTotal += y
        zTotal += z
    }

    if (xTotal == 0 && yTotal == 0 && zTotal == 0) {
        println("YES")
    } else {
        println("NO")
    }
}
