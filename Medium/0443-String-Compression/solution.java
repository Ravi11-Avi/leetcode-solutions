// ═══════════════════════════════════════════════════════
//  Problem  : 0443. String Compression
//  URL      : https://leetcode.com/problems/string-compression/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int compress(char[] chars) {
       HashMap <Character,  Integer> map =  new HashMap <>();

       for(int i = 0 ; i< chars.length ; i ++){
            map.put(chars[i], map.getOrDefault(chars[i],0)+1); 
       }
       StringBuilder sb =  new StringBuilder();


       for (char  c : map.keySet()){
            if (map.get(c)== 1) sb.append(c);
            else{
                sb.append(c);
                sb.append(  map.get(c));

            }         
       }
       return sb.length();
       

       
    }
}