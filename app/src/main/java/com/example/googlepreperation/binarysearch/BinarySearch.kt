package com.example.googlepreperation.binarysearch

class BinarySearch {
}

fun binarySearch(input: IntArray, target: Int): Int {
    var low = 0
    var high = input.size - 1

    while (low <= high) {
        var mid = low + (high - low) / 2

        if (input[mid] == target) {
            return mid
        } else if (target > input[mid]) {
            //right hand side
            low = mid + 1
        } else {
            high = mid - 1
        }
    }

    return -1
}

fun main() {
   println( binarySearch(intArrayOf(1, 3, 6, 10, 11), 2))
    println( binarySearch(intArrayOf(1, 3, 6, 10, 11), 3))
}