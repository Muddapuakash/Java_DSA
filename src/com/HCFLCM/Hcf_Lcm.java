public class Hcf_Lcm {
    public static void main(String[] args) {
        int a = 90;
        int b = 70;
       System.out.println(Lcm(a,b));
       
       // formulae : a*b = hcf(a,b) * lcm(a,b)
       //System.out.println( (a*b)/Lcm(a,b));  // a*b = hcf(a,b) * lcm(a,b)
       
       //System.out.println(Hcf(a,b));
      
       //System.out.println(HcfSubstaction(a, b));
       
       System.out.println( EucledianHcf(a, b));     
    }
    
    //brute force
    public static int Lcm(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a, b);
        
        // e.g. 20,10,30 the Lowest common multiple  will be multiple of lowestnumber.
        // 20, 30 --> 10 * ( 1,2,3.....n )
        for (int i = 1; ; i++) {
            if((max*i) % min == 0){ 
                return max*i;
            }
        }
    }

    //brute force
    public static int Hcf(int a, int b) {
        int min = Math.min(a,b);
        while(min>0){
            if(a % min == 0 && b % min == 0){
                return min ;
            }
            min--;
        }
        return 0;
    }

    public static int HcfSubstaction(int a, int b) {
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else {
                b=b-a;        
            }
        }
        return a;
    }


    // O(logn)
    public static int EucledianHcf(int a, int b){
        while(b>0) {
            int remainder = a%b;
            a = b;
            b = remainder;       
         }
         return a;
    }  
}