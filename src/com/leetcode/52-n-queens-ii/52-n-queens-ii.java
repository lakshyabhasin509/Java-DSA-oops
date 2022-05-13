package com.leetcode

class Solution {
    public int totalNQueens(int n) {
       
       boolean[][] board=new boolean[n][n];
    return queens(board,0);
    }
    int queens(boolean[][] board,int row){
        if(row==board.length){
        
            return 1;
        }
        
        int count=0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){

            board[row][col]=true;
            count+=queens(board,row+1);
            board[row][col]=false;
            }
        }
        return count;
    }
    boolean isSafe(boolean [][]board,int row,int col){
//         check vertical row 
        
        for(int i=0;i<row;i++){

            if(board[i][col]){
                return false;
            }
        }
//         check diagonal left
        
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i])return false;
        }
        int maxright=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i])return false;
        }
        return true;
    }
}