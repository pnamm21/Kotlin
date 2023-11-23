fun main() {

    println("Hello world")

    // foreach
    /**    val items = listOf("apple", "banana", "orange") // List.of()
    // mutableListOf("apple","banana","orange") // ArrayList

    for (item in items)
    println(item)
     */

    // while
    /**    var index = 0
    while (index < items.size) {
    println("Item at $index is ${items[index]}")
    index++;
    }
     */

    // Diapazon
    /**    println(5 in 3..10) // true

    for (i in 1..10) {
    println(i)
    }

    for (i in 1 until 10) {
    println(i)
    }

    for (i in 10 downTo 1) {
    println(i)
    }

    for (i in 0..100 step 10) {
    println(i)
    }
     */

    // function methods
    println(testSimple(4, 5))
    println(testString(10))

    println(testNamedArguments(x = 3, y = 7, z = 0))

    testDefaultArguments()
    testDefaultArguments(x = 3, y = 6)

    printEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Print Even")
    printEven(*intArrayOf(1, 2, 3, 4, 5), 6, 7, 8, 9, 10)

    
}

fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

// void
fun testDefaultArguments(x: Int = 1, y: Int = 22) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}