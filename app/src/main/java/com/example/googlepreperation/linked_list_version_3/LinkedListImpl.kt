package com.example.googlepreperation.linked_list_version_3

class LinkedListImpl {
}

fun main() {
    val list = LinkedList<Int>()
    with(list){
        push(30)
        push(90)
        push(88)

        println("head value is ${printHead()}")
        println("tail value is ${printTail()}")
    }
}