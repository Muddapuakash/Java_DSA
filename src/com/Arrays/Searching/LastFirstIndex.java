public class LastFirstIndex {

    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;

        int [] result = searchRange(arr, target);
       

        System.out.println("first index : " + result[0]);
        System.out.println("last index : " + result[1]);
    }

    public static int[] searchRange(int[] arr, int target) {
        int first = findBound(arr,target,true);
        int last = findBound(arr,target,false);

        return new int[] {first,last};
    }

    public static int findBound(int[] arr, int target, boolean isFirst) {
        int l = 0, u = arr.length -1;
        int index =-1;

        while(l<=u){
            int mid = l + (u-l)/2;
        
            if(arr[mid] == target){
                index = mid ;
                if(isFirst){
                    u = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            else if(arr[mid] > target) {
                u = mid - 1 ;
            }
            else l = mid + 1;
        }

        return index;
    }
}