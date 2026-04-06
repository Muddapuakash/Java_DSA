import java.util.Arrays;

public class THREEpointer {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,0,0,0,1,2,0,1,2};

        int start   = 0;
        int fast   = 0 ;
        int end    = arr.length-1;

        while(fast<=end){
            if(arr[fast]==0){
                int t = arr[start];
                arr[start] = arr[fast];
                arr[fast] = t;
                fast++; start++;
            }
            else if(arr[fast]==1) fast++;
            
            else if(arr[fast]==2){
                int t = arr[fast];
                arr[fast] = arr[end];
                arr[end] = t;
                end--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
