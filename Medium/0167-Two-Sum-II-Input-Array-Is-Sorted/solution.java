// ═══════════════════════════════════════════════════════
//  Problem  : 0167. Two Sum II - Input Array Is Sorted
//  URL      : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/2137326458/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 9 ms
//  Memory   : 50 MB
//  Solved   : September 10, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] twoSum(int[] num, int target) {
        HashMap <Integer, Integer> map =  new HashMap<>();
       

        for (int i = 0 ; i< num.length ; i++ ){
            int c =  target-  num[i];

            if (map.containsKey(c)){
                return new int[]{map.get(c)+1,i+1};
            }

            map.put(num[i], i);
        }

        return new int[]{};
    }
}