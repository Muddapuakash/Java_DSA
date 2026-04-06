package FactorsDivisibility;

public class Factors {
    public static void main(String[] args) {
        int n = 24;
        System.out.print("factors of " + n + " = ");
        
        for(int i=1 ; i<=n ; i++) {
            if(n%i == 0){ 
                System.out.print(i+", ");
            }
        }

    }
}