// ═══════════════════════════════════════════════════════
//  Problem  : 2390. Removing Stars From a String
//  URL      : https://leetcode.com/problems/removing-stars-from-a-string/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.4 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String removeStars(String s) {
        ArrayList<Character> c  =  new ArrayList<>();

        for (char ss :  s.toCharArray()){
            c.add(ss);
        }

        for( int i = 0 ; i < c.size()-1; i++){
            if (c.get(i)== '*'){
                c.remove(i);
                if (i>=1){
                    c.remove(i-1);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char l :  c){
            sb.append(l);
        }

        return sb.toString();
    }
}