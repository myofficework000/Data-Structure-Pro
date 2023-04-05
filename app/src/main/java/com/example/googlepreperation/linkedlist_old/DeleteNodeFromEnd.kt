package com.example.googlepreperation.linkedlist_old

class DeleteNodeFromEnd {

    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var headNode: ListNode? = head ?: return null
        var fast = head
        var slow = head

        for (i in 0 until n) {
            fast = fast?.next
        }

        if (fast == null) {
            headNode = headNode?.next
            return headNode
        }

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast?.next
        }

        slow?.next = slow?.next?.next
        return headNode
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}

fun main() {
    val obj = DeleteNodeFromEnd()

}