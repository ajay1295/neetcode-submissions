class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            val complement = target - nums[i]
            if(map.contains(complement)){
                return intArrayOf(map[complement]!!, i)
            }

            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum found for given target")
    }
}
