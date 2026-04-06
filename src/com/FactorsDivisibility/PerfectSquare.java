package FactorsDivisibility;

public class PerfectSquare {
    public static void main(String[] args) {
        int n =25;
        boolean check  = false;
        for(int i =1; i*i<=Math.sqrt(n); i++){
            if(n%i == 0) {  
                if(n/i == i){ // or i*i = n
                    check = true;
                    break;
                }
            }
        }
        System.out.println((check)? "perfect sqaure" : " not a prefect square");
    }
}
