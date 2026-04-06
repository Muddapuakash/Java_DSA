public class Factorial {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n ;i++){
           fact = fact * i;
        }

        return fact;
    }

    public static int recursiveFactorial(int n){
        if(n <= 1){
            return n;
        }
        return n * recursiveFactorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
    }

}
