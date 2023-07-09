package IntroGates;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "abba";
        System.out.println( solution(input));
    }
   static boolean solution(String inputString){
   for (int i =0;i <inputString.length()/2;i++){
       if(inputString.charAt(i)!=inputString.charAt(inputString.length()-i-1)){
           return false;
       }
   }
   return true;
    }
}
