package com.example.googlepreperation.array.easy

class MaxProfitInDay {
    fun maxProfit(prices: IntArray): Int {

        var maxProfit = 0
        var i = 0
        while (i < prices.size-1) {
            if (prices[i] < prices[i + 1]) {
                maxProfit += prices[i + 1] - prices[i]
            }
            i++
        }
        return maxProfit
    }
}

fun main() {
    val obj = MaxProfitInDay()
    println(obj.maxProfit(intArrayOf(7,1,5,3,6,4)))
}