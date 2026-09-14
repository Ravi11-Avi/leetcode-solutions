// ═══════════════════════════════════════════════════════
//  Problem  : 0713. Subarray Product Less Than K
//  URL      : https://leetcode.com/problems/subarray-product-less-than-k/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43 MB
//  Solved   : September 14, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0 ,product =1 ,left = 0 ; 

        for (int right  = 0 ; right < nums.length ; right ++){
            product *=nums[right];

            if (product >= k && left < right){
                product /= nums[left];
                left++;
            }
            count += (right-left +1);
        }

        return count ;
    }
}