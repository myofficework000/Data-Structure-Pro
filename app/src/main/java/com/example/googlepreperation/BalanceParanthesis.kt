package com.example.googlepreperation

import java.util.*

class BalanceParanthesis {
    fun isValid(s: String): Boolean {
        val bracket: Stack<Char> = Stack()
        for (c in s.toCharArray()) {
            when (c) {
                '(' -> bracket.push(c)
                '{' -> bracket.push(c)
                '[' -> bracket.push(c)
                ')' -> if (bracket.empty() || bracket.peek() != '(') return false else bracket.pop()
                '}' -> if (bracket.empty() || bracket.peek() != '{') return false else bracket.pop()
                ']' -> if (bracket.empty() || bracket.peek() != '[') return false else bracket.pop()
                else -> false
            }
        }
        return bracket.isEmpty()
    }
}

fun main() {
    val myObj = BalanceParanthesis()
    println(myObj.isValid("()"))
    println(myObj.isValid("() [] {}"))
    println(myObj.isValid("(]"))
    println(myObj.isValid("([)]"))
    println(myObj.isValid("{[]}"))
}