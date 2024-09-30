fun main() {
    val list: Listable = CircularList(5)

    list.append(10)
    list.append(20)
    list.append(30)
    println(list.print())

    list.insert(1, 15)
    println(list.print())

    list.delete(2)
    println(list.print())

    println(list.get(1))

    list.update(0, 100)
    println(list.print())

    println(list.getAll().contentToString())

    list.clear()
    println(list.print())
}