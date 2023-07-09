package AtTheCrossRoads;

import java.util.Arrays;

public class MetroCard {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(30)));
    }

    public static int[]solution(int lastNumberOfDays){
        if(lastNumberOfDays ==28){
            return new int[]{31};
        }else if(lastNumberOfDays == 30){
            return  new int[]{31};
        }else{
            return new int[]{28,30,31};
        }
    }
}
