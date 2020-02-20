package problem1B

fun convertToExcelFormat(coord: String, alphabet: CharArray): String {
    val row = coord.substring(1, coord.indexOf('C'))
    var column = coord.substring(coord.indexOf('C') + 1).toInt()

    // Convert column number to letters
    val resultingColumn = StringBuilder()

    while (column > 26) {
        var remainder = column % 26
        if (remainder == 0) { // 0 is represented by Z with one less letter
            remainder = 26
        }
        resultingColumn.append(alphabet[remainder])
        column -= remainder
        column /= 26
    }
    resultingColumn.append(alphabet[column])
    return "${resultingColumn.reverse()}$row"
}

fun convertToNumericalFormat(coord: String, alphabet: CharArray): String {
    val firstDigitPos = coord.indexOfFirst { it.isDigit() }
    val row = coord.substring(firstDigitPos)
    val column = coord.substring(0, firstDigitPos)

    var convertedColumn = 0

    var powerOf26 = 1
    for (i in column.length - 1 downTo 0) {
        convertedColumn += powerOf26 * alphabet.binarySearch(column[i])
        powerOf26 *= 26
    }

    return "R${row}C$convertedColumn"
}

fun main() {
    val numLines = readLine()!!.toInt()
    val alphabet = "#ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()

    val outputs = mutableListOf<String>()
    for (i in 0 until numLines) {
        val currentLine = readLine()!!

        val positionOfC = currentLine.indexOf('C')
        if (positionOfC > 0 && currentLine[positionOfC - 1].isDigit()) {
            // Input is in Row Column format
            outputs.add(convertToExcelFormat(currentLine, alphabet))
        } else {
            // Input is in Letter Row format
            outputs.add(convertToNumericalFormat(currentLine, alphabet))
        }
    }

    println(outputs.joinToString("\n"))
}
