package com.example.googlepreperation.strings.easy

import kotlin.math.absoluteValue

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {

        var left = 0
        var right = s.length - 1
        var leftChar: Char
        var rightChar: Char

        while (left <= right) {
            leftChar = s[left]
            rightChar = s[right]

            if (!Character.isLetterOrDigit(leftChar)) {
                left++
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false
                }
                left++
                right--
            }
        }
        return true
    }

    fun isPalindrome(x: Int): Boolean = x.toString() == x.toString().reversed()
}

fun main() {
    val obj = ValidPalindrome()
    println(obj.isPalindrome("a man, a plan, a canal: Panama"))
}