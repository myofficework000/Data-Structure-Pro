package com.example.googlepreperation.linkedlist

fun main() {

    val list = LinkedList<Int>()

    list.apply {
        push(55)
        push(7)
        push(69)
        push(11)
        push(99)
        println("head value is: ${printHead()}")
        println("tail value is: ${printTail()}")

        println("-------------------after appending new node value = 200 ----------------------------")
        append(200)
        println("head value is: ${printHead()}")
        println("tail value is: ${printTail()}")
        println(list)

        println("-------------------insert at where value is = 7 ----------------------------")

        insert(300,nodeAt(1))

        println("head value is: ${printHead()}")
        println("tail value is: ${printTail()}")
        println(list)
    }
}