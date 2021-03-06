package interface_form

interface StackInterface<E> {
    //스택의 맨 위에 요소 추가
    fun push(item: E): E

    //스택의 맨 위의 요소를 제거하고 제거된 요소 반환
    fun pop(): E

    //스택의 맨 위 요소를 제거하지 않고 반환
    fun peek(): E

    //스택의 맨 위로부터 특정 요소가 몇 번째에 위치하는지 반환
    //일치하는 요소가 없을 경우 -1 반환
    fun search(value: Any?): Int

    //스택의 요소 개수 반환
    fun size(): Int

    //스택 모든요소 삭제
    fun clear()

    //스택의 요소가비어있는지 반환
    //없으면 true 있으면 false
    fun empty(): Boolean
}