package org.example.singlyLinkedList;

public class DetectCycleIn_LL {
    Node head=null;

    public void addDummyNode(){
        head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(50);
        head.next.next.next=new Node(60);
        head.next.next.next.next=new Node(70);
    }

    public boolean detectCycleIn_LL(){
        if(head==null || head.next==null)return false;
        Node fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
    }

}
