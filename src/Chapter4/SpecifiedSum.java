package Chapter4;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();

        System.out.println("Enter value");
        int value = input.nextInt();

        while(value<= number) {
            System.out.println("Enter another value");
            int aValue = input.nextInt();

            value = value + aValue;
        }
    }
}
