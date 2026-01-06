package org.example.singlyLinkedList;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
   Time complexity=O(n)
   Space complexity=O(1)
*/

public class InsertionAtEndOf_LL {
    Node head=null;
    Node current=null;
    public  void addNodeAtLast() {
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("Enter an integer value to add in LL -> Press -1 for exit");
            try{
                int value=sc.nextInt();
                if(value==-1)break;
                if(head==null){
                    head=new Node(value);
                    current=head;
                }
                else{
                   current.next=new Node(value);
                   current=current.next;
                }
            }catch(InputMismatchException e){
                sc.next();
                System.out.println("Enter only integer values");
            }
        }
    }
    public  void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
