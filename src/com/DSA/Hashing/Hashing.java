package com.DSA.Hashing;

import com.DSA.linkedlist.LinkedList;

//used for searching
//Linear Search - O(n)
//Binary Search -O(log n)
//let's do it in O(1) using hashing techniques
//mod 10 hashing with chaining;
public class Hashing extends LinkedList {

    private static final int size=10;
    private LinkedList arr[];
    public Hashing(){
     arr=new LinkedList[size];
    }
    public void insert(int n){
        arr[n%10].insertatHead(n);
    }
    public boolean hashSearch(int n){
        return arr[n%10].search(n);
    }
    


}
