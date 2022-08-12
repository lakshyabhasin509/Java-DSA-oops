package com.DSA.Graphs;
class PacificAtalnic {
    static int count=0;
    static int freshcount=0;
    static public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        boolean vis[][]= new boolean[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if( grid[i][j]==1 ){
                    freshcount++;
                }
            }}
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(!vis[i][j] && grid[i][j]==2 ){
                    dfs(i,j,grid,vis);
                }
            }
        }
        if(freshcount==0)return count;
        return -1;
    }
    static
    boolean dfs(int i,int j,int[][] grid,boolean[][] vis){

        if(i==grid.length || j==grid[0].length || i<0 ||j<0)return false;
        if(grid[i][j]==0)return false;
        if(vis[i][j])return false;


        vis[i][j]=true;

        boolean wasOrange=false;


        if(grid[i][j]==1){

            wasOrange=true;
            freshcount--;
            grid[i][j]=2;
        }


        if(grid[i][j]==2){

            boolean down= dfs(i+1,j,grid,vis);
            boolean up= dfs(i-1,j,grid,vis);
            boolean right= dfs(i,j+1,grid,vis);
            boolean left=dfs(i,j-1,grid,vis);

            if(down || left ||right||up){
                count++;
            }

        }

        return wasOrange;
    }

    public static void main(String[] args) {
        int a[][]={{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(a));
    }
}