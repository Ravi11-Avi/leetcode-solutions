// ═══════════════════════════════════════════════════════
//  Problem  : 2461. Maximum Sum of Distinct Subarrays With Length K
//  URL      : https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashSet<Integer> set =  new HashSet<>();
        int  l = 0  , currentsum = 0 , uniquenum = 0 ;
        int maxres  = 0 ; 

        for (int r= 0 ; r < nums .length  ; r ++){


            if (!set.contains(nums[r])){
                set.add(nums[r]);
                currentsum += nums[r];
                uniquenum++;
            }else{
                continue;
            }

            while (uniquenum > k && l< r) {
                currentsum -=nums[l];
                l++;
            }
            maxres =  Math.max(maxres, r-l+1);

            

        }
        return maxres;
        
    }
}