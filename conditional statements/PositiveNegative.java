import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /* write a program to get a number from the user
        and print whether it is positive or negative
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number is postive.");
        } else {
            System.out.println("Number is negative.");
        }
    }
}