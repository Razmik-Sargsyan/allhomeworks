import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String base = scanner.nextLine();
        int numberofwords =1;
        int endofline = base.length()-1;
        char space= ' ';
        boolean isword= false;

        for (int i = 0; i < base.length()-1; i++) {

            for (int i1 = 0; i1 < base.length(); i1++) {
                if (base.charAt(i1)!=space){
                    isword=true; }
            }


            if (isword  && base.charAt(i) ==space && base.charAt(i+1)!=space && i!=endofline){
                numberofwords=numberofwords+1;
            }
        }
        if (isword ) {
            if (base.charAt(0) != space)
                System.out.println(numberofwords);
            else
                System.out.println(numberofwords-1);
        }
        else
            System.out.println("No words");

    }
}
