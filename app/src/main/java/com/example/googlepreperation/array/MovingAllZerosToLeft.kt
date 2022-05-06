package com.example.googlepreperation.array

/*
Move all zeros to the left of an array while maintaining its order.*/
class MovingAllZerosToLeft {

    //Solution 1 by sorting array
    fun movingAllZeroToLeft(array: IntArray): IntArray {
        array.sort()
        return array
    }

    fun movingZerosToLeftWithoutSorting(array: IntArray) {

        if (array.isEmpty()) {
            return
        }

        var readIndex = array.size - 1
        var writeIndex = array.size - 1

        while (readIndex >= 0) {
            if (array[readIndex] != 0) {
                array[writeIndex] = array[readIndex]
                writeIndex--
            }
            readIndex--
        }

        while (writeIndex >= 0) {
            array[writeIndex] = 0
            writeIndex--
        }
    }
}

fun main() {
    var intArray = intArrayOf(1, 0, 4, 0, 5, 9, 3, 8, 9)
    val movingAllZerosToLeft = MovingAllZerosToLeft()
    movingAllZerosToLeft.movingZerosToLeftWithoutSorting(intArray)
    for (element in intArray) {
        println(element)
    }
}