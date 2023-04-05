package com.example.googlepreperation.queue

class QueueImpl<T> : Queue<T> {
    private val queue = arrayListOf<T>()

    override val count: Int
        get() = queue.size

    override val isEmpty: Boolean
        get() = count == 0

    override fun peek() = queue.getOrNull(0)

    override fun enqueue(element: T) = queue.add(element)

    override fun dequeue(): T? {
        return if (isEmpty) null else queue.removeAt(0)
    }
}