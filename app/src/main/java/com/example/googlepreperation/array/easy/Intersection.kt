package com.example.googlepreperation.array.easy

class Intersection {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        if (nums1.isEmpty() || nums2.isEmpty()) return intArrayOf(0)

        nums1.sort()
        nums2.sort()

        val list = ArrayList<Int>()

        var i = 0
        var j = 0

        while (i < nums1.size && j < nums2.size) {
            when {
                nums1[i] == nums2[j] -> {
                    list.add(nums1[i])
                    i++
                    j++
                }
                nums1[i] > nums1[j] -> {
                    j++
                }
                else -> {
                    i++
                }
            }
        }

        return list.toIntArray()
    }
}

fun main() {
    val obj = Intersection()
    val array :IntArray = obj.intersect(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4))

        for(i in array.indices){
            print(array[i])
        }

}