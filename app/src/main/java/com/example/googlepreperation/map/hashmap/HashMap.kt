package com.example.googlepreperation.map.hashmap

class HashMap {
}

fun main() {
    var cityRanking = HashMap<String, Int>()

    println(cityRanking)

    cityRanking["London"] = 1
    cityRanking["NewYork"] = 2
    cityRanking["Paris"] = 3
    cityRanking["Calfornia"] = 4

    println("mapping of city with their ranking")

    for (key in cityRanking.keys) {
        println("Rank  ${cityRanking[key]}  is city ${cityRanking.keys}")
    }

    cityRanking.clear()

    println(cityRanking)
}
