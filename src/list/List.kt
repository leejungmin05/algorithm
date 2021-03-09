package list



class List<E>() : ListInterface<E> {
    var arrayList  = ArrayList<E>(10)
    private var lastIdx : Int

    init {
        arrayList = arrayListOf()
        lastIdx = -1
    }



    override fun add(index: Int, value: E) {
        //if(index<0 || lastIdx<index) throw IndexOutOfBoundsException("범위 오류")
        if(!isFull()){
            arrayList[++lastIdx] = value
        } else {
            val newArrayList = ArrayList<E>(size() * 2)
            arrayList.addAll(newArrayList)
            newArrayList[++lastIdx] = value
            arrayList = newArrayList
        }
    }

    fun isFull(): Boolean {
        return lastIdx >= size()-1
    }

    override fun remove(index: Int): E {
        for(i in index..size()) {
            arrayList[i] = arrayList[i+1]
        }
        --lastIdx
        return arrayList[index]

    }

    override fun set(index: Int, value: E) {
         arrayList[index] = value
    }
    override fun get(index: Int): E {
        return arrayList[index]
    }


    override fun contains(value: Any?): Boolean {
       return arrayList[++lastIdx] == value
    }

    override fun indexOf(value: Any?): Int {
        for(i in 0..size()){
            if(value == arrayList[i]){
                return i+1
            }
        }
        return -1
    }

    override fun size(): Int {
        return arrayList.size
    }

    override fun isEmpty(): Boolean{
        return lastIdx == -1
    }

    override fun clear() {
        lastIdx = -1
    }

    override fun toString(): String {
        var result = ""
        for(i in 0..lastIdx){
            result += (arrayList[i].toString() + " ")
        }
        return result
    }

}