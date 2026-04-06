public class AnagramCheck {

    public static boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        int sumOfchar=0;
        int[] freq = new int[26];

        for(char ch : s1.toCharArray()){
            sumOfchar+=ch;
            freq[ch - 'a']++;
        }

        for(char ch : s2.toCharArray()){
            sumOfchar-=ch;
            freq[ch - 'a']--;
        }

        /*for(int frequency : freq){
            if(frequency !=0 ){
                return false;
            }
        }*/
       if(sumOfchar != 0 ){ 
            return false;
        }
        
       return true;
    }

    public static void main(String[] args) {
        String s1 = "top";
        String s2 = "otp";

        if(checkAnagram(s1.toLowerCase(), s2.toLowerCase())){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
    
}
