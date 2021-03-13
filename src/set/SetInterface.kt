package set


interface SetInterface<E> {

    // 지정된 요소가 세트에 존재하지 않는 경우 요소를 추가한다
    // 성공적으로 추가한 경우 true
    fun add(e: E): Boolean

    // 요소 전체를 삭제한다
    fun clear()

    //세트가 비어있으면 true 리턴
    fun isEmpty(): Boolean

    //해당 요소를 삭제
    fun remove(e: E): Boolean

    // 지정 요소가 set에 있는지 확인
    operator fun contains(e: E): Boolean

    // 요소의 개수
    fun size(): Int

    fun iterator() : Iterator<E>


}