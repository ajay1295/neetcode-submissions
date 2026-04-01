class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val temp = HashSet<Int>()

        for(num in nums){
            if(!temp.add(num)){
                return true
            }
        }

        return false
    }
}

