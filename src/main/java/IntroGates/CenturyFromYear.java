package IntroGates;

public class CenturyFromYear {
    public static void main(String[] args) {
        int year = 2021;
        int century = solution(year);
        System.out.println("The year " + year + " belongs to the " + century + " century.");
    }

    static int solution(int year) {
        int century = year / 100;

        if (year % 100 != 0) {
            century++;
        }
        return century;
    }
}
