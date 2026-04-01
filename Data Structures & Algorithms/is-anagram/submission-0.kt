class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length){
            return false
        }

        var charCountMap = mutableMapOf<Char,Int>()

        for(char in s){
            charCountMap[char] = (charCountMap[char] ?: 0) + 1
        }

        for(char in t){
            if(charCountMap.contains(char) && charCountMap[char]!! > 0){
                charCountMap[char] = charCountMap[char]!! - 1
            }else{
                return false
            }
        }

        return true
    }
}
