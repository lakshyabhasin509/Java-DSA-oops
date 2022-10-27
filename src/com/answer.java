package com;

import javax.swing.text.html.HTMLDocument;
import java.net.Inet4Address;
import java.util.*;

public class answer {
    List<Integer> solve(List<Integer> locations, List<Integer> movedFrom, List<Integer> movedTo){
        HashSet<Integer> set=new HashSet<>();

        for(int i:locations){
            set.add(i);
        }
        for(int i=0;i<movedFrom.size();i++){
            int val=movedFrom.get(i);
            if(set.contains(val)){
                set.remove(val);
                set.add(movedTo.get(i));
            }
        }        List<Integer> ans=new ArrayList<>();


        Iterator<Integer> itr= set.iterator();

        while (itr.hasNext()){
            ans.add(itr.next());

        }
        Collections.sort(ans);

        return ans;
    }

    public long findMaximumSum(List<Integer> stockPrice,int k){
        int start=0,end=0;
        int n=stockPrice.size();

        int sum=0,max=0;
        if(k>n)return -1;
        for (int i = 0; i < k-1; i++) {
            if( stockPrice.get(i).equals(stockPrice.get(i+1)))return -1;
        }
       while (end<n){
            if(end-start<k) {

                sum += stockPrice.get(end);
                if(end > start && stockPrice.get(end).equals(stockPrice.get(end-1))){
                    start=end+1;
                    sum=0;
                }

                end++;
                max = Math.max(max, sum);
            }
            else{
                if(stockPrice.get(end).equals(stockPrice.get(end-1))){
                    start=end;
                    sum=0;
                }
                else {
                    sum-=stockPrice.get(start);
                    start++;

                }

            }
        }
       return max;
    }

    public static void main(String[] args) {
        answer a=new answer();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(7);
        list.add(3);
        list.add(6);

        System.out.println(  a.findMaximumSum(list,3));
    }

}
