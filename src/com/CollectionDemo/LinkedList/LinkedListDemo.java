public class LinkedListDemo {

    public static void traverse(Node head){
        Node ptr = head;

        while(ptr != null){
            System.out.print(ptr.val+" -> ");
            ptr = ptr.next;
        }
    }

    public static Node insertFirst(Node head, int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        return head;
    }

    public static Node insertPos(Node head, int val, int pos){
        Node node = new Node(val);

        Node ptr = head;
        for(int i=1; i<pos-1;i++){
            ptr = ptr.next;
        }
        node.next = ptr.next;
        ptr.next = node;

        return head;
    }

    public static Node insertLast(Node head, int val){
        Node node = new Node(val);

        Node ptr = head;
        while(ptr.next !=null){
            ptr = ptr.next;
        }
        ptr.next = node ;
        node.next = null;

        return head;
    }

    public static Node deleteFirst(Node head){
        head = head.next;
        return head;
    }

    public static Node deletePos(Node head, int pos){
        Node ptr = head;

        for(int i = 1; i<pos-1;i++){
            ptr=ptr.next;
        }

        ptr.next = ptr.next.next;

        return head;
    }

    public static Node deleteLast(Node head){
        Node ptr = head;

        while(ptr.next.next!= null){
            ptr = ptr.next;
        }
        ptr.next = null;

        return head;
    }
    public static void main(String[] args) {
       /*
       //creating nodes  
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //linking
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        Node head = n1;

        //iterate
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }*/
        Node head = null;
        head = LinkedListDemo.insertFirst(head, 14);
        head = LinkedListDemo.insertFirst(head, 13);
        head = LinkedListDemo.insertFirst(head, 12);
        head = LinkedListDemo.insertFirst(head, 11);

        head = LinkedListDemo.insertPos(head, 21, 2);
        head = LinkedListDemo.insertPos(head, 22, 3);
        head = LinkedListDemo.insertPos(head, 23, 4);

        head = LinkedListDemo.insertLast(head, 31);
        head = LinkedListDemo.insertLast(head, 32);
        LinkedListDemo.traverse(head);
        System.out.println();

        head = LinkedListDemo.deleteLast(head);
        head = LinkedListDemo.deleteFirst(head);
        head = LinkedListDemo.deletePos(head, 3);

        LinkedListDemo.traverse(head);
        
    }
}
