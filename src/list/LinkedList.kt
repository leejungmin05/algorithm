package list


import java.lang.Exception

class LinkedList<E> {

    private var headNode: Node<E>? = null
    private var tailNode: Node<E>? = null
    var size: Int = -1


    fun addFirst(value: Any?) {
        val newNode = Node<E>().apply {
            this.data = value as E
            this.next = headNode
        }
        headNode = newNode
        size++

        if (headNode?.next == null) {
            tailNode = headNode
        }
    }

    fun addLast(value: Any?) {
        if (size == 0) {
            addFirst(value)
        } else {
            val newNode = Node<E>().apply {
                this.data = value as E
            }
            tailNode?.next = newNode
            tailNode = newNode
            size++
        }
    }

    @JvmName("add1")
    fun add(index: Int, value: E) {
        if (index > size - 1) {
            throw Exception("오류")
        }
        if (index == 0) {
            addFirst(value)
            return
        } else {
            val newNode = Node<E>().apply {
                this.data = value as E
            }
            val idxNode = findNode(index)
            val temp = idxNode.nextNode
            newNode.next = temp
            idxNode.nextNode = newNode

            if (newNode.next == null) {
                tailNode = newNode
            }
            size++

        }

        fun remove(index: Int): E {
            if (index == 0) {

            }

        }

        fun get(index: Int): E {
            return search(index).data
        }

        fun search(index: Int): Node<E> {
            var x: Node<E> = headNode
            for (i in 0 until index) {
                x = x.next
            }
            return x
        }

        fun set(index: Int, value: E) {
            val replaceNode: Node<E> = search(index)
            replaceNode.data = null
            replaceNode.data = value
        }

        fun contains(value: Any?): Boolean {
            return indexOf(value) >= 0
        }

        fun indexOf(value: Any?): Int {
            var index = 0
            var x: Node<E> = headNode
            while (x != null) {
                if (value == x.data) {
                    return index
                }
                index++
                x = x.next
            }
            return -1
        }

        fun size(): Int {
            return size
        }

        fun isEmpty(): Boolean {
            return size == -1
        }

        fun clear() {
            var x: Node<E> = headNode
            while (x != null) {
                val nextNode: Node<E> = x.next
                x.data = null
                x.next = null
                x = nextNode
            }
            tailNode = null
            headNode = tailNode
            size = -1
        }
    }

    fun add(index: Int, value: Any?) {
        if (index > size - 1) {
            throw Exception("유효하지않음")
        }
        if (index == 0) {
            addFirst(value)
        } else {
            val newNode = Node<E>().apply {
                this.data = value as E
            }
            val idxNode = findNode(index)
            val temp = idxNode.nextNode
            newNode.next = temp
            idxNode.nextNode = newNode
        }

        ++size
        tailNode.next = newNode
        tailNode = newNode

    }


}