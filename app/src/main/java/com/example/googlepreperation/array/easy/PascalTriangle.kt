package com.example.googlepreperation.array.easy

class PascalTriangle {

}

fun generate(numRows: Int): List<List<Int>> {
    val allrows: MutableList<List<Int>> = ArrayList()
    val row = ArrayList<Int>()
    for (i in 0 until numRows) {
        row.add(0, 1)
        for (j in 1 until row.size - 1) row[j] = row[j] + row[j + 1]
        allrows.add(ArrayList(row))
    }
    return allrows
}

fun main() {
  generate(4)
}