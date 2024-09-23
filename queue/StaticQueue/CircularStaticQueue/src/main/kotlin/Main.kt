fun main() {
    val circularQueue : CircularStaticQueueInterface = CircularStaticQueue(10)
    println("Is queue empty? ${circularQueue.isEmpty()}")

    circularQueue.enqueue(1)
    circularQueue.enqueue(2)
    circularQueue.enqueue(3)
    circularQueue.enqueue(4)
    circularQueue.enqueue(5)
    circularQueue.enqueue(6)
    circularQueue.enqueue(7)
    circularQueue.enqueue(8)
    circularQueue.enqueue(9)
    circularQueue.enqueue(10)


    println("Queue after enqueuing 10 elements: ${circularQueue.print()}")

    println("Is queue full? ${circularQueue.isFull()}")

    println("Front: ${circularQueue.front()}")

    circularQueue.dequeue()
    println("Queue after dequeue: ${circularQueue.print()}")

    circularQueue.update(100)
    println("Queue after updating front to 100: ${circularQueue.print()}")

    circularQueue.enqueue(101)
    println("Queue after enqueuing 101: ${circularQueue.print()}")

    println("Front element: ${circularQueue.front()}")

    circularQueue.dequeue()
    println("Queue after dequeue: ${circularQueue.print()}")

    for(i in 5 downTo 1){
        circularQueue.dequeue()
    }
    println("Queue after multiple dequeues: ${circularQueue.print()}")
}