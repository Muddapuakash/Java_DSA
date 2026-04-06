public class FreqOfNumber {
    public static void findFreqency(int[] arr){
        if(arr == null || arr.length == 0) {
            System.out.println("Invalid array.");
            return;
        }

        boolean[] visited = new boolean[arr.length];
        for(int i =0;i<arr.length;i++){
            int count = 1;
            if(visited[i] == true) continue;
            
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+"---> " + count);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,3,1,2};
        findFreqency(arr);
    }
}