package com.DSA.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
    TODO :  Later :62 63 70 64 124 198 337 416 509 931
            https://leetcode.com/problems/subsets-ii/submissions/ (do this recursively)
*/
public class Subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();

        helprecursive(nums,0,temp,list);
        return list;
    }
    public void helprecursive(int[]arr, int i, List<Integer> temp, List<List<Integer>> list){
        if(i>=arr.length){
            List<Integer> t=new ArrayList<>(temp);
            list.add(t);
            return;}
//         skip adding
        helprecursive(arr,i+1,temp,list);
        List<Integer> t=new ArrayList<>(temp);
        t.add(arr[i]);
        helprecursive(arr,i+1,t,list);

    }
    public List<List<Integer>> subsetIter(int[] arr) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        list.add(new ArrayList<>());

        for (int i : arr) {
            int n = list.size();
            for (int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList<>(list.get(j));
                temp.add(i);
                list.add(temp);
            }
        }

        return list;
    }


    public List<List<Integer>> subsetIterDup(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<List<Integer>>();

        list.add(new ArrayList<>());

        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            int n=list.size();
            if(i>0 &&arr[i]==arr[i-1]){
                start=end+1;
            }
            end=n-1;
            for(int j=start;j<n;j++){
                List<Integer> temp=new ArrayList<>(list.get(j));
                temp.add(arr[i]);

                list.add(temp);
            }
        }
        return list;
    }
    public List<List<Integer>> subsetIterDuplic(int[] arr,int target) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        list.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            int n = list.size();
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = n - 1;
            for (int j = start; j < n; j++) {
                List<Integer> temp = new ArrayList<>(list.get(j));
                temp.add(arr[i]);

                list.add(temp);
            }
        }

        List<List<Integer>> newList = new ArrayList<>();
        for (List<Integer> i : list) {
            int sum = 0;
            for (int j : i) {
                sum += j;
            }
            if(sum==target)
            newList.add(i);

        }
    return newList;}
    }



