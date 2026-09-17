// ═══════════════════════════════════════════════════════
//  Problem  : 0862. Shortest Subarray with Sum at Least K
//  URL      : https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : September 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        
        int l = 0 , currentsum= 0 , max= -1;

        for(int r = 0 ; r < nums.length ; r++){
            currentsum +=nums[r];


            while(currentsum> k && l< r){
                currentsum-= nums[l];
                l++;
            }
                
                max= Math.max(max, r-l+1);


        }
        return max;

    }
}