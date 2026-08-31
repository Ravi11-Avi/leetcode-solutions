// ═══════════════════════════════════════════════════════
//  Problem  : 0560. Subarray Sum Equals K
//  URL      : https://leetcode.com/problems/subarray-sum-equals-k/submissions/2125775033/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 23 ms
//  Memory   : 49 MB
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
            map.put(currsume , map.getOrDefault(currsume,0)+1);
        }

        return count;

    }
}