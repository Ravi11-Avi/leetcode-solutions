// ═══════════════════════════════════════════════════════
//  Problem  : 0567. Permutation in String
//  URL      : https://leetcode.com/problems/permutation-in-string/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : October 5, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> smap =  new HashMap<>();
        HashMap<Character, Integer> s2map = new HashMap<>();

        for (char c : s1.toCharArray())smap.put(c, smap.getOrDefault(c,0)+1);

        int l = 0 , r = s2.length() ; 

        while (r< s2.length()){
            s2map.put(s2.charAt(l), s2map.getOrDefault(s2.charAt(l),0)+1);
            s2map.put(s2.charAt(r), s2map.getOrDefault(s2.charAt(r),0)+1);

            if (smap.equals(s2map))return true;


            s2map.remove(s2.charAt(l++));
            s2map.remove(s2.charAt(r++));
            
        }
        return false;

    }
}