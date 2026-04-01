class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val tempArray = HashSet<Int>()
        for(num in nums){
            if(!tempArray.add(num)) return true
        }
        return false
    }
}
