package Digits;
class DigitExtraction {
    public static void main(String[] args) {
        int n = 123;
        n = (n<0)? -n : n ; // negative --> positve
        
        while(n > 0) {
            int digit = n%10;
            System.out.print(digit+ ", ");
            n = n/10;
        } 
    }
}
