package list

interface ListInterface<E> {


    // 리스트에 요소를 특정 위치에 추가
    fun add(index: Int, value: E)

    // 리스트의 index 위치에 있는 요소 삭제
    fun remove(index: Int): E

    // 리스트에 있는 특정 위치의 요소 반환
    operator fun get(index: Int): E

    // 특정위치 요소를 새 요소로 대체
    operator fun set(index: Int, value: E)

    // 특정요소가 리스트에 있는 지 여부확인
    operator fun contains(value: Any?): Boolean

    //리스트에 특정요소가 몇번째 위치에 있는지 반환
    fun indexOf(value: Any?): Int

    // 리스트에 있는 요소의 개수를 반환
    fun size(): Int

    // 리스트에 요소가 비어있는지 반환
    // 없을 경우 true 있을경우 false
    fun isEmpty(): Boolean
    // 리스트 모든 요소 삭제
    fun clear()
}