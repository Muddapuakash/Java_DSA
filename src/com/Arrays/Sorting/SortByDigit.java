import java.util.Arrays;

public class SortByDigit {
    public static void main(String[] args) {
        int[] arr ={22,35,67,89,90,3,1908,88};
        int size = arr.length;
        boolean swapped;

        for(int i=0;i<size-1;i++){
            swapped = false;

            for(int j=0;j<(size-1)-i;j++){
                if(arr[j]%10 > arr[j+1]%10){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

                else if (arr[j]%10 == arr[j+1]%10){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        swapped = true;
                    }
                }
            }

            if(!swapped) break;
        }

        System.out.println(Arrays.toString(arr));
    }
}