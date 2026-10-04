// ═══════════════════════════════════════════════════════
//  Problem  : 3346. Maximum Frequency of an Element After Performing Operations I
//  URL      : https://leetcode.com/problems/maximum-frequency-of-an-element-after-performing-operations-i/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : October 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int currmax = nums[0];
        int result =0;

        for (int i :  nums)if (currmax < i)currmax = i;

        int[] freq = new int[currmax +k+1];

        for (int i : nums )freq[i]+=1;
        for(int i = 1 ; i< freq.length ; i++)freq[i] += freq[i-1];

        for(int i : nums){
            int l = Math.max(0, i - k);
            int r = Math.min(freq.length - 1, i + k);

            int totalcon = freq[r] - (l > 0 ? freq[l - 1] : 0);
            int needxon = totalcon - (freq[i] - (i > 0 ? freq[i - 1] : 0));

            int aa =  Math.min(needxon,numOperations);


            result = Math.max(result ,aa);
        }
        return result;
        
        
    }
}