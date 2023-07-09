package AtTheCrossRoads;

public class KnapsackLight {
    public static void main(String[] args) {
        System.out.println(solution(10,5,6,4,8));

    }
    public static int solution(int value1,int weight1,int value2,int weight2,int maxV){
        if(weight1 + weight2 <= maxV){
            return value1 + value2;
        }else if(weight1>maxV&&weight2>maxV){
            return 0;
        }else if(weight1>maxV){
            return value2;
        }else if(weight2>maxV){
            return value1;
        }else{
            double ratio1 = (double) value1/weight1;
            double ratio2 = (double) value2/weight2;
            if( ratio1>ratio2){
                return value1;
            }else{
                return value2;
            }
        }
    }
}
