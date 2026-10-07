// ═══════════════════════════════════════════════════════
//  Problem  : 0301. Remove Invalid Parentheses
//  URL      : https://leetcode.com/problems/remove-invalid-parentheses/?envType=daily-question&envId=2026-10-07
//  Difficulty : Hard
//  Language : Java
//  Runtime  : 1 ms
//  Memory   : 42.8 MB
//  Solved   : October 7, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> l = new ArrayList<>();

        if (s== null) return l;

        Queue<String> queue = new LinkedList<>();
        Set<String> set  = new HashSet<>();

        queue.offer(s);
        set.add(s);
        boolean found =false;

        while (!queue.isEmpty()){
            int size =  queue.size();

            for (int i = 0 ; i < size  ; i++){
                String ss = queue.poll();

                if (isValid(ss)){
                    l.add(ss);
                    found = true ;
                }

                if (found) continue ;

                for (int j = 0 ; j < ss.length(); j++){
                    char c = ss.charAt(j);

                    if (c!='(' && c != ')')continue;

                    String next =  ss.substring(0,j)+ ss.substring(j+1);
                    if (!set.contains(next)){
                        set.add(next);
                        queue.offer(next);
                    }
                }

            }
            if(found) break;

        }
        return l;

        
    }

    public boolean isValid(String s){
        int count = 0;
        for(char c :  s.toCharArray()){
            if (c=='(')count++;
            else if(c=='(')count--;
        }
        return count ==0;
    }
}