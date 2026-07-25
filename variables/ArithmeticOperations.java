public class ArithmeticOperations {
    public static void main(String[] args) {
        /* write a program to print the results of the following operations.
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        43
        1
        19
        13
         */
        int number1 = -5;
        int number2 = 8;
        int number3 = 6;
        int number4 = 55;
        int number5 = 9;
        int number6 = 20;
        int number7 = -3;
        int number8 = 5;
        int number9 = 15;
        int number10 = 3;
        int number11 = 2;
        System.out.println(number1 + number2 * number3);
        System.out.println((number4 + number5) % number5);
        System.out.println(number6 + number7 * number8 / number2);
        System.out.print(number8 + number9 / number10 * number11 - number2 % number10);
    }
}