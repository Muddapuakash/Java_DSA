public class Fibonnaci {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }

        int fib = 0;
        int a = 0, b = 1;

        for(int i = 2;i<=n;i++){
            fib = a+b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static int recursiveFib(int n){
        if(n <=1){
            return n;
        }
        return recursiveFib(n-1) + recursiveFib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(recursiveFib(5));
    }
}
