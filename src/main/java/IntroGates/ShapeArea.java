package IntroGates;

public class ShapeArea {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(solution(n));
    }



 public static    int solution(int n){
        if(n == 1){
            return 1;
        }
        return (2*n-1)*(2*n-1)/2+1;
    }
}
