package problem59A

fun convertWord(word: String): Any? {
    val numUppercase = word.count { it.isUpperCase() }
    val numLowercase = word.length - numUppercase

    if (numUppercase > numLowercase) {
        return word.toUpperCase()
    }
    return word.toLowerCase()
}

fun main() {
    val word = readLine()!!.toString()
    println(convertWord(word))
}
