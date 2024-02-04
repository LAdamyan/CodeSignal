package part2;

public class PolygonArea {
    public static void main(String[] args) {

        int n = 4;
        int area = solution(n);
        System.out.println("The area of the " + n + "-interesting polygon is: " + area);
    }

    public static int solution(int n){
        if(n==1){
            return 1;
        }
        return (2*n-1)*(2*n-1)/2+1;
    }
}
