// ═══════════════════════════════════════════════════════
//  Problem  : 2916. Subarrays Distinct Element Sum of Squares II
//  URL      : https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/?envType=daily-question&envId=2026-10-16
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.2 MB
//  Solved   : October 16, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int sumCounts(int[] nums) {
        int n  =  nums.length;
        long sum= 0;
        long MOD = 1_000_000_007;

        for(int i = 0 ; i< n ;i++){
            HashSet<Integer> set =  new HashSet<>();

            for(int j =i; j< n ; j++){
                set.add(nums[j]);
                long r =  set.size();
                sum= (sum+( r*r))%MOD;

            }
        }
        return (int)sum;
    }
}