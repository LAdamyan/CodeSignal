package CornerOf0sAnd1s;

public class KillK_thBit {
    public static void main(String[] args) {
        System.out.println(solution(37,3));
    }

    public static int solution(int n, int k) {

        return n & ~(1 << (k - 1));
    }
}