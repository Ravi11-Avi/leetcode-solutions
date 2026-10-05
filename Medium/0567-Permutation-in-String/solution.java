// ═══════════════════════════════════════════════════════
//  Problem  : 0567. Permutation in String
//  URL      : https://leetcode.com/problems/permutation-in-string/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : October 5, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> smap =  new HashMap<>();
        HashMap<Character, Integer> s2map = new HashMap<>();

        for (char c : s1.toCharArray())smap.put(c, smap.getOrDefault(c,0)+1);
        for (int i = 0; i < s1.length() - 1; i++) {
            s2map.put(s2.charAt(i), s2map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        int l = 0 , r = s1.length()-1 ; 

        while (r< s2.length()){
            if (smap.equals(s2map)) return true;


            char rightChar = s2.charAt(r);
            s2map.put(rightChar, s2map.getOrDefault(rightChar, 0) + 1);
            r++;
            char leftChar = s2.charAt(l);
            if (s2map.get(leftChar) == 1) {
                s2map.remove(leftChar); 
            } else {
                s2map.put(leftChar, s2map.get(leftChar) - 1); 
            }
            l++;
            
            
        }
        return smap.equals(s2map);

    }
}