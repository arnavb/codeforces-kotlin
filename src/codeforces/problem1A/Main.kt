package codeforces.problem1A

import java.math.BigInteger

fun leastFlagstones(length: BigInteger, width: BigInteger, flagstoneSize: BigInteger): BigInteger {
    var neededForLength = (length - length % flagstoneSize) / flagstoneSize
    var neededForWidth = (width - width % flagstoneSize) / flagstoneSize

    if (length % flagstoneSize != BigInteger.ZERO) ++neededForLength
    if (width % flagstoneSize != BigInteger.ZERO) ++neededForWidth
    return neededForLength * neededForWidth
}

fun main() {
    val (length, width, flagstoneSize) = readLine()!!
        .split(' ')
        .map { it.toBigInteger() }
    println(leastFlagstones(length, width, flagstoneSize))
}
