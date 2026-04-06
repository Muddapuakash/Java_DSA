package Digits;
class CountDigits {
    public static void main(String[] args) {
        int n = 123;
        
        n = (n<0)? -n : n ; // negative --> positve
        int countDigits = (n==0)? 1 : 0;
        
        while(n > 0) {
            countDigits++;
            n = n/10;
        } 
        System.out.println("Number of Digits = " + countDigits);
    }
}
