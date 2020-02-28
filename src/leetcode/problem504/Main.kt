package leetcode.problem504

class Solution {
    fun convertToBase7(num: Int): String {
        if (num == 0) {
            return "0"
        }

        val result = StringBuilder()

        val negative = if (num < 0) -1 else 1
        var number = num * negative

        while (number > 0) {
            result.append(number % 7)
            number /= 7
        }

        return (result.reversed().toString().toInt() * negative).toString()
    }
}
