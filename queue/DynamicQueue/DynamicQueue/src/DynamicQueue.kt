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

            if(i != quantity - 1)
                result += ","

            aux = aux?.next
        }
        return "$result]"
    }

    // Implementing Main Methods
    override fun enqueue(item: Any?){
        if(!isFull()){
            var nodeTemp = Node(item)
            nodeTemp?.previous = tail
            if(!isEmpty())
                tail?.next = nodeTemp
            else {
                head = nodeTemp
            }
            tail = nodeTemp
            quantity++
        } else {
            throw NoSuchElementException("Queue is Full!")
        }
    }

    override fun front(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = head?.data
        } else {
            throw NoSuchElementException("Queue is empty!")
        }
        return aux
    }

    override fun update(item: Any?){
        if(!isEmpty()){
            head?.data = item
        } else {
            throw NoSuchElementException("Queue is empty!")
        }
    }

    override fun dequeue(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = head?.data
            head = head?.next
            quantity--
            if(!isEmpty())
                head?.previous = null
            else
                tail = null
        } else {
            throw NoSuchElementException("Queue is empty!")
        }
        return aux
    }



}