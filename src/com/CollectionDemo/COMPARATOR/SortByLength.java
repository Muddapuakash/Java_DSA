import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByLength {
    public static void main(String[] args) {
        String[] array = {"pie","kiwi","banana","apple","guava"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Unsorted :" + list);

        list.sort((o1,o2)->{ 
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            else{
                return o1.length() - o2.length();
            }
        });

        System.out.println("Sorted   :"+ list);
    }
}
