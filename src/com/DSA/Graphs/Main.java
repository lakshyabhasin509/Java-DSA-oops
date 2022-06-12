package com.DSA.Graphs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of Nodes");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Graph<Integer> g=new Graph<>(n);

        System.out.println("Enter the number of edges");
        int e=sc.nextInt();

        for (int i = 0; i < e; i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.AddEdge(u,v,false);

        }

        ArrayList<ArrayList<Integer>> list=g.getList();
//        System.out.println(list);
        ArrayList<Integer> bfs=g.bfsOfGraph(n,list);
        System.out.println(bfs);

    }

    }

