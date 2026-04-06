public class SlidingWindow {
    public static void main(String[] args) {
       
        int[] arr = {2,1,5,1,3,6};
        int k = 3;
        /*Brute force
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<=arr.length - k;i++){
            int sum = 0;
            for(int j =i;j<i+k;j++){
                sum += arr[j];
            }
            maxSum = Integer.max(maxSum,sum);
        }
        System.out.println(maxSum);*/

        int maxSum = slideWindow(arr, k);
        System.out.println(maxSum);
    }

    public static int slideWindow(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;
        
        for(int i = k ; i<arr.length; i++){
            windowSum = windowSum + arr[i] - arr[i-k];
            maxSum = Integer.max(maxSum,windowSum);
        }
        
        return maxSum;
    }
}
