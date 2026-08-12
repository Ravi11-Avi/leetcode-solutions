// ═══════════════════════════════════════════════════════
//  Problem  : 0130. Surrounded Regions
//  URL      : https://leetcode.com/problems/surrounded-regions/
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.7 MB
//  Solved   : August 12, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public void solve(char[][] board) {
        int row  = board.length ;
        int col =  board[0].length;


        for (int i = 0 ; i < row ; i++){
            if (board[i][0]=='0')dfs(i,0,board);
            if (board[i][col-1]=='0')dfs(i,0,board);
        }
        for (int i = 0 ; i < row ; i++){
            if (board[0][i]=='0')dfs(i,0,board);
            if (board[row-1][i]=='0')dfs(i,0,board);
        }

        for (int i = 0 ; i < row  ; i ++){
            for (int j = 0  ; j< col ; j++){
                if (board[i][j]== '0') board[i][j]='X';
                else if(board[i][j]=='U')board[i][j]='O';
            }
        }

       
        
    }

    public void dfs(int row , int col , char [][] board){
        if (row <0 || col < 0|| row >=board.length || col >= board[0].length || board[row][col]== 'X' )return;

        board[row][col]= 'U';

        dfs(row+1,col,board );
        dfs(row-1,col,board );
        dfs(row,col+1,board );
        dfs(row,col-1,board );
    }
}