/*
Recent Call Counter
design a class RecentCounter to count recent requests within the last 3000ms
Store timestamps in. a Queue
When a new ping comes, remove old timestamps ($< t-3000ms) from the front.
Size of the queue is the answer */


import java.util.LinkedList;
import java.util.Queue;

public class RecentCallsCounter {
    static Queue<Long> callLogs = new LinkedList<>();

    public static int callCount(long ping){

        callLogs.add(ping);
        while(callLogs.peek() < ping - 3000 ){
            callLogs.poll();
        }
        
        return callLogs.size();
    }
    public static void main(String[] args) {
        System.out.println(callCount(1l));
        System.out.println(callCount(100l));
        System.out.println(callCount(3001l));
        System.out.println(callCount(3002l));
        System.out.println(callCount(4000l));
    }
}
