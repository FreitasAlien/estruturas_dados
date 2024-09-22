interface StaticStackInterface {
    //Main Methods
    fun push(item: Any?)
    fun pop(): Any?
    fun peek(): Any?
    fun update(item: Any?)

    //Helper Methods
    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun print(): String
}