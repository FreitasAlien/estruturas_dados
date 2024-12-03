class MinHeap(private val size: Int): Heapable {

    // Initializing variables
    private var heapData = LongArray(size){0}
    private var end = -1

    // Implementing Helper Methods
    override fun isFull(): Boolean {
        return (end == heapData.size -1) // Returns 'true' if the heap is full
    }

    override fun isEmpty(): Boolean {
        return (end == -1) // Returns 'true' if the heap is empty
    }

    override fun printHeap(): String {
        var result = "["
        for(i in 0 .. end) {
            result += "${heapData[i]}"
            if (i != end) {
                result += ","
            }
        }
        return result
    }
}