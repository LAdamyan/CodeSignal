package IntroGates;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(29));
        System.out.println(solution(45));
        System.out.println(solution(96));
    }

   static int solution(int n){
        int firstDigit = n/10;
        int secondDigit = n%10;
        int sum = firstDigit + secondDigit;
        return sum;
    }
}
