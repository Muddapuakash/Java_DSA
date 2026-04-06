package Digits;
class Reverse {
    public static void main(String[] args) {
        int n = 123;
        n = (n<0)? -n : n ; // negative --> positve
        
        int reverse = 0;
        
        while(n > 0) {
            int digit = n%10;
            reverse = (reverse * 10) + digit;
            n = n/10;
        } 

        System.out.println("Reverse of the number = " + reverse);
    }
}
