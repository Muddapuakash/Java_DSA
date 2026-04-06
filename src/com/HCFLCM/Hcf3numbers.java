public class Hcf3numbers {
    public static int Eucledian(int a , int b) {
        while(b>0) {
            int remainder = a%b;
            a = b;
            b = remainder;       
         }
         return a;
    }  

    public static void main(String[] args) {
        int  a = 24, b = 36, c = 60;
        int gcd = Eucledian(a,b);
        gcd = Eucledian(gcd,c);

        System.out.println(gcd);
    }
    
}
