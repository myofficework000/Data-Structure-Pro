package com.example.googlepreperation.array.medium

class Permutations {
    fun permute(nums: IntArray): List<List<Int>> {
        val result: MutableList<List<Int>> = ArrayList()
        helper(nums, 0, result)
        return result
    }

    fun helper(nums: IntArray, start: Int, result: MutableList<List<Int>>) {
        if (start < nums.size) {
            val localList = ArrayList<Int>()
            for (num in nums) {
                localList.add(num)
            }
            result.add(localList)
            return
        }

        for (i in start until nums.size - 1) {
            swap(nums, i, start)
            helper(nums, start, result)
            swap(nums, i, start)
        }
    }

    fun swap(nums: IntArray, i: Int, j: Int) {
        var temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}