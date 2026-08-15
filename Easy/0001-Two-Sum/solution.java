// ═══════════════════════════════════════════════════════
//  Problem  : 0001. Two Sum
//  URL      : https://leetcode.com/problems/two-sum/submissions/2108190875/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 45 ms
//  Memory   : 46.9 MB
//  Solved   : August 16, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0 ; i<nums.length ; i++){
            for (int j = i+1 ;  j<nums.length ;  j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
        
    }
}
