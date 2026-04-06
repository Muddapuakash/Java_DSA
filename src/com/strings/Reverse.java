public class Reverse {
    public static String reverseString2P(String s){
        StringBuilder rev = new StringBuilder(s);
        int l=0, r = s.length()-1;

        while(l<r){
           char ch = s.charAt(l);
           rev.setCharAt(l++, s.charAt(r));
           rev.setCharAt(r--, ch);
        }

        return rev.toString();
    }

    public static void main(String[] args) {
        String s = "anuj";
        System.out.println(reverseString2P(s));
    }
}
