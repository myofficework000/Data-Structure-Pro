package com.example.googlepreperation.strings.medium

class LongestCommonSubStringWithoutRepeatingChar {
}

fun lengthOfLongestSubstring(s: String): Int {
    var start = 0
    var end = 0
    val hashSet: MutableSet<Char> = HashSet()
    var result = 0

    while (end < s.length) {
        if (hashSet.add(s[end])) {
            end++
            result = result.coerceAtLeast(hashSet.size)
        } else {
            hashSet.remove(s[start])
            start++
        }
    }
    return result
}

fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
    println(lengthOfLongestSubstring("bbbbbbb"))
    println(lengthOfLongestSubstring("java"))
    println(lengthOfLongestSubstring("abhishek"))
    println(lengthOfLongestSubstring("testing"))
}