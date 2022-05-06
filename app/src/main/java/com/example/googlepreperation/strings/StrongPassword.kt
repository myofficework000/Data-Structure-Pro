package com.example.googlepreperation.strings

class StrongPassword {


    private val regex1 = Regex("^(?=.*[A-Za-z])(?=.*?[0-9])(?!.*\\2).{6,20}")

    private val regex2 = Regex("A-Z")
    private val regex3 = Regex("0-9")

    fun strongPassword(password: String): Int {

        return if (password.length in 6..20) {
          return  if (regex1.matches(password)) {
                0
            } else {
                3
            }
        } else {
            5
        }

    }
}

fun main() {
    val obj = StrongPassword()
    println(obj.strongPassword("abcccjkkjkjbdef6GH"))
}