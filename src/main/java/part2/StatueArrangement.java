package part2;

import java.util.Arrays;

public class StatueArrangement {

    public static void main(String[] args) {
        int[]statues = {6,2,3,8};
        int result = solution(statues);
        System.out.println("The minimum number of additional statues is needed is  : " + result);

    }


    public static int solution(int[]statues){
        if(statues.length<=1){
            return 0;//No additional statues needed
        }
        int min = Arrays.stream(statues).min().getAsInt();
        int max = Arrays.stream(statues).max().getAsInt();

        int range = max-min +1;
        return range - statues.length;
    }
}
