package leetcode.problem21
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var ptrOne = l1
        var ptrTwo = l2

        val result = ListNode(-1) // Sentinel
        var current = result

        while (ptrOne != null || ptrTwo != null) {
            if (ptrOne != null && ptrTwo != null) {
                if (ptrOne.`val` <= ptrTwo.`val`) {
                    current.next = ListNode(ptrOne.`val`)
                    current = current.next!!
                    ptrOne = ptrOne.next
                } else {
                    current.next = ListNode(ptrTwo.`val`)
                    current = current.next!!
                    ptrTwo = ptrTwo.next
                }
            } else if (ptrTwo == null) {
                current.next = ListNode(ptrOne!!.`val`)
                current = current.next!!
                ptrOne = ptrOne.next
            } else {
                current.next = ListNode(ptrTwo.`val`)
                current = current.next!!
                ptrTwo = ptrTwo.next
            }
        }
        return result.next
    }
}

