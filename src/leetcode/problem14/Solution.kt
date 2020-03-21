package leetcode.problem14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        } else if (strs.size == 1) {
            return strs[0]
        }

        val sortedStrings = strs.sorted()

        val prefix = StringBuilder()

        val first = sortedStrings[0]
        val last = sortedStrings[sortedStrings.size - 1]

        for ((left, right) in first zip last) {
            if (left != right) {
                return prefix.toString()
            }
            prefix.append(left)
        }
        return prefix.toString()
    }
}
