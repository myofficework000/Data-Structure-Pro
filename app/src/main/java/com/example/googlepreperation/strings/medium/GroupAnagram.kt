package com.example.googlepreperation.strings.medium

class GroupAnagram {
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, MutableList<String>>()
    strs.forEach {
        val key = it.toCharArray().sorted().joinToString("")
        if (!map.containsKey(key)) map[key] = mutableListOf()
        map[key]?.add(it)
    }

    return map.values.toList()
}

fun main() {
    val result1 = groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
    val result2 = groupAnagrams(arrayOf(""))
    val result3 = groupAnagrams(arrayOf("a"))

    println(result1)
    println(result2)
    println(result3)
}

/*
Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]*/
