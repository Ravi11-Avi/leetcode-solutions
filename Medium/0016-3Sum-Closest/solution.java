// ═══════════════════════════════════════════════════════
//  Problem  : 0016. 3Sum Closest
//  URL      : https://leetcode.com/problems/3sum-closest/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.7 MB
//  Solved   : September 10, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int threeSumClosest(int[] nums, int t) {
        
        int closer  = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length-2; i ++){
            int l = i+1;
            int r = nums.length-1;

            while (l< r){

                int sum  = nums[l]+ nums[i]+ nums[r];
                if (closer>Math.abs(t-sum))closer = Math.abs(t-sum);


                if (sum> t)r--;
                else l++;

            }
        }
        return closer;
    }
}