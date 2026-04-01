class Solution {
    fun longestConsecutive(nums: IntArray): Int {

        if(nums.isEmpty()) return 0

        val numSet = nums.toSet()
        var longestStreak = 0

        for(num in numSet){
            if(num - 1 !in numSet){
                var currentNum = num
                var currentStreak = 1

                while(currentNum+1 in numSet){
                    currentNum++
                    currentStreak++
                }
                
                longestStreak = maxOf(longestStreak, currentStreak)
            }
        }

        return longestStreak
    }
}
