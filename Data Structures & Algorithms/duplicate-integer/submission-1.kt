class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val tempArray = hashSetOf<Int>()
        nums.forEach{
            if(tempArray.contains(it))
                return true

            tempArray.add(it)    
        }
        return false
    }
}
