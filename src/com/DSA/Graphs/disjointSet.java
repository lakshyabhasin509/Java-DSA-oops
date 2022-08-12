package com.DSA.Graphs;

import java.util.ArrayDeque;

public class disjointSet {
    int parent[];
    int size[];
    public static void main(String[] args) {


    }

    void make(int v){
        parent[v]=v;
        size[v]=1;
    }
    int find(int v){
        if(v==parent[v])return v;
    return find(parent[v]);
    }
    void union(int a,int b){
        a=find(a);
        b=find(b);
        if(a!=b){
            if(size[a]<size[b]){
                parent[a]=b;
                size[b]+=size[a];
            }
            else {
            parent[b]=a;
            size[a]+=size[b];
        }
        }
    }
}


