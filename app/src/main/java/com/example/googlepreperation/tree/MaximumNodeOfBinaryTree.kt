package com.example.googlepreperation.tree

class MaximumNodeOfBinaryTree {
    class Solution {
        fun maxDepth(root: TreeNode?): Int {
            if (root == null) return 0
            return 1 + maxDepth(root.left).coerceAtLeast(maxDepth(root.right))
        }
    }

    class TreeNode(val `val`: Int) {
        val left: TreeNode? = null
        val right: TreeNode? = null
    }
}