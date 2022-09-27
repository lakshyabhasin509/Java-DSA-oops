package com.DSA.Heaps;

import java.util.*;

public class FindKClosestElements {

    class Pair implements Comparator<Pair>{
        int dist;
        int value;
        Pair(){}

        Pair(int d,int v)
        {
            dist=d;
            value=v;
        }

        @Override
        public int compare(Pair o1, Pair o2) {
            if(o1.dist<o2.dist)return 1;
            if(o1.dist>o2.dist)return -1;
            return 0;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int []dist=new int[arr.length];
        List<Integer> list=new ArrayList<>();
        Queue<Pair> qu=new PriorityQueue<>(k,new Pair());
        for(int i=0;i<arr.length;i++)
        {
            dist[i]=Math.abs(arr[i]-x);
        }
        for(int i=0;i<arr.length;i++)
        {
            qu.add(new Pair(dist[i],arr[i]));
            if(qu.size()>k){
                qu.poll();
            }
        }

        for(Pair i:qu){
            list.add(i.value);
        }
        return list;
    }
}
