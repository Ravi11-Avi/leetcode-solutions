// ═══════════════════════════════════════════════════════
//  Problem  : 0229. Majority Element II
//  URL      : https://leetcode.com/problems/majority-element-ii/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : July 29, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer, Integer > map = new HashMap<>();
        List<Integer> aa  =  new ArrayList<>();
        int maxVAL = nums[0];
        for (int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int threshold = nums.length / 3;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                aa.add(entry.getKey());
            }
        }

        return aa;
    }
}