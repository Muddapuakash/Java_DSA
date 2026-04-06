public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,9};
        System.out.print("Array : ");
        for(int i : arr1){
            System.out.print(i+" , ");
        }
        System.out.println();

        int[] arr2 = {2,6,7,8,10};
        System.out.print("Array : ");
        for(int i : arr2){
            System.out.print(i+" , ");
        }
        System.out.println();

        int[] newArr = new int[(arr1.length + arr2.length)];

        int p1 = 0;
        int p2 =0;

        int index = 0;

        /*while(index < newArr.length){
            if(p1 == arr1.length) {
                newArr[index++] = arr2[p2++];
            }
            else if(p2 == arr2.length) {
                newArr[index++] = arr1[p1++];
            }
            else if(arr1[p1]<arr2[p2]) { 
                newArr[index++] = arr1[p1++];
            }
            else{
                newArr[index++] = arr2[p2++];
            }
        }*/

        while(p1<arr1.length && p2<arr2.length) {
            if(arr1[p1]< arr2[p2]){
                newArr[index++] = arr1[p1++];
            }
            else {
                newArr[index++] = arr2[p2++];
            }
        }

        while(p1<arr1.length){
            newArr[index++] = arr1[p1++];
        }

        while(p2<arr2.length){
            newArr[index++] = arr2[p2++];
        }

        System.out.print("mergeArray : ");
        for(int i : newArr){
            System.out.print(i+" , ");
        }
        System.out.println();
      
    }
}
