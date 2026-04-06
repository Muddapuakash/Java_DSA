import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {19,34,56,232,2,34};

        for(int i=1; i<arr.length;i++) {
            int key  = arr[i];
            
            int j=i-1;

            for(; j>=0 && arr[j]>key; j--){
                arr[j+1] = arr[j];
            }

            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
