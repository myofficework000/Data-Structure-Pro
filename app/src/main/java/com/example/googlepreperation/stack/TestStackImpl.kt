package com.example.googlepreperation.stack

class TestStackImpl {
}

fun main() {
    val stackOfFruits = StackImpl<String>()

    stackOfFruits.apply {
        peek()
        pop()

        println("check stack is Empty or not?: ${isEmpty()}")

        push("Mango 1")
        push("Mango 2")
        push("Mango 3")
        push("Mango 4")

        println("Top: ${peek()}")
        println("Pop operation: ${pop()}")
        println("Top: ${peek()}")
        println("Size: ${size()}")
        println("check stack is Empty or not?: ${isEmpty()}")
    }
}