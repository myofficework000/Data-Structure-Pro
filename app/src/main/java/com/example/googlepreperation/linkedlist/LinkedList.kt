package com.example.googlepreperation.linkedlist

class LinkedList<T> : ILinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    override fun printHead(): T? = head?.value

    override fun printTail(): T? = tail?.value

    override fun isEmpty() = size == 0

    override fun toString(): String {
        return if (isEmpty()) {
            EMPTY_LIST
        } else {
            head.toString()
        }
    }

    override fun append(value: T) {
        if (isEmpty()) {
            push(value)
            return
        }

        val newNode = Node(value = value)
        tail?.next = newNode
        tail = newNode
        size++
    }

    override fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

    override fun push(value: T) {
        head = Node(value = value, next = head)

        if (tail == null) {
            tail = head
        }

        size++
    }

    override fun insert(value: T, afterNode: Node<T>?): Node<T> {
        if (tail == afterNode) {
            append(value)
            return tail!!
        }

        val newNode = Node(value = value, next = afterNode?.next)
        afterNode?.next = newNode
        size++

        return newNode
    }


    companion object {
        const val EMPTY_LIST = "empty list"
    }
}
