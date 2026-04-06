import java.util.Arrays;

public class RightShiftArray { 
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        /*int temp = arr[0];
        for(int i =1;i<arr.length ; i++){
            int temp2 = arr[i];
            arr[i]= temp;
            temp = temp2;
        }
        arr[0]= temp;*/   

        int last = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println(Arrays.toString(arr));
    }
}