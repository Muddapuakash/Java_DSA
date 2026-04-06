import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for(int i =1; i<=5;i++){
            queue.add(i);
            queue.offer(i*10 + i);
        }

        System.out.println(queue);
        System.out.println("remove top element : " + queue.poll());
        System.out.println("remove top element : " + queue.remove());
        System.out.println("fetch top element : " + queue.peek());
        System.out.println("fetch top element : " + queue.element());
        System.out.println(queue);
        System.out.println("is Empty : " + queue.isEmpty());
        System.out.println("size : " + queue.size());


    }
}
