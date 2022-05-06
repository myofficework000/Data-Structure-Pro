package com.example.googlepreperation.array.medium

import java.util.*
import kotlin.collections.ArrayList

class Subsets {
/*    fun subsetsWithoutBackTracking(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        res.add(listOf())
        for (i in nums.indices) {
            val tmp = res.toList()
            for (l in tmp) {
                res.add(l.toMutableList() + nums[i])
            }
        }
        return res
    }*/

    fun subsetss(nums: IntArray) =
        nums.fold(listOf(listOf<Int>())) { subs, num ->
            subs + subs.map { sub -> sub+num }
        }


    fun subsets(nums: IntArray): List<List<Int>> {
        val list: MutableList<List<Int>> = ArrayList()
        Arrays.sort(nums)
        backtrack(list, ArrayList(), nums, 0)
        return list
    }

    private fun backtrack(
        list: MutableList<List<Int>>,
        tempList: MutableList<Int>,
        nums: IntArray,
        start: Int
    ) {
        list.add(ArrayList(tempList))
        for (i in start until nums.size) {
            tempList.add(nums[i])
            backtrack(list, tempList, nums, i + 1)
            tempList.removeAt(tempList.size - 1)
        }
    }

}


fun main() {
    val obj = Subsets()
    print(obj.subsets(intArrayOf(1,2,3)))
}