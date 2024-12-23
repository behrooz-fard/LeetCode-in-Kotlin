fun main() {

    val solution = Solution()
    println(solution.containsDuplicate(intArrayOf(1, 2, 3, 1)))
    println(solution.containsDuplicate(intArrayOf(1, 2, 3, 4)))
    println(solution.containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
}

class Solution {

    fun containsDuplicate(nums: IntArray): Boolean {

        val numbersSet = mutableSetOf<Int>()

        nums.forEach {

            if (numbersSet.contains(it)) {
                return true
            } else {
                numbersSet.add(it)
            }
        }

        return false
    }
}