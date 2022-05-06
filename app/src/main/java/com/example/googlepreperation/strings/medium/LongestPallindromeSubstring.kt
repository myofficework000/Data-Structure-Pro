package com.example.googlepreperation.strings.medium

class LongestPallindromeSubstring {
    fun longestPalindrome(s: String): String {
        if (s.isBlank() || s.length == 1) return s // basic checks
        var windowSize = s.length
        var from: Int
        var to: Int
        while (windowSize > 1) {
            from = 0
            to = windowSize - 1
            while (to < s.length) { // slide the window
                if (isPalindrome(s, from, to)) return s.substring(from..to)
                from++
                to++
            }
            windowSize--
        }
        return s[0].toString() // if there is no palindrome, return first char
    }

    fun isPalindrome(s: String, from: Int, to: Int): Boolean { // check pailndrome from both ends and shrink
        var left = from
        var right = to
        while (left < right) if (s[left++] != s[right--]) return false
        return true
    }
}

fun main() {
    val  obj = LongestPallindromeSubstring()
    print(obj.longestPalindrome("madamshey"))
}