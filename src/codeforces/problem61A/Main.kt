package codeforces.problem61A

fun main() {
    val a = readLine()!!
    val b = readLine()!!.toBigInteger(2)

    println((a.toBigInteger(2) xor b).toString(2).padStart(a.length, '0'))
}
