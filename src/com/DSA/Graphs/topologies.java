package com.DSA.Graphs;

import java.util.ArrayList;

public class topologies {

    public boolean starTopology(int V, int E, ArrayList<ArrayList<Integer>> adj)
    {
//        Conditions for a Star Topology ---
//       One node (also called the central node) has degree V – 1.
//        all nodes except the central node has degree 1
//        No of edges = No of Vertices – 1.


        if(E!=V-1)return false;

        int[] degree=new int[V];

        for (int i = 0; i < V; i++) {
            for(int v: adj.get(i)){
                degree[v]++;
            }
        }

        int count=0;
        int centralNode=0;
        for(int i=0;i<V;i++){
            if(degree[i]>=V)return false;

            if(degree[i]==1)count++;
            else centralNode=i;
        }
        if(count!=V-1)return false;

        if(degree[centralNode]!=V-1)return false;

        return true;
    }

    /*
    A graph of V vertices represents a Ring topology if it satisfies the following three conditions:

    Number of vertices >= 3.
    All vertices should have degree 2  .
    No of edges = No of Vertices.
     */
    public boolean ringTopology(int V,int E,ArrayList<ArrayList<Integer>> adj){

        if(V!=E)return false;
        if(V<3)return false;

        int []degree=new int[V];
        for (int i = 0; i < V; i++) {
            for(int v:adj.get(i))
            {
                degree[v]++;
            }
        }
        for (int i = 0; i < V; i++) {
            if(degree[i]!=2)return false;
        }
        return true;
    }
    /*
    A graph of V vertices represents a bus topology if it satisfies the following two conditions:


    Each node except the starting end ending ones has degree 2 while the starting and ending have degree 1.
    No of edges = No of Vertices – 1.
     */
    public boolean busTopology(int V,int E,ArrayList<ArrayList<Integer>> adj)
    {
        if(E!=V-1)return false;
        if(V==1)return true;

        int []degree=new int[V];
        for (int i = 0; i < V; i++) {
            for(int v:adj.get(i))
            {
                degree[v]++;
            }
        }

        int count1=0,count2=0;
        for (int i = 0; i <V ; i++) {
            if(degree[i]==2)count2++;
            if(degree[i]==1)count1++;
            else return false;

        }
        if(count2==2 && count1==V-2)return true;


        return false;
    }
}
