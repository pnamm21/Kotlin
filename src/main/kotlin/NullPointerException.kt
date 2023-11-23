fun main() {

    // NPE - (NullPointerException)

    var a: String = "Hello"
    // a= null // NPE

    println(a.length)

    var b: String? = "Test"
    b = null

//    println(b.length)

    // return length b, if null -> null (not NPE!)
    b?.length

//     bob?.department?.head?.name -> null (not NPE!)
    println("============================================")
    // Elvis operator
    var l = b?.length ?: -1

    b = if ((0..10).random() > 5) "abc" else null
    // !! - throws NPE if variable is null
    val t = b!!.length


}