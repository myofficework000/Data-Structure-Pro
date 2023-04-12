package com.example.googlepreperation.avltree

class AVLTreeImpl<T : Comparable<T>> : AVLTree<T> {
    var rootNode: AVLTreeNode<T>? = null

    override fun height(node: AVLTreeNode<T>?) = node?.height ?: 0

    override fun balanceFactor(node: AVLTreeNode<T>?) = height(node?.right) - height(node?.left)

    override fun updateHeight(node: AVLTreeNode<T>?) {
        node?.height = maxOf(height((node?.left)), height(node?.right)) + 1
    }

    override fun rotateRight(node: AVLTreeNode<T>?): AVLTreeNode<T> {
        val pivot = node?.left
        val temp = pivot?.right

        pivot?.right = node
        node?.left = temp

        updateHeight(node)
        updateHeight(temp)

        return pivot!!
    }

    override fun rotateLeft(node: AVLTreeNode<T>?): AVLTreeNode<T> {
        val pivot = node?.right
        val temp = pivot?.left

        pivot?.left = node
        node?.right = temp

        updateHeight(node)
        updateHeight(temp)

        return pivot!!
    }

    override fun insert(node: AVLTreeNode<T>?, value: T): AVLTreeNode<T> {
        if (node == null) return AVLTreeNode(value)

        when {
            value < node.value -> node.left = insert(node.left, value)
            value > node.value -> node.right = insert(node.right, value)
            else -> return node
        }

        updateHeight(node)
        val balance = balanceFactor(node)

        return when {
            balance > 1 && value < node.right?.value!! -> rotateLeft(node)
            balance < -1 && value < node.left?.value!! -> rotateRight(node)
            balance > 1 && value > node.right?.value!! -> {
                node.right = rotateRight(node.right)
                rotateLeft(node)
            }
            balance < -1 && value > node.left?.value!! -> {
                node.left = rotateLeft(node.left)
                rotateRight(node)
            }
            else -> node
        }
    }

    fun insert(value: T) {
        rootNode = insert(rootNode, value)
    }
}