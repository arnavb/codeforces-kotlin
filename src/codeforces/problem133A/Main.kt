package codeforces.problem133A

fun main() {
    val program = readLine()!!

    println(if ('H' in program || 'Q' in program || '9' in program) "YES" else "NO")
}
