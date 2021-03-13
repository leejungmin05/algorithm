package set

import kotlin.collections.Set

class Set<E> : SetInterface<E> {
    var set: Array<E> = Array(10){i -> Any()} as Array<E>
    private var index = -1

    // 중복 , 순서 없음
    override fun add(e: E): Boolean {
        if(set.contains(e)) {
            return false
        } else {
            set[++index] = e
            return true
        }
    }

    override fun isEmpty(): Boolean {
        return set.size == -1
    }

    override fun size(): Int {
        return set.size
    }

    override fun iterator(): Iterator<E> {
        TODO("Not yet implemented")
    }

    override fun clear() {
        TODO("Not yet implemented")
    }

    override fun remove(e: E): Boolean {
        TODO("Not yet implemented")
    }

    override fun contains(e: E): Boolean {
        TODO("Not yet implemented")
    }


}