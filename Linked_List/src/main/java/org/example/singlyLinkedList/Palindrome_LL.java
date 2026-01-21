package org.example.singlyLinkedList;

public class Palindrome_LL {

    Node head=null;

    public void addDummyNode(){
        head=new Node(1);
        head.next=new Node(2);
//        head.next.next=new Node(3);
//        head.next.next.next=new Node(2);
//        head.next.next.next.next=new Node(1);
    }

    public void checkPalindrome(){
        Node temp=head,revHead=null;
        while(temp!=null) {
            Node newNode = new Node(temp.value);
            newNode.next=revHead;
            revHead=newNode;
            temp=temp.next;
        }
        temp=head;
        while(revHead!=null){
            if(revHead.value!=temp.value){
                System.out.println("Linked List is not palindrome");break;
            }
            else{
                revHead=revHead.next;
                temp=temp.next;
            }
        }
    }
}
