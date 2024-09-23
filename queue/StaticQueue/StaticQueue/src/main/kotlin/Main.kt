fun main(){
    var queue: StaticQueueInterface = StaticQueue(10)


    println(queue.isEmpty())

    queue.enqueue(1)

    println(queue.isEmpty())

    queue.dequeue()

    println(queue.print())

    println(queue.isEmpty())

    println(queue.getTail())
    println(queue.getHead())




}