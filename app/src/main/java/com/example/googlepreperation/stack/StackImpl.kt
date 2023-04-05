package com.example.googlepreperation.stack

import java.util.*

class StackImpl<T> : Stack<T> {

    private var stack: ArrayList<T> = ArrayList()

    override fun isEmpty() = stack.isEmpty()

    override fun size() = stack.size

    override fun push(element: T) {
        stack.add(element)
    }

    override fun peek(): T {
        if (stack.isEmpty()) {
            throw EmptyStackException()
        }
        return stack[stack.lastIndex]
    }

    override fun pop(): T {
        val peek = peek()
        stack.remove(peek)
        return peek
    }
}