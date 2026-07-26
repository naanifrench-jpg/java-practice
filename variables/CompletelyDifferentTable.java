import java.util.Scanner;

public class CompletelyDifferentTable {
    public static void main(String[] args){
        /* write a program that takes a number
        and prints its multiplication table up
        to 10.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program prints a multiplication table for any number you input.\nInput number: ");

        int number = Integer.parseInt(scanner.nextLine());

        System.out.print(number);
        System.out.print(" x 1 = ");
        System.out.println(number * 1);

        System.out.print(number);
        System.out.print(" x 2 = ");
        System.out.println(number * 2);

        System.out.print(number);
        System.out.print(" x 3 = ");
        System.out.println(number * 3);

        System.out.print(number);
        System.out.print(" x 4 = ");
        System.out.println(number * 4);

        System.out.print(number);
        System.out.print(" x 5 = ");
        System.out.println(number * 5);
    }
}