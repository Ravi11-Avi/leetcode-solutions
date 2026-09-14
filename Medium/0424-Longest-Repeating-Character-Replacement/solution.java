// ═══════════════════════════════════════════════════════
//  Problem  : 0424. Longest Repeating Character Replacement
//  URL      : https://leetcode.com/problems/longest-repeating-character-replacement/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.2 MB
//  Solved   : September 14, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq =  new int[126];
        int maxfreq = 0, left = 0, maxWind = 0;

        for (int r = 0 ; r< s.length(); r++){
            freq[s.charAt(r)-'A']++;

            maxfreq = Math.max(maxfreq, freq[s.charAt(r)-'A'] );

            if (maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            maxWind = Math.max(maxWind, r-left+1);
        }

        return maxWind;

    }
}