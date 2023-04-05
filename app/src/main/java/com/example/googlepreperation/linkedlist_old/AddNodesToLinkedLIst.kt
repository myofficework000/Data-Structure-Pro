package com.example.googlepreperation.linkedlist_old

class AddNodesToLinkedLIst {


}

data class Node<T>(val value: T, var next: Node<T>? = null)

fun main() {
    val obj = MyLinkedList<Int>()
    obj.push(1)
    obj.push(3)
    obj.push(5)

    println(obj)
}

class MyLinkedList<T> {

    private var tail: Node<T>? = null
    private var head: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty String"
        } else {
            head.toString()
        }
    }



    fun push(value: T) {
        head = Node(value, head)

        if (tail == null) {
            tail = head
        }
        size++
    }
}