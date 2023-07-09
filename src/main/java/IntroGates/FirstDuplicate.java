package IntroGates;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[]array = {2, 1, 3, 5, 3, 2};
        System.out.println(solution(array));
    }
    static int solution(int[]a){
        Set<Integer>seen = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
           if(seen.contains(a[i])){
               return a[i];
           }
           seen.add(a[i]);
        }
        return -1;
    }
}
