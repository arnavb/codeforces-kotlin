package problem1220A

fun main() {
    readLine()!!
    val string = readLine()!!

    val numZeros = string.count { it == 'z' }
    val numOnes = string.count { it == 'n' }

    repeat(numOnes) {
        print("1")

        if (it < numOnes) {
            print(" ")
        }
    }

    repeat(numZeros) {
        print("0")

        if (it < numZeros) {
            print(" ")
        }
    }
    println()
}
