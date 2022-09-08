package leetcode.`0205_Isomorphic-Strings`

import org.junit.Test

class IsomorphicStringsTest {

    @Test
    fun test() {
        val expect1 = true
        val s1 = "paper"
        val t1 = "title"
        val expect2 = false
        val s2 = "bar"
        val t2 = "foo"

        println("-----------------------Leetcode Problem 0205------------------------\n")
        println(
            "[Expect]: " + expect1 + "\n[Input]: " + s1 + ", " + t1 + "\n[Output]: " + IsomorphicStrings.isIsomorphic(s1, t1)
        )
        println(
            "[Expect]: " + expect2 + "\n[Input]: " + s2 + ", " + t2 + "\n[Output]: " + IsomorphicStrings.isIsomorphic(s2, t2)
        )
        if (expect1 == IsomorphicStrings.isIsomorphic(s1, t1) &&
            expect2 == IsomorphicStrings.isIsomorphic(s2, t2)) {
            println("[Result]: Success")
        } else {
            println("[Result]: Failed.")
        }
    }
}