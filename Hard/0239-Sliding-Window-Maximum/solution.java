// ═══════════════════════════════════════════════════════
//  Problem  : 0239. Sliding Window Maximum
//  URL      : https://leetcode.com/problems/sliding-window-maximum/
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        

        int l = 0 ;
        int r = k;

        int[] result =  new int[nums.length -k +1];
        int idx= 0 ;

        while(r <= nums.length){

            int max =  Integer.MIN_VALUE; 
            for(int i = l ; i< r ; i++)max = Math.max(max,nums[i]);

            result[idx++]= max; 
            l++;
            r++;
            
        

        }
        return result;
    }
}