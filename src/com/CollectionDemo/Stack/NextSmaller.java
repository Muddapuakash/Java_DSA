import java.util.Stack;

public class NextSmaller {
    /*public static int nextSmaller(Stack<Integer> stack,int n){
        int min = -1;
        
        while(!stack.isEmpty()){
            int element = stack.pop();
            if(element < n && min - element<0){
                min = element;
            }
        }
        return min;
    }*/

    public static int nextSmaller(Stack<Integer> stack,int n){
        int res = -1;

        for(int element : stack){
            if(element<n){
                if(res == -1 || element>res){
                    res = element;
                }
            }
        }

        return res;
    }
    

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.push(45);
        stack.push(267);
        stack.push(99);
        stack.push(567);
        stack.push(1000);

        System.out.println(nextSmaller(stack,100));
    }
}
