package AtTheCrossRoads;

public class TennisSet {
    public static void main(String[] args) {
        System.out.println(solution(3,6));
        System.out.println(solution(8,5));
    }

    public static boolean solution(int score1, int score2) {
        return ((score1 == 6 && score2 < 5) || (score2 == 6 && score1 < 5) ||
                (score1 == 7 && score2 >= 5 && score2 < 7)
                || (score2 == 7 && score1 >= 5 && score1 < 7));
    }
}
