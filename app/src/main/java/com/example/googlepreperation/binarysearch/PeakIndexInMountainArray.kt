package com.example.googlepreperation.binarysearch

class PeakIndexInMountainArray {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        if(arr.isEmpty()) return -1

        var start = 0
        var end = arr.size
        var maxNum = 0
        while (start < end) {
            var mid = start + (end - start) / 2
            var max = -1
            if(arr[mid] == maxNum ) return mid
            if (arr[start] < arr[mid]) {
                start = mid + 1
            }else {
                end = mid
            }
            maxNum = arr[mid]
        }
        return -1
    }
}