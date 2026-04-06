import java.util.Arrays;

public class SortByLength {
    public static void main(String[] args) {
        String[] names = {"bahubali","ramu","devasena","kiruu"};
        int size = names.length;
        boolean swapped ;

        for(int i =0;i<size-1;i++){
            swapped =false;
            for(int j = 0;j<(size-1)-i;j++){
                if(names[j+1].length() < names[j].length()){
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }

        System.out.println(Arrays.toString(names));
    }
}
