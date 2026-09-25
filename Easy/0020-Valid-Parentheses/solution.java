// ═══════════════════════════════════════════════════════
//  Problem  : 0020. Valid Parentheses
//  URL      : https://leetcode.com/problems/valid-parentheses/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : September 25, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for (char c :  s.toCharArray()){
            if (c == '{'|| c=='(' || c=='[')stack.push(c);
            else if (c== '}'){
                if (stack.isEmpty() && stack.peek()!= '{')return false;
                stack.pop();

            }else if (c== ']'){
                if (stack.isEmpty() &&stack.peek()!= '[')return false;
                stack.pop();

            }else if (c== ')'){
                if (stack.isEmpty() && stack.peek()!= '(')return false;
                stack.pop();

            }

           
        }
         return stack.isEmpty();
    }
}