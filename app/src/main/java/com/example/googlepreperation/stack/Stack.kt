package com.example.googlepreperation.stack

/*
This class is responsible for all the operations or BluePrint of Stack data structure
*/
interface Stack<T> {
    fun push(element: T)
    fun pop(): T
    fun peek(): T
    fun isEmpty(): Boolean
    fun size(): Int
}