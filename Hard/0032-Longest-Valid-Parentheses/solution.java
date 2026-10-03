// ═══════════════════════════════════════════════════════
//  Problem  : 0032. Longest Valid Parentheses
//  URL      : https://leetcode.com/problems/longest-valid-parentheses/?envType=daily-question&envId=2026-10-03
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : October 3, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int longestValidParentheses(String s) {

       if (s.length()<=1)return 0;
       int l = 0, r = 0, max = 0;

       for (int i= 0 ; i < s.length() ; i++){
            if (s.charAt(i)=='(')l++;
            else r++;

            if (l ==r )max=  Math.max(max, 2* r);
            else if (r > l){
                l=0;
                r=0;
            }
       } 

       return max;
    }
}