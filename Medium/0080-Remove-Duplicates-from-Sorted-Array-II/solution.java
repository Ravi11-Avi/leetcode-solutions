// ═══════════════════════════════════════════════════════
//  Problem  : 0080. Remove Duplicates from Sorted Array II
//  URL      : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43.1 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int removeDuplicates(int[] nums) {
        

        if(nums.length <= 2){
            return nums.length;
        }
        int  j = 2;

        for (int i = 2 ; i< nums.length ;i++){
            if (nums[i]!= nums[i-2]){
                nums[j]= nums[i];
                j++;
            }
        }
        return j;
        
    }
}   