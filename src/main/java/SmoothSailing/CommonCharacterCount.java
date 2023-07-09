package SmoothSailing;
/*Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.*/
public class CommonCharacterCount {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        System.out.println(solution(s1,s2));
    }

    public static int solution(String s1,String s2){
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
           if(s2.contains(String.valueOf(s1.charAt(i)))){
               count++;
               s2= s2.replaceFirst(String.valueOf(s1.charAt(i)),"");
           }
        }
        return count;
    }
}
