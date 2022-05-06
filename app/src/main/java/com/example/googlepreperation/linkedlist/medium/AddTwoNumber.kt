package com.example.googlepreperation.linkedlist.medium


class AddTwoNumber {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var first = l1
        var second = l2
        val headNode = ListNode(0)
        var curr: ListNode? = headNode
        var carry = 0

        while (first != null || second != null) {
            var sum = 0
            var x = first?.`val` ?: 0
            var y = second?.`val` ?: 0

            sum = x + y + carry
            carry = sum / 10
            var node = ListNode(sum % 10)
            curr?.next = node
            curr = curr?.next

            if (first != null) first = first.next
            if (second != null) second = second.next

            if (carry > 0) {
                curr?.next = ListNode(carry)
            }
        }
        return headNode.next
    }
}

class ListNode(val `val`: Int) {
    var next: ListNode? = null
}

fun main() {
    val obj = AddTwoNumber()
    obj.addTwoNumbers(ListNode(5), ListNode(1))
}