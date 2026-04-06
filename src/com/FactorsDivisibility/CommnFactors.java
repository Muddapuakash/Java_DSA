package FactorsDivisibility;

public class CommnFactors {
    public static void main(String[] args) {
        int n1 = 54;
        int n2 = 45;
        // find  O(sqrt(n))
        for(int i=1; i<=Math.sqrt(n1); i++) {
            if(n1%i==0) {
                if(n2%i == 0) {
                    System.out.println(i);
                }
                if(n1/i != i && n2%(n1/i) == 0) {
                    System.out.println(n1/i);
                }
            }
        }
    }
}
