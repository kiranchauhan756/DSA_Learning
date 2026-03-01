package org.example.singlyLinkedList;

  

public class MergeTwoSortedLL {
    public Node mergeTwoLists(Node list1, Node list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;

        if(list1.value>list2.value){
            Node temp=list1;
            list1=list2;
            list2=temp;
        }
        Node res=list1;
        while(list1!=null && list2!=null){
            Node tmp=null;
            while(list1!=null && list1.value<=list2.value){
                tmp=list1;
                list1=list1.next;
            }
            tmp.next=list2;

            Node tmpp=list1;
            list1=list2;
            list2=tmpp;
        }

        return res;
    }
}
