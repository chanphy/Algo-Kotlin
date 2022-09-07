package leetcode.`0724_Find-Pivot-Index`

import org.junit.Test

class FindPivotIndexTest {
    @Test
    fun test() {
        val expectNum = 3
        val expectNum2 = 0
        val nums = arrayOf(1, 7, 3, 6, 5, 6).toIntArray()
        val nums2 = arrayOf(2,1,-1).toIntArray()

        println("-----------------------Leetcode Problem 0724------------------------\n")
        println(
            "[Expect]: " + expectNum2 + "\n[Input]: " + nums.contentToString() + "\n[Output]: " + FindPivotIndex.pivotIndex(
                nums2
            )
        )
        if (expectNum == FindPivotIndex.pivotIndex(nums)) {
            println("[Result]: Success")
        } else {
            println("[Result]: Failed.")
        }
    }
}