import java.util.HashMap;

public class NthTribonacci {
    
    static HashMap<Integer ,Integer> map = new HashMap<>();

    public static  int nTribonacci(int n){
        if(map.get(n)!=null) return map.get(n);

        if(n == 1) return 0; 
        if(n <= 3) return 1; 

        int result = nTribonacci(n-1) + nTribonacci(n-2)+ nTribonacci(n-3);
        map.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(nTribonacci(5));
    }
}
