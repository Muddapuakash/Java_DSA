public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){

        if(left<right){
            int pivotIndex = partition(arr,left,right);

            quickSort(arr,left, pivotIndex-1);
            quickSort(arr,pivotIndex+1,right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1; // start from one index behind left.
        
        //less than right because rightIndex is the Pivot so check < rightIndex
        for(int j= left ; j<right;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        // increase tht index of i by 1 that is the correct positon of the pivot.
        i++;
        //swap the pivot
        int temp = arr[i];
        arr[i]= arr[right];
        arr[right] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {99,23,44,12,323,54,23,2,1};

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array : ");
        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}

