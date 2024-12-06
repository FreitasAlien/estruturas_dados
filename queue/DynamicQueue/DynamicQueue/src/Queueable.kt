interface Queueable {
    // Main Methods
    fun enqueue(item: Any?)     //C
    fun front(): Any?           //R
    fun update(item: Any?)      //U
    fun dequeue(): Any?         //D

    // Helper Methods
    fun isEmpty(): Boolean
    fun isFull(): Boolean
    fun print(): String
}