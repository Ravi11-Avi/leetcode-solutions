// ═══════════════════════════════════════════════════════
//  Problem  : 0026. Remove Duplicates from Sorted Array
//  URL      : https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int j =1;


        for (int i = 1 ; i< nums.length ; i++){
            if ( nums[i]!=  nums[i-1]){
                nums[j]= nums[i];
                j++;
            }
        }
        return j;
    }
}