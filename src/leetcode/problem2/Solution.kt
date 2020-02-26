package leetcode.problem2

import java.math.BigInteger

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
    private fun getNumber(startingNode: ListNode?): BigInteger {
        var result = 0.toBigInteger()
        var current = startingNode
        var powerOfTen = 1.toBigInteger()

        while (current != null) {
            result += current.`val`.toBigInteger() * powerOfTen
            powerOfTen *= 10.toBigInteger()
            current = current.next
        }

        return result
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val num1 = getNumber(l1)
        val num2 = getNumber(l2)

        var sum = num1 + num2

        val startingNode = ListNode((sum % 10.toBigInteger()).toInt())
        var currentNode = startingNode

        while (true) {
            sum = sum.div(10.toBigInteger()) // Ambiguity

            if (sum > 0.toBigInteger()) {
                currentNode.next = ListNode((sum % 10.toBigInteger()).toInt())
                currentNode = currentNode.next!!
            } else {
                currentNode.next = null
                break
            }
        }

        return startingNode
    }
}
