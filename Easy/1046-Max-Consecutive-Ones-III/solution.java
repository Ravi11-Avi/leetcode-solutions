// ═══════════════════════════════════════════════════════
//  Problem  : 1046. Max Consecutive Ones III
//  URL      : https://leetcode.com/problems/max-consecutive-ones-iii/submissions/2143956861/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 6 ms
//  Memory   : 52.3 MB
//  Solved   : September 16, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 ,  maxconseq = 0 , max1freq = 0;


        int[] freq =  new int[2];

        for (int r = 0 ; r< nums.length ; r++){
            

            freq[nums[r]]++;

            max1freq = Math.max(max1freq , freq[1]);
            while ((r-l+1) -max1freq > k )freq[nums[l++]]--;

            maxconseq = Math.max(maxconseq, r-l+1);
            
        }
        return maxconseq;
    }
}