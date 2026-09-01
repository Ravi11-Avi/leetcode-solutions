// ═══════════════════════════════════════════════════════
//  Problem  : 0049. Group Anagrams
//  URL      : https://leetcode.com/problems/group-anagrams/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : September 1, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String, List<String>> map =  new HashMap<>();

        for(String s : strs){
            int[] avl = new int[26];
            for (char c : s.toCharArray()){
                avl[c-'a']++;
            }
 
            StringBuilder sb  = new StringBuilder();
            for (int i : avl){
                sb.append('#');
                sb.append(i);
            }

            String sss =  sb.toString();
            if(!map.containsKey(sss)){
                map.put(sss, new ArrayList<>());
            }

            map.get(sss).add(s);
        }

        return new ArrayList<>(map.values());
    }
}