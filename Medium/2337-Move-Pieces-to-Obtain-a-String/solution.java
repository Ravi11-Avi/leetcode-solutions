// ═══════════════════════════════════════════════════════
//  Problem  : 2337. Move Pieces to Obtain a String
//  URL      : https://leetcode.com/problems/move-pieces-to-obtain-a-string/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean canChange(String start, String target) {
        if (start.length() != target.length() )return false;
        int i = 0 ; 
        int j  =0;

        while (i< start.length() && j< target.length()){

            while (i < start.length() && start.charAt(i) == '_')  i++;
            while (j < target.length() && target.charAt(j) == '_') j++;

            if(start.charAt(i)!= target.charAt(j)) return false;
            i++;
            j++;

        
        }

        return true;
    }
}