// ═══════════════════════════════════════════════════════
//  Problem  : 0345. Reverse Vowels of a String
//  URL      : https://leetcode.com/problems/reverse-vowels-of-a-string/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String reverseVowels(String s) {
        
        char[] letter =  s.toCharArray();

        int l= 0 ,r = letter.length-1;

        HashSet<Character> ab  = new HashSet<>(Set.of('a','e','i','o','u','A','E','I','O','U'));

        while (l<r){
            while(!ab.contains(letter[l]))l++;
            while(!ab.contains(letter[r]))r--;

            char temp = letter[l];
            letter[l] =  letter[r];
            letter[r]= temp;
            l++;
            r--;
        }


        StringBuilder sb =  new StringBuilder();

        for (int i = 0 ; i < letter.length ; i ++){
            sb.append(letter[i]);
        }

        return sb.toString();
    }
}