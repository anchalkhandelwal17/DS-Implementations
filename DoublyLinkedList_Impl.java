package com.company;

public class DoublyLinkedList_Impl {
    Node head;
   // Node tail;
    int size;

    public DoublyLinkedList_Impl(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        Node node = new Node(val);
        last.next = node;
        node.prev = last;
        node.next = null;
        size++;
    }

    public void insert(int after, int val){
        Node previous = find(after);
        if(previous == null){
            System.out.println("Value not present in the list");
            return;
        }
        Node node = new Node(val);
        node.next = previous.next;
        node.prev = previous;
        previous.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
        size++;
    }
    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayRev(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList_Impl dll = new DoublyLinkedList_Impl();

        dll.insertFirst(8);
        dll.insertFirst(9);
        dll.insertFirst(4);
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);

        dll.display();
        dll.insertFirst(6);
        dll.display();
        dll.insertLast(5);
        dll.display();
        dll.insertLast(7);
        dll.display();
        dll.insert(1, 10);
        dll.display();
    }
}
