import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BucketSort {
    public static void bucketSort(String s){
        // store the charcters of the same frequency int the same bucket as a list 
        // e.g : anujjha = < 2:{n,u,h} , 1:{a,j} >
        // maximum frequency for a character can be the total length of the string.
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        for(char ch : s.toCharArray()){
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
        }

        List<Character>[] bucket = new ArrayList[s.length()+1];

        for(Map.Entry<Character,Integer> entry : frequencyMap.entrySet()){
            char ch = entry.getKey();

            if(bucket[frequencyMap.get(ch)] == null){
                bucket[frequencyMap.get(ch)] = new ArrayList<>();
            }

            bucket[frequencyMap.get(ch)].add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = bucket.length -1;i>0;i--){
            if(bucket[i]!=null){
                for(char ch : bucket[i]){
                    for(int j = 1;j<=i;j++){
                        sb.append(ch);
                    }
                }
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        String s = "anujjha";
        bucketSort(s);
    }
}
