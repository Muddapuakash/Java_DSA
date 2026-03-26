package com.linkedlist;

class Linkedlist {
    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Delete at specific position
    void deleteAtPosition(int position) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Delete first node
        if (position == 1) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Traverse to (position - 1)
        for (int i = 1; i < position - 1; i++) {
            if (temp.next == null) {
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        // If next node is null → invalid position
        if (temp.next == null) {
            System.out.println("Invalid position");
            return;
        }

        // Delete node
        temp.next = temp.next.next;
    }
    // Display list
    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Main method
    public static void main(String[] args) {

        Linkedlist list = new Linkedlist();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Linked List:");
        list.display();

        list.deleteAtBeginning();
        System.out.println("After deleting at beginning:");
        list.display();

        list.deleteAtEnd();
        System.out.println("After deleting at end:");
        list.display();
        
        
        list.deleteAtPosition(2); // delete 3rd node

        System.out.println("After deleting at position 3:");
        list.display();
    }
}