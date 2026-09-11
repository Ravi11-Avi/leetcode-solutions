// ═══════════════════════════════════════════════════════
//  Problem  : 0392. Is Subsequence
//  URL      : https://leetcode.com/problems/is-subsequence/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length()==0) return true;

        int spoint = 0 ;
        int tpointer= 0;


        while (tpointer< t.length()){
            if (s.charAt(spoint)== t.charAt(tpointer))spoint++;
            if (tpointer == s.length()-1) return true;

            tpointer++;
        }
        return false;
       
    }
}