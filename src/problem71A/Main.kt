package problem71A

fun convertWord(word: String) = when {
    word.length > 10 -> "${word[0]}${word.length - 2}${word[word.length - 1]}"
    else -> word
}

fun main() {
    val numLines = readLine()!!.toInt()
    val convertedWords = mutableListOf<String>()

    for (i in 0 until numLines) {
        val currentLine = readLine()!!
        convertedWords.add(convertWord(currentLine))
    }

    println(convertedWords.joinToString("\n"))
}
