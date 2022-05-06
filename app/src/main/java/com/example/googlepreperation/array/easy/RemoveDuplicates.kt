package com.example.googlepreperation.array.easy

class RemoveDuplicates {
    fun removeDuplicates(A: IntArray): Int {
        if (A.size < 2) return A.size

        var j = 0
        var i = 1

        while (i < A.size) {
            if (A[i] != A[j]) {
                j++
                A[j] = A[i]
            }
            i++
        }

        return j + 1
    }
}

fun main() {
    val obj = RemoveDuplicates()
   println( obj.removeDuplicates(intArrayOf(0,0,1,1,1,2,2,3 )))
}