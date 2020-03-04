import java.util.Arrays;
import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String word = scanner.nextLine();
        char letters[] = word.toCharArray();
        System.out.println("Input number of rotations: ");
        int n = scanner.nextInt();

        char secondpart[] = new char[letters.length-n];
        char firstpart[]= new char[n];



        for (int i = 0; i < letters.length - n; i++) {
            secondpart[i] = letters[n + i ];
        }
        String stringforsecondpart = new String(secondpart);
        for (int f = 0; f < n ; f++) {
            firstpart[f] = letters[f];
        }
        String stringforfirstpart = new String(firstpart);

        System.out.println(stringforsecondpart+stringforfirstpart);
    }
}
