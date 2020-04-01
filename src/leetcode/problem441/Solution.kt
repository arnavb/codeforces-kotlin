package leetcode.problem441

class Solution {
    fun arrangeCoins(n: Int): Int {
        var currentRow = 1
        var remaining = n

        while (remaining >= currentRow) {
            remaining -= currentRow
            ++currentRow
        }

        return currentRow - 1
    }
}
