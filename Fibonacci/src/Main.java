import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the fibonaccie sequence you are looking to compute: ");
        int fibonacci = scan.nextInt();
        scan.close();


        if (fibonacci == 0) {
            System.out.println("no value");
        } else if (fibonacci == 1) {
            System.out.println(0);
        } else if (fibonacci == 2 ) {
            System.out.println(0);
            System.out.println(1);
        } else if (fibonacci > 2) {
            System.out.println(0);
            System.out.println(1);
            int a = 0;
            int b = 1;
            for (int i=0; i< fibonacci -2; i++){
                int c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }




    }
}