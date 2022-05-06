package com.example.googlepreperation.array.easy

class ContainsDuplicates {

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false

        val tempSet = HashSet<Int>()

        for (i in nums.indices) {
            if (tempSet.contains(nums[i])) {
                return true
            }
            tempSet.add(nums[i])
        }
        return false
    }
}

fun main() {
    val obj = ContainsDuplicates()
    print(obj.containsDuplicate(intArrayOf(1, 2, 3, 4, 6, 6)))
}