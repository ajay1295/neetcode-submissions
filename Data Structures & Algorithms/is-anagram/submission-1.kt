class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val charCounts = mutableMapOf<Char, Int>()

        for (char in s.lowercase()) {
            charCounts[char] = (charCounts[char] ?: 0) + 1
        }

        for (char in t.lowercase()) {
            val count = charCounts[char] ?: 0
            if (count == 0) {
                return false 
            }
            charCounts[char] = count - 1
        }

        return true
    }
}
