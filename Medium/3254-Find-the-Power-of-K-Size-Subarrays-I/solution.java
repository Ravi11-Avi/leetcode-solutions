// ═══════════════════════════════════════════════════════
//  Problem  : 3254. Find the Power of K-Size Subarrays I
//  URL      : https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int l = 0 ,r = k ; 
        int[] results = new int[nums.length - k + 1];
        int idx = 0;

        while (r<= nums.length){
            boolean ca=  true;
            for(int i = l+1 ; i <r ; i++){
                if (nums[i-1]+1!= nums[i]){
                    ca= false;
                    break;
                }
            }
            if (ca){
                results[idx++]= nums[r];
            }else{
                results[idx++]= -1;
            }
            l++;
            r++;
        }
        return results;
    }
}