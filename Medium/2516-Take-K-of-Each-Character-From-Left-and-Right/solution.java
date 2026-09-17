// ═══════════════════════════════════════════════════════
//  Problem  : 2516. Take K of Each Character From Left and Right
//  URL      : https://leetcode.com/problems/take-k-of-each-character-from-left-and-right/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.9 MB
//  Solved   : September 17, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int takeCharacters(String s, int k) {
        HashMap<Character, Integer> totalMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            totalMap.put(c, totalMap.getOrDefault(c, 0) + 1);
        }

            if (totalMap.getOrDefault('a', 0) < k || 
            totalMap.getOrDefault('b', 0) < k || 
            totalMap.getOrDefault('c', 0) < k) {
            return -1;
        }

        HashMap<Character, Integer> map =  new HashMap<>();

        int  l = 0  , maxWIND = 0;

        for (int  r = 0 ;r< s.length() ; r++){

            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0)+1);
            

            while(totalMap.getOrDefault('a',0)- map.getOrDefault('a',0)< k ||
            totalMap.getOrDefault('b',0)- map.getOrDefault('b',0)< k||
            totalMap.getOrDefault('c',0)- map.getOrDefault('c',0)< k){
                map.put(s.charAt(l), map.get(s.charAt(l))-1);
                l++;


            }
            
            
            maxWIND =  Math.min(maxWIND, r-l+1);

            
            


        }
          return s.length() - maxWIND;

        
    }
}