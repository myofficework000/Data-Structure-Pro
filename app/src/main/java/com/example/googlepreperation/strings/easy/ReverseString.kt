package com.example.googlepreperation.strings.easy

class ReverseString {

    fun reverseString(s: CharArray) {

        var end = s.size - 1
        var start = 0
        while (start < end) {
            //swapping
            var char: Char = s[start]
            s[start] = s[end]
            s[end] = char
            start++
            end--
        }
    }
}

fun main() {
    val obj = ReverseString()
    obj.reverseString(charArrayOf('a', 'b', 'c', 'd', 'e'))
}