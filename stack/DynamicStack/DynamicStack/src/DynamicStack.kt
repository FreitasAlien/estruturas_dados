class DynamicStack(var size: Int): Stackable{
    private var topPointer: Node? = null
    private var quantity: Int = 0

    // Implementing Helper Methods
    override fun isEmpty(): Boolean{
        return (quantity == 0)
    }

    override fun isFull(): Boolean{
        return (quantity == size)
    }

    override fun print(): String{
        var aux = topPointer
        var result = "["
        for(i in 0 until quantity){
            result += aux?.data
            if(i != quantity - 1)
                result += ","

            aux = aux?.previous
        }
        return "$result]"
    }

    // Implementing Main Methods
    override fun push(item: Any?){
        if(!isFull()){
            var nodeTemp = Node(item)
            nodeTemp.previous = topPointer
            if(isEmpty())
                topPointer?.next = nodeTemp
            topPointer = nodeTemp
            quantity++
        } else {
            throw NoSuchElementException("Stack is full!")
        }
    }

    override fun pop(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = topPointer?.data
            topPointer = topPointer?.previous
            if(quantity > 1)
                topPointer?.next = null
            quantity--
        } else {
            throw NoSuchElementException("Stack is empty!")
        }
        return aux
    }

    override fun peek(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = topPointer?.data
        } else {
            throw NoSuchElementException("Stack is empty!")
        }
        return aux
    }

}