package Digits;
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0; 
        
        n = (n<0)? -n : n ; // negative --> positve
        
        while(n > 0) {
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        } 
        System.out.println("Sum of Digits = " + sum);
    }
}
