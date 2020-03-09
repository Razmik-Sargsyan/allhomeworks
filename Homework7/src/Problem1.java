import java.util.Scanner;
import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int nonnegative = scanner.nextInt();
        if (nonnegative < 0) {
            System.out.println("Type a non negative number");
            nonnegative = scanner.nextInt();
        }
            System.out.println(digitsums(nonnegative));




    }
    public static int digitsums (int number){
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}