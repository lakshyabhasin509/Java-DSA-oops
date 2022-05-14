package com.DSA.Graphs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graph<Integer> g=new Graph<>();
        System.out.println("Enter the number of Nodes");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the number of edges");
        int e=sc.nextInt();

        for (int i = 0; i < e; i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.addEdge(u,v,false);
            
        }

        g.printAdjList();
    }
}
