fun main(){
    var stack: Stackable = DynamicStack(10)

    stack.push(10)
    stack.push(9)
    stack.push(8)
    stack.push(7)
    stack.push(6)
    stack.push(5)
    stack.push(4)
    stack.push(3)
    stack.push(2)
    stack.push(1)

    println(stack.print())

    println("Top of the stack:  ${stack.peek()}")

    println("Is the stack full? ${stack.isFull()}")


    stack.update("First")

    println(stack.print())

    for(i in 10 downTo 1){
        stack.pop()
    }


    println("Is the stack empty? ${stack.isEmpty()}")


    try{
        stack.update("1º")
    } catch (e: Exception){
        print("Exception: " + e.message)
    }


}