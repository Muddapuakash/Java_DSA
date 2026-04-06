public class Palindrome {
    public static void main(String[] args) {
        String s = "A man,a plan,a canal: Panama";
        
        /*s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = 0; int r = s.length()-1;
        boolean check = true;

        while(l<r){
            if(s.charAt(l++) != s.charAt(r--)){
                check = false;
                break;
            }
        }*/

        if(palindrome(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    public static boolean palindrome(String s){
        int l = 0, r = s.length() - 1 ; 

        while(l<r){
            if(!Character.isLetterOrDigit(l)){
                l++;
            }
            else if(!Character.isLetterOrDigit(r)){
                r--;
            }
            else{
                if(Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))){
                    return false;
                }
            }
        }
        return true;
    } 
}
