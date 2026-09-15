// ═══════════════════════════════════════════════════════
//  Problem  : 1493. Longest Subarray of 1's After Deleting One Element
//  URL      : https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.1 MB
//  Solved   : September 15, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int longestSubarray(int[] nums) {
        int[] freq = new int [2];
        int l = 0 , count = 0  ,  max1freq = 0 ; 

        for(int  r= 0 ;r< nums.length; r++){
            if (nums[r]==1)max1freq++;
            freq[nums[r]]++;

            while((r-l)-max1freq > 1){
                freq[nums[l]]--;
                l++;
            }

            count= Math.max(count,  r-l);
        }
        return count ;
    }
}