package org.example.singlyLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
   Time complexity=O(n)
   Space complexity=O(1)
*/
public class Deletion_In_LL {
    Node head=null;

    public void addDummyNode(){
        head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(50);
        head.next.next.next=new Node(60);
        head.next.next.next.next=new Node(70);
    }
    public  void deleteNodeAtPosition()  {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the position");
            int position=sc.nextInt();

            //Case 1 . Deletion At start
            if(position==1){
                head=head.next;
                return;
            }

            int count =1;
            Node temp=head;
            while (count < position-1 && temp!=null) {
                temp = temp.next;
                count++;
            }
            // case 2 . If Position given >LinkedList length
            if(temp==null || temp.next == null){
                System.out.println("Please insert a position in range b/w 1-5");
                return;
            }else {
                temp.next=temp.next.next;
                System.out.println("Linked List after deleting integer at position : "+position);

            }



        }catch(InputMismatchException e){
            sc.next();
            System.out.println("Enter only integer values");
        }

    }

    public  void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
