// ═══════════════════════════════════════════════════════
//  Problem  : 3347. Maximum Frequency of an Element After Performing Operations II
//  URL      : https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-ii/
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : October 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {

        int max = nums[0] , result = 0;
        for (int i :  nums)if (max< i)max = i;
        int[] freq =  new int[max+k]; 
        for(int i : nums)freq[i]++;

        for(int  i = 0; i < freq.length ; i++){
            int l = Math.max(0, i-k);
            int r = Math.min(freq.length-1 , i+k);

            int totalcon =  freq[r]- freq[l];
            int needcon =  totalcon - freq[i];

            int current =  freq[i] + Math.min(needcon,numOperations );

            result  =  Math.max(result ,  current);
        }

      return result ;
    }
}