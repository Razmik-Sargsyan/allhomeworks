import java.sql.SQLOutput;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input an integer");
        int n = scanner.nextInt();
        if (n<0){
            System.out.println("Integer must be nonnogative");
            n= scanner.nextInt();
        }

        System.out.println(numberofzeros(600));





    }
    static int numberofzeros(int number){
        int count=0;
        while (number%10==0){
            count++;
            number= number/10;
        }
        return count;
    }
}
