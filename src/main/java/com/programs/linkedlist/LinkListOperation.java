package com.programs.linkedlist;

public class LinkListOperation {
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.insertNode(1);
        ll.insertNode(2);
        ll.insertNode(6);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(6);
        //ll.removeDuplicate();
        ll.removeLinkedListElement(6);
        ll.displayList();
    }
}
