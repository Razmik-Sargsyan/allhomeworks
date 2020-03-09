import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = scanner.nextInt();
        System.out.println("Input number b: ");
        int b = scanner.nextInt();
        System.out.println(percentage(a,b)+ "%");

    }

    public static int percentage(double a, double b) {
        double differece = b-a;
        double percent = (differece/a*100);
        return (int) percent;
    }



    }
