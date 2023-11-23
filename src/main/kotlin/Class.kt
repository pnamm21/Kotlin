class Class(val firstName: String, val lastName: String, var age: Int) {

    var children: MutableList<Class> = mutableListOf() // ArrayList

    init {
        println("Class is created ${firstName}")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Class) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    constructor() : this("", "", -1)

}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1 // this.field
        set(value) {
            if (value < 0) {
                println("Negative value!")
                field = value
            }
        }

    fun area() = height * length
}

fun main() {

    val child = Class("Child", "Name", 5)
    val class1 = Class("Name", "Name", 33, child)
    println(class1.firstName)

    println("===============================")

    var rectangle1 = Rectangle(5.0, 3.0)
    println("The perimeter is ${rectangle1.length}")

    val rectangle2 = Rectangle(5.0,3.0)
    println(rectangle1 == rectangle2) // true

}