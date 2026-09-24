// ═══════════════════════════════════════════════════════
//  Problem  : 3026. Maximum Good Subarray Sum
//  URL      : https://leetcode.com/problems/maximum-good-subarray-sum/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.3 MB
//  Solved   : September 24, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int  l = 0 , max= 0;

        for (int r = 0 ;r<nums.length ; r++){


            if (Math.abs(nums[r]- nums[l])==k){
                int sum = 0;
                for (int i = r ; i<= l ; i-- )sum += nums[i];
                max =  Math.max(max, sum);

            }

            
                
        
        }
        return max;
    }
}