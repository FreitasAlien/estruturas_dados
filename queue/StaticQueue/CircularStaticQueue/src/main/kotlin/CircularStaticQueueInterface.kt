interface CircularStaticQueueInterface {
    //Main methods
    fun enqueue(item: Any?)
    fun dequeue(): Any?
    fun front(): Any?
    fun update(item: Any?)

    //Helper Methods
    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun print(): String
}