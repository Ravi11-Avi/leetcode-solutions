// ═══════════════════════════════════════════════════════
//  Problem  : 0905. Sort Array By Parity
//  URL      : https://leetcode.com/problems/sort-array-by-parity/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length -1;
        while (l< r){
            if (nums[l]%2 !=0){

                if (nums[l]%2 ==0){
                    int temp  =  nums[l];
                    nums[l++]=  nums[r];
                    nums[r--]= temp ;

                }
                else{
                    r--;
                }
                
            }
            else{
                l++;
            }
            
        }

        return nums;

        
    }
}