package list

import java.util.Arrays.copyOf

class List_new<E>(capacity: Int) : ListInterface<E> {
    var list: Array<Any?> = arrayOf(capacity)

    private var size = 0

    override fun add(value: Any?) {
        TODO("Not yet implemented")
    }

    fun add(index: Int, value: Any?) {
        if (size == list.size) {
            val new_capacity = list.size * 2
            list = copyOf(list, new_capacity)

        }
        for (i in size downTo index + 1) {
            list[i] = list[i - 1]
        }
        ++size
        list[index] = value

    }

    override fun remove(index: Int): E {
        val element = list[index] as E
        list[index] = null

        for (i in index until size) {
            list[i] = list[i + 1]
            list[i + 1] = null
        }
        size--
        return element
    }

    override fun get(index: Int): E {
        return list[index] as E
    }

    override fun set(index: Int, value: E) {
        list[index] = value
    }

    override fun contains(value: Any?): Boolean {
        return indexOf(value) >= 0
    }

    override fun indexOf(value: Any?): Int {
        for (i in 0..size()) {
            if (value == list[i]) {
                return i + 1
            }
        }
        return -1
    }

    override fun size(): Int {
        return size
    }

    override fun isEmpty(): Boolean {
        return size == -1
    }

    override fun clear() {
        size = -1
    }

    override fun toString(): String {
        var result = ""
        for (i in 0..size - 1) {
            result += (list[i].toString() + " ")
        }
        return result
    }



}