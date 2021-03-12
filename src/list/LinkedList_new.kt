package list

class LinkedListNew<E> : ListInterface<E> {
    private var headNode: Node<E>? = null
    private var tailNode: Node<E>? = null
    var size: Int = 0


    fun addFirst(value: E) {
        val newNode = Node<E>().apply {
            this.data = value
            this.next = headNode
        }
        headNode = newNode
        size++

        if(headNode?.next==null) {
            tailNode = headNode
        }
    }
    override fun add(value: E){
        if (size == 0) {
            addFirst(value)
        } else {
            val newNode = Node<E>().apply{
                this.data = value
            }
            tailNode?.next = newNode
            tailNode = newNode
            size++
        }
    }

    private fun node(index: Int): Node<E>? {
        var node = headNode
        for (i in 0 until index) {
            node = node?.next
        }
        return node
    }

    override fun remove(index: Int): E {
        if(index == 0) {
            var currNode = headNode
            headNode = currNode!!.next
            val returnD = currNode.data
            currNode = null
            size--
            return returnD!!
        } else {
            val currNode = node(index-1)
            var delNode = currNode?.next
            val returnD = delNode?.data
            currNode?.next = currNode?.next?.next
            delNode = null
            size--
            return returnD!!

        }
    }


    override fun get(index: Int): E {
        val currNode = node(index)
        return currNode?.data!!
    }

    override fun set(index: Int, value: E) {
        val replaceNode = node(index)
        //replaceNode?.data = null
        replaceNode?.data = value
    }


    override fun indexOf(value: E): Int {
        var currNode = headNode
        var index = 0
        while (currNode?.data != value) {
            currNode = currNode?.next
            index++

            if(currNode == null)
                return -1
        }
        return index
    }

    override fun contains(value: E): Boolean {
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

    override fun toString(): String {
        var result = ""
        var currNode = headNode
        while(currNode?.next != null) {
            result += currNode.data.toString()+" "
            currNode = currNode.next
        }
        //마지막 노드 결과
        result += currNode!!.data

        return result
    }
}