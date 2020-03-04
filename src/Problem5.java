import java.util.Arrays;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String first = scanner.nextLine();
        System.out.println("Input a string: ");
        String second = scanner.nextLine();
        String sum= first+second;

        if(sum.contains(second)){
            System.out.println("The second is the rotation of the first");
        }
        else
            System.out.println("Not a rotation");
    }
}
