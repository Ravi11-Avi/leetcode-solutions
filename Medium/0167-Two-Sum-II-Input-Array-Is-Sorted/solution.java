// ═══════════════════════════════════════════════════════
//  Problem  : 0167. Two Sum II - Input Array Is Sorted
//  URL      : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : September 10, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] twoSum(int[] num, int target) {
        HashMap <Integer, Integer> map =  new HashMap<>();
       

        for (int i = 0 ; i< num.length ; i++ ){
            int c =  target-  num[i];

            if (map.containsKey(c)){
                return new int[]{num[i],c};
            }

            map.put(num[i], c);
        }

        return new int[]{};
    }
}