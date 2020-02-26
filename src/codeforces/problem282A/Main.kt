package codeforces.problem282A

class Interpreter {
    var variable = 0

    fun run(command: String) {
        variable += when {
            '+' in command -> 1
            else -> -1
        }
    }
}

fun main() {
    val numLines = readLine()!!.toInt()

    val interpreter = Interpreter()

    for (i in 0 until numLines) {
        interpreter.run(readLine()!!)
    }

    println(interpreter.variable)
}
