package com.example.googlepreperation.linkedlist

interface ILinkedList<T> {

    fun isEmpty(): Boolean
    fun push(value: T)
    fun append(value: T)
    fun nodeAt(index: Int): Node<T>?
    fun printHead(): T?
    fun printTail(): T?
    fun insert(value: T, afterNode: Node<T>?): Node<T>
}