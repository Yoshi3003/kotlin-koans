package i_introduction._4_Lambdas

import util.TODO
import util.doc4

fun example() {

    val sum = { x: Int, y: Int -> x + y }       // returns the type that last statement evaluates to
    val square: (Int) -> Int = {
        x -> x * x
    }

    sum(1, square(2)) == 5
}

fun testFunction(arg : Int, body : (Int) -> Int) : String {
    val result : Int = body(arg)
    return "The number is " + result
}

fun generateNumber(arg : Int) : Int {
    return arg * 2
}

fun main(args: Array<String>) {
    println( testFunction(7, { x : Int -> x * x } ) )
}

fun todoTask4(collection: Collection<Int>): Nothing = TODO(
    """
        Task 4.
        Rewrite 'JavaCode4.task4()' in Kotlin using lambdas.
        You can find the appropriate function to call on 'collection' through IntelliJ IDEA's code completion feature.
        (Don't use the class 'Iterables').
    """,
    documentation = doc4(),
    references = { JavaCode4().task4(collection) })

fun task4(collection: Collection<Int>) = collection.any( { it % 42 == 0 })




