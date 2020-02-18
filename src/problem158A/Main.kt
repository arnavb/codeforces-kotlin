package problem158A

fun numAdvancedParticipants(scores: List<Int>, kthPlace: Int) =
    scores.filter { it >= scores[kthPlace - 1] && it > 0 }.count()

fun main() {
    val (_, kthPlace) = readLine()!!
        .split(' ')
        .map { it.toInt() }
    val scores = readLine()!!.split(' ').map { it.toInt() }

    println(numAdvancedParticipants(scores, kthPlace))
}
