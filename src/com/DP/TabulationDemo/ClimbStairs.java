/*bottom up approach , the values are stored in a table form as an array or list.
is faster, no overflow, no heap meory reqd.
Soln. is build from previous steps/problems 

Use when order is given
*/

import java.util.ArrayList;

public class ClimbStairs {
    public static void main(String[] args) {
        ArrayList<Integer> waysToClimb = new ArrayList<>();

        //base cases
        waysToClimb.add(0,0);
        waysToClimb.add(1,1);
        waysToClimb.add(2,2);

        int n =5;

        for(int i = 3;i<=n;i++){
            int ways = waysToClimb.get(i-1) + waysToClimb.get(i-2);
            waysToClimb.add(ways);
        }

        System.out.println(waysToClimb.get(n));
    }
}
