package queue

import java.util.*

class queue<E> : QueueInterface<E> {
    var queue = arrayOf<E>()
    var front: Int = 0
    var rear: Int = 0

    override fun offer(e: E): Boolean {
       if(isFull()){
           return false
       } else {
           queue[front] = e
       }
        return true
    }

    fun isFull(): Boolean {
        return front+1 == rear
    }

    fun isEmpty(): Boolean {
        return front == rear
    }

    override fun poll(): E {

    }

    override fun peek(): E {
        return queue.
    }
}