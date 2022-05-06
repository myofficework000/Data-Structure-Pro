package com.example.googlepreperation.array.hard

class MedianOfSortedArray {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var sum1 = 0
        var sum2 = 0
        var result: Double = 0.0
        var totalItems = 0

        if (nums1.isNotEmpty()) {
            for (item in nums1) {
                sum1 += item
            }
            totalItems += nums1.size
        }
        if (nums2.isNotEmpty()) {
            for (item in nums2) {
                sum2 += item
            }
            totalItems += nums2.size
        }

        result = (sum1 + sum2) / totalItems.toDouble()
        return result
    }
}

fun main() {
    val obj = MedianOfSortedArray()
    print(obj.findMedianSortedArrays(intArrayOf(), intArrayOf(1)))
}