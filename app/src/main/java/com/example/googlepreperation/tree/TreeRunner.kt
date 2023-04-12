package com.example.googlepreperation.tree

fun makeBeverageTree(): TreeNode<String> {

    val tree = TreeNode("Beverages")

    val hot = TreeNode("hot")
    val cold = TreeNode("cold")

    val tea = TreeNode("tea")
    val coffee = TreeNode("coffee")
    val chocolate = TreeNode("chocolate")

    val blackTea = TreeNode("black")
    val greenTea = TreeNode("green")
    val chaiTea = TreeNode("chai")

    val soda = TreeNode("soda")
    val milk = TreeNode("milk")
    val beer = TreeNode("beer")

    val gingerAle = TreeNode("ginger ale")
    val bitterLemon = TreeNode("bitter lemon")

    tree.apply {
        add(hot)
        add(cold)
    }

    hot.apply {
        add(tea)
        add(coffee)
        add(chaiTea)
    }

    cold.apply {
        add(soda)
        add(milk)
        add(beer)
    }

    tea.apply {
        add(blackTea)
        add(greenTea)
        add(chaiTea)
    }

    soda.apply {
        add(gingerAle)
        add(bitterLemon)
    }

    return tree
}

fun main() {
    val tree =  makeBeverageTree()
    tree.forEachDepthFirst {
        println(it.value)
    }
    /*tree.forEachLevelOrder {
        println(it.value)
    }*/

    //tree.searchNode("soda")
}