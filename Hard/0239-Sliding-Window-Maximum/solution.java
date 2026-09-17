// ═══════════════════════════════════════════════════════
//  Problem  : 0239. Sliding Window Maximum
//  URL      : https://leetcode.com/problems/sliding-window-maximum/
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.9 MB
//  Solved   : September 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        

        int[] result =  new int[nums.length -k +1];
        int idx= 0 ;
        ArrayDeque<Integer> deque =  new ArrayDeque<>();


        for(int r = 0 ; r < nums.length ; r++){
            
            while(!deque.isEmpty() && nums[deque.peekLast()]< nums[r]){
                deque.pollLast();
            }

            deque.offerLast(r);

            if(deque.peekFirst()<r-k+1){
                deque.pollFirst();
            }
            if(r>= k-1){
               result[idx++]= nums[deque.peekFirst()]; 


            }

              
        

        }
        return result;
    }
}