package com.DSA.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CheckBipertite {
    public static void main(String[] args) {
        System.out.println("Enter the number of Nodes");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Graph<Integer> g=new Graph<Integer>(n);


        System.out.println("Enter the number of edges");
        int e=sc.nextInt();

        for (int i = 0; i < e; i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.addEdge(u,v,false);

        }
//        [1,2,3],[0,2],[0,1,3],[0,2]

        ArrayList<ArrayList<Integer>> list=g.getList();
        System.out.println(isBipertite(n,list));
    }

   static boolean isBipertite(int V,ArrayList<ArrayList<Integer>> adjList){
        int vis[]=new int[V];
        Arrays.fill(vis,-1);

        for (int i = 0; i < V; i++) {
            if (vis[i]==-1) {
                if (dfsHelp(i, vis,adjList,0))return true;
            }
        }
return false;

    }
  static boolean dfsHelp(int node,
                         int[] visited,
                         ArrayList<ArrayList<Integer>> adj, int color){
        visited[node]=color;

        for(int i : adj.get(node)){
            if(visited[i]==-1){
                if(!dfsHelp(i,visited,adj,color^1))return false;
            } else if (visited[i]==color) {
                return false;
            }
        }
return true;
}
}
