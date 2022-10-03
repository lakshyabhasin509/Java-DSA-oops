package com.DSA.linkedlist;

public class DesignLinkedList {
        class Node{
            int val;
            Node next;

            Node(int v, Node n){
                val=v;
                next=n;
            }
        }

        Node head,tail;
        int size;

        public DesignLinkedList() {

            head=null;
            tail=null;
            size=0;
        }

        public int get(int index) {
            if(index+1 > size)return -1;
            if(index==0)return head.val;
            Node temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.val;
        }

        public void addAtHead(int val) {
            if(head==null){
                head=new Node(val,null);
                tail=head;
            }
            else{
                Node temp=new Node(val,head);
                head=temp;
            }
            size++;
        }

        public void addAtTail(int val) {
            if(tail==null){
                tail=new Node(val,null);
                head=tail;
            }
            else {
                Node temp=new Node(val,null);
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        public void addAtIndex(int index, int val) {
            if(index==0){
                addAtHead(val);
                return;
            }
            if(index==size){
                addAtTail(val);
                return;
            }

            Node prev=null;
            Node temp=head;
            for(int i=0;i<index;i++){
                prev=temp;
                temp=temp.next;
            }
            Node t=new Node(val,temp);
            prev.next=t;

        }

        public void deleteAtIndex(int index) {
            if(index==0){
                head=head.next;
                return;
            }
            Node prev=null;
            Node temp=head;
            for(int i=0;i<index;i++){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;

            size--;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

