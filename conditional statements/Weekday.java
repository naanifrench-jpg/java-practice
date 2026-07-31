import java.util.Scanner;

public class Weekday {
	public static void main(String[] args) {
		/* write a program that takes a number (between 1 and 7) 
		from the user to display the weekday name.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		
		if (number == 1) {
			System.out.println("Monday.");
		}
		if (number == 2) {
			System.out.println("Tuesday.");
		}
		if (number == 3) {
			System.out.println("Wednesday.");
		}
		if (number == 4) {
			System.out.println("Thursday.");
		}
		if (number == 5) {
			System.out.println("Friday.");
		}
		if (number == 6) {
			System.out.println("Saturday.");
		}
		if (number == 7) {
			System.out.println("Sunday.");
		}
	}
}