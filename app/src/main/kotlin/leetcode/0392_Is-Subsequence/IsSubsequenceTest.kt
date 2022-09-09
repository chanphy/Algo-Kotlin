package leetcode.`0392_Is-Subsequence`

import org.junit.Test

class IsSubsequenceTest {
    @Test
    fun test() {
        val expect1 = true
        val s1 = "abc"
        val t1 = "ahbgdc"
        val expect2 = false
        val s2 = "axc"
        val t2 = "ahbgdc"

        println("-----------------------Leetcode Problem 0205------------------------\n")
        println(
            "[Expect]: " + expect1 + "\n[Input]: " + s1 + ", " + t1 + "\n[Output]: " +  IsSubsequence.isSubsequence(s1, t1)
        )
        println(
            "[Expect]: " + expect2 + "\n[Input]: " + s2 + ", " + t2 + "\n[Output]: " +  IsSubsequence.isSubsequence(s2, t2)
        )
        if (expect1 == IsSubsequence.isSubsequence(s1, t1) &&
            expect2 == IsSubsequence.isSubsequence(s2, t2)) {
            println("[Result]: Success")
        } else {
            println("[Result]: Failed.")
        }
    }
}