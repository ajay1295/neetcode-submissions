class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size-1

        while(left < right){
            val currentSum = numbers[left]+numbers[right]
            when{
                currentSum == target -> return intArrayOf(left+1,right+1) 
                currentSum < target -> left++ 
                else -> right --
            }
        }
        return intArrayOf(-1,-1)
    }
}
