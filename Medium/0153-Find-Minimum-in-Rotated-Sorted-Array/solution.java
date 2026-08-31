// ═══════════════════════════════════════════════════════
//  Problem  : 0153. Find Minimum in Rotated Sorted Array
//  URL      : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : August 31, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int findMin(int[] nums) {
        if (nums.length <=1) return nums[0];

        int left= 0 ; 
        int right =  nums.length-1 ;

        while (left< right){
            int  mid =  left+(right-left)/2;

            if (nums[right]< nums[mid]){
                left = mid+1;
            }else if(nums[left]> nums[mid]){
                right = mid;
            }else{
                return nums[left];
            }
        }
        return 1;
    }
}