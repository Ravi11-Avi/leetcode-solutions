// ═══════════════════════════════════════════════════════
//  Problem  : 0443. String Compression
//  URL      : https://leetcode.com/problems/string-compression/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.9 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int compress(char[] chars) {

        int l = 0 , r = 0;
       while (l != chars.length){
        int count = 0;
        char cc =  chars[l];


        while(l< chars.length && chars[l]== cc){
            l++;
            count++;
        }
        chars[r]= cc;
        r++;

        if (count> 1){ 
            for (char c: Integer.toString(count).toCharArray()){
                chars[r]= c;
                r++;
            }

        }
       }
       return r;
       
    }
}