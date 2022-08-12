package com.DSA.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n= sc.nextInt();
            int m= sc.nextInt();
            GraphWithWeights<Integer> graph=new GraphWithWeights<>(n);
            for (int i = 0; i < m; i++) {
                System.out.println("is the graph directed");
                boolean directed=sc.nextBoolean();
                int u= sc.nextInt();
                int v= sc.nextInt();
                int wieght=sc.nextInt();
                graph.addEdge(u,v,wieght,directed);
            }
            ArrayList<ArrayList<Pair>> list=graph.getList();
            int dist[]=dijkstra(0,list);

    }
    public static int[] dijkstra(int src,ArrayList<ArrayList<Pair>> list) {
        int dist[] = new int[list.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Pair> heap = new PriorityQueue<>();

        heap.add(new Pair(src, dist[src]));

//        while (!heap.isEmpty()) {
//            Pair<Integer>
//        }
        return new int[]{};
    }}
