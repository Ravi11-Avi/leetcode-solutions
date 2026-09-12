// ═══════════════════════════════════════════════════════
//  Problem  : 0151. Reverse Words in a String
//  URL      : https://leetcode.com/problems/reverse-words-in-a-string/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.9 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String reverseWords(String s) {
        
        String[] word =  s.trim().split("\\s+");

        StringBuilder sb =  new StringBuilder();

        for (int i = word.length-1 ; i >=0; i--){
            if (i!=0){
                sb.append(" ");
            }
            sb.append(word[i]);
        }


        return sb.toString();
    }
}