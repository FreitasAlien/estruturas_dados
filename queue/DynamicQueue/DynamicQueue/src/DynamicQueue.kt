class DynamicQueue(private val size: Int): Queueable {
    private var head: Node? = null
    private var tail: Node? = null
    private var quantity: Int = 0

    // Implementing Helper Methods
    override fun isEmpty(): Boolean{
        return (quantity == 0)
    }

    override fun isFull(): Boolean{
        return (quantity == size)
    }

    override fun print(): String{
        var result = "["
        var aux: Node? = head
        for(i in 0 until quantity){
            result += "${aux?.data}"

            if(i == quantity - 1)
                result += ","

            aux = aux?.next
        }
        return "$result]"
    }

    // Implementing Main Methods
    override fun enqueue(item: Any?){

    }

    override fun front(): Any?{

    }

    override fun update(): Any?{

    }

    override fun dequeue(): Any?{

    }



}