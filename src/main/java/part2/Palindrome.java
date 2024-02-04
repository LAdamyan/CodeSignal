package part2;
/*Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.*/

public class Palindrome {
    public static void main(String[] args) {
        String inputString1 = "aabaa";
        String inputString2 = "abac";
        String inputString3 = "a";

        System.out.println("Is \""+ inputString1 + "\" is a palindrome? " + isPalindrome(inputString1));
        System.out.println("Is \""+ inputString2 + "\" is a palindrome? " + isPalindrome(inputString2));
        System.out.println("Is \""+ inputString3 + "\" is a palindrome? " + isPalindrome(inputString3));

    }

    public static boolean isPalindrome(String inputString) {
        inputString = inputString.toLowerCase();

        int start = 0;
        int end = inputString.length() - 1;

        while (start < end) {
            if (inputString.charAt(start) != inputString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


}
