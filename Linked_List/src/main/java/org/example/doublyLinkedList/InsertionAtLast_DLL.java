package org.example.doublyLinkedList;


import java.util.InputMismatchException;
import java.util.Scanner;

/* Time Complexity=O(n)
   Space Complexity-O(n)
*/

public class InsertionAtLast_DLL {
    DoublyLL_Node head;

    public void addDummyNode(){
        head=new DoublyLL_Node(30);
        head.next=new DoublyLL_Node(40,head);
        head.next.next=new DoublyLL_Node(50,head.next);
        head.next.next.next=new DoublyLL_Node(60,head.next.next);
        head.next.next.next.next=new DoublyLL_Node(70,head.next.next.next);
    }
    public void insertionInDll(){
        Scanner sc=new Scanner(System.in);
            try{
                System.out.println("Enter the position");
                int position=sc.nextInt();
                System.out.println("Enter the integer value");
                int data=sc.nextInt();
                if(data==-1)return;
                DoublyLL_Node newNode=new DoublyLL_Node(data);

                //Case 1. Insertion At Start
                if(position==1) {
                    head.prev=newNode;
                newNode.next=head;
                head=newNode;
                return;
                }
                //Case 2 . Insertion At Middle or Last
                int count=1;
                DoublyLL_Node temp=head;
                while(count<position-1 && temp!=null){
                    temp=temp.next;
                    count++;
                }
                // case 3 . If Position given > DoublyLinkedList length
                if(temp==null){
                    System.out.println("Please insert a position in range b/w 1-6");
                    return;
                }else {
                    System.out.println(temp.prev);
                    newNode.prev=temp.prev;
                    newNode.next = temp;
                    //System.out.println(newNode.next.value+" "+newNode.prev.value);
                    System.out.println("DoublyLinked List after adding integer at position : "+position);

                }
            }catch(InputMismatchException e){
                sc.next();
                System.out.println("Enter only integer values");
            }
        }

//    public void printReverseDLL(){
//        DoublyLL_Node temp=current;
//        while(temp!=null){
//                     System.out.print(temp.value+" ");
//            temp=temp.prev;
//        }
//        System.out.println();
//    }
    public void printDLL(){
        DoublyLL_Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
