package IntroGates;

/*Write a function that returns the sum of two numbers.

Example

For param1 = 1 and param2 = 2, the output should be
solution(param1, param2) = 3.*/

public class PrintSum {
    public static void main(String[] args) {
      int a = 5;
      int b = 6;
        System.out.println(solution(a,b));

    }

  static   int solution(int param1, int param2) {
        int sum = 0;
        sum = param1 + param2;
        return sum;



}}