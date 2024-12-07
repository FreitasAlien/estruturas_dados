fun main() {
    val list: Listable = DynamicList(5)

    list.append(10)
    list.append(20)
    list.append(30)
    println(list.print()) // [10, 20, 30]

    list.insert(1, 15)
    println(list.print()) // [10, 15, 20, 30]

    list.delete(2)
    println(list.print()) // [10, 15, 30]

    println(list.get(1)) // 15

    list.update(0, 100) // [100, 15, 30]
    println(list.print())

    list.clear()
    println(list.print()) // []
}