// ═══════════════════════════════════════════════════════
//  Problem  : 0215. Kth Largest Element in an Array
//  URL      : https://leetcode.com/problems/kth-largest-element-in-an-array/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.3 MB
//  Solved   : September 5, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int findKthLargest(int[] nums, int k) {

        int ans = nums[0];
        
        PriorityQueue< Integer> hash = new PriorityQueue();

        for(int i: nums){
            hash.add(i);

            if(hash.size()>k){
                ans = hash.poll();
            }
        }

        return ans;
    }
}