package leetcode.`0205_Isomorphic-Strings`

class IsomorphicStrings {
    companion object {
        fun isIsomorphic(s: String, t: String): Boolean {
            val mapS = mutableMapOf<Char, Int>()
            val mapT = mutableMapOf<Char, Int>()
            for (i in 0 until s.length){
                if(mapS[s[i]] != mapT[t[i]] ) return false
                mapS[s[i]] = i
                mapT[t[i]] = i
            }
            return true
        }
    }
}