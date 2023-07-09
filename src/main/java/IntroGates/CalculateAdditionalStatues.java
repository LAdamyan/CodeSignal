package IntroGates;

import java.util.Arrays;

public class CalculateAdditionalStatues {
    public static void main(String[] args) {
        int []array = {6,2,3,8};
        System.out.println(calculateAdditionalStatues(array));

    }


    public static int calculateAdditionalStatues(int []statues){
        Arrays.sort(statues);

        int additionStatues = 0;
        for (int i = 0; i <statues.length-1 ; i++) {
            int difference = statues[i+1]-statues[i];
            if(difference>1){
                additionStatues+=difference-1;
            }
        }
        return additionStatues;
    }
}
