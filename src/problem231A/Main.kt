package problem231A

fun sureAboutProblem(petya: Int, vasya: Int, tonya: Int) =
    petya + vasya + tonya >= 2

fun main() {
    val numLines = readLine()!!.toInt()
    var result = 0
    for (i in 0 until numLines) {
        val (petya, vasya, tonya) = readLine()!!.split(' ').map { it.toInt() }
        if (sureAboutProblem(petya, vasya, tonya)) {
            ++result
        }
    }

    println(result)
}
