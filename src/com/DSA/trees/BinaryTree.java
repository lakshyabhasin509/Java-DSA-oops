package com.DSA.trees;

import java.util.*;

public class BinaryTree {
    TreeNode root;

    protected class TreeNode{

        int data;
        TreeNode left;
        TreeNode right;


        public TreeNode() {
            this.data=0;
            this.left=null;
            this.right=null;
        }

        public TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
BinaryTree(int root){
        this.root=new TreeNode(root);
}

void createTree(){

    Queue<TreeNode> queue=new ArrayDeque<>();
    queue.add(root);
    Scanner sc=new Scanner(System.in);
    while(!queue.isEmpty()){
        TreeNode p=queue.remove();
        System.out.println("Enter left child of "+ p.data);
        int val=sc.nextInt();
        if(val!=-1){
            TreeNode temp=new TreeNode(val);
            p.left=temp;
            queue.add(temp);
        }
        System.out.println("Enter right child of "+ p.data);
        val=sc.nextInt();
        if(val!=-1){
            TreeNode temp=new TreeNode(val);
            p.right=temp;
            queue.add(temp);
        }

    }

}
    void preorder(){
        preorder(root);
    }
void preorder(TreeNode r){
        if(r==null)return;

    System.out.print(r.data);
    preorder(r.left);
    preorder(r.right);
}
    void postorder(){
        postorder(root);
    }

void postorder(TreeNode r){
        if(r==null)return;

        postorder(r.left);
        postorder(r.right);

    System.out.println(r.data);
}
    void inorder(){
        inorder(root);
    }
void inorder(TreeNode r){
        if(r==null)return;
        inorder(r.left);
    System.out.println(r.data);
        inorder(r.right);

}
void levelOrder() {
    List<List<Integer>> list=levelOrder(root);
    System.out.println(list);
}
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();

        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();

            int len=q.size();
            for(int i=0;i<len;i++){



                if(q.peek().right!=null)
                    q.add(q.peek().right);
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                temp.add(q.remove().data);
            }
            list.add(temp);
        }
        return list;
    }
    public void levelOrderBottom(){
        List<List<Integer>> list=levelOrderBottom(root);
        System.out.println(list);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> q=new ArrayDeque<>();

        Stack<List<Integer>> stack=new Stack<>();
        if(root==null)return list;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> temp=new ArrayList<>();

            int len=q.size();
            for(int i=0;i<len;i++){

                if(q.peek().left!=null)
                    q.add(q.peek().left);

                if(q.peek().right!=null)
                    q.add(q.peek().right);

                temp.add(q.remove().data);

            }
            stack.add(temp);
        }

        while(!stack.isEmpty())
            list.add(stack.pop());

        return list;
    }


}