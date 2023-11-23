fun main() {
    testWhen(1)
    testWhen(18)
    testWhen("Hello world!")



}

// testWhen(Object object)
fun testWhen(input: Any) {
    when (input) {
        1 -> println("One")
        2 -> println("Two")
        in 10..20 -> println("from 10 to 20")
        is String -> println("String is ${input.length}")
        else -> println("Something more")
    }

    /**
     * public void test(Object input){
     *
     *   if (input instanceof String){
     *      String strInput = (String) input;
     *   }
     *
     *   if (input instanceof Integer) {
     *
     *   }
     * }
     */


    // (String) object;
}