fun main() {
    val twoSum = TwoSum()
    twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9).forEach {
        println(it)
    }
}

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {

//        val map = nums.mapIndexed { index, i -> i to index }.toMap()
        val map = nums.toMap()

        nums.forEachIndexed { i, x ->

            val diff = target - x

            val other = map[diff]

            if (other != null && other != i) {

                return intArrayOf(i, other)
            }
        }
        return intArrayOf()
    }

    private fun IntArray.toMap(): Map<Int, Int> {

        val map = mutableMapOf<Int, Int>()
        this.forEachIndexed { index, i -> map[i] = index }
        return map
    }
}