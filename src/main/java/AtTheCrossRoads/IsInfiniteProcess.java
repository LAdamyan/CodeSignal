package AtTheCrossRoads;

public class IsInfiniteProcess {
    public static void main(String[] args) {
        System.out.println(solution(2,6));
        System.out.println(solution(2,3));

    }
    public static boolean solution(int a ,int b){
        while(a!=b){
            a++;
            b--;
            if(b<0){
                return true;
            }
        }return false;
    }
}
