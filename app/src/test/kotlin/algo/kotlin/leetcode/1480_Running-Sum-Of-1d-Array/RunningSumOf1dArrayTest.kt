package algo.kotlin.leetcode.`1480_Running-Sum-Of-1d-Array`

import leetcode.`1480_Running-Sum-Of-1d-Array`.RunningSumOf1dArray
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RunningSumOf1dArrayTest {
    @Test
    fun test() {
        val expectNums = arrayOf(1,3,6,10).toIntArray()
        val nums: IntArray = arrayOf(1, 2, 3, 4).toIntArray()
        println((RunningSumOf1dArray.runningSum(nums)))
        Assertions.assertEquals(expectNums.contentToString(), nums.contentToString())
    }
}