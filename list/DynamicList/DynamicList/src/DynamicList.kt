class DynamicList(private var size: Int): Listable {
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
        var auxPointer = head
        for(i in 0 until quantity){
            result += "${auxPointer?.data}"

            if(i != quantity - 1)
                result += ","

        auxPointer = auxPointer?.next
        }
        return "$result]"
    }

    // Implementing Main Methods
    override fun append(item: Any?){

    }

    override fun insert(index: Int, item: Any?){

    }

    override fun get(index: Int): Any?{

    }

    override fun getAll(): Array<Any?>{

    }

    override fun update(index: Int, item: Any?){

    }

    override fun delete(index: Int): Any?{

    }

    override fun clear(){

    }



}