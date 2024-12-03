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

    // Utility Methods
    fun parent(index: Int): Int{
        return ((index - 1) / 2) // Returns the index of the parent
    }

    fun leftChild(parentIndex: Int): Int{
        return (parentIndex * 2 + 1) // Returns the index of the left child
    }

    fun rightChild(parentIndex: Int): Int{
        return leftChild(parentIndex) + 1 // Returns the index of the right child
    }

    fun swap(i: Int, j: Int){
        var temp = heapData[i]
        heapData[i] = heapData[j]
        heapData[j] = temp
    }

    fun heapifyUp(index: Int){
        val indexChild = index

        if(indexChild == 0) return

        val indexParent = parent(indexChild)
        if(heapData[indexChild] > heapData[indexParent]){
            swap(indexParent, indexChild)
            heapifyUp(indexParent)
        }
    }

    fun heapifyDown(index: Int){
        val parent = index
        val leftChild = leftChild(parent)
        val rightChild = rightChild(parent)
        var smaller = parent

        if(leftChild <= end)
            if(heapData[leftChild] < heapData[smaller])
                smaller = leftChild

        if(rightChild <= end)
            if(heapData[rightChild] < heapData[smaller])
                smaller = rightChild

        if(smaller != parent){
            swap(parent, smaller)
            heapifyDown(smaller)
        }
    }



}