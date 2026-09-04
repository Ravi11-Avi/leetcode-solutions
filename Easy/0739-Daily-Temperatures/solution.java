// ═══════════════════════════════════════════════════════
//  Problem  : 0739. Daily Temperatures
//  URL      : https://leetcode.com/problems/daily-temperatures/submissions/2130940755/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 60 ms
//  Memory   : 107.5 MB
//  Solved   : September 4, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] result  =  new int[t.length];
        Stack<Integer> stack =  new Stack<>();

        for(int i = 0 ; i < t.length ; i ++){
            while (!stack.isEmpty() && t[stack.peek()]< t[i]){
                int pop =  stack.pop();
                result[pop] = i- pop;

            }
            stack.push(i);
        }

        return result ;
        
    }
}