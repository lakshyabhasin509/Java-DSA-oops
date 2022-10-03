package com.DSA.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        SolutionMat ob=new SolutionMat();
        System.out.println(  ob.searchMatrix(new int[][]{{1,3}},3));
    }
}
class SolutionMat {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start=0;
        int end=matrix.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]>=target){
                return searchRow(matrix[mid],target);
            }
            else if(target<matrix[mid][0]){
                end=mid-1;
            }
            else start=mid+1;
        }
        return false;
    }
    public boolean searchRow(int []row,int target){
        int start=0;
        int end=row.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(target==row[mid]){
                return true;
            }
            else if(target<row[mid]){
                end=mid-1;
            }
            else start=mid+1;
        }
        return false;
    }
}
// https://leetcode.com/problems/search-a-2d-matrix/submissions/