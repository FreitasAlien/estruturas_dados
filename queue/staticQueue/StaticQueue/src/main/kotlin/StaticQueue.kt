class StaticQueue : StaticQueueInterface {
    //Private Variables
    private var head: Int
    private var tail: Int
    private var items: Array<Any?>

    constructor(queueSize: Int){
        head = 0
        tail = -1
        items = arrayOfNulls(queueSize)
    }

    //Implementing Helper Methods
    override fun isFull(): Boolean{
        return(tail == items.size - 1)
    }

    override fun isEmpty(): Boolean{
        return(head == tail + 1)
    }

    override fun print(): String{
       var result = "["
        for(i in head..tail){
            if(i == tail){
                result += "${items[i]}"
            } else {
                result += "${items[i]}, "
            }
        }
        return "$result]"
    }

    //Implementing Main Methods
    override fun enqueue(item: Any?) {
        if(!isFull()){
            tail++
            items[tail] = item
        } else {
            println("Queue is full!")
        }
    }

    override fun dequeue(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = items[head]
            head++
        } else {
            println("Queue is empty!")
        }
        return aux
    }

    override fun front(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = items[head]
        } else {
            println("Queue is empty!")
        }
        return aux
    }

    override fun update(item: Any?){
        if(!isEmpty()){
            items[head] = item
        } else {
            println("Queue is empty!")
        }
    }

}