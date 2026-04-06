public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,17,14,15};
        int size = arr.length;
        boolean flagWasSwapped;
        int countSwaps = 0;

        for(int i = 0;i<size-1;i++) {
            flagWasSwapped = false;
            
            for(int j=0 ;j<(size-1)-i;j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flagWasSwapped = true;
                    countSwaps++;
                }
            }
            if(flagWasSwapped == false){
                break;
            }
        }
        System.out.println("no. of swaps : " + countSwaps );
        System.out.print("SortedArray : ");
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }
}
