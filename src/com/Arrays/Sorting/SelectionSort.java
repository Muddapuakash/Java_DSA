import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={29,14,11,37,17};
        int size = arr.length;

        for(int i = 0; i< size ;i++){
            int maxIndex = i;

            for(int j = i; j<size;j++){
                if(arr[maxIndex]< arr[j]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex]  = arr[i];
            arr[i] = temp; 
        }

        System.out.print("SortedArray : " + Arrays.toString(arr));
    }
}