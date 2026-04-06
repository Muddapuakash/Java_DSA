public class FindIndex {
    public static int targetIndex(int[] arr , int target) {
        int i = 0;
        for(int element : arr) {
            if(element == target) return i;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int value = 10;
        System.out.println(targetIndex(arr, value));
    }
}
