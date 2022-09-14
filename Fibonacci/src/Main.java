import java.util.Arrays;
import java.util.Scanner;

/**
 * need to add validation of user input
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Fibonacci sequence you are looking to compute: ");
        String userInput = scan.nextLine();

        scan.close();
        int fibonacci;

        try {
            fibonacci = Integer.parseInt(userInput);
            System.out.println("In proper order" + Arrays.toString(fibonnaciCalc(fibonacci)));
            System.out.println("In reverse order" + Arrays.toString(reverseFibonacci(fibonacci)));
        } catch (NumberFormatException e){
            System.out.println("You did not enter an integer");
        }

    }
    public static int[] fibonnaciCalc(int fibonacci) {
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

        return numbers;

    }

    public static int[] reverseFibonacci(int fibonacci){

        int[] numbers = fibonnaciCalc(fibonacci);

        int[] reverseNumbers = new int[numbers.length];
        int count = numbers.length - 1;
        int insertCount = 0;
        while (count >= 0) {
            reverseNumbers[insertCount] = numbers[count];
            insertCount++;
            count--;
        }


        return reverseNumbers;
    }
}

