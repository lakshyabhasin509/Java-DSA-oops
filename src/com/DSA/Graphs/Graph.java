package com.DSA.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Graph using a Map<Integer,List<Integer>> instead of List<List<Integer>>
//in the map we can use a set instead of list just to not include duplicates by mistake
public class Graph<T> {
private Map<T , List<T>> adjList;

    public Graph() {


        adjList= new HashMap<>();
    }

    public Map<T, List<T>> getAdjList() {
        return adjList;
    }

    public void setAdjList(HashMap<T, List<T>> adjList) {
        this.adjList = adjList;
    }

    void addEdge(T u, T v, boolean directed){
//         create an edge from u to v
        if(adjList.get(u)!=null)
        adjList.get(u).add(v);
        else {
            adjList.put(u,new ArrayList<>());
            adjList.get(u).add(v);
        }

        if(!directed){
            if(adjList.get(v)!=null)
                adjList.get(v).add(u);
            else {
                adjList.put(v,new ArrayList<>());
                adjList.get(v).add(u);
            }
        }
    }
    void printAdjList(){
        System.out.println(adjList);
    }


}
