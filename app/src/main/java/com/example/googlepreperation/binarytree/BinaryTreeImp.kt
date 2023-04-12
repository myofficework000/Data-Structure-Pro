package com.example.googlepreperation.binarytree

class BinaryTreeImp<T : Comparable<T>> {

    private var root: Node<T>? = null

    fun find(value: T): Node<T>? {
        var temp = root
        while (temp != null) {
            if (temp.value == value) {
                return temp
            }

            temp = if (value > temp.value) temp.right else temp.left
        }
        return null
    }

    fun isEmpty() = root == null

    operator fun contains(value: T) = find(value) != null

    fun add(value: T) {
        if (root == null) {
            root = Node(value)
        } else {
            var temp = root!!
            while (true) {
                if (value == temp.value) {
                    return
                }
                if (value > temp.value) {
                    if (temp.right != null) {
                        temp = temp.right!!
                    } else {
                        temp.right = Node(value)
                    }
                } else {
                    if (temp.left != null) {
                        temp = temp.left!!
                    } else {
                        temp.left = Node(value)
                    }
                }
            }
        }
    }

    fun addAll(vararg args: T) {
        for (value in args) {
            add(value)
        }
    }

    /*
    visit node
    then visit left sub tree
    then visit right sub tree
    */
    fun preOrder() {
        fun preOrder(treeNode: Node<T>?) {
            if (treeNode != null) {
                print("${treeNode.value}")
                preOrder(treeNode.left)
                preOrder(treeNode.right)
            }
        }
        print(" ")
        preOrder(root)
    }

    /*
    visit left sub tree
    then visit Node
    then visit right subtree
    */
    fun inOrder() {
        fun inOrder(treeNode: Node<T>?) {
            if (treeNode != null) {
                inOrder(treeNode.left)
                print("${treeNode.value}")
                inOrder(treeNode.right)
            }
        }
        inOrder(root)
        print(" ")
    }

    /*
    visit left sub tree
    then visit right sub tree
    then visit node
    */
    fun postOrder() {
        fun postOrder(treeNode: Node<T>?) {
            if (treeNode != null) {
                postOrder(treeNode.left)
                postOrder(treeNode.right)
                print("${treeNode.value}")
            }
        }
        print(" ")
        postOrder(root)
    }

}