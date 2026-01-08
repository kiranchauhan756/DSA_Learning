package org.example.doublyLinkedList;
/*
   Doubly Linked List real life example-browser using navigation
 */
public class DoublyLL_Node {
    int value;
    DoublyLL_Node prev;
    DoublyLL_Node next;

    DoublyLL_Node(int value){
        this.value=value;
    }

    public DoublyLL_Node(int value, DoublyLL_Node prev) {
        this.value = value;
        this.prev = prev;
    }
}
