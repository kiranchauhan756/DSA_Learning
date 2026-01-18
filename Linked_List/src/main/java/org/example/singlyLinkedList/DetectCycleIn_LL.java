package org.example.singlyLinkedList;

/*
   There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
   Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
   Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */

/*
   Time Complexity - O(n)
   Space Complexity - O(1)
 */
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
