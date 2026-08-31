// ═══════════════════════════════════════════════════════
//  Problem  : 0560. Subarray Sum Equals K
//  URL      : https://leetcode.com/problems/subarray-sum-equals-k/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.2 MB
//  Solved   : August 31, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int subarraySum(int[] nums, int k) {
    
        HashMap<Integer,Integer> map = new HashMap<>();
        int  count= 0;
        map.put(0, 1);
        int currsume = 0;


        for(int n :  nums){
            currsume += n ;
            if (map.containsKey(currsume-k)){
                    count +=map.get(currsume-k);
            }
            map.put(n , map.getOrDefault(n,0)+1);
        }

        return count;

    }
}