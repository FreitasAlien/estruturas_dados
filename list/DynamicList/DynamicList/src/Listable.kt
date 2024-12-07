interface Listable {
    // Main Methods
    fun append(item: Any?)
    fun insert(index: Int, item: Any?)
    fun get(index: Int): Any?
    fun getAll(): Array<Any?>
    fun update(index: Int, item: Any?)
    fun delete(index: Int): Any?
    fun clear()

    // Helper Methods
    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun print(): String
}