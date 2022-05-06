package com.example.googlepreperation.strings

class StringSegmentation {
    fun canSegmentString(s: String, dictionary: Set<String>): Boolean {

        for (elements in dictionary.indices){
            if (s.contains(elements.toString(), ignoreCase = true)){
              return true
            }
        }
        return false
    }
}

fun main() {
    val obj = StringSegmentation()
    println(obj.canSegmentString("He123", setOf("Hey","hi","nooo")))
}