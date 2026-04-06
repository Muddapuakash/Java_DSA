// find the min element  in a rotated sorted array

public class MinimumElement {

    public static int minElement(int[] arr){
        int left = 0, right = arr.length -1;

        while(left<right){
            int mid = left + (right - left)/2;

            if(arr[mid]>arr[right]) {
                left = mid+1;
            }
            else if(arr[mid]<arr[right]) {
                right = mid;
            }
            else { //to handle duplicates
                right--;
            }
        }

        return arr[left]; //left = right == mid;
        
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3}; // rotated sorted array
        System.out.println(minElement(arr));
    }
}
