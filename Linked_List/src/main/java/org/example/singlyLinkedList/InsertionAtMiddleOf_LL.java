package org.example.singlyLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
   Time complexity=O(n)
   Space complexity=O(1)
*/

public class InsertionAtMiddleOf_LL {
    Node head=null;

    public void addDummyNode(){
        head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(50);
        head.next.next.next=new Node(60);
        head.next.next.next.next=new Node(70);
    }
    public  void addNodeAtPosition()  {
        Scanner sc=new Scanner(System.in);
            try{
                System.out.println("Enter the position");
                int position=sc.nextInt();
                System.out.println("Enter the integer value");
                int value=sc.nextInt();
                Node add=new Node(value);
                 //Case 1 . Insertion At start
                if(position==1){
                    add.next=head;
                    head=add;
                    return;
                }

                    //Case 2 . Insertion At Middle or Last
                int count =1;
                Node temp=head;
                while (count < position-1 && temp!=null) {
                            temp = temp.next;
                            count++;
                        }
                    // case 3 . If Position given >LinkedList length
                    if(temp==null){
                        System.out.println("Please insert a position in range b/w 1-6");
                        return;
                    }else {
                        add.next = temp.next;
                        temp.next=add;
                        System.out.println("Linked List after adding integer at position : "+position);

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
