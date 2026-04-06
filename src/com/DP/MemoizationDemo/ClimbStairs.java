/*recursion with a memory, still a top down apporach
store previously computed subproblem in a hashMap.

meomry reqd. for cache and heap for the recursive calls.
can cause stackoverflow, used if problem requires divison, order of evalution is no specified.
*/

// count the ways to climb n-stairs, take 1 step or 2 step.
import java.util.HashMap;

public class ClimbStairs {

   static HashMap<Integer, Integer> map = new HashMap<>();

    public static int waysToClimb(int n){
        if(map.get(n)!= null) return map.get(n);

        if(n==1) return 1;
        if(n==2) return 2;

        int result =  waysToClimb(n-1) + waysToClimb(n-2);
        map.put(n,result);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(waysToClimb(5));
    }
}
