// ═══════════════════════════════════════════════════════
//  Problem  : 0209. Minimum Size Subarray Sum
//  URL      : https://leetcode.com/problems/minimum-size-subarray-sum/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.9 MB
//  Solved   : September 13, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0,  min = 0 , currentsum = 0;
        

        while (r< nums.length && l< nums.length){
             currentsum += nums[r];
            if (currentsum>=target){
                if (r-l< min)min = r-l;
                currentsum -= nums[l++];
            }else r++;          
        }

        return min;
    }
}