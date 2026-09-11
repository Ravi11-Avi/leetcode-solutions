// ═══════════════════════════════════════════════════════
//  Problem  : 1598. Crawler Log Folder
//  URL      : https://leetcode.com/problems/crawler-log-folder/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        
        for (String  s :  logs){
            if (s == "../"){
                count--;

            }else if (s ==  "./"){

            }else{
                count++;
            }

        }
        return count;
    }
}