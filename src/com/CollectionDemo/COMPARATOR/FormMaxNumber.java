import java.util.Arrays;

public class FormMaxNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,30,4,4};
        StringBuilder sb =new StringBuilder("");
        
        for(int element : arr){
            sb.append(String.valueOf(element));
        }
        
        Character[] ch = new Character[sb.length()];
        for(int i = 0; i<sb.length();i++){
            ch[i] = sb.charAt(i);
        }
        Arrays.sort(ch, (o1,o2)-> o2-o1);
       
        sb.setLength(0);

        for(char c : ch){
            sb.append(c);
        }
        
        System.out.println(sb.toString());
    }
}
