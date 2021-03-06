package interface_form

import java.lang.Exception

class Stack<E> : StackInterface<E> {
    var array: Array<E> = Array(10) { i -> Any() } as Array<E>

    private var top = -1


    override fun push(item: E): E {
        //top<size

        array[++top] = item
        //top==size
        return item
    }

    override fun pop(): E {
        if(empty()){
            throw Exception()
        }
        //top==0
        //throw Exception()

        return array[top--]
    }

    override fun peek(): E {
        return array[top]
    }

    override fun search(value: Any?): Int {
        //위에서 아래로
        for (i in top downTo 0) {
            if (value == array[i]) {
                return top - i
            }
        }
        return -1
    }

    override fun size(): Int {
        return top
    }

    override fun clear() {
      top = -1
    }

    override fun empty(): Boolean {
        return top == 0
    }

    override fun toString() : String {
        var result=""
        for(i in 0..top) {
           result += (array[i].toString()+" ")
        }
       return result
    }
}



