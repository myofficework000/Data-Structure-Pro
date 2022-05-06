package com.example.googlepreperation.strings.easy

class ReverseInteger {

    fun reverseInteger(x: Int): Int {
        var reverse: Long = 0
        var value = x
        while (value != 0) {
            reverse = reverse * 10 + value % 10
            value /= 10
        }

        return if (reverse > Int.MAX_VALUE || reverse < Int.MIN_VALUE) {
            0
        } else {
            reverse.toInt()
        }
    }
}