// ═══════════════════════════════════════════════════════
//  Problem  : 2938. Separate Black and White Balls
//  URL      : https://leetcode.com/problems/separate-black-and-white-balls/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.6 MB
//  Solved   : September 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public long minimumSteps(String s) {
       int i = 0 ;
       int j = s.length()-1 ;
       long count= 0;

       char[] arr=  s.toCharArray();

       while(i< j){

                while (i < j && arr[i] == '0')i++;
                while (i < j && arr[j] == '1')j--;
            
                if (i<j){
                    char temp =  arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                    count+= (i-j);
            }
            i++;
            j--;
                


            
       } 

       return count;
    }
}