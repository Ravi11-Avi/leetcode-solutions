// ═══════════════════════════════════════════════════════
//  Problem  : 2762. Continuous Subarrays
//  URL      : https://leetcode.com/problems/continuous-subarrays/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.2 MB
//  Solved   : September 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public long continuousSubarrays(int[] nums) {
        
        int res =  nums.length* (nums.length +1)/2;

        return res-1;
    }
}