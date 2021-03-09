package queue

interface QueueInterface<E> {

    // 큐의 가장 마지막에 요소 추가
    fun offer(e: E): Boolean

    // 큐의 첫번째 요소 삭제하고 삭제된 요소 반환
    fun poll(): E?

    //큐의 첫번째 요소 반환
    fun peek(): E?

}