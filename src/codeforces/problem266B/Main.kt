package codeforces.problem266B

fun swapPositions(queue: MutableList<Char>, i: Int, j: Int) {
    val temp = queue[i]
    queue[i] = queue[j]
    queue[j] = temp
}

fun rearrangeChildren(queue: MutableList<Char>, time: Int) {
    for (i in 0 until time) {
        var queuePosition = 1

        while (queuePosition < queue.size) {
            // If a boy is ahead of a girl
            if (queue[queuePosition] == 'G' && queue[queuePosition - 1] == 'B') {
                swapPositions(queue, queuePosition, queuePosition - 1)
                ++queuePosition // To avoid swapping already swapped people
            }
            ++queuePosition
        }
    }
}

fun main() {
    val (_, time) = readLine()!!.split(' ').map { it.toInt() }
    val queue = readLine()!!.toMutableList()

    rearrangeChildren(queue, time)
    println(queue.joinToString(""))
}
