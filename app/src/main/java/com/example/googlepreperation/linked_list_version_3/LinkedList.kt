package com.example.googlepreperation.linked_list_version_3

class LinkedList<T> : ILinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0


    override fun isEmpty() = size == 0

    override fun printHead() = head?.value

    override fun printTail() = tail?.value

    override fun append(value: T) {
        if (isEmpty()){
            push(value)
            return
        }

        val newNode = Node(value = value)
        tail?.next = newNode
        tail = newNode
        size++
    }

    override fun push(value: T) {
        //
        head = Node(value, next = head)
        if (tail == null){
            tail =head
        }
        size++
    }

    override fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode !=null && currentIndex<index){
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

    override fun insert(value: T, afterNode: Node<T>?): Node<T> {
        if (tail== afterNode){
            append(value)
            return tail!!
        }

        val newNode = Node(value = value, next =  afterNode?.next)
        afterNode?.next = newNode
        return newNode
    }
}