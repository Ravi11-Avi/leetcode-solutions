// ═══════════════════════════════════════════════════════
//  Problem  : 1658. Minimum Operations to Reduce X to Zero
//  URL      : https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int minOperations(int[] nums, int x) {

        int currentSum = 0 , l = 0 , maxlen = -1;

        for (int r = 0; r < nums.length ; r++){
            currentSum=  nums[r];

            while  (currentSum > x && l<= r){
                currentSum -=nums[l];
                l++;
            }

            if(currentSum ==x ){
                maxlen = Math.max(maxlen ,  r-l+1);
            }


        }

                    return maxlen ==-1? -1: nums.length -maxlen;


        
    }
}