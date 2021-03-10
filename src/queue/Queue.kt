package queue


class Queue<E> : QueueInterface<E> {
    private var queue: Array<Any?>
    private var rear = 0
    private var front = 0
    private var size = 0

    constructor() {
        queue = arrayOfNulls(DEFAULT_CAPACITY)
    }

    companion object {
        private const val DEFAULT_CAPACITY = 64
    }

    private fun resize(newCapacity: Int) {
        val capacity = queue.size
        val newQueue = arrayOf(newCapacity)
        var i = 1
        var j = front + 1
        while (size >= i) {
            newQueue[++i] = queue[++j % capacity] as Int
        }
        queue = emptyArray()
        queue = arrayOf(newQueue)
        front = 0
        rear = size

    }

    override fun offer(e: E): Boolean {
        if ((rear + 1) % queue.size == front) {
            resize(queue.size * 2)
        }
        rear = (rear + 1) % queue.size
        queue[rear] = e
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
            queue[front] = null
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
        for (i in front + 1..rear) {
            result += (queue[i].toString() + " ")
        }
        return result
    }


}