// ═══════════════════════════════════════════════════════
//  Problem  : 3016. Minimum Number of Pushes to Type Word II
//  URL      : https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/?envType=daily-question&envId=2026-07-31
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.8 MB
//  Solved   : July 31, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int minimumPushes(String word) {
        HashMap<Character ,Integer> aaa = new HashMap<>();
        
        for (char ch : word.toCharArray()){
            aaa.put(ch,aaa.getOrDefault(ch,0)+1);
        }
        
        List<Integer> aa =  new ArrayList<>(aaa.values());

        int ans =0;
        int i = 1 ; 

        for (int a : aa){
            ans = (i/8)* a;
            i++;
        }

        return ans;
    }
}