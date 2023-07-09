package AtTheCrossRoads;

public class WillYou {
    public static void main(String[] args) {
        System.out.println(solution(true, true, true));
        System.out.println(solution(true, false, true));

    }

    public static boolean solution(boolean young, boolean beautiful, boolean loved) {
        if ((young && beautiful && !loved) || loved && (!beautiful || !young)) {
            return true;
        }
        return false;
    }
}
