// ═══════════════════════════════════════════════════════
//  Problem  : 0713. Subarray Product Less Than K
//  URL      : https://leetcode.com/problems/subarray-product-less-than-k/submissions/2141862976/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 3 ms
//  Memory   : 48.6 MB
//  Solved   : September 14, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int count = 0 ,product =1 ,left = 0 ; 

        for (int right  = 0 ; right < nums.length ; right ++){
            product *=nums[right];

            while (product >= k && left <= right){
                product /= nums[left];
                left++;
            }
            count += (right-left +1);
        }

        return count ;
    }
}