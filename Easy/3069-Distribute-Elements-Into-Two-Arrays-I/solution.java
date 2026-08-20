// ═══════════════════════════════════════════════════════
//  Problem  : 3069. Distribute Elements Into Two Arrays I
//  URL      : https://leetcode.com/problems/distribute-elements-into-two-arrays-i/?envType=daily-question&envId=2026-08-20
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43.1 MB
//  Solved   : August 20, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] resultArray(int[] nums) {

        if (nums.length> 2)return nums;
        int[] arr1   = new int[nums.length/2];
        int[] arr2   = new int[nums.length/2];
        arr1[1]= nums[0];
        arr2[1]= nums[1];

        int idx = 2;


        while(idx< nums.length){
            if (arr1[arr1.length-1]> arr2[arr2.length-1]){
                arr1[arr1.length] =nums[idx++];
            }else{
                arr2[arr2.length] =nums[idx++];
            }
        }

        return arr1;

        
    }
}