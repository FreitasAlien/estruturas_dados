fun main() {
    var minHeap: Heapable = MinHeap(10)

    minHeap.insert(5)
    minHeap.insert(3)
    minHeap.insert(2)
    minHeap.insert(10)
    println(minHeap.printHeap()) // [2,5,3,10]

    minHeap.extract()
    println(minHeap.printHeap()) // [3,5,10]

    println(minHeap.getRoot()) // 3

    minHeap.update(12)
    println(minHeap.printHeap()) // [5,12,10]
}