package Digits;
public class Armstrong {
    public static void main(String[] args){ 
        int n = 153; 
        int copy = n;

        int countDigits = (int)Math.log10(n) + 1;
        double armstrong = 0.0;

        while(n > 0) {
            int digit = n%10;
            armstrong+= Math.pow(digit,countDigits);
            n = n/10;
        } 
        n = copy;

        if(n == armstrong){
            System.out.println(n + " is Armstrong." );
        }
        else {
            System.out.println(n + " is not Armstrong." );
        }
    }
}
