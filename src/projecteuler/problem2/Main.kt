package projecteuler.problem2

fun main() {
    var prev = 1
    var current = 1
    var next = prev + current

    var sum = 0
    while (current < 4_000_000) {
        if (current % 2 == 0) {
            sum += current
        }
        prev = current
        current = next
        next = prev + current
    }

    println(sum)
}
