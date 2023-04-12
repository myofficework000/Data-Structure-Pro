package com.example.googlepreperation.tree

import com.example.googlepreperation.linkedlist.Node

interface Tree<T> {
    fun add(child: TreeNode<T>): Boolean
    fun searchNode(value: T): TreeNode<T>?
}