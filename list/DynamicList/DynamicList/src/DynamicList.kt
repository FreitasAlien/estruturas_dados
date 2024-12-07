class DynamicList(private var size: Int): Listable {
    private var head: Node? = null
    private var tail: Node? = null
    private var quantity: Int = 0

    // Helper Methods
    override fun isEmpty(): Boolean{
        return (quantity == 0)
    }

    override fun isFull(): Boolean{
        return (quantity == size)
    }

    override fun print(): String{

    }

}