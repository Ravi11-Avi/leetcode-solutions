// ═══════════════════════════════════════════════════════
//  Problem  : 0079. Word Search
//  URL      : https://leetcode.com/problems/word-search/?envType=problem-list-v2&envId=depth-first-search
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.5 MB
//  Solved   : August 29, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean exist(char[][] board, String word) {
        int row =  board.length;
        int col =  board[0].length;
         for(int i = 0  ; i < row ; i++){
            for (int j = 0 ; j <col ; j++ ){
                if(dfs(board ,word,  i , j , 0 )){
                    return true;
                }
                
            }
         }
         return false;
    }

    public static boolean dfs(char[][] board, String word ,  int cr ,int  cc ,int idx){

        if (idx == word.length())return true;


        if (cr< 0 || cr>= board.length || cc< 0 || cc>= board[0].length ||board[cr][cc]!= word.charAt(idx)) return false ;

        char temp = board[cr][cc];
        board[cr][cc]= '#';
        

        boolean  found =dfs(board ,word,  cr+1, cc , idx+1 )||
                        dfs(board ,word,  cr-1, cc , idx+1 )||
                        dfs(board ,word,  cr, cc+1 , idx+1 )||
                        dfs(board ,word,  cr, cc-1 , idx+1 );

        board[cr][cc] =  temp;
        
        return found;
    }
}