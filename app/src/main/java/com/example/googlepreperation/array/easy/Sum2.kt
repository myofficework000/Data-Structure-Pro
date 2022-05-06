package com.example.googlepreperation.array.easy

class Sum2 {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val result = IntArray(2)
        val hashMap = HashMap<Int, Int>()

        for (i in nums.indices) {
            val requiredNumber = target - nums[i]
            if (hashMap.containsKey(requiredNumber)) {
                result[0] = hashMap[requiredNumber]!!
                result[1] = i
            } else {
                hashMap[nums[i]] = i
            }
        }
        return result
    }
}

fun main() {
    val obj = Sum2()
    obj.twoSum(intArrayOf(3, 2, 4), 6)
}