class CircularStaticQueue: CircularStaticQueueInterface {
    //Private Variables
    private var head: Int
    private var tail: Int
    private var items: Array<Any?>
    private var quantity: Int

    constructor(circularQueueSize: Int){
        head = 0
        tail = -1
        items = arrayOfNulls(circularQueueSize)
        quantity = 0
    }

    //Helper Methods
    override fun isFull(): Boolean{
        return (quantity == items.size)
    }
    override fun isEmpty(): Boolean{
        return (quantity == 0)

    }
    override fun print(): String{
        var result = "["
        var aux = head
        for(i in 0.. quantity - 1){
            if(i == quantity - 1 ){
                result += "${items[aux % items.size]}"
            } else {
                result += "${items[aux % items.size]}, "
            }
            aux++
        }

        return "$result]"
    }

    //Main methods
    override fun enqueue(item: Any?){
        if(!isFull()){
            tail++
            if(tail == items.size){
                tail = 0
            }
            quantity++
            items[tail] = item
        } else {
            println("Circular Queue is full!")
        }
    }

    override fun dequeue(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = items[head]
            head++
            if(head == items.size){
                head = 0
            }
            quantity--
        } else {
            println("Circular Queue is empty!")
        }
        return aux
    }

    override fun front(): Any?{
        var aux: Any? = null
        if(!isEmpty()){
            aux = items[head]
        } else {
            println("Circular Queue is empty!")
        }
        return aux
    }



    override fun update(item: Any?){
        if(!isEmpty()){
            items[head] = item
        } else {
            println("Circular Queue is empty!")
        }
    }



}