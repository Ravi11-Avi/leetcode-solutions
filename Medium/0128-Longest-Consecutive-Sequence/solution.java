// ═══════════════════════════════════════════════════════
//  Problem  : 0128. Longest Consecutive Sequence
//  URL      : https://leetcode.com/problems/longest-consecutive-sequence/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 1 ms
//  Memory   : 42.5 MB
//  Solved   : September 2, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int curcount = 0;
        int max =  0;

        for(int i = 0 ; i < nums.length ; i++){
            if (nums[i]==nums[i]-1){
                curcount++;
            }else{
                curcount=0;
            }
            if (max< curcount)max=curcount;
        }
        return max;
    }
}