fun main() {
    val dynamicQueue : Queueable = DynamicQueue(10)
    println("Is queue empty? ${dynamicQueue.isEmpty()}")

    dynamicQueue.enqueue(1)
    dynamicQueue.enqueue(2)
    dynamicQueue.enqueue(3)
    dynamicQueue.enqueue(4)
    dynamicQueue.enqueue(5)
    dynamicQueue.enqueue(6)
    dynamicQueue.enqueue(7)
    dynamicQueue.enqueue(8)
    dynamicQueue.enqueue(9)
    dynamicQueue.enqueue(10)


    println("Queue after enqueuing 10 elements: ${dynamicQueue.print()}")

    println("Is queue full? ${dynamicQueue.isFull()}")

    println("Front: ${dynamicQueue.front()}")

    dynamicQueue.dequeue()
    println("Queue after dequeue: ${dynamicQueue.print()}")

    dynamicQueue.update(100)
    println("Queue after updating front to 100: ${dynamicQueue.print()}")

    dynamicQueue.enqueue(101)
    println("Queue after enqueuing 101: ${dynamicQueue.print()}")

    println("Front element: ${dynamicQueue.front()}")

    dynamicQueue.dequeue()
    println("Queue after dequeue: ${dynamicQueue.print()}")

    for(i in 5 downTo 1){
        dynamicQueue.dequeue()
    }
    println("Queue after multiple dequeues: ${dynamicQueue.print()}")
}