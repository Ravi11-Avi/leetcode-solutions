// ═══════════════════════════════════════════════════════
//  Problem  : 0347. Top K Frequent Elements
//  URL      : https://leetcode.com/problems/top-k-frequent-elements/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 1 ms
//  Memory   : 43.3 MB
//  Solved   : September 5, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length  <=1 ) return nums;

        HashMap<Integer,Integer> map =  new HashMap<>();

        for (int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> maxHeap =  new PriorityQueue<>((a,b)->map.get(a)- map.get(b));

        maxHeap.addAll(map.keySet());


        int[] result  =  new int[k];

        for (int i = 0 ;  i< k ; i++ ){
            result[i]= maxHeap.poll();
        }
        return result ;


        
    }
}