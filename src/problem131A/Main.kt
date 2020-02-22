package problem131A

fun switchCase(word: String): String {
    if (word.length == 1) {
        if (word[0].isUpperCase()) {
            return word.toLowerCase()
        }
        return word.toUpperCase()
    }

    if (word.all { it.isUpperCase() }) {
        return word.toLowerCase()
    } else if (word.substring(1).all{ it.isUpperCase() }) {
        return "${word[0].toUpperCase()}${word.substring(1).toLowerCase()}"
    }
    return word
}

fun main() {
    val input = readLine()!!

    println(switchCase(input))
}
