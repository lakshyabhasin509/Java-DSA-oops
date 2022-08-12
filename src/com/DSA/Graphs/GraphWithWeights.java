package com.DSA.Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Pair<T>{
    T value;
    int weight;

    Pair(T val,int w ){
        value=val;
        weight=w;
    }
}

public class GraphWithWeights<T> {


    ArrayList<ArrayList<Pair>> list;
    int n;

    public GraphWithWeights(int n) {

        this.n = n;
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());

        }
        System.out.println(n);
    }

    public ArrayList<ArrayList<Pair>> getList() {
        return list;
    }

    public void setList(ArrayList<ArrayList<Pair>> list) {
        this.list = list;
    }


    //    Represented as arrayList
    public void addEdge(T u, T v,int weight,boolean directed) {
        list.get((Integer) u).add(new Pair(v,weight));

        if (!directed)
            list.get((Integer) v).add(new Pair(u,weight));

    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];

//        for(int i=0;i<V;i++){
//            if(vis[i]==false){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        vis[0] = true;

        while (!q.isEmpty()) {
            int n = q.poll();
            bfs.add(n);
            for (int j : adj.get(n)) {

                if (!vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }


        return bfs;
    }
}
