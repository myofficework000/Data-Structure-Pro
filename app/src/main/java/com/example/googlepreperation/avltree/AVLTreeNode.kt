package com.example.googlepreperation.avltree

data class AVLTreeNode<T : Comparable<T>>(
    var value: T,
    var left: AVLTreeNode<T>? = null,
    var right: AVLTreeNode<T>? = null,
    var height: Int = 0
)