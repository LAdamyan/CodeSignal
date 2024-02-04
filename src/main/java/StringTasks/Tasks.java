package StringTasks;

public class Tasks {
    public String reverse(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Swap characters from both ends
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}