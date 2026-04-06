public class FindCharacter {
    public static void main(String[] args) {
        String s = "java is good";
        char ch = 's';
        int index =-1;

        for(int i = 0;i<s.length(); i++){
            if(s.charAt(i) == ch){
                index = i;
                break;
            }
        }
        if(index ==-1){
            System.out.println("not found");
        }
        else{
        System.out.println("found, index : " + (index+1));
        }
    }
} 
