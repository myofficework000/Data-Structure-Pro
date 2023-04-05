package com.example.googlepreperation.strings.easy

class RemoveVowel {
}

fun removeVowels(S: String): String {
    val resultString = StringBuilder()
    val vowels: MutableSet<Char> = HashSet()
    vowels.add('a')
    vowels.add('e')
    vowels.add('i')
    vowels.add('o')
    vowels.add('u')
    for (c in S.toCharArray()) {
        if (!vowels.contains(c)) {
            resultString.append(c)
        }
    }
    return resultString.toString()
}

fun main() {
   println( removeVowels("Abhishek Pathak"))
    println( removeVowels("aaaaaaaaaawwwwwwwwiiiiioooooo9999"))

}