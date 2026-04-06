public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,56,78,90};
        int item = 56;
        int index = -1;

        int l =0, u = arr.length-1;

        while(l<=u){
            int mid = l + (u-l)/2;

            if(arr[mid]==item){
                index = mid;
                break;
            }
            else if(arr[mid]> item){
                u = mid - 1;
            }
            else if(arr[mid]<item){
                l = mid + 1;
            }
        }

        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found, index : " + (index+1));
        }
    }
}
