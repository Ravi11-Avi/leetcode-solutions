// ═══════════════════════════════════════════════════════
//  Problem  : 0383. Ransom Note
//  URL      : https://leetcode.com/problems/ransom-note/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42 MB
//  Solved   : November 21, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean canConstruct(String rn, String mg) {
        int[] ach  =  new int [26];
        int[] abc =  new int[26];

        for (char c : rn.toCharArray())ach[c- 'a']++;
        for (char c : mg.toCharArray())abc[c- 'a']++;

        for(int i = 0 ; i < 26 ; i++){
            if (ach[i]< abc[i])return false;
        }
        return true;
    }
}