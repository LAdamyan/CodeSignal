package SmoothSailing;
/*Given an array of strings, return another array containing all of its longest strings.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {

    public static void main(String[] args) {
        String[]array = {"aa","abbby","we","jjjjjjjj"};
        String[] longestStrings = solution(array);
        System.out.println(Arrays.toString(longestStrings));

    }

    public static String []solution(String[]inputArray){
        int maxLength = 0;

        List<String> longestStrings = new ArrayList<>();

        //Find the maximum length
        for(String str: inputArray){
            int length = str.length();
            if(length>maxLength){
                maxLength=length;
            }
        }
        //collect all strings with the max length
        for(String str :inputArray){
            if(str.length()==maxLength){
                longestStrings.add(str);
            }
        }
        //convert the list to an array
        return longestStrings.toArray(new String[0]);
    }
}
