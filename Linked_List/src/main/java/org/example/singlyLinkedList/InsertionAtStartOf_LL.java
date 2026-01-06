package org.example.singlyLinkedList;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
   Time complexity=O(1)
   Space complexity=O(1)
*/

public class InsertionAtStartOf_LL {
    Node head=null;
    Scanner sc=new Scanner(System.in);

    public  void addNodeAtStart() {

         while(true){
             System.out.println("Enter an integer value to add in LL -> Press -1 for exit");
             try{
                 int value=sc.nextInt();
                 if(value==-1)break;
                    else {
                     Node newNode = new Node(value);
                     newNode.next = head;
                     head = newNode;
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
