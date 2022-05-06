package com.example.googlepreperation.strings

import java.lang.StringBuilder


fun findIntersection(strArr: Array<String>): String {

    // code goes here
    val first: String = strArr[0]
    val second: String = strArr[1]

    println(first)
    println(second)

    var result: StringBuilder? = null
    for (i in first.indices) {
        if (second.contains(first[i]) && first[i]!=',' && first[i]!=' ') {
            if (result != null) {
                result.append(","+first[i])
            } else {
                result = StringBuilder(first[i].toString())
            }
        }
    }
    return result.toString()
}


fun main() {
    println(findIntersection(arrayOf("1, 3, 9, 10, 17, 18", "1, 4, 9, 10")))
}