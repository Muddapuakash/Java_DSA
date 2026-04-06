package Digits;
public class Check9 {
    public static void main(String[] args) {
        int n = 123;
        boolean result = false ;
         
        while(n > 0) {
            if(n%10 == 9) {
                result = true;
                break;
            }
            n = n/10;
        }

        if(result){
            System.out.println("9 is present in the number.");
        }
        else{
            System.out.println("9 is not present in the number.");
        }
    }
}
