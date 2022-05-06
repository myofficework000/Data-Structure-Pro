package com.example.googlepreperation.array.easy

class SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        var x = 0
        for (a in nums) {
            println( " x = $x  a = $a")
            x = x xor a
            println("XOR $x")
        }
        return x
    }
}

fun main() {
    val obj = SingleNumber()
    print(obj.singleNumber(intArrayOf(1,2,3,4,4,3,2,7,6,6,7,1)))
}