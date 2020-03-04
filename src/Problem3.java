import java.util.Scanner;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String word = scanner.nextLine();
        char[] wordchars = word.toCharArray();
        char[] reversewordchars= new char[wordchars.length];


        for(int i=0; i< wordchars.length; i++){
            reversewordchars[wordchars.length-(i+1)] = wordchars[i];
        }

        boolean palindrome = Arrays.equals(wordchars,reversewordchars);
        if (palindrome) {
            System.out.println("The word is palindrome");
        }
        else
            System.out.println("The word is not a palindrome");
    }
}
