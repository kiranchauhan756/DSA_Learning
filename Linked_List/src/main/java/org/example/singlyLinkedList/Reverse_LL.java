package org.example.singlyLinkedList;

public class Reverse_LL {
    Node head=null;

    public void addDummyNode(){
        head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(50);
        head.next.next.next=new Node(60);
        head.next.next.next.next=new Node(70);
    }
    public void reverseLinkedList(){
         Node temp=head;
         while(temp.next!=null){
             temp=temp.next;
         }
    }
}
