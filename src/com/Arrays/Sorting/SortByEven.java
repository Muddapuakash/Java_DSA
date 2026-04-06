import java.util.Arrays;

public class SortByEven {
    public static void main(String[] args) {
        int[] arr ={23,56,47,92,76,93};
        System.out.println(Arrays.toString(arr));
        int size = arr.length;

        for(int i=0;i<size-1;i++){
            for(int j=0;j<(size-1)-i;j++){
                if((arr[j]%2) > (arr[j+1]%2)){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
