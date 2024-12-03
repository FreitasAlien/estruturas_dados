interface Heapable {
    //Main Methods
    fun insert (data: Long)         //C
    fun getRoot(): Long?            //R
    fun update(data: Long)          //U
    fun extract(): Long?            //D

    //Helper Methods
    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun printHeap(): String


}