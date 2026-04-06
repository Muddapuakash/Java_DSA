public class SearchInsert {
    public static void main(String[] args) {
            int[] arr= {1,3,5,6};
            int target = 4;
            int index = searchInsert(arr, target);

            System.out.println(index);
        }
        
        public static int searchInsert(int[] arr, int target){
            int l = 0, u = arr.length -1;
            int mid = 0;

            while(l<=u){
                mid = l + (u-l)/2;

                if(arr[mid] == target){
                    return mid;
                }
                else if(arr[mid] > target) {
                     u = mid - 1 ;
                }
                else l = mid + 1;

            }

            return l;
        }
}
