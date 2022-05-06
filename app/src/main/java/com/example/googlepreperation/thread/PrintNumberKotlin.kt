package com.example.googlepreperation.thread

class PrintNumber {
    var counter = 1
    fun printOddNumber(number: Int) {
        synchronized(this) {
            while (counter < number) {
                while (number % 2 == 0) {
                    try {
                        //wait()
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
                println("$counter ")
                counter++
                //notify()
            }
        }
    }

    fun printEvenNumber(number: Int) {
        synchronized(this) {
            while (counter < number) {
                while (number % 2 == 1) {
                    try {
                       // wait()
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
                println("$counter ")
                counter++
                //notify()
            }
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val `object` = PrintNumber()
            val t1 = Thread { `object`.printOddNumber(20) }
            val t2 = Thread { `object`.printEvenNumber(20) }
            t1.start()
            t2.start()
        }
    }
}