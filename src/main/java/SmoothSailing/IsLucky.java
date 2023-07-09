package SmoothSailing;

/*Ticket numbers usually consist of an even number of digits. A ticket number
 is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.*/
public class IsLucky {
    public static void main(String[] args) {

        int ticketNumber1 = 2240;
        int ticketNumber2 = 239017;

        System.out.println(isLucky(ticketNumber1));
        System.out.println(isLucky(ticketNumber2));
    }

    public static boolean isLucky(int n) {
        String ticketNumber = String.valueOf(n);
        int length = ticketNumber.length();

        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        //Calculate the sums of the digits in each half

        for (int i = 0; i < length / 2; i++) {
            int digit = Character.getNumericValue(ticketNumber.charAt(i));
            sumFirstHalf += digit;
        }

        for (int i = length / 2; i < length; i++) {
            int digit = Character.getNumericValue(ticketNumber.charAt(i));
            sumSecondHalf += digit;
        }

        //Check if thw sums are equal
        return sumFirstHalf==sumSecondHalf;
    }
}
