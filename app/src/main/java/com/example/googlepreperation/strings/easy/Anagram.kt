package com.example.googlepreperation.strings.easy

class Anagram {

    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val count = IntArray(26)
        for (i in s.indices) {
            count[s[i] - 'a']++
            count[t[i] - 'a']--
        }
        for (i in count) {
            if (i != 0) return false
        }
        return true
    }
}

fun main() {
    val obj  =  Anagram()
    print(obj.isAnagram("rat", "tar"))
}