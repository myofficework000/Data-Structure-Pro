package com.example.googlepreperation.linkedlist_old

import java.util.*

/*
Reference --
https://www.cosmiclearn.com/kotlin/linkedlist.php#:~:text=Kotlin%20Topics&text=LinkedList%20provides%20a%20doubly%20linked,the%20List%20and%20Deque%20interface.&text=Benefit%20of%20linked%20list%20is,rearrangement%20of%20entire%20underlying%20array
*/

class CreateLinkList {

}

fun main() {
    val linkedList = LinkedList<String>()
    linkedList.addAll(listOf("A", "B", "C"))
    println(linkedList)
    println(linkedList.first) //Get the first element
    println(linkedList.last) //get the last element


    linkedList.addFirst("First item")
    println(linkedList)

    linkedList.addLast("last item ")
    println(linkedList)

    linkedList.removeFirst()
    println(linkedList)

    linkedList.removeLast()
    println(linkedList)

    for (element in linkedList) {
        println(element)
    }

    linkedList.addAll(listOf("Hey", "Hi","Hi","A","B"))
    println(linkedList)

    linkedList.add(2, "MiddleItem")
    println(linkedList)

    if (linkedList.contains("Hey")) {
        linkedList.removeAll(listOf("Hey", "Hi"))
    }
    println(linkedList)

    linkedList.removeAt(2)
    println(linkedList)

    linkedList.reverse()

    for (elements in linkedList) {
        println(elements)
    }

    println(linkedList.count())

    println(linkedList.count { x->x.startsWith("A") })

    println(linkedList.distinct())

    println(linkedList.isEmpty())
}