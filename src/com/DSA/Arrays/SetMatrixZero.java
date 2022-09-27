package com.DSA.Arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class SetMatrixZero {
    public static void main(String[] args) {
        Solution ob=new Solution();
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        ob.setZeroes(arr);
        for (int a[]:
              arr) {
            System.out.println(Arrays.toString(a));
        }
    }

}

class Solution {
    class Pair{
        int r,c;
        Pair(int row,int col){
            r=row;
            c=col;
        }
    }
    public void setZeroes(int[][] matrix) {
        Queue<Pair> q=new ArrayDeque<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }

        while(!q.isEmpty()){
            Pair index=q.poll();
            for(int i=0;i<matrix.length;i++){
                matrix[i][index.c]=0;
            }
            for(int i=0;i<matrix[0].length;i++){
                matrix[index.r][i]=0;
            }
        }
    }
}