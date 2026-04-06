import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 99;i>90;i--){
            stack.push(i);
        }

        System.out.println("Size: " + stack.size());
        
        System.out.println("top element : " + stack.peek());
        System.out.println("removed : " + stack.pop());
        System.out.println("new top: " + stack.peek());

        System.out.println("index of 95 : " + stack.search(95));
        System.out.println("New Size: " + stack.size());

        System.out.println("is empty : " + stack.isEmpty());

    }
}
