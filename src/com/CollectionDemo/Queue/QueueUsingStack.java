import java.util.Stack;

public class QueueUsingStack {
    
    static Stack<Integer> input = new Stack<>();
    static Stack<Integer> output = new Stack<>();
    
    public static void push(int val){
        input.push(val);
    }

    public static int peek(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.peek();
    }
    public static int pop(){
        peek();
        return output.pop();
    }

    public static boolean isEmpty(){
        return input.isEmpty() && output.isEmpty();
    }

    public static int size(){
        return input.size() + output.size();
    }

    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            push(i);
            push(i*10+i);
        }

        System.out.println("remove top element : " + pop());
        System.out.println("remove top element : " + pop());
        System.out.println("fetch top element : " + peek());
        System.out.println("is Empty : " + isEmpty());
        System.out.println("size : " + size());;
    }
    
}
