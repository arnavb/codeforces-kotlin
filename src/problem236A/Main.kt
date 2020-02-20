package problem236A

fun numDistinctCharacters(username: String): Int {
    val letterMap = hashMapOf<Char, Int>()

    for (char in username) {
        letterMap[char] = (letterMap[char] ?: 0) + 1
    }
    return letterMap.size
}

fun main() {
    val input = readLine()!!
    println(if (numDistinctCharacters(input) % 2 == 0) "CHAT WITH HER!" else "IGNORE HIM!")
}
