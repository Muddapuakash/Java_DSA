public class FindFirstEven {
    public static void main(String[] args) {
        int[] arr ={1,3,45,77};
        int foundIndex =-1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 == 0) {
                foundIndex  = i;
                break;
            }
        }

        if(foundIndex == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found, element : " + arr[foundIndex]);
        }
    }
}
