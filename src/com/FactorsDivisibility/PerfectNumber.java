package FactorsDivisibility;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 6;
        int sumOfFactors = 0;
        
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                sumOfFactors+= i ;
            }
        }
        if(sumOfFactors == n) {
            System.out.print(n + " is a Perfect number.");
        }
        else {
            System.out.print(n + " is not a Perfect Number.");
        }
    }
}
