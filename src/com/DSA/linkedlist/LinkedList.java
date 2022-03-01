package com.DSA.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(int size) {
        this.size = size;
    }

//Recursive Insert without using tail or anything, although i will be updating the tail
    public void insertRec(int val,int index){
        if(index>size){
            System.out.println("Size of Linked list is "+ size+"\nAdd at "+size+" first");
            return;
        }
       head = insertRec(val,index,head);

    }
    public Node insertRec(int val,int index,Node node){

        if(index==0){
            size++;
            Node temp=new Node(val,node);
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }


    public void insert(int val,int index){
       if(index>size){
           System.out.println("Size of Linked list is "+ size+"\nAdd at "+size+" first");
           return;
       }
        if(index==0){insertatHead(val);
        return;}
        if(index==size){insertAttail(val);
        return;}
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
    }
    public void insertatHead(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)tail=node;
        size++;
    }
    public void insertAttail(int val){
        Node node =new Node(val);
        tail.next=node;
        tail=node;

        if(head==null)head=node;

        size++;
    }
public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
    System.out.println("null");
}
    public void deleteDuplicates(){
        deleteDuplicates(head);
    }
public void deleteDuplicates(Node head){
        if(head.next==null){
            tail=head;
            return;}
        if(head.value==head.next.value){
            head.next=head.next.next;
            size--;
            deleteDuplicates(head);
        }else
        deleteDuplicates(head.next);
}

public int deletehead(){
        int val=head.value;
        head=head.next;
        if(head==null)tail=null;
        size--;
        return val;
}
public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;

}
public int deleteTail(){

        if(size<=1)return deletehead();
        Node temp=getNode(size-2);
        int val=temp.next.value;

        temp.next=null;
        tail=temp;
        return val;
}
public int delete(int index){
    if(index>=size){
        System.out.println("Size of Linked list is "
                + size+"\nCannot delete at Index "
                +index+"\nAdd at "+size+" first");
        return -1;
    }
        if(index==0)return deletehead();
        if(index==size-1)return deleteTail();

        Node temp=getNode(index-1);
        int val=temp.next.value;
        temp.next=temp.next.next;
        return val;

}
public Node find(int val){
        Node temp=head;
        while (temp!=null){
            if(temp.value==val)return temp;

            temp=temp.next;
        }
        return null;
}

   private class Node{
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }


}


}
