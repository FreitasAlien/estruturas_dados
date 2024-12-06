interface Stackable {
    // Main Methods
    fun push(item: Any?)
    fun pop(): Any?
    fun peek(): Any?
    fun update(item: Any?)

    // Helper Methods
    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun print(): String
}