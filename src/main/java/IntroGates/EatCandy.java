package IntroGates;

public class EatCandy {
    public static void main(String[] args) {
        System.out.println(solution(3,10));
        System.out.println(solution(2,9));

    }

    static int solution(int n,int m){
        int candyPerChild = m/n;
        int totalCandy = candyPerChild * n;

        return totalCandy;
    }
}
