package com.example.googlepreperation.array.easy

class SecondLargestNumber {
    fun print2largest(arr: IntArray) {
        var first: Int
        var second: Int
        if (arr.size < 2) {
            print(" Invalid Input ")
            return
        }

        second = Int.MIN_VALUE
        first = second
        var i = 0
        while (i < arr.size) {

            if (arr[i] > first) {
                second = first
                first = arr[i]
            } else if (arr[i] > second && arr[i] != first) second = arr[i]
            i++
        }
        if (second == Int.MIN_VALUE) print("There is no second largest element")
        else print("The second largest element $second")
    }
}

fun main() {
    val obj = SecondLargestNumber()
    obj.print2largest(intArrayOf(1, 4, 5, 9, 2, 4, 88, 99))
}