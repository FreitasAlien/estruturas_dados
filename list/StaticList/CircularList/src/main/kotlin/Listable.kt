interface Listable {
    interface Listable {
        //Main Methods
        fun append(item: Any?) // Adds an element to the end of the list
        fun insert(index: Int, item: Any?) // Inserts an element at the specified position
        fun get(index: Int): Any? // Returns the element at the specified position
        fun getAll(): Array<Any?> // Returns an array with all the elements of the list
        fun update(index: Int, item: Any?) // Updates the element at the specified position
        fun delete(index: Int): Any? // Deletes the element at the specified position
        fun clear() // Clears all elements from the list

        //Helper Methods
        fun isFull(): Boolean // Checks if the list is full
        fun isEmpty(): Boolean // Checks if the list is empty
        fun print(): String // Prints the elements of the list
    }
}