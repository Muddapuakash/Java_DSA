public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,45,6};
        int item = 4;
        int foundIndex =-1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]==item) {
                foundIndex  = i;
                break;
            }
        }

        if(foundIndex == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found, index : " + (foundIndex+1));
        }
    }
}
