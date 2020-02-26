package leetcode.problem7

class Solution {
    fun reverse(x: Int): Int {
        val negative = if (x < 0) -1 else 1
        var number = (x * negative).toLong()
        var result = 0L

        while (number > 0L) {
            result *= 10L
            result += number % 10L
            number /= 10L
        }

        result *= negative

        if (result in Int.MIN_VALUE..Int.MAX_VALUE) {
            return result.toInt()
        }
        return 0
    }
}
