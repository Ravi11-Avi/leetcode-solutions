// ═══════════════════════════════════════════════════════
//  Problem  : 0300. Longest Increasing Subsequence
//  URL      : https://leetcode.com/problems/longest-increasing-subsequence/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.4 MB
//  Solved   : September 9, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int lengthOfLIS(int[] nums) {
        int i =0 , j = 1;
        int max= Integer.MIN_VALUE;
        int count = 0;

        while (j< nums.length && i < nums.length ){
            if (nums[i]<nums[j]){
                count++;
                if (count> max)max = count;
                j++;
            }else{
                i =j;
                j++;
                count++;
            }
        }

        return max;
    }
}