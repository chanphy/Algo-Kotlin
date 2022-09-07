package leetcode.`1480_Running-Sum-Of-1d-Array`

import org.junit.Test

class RunningSumOf1dArrayTest {

    @Test
    fun test() {
        val expectNums = arrayOf(1,3,6,10).toIntArray()
        val nums = arrayOf(1, 2, 3, 4).toIntArray()

        println("-----------------------Leetcode Problem 1480------------------------\n")
        println("[Expert]: " + expectNums.contentToString() + "\n[Input]: " + nums.contentToString() + "\n[Output]: " + (RunningSumOf1dArray.runningSum(nums)).contentToString())
        if (expectNums.contentToString() == nums.contentToString()) {
            println("[Result]: Success")
        } else{
            println("[Result]: Failed.")
        }
    }
}