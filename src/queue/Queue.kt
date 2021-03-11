package queue


class Queue<E> : QueueInterface<E> {
    private var queue: Array<E>
    private var rear = 0
    private var front = 0
    private var size = 0

    constructor() {
        queue = Array(DEFAULT_CAPACITY){i->Any()} as Array<E>
    }

    companion object {
        private const val DEFAULT_CAPACITY = 10
    }

    private fun resize(newCapacity: Int) {
        val capacity = queue.size
        val newQueue: Array<E> = Array(newCapacity){i-> Any()} as Array<E>
        var i = 0
        var j = front
        while (size >= i) {
            newQueue[i++] = queue[j++ % capacity]
        }
        queue = newQueue
        front = 0
        rear = size

    }

    override fun offer(e: E): Boolean {
        if ((rear + 1) % queue.size == front) {
            resize(queue.size * 2)
        }
        queue[rear % queue.size] = e
        rear = (rear + 1)
        size++
        return true
    }

    private fun isEmpty(): Boolean {
        return front == rear
    }

    override fun poll(): E? {
        if (!isEmpty()) {
            front = (front + 1) % queue.size
            val e = queue[front] as E
            size--
            return e
        }
        return null


    }

    override fun peek(): E? {
        if (!isEmpty()) {
            return queue[(front + 1) % queue.size] as E
        }
        return null
    }

    override fun toString(): String {
        var result = ""
        for (i in front until rear) {
            result += (queue[i % queue.size].toString() + " ")
        }
        return result
    }


}