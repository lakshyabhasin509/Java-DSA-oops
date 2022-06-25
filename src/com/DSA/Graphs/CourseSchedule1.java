package com.DSA.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class CourseSchedule1 {
  public static void main(String[] args) {
    Solution ob=new Solution();
    int arr[][]={{1,3},{2,3},{3,4},{3,5},{4,5},{0,1},{0,2}};
    int ans[]=ob.findOrder(6,arr);
    for (int i:ans) {
      System.out.print(i+" ");
    }
  }
}
class Solution {
  boolean[]vis;
  boolean[]dfsvis;
  int arr[];
  int c;
  public int[] findOrder(int numCourses, int[][] prerequisites) {
    vis=new boolean[numCourses];
    dfsvis=new boolean[numCourses];
    arr=new int[numCourses];
    c=0;
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    for(int i=0;i<numCourses;i++){
      adj.add(new ArrayList<>());
    }
    for(int i=0;i<prerequisites.length;i++){
      int u=prerequisites[i][0];
      int v=prerequisites[i][1];
      adj.get(u).add(v);
    }

    for(int i=0;i<numCourses;i++){
      if(!vis[i])
        if(!dfs(i,adj))return new int[]{};
    }
    return arr;
  }
  boolean dfs(int V,ArrayList<ArrayList<Integer>> adj){
    vis[V]=true;
    dfsvis[V]=true;

    for(int i:adj.get(V)){
      if(!vis[i]){
        if(!dfs(i,adj))return false;
      }
      else if(dfsvis[i])return false;
    }

    dfsvis[V]=false;
    arr[c++]=V;
    return true;
  }
}
