package com.example.googlepreperation.array.hard

class RainTrapping {
    fun trap(height: IntArray): Int {
        var result = 0
        if (height.isEmpty()) return result
        // Double Pointer
        val len = height.size
        val arrLeft = IntArray(len)
        val arrRight = IntArray(len)
        var leftMax = 0
        var rightMax = 0
        var left = 0
        var right = len - 1
        while (left <= len - 1 || right >= 0) {
            if (height[left] > leftMax) {
                leftMax = height[left]
            }
            arrLeft[left] = leftMax
            if (height[right] > rightMax) {
                rightMax = height[right]
            }
            arrRight[right] = rightMax
            left += 1
            right -= 1
        }

        for (i in 0 until len) {
            result += arrLeft[i].coerceAtMost(arrRight[i]) - height[i]
        }

        return result
    }
}

fun main() {
    val obj = RainTrapping()
    print(obj.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
}