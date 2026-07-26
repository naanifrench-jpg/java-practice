import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        /* write a program that reads a number in inches
        and converts it to meters.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a value for inch: ");

        int inch = scanner.nextInt();
        System.out.print(inch + " inches is ");
        System.out.print((inch * 0.0254) + " meters.");
    }
}