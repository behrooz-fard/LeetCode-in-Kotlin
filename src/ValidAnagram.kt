fun main() {

    val validAnagram = ValidAnagram()
    println(validAnagram.isAnagram(s = "anagram", t = "nagaram"))
}

class ValidAnagram {

    fun isAnagram(s: String, t: String): Boolean {

        return s.groupingBy { it }.eachCount() == t.groupingBy { it }.eachCount()
    }

//    fun isAnagram(s: String, t: String): Boolean {
//
//        val sSortedCharArray = s.toCharArray().sorted()
//        val tSortedCharArray = t.toCharArray().sorted()
//
//        return sSortedCharArray == tSortedCharArray
//    }
}