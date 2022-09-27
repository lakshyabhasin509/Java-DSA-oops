package com.DSA.Queue;

import java.util.*;

public class TaskSchedular {

}
class Pair {
    int num,index;

    Pair(int n,int i) {
    num=n;
    index=i;
    }
}
class SolutionTask{
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character , Integer> map=new HashMap<>();

        for(char c:tasks){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }

        PriorityQueue<Integer> pQueue
                = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        Queue<Pair> q=new ArrayDeque<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet())
        {
            int val=entry.getValue();
            pQueue.add(val);
        }
        int time=0;

        while (!pQueue.isEmpty() || !q.isEmpty()){
            time++;
            if(!pQueue.isEmpty()){
            int val=pQueue.poll()-1;
            if(val!=0){
                q.add(new Pair(val , time+n));
            }}

            if(!q.isEmpty()){
            if(q.peek().index==time)
                pQueue.add(q.poll().num);
        }}
        return time;

    }
}
