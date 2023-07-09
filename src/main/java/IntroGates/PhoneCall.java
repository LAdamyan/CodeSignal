package IntroGates;
/*Some phone usage rate may be described as follows:

        first minute of a call costs min1 cents,
        each minute from the 2nd up to 10th (inclusive) costs min2_10 cents
        each minute after 10th costs min11 cents.
        You have s cents on your account before the call. What is the duration of the longest call (in minutes rounded down to the nearest integer) you can have?

        Example

        For min1 = 3, min2_10 = 1, min11 = 2, and s = 20, the output should be
        solution(min1, min2_10, min11, s) = 14.*/

public class PhoneCall {
    public static void main(String[] args) {
        System.out.println(solution(1,2,1,6));

    }
    public static int solution(int min1, int min2_10, int min11, int s) {
        int maxMinutes = 0;
        if (s >= min1) { // can make at least 1 minute call
            maxMinutes++;
            s -= min1; // reduce balance
        }
        if (s >= 9 * min2_10) { // can make 9 more minutes of calls with min2_10 rate
            maxMinutes += 9;
            s -= 9 * min2_10; // reduce balance
        } else { // less than 9 minutes available with min2_10 rate
            maxMinutes += s / min2_10;
            s = 0; // balance depleted
        }
        maxMinutes += s / min11; // remaining minutes with min11 rate
        return maxMinutes;
    }
}
