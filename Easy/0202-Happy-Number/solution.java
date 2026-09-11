// ═══════════════════════════════════════════════════════
//  Problem  : 0202. Happy Number
//  URL      : https://leetcode.com/problems/happy-number/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.1 MB
//  Solved   : September 11, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set  = new HashSet<>();

        while(n!= 1 && !set.contains(n)){
            set.add(n);
            n = newNumber(n);

        }

        return n==1;
    }

    public int newNumber(int n ){
        int number = 0;
         while (n>0){
            int digit =  n%10 ;
            number =number*10 +(digit *digit);
            n /=10;
         }


         return number ;
    }
}