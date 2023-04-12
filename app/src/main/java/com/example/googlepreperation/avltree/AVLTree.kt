package com.example.googlepreperation.avltree

interface AVLTree<T : Comparable<T>> {
    fun height(node: AVLTreeNode<T>?): Int

    fun balanceFactor(node: AVLTreeNode<T>?): Int

    fun updateHeight(node: AVLTreeNode<T>?)

    fun rotateRight(node: AVLTreeNode<T>?): AVLTreeNode<T>

    fun rotateLeft(node: AVLTreeNode<T>?): AVLTreeNode<T>

    fun insert(node: AVLTreeNode<T>?, value: T): AVLTreeNode<T>
}
