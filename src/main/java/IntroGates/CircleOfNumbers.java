package IntroGates;

/*Consider integer numbers from 0 to n - 1 written down along the circle in such a way
that the distance between any two neighboring numbers is equal (note that 0 and n - 1 are neighboring, too).
 *

Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

Example
For n = 10 and firstNumber = 2, the output should be
solution(n, firstNumber) = 7. */
public class CircleOfNumbers {
    public static void main(String[] args) {
        System.out.println(solution(10,2));
    }
    public static int solution(int n,int firstNumber){
        int halfN = n/2;
        int opposite = firstNumber+ halfN;
        if(opposite>=n){
            opposite = opposite-n;
        }
        return opposite;
    }
}
