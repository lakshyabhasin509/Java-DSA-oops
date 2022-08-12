package com.DSA.Graphs;

import java.util.*;


public class networkDelay {
    class Pair{
        int node;
        int weight;

        Pair(int n,int w){
            node=n;
            weight=w;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<Pair> graph[]=new ArrayList[n+1];


        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            graph[u].add(new Pair(v,w));
        }

        int dist[] = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;





        return 0;

    }
}
