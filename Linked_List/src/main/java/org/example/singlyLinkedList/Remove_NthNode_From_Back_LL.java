package org.example.singlyLinkedList;
/*
   Time Complexity- O(n)
   Space Complexity- O(1)
 */
/*
   Given the head of a linked list, remove the nth node from the end of the list and return its head.
   Input: head = [1,2,3,4,5], n = 2
   Output: [1,2,3,5]


 */
public class Remove_NthNode_From_Back_LL {
    Node head=null;

    public void addDummyNode(){
        head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(50);
        head.next.next.next=new Node(60);
        head.next.next.next.next=new Node(70);
    }
    public void removeNthFromBack(int n){
        Node start=new Node(0);
        start.next=head;
      Node slow=start,fast=start;
      for(int i=0;i<=n;i++){
          fast=fast.next;
      }
      while(fast!=null){
          slow=slow.next;
          fast=fast.next;
      }
      slow.next=slow.next.next;
    }
    public  void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}
