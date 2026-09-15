// ═══════════════════════════════════════════════════════
//  Problem  : 1438. Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
//  URL      : https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.2 MB
//  Solved   : September 15, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int l = 0 , currentres = 0 , count= 0;
        int sum = 0;

        int[] val =  new int[nums.length];

        for (int r= 0 ; r< nums.length ; r++){
             sum += nums[r];

             while (sum> limit || r-l> 2){
                sum -=nums[l];
                l++;
             }


            count += Math.max(count, r-l+1);
        }

        return count;
    }
}