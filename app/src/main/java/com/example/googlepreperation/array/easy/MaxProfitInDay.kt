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

    //Space complexity = O(1)
    //Time Complexity = O(n)
    fun maxProfit2(prices: IntArray): Int {

        var maxProfit = 0 //O(1)
        var minPrice = Int.MAX_VALUE //O(1)

        for (price in prices) {
            minPrice = minOf(minPrice, price)//O(1) * 6 ... n
            maxProfit = maxOf(maxProfit, price - minPrice) //O(1)
        }
        return maxProfit
    }
}

fun main() {
    val obj = MaxProfitInDay()
    println(obj.maxProfit2(intArrayOf(7,1,5,3,6,4)))
}