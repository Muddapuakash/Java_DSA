import java.util.Arrays;

public class FindName {
    public static void main(String[] args) {
        String[] names ={"Manas","Aditya","Suraj","Mukesh","Uttam"};
        String item = "Uttam";
        int foundIndex =-1;

        /*for(int i = 0; i<names.length; i++){
            if(names[i].equalsIgnoreCase(item)) {
                foundIndex  = i;
                break;
            }
        }

        if(foundIndex == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found, index : " + (foundIndex+1));
        }*/

        Arrays.sort(names);

        int l = 0, u = names.length-1;

        while(l<=u){
            int mid = l + (u-l)/2;
            int check = names[mid].compareTo(item);
            if(check==0){
                foundIndex = mid;
                break;
            }
            else if(check>0){
                u=mid -1;
            }
            else if(check<0){
                l = mid + 1;
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
