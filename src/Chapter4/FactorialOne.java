package Chapter4;

import java.util.Scanner;

public class FactorialOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();
        int numberEntered = number;
        long factorial = 1;

        while (numberEntered >= 2) {
            factorial *= numberEntered;
            numberEntered = numberEntered - 1;

        }
        System.out.printf("%d Factorial is: %d%n", number, factorial);
    }

}
