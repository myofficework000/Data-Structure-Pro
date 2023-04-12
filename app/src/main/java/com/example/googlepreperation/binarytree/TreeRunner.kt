package com.example.googlepreperation.binarytree

fun main() {

    val tree = BinaryTreeImp<Int>()

    println("Check the tree is empty? ${tree.isEmpty()}")
    tree.addAll(2, 4, 1, 7, 8, 3)
    println("after adding values--------------------------------------------------------------------")
    println("Check the tree is empty? ${tree.isEmpty()}")
    println("check inorder traversal")
    println()
    tree.inOrder()
    println()
    println("check pre-order traversal")
    println()
    tree.preOrder()
    println()
    println("check post-order traversal")
    println()
    tree.postOrder()
}