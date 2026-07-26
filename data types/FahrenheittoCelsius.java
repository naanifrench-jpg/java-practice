import java.util.Scanner;

public class FahrenheittoCelsius {
    public static void main(String[] args){
        /* write a program to convert temperature from
        Fahrenheit to Celsius degrees.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double number = scanner.nextDouble();

        System.out.print(number + " degrees Fahrenheit is equal to ");
        System.out.print((number - 32)*5/9 + " degrees Celsius.");
    }
}