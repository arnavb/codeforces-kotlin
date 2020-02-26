package leetcode.problem1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val elements = hashMapOf<Int, Int>()

        for (i in nums.indices) {
            val difference = target - nums[i]
            if (difference in elements) {
                return intArrayOf(elements[difference]!!, i)
            }
            elements[nums[i]] = i
        }

        return intArrayOf(-1, -1)
    }
}
