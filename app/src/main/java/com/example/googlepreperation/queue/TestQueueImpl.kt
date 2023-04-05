package com.example.googlepreperation.queue

class TestQueueImpl {
}

fun main() {
    val lineForTickets = QueueImpl<String>()

    lineForTickets.apply {

        peek()
        println("check queue is Empty or not?: $isEmpty")
        enqueue("Person 1")
        enqueue("Person 2")
        enqueue("Person 3")
        enqueue("Person 4")
        enqueue("Person 5")
        println("check total person in ticket line?: $count")
        println("Person who is getting ticket at this moment is ${peek()}")
        println("Person got ticket is ${dequeue()}")
        println("Person who is getting ticket at this moment is ${peek()}")
    }
}
