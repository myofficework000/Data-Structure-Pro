package com.example.googlepreperation.array.medium

import java.util.*
import kotlin.collections.ArrayList

class Sum3 {

    fun threeSum(nums: IntArray): List<List<Int>> {

        if (nums.isEmpty() || nums.size < 3) return emptyList()

        val list: MutableList<MutableList<Int>> = ArrayList()
        nums.sort()

        for (i in nums.indices) {

            var j = i + 1
            var k = nums.size - 1

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    val sublist: MutableList<Int> = ArrayList()
                    sublist.add(nums[i])
                    sublist.add(nums[j])
                    sublist.add(nums[k])
                    if (!list.contains(sublist)) {
                        list.add(sublist)
                    }
                }
                j++
                k--
                if (j == k) {
                    continue
                }
            }
        }
        return list
    }


}

fun main() {
    val obj = Sum3()
    println(obj.threeSum(intArrayOf(1,2,-2,-1)))
}