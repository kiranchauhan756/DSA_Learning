package org.example.singlyLinkedList;

public class Reverse_Singly_LL {
    Node head=null;

    public void addDummyNode(){
        head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(50);
        head.next.next.next=new Node(60);
        head.next.next.next.next=new Node(70);
    }
    public void reverseSinglyLL(){
        Node next=null,prev=null,current=head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public  void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
