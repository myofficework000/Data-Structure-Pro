package com.example.googlepreperation.binarysearch

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1

        var start = 0
        var end = nums.size - 1

        while (start <= end) {
            var mid = start +  (end - start) / 2

            if(start == end ) {
                return mid
            }
            else if(target < nums[mid]) {
                end = mid - 1
            } else if (target > nums[mid]) {
                start = mid + 1
            }else {
                return mid
            }
        }
        return -1
    }
}

fun main() {
    val searchInsertPosition = SearchInsertPosition()
    searchInsertPosition.searchInsert(intArrayOf(1,3,6,10,11), 2)
}