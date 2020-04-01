package codeforces.problem807A

fun main() {
    val numParticipants = readLine()!!.toInt()
    val participantRatings = mutableListOf<Int>()

    repeat(numParticipants) {
        val (oldRating, newRating) = readLine()!!.split(' ').map { it.toInt() }
        if (oldRating != newRating) {
            println("rated")
            return
        }
        participantRatings.add(oldRating)
    }

    var previousRating = participantRatings[0]
    for (rating in participantRatings.drop(1)) {
        if (rating > previousRating) {
            println("unrated")
            return
        }
        previousRating = rating
    }

    println("maybe")
}
