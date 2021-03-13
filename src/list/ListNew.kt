package list

import java.util.Arrays.copyOf

class ListNew<E>(capacity: Int) : ListInterface<E> {
    var list: Array<E> = Array(capacity) { i -> Any() } as Array<E>

    private var size = 0

    override fun add(value: E) {
        if (size == list.size) {
            val new_capacity = list.size * 2
            list = copyOf(list, new_capacity)

        }
        list[size++] = value

    }

    fun add(index: Int, value: E) {
        if (size == list.size) {
            val new_capacity = list.size * 2
            list = copyOf(list, new_capacity)

        }
        for (i in size downTo index + 1) {
            list[i] = list[i - 1]
        }
        list[index] = value
        size++
    }

    override fun remove(index: Int): E {
        val element = list[index] as E

        for (i in index until size) {
            list[i] = list[i + 1]
        }
        size--
        return element
    }

    override fun get(index: Int): E {
        return list[index] as E
    }

    override fun set(index: Int, value: E):Boolean {
        list[index] = value
        return true
    }

    override fun contains(value: E): Boolean {
        return indexOf(value) >= 0
    }

    override fun indexOf(value: E): Int {
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