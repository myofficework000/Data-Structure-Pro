package com.example.googlepreperation.stack

import java.util.*

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.reversed().forEach {
            when (it) {
                '(' -> if (stack.isNotEmpty() && stack.peek() == ')') stack.pop() else stack.push(it)
                '[' -> if (stack.isNotEmpty() && stack.peek() == ']') stack.pop() else stack.push(it)
                '{' -> if (stack.isNotEmpty() && stack.peek() == '}') stack.pop() else stack.push(it)
                else -> stack.push(it)
            }
        }

        return stack.isEmpty()
    }

    fun isValid2(s: String): Boolean {
        val stack = Stack<Char>()
        for (element in s) {
            if (element == '[' || element == '(' || element == '{') {
                stack.push(element)
            } else if (element == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false
                }
            } else if (element == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false
                }
            } else if (element == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}

fun main() {
    val validParenthesis = ValidParentheses()
    println(validParenthesis.isValid("()"))// Case 1
    println(validParenthesis.isValid("{}")) // Case 2
    println(validParenthesis.isValid("[]"))// Case 3
    println(validParenthesis.isValid("(){}[]")) // Case 4
    println(validParenthesis.isValid("(]")) // Case 5
    println(validParenthesis.isValid("(]}")) // Case 6
    println(validParenthesis.isValid("[]{")) // Case 7
}