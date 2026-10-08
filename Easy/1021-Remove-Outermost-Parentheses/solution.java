// ═══════════════════════════════════════════════════════
//  Problem  : 1021. Remove Outermost Parentheses
//  URL      : https://leetcode.com/problems/remove-outermost-parentheses/?envType=daily-question&envId=2026-10-08
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : October 8, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String removeOuterParentheses(String s) {
        return s.substring(1,s.length()-2);
    }
}