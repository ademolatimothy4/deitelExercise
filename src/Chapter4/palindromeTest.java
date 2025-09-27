package Chapter4;

import java.util.Scanner;

public class palindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        int inputedNumber = number;

        int numberReversed = 0;

        while (number != 0) {
            int digit = number % 10;
            numberReversed = (numberReversed * 10) + digit;
            number = number / 10;
        }
        if (numberReversed == inputedNumber) {
            System.out.print("The inputed number is a palindrome");
        } else {
            System.out.print("The number imputed is not a palindrome");
        }
    }
}
