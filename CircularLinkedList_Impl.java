package com.company;

public class CircularLinkedList_Impl {
    Node  head;
    Node tail;
    int size;

    public CircularLinkedList_Impl(){
        this.size = 0;
        head = null;
        tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);


    }

    public void display(){
        Node temp = head;
        if(temp != null) {
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }


    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args){
        CircularLinkedList_Impl cll = new CircularLinkedList_Impl();
        cll.insert(3);
        cll.insert(12);
        cll.insert(1);
        cll.insert(4);
        cll.insert(5);

        cll.display();

        cll.insert(6);
        cll.display();
        cll.delete(4);
        cll.display();

    }
}
