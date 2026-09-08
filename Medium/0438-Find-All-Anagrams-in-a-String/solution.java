// ═══════════════════════════════════════════════════════
//  Problem  : 0438. Find All Anagrams in a String
//  URL      : https://leetcode.com/problems/find-all-anagrams-in-a-string/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.4 MB
//  Solved   : September 8, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (s.length ()< p.length()) return arr;

        int l=0,r=0;
        int[] freq= new int[26];
        for (int i =0; i<p.length() ; i++){
           freq[ p.charAt(i)-'a'] ++;
        }
        int[] window =  new int[26];


        while ( r< s.length() ){
            window[s.charAt(r)-'a']++;

            if (l-r+1 == p.length()){
                arr.add(l);
                l++;
            }
            window[s.charAt(r)-'a']--;

            r++;

        }
        return arr;
    }
}