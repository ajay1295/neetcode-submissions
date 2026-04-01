class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val tempArray = mutableListOf<Int>()
        nums.forEach{
            if(tempArray.contains(it))
                return true

            tempArray.add(it)    
        }
        return false
    }
}
