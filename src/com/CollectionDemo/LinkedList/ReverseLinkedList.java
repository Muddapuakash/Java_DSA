public class ReverseLinkedList {
    public static Node reverseList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node previous = null;
        Node current = head;

        while (current != null) {
            Node after = current.next; // store next
            current.next = previous;   // reverse link
            previous = current;        // move previous
            current = after;           // move current
        }

        return previous; // new head
    }

    public static void main(String[] args) {
        //creating nodes  
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //linking
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        Node head = n1;

        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println();

        head = reverseList(head);

        ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }

    }
}
