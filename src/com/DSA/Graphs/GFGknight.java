package com.DSA.Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class GFGknight {
}

class KnightTime
{
    class Pair{
        int r,c;
        Pair(int row,int col){
            row=r;
            col=c;
        }
    }  public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
{
    int[][]moves={{2,-1},{2,1},{-1,2},{1,2},{-2,-1},{-2,1},{-1,-2},{1,-2}};
    boolean[][]vis=new boolean[N][N];
    Queue<Pair> qu=new ArrayDeque<>();
    qu.add(new Pair(KnightPos[0]-1,KnightPos[1]-1));
    int count=0;

    while(!qu.isEmpty()){
        Pair temp=qu.poll();
        int r=temp.r,c=temp.c;
        vis[r][c]=true;

        for(int[]move:moves){
            int row=r+move[0],col=c+move[1];
            if(row<0 ||col<0 ||row>=N || col>=N)continue;
            if(!vis[row][col]){
                qu.add(new Pair(row,col));
            }
            if(row==TargetPos[0]-1 && col==TargetPos[1]-1)
            {
                count++;
                return count;
            }
        }count++;
    }return -1;

}
}