package set

class Set<E> : SetInterface<E> {
    var set = hashSetOf<E>()

    // 중복 , 순서 없음
    override fun add(e: E): Boolean {
        val i = set.iterator()
        if (!i.hasNext()) set.add(e)
        return true
    }

    override fun clear() {
        set.size == 0

    }

    override fun isEmpty(): Boolean {
        return set.size == -1
    }

    override fun remove(o: Any?): Boolean {
        val i = set.iterator()
        return i.hasNext() == o

    }

    override fun contains(o: Any?): Boolean {
        val i = set.iterator()
        return i.hasNext() == o
    }

    override fun size(): Int {
        return set.size
    }
}