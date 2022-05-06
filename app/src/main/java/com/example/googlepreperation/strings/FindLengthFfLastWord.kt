package com.example.googlepreperation.strings

class FindLengthFfLastWord {

    fun findLastWordLength(sentence: String): Int {
        var i = sentence.length - 1
        var count = 0
        while (i >= 0) {
            if (sentence[i] != ' ') {
                count++
                i--
            } else {
                break
            }
        }
        return count
    }
}

fun main() {
    val obj = FindLengthFfLastWord()
    println(obj.findLastWordLength("hey i am hero"))
}
