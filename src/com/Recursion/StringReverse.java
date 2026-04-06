public class StringReverse {
    public static String reverseString(String s){
        if(s.length() <=1){
            return s;
        }

        return reverseString(s.substring(1)) + s.charAt(0); 
        //return s.charAt(s.length()-1) + reverseString(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(reverseString("anuj"));
    }
}
