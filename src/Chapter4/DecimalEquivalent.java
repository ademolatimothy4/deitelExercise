package Chapter4;

import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Binary integer: ");
        int binary = input.nextInt();
        int originalNumber = binary;
        int positionalValue = 1;
        int decimalEquivalent = 0;

        while (originalNumber > 0) {
            int numberRemainder = originalNumber % 10;
            int decimal = numberRemainder * positionalValue;
            originalNumber = originalNumber / 10;
            decimalEquivalent = decimalEquivalent + decimal;
            positionalValue = positionalValue * 2;
        }

        System.out.print("decimal equivalent: " + decimalEquivalent);

    }
}
