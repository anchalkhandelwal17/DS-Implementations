package com.company;

public class LinkedList_Impl {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList_Impl(){
        this.size = 0;
    }

    private class Node{

        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head;
        head = node;

         if(tail == null){
             tail = head;
         }
         size++;
    }

    public void insertLast(int val){
        if(tail == null){
             insertFirst(val);
             return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int val, int idx){
        if(idx == 0) {
            insertFirst(val);
            return;
        }
        else if(idx == size){
            insertLast(val);
            return;
        }


        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        int val = tail.val;

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

        size--;
        return val;
    }

    public int delete(int idx){
        if(idx == 0){
            return deleteFirst();
        }
        else if(idx == size-1){
            return deleteLast();
        }
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;

        return val;
    }

    public Node find(int val){
        Node node = head;

        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList_Impl ll = new LinkedList_Impl();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertFirst(40);
        ll.insertFirst(50);
        ll.insert(5, 0);

        ll.display();
        ll.deleteFirst();
        ll.display();
        ll.deleteLast();
        ll.display();
//        ll.deleteLast();
//        ll.display();
        ll.delete(2);
        ll.display();

    }
}
