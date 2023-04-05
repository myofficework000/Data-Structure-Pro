package com.example.googlepreperation.map.hashset

class HashSetTopic {
}

fun main() {
    val luckyNumber = hashSetOf(1,3,4,4,5,67)
    println(luckyNumber)

    val myCities = hashSetOf("London","NewYork","Paris", "London")
    println(myCities)
    myCities.add("Delhi")
    println(myCities)
    val badCities = hashSetOf("Miami","Brixton","AnyCity")

    myCities.addAll(badCities)

    println(myCities)

    myCities.remove("London")
    println(myCities)

 /*   for (item in myCities){
        println(item)
    }*/

    println(myCities.elementAt(2))
}