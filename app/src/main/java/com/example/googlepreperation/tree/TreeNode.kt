package com.example.googlepreperation.tree

import com.example.googlepreperation.queue.QueueImpl

typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(val value: T) : Tree<T> {

    private val children: MutableList<TreeNode<T>> = mutableListOf()

    override fun add(child: TreeNode<T>) = children.add(child)

    override fun searchNode(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null

        forEachDepthFirst {
            if (it.value == value) {
                result = it
                println("Found value ${it.value}")
                return@forEachDepthFirst
            }
        }

        if (result == null) {
            println("item not found")
        }

        return result
    }

    fun forEachDepthFirst(visit: Visitor<T>) {
        visit(this)

        children.forEach {
            it.forEachDepthFirst(visit)
        }
    }


    fun forEachLevelOrder(visit: Visitor<T>) {
        visit(this)

        val queue = QueueImpl<TreeNode<T>>()

        children.forEach {
            queue.enqueue(it)
        }

        var node = queue.dequeue()

        while (node != null) {
            visit(node)

            node.children.forEach { queue.enqueue(it) }
            node = queue.dequeue()
        }
    }
}