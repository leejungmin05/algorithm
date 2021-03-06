package interface_form

import java.lang.Exception


class Stack<E> : StackInterface<E> {
    var array: Array<E> = Array(10) { i -> Any() } as Array<E>

    private var top = -1


    override fun push(item: E): E {
        if(!isFull()) {
            array[++top] = item
        } else {
            val newArray = Array(array.size*2){i->Any()} as Array<E>
            array.copyInto(newArray)
            newArray[++top] = item
            array = newArray
        }
        return item
    }

    fun isFull():Boolean{
        return top >= array.size -1
    }

    override fun pop(): E {
        if(empty()){
            throw Exception("stack is Empty ")
        }
        return array[top--]
    }

    override fun peek(): E {
        if(empty()){
            throw Exception("stack is Empty ")
        }
        return array[top]
    }

    override fun search(value: Any?): Int {
        if(empty()){
            throw Exception("stack is Empty ")
        }
        //위에서 아래로
        for (i in top downTo 0) {
            if (value == array[i]) {
                return top+1 - i
            }
        }
        return -1 // value가 없는 경우
    }

    override fun size(): Int {
        return top+1
    }

    override fun clear() {
      top = -1
    }

    override fun empty(): Boolean {
        return top == -1
    }

    override fun toString() : String {
        var result=""
        for(i in 0..top) {
           result += (array[i].toString()+" ")
        }
    return result
    }
}



