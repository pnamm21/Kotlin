fun main() {

    val task = Tasks()
    task.array()

    task.counterLetters()

    task.groupWord(arrayOf("eat","tea","tan","ate","nat","bat"))

}


class Tasks {

    fun array() {
        val arr1 = listOf(1, 2, 3, 2, 0)
        val arr2 = listOf(5, 1, 2, 7, 3)

        val s1 = arr1.toHashSet()
        val s2 = arr2.toHashSet()

        val result = mutableListOf<Int>()

        for (el in s1) {
            if (s2.contains(el)) {
                val numOfRe = minOf(
                    arr1.count { it == el },
                    arr2.count() { it == el })
                repeat(numOfRe) { result.add(el) }
            }
        }
        println(result)
    }

    fun counterLetters() {

        val str = "AAAABBBCCCDDDWWWUUSSSHHAAA"
        var count = 1
        var result = ""
        var currentLetter = str[0]

        for (letter in str.substring(1)) {
            if (currentLetter == letter) {
                count++
            } else {
                if (count == 1) {
                    result += currentLetter
                } else {
                    result += "$currentLetter$count"

                    count = 1
                    currentLetter = letter
                }
            }
        }

        if (count == 1) {
            result += currentLetter
        } else {
            result += "$currentLetter$count"
        }

        println(result)
    }

    fun groupWord(words: Array<String>): List<List<String>> {
        val result: MutableList<List<String>> = mutableListOf()

        val map = mutableMapOf<String, MutableList<String>>()

        for (word in words) {
            // ['a','b','c'].joinToString("-") -> 'a-b-c'
            val sortedWord = word.toCharArray().sorted().joinToString("")

            if (map.containsKey(sortedWord)) {
                map[sortedWord]?.add(word)
            } else {
                map[sortedWord] = mutableListOf(word)
            }
        }
        for ((key, value) in map) {
            result.add(value)
        }
        return result
    }


}