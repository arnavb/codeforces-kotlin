package projecteuler.problem6

fun main() {
    var sumOfSquares = 0
    var squareOfSums = 0

    for (i in 1..100) {
        sumOfSquares += i * i
        squareOfSums += i
    }

    squareOfSums *= squareOfSums

    println(squareOfSums - sumOfSquares)
}
