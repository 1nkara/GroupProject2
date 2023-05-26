import java.util.Scanner;

public class Task3 {
    /*Count the Number of Words in a String: Write a function to count the number of words in a
    given string. Words are separated by spaces or punctuation.
     For example, the input "Hello, world!" should return 2.
     */

    public static void main(String[] args) {
        String text = "Hello world";
        int countWords = 0;

        //word count
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ')
                countWords++;
        }

        System.out.println(countWords + 1);

    }
}
