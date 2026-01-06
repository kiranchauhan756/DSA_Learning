package org.example;

import org.example.singlyLinkedList.Deletion_In_LL;


public class Main {
    public static void main(String[] args) {
//        InsertionAtStartOf_LL insertionAtStartOfLl=new InsertionAtStartOf_LL();
//        insertionAtStartOfLl.addNodeAtStart();
//        insertionAtStartOfLl.printLinkedList();
//
//        InsertionAtEndOf_LL insertionAtEndOfLl=new InsertionAtEndOf_LL();
//        insertionAtEndOfLl.addNodeAtLast();
//        insertionAtEndOfLl.printLinkedList();


//        InsertionAtMiddleOf_LL insertionAtMiddleOfLl=new InsertionAtMiddleOf_LL();
//        insertionAtMiddleOfLl.addDummyNode();
//        System.out.println("Initial Linked List ");
//        insertionAtMiddleOfLl.printLinkedList();
//        insertionAtMiddleOfLl.addNodeAtPosition();
//        insertionAtMiddleOfLl.printLinkedList();

        Deletion_In_LL deletionInLl=new Deletion_In_LL();
        deletionInLl.addDummyNode();
        deletionInLl.printLinkedList();
        deletionInLl.deleteNodeAtPosition();
        deletionInLl.printLinkedList();
    }
}