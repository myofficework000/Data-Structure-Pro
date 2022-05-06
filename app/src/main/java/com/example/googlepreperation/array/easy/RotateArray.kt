package com.example.googlepreperation.array.easy

class RotateArray {

    fun rotate(nums: IntArray, k: Int): Unit {
        if (nums.isEmpty() || k == 0) return

        var tempArray = IntArray(nums.size)

        for (i in nums.indices) {
            tempArray[(i + k) % nums.size] = nums[i]
        }

        for (i in nums.indices) {
            nums[i] = tempArray[i]
        }
        return
    }
}

fun main() {
    val obj = RotateArray()
    obj.rotate(intArrayOf(1, 2, 3, 4, 5, 6), 2)
}