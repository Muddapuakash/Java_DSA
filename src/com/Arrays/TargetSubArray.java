public class TargetSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;
       
        /*int size = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum =0;

            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum >= target){
                    size = Integer.min(size,(j-i)+1);
                }
            }
        }*/
        System.out.println(slideWindow(arr, target));

    }

    public static int slideWindow(int[] arr, int target){
        int size = Integer.MAX_VALUE;
        int slow = 0 , total = 0;

        for(int fast = 0;fast< arr.length;fast++){
            total = total + arr[fast];

            while(total >= target){
                size = Integer.min(size,(fast - slow)+1);
                total = total - arr[slow];
                slow++;
            }
        }
        return (size == Integer.MAX_VALUE)? 0 : size;
    }
}

//longest Substirng without repeating characters
