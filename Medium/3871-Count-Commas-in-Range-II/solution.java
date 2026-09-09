// ═══════════════════════════════════════════════════════
//  Problem  : 3871. Count Commas in Range II
//  URL      : https://leetcode.com/problems/count-commas-in-range-ii/?envType=daily-question&envId=2026-09-09
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 41.7 MB
//  Solved   : September 9, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public long countCommas(long n) {
    
       long ans = 0; 

       for (int i = 1000 ; i <= n ;){
            ans+= (n-i+1);
            
            if(i> Long.MAX_VALUE/1000) break;

            i*=1000;
       }

       

       
    return ans;
    }

}