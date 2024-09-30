class CircularList: Listable {
    //Private Variables
    private var head: Int
    private var tail: Int
    private var quantity: Int
    private var items: Array<Any?>

    constructor(listSize: Int){
        head = 0
        tail = -1
        quantity = 0
        items = arrayOfNulls(listSize)
    }

    //Implementing Helper Methods
    override fun isFull(): Boolean{
        return (quantity == items.size)
    }

    override fun isEmpty(): Boolean{
        return(quantity == 0)
    }

    override fun print(): String{
        var result = "["
        var aux = head
        for(i in 0 .. quantity - 1){
            if(i == quantity -1){
                result += "${items[(aux) % items.size]}"
            } else {
                result += "${items[(aux) % items.size]}, "
            }
            aux++
        }
        return "$result]"
    }

    //Implementing Main Methods
    override fun append(item: Any?){
        if(!isFull()){
            tail++
            if(tail == items.size){
                tail = 0
            }
            items[tail] = item
            quantity++
        } else {
            println("List is full!")
        }
    }

    override fun insert(index: Int, item: Any?){
        if(!isFull()){
            if(index >= 0 && index <= quantity){
                var physicalIndex = (index + head) % items.size
                var auxPointer = tail + 1
                for(i in index until quantity){
                    var previousElement = auxPointer - 1
                    if(auxPointer == items.size){
                        auxPointer = 0
                    }
                    var currentPointer = auxPointer
                    items[currentPointer] = items[previousElement]
                    auxPointer--
                }
                items[physicalIndex] = item
                tail++
                if(tail == items.size){
                    tail = 0
                }
                quantity++
            } else {
                println("Invalid Index!")
            }
        } else {
            println("List is full!")
        }
    }

    override fun get(index: Int): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            if(index >= 0 && index < quantity){
                var physicalIndex = (index + head) % items.size
                aux = items[physicalIndex]
            } else{
                println("Invalid Index!")
            }
        } else {
            println("List is empty!")
        }
        return aux
    }

    override fun getAll(): Array<Any?>{
        var auxArray: Array<Any?> = arrayOfNulls(quantity)
        var aux = head
        if(!isEmpty()){
            for(i in 0 until quantity){
                auxArray[i] = items[aux % items.size]
                aux++
            }
        } else {
            println("List is empty!")
        }
        return auxArray
    }

    override fun update(index: Int, item: Any?){
        if(!isEmpty()){
            if(index >= 0 && index < quantity){
                var physicalIndex = (index + head) % items.size
                items[physicalIndex] = item
            } else {
                println("Invalid Index!")
            }
        } else {
            println("List is empty!")
        }
    }

    override fun delete(index: Int): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            if(index >= 0 && index < quantity){
                var physicalIndex = (index + head) % items.size
                aux = items[physicalIndex]
                var auxPointer = physicalIndex
                for(i in index until quantity - 1){
                    var nextElement = (auxPointer + 1) % items.size
                    var currentElement = auxPointer
                    items[currentElement] = items[nextElement]
                    auxPointer++
                }
                tail--
                if(tail == -1){
                    tail = items.size - 1
                }
                quantity--
            }
        } else{
            println("List is empty!")
        }
        return aux
    }

    override fun clear(){
        head = 0
        tail = -1
        quantity = 0
    }




}