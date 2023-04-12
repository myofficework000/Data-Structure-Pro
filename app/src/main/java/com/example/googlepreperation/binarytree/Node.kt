package com.example.googlepreperation.binarytree

data class Node<T : Comparable<T>>(
    var value: T,
    var left: Node<T>? = null,
    var right:Node<T>? = null
)
