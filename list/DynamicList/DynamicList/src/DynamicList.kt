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
        if(!isFull()){
            var noTemp = Node(item)
            noTemp.previous = tail
            if(!isEmpty()){
                tail?.next = noTemp
            } else {
                head = noTemp
            }
            tail = noTemp
            quantity++
        } else {
            throw NoSuchElementException("List is full!")
        }
    }

    override fun insert(index: Int, item: Any?){

    }

    override fun get(index: Int): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            if(index >= 0 && index < quantity){
                var auxPointer = head
                for(i in 0 until index){
                    auxPointer = auxPointer?.next
                }
                aux = auxPointer?.data
            } else {
                throw IndexOutOfBoundsException("Invalid Index")
            }
        } else {
            throw NoSuchElementException("List is empty!")
        }
        return aux
    }

    override fun getAll(): Array<Any?>{
        var arrayAux: Array<Any?> = arrayOfNulls(size)
        if(!isEmpty()){
            var auxPointer = head
            for(i in 0 until quantity){
                arrayAux[i] = auxPointer?.data
                auxPointer = auxPointer?.next
            }
        } else {
            throw NoSuchElementException("List is empty!")
        }
        return arrayAux
    }

    override fun update(index: Int, item: Any?){

    }

    override fun delete(index: Int): Any?{

    }

    override fun clear(){

    }



}