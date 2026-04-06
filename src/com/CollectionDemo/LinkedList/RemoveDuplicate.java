public class RemoveDuplicate {
    public static Node remove(Node head){
        Node current = head;
        while(current != null && current.next!=null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

        /* 2Pointer logic
        Node slow = head;
        Node fast  = head;

        while(fast!=null){
            if(slow.val != fast.val){
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;*/

        return head;
    }

    public static void main(String[] args) {
       
       //creating nodes  
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(3);
        Node n5 = new Node(3);
        Node n6 = new Node(3);

        //linking
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = null;
        Node head = n1;

        remove(head);

        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
    }
}
