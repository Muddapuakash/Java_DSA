package Digits;
class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        n = (n<0)? -n : n ; // negative --> positve
        int copy = n;
        int reverse = 0;
        
        while(n > 0) {
            int digit = n%10;
            reverse = (reverse * 10) + digit;
            n = n/10;
        } 
        n = copy;

        if(n == reverse){
            System.out.println(n + " is Palindrome." );
        }
        else {
            System.out.println(n + " is not Palindrome." );
        }
       
    }
}
