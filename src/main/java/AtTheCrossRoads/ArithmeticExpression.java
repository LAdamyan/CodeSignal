package AtTheCrossRoads;

public class ArithmeticExpression {
    public static void main(String[] args) {
        System.out.println(solution(2, 3, 5));
        System.out.println(solution(5, 2, 0));
    }

    public static boolean solution(int a, int b, int c) {
        return a + b == c || a - b == c || a * b == c || a == c * b;
    }
}
