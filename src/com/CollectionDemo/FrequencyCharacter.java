import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String s = "anujjha";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println(map);
        
        int max = 0; char maxCh = '\0';
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxCh = entry.getKey();
            }
            
            else if(entry.getValue() == max){
                if(entry.getKey() < maxCh ){
                    max = entry.getValue();
                    maxCh = entry.getKey();
                }
            }
        }

        System.out.println(maxCh + " : " + max);
    }
}