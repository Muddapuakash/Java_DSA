public class maxProductof2 {
    // product of two -ve can also be greater so we need to find minimums too(to handle -ves)
    // [-10,-20,1,3,4,5] ---> max = -10 * -20 = 200
    public static int maxProduct(int[] arr){
        int max1 = Integer.MIN_VALUE, max2 =Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(max1<arr[i]){
                max2 = max1; 
                max1= arr[i];
            }
            else if(max2< arr[i]){
                max2 = arr[i];
            }
        }

        for(int i : arr){
            if(min1>i){
                min2= min1;
                min1 = i;
            }
            else if(min2>i){
                min2 = i;
            }
        }
        

        return Integer.max(max1*max2, min1*min2);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-10,-20};
        System.out.println(maxProduct(arr));
    }
}
