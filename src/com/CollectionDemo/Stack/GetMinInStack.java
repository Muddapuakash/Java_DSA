import java.util.Stack;

public class GetMinInStack {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>(); 
    
    public static void push(int i){
        stack.push(i);
        if(minStack.isEmpty() || minStack.peek()>i){
            minStack.push(i);
        }
    }

    public static void pop(){
        if(stack.pop() == minStack.peek()){
            minStack.pop();
        }
    }

    public static int getMin(){
        return minStack.peek();
    }

    /*public static int nextGreater(int i){    
        
        Stack<Integer> copy = new Stack<>();
        int nextGreat = Integer.MAX_VALUE;
        
        while(!copy.isEmpty()){
            int top = stack.pop();
            if(top>i && top<nextGreat){
                nextGreat = top;
            }
        }
        return nextGreat;
    }*/
    public static void main(String[] args) {
        for(int i =99;i>90;i--){
            push(i);
        }
        System.out.println(stack);
        System.out.println("min element : " + getMin());
        //System.out.println("next greater : " + nextGreater(92));
    }
}

// find ther next greater element;