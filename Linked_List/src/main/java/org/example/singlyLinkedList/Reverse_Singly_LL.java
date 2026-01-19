package org.example.singlyLinkedList;
/*
   Given the head of a singly linked list, reverse the list, and return the reversed list.
   Input: head = [1,2,3,4,5]
   Output: [5,4,3,2,1]
 */

/*
    Time Complexity= O(n)
    Space Complexity= O(1)
 */
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
