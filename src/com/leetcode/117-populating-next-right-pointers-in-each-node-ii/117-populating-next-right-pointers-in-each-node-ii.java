package com.leetcode/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
   
    Queue<Node> q=new ArrayDeque<>();

    q.add(root);
        Node ptr;
    while(!q.isEmpty()){
       

        int len=q.size();
        for(int i=0;i<len;i++){

            ptr=q.remove();
           if(len-i==1)ptr.next=null;
            else ptr.next=q.peek();
            
            if(ptr.left!=null)
            q.add(ptr.left);
            if(ptr.right!= null)
            q.add(ptr.right);


         
        }
    }

    return root;
    }
}