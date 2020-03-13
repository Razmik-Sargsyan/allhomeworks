import java.util.Scanner;
import java.util.Arrays;

public class Problem4 {

    //Write a function that takes as an input array of Strings and modifies array with reversed strings.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of strings in the array: ");
        int n = scanner.nextInt();
        String[] something = new String[n] ;


        for (int i = 0; i < n; i++) {
            System.out.println("Input the  strings in the array: ");
            something[i]= scanner.next(); }

        System.out.println(reversestrings(something)[0]);;


        }

        static String[] reversestrings(String[] string){
            String[] reverseofit= new String[string.length];

            for (int i1 = 0; i1 < string.length;i1++) {
                String current= string[i1];
                String reverse="";
                for (int i2 = 0; i2 < current.length(); i2++) {
                    reverse+=current.charAt(current.length()-i2-1);
                }
                reverseofit[i1]=reverse;
            }
         return reverseofit;
        }
    }




