package com.example.googlepreperation.strings.easy


class UniqueCharacter {

    fun firstUniqueChar(s: String): Int {
        if (s.isEmpty()) {
            return -1
        }
        val charCounts = IntArray(26)
        for (element in s) {
            charCounts[element - 'a']++
        }
        for (i in s.indices) {
            if (charCounts[s[i] - 'a'] == 1) {
                return i
            }
        }
        return -1
    }
}

fun main() {
    val ob = UniqueCharacter()
   println( ob.firstUniqueChar("aaabbc"))
}