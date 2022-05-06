package com.example.googlepreperation.array.easy

class MoveZeros {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                //swap
                val t = nums[i]
                nums[i] = nums[left]
                nums[left] = t
                left++
            }
        }
    }
}

fun main() {
    val obj = MoveZeros()
    obj.moveZeroes(intArrayOf(0,2,3,42,3,1,0,5,0,5))
}