package SmoothSailing;

/*Some people are standing in a row in a park. There are trees between them which cannot be moved.
 Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!


Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].*/

import java.util.Arrays;

public class SortByHeight {
    public static void main(String[] args) {
        int[]a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] sortByHeight = solution(a);
        System.out.println(Arrays.toString(sortByHeight));

    }

    public static int[] solution(int[] a) {
        int temp = 0;
        int tree = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == tree) {
                    i++;
                }
                if (a[j] == tree) {
                    continue;
                }
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

}
