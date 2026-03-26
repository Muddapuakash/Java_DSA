package com.linkedlist;

public class DeleteCase {

    // Node class
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Delete at beginning
    public ListNode deleteBeg(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        head = head.next;
        return head;
    }

    // Delete at position (1-based index)
    public ListNode deletePosi(ListNode head, int posi) {

        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        // Delete first node
        if (posi == 1) {
            return head.next;
        }

        ListNode ptr = head;

        // Traverse to (posi - 1)
        for (int i = 1; i < posi - 1; i++) {
            if (ptr.next == null) {
                System.out.println("Invalid position");
                return head;
            }
            ptr = ptr.next;
        }

        // Check if position is valid
        if (ptr.next == null) {
            System.out.println("Invalid position");
            return head;
        }

        // Delete node
        ListNode deleteEle = ptr.next;
        ListNode nextEle = deleteEle.next;

        ptr.next = nextEle;

        return head;
    }

    // Display list
    public void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at end (helper for testing)
    public ListNode insertEnd(ListNode head, int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) return newNode;

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {

        DeleteCase obj = new DeleteCase();
        ListNode head = null;

        // Creating list: 10 -> 20 -> 30 -> 40
        head = obj.insertEnd(head, 10);
        head = obj.insertEnd(head, 20);
        head = obj.insertEnd(head, 30);
        head = obj.insertEnd(head, 40);

        System.out.println("Original List:");
        obj.display(head);

        // Delete at beginning
        head = obj.deleteBeg(head);
        System.out.println("After deleting at beginning:");
        obj.display(head);

        // Delete at position 2
        head = obj.deletePosi(head, 2);
        System.out.println("After deleting at position 2:");
        obj.display(head);
    }
}