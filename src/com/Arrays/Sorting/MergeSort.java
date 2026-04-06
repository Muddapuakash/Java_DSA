public class MergeSort {

    public static void mergeSort(int arr[], int left, int right){
        
        if(left<right){
            int mid  = left + (right-left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left ,mid,right);
        } 
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int sizeLeft = mid -left +1;
        int sizeRight = right - mid;
        int[] leftarr = new int[sizeLeft];
        int[] rightarr = new int[sizeRight];

        for(int i=0;i<sizeLeft;i++){
            leftarr[i] = arr[left + i];
        }

        for(int j=0;j<sizeRight;j++){
            rightarr[j] = arr[(mid+1)+j];
        }
        
        int i=0,j=0,index= left;
       
        while(i<sizeLeft  && j<sizeRight){
            if(leftarr[i]<rightarr[j]) {
                arr[index++] = leftarr[i++];
            }
            else {
                arr[index++] = rightarr[j++];
            }
        }

        while(i<sizeLeft){
            arr[index++]=leftarr[i++];
        }

        while(j<sizeRight){
            arr[index++]=rightarr[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {99,23,44,12,323,54,23,2,1};

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array : ");
        for(int num : arr){
            System.out.print(num + ", ");
        }
    }
}
