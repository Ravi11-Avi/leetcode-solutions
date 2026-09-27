// ═══════════════════════════════════════════════════════
//  Problem  : 1807. Evaluate the Bracket Pairs of a String
//  URL      : https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/?envType=daily-question&envId=2026-09-26
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 43 MB
//  Solved   : September 27, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String evaluate(String s, List<List<String>> k) {

        Map<String, String> map = new HashMap<>();
        for (List<String> pair : k) {
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder sb =  new StringBuilder();
        StringBuilder news =  new StringBuilder();
        boolean open =  false;

        for (int i = 0 ; i < s.length(); i++){
            if(s.charAt(i)== '('){
                open = true ;
                continue;
            }else if (s.charAt(i)== ')'){
                open  =  false;
                boolean found = false;

                // for (int j = 0 ; j <k.size(); j++ ){
                //     if (k.get(j).get(0).equals(sb.toString())){
                //         news.append(k.get(j).get(1));
                //         found = true;
                //         break;
                //     }
                // }
                if (map.containsKey(sb.toString())){
                    news.append(map.get(sb.toString()));
                    found = true;
                }
                
                if (!found) {
                    news.append("?");
                }
                sb.setLength(0);

                continue;
            }

            if (open)sb.append(s.charAt(i));
            else news.append(s.charAt(i));
        }

        return news.toString();
        
    }
}