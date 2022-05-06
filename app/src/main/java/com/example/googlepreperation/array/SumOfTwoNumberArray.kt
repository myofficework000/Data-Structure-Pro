package com.example.googlepreperation.array


/*Given an array of integers and a value, determine if there are any two integers
in the array whose sum is equal to the given value.*/

class SumOfTwoNumberArray {

    fun findSumOfTwo(A: IntArray, `val`: Int): Boolean {
        val foundValues: MutableSet<Int> = HashSet()
        for (a in A) {
            if (foundValues.contains(`val` - a)) {
                return true
            }
            foundValues.add(a)
        }
        return false
    }
}
    fun main() {
        val obj = SumOfTwoNumberArray()
        val v = intArrayOf(5, 7, 1, 2, 8, 4, 3)
        val test = intArrayOf(3, 20, 1, 2, 7)
        for (i in test.indices) {
            val output = obj.findSumOfTwo(v, test[i])
            println("findSumOfTwo(v, " + test[i] + ") = " + if (output) "true" else "false")
        }
    }
