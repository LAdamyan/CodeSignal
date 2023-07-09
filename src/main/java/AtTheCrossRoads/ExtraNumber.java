package AtTheCrossRoads;

public class ExtraNumber {
    public static void main(String[] args) {
        System.out.println(solution(5,5,8));

    }

    public static int solution(int a, int b, int c) {
        if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else {
            return a;
        }
    }
}
