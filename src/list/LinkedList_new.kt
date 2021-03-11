//package list
//
//class LinkedListNew<E> : ListInterface<E> {
//    private var headNode: Node<E>? = null
//    private var tailNode: Node<E>? = null
//    var size: Int = -1
//
//    override fun add(value: Any?) {
//        val newNode = Node<E>().apply {
//            this.data = value as E
//            this.next = null
//        }
//        if (size == 0) {
//            newNode.apply { this.next = headNode }
//            headNode = newNode
//            ++size
//        } else {
//            tailNode?.next = newNode
//            tailNode = newNode
//            ++size
//        }
//        // 중간에 노드를 새로 넣고 데이터를 넣는다면
//        // 앞뒤 연결을 끊고 삽입...
//    }
//
//    private fun search(index: Int): Node<E>? {
//        var node = headNode
//        for (i in 0 until index) {
//            node = node?.next
//        }
//        return node
//    }
//
//    override fun remove(index: Int):E{
//        var currNode = headNode
//        var prevNode: Node<E>? = null
//        var count = 0
//
//        if(index == 0) {
//            headNode = currNode!!.next
//            this.size--
//        }
//        while(count!= index){
//            prevNode = currNode
//            currNode = prevNode!!.next
//            count++
//        }
//        prevNode!!.next = currNode!!.next
//        if(index == size-1) tailNode = prevNode
//        this.size--
//        return prevNode.data!!
//    }
//
//
//    override fun get(index: Int): E {
//        return search(index)?.data!!
//    }
//
//    override fun set(index: Int, value: E) {
//        val replaceNode = search(index)
//        replaceNode?.data = null
//        replaceNode?.data = value
//    }
//
//
//    override fun indexOf(value: Any?): Int {
//        var index = 0
//        while (headNode != null) {
//            if (value == headNode!!.next) {
//                return index
//            }
//            index++
//            headNode = headNode!!.next
//        }
//        return -1
//    }
//
//    override fun contains(value: Any?): Boolean {
//        return indexOf(value) >= 0
//    }
//
//    override fun size(): Int {
//        return size
//    }
//
//    override fun isEmpty(): Boolean {
//        return size == -1
//    }
//
//    override fun clear() {
//        while (headNode != null) {
//            val nextNode: Node<E>? = headNode?.next
//            headNode!!.data = null
//            headNode!!.next = null
//            headNode = nextNode
//        }
//        tailNode = null
//        headNode = tailNode
//        size = 0
//    }
//
//}