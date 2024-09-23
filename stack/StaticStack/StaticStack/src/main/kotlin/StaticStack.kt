class StaticStack : StaticStackInterface {
    //Private Variables
    private var topPointer: Int
    private var items: Array<Any?>

    //Constructor
    constructor(stackSize: Int){
        items = arrayOfNulls(stackSize)
        topPointer = -1
    }

    //Implementing helper methods
    override fun isFull(): Boolean{
        return(topPointer == items.size - 1)
    }

    override fun isEmpty(): Boolean{
        return(topPointer == -1)
    }

    override fun print(): String{
        var result = "["
        for(i in topPointer downTo 0){
            if(i == 0){
                result += "${items[i]}"
            } else{
                result += "${items[i]}, "
            }
        }
        return "$result]"
    }

    //Implementing main methods
    override fun push(item: Any?){
        if(!isFull()){
            topPointer++
            items[topPointer] = item
        } else {
            println("Stack is full!")
        }

    }
    override fun pop(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = items[topPointer]
            topPointer--
        } else{
            println("Stack is empty!")
        }
        return aux
    }

    override fun peek(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = items[topPointer]
        } else{
            println("Stack is empty!")
        }
        return aux
    }

    override fun update(item: Any?){
        if(!isEmpty()){
            items[topPointer] = item
        } else {
            println("Stack is empty!")
        }

    }


}