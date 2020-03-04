import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {



//Input a string and an integer k . Find the character at index k or print "out of bounds" if k is out of stings length.
//Sample Output
//Input a string: World
//Input an index: 3
//Character at index 3 is 'l'

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String base = scanner.next();
        System.out.println("Input an index");
        int k = scanner.nextInt();

        if (k >= base.length()) {
            System.out.println("Out of bounds");
        }
        else System.out.println(base.charAt(k));

    }
}
