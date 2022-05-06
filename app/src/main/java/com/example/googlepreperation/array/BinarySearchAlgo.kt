package com.example.googlepreperation.array

import kotlin.math.min

class BinarySearchAlgo {
    fun binarySearch(array: IntArray, number: Int): Boolean {

        var left = 0
        var right = array.size - 1

        fun mid(): Int {
            return (left + right) / 2
        }

        while (left <= right) {
            when {
                number == array[mid()] -> {
                    return true
                }
                number > array[mid()] -> {
                    left = mid() + 1
                }
                number < array[mid()] -> {
                    right = mid() - 1
                }
            }
        }
        return false
    }
}

fun main() {
    val obj  = BinarySearchAlgo()
    println(obj.binarySearch(intArrayOf(1,4,6,7,99,149), 4))
    println(obj.binarySearch(intArrayOf(1,4,6,7,99,149), 1))
    println(obj.binarySearch(intArrayOf(1,4,6,7,99,149), 99))
}