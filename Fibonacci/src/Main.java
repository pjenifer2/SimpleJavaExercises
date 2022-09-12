import java.util.Arrays;
import java.util.Scanner;

/**
 * need to add validation of user input
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Fibonacci sequence you are looking to compute: ");
        int fibonacci = scan.nextInt();
        scan.close();

        //testing git


        int[] numbers = new int[fibonacci];


        if (fibonacci == 0) {
            System.out.println("no value");
        } else if (fibonacci == 1) {
            numbers[0] = 0;
        } else if (fibonacci == 2 ) {
            numbers[0] = 0;
            numbers[1] = 1;
        } else if (fibonacci > 2) {
            for (int i = 0; i < 2; i++) {numbers[i] = i;}
            int a = 0;
            int b = 1;
            for (int i=2; i< fibonacci; i++){
                int c = a + b;
                numbers[i] = c;
                a = b;
                b = c;
            }
        }
        System.out.print(Arrays.toString(numbers));




    }
}