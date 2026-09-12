// ═══════════════════════════════════════════════════════
//  Problem  : 2938. Separate Black and White Balls
//  URL      : https://leetcode.com/problems/separate-black-and-white-balls/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public long minimumSteps(String s) {

        long totalbal = 0;

        long bb = 0;

        for (int i = 0 ; i< s.length(); i ++){
            if (s.charAt(i)=='1'){
                bb++;

            }else{
                totalbal += bb;
            }
        }
        return totalbal;
        
    }
}