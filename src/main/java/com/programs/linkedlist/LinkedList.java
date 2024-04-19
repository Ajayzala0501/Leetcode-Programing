package com.programs.linkedlist;

public class LinkedList {

    Node head ;
    int size;
    private class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    public Node insertNode(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
        }else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
        size++;
        return head;
    }

    public void displayList(){
        Node display = head;
        while (display != null){
            System.out.println("Node Value"+display.val);
            display = display.next;
        }
    }

    public void removeDuplicate(){
        if(head != null){
            Node temp = head;
            while (temp.next != null){
                if(temp.val == temp.next.val){
                    temp.next = temp.next.next;
                }else {
                    temp = temp.next;
                }
            }
        }
    }

    public void removeLinkedListElement(int val){

        if(head != null){
            Node temp = head;
            while(temp.next != null){
                if(temp.next.val == val){
                    if(temp == head){
                        head = temp.next;
                    }
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }
        }
    }

    public int getSize(){
        return size;
    }
}
