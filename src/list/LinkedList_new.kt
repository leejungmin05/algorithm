package list

class LinkedListNew<E> : ListInterface<E> {
    private var headNode: Node<E>? = null
    private var tailNode: Node<E>? = null
    var size: Int = -1

    override fun add(value: Any?) {
        val newNode = Node<E>().apply {
            this.data = value as E
            this.next = null
        }
        if (size == 0) {
            newNode.apply { this.next = headNode }
            headNode = newNode
            ++size
        } else {
            tailNode?.next = newNode
            tailNode = newNode
            ++size
        }
        // 중간에 노드를 새로 넣고 데이터를 넣는다면
        // 앞뒤 연결을 끊고 삽입...
    }

    private fun search(index: Int): Node<E>? {
        var node = headNode
        for (i in 0 until index) {
            node = node?.next
        }
        return node
    }

    override fun remove(index: Int): E {
        val nextNode: Node<E>
        val element: E

        if (index == 0) {
            // 첫번째 노드 삭제
            headNode?.data = null
            headNode?.next = null

            nextNode = headNode?.next!!
            headNode = nextNode
            size--

            if (size == 0) {
                tailNode = null
            }

        } else if (index == size()) {
            // 마지막 노드 삭제
        } else {
            // 중간 노드 삭제
        }

    }


    override fun get(index: Int): E {
        return search(index)?.data!!
    }

    override fun set(index: Int, value: E) {
        val replaceNode = search(index)
        replaceNode?.data = null
        replaceNode?.data = value
    }


    override fun indexOf(value: Any?): Int {
        var index = 0
        while (headNode != null) {
            if (value == headNode!!.next) {
                return index
            }
            index++
            headNode = headNode!!.next
        }
        return -1
    }

    override fun contains(value: Any?): Boolean {
        return indexOf(value) >= 0
    }

    override fun size(): Int {
        return size
    }

    override fun isEmpty(): Boolean {
        return size == -1
    }

    override fun clear() {
        while (headNode != null) {
            val nextNode: Node<E>? = headNode?.next
            headNode!!.data = null
            headNode!!.next = null
            headNode = nextNode
        }
        tailNode = null
        headNode = tailNode
        size = 0
    }

}