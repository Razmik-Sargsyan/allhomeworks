import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int a = scanner.nextInt();
        System.out.println("Input number of items in the array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(findwhere(a,array));


    }

    static int findwhere(int x, int[] array) {
        int g;
        for (g = 0; g < array.length; g++) {
            if (array[g] == x) {
                break;
            }

        }
        return g;
    }
}
