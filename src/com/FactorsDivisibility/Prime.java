package FactorsDivisibility;

public class Prime {
    public static void main(String[] args) {
        int n = 33;
        int factors = 0;
        /* 
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) {
                factors+=1;
            }
        }

        if (factors == 2) {
            System.out.println(n + " is a Prime Number");
        }
        else {
            System.out.println(n + " is not a Prime Number");
        }
        */

        if(checkPrime(n)){
            System.out.println(n + " is a Prime Number");
        }
        else {
            System.out.println(n + " is not a Prime Number");     
        }
    }

    public static boolean checkPrime(int n) {
        if (n<=1) {
            return false;
        } 
        for(int i=2 ; i<= Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    } 
}