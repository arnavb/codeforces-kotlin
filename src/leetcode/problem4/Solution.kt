package leetcode.problem4

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val combined = nums1 + nums2
        combined.sort()

        if (combined.size % 2 == 0) {
            return (combined[combined.size / 2 - 1] + combined[combined.size / 2]) / 2.0
        }
        return combined[combined.size / 2].toDouble()
    }
}
