class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result = mutableMapOf<Int,Int>()
        
        for(num in nums){
            result[num] = result.getOrDefault(num, 0) + 1
        }
        val sorted = result.entries.sortedByDescending { it.value }

        return sorted.take(k).map {it.key}.toIntArray()  
    }
}
