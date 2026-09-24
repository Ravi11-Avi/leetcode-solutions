// ═══════════════════════════════════════════════════════
//  Problem  : 3026. Maximum Good Subarray Sum
//  URL      : https://leetcode.com/problems/maximum-good-subarray-sum/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : September 24, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long  px = 0 , max= Long.MIN_VALUE;

        HashMap<Integer , Long> map  =  new HashMap<>();

        for (int n :  nums){
            if(!map.containsKey(n)){
                map.put(n,px );
            } 

            px+= n;

            if (map.containsKey(n+k))   {

                max = Math.max(max , px - map.get(n+k));
            }       
            if (map.containsKey(n-k))   {

                max = Math.max(max , px - map.get(n-k));
            }               
        
        }
        return max;
    }
}